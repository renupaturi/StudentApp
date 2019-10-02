package com.studentapp.junit.studentsinfo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class FirstSerenityTest3 {

	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI="http://localhost:8085/student";
	}
	@Test
	public void getAllStudents()
	{
		RestAssured.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all();
		
	}
}
