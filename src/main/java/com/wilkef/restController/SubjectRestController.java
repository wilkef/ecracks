package com.wilkef.restController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilkef.model.Subject;
import com.wilkef.service.ISubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectRestController {
	
	private Logger log = LoggerFactory.getLogger(SubjectRestController.class);
	
	@Autowired
	private ISubjectService service;
	
	@GetMapping(value = "/getAllSubject/{GradeId}",produces = "application/json")
	public ResponseEntity<?> findByGradeId(@PathVariable("GradeId")Integer GradeId){
		
		log.info("Entered into method to fetch Subject Data");
		ResponseEntity<?> response=null;
		
		try {
			log.info("About to call fetch Subject service");
			List<Subject> findBySubject = service.findByGradeId(GradeId);
			
			if (findBySubject!=null && !findBySubject.isEmpty()) {
				log.info("Data is not empty=>"+findBySubject.size());
				findBySubject.sort((s1,s2)->s1.getSubjectId().compareTo(s2.getSubjectId()));
				response=new ResponseEntity<List<Subject>>(findBySubject,HttpStatus.OK);
			}else {
				log.info("No Student exist: size "+findBySubject.size());
				response=new ResponseEntity<String>("No Subject Found !!",HttpStatus.OK);
			}
		} catch (Exception e) {
			log.error("Unable to fetch Subject : problem is :"+e.getMessage());
			response=new ResponseEntity<String>("Unable to Fetch Subject Record !!",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		log.info("About to Exist fetch all method with Response");
		return response;
	}
}
