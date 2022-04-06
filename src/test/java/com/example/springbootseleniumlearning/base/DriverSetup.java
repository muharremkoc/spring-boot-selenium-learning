package com.example.springbootseleniumlearning.base;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface DriverSetup {
    RemoteWebDriver getWebDriverObject(DesiredCapabilities desiredCapabilities);
}