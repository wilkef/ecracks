package com.wilkef.service;

import java.util.List;

import com.wilkef.model.QuestionLevel;

public interface IQuestionLevelService {
	
	public List<QuestionLevel> findByDifficultyCode(String DifficultyCode);

}
