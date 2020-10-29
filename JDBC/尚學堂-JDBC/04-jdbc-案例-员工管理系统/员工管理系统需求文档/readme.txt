1.項目功能
	名稱：員工管理系統
	功能：查詢所有  按照編號查詢  添加員工  更新員工  刪除員工
2.項目技能
	1.使用JDBC訪問數據庫
	2.分層開發：
	前台：調用後台並輸出結果
	後台：使用JDBC訪問數據庫並返回結果
	3.提前工具類DBUtil，復用代碼
	4.使用Properties類讀取屬性文件
	5.使用log4j記錄日誌
	6.擴展：提取查詢方法（使用反射）
3.搭建項目框架
	1.創建項目 empmgr
	2.添加jar包
	3.創建包
		com.bjsxt.empmgr.dao   後台：存放訪問數據庫的接口  EmployeeDao
		com.bjsxt.empmgr.dao.impl 後台： 存放訪問數據庫的實現類 EmployeeDaoImpl
		com.bjsxt.empmgr.entity 後台：存放實體類 Employee
		com.bjsxt.empmgr.test   前台
		com.bjsxt.empmgr.util   工具類，提取數據庫常用操作便於重複調用，避免代碼重複
	4.創建實體類Employee
	5.創建後台的接口EmployeeDao和實現類EmployeeDaoImpl
		public List<Employee> findAll();
		public Employee findById(int empno);
		public int save(Employee emp);	
		public int update(Employee emp);	
		public void delete(int empno); 
	
4.實現具體功能
	1.查詢所有員工
		1.後台
		2.前台
	2.查詢指定編號的員工
		1.後台
		2.前台
	3.提供工具類DBUtil
		好處：復用代碼  便於修改維護
		1.獲取數據庫連接：getConnection()
		2.關閉數據庫資源 closeAll(rs,stmt,conn)
	4.添加員工
		1.後台
			日期的處理
			pstmt.setDate(5, new java.sql.Date(emp.getHireDate().getTime()));
			pstmt.setTimestamp(5, new java.sql.Timestamp(emp.getHireDate().getTime()));
		2.前台
	5.更新員工
		1.後台
		2.前台
	6.刪除員工
		1.後台
		2.前台
	7.提供工具類DBUtil	
		1.提前DML操作的方法
		2.後台DAO中調用工具類的方法
	8.通過主菜單將各個功能整合到一起
	9.提取業務層
		之前前台負責主菜單和各個具體的交互功能
		現在：前台只負責主菜單
		提取業務層服務各個具體的交互功能
		前台調用業務層，業務層調用DAO層
		兩層變成三層
		之前：前台---後台
		現在：前台---業務層----後台（DAO層）
		
	10.將四個連接參數放入屬性文件，便於修改和維護
		Properties是一種特殊的Map，key和value都是String類型，一般用來讀寫屬性文件
		Properties prop = new Properties();
		InputStream is = DBUtil.class.getResourceAsStream("/conn.properties");
		prop.load(is);
		driver = prop.getProperty("driver");
		
		
	11.使用log4j記錄日誌
		1.日誌log
			異常信息  登錄成功失敗的信息  其他重要操作的信息
			方式1：System.out.println(.....)    e.printStackTrace();
			缺點：不是保存到文件，不能長久存儲
			
			方式2：IO流 將System.out.println(.....)    e.printStackTrace();寫入文件
			缺點：日誌沒有等級，日誌的格式不能很好的定制
			
			方式3：使用現成的日誌框架，比如log4j
			優點：長久保存   有等級   格式可以很好的定制  代碼編寫簡單
			
		2.log4j作用
			1.記錄日誌（長久保存   有等級   格式可以很好的定制）
			2.為後續對日誌進行分析統計，查找問題準備好內容
			
		3.log4j日誌的級別
			FATAL：指出現了非常嚴重的錯誤事件，這些錯誤可能會導致應用程序異常中止
			ERROR：指雖有錯誤，但仍允許應用程序繼續運行
			WARN：指運行環境潛藏著危害
			INFO：指報告信息，這些信息在粗粒度級別上突出顯示應用程序的進程
			DEBUG：指細粒度信息事件，細粒度信息事件對於應用程序的調試是最有用的
			
			
		4.使用log4j記錄日誌
			1.加入jar包   log4j-1.2.8.jar
			2.加入屬性文件 src 下 log4j.properties
			3.通過屬性文件理解log4j的主要API
				Appender 日誌目的地 :ConsoleAppender   FileAppender 
				Layout 日誌格式化器 ：SimpleLayout  PatternLayout
			4.代碼中記錄日誌
				private static Logger logger = Logger.getLogger(DBUtil.class.getName());
				logger.info("已經正確的讀取了conn.properties：");
				logger.error("dml操作異常："+e);
				
		5.理解日誌格式化字符的含義 %d{yyyy-MM-dd HH:mm:ss} %l %F %p %m%n	
		
			
	12.如果把數據庫換成MySQL,需要多大的修改
		1.jar包
		2.修改四個屬性值
		3.需要有數據庫表（借助PowerDesigner的逆向工程將Oracle sql轉換成MySQL SQL）
		4.delete 需要使用from
		5.insert 可能會使用序列，但是MySQL不需要

	13.使用反射提取select方法（模擬Hiberante）