package com.yeah.texas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

import com.yeah.texas.Texas;
import com.yeah.texas.mapper.TexasMapper;
import com.yeah.texas.service.TexasService;

@Service
public class TexasServiceImpl implements TexasService{

	@Autowired
	private TexasMapper texasMapper;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Override
	public int addUser(Texas texas) {

		return texasMapper.addUser(texas);
	}

	@Override
	public List<Texas> showAllUser() {
		
		return texasMapper.showUser();
	}

	@Override
	public int deleUser(int id) {
		return texasMapper.deleUser(id);
	}

	@Override
	public int updateUser(Texas texas) {
		int count=texasMapper.updateUser(texas);
		return count;
	}
	
	

}
