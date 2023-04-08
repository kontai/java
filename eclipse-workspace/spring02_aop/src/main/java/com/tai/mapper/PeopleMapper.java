package com.tai.mapper;

import java.util.List;

import com.tai.pojo.People;

import org.apache.ibatis.annotations.Select;

public interface PeopleMapper {
	@Select("select * from people")
	public List<People>selAll();
}
