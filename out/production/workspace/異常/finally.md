### 在任何情况下, finally 块中的代码都会执行, 不论 try 块中是否出现异常或者是否被捕获 。 考虑下面三种可能出现的情况:

- ### 如果 try 块中没有出现异常 , 执行 final Statements, 然后执行 try 语句的下一条语句 。

- ### 如果 try 块中有一条语句引起异常,并被 catch 块捕获 , 然后跳过 try 块的其他语句,执行 catch 块和 finally 子句 。 执行 try 语句之后的下一条语句 。
- ### 如果 try 块中有一条语句引起异常 , 但是没有被任何 catch 块捕获 ,就会跳过 try 块中的其他语句,执行 finally 子句,并且将异常传递给这个方法的调用者 。即使在到达 finally 块之前有一个 return 语句, finally 块还是会执行 。

### 〆注意:  使用 finally 子句时可以省略掉 catch 块 。
