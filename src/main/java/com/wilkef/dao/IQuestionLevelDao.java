package com.wilkef.dao;

import java.util.List;

import com.wilkef.model.QuestionLevel;

public interface IQuestionLevelDao {
	
	public List<QuestionLevel> findByDifficultyCode(String DifficultyCode);
}
