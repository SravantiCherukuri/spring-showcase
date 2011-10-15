package me.m1key.springshowcase.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Reservation {

	@NotNull
	@Size(min = 2)
	private String userName;
	@NotNull
	private Integer age;

	private boolean complete;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

}
