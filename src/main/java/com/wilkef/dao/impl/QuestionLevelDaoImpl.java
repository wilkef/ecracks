package com.wilkef.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wilkef.dao.IQuestionLevelDao;
import com.wilkef.model.QuestionLevel;

@Repository
public class QuestionLevelDaoImpl implements IQuestionLevelDao{

	@Override
	public List<QuestionLevel> findByDifficultyCode(String DifficultyCode) {
		
		return null;
	}

}
