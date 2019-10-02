package com.studentapp.junit.studentsinfo;

import java.util.ArrayList;

import org.junit.Test;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;
import com.studentapp.utils.ReusableSpecifications;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

public class StudentsCRUDTest extends TestBase {
	static String firstName;
	static String lastName;
	
	@Steps
	StudentSerenitySteps steps;
@Title("This test will create a newstudent")
@Test

public void createStudent()
{
	SerenityRest.given()
	.contentType(ContentType.JSON)
	.when()
	.body("")
	.post();
	steps.createSudent(firstName, lastName)
.spec(ReusableSpecifications.getGenericResponseSpec());
			
}
@Title("verify the student was added to the appilication ")
@Test
public void getStudent()
{
	SerenityRest.given()
	.when()
	.get("/list")
    .then()
     .log()
     .all();
     
	}
@Title("update the user information")
@Test
public void update()
{
	ArrayList<String> courses=new ArrayList<String>();
	courses.add("java");
	courses.add("c++");
	SerenityRest.given()
	.contentType(ContentType.JSON)
	.when()
	.log()
	.all();
	
}
	
	
}	
	
	
	
	
	
	
	
	




