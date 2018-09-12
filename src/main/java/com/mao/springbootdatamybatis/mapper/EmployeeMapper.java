package com.mao.springbootdatamybatis.mapper;

import com.mao.springbootdatamybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface EmployeeMapper {
    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
