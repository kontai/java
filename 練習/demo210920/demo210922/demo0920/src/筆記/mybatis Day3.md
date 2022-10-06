#  Mybatis 筆記
## 一.動態綁定
### MyBatis 接口绑定方案及多参数传递
1. 作用:实现创建一个接口后把mapper.xml 由mybatis 生成接口的实现
类,通过调用接口对象就可以获取mapper.xml 中编写的sql.
2. 后面mybatis 和spring 整合时使用的是这个方案.
3. 实现步骤:
 - 创建一个接口
-  接口包名和接口名与mapper.xml 中<mapper>namespace
相同
- 接口中方法名和mapper.xml 标签的id 属性相同
- 在mybatis.xml 中使用<package>进行扫描接口和mapper.xml
4. 代码实现步骤:
> 1. 在mybatis.xml 中`<mappers>`下使用<package>
```xml
<mappers>
<package name="com.bjsxt.mapper"/>
</mappers>
```
> 2. 在com.bjsxt.mapper 下新建接口
```java
public interface LogMapper {
List<Log> selAll();
}
```
> 3. 在com.bjsxt.mapper 新建一个LogMapper.xml
 > - namespace 必须和接口全限定路径(包名+类名)一致
 > -  id 值必须和接口中方法名相同
 > -  如果接口中方法为多个参数,可以省略parameterType
```xml
<mapper namespace="com.bjsxt.mapper.LogMapper">
<select id="selAll" resultType="log">
select * from log
</select>
</mapper>
```
5. 多参数实现办法
 >1. 在接口中声明方法
```java
List<Log> selByAccInAccout(String accin,String accout);
```
> 2. 在mapper.xml 中添加
> -  #{}中使用0,1,2 或param1,param2
<!-- 当多参数时,不需要写parameterType -->
```xml
<select id="selByAccInAccout" resultType="log" >
select * from log where accin=#{0} and accout=#{1}
</select>
```
6. 可以使用注解方式
> 1. 在接口中声明方法
```java
/**
* mybatis 把参数转换为map 了,其中@Param("key") 参数内
容就是map 的value
* @param accin123
* @param accout3454235
* @return
*
*/
List<Log> selByAccInAccout(@Param("accin") String
accin123,@Param("accout") String accout3454235);
```

> 2. 在mapper.xml 中添加
> - #{} 里面写@Param(“内容”)参数中内容
```xml
<!-- 当多参数时,不需要写parameterType -->
<select id="selByAccInAccout" resultType="log" >
select * from log where accin=#{accin} and
accout=#{accout}
</select>
```

## 二. 動態SQL
- 根據不同的條件,需要執行不同的SQL命令,稱為動態SQL
- Mybatis中,動態SQL在mapper.xml中添加邏輯判斷等。
### ＜if＞
```xml
<select id="selByAccinAccout" resultType="log">
select * from log where 1=1
<!-- OGNL 表达式,直接写key 或对象的属性.不需要添加任
何特字符号-->
<if test="accin!=null and accin!=''">
and accin=#{accin}
</if>
<if test="accout!=null and accout!=''">
and accout=#{accout}
</if>
</select>
```
### ＜where＞
 >1. 當編寫where標籤時,如果第一個是and,則去掉第一個and
> 2. 如果<where>中有內容,會生成where關鍵字,如果沒有內容,則不生成where關鍵字
> 3. 使用示例:
    >> 比直接使用`<if>`少寫where 1:1
```xml
<select id="selByAccinAccout" resultType="log">
select * from log
<where>
<if test="accin!=null and accin!=''">
and accin=#{accin}
</if>
<if test="accout!=null and accout!=''">
and accout=#{accout}
</if>
</where>
</select>
```
### ＜choose＞ ＜when＞ ＜otherwise＞
1. 只有有一个成立,其他都不执行.
2. 代码示例
- 如果accin 和accout 都不是null 或不是””生成的sql 中只
有where accin=?
```xml
<select id="selByAccinAccout" resultType="log">
select * from log
<where>
<choose>
<when test="accin!=null and accin!=''">
and accin=#{accin}
</when>
<when test="accout!=null and accout!=''">
and accout=#{accout}
</when>
</choose>
</where>
</select>
```
### ＜set＞ (用在修改SQL 中set 从句)
1. 作用:去掉最后一个逗号
2. 作用:如果<set>里面有内容生成set 关键字,没有就不生成
3. 示例
- id=#{id} 目的防止<set>中没有内容,mybatis 不生成set 关
键字,如果修改中没有set 从句SQL 语法错误.
```xml
<update id="upd" parameterType="log" >
update log
<set>
id=#{id},
<if test="accIn!=null and accIn!=''">
accin=#{accIn},
</if>
<if test="accOut!=null and accOut!=''">
accout=#{accOut},
</if>
</set>
where id=#{id}
</update>
```
###  ＜Trim＞
1. prefix 在前面添加内容
2. prefixOverrides 去掉前面内容
3. suffix 在后面添加内容
4. suffixOverrieds 去掉后面内容
5. 执行顺序去掉内容后添加内容
6. 代码示例
```xml
<update id="upd" parameterType="log">
update log
<trim prefix="set" suffixOverrides=",">
a=a,
</trim>
where id=100
</update>
```
### ＜bind＞
1. 作用:给参数重新赋值
2. 场景:
- 模糊查询
- 在原内容前或后添加内容
3. 示例
```xml
<select id="selByLog" parameterType="log"
resultType="log">
<bind name="accin" value="'%'+accin+'%'"/>
#{money}
</select>
```
###  ＜foreach＞标签
1. 循环参数内容,还具备在内容的前后添加内容,还具备添加分
    隔符功能.
2. 适用场景:in 查询中.批量新增中(mybatis 中foreach 效率比较
    低)
> - 如果希望批量新增,SQL 命令
```sql
    insert into log VALUES
    (default,1,2,3),(default,2,3,4),(default,3,4,5)
```
> - openSession()必须指定
```java
 底层JDBC 的PreparedStatement.addBatch();
    factory.openSession(ExecutorType.BATCH);
```
3. 示例
> 1. collectino=”” 要遍历的集合
> 2. item 迭代变量, #{迭代变量名}获取内容
> 3. open 循环后左侧添加的内容
> 4. close 循环后右侧添加的内容
> 5. separator 每次循环时,元素之间的分隔符
```xml
<select id="selIn" parameterType="list"
resultType="log">
select * from log where id in
<foreach collection="list" item="abc" open="("
close=")" separator=",">
#{abc}
</foreach>
</select>
```
### ＜sql＞ 和 ＜include＞
1. 某些SQL 片段如果希望复用,可以使用`<sql>`定义这个片段
```xml
<sql id="mysql">
id,accin,accout,money
</sql>
```
2. 在`<select>`或`<delete>`或`<update>`或`<insert>`中使用`<include>`引用
```xml
<select id="">
select <include refid="mysql"></include>
from log
</select>
```

