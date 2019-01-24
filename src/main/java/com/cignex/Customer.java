package com.cignex;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer{
	private String name;
	private String age;
	private String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer( String name, String age, String number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", number=" + number + "]";
	}
	
	
}
