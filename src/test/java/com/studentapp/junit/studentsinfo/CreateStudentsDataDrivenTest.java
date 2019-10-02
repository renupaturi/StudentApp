package com.studentapp.junit.studentsinfo;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
@UseTestDataFrom("test\\studentinfo.csv")
@RunWith(SerenityParameterizedRunner.class)
public class CreateStudentsDataDrivenTest extends TestBase
{
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public StudentSerenitySteps getSteps() {
		return steps;
	}
	public void setSteps(StudentSerenitySteps steps) {
		this.steps = steps;
	}
	private String lastName;
@Steps
StudentSerenitySteps steps;
@Title("Data driven test for adding multiple students to the StudentApp.")
@Test
public void createMultpleStudents()
{
	steps.createSudent(firstName, lastName)
	.statusCode(201);
}
	
}
