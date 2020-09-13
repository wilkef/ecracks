package com.wilkef.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilkef.dao.IQuestionLevelDao;
import com.wilkef.model.QuestionLevel;
import com.wilkef.service.IQuestionLevelService;

@Service
public class QuestionLevelServiceImpl implements IQuestionLevelService{

	@Autowired
	private IQuestionLevelDao questionDao;

	@Override
	public List<QuestionLevel> findByDifficultyCode(String DifficultyCode) {
		List<QuestionLevel> findByDifficultyCode = questionDao.findByDifficultyCode(DifficultyCode);
		return findByDifficultyCode;
	}

}
