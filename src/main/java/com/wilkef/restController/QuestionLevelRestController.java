package com.wilkef.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilkef.model.QuestionLevel;
import com.wilkef.service.IQuestionLevelService;

@RestController
@RequestMapping("/questionLevel")
public class QuestionLevelRestController {
	
	@Autowired
	private IQuestionLevelService questionService;
	
	@GetMapping(value = "/getDifficultyCode",produces = "application/json")
	public ResponseEntity<?> findByDifficultyCode(@PathVariable("DifficultyCode")String DifficultyCode){
		List<QuestionLevel> findByDifficultyCode = questionService.findByDifficultyCode(DifficultyCode);
		return null;
	}
	
}
