package com.yeah.texas.service;


import java.util.List;
import com.yeah.texas.Texas;

public interface TexasService {

	public int addUser(Texas texas);
	
	public List<Texas> showAllUser();
	
	public int deleUser(int id);
	
	public int updateUser(Texas texas);
}
