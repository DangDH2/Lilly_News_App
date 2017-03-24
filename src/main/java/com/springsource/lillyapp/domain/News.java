package com.springsource.lillyapp.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "PET_SEQ", finders = { "findPetsByNameAndWeight", "findPetsByOwner",
        "findPetsBySendRemindersAndWeightLessThan", "findPetsByTypeAndNameLike" })
public class News {

	/**
	 */
	@NotNull
	private boolean id;

	/**
	 */
	@NotNull
	private String title;

	/**
	 */
	@NotNull
	private Date startDate;

	/**
	 */
	@NotNull
	private Date endDate;

	/**
	 */
	@NotNull
	private String content;
}
