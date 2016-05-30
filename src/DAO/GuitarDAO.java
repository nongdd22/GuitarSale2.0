package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Guitar;
import util.DBUtil;


public class GuitarDAO implements IGuitarDAO {
	
	@Override
	public List<Guitar> selectGuitar(String type) {
		List<Guitar> listguitar = new ArrayList<Guitar>();
		String sql = "select * from Guitar where type= ? ";
		Connection Conn = DBUtil.open();
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1,type);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Guitar guitar=new Guitar();
				guitar.setID(rs.getString(1));
				guitar.setPrice(rs.getString(2));
				guitar.setBuilder(rs.getString(3));
				guitar.setType(type);
				guitar.setWood(rs.getString(5));
				listguitar.add(guitar);
			}
			return listguitar;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(Conn);
		}
	return null;
	}

	

	
}
