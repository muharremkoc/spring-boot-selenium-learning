package com.example.springbootseleniumlearning.base;


import com.example.springbootseleniumlearning.SpringBootSeleniumLearningApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;

@SpringBootTest(classes = SpringBootSeleniumLearningApplication.class)
public class AbstractPageTest extends AbstractTestNGSpringContextTests {
    Logger logger = LoggerFactory.getLogger(this.getClass());


    @AfterMethod
    public void close(){
        logger.info("After Method :: Trying to close all web driver instances");
        DriverFactory.getInstance().removeDriver();
    }
}
