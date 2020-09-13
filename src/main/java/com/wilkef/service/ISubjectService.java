package com.wilkef.service;

import java.util.List;

import com.wilkef.model.Subject;

public interface ISubjectService {
	public List<Subject> findByGradeId(Integer GradeId);
}
