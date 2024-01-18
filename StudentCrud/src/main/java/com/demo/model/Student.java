package com.demo.model;

public class Student {
int id;
String namefirst;
String namelast;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNamefirst() {
	return namefirst;
}
public void setNamefirst(String namefirst) {
	this.namefirst = namefirst;
}
public String getNamelast() {
	return namelast;
}
public void setNamelast(String namelast) {
	this.namelast = namelast;
}
public Student(int id, String namefirst, String namelast) {
	super();
	this.id = id;
	this.namefirst = namefirst;
	this.namelast = namelast;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", namefirst=" + namefirst + ", namelast=" + namelast + "]";
}
}
