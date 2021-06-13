package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TARGET_AUDIENCES")
public class TargetAudience {
	@Id
	@Column(name = "target_audience_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int targetAudienceId;
}