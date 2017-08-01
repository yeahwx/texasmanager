package com.yeah.texas.sqlProvider;

import org.apache.ibatis.jdbc.SQL;

import com.yeah.texas.Texas;

public class texasSql {

	//展示所有玩家
	public String showUser(){
		return new SQL(){
			{
				SELECT("*");
				FROM("TexasGame");
		}
		}.toString();
	}
	//增加玩家
	public String addUser(){
		return new SQL(){
			{
				INSERT_INTO("TexasGame");
				VALUES("name", "#{name}");
				VALUES("dS", "#{dS}");
				VALUES("leftCounter", "#{leftCounter}");
				VALUES("pAndL", "#{pAndL}");
			}
		}.toString();
	}
	
	//删除玩家
	public String deleUser(final int id){
		return new SQL(){
			{
				DELETE_FROM("TexasGame");
				WHERE("id=#{id}");
				
			}
		}.toString();
	}
	
	public boolean isEmptyStr(String str){
		return str==null || "".equals(str);
	}
	
	//修改玩家信息
	public String updateUser(final Texas texas){
		String str = new SQL(){
			{
				UPDATE("TexasGame");
				if(!isEmptyStr(texas.getName())){
					SET("name=#{name}");
				}
				if(texas.getdS()!=null&&!"".equals(texas.getdS())){
					SET("dS=#{dS}");
				}
				if(texas.getLeftCounter()!=null&&!"".equals(texas.getLeftCounter())){
					SET("leftCounter=#{leftCounter}");
				}
				if(texas.getpAndL()!=null&&!"".equals(texas.getpAndL())){
					SET("pAndL=#{pAndL}");
				}if(texas.getId()!=null){
				WHERE("id=#{id}");
				}
			}
		}.toString();
		System.out.println(str);
		return str;
		
	}
}
