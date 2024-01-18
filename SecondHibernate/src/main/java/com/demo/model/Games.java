package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="games")
public class Games {
	@Id // it will make id as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//it will auto generate id
	int id;
	@Column(unique = true)//it will make name entries as unique
	String name;
	
	public Games() {
		super();
	}
	public Games( String name) {
		super();
//		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Games [id=" + id + ", name=" + name + "]";
	}
}
