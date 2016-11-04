package com.juvenxu.mvnbook.helloworld;

public class HelloWorld
{
	public String sayHello()
	{
		return "Hello Maven";
	}
	
	public static void main(String[] args)
	{
		System.out.print(new HelloWorld().sayHello());
		System.out.println("Say hello world too, on 2016/11/4");
	}
	
}
