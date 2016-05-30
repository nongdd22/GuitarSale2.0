package service;

import java.util.List;

import DAO.GuitarDAO;
import DAO.IGuitarDAO;
import model.Guitar;

public class GuitarImpl implements IGuitar {
	
	//新增吉他查询的业务方法
	IGuitarDAO guitarDao = new GuitarDAO();
	@Override
	public List<Guitar> selectGuitar(String type){
		List<Guitar> listguitar = guitarDao.selectGuitar(type);
		return listguitar;
	}
	
}
