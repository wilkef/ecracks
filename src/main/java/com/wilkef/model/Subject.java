package com.wilkef.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
	private Integer SubjectId;
	private String SubjectName;
	private String SubjectCode;
	private Integer GradeId;
	private Integer MaxMark;
	private Integer NoOfPeriod;
	private Date StartDate;
	private Date EndDate;
	private Integer IsActive;
	private String CreatedBy;
	private Date CreationDate;
	private String LastUpdatedBy;
	private Date LastUpdateDate;
}
