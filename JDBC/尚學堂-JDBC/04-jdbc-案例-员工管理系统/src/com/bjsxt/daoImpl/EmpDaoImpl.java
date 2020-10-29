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
	//查詢所有員工信息
	public ArrayList<Emp> selAllEmpInfo(){
		//聲明JDBC對像
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//聲明集合對像
		ArrayList<Emp> list=null;
		try {
			//獲取連接對像
				conn=JdbcUtil.getConnection();
		 	//創建sql命令
				String sql="select * from emp";
			//創建sql命令對像
				ps=JdbcUtil.getPreparedStatement(sql, conn);
			//執行sql
				rs=ps.executeQuery();
				list=new ArrayList<>();
			//遍歷查詢結果
			while(rs.next()){
				//創建Emp對像
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
		}finally{//關閉資源
			JdbcUtil.closeAll(rs, ps, conn);
		}
		//返回結果	
		return list;
	}
	//根據編號查詢員工信息
	public Emp selEmpInfoByEmpno(int empno){
		//聲明jdbc變量
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//聲明Emp對像
		Emp p=null;
		try {
			//獲取連接對像
			conn=JdbcUtil.getConnection();
			//創建sql命令
			String sql="select * from emp where empno=?";
			//獲取sql命令對像
			ps=JdbcUtil.getPreparedStatement(sql, conn);
			//給佔位符賦值
			ps.setInt(1,empno);
			//執行符sql
			rs=ps.executeQuery();
			//遍歷結果
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
		}finally{//關閉資源
			JdbcUtil.closeAll(rs, ps, conn);
		}
		//返回結果
		return p;
	}
	//添加員工信息
	public int insEmpInfo(int empno,String ename,String job,int mgr,Date hiredate,double sal,double comm,int deptno){
		//創建sql語句
		String sql="insert into emp values(?,?,?,?,?,?,?,?)";
		//將日期轉換為java.sql.date類型
		java.sql.Date d=new java.sql.Date(hiredate.getTime());
		int i=JdbcUtil.executeDML(sql,empno,ename,job,mgr,d,sal,comm,deptno);
		return i;
	}
	//修改員工姓名
	public int upEmp(String newName,int empno){
		return JdbcUtil.executeDML("update emp set ename=? where empno=?",newName,empno);
	}
	//刪除員工信息	
	public int delEmp(int empno){
		return JdbcUtil.executeDML("delete from emp where empno=?",empno);
	
	}
}
