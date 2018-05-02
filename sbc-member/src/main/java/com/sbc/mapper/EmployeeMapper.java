package com.sbc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sbc.data.Employee;

@Mapper
public interface EmployeeMapper {
	@Select("select * from employee where id = #{id}")
	public Employee getEmployeeById(Integer id);
}
