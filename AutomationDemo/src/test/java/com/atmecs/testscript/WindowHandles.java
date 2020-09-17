package com.atmecs.testscript;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.readerlocation.ReaderLocation;

public class WindowHandles extends BaseClass {
	static Properties property;
    ReaderLocation read = new ReaderLocation();
    @Test
    public void launchChrome() throws Exception {
    	System.out.println("launch chrome");
    	CommonHelpers.clickAction(driver, "//span[@class='fa fa-facebook-square']");
    	CommonHelpers.switchTOWindows(driver, "//a[@class='link twitter']");
    	CommonHelpers.clickAction(driver, "//span[@class='fa fa-facebook-square']");

    	CommonHelpers.switchTOWindows(driver, "//span[@class='fa fa-linkedin-square']");
    	CommonHelpers.switchTOWindows(driver, "//a[@class='link google-plus']");
    	CommonHelpers.switchTOWindows(driver, "//span[@class='fa fa-youtube-square']");

    	



    }

}
