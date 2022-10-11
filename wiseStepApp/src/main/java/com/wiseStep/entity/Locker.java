package com.wiseStep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Locker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lockerId;
	
	@Min(value = 0)
	private Integer passcode;

}
