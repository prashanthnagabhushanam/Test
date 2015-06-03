package com.prashanth.domain;

public class User {

	private String _name;
	private Long _age;
	
	public User(String name, Long age) {
		_name=name;
		_age=age;
	}
	
	public User() {
	}
	
	
	public String getName()
	{
		return _name;
	}
	public Long getAge()
	{
		return _age;
	}
}
