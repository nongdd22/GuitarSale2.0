package service;

import java.util.List;

import model.Guitar;


public interface IGuitar {
	//定义selectGuiatr方法
	public List<Guitar> selectGuitar(String type);
	
}
