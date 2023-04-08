package com.tai.service.impl;

import java.util.List;

import com.tai.mapper.PeopleMapper;
import com.tai.service.PeopleService;

import org.springframework.web.context.support.WebApplicationContextUtils;

public class PeopleServiceImpl implements PeopleService{
	PeopleMapper mapper;

	public PeopleMapper getMapper() {
		return mapper;
	}

	public void setMapper(PeopleMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<?> show() {
		List<?> list;
		list=mapper.selAll();
		return list;
	}

}
