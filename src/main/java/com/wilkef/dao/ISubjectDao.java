package com.wilkef.dao;

import java.util.List;

import com.wilkef.model.Subject;

public interface ISubjectDao {
	public List<Subject> findByGradeId(Integer GradeId);
}
