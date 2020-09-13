package com.wilkef.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilkef.dao.ISubjectDao;
import com.wilkef.model.Subject;
import com.wilkef.service.ISubjectService;

@Service
public class SubjectServiceImpl implements ISubjectService{

	@Autowired
	private ISubjectDao dao;

	public List<Subject> findByGradeId(Integer GradeId) {

		List<Subject> findAllSubject=dao.findByGradeId(GradeId);

		return findAllSubject;
	}

}
