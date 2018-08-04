package com.test.ankur.domin;

public class Person {

	private int age;
	private String name;
	private char sex;
	
	public Person(String name, int age, char sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public char getSex() {
		return sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public String toString() {
		return getName();
	}
}
