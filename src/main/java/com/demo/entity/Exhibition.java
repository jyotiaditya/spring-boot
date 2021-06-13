package com.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EXHIBITIONS")
public class Exhibition {
	@Id
	@Column(name = "exhibition_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exhibitionId;

	@ManyToMany
	@JoinTable(name = "AUDIENCES_BY_EXHIBITIONS", joinColumns = @JoinColumn(name = "exhibition_id"), inverseJoinColumns = @JoinColumn(name = "target_audience_id"))
	private List<TargetAudience> targetAudience;

	@Override
	public String toString() {
		return "Exhibition{" + "targetAudience=" + targetAudience + '}';
	}
}