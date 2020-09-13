package com.wilkef.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wilkef.dao.IQuestionLevelDao;
import com.wilkef.model.QuestionLevel;

@Repository
public class QuestionLevelDaoImpl implements IQuestionLevelDao{

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<QuestionLevel> findQuestionLevel() {
		
		String sql="SELECT * FROM QuestionLevel";
		
		List<QuestionLevel> queryForList = jt.query(sql, new BeanPropertyRowMapper<QuestionLevel>(QuestionLevel.class));
		
		return queryForList;
	}

}
