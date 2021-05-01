package com.bjsxt.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bjsxt.dao.UserDao;
import com.bjsxt.vo.Area;
import com.bjsxt.vo.User;

public class UserDaoImp implements UserDao{

	@Override
	public User getUserInfo(String name) {
		//�����洢����
		User u=null;
		try {
			//��������
			Class.forName("oracle.jdbc.OracleDriver");
			//��ȡ���Ӷ���
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
			//����sql����
			String sql="select * from users where uname=?";
			//����sql�������
			PreparedStatement ps=conn.prepareStatement(sql);
			//��ռλ����ֵ
			ps.setString(1,name);
			//������ѯ
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				u=new User();
				u.setUid(rs.getInt("unum"));
				u.setUname(rs.getString("uname"));
				u.setPrice(rs.getDouble("price"));
				u.setLoc(rs.getString("loc"));
				u.setDesc(rs.getString("des"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return u;
	}
	//��ȡ���еĵ�����Ϣ
	@Override
	public List<Area> getAreaInfo(String pid) {
			//�����洢����
				List<Area> list=null;
				try {
					//��������
					Class.forName("oracle.jdbc.OracleDriver");
					//��ȡ���Ӷ���
					Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
					//����sql����
					String sql="select * from area where parentid=? order by areaid";
					//����sql�������
					PreparedStatement ps=conn.prepareStatement(sql);
					//��ռλ����ֵ
					ps.setString(1,pid);
					//������ѯ
					ResultSet rs=ps.executeQuery();
					list=new ArrayList<Area>();
					while(rs.next()){
						Area area=new Area();
						area.setAreaid(rs.getInt("areaid"));
						area.setAreaname(rs.getString("areaname"));
						area.setParentid(rs.getInt("parentid"));
						list.add(area);
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				return list;
	}

}
