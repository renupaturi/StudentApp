package com.studentapp.cucumber.serenity;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class StudentSerenitySteps {
@Step
	public  ValidatableResponse createSudent(String firstName,String lastName)
	{
		return SerenityRest.given()
				.contentType(ContentType.JSON)
				.when()
				.body("stdent")
				.post()
				.then();
		
	}
}
