package com.gkeeper.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;





@Data
@Entity
@Table(name="timeline")
@Getter
@Setter
@Builder
@AllArgsConstructor


public class Timeline {
	@Id
	@Column(name="timelineId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer timelineId;
	
	//enum 사용?
	@Enumerated(value=EnumType.ORDINAL) //db에는 index로 저장
	@Column(name="timelineType")
	private TimelineType timelineType;
	
	@Column(name="timelineDate", nullable=false, updatable=false, insertable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp timelineDate;
	
	@Column(name="timelineKeyword")
	private String timelineKeyword;
	
	private Integer goalId;


}


enum TimelineType{  //추가 예정
	exercise,
	study,
	habit,		
}

