package com.atmecs.automationregister.pageactions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.automationregister.commonhelpers.CommonHelpers;
import com.atmecs.automationregister.filepath.FilePath;
import com.atmecs.automationregister.readerlocation.ReaderLocation;

public class WindowHandlingPageAction {
	static Properties property;
    ReaderLocation read = new ReaderLocation();
    WebDriver driver;
    @Test
    public void windowHandle() throws Exception {
    	property = ReaderLocation.readLocation(FilePath.locator_path);
    	System.out.println("launch chrome");
    	CommonHelpers.clickAction(driver, property.getProperty("loc_facebook"));
    	CommonHelpers.switchTOWindows(driver, property.getProperty("loc_twitter"));
    	CommonHelpers.clickAction(driver, property.getProperty("loc_facebook"));

    	CommonHelpers.switchTOWindows(driver, property.getProperty("loc_linkedin"));
    	CommonHelpers.switchTOWindows(driver, property.getProperty("loc_google"));
    	CommonHelpers.switchTOWindows(driver, property.getProperty("loc_youtube"));

    	


    }

}
