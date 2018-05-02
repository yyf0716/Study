package com.sbc.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sbc.data.Dept;

@Mapper
public interface DeptMapper {

	public Dept getDeptById(Integer id);
}
