1.���إ\��
	�W�١G���u�޲z�t��
	�\��G�d�ߩҦ�  ���ӽs���d��  �K�[���u  ��s���u  �R�����u
2.���اޯ�
	1.�ϥ�JDBC�X�ݼƾڮw
	2.���h�}�o�G
	�e�x�G�եΫ�x�ÿ�X���G
	��x�G�ϥ�JDBC�X�ݼƾڮw�ê�^���G
	3.���e�u����DBUtil�A�_�ΥN�X
	4.�ϥ�Properties��Ū���ݩʤ��
	5.�ϥ�log4j�O����x
	6.�X�i�G�����d�ߤ�k�]�ϥΤϮg�^
3.�f�ض��خج[
	1.�Ыض��� empmgr
	2.�K�[jar�]
	3.�Ыإ]
		com.bjsxt.empmgr.dao   ��x�G�s��X�ݼƾڮw�����f  EmployeeDao
		com.bjsxt.empmgr.dao.impl ��x�G �s��X�ݼƾڮw����{�� EmployeeDaoImpl
		com.bjsxt.empmgr.entity ��x�G�s������� Employee
		com.bjsxt.empmgr.test   �e�x
		com.bjsxt.empmgr.util   �u�����A�����ƾڮw�`�ξާ@�K�󭫽ƽեΡA�קK�N�X����
	4.�Ыع�����Employee
	5.�Ыث�x�����fEmployeeDao�M��{��EmployeeDaoImpl
		public List<Employee> findAll();
		public Employee findById(int empno);
		public int save(Employee emp);	
		public int update(Employee emp);	
		public void delete(int empno); 
	
4.��{����\��
	1.�d�ߩҦ����u
		1.��x
		2.�e�x
	2.�d�߫��w�s�������u
		1.��x
		2.�e�x
	3.���Ѥu����DBUtil
		�n�B�G�_�ΥN�X  �K��ק���@
		1.����ƾڮw�s���GgetConnection()
		2.�����ƾڮw�귽 closeAll(rs,stmt,conn)
	4.�K�[���u
		1.��x
			������B�z
			pstmt.setDate(5, new java.sql.Date(emp.getHireDate().getTime()));
			pstmt.setTimestamp(5, new java.sql.Timestamp(emp.getHireDate().getTime()));
		2.�e�x
	5.��s���u
		1.��x
		2.�e�x
	6.�R�����u
		1.��x
		2.�e�x
	7.���Ѥu����DBUtil	
		1.���eDML�ާ@����k
		2.��xDAO���եΤu��������k
	8.�q�L�D���N�U�ӥ\���X��@�_
	9.�����~�ȼh
		���e�e�x�t�d�D���M�U�Ө��骺�椬�\��
		�{�b�G�e�x�u�t�d�D���
		�����~�ȼh�A�ȦU�Ө��骺�椬�\��
		�e�x�եη~�ȼh�A�~�ȼh�ե�DAO�h
		��h�ܦ��T�h
		���e�G�e�x---��x
		�{�b�G�e�x---�~�ȼh----��x�]DAO�h�^
		
	10.�N�|�ӳs���ѼƩ�J�ݩʤ��A�K��ק�M���@
		Properties�O�@�دS��Map�Akey�Mvalue���OString�����A�@��Ψ�Ū�g�ݩʤ��
		Properties prop = new Properties();
		InputStream is = DBUtil.class.getResourceAsStream("/conn.properties");
		prop.load(is);
		driver = prop.getProperty("driver");
		
		
	11.�ϥ�log4j�O����x
		1.��xlog
			���`�H��  �n�����\���Ѫ��H��  ��L���n�ާ@���H��
			�覡1�GSystem.out.println(.....)    e.printStackTrace();
			���I�G���O�O�s����A������[�s�x
			
			�覡2�GIO�y �NSystem.out.println(.....)    e.printStackTrace();�g�J���
			���I�G��x�S�����šA��x���榡����ܦn���w��
			
			�覡3�G�ϥβ{������x�ج[�A��plog4j
			�u�I�G���[�O�s   ������   �榡�i�H�ܦn���w��  �N�X�s�g²��
			
		2.log4j�@��
			1.�O����x�]���[�O�s   ������   �榡�i�H�ܦn���w��^
			2.��������x�i����R�έp�A�d����D�ǳƦn���e
			
		3.log4j��x���ŧO
			FATAL�G���X�{�F�D�`�Y�������~�ƥ�A�o�ǿ��~�i��|�ɭP���ε{�ǲ��`����
			ERROR�G���������~�A�������\���ε{���~��B��
			WARN�G���B�����Ҽ��õۦM�`
			INFO�G�����i�H���A�o�ǫH���b�ʲɫׯŧO�W��X������ε{�Ǫ��i�{
			DEBUG�G���Ӳɫ׫H���ƥ�A�Ӳɫ׫H���ƥ������ε{�Ǫ��ոլO�̦��Ϊ�
			
			
		4.�ϥ�log4j�O����x
			1.�[�Jjar�]   log4j-1.2.8.jar
			2.�[�J�ݩʤ�� src �U log4j.properties
			3.�q�L�ݩʤ��z��log4j���D�nAPI
				Appender ��x�ت��a :ConsoleAppender   FileAppender 
				Layout ��x�榡�ƾ� �GSimpleLayout  PatternLayout
			4.�N�X���O����x
				private static Logger logger = Logger.getLogger(DBUtil.class.getName());
				logger.info("�w�g���T��Ū���Fconn.properties�G");
				logger.error("dml�ާ@���`�G"+e);
				
		5.�z�Ѥ�x�榡�Ʀr�Ū��t�q %d{yyyy-MM-dd HH:mm:ss} %l %F %p %m%n	
		
			
	12.�p�G��ƾڮw����MySQL,�ݭn�h�j���ק�
		1.jar�]
		2.�ק�|���ݩʭ�
		3.�ݭn���ƾڮw��]�ɧUPowerDesigner���f�V�u�{�NOracle sql�ഫ��MySQL SQL�^
		4.delete �ݭn�ϥ�from
		5.insert �i��|�ϥΧǦC�A���OMySQL���ݭn

	13.�ϥΤϮg����select��k�]����Hiberante�^