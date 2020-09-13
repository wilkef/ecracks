package com.wilkef.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionLevel {
	
	private Integer DifficultyId;
	private String DifficultyCode;
	private Integer IsActive;
	private String CreatedBy;
	private Date CreationDate;
	private String LastUpdatedBy;
	private Date LastUpdateDate;
	
}
