package com.wiseStep.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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

	@NotNull(message = "it is mandatory ")
	@Size(min = 4, max = 6, message = "size should be min 4 and max 6")
	@Pattern(regexp = "[a-z]{4,6}$", message = "min 4 and max 6")
	private Integer passcode;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "locker")
	private Users user;

}
