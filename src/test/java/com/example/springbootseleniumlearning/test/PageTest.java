package com.example.springbootseleniumlearning.test;


import com.example.springbootseleniumlearning.base.AbstractPageTest;
import com.example.springbootseleniumlearning.page.GoogleSearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class PageTest  extends AbstractPageTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GoogleSearch googleSearch;


    @Test
    public void verifyGoogleHomePage(){
        logger.info("Starting Google home page test");
        googleSearch.launchGoogleSearch();
        googleSearch.enterSearchTermAs("turkey");
        googleSearch.submit();

        logger.info("Google homepage test completed.");

    }



    @Test
    public void verifyGoogleHomePageUS(){

        googleSearch.launchGoogleSearch();
        googleSearch.enterSearchTermAs("USA");
        googleSearch.submit();


    }
}
