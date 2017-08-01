package com.yeah.texas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.github.abel533.mapper.Mapper;
import com.yeah.texas.Texas;
import com.yeah.texas.sqlProvider.texasSql;

public interface TexasMapper extends Mapper<Texas>{

	@SelectProvider(type=texasSql.class,method="showUser")
	@Results({
		@Result(column="name",property="name"),
		@Result(column="dS",property="dS"),
		@Result(column="leftCounter",property="leftCounter"),
		@Result(column="pAndL",property="pAndL")
	})
	List<Texas> showUser();
	
	@InsertProvider(type=texasSql.class,method="addUser")
	int addUser(Texas texas);
	
	@DeleteProvider(type=texasSql.class,method="deleUser")
	int deleUser(int id);
	
	@UpdateProvider(type=texasSql.class,method="updateUser")
	int updateUser(Texas texas);
}
