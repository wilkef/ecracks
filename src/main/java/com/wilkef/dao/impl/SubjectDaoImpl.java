package com.wilkef.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wilkef.dao.ISubjectDao;
import com.wilkef.model.Subject;

@Repository
public class SubjectDaoImpl implements ISubjectDao{

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Subject> findByGradeId(Integer GradeId) {
		
		List<Subject> subjectList=new ArrayList<>();
		
		String sql="SELECT * FROM Subject where GradeId='"+GradeId+"'";
		
		List<Subject> queryForList = jt.query(sql, new BeanPropertyRowMapper<Subject>(Subject.class));
		subjectList.addAll(queryForList);
		
		return subjectList;
	}
	
}
