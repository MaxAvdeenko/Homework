package com;
public class Cats {
	private String name;
	private String sex;
	private String color;
	private Integer age;
	public void meow(){
		System.out.println("ћ€у");
	}
	
	public void init (String name, String sex, String color, Integer age){
		this.name=name;
		this.sex=sex;
		this.color=color;
		this.age=age;
		System.out.println(" от успешно загружен");
	}
	public String getDescription(){
		return "я кот и мен€ зовут "+name;
	}
	
}

