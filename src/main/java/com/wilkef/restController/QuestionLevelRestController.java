package com.wilkef.restController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilkef.model.QuestionLevel;
import com.wilkef.service.IQuestionLevelService;

@RestController
@RequestMapping("/questionLevel")
public class QuestionLevelRestController {
	
	private Logger log = LoggerFactory.getLogger(QuestionLevelRestController.class);
	
	@Autowired
	private IQuestionLevelService questionService;
	
	@GetMapping(value = "/getDifficultyCode",produces = "application/json")
	public ResponseEntity<?> findDifficultyCode(){
		
		log.info("Entered into method to fetch QuestionLevel Data");
		ResponseEntity<?> response=null;
		
		try {
			log.info("About to call fetch QuestionLevel service");
			List<QuestionLevel> allQuestionLevel = questionService.findQuestionLevel();
			
			if (allQuestionLevel!=null && !allQuestionLevel.isEmpty()) {
				log.info("Data is not empty=>"+allQuestionLevel.size());
				response=new ResponseEntity<List<QuestionLevel>>(allQuestionLevel,HttpStatus.OK);
			}else {
				log.info("No QuestionLevel exist: size "+allQuestionLevel.size());
				response=new ResponseEntity<String>("No QuestionLevel Record Found !!",HttpStatus.OK);
			}
		} catch (Exception e) {
			log.error("Unable to fetch QuestionLevel : problem is :"+e.getMessage());
			response=new ResponseEntity<String>("Unable to Fetch QuestionLevel Record !!",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		log.info("About to Exist fetch all method with Response");
		return response;
	}
}
