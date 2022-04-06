package com.example.springbootseleniumlearning.stepdef;


import com.example.springbootseleniumlearning.page.GoogleSearch;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest
public class GoogleStepDef  {

    @Autowired
    GoogleSearch googleSearch;


    @When("I launch google.com")
    public void launchGoogle() {
        googleSearch.launchGoogleSearch();
    }



}