package com.gkeeper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="authority")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Authority {
	
	@Id
	@Column(name="authId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer authId;
	
	@Column(name="authName")
	private String authName;
	

}
