package com.atmecs.testscript;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class WindowHandles extends BaseClass {
	static Properties property;
    ReaderLocation read = new ReaderLocation();
    @Test
    public void launchChrome() throws Exception {
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
