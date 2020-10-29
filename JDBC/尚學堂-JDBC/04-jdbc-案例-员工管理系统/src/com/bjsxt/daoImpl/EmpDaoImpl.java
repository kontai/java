package com.bjsxt.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.bjsxt.dao.EmpDao;
import com.bjsxt.pojo.Emp;
import com.bjsxt.util.JdbcUtil;
public class EmpDaoImpl implements EmpDao{
	//�d�ߩҦ����u�H��
	public ArrayList<Emp> selAllEmpInfo(){
		//�n��JDBC�ﹳ
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//�n�����X�ﹳ
		ArrayList<Emp> list=null;
		try {
			//����s���ﹳ
				conn=JdbcUtil.getConnection();
		 	//�Ы�sql�R�O
				String sql="select * from emp";
			//�Ы�sql�R�O�ﹳ
				ps=JdbcUtil.getPreparedStatement(sql, conn);
			//����sql
				rs=ps.executeQuery();
				list=new ArrayList<>();
			//�M���d�ߵ��G
			while(rs.next()){
				//�Ы�Emp�ﹳ
				Emp p=new Emp();
				p.setEmpno(rs.getInt("empno"));
				p.setEname(rs.getString("ename"));
				p.setJob(rs.getString("job"));
				p.setMgr(rs.getInt("mgr"));
				p.setDate(rs.getDate("hiredate"));
				p.setSal(rs.getDouble("sal"));
				p.setComm(rs.getDouble("comm"));
				p.setDeptno(rs.getInt("deptno"));
				list.add(p);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�����귽
			JdbcUtil.closeAll(rs, ps, conn);
		}
		//��^���G	
		return list;
	}
	//�ھڽs���d�߭��u�H��
	public Emp selEmpInfoByEmpno(int empno){
		//�n��jdbc�ܶq
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//�n��Emp�ﹳ
		Emp p=null;
		try {
			//����s���ﹳ
			conn=JdbcUtil.getConnection();
			//�Ы�sql�R�O
			String sql="select * from emp where empno=?";
			//���sql�R�O�ﹳ
			ps=JdbcUtil.getPreparedStatement(sql, conn);
			//������Ž��
			ps.setInt(1,empno);
			//�����sql
			rs=ps.executeQuery();
			//�M�����G
			if(rs.next()){
				p=new Emp();
				p.setEmpno(rs.getInt("empno"));
				p.setEname(rs.getString("ename"));
				p.setJob(rs.getString("job"));
				p.setMgr(rs.getInt("mgr"));
				p.setDate(rs.getDate("hiredate"));
				p.setSal(rs.getDouble("sal"));
				p.setComm(rs.getDouble("comm"));
				p.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}finally{//�����귽
			JdbcUtil.closeAll(rs, ps, conn);
		}
		//��^���G
		return p;
	}
	//�K�[���u�H��
	public int insEmpInfo(int empno,String ename,String job,int mgr,Date hiredate,double sal,double comm,int deptno){
		//�Ы�sql�y�y
		String sql="insert into emp values(?,?,?,?,?,?,?,?)";
		//�N����ഫ��java.sql.date����
		java.sql.Date d=new java.sql.Date(hiredate.getTime());
		int i=JdbcUtil.executeDML(sql,empno,ename,job,mgr,d,sal,comm,deptno);
		return i;
	}
	//�ק���u�m�W
	public int upEmp(String newName,int empno){
		return JdbcUtil.executeDML("update emp set ename=? where empno=?",newName,empno);
	}
	//�R�����u�H��	
	public int delEmp(int empno){
		return JdbcUtil.executeDML("delete from emp where empno=?",empno);
	
	}
}
