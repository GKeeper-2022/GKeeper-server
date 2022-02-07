package com.gkeeper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="theme")
@Getter
@Setter
@AllArgsConstructor
public class Theme {
	
	@Id
	@Column(name="themeId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer themeId;
	
	@Column(name="themeTitle", unique=true)
	private String themeTitle;
	

}
