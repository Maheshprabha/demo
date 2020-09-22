package com.atmecs.automationregister.pageactions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.automationregister.commonhelpers.CommonHelpers;
import com.atmecs.automationregister.filepath.FilePath;
import com.atmecs.automationregister.readerlocation.ReaderLocation;

public class LoginPageActions {   
	static Properties property;
	ReaderLocation read = new ReaderLocation();
    WebDriver driver;
	public void fillingFormDetails() throws Exception {
		System.out.println("launch chrome");
		property = ReaderLocation.readLocation(FilePath.locator_path);
		property = ReaderLocation.readLocation(FilePath.User_path);
       // enter user first name
		CommonHelpers.sendText(driver, property.getProperty("loc_firstname"), property.getProperty("user_name"));

		// enter user second name
		CommonHelpers.sendText(driver, property.getProperty("loc_secondname"), property.getProperty("user_secondname"));

		// enter user place
		CommonHelpers.sendText(driver, property.getProperty("loc_address"), property.getProperty("user_place"));

		// enter user mail id
		CommonHelpers.sendText(driver, property.getProperty("loc_emailaddress"), property.getProperty("user_emailaddress"));

		// enter user contact number
		CommonHelpers.sendText(driver, property.getProperty("loc_contactnumber"), property.getProperty("user_contactnumber"));

		// select gender option
		CommonHelpers.clickAction(driver, property.getProperty("loc_femele"));

		// select hobbies
		CommonHelpers.clickAction(driver, property.getProperty("loc_checkbox"));

		// select language
		CommonHelpers.clickAction(driver, property.getProperty("loc_languages"));
		CommonHelpers.clickAction(driver, property.getProperty("loc_selectlanguage"));

		// select skills
		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_skills"), property.getProperty("user_skills"));

		// select country
		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_country"), property.getProperty("user_country"));

		// select additional country
		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_ selectcountry"), property.getProperty("user_selectcountry"));

		// select year
		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_year"), property.getProperty("user_year"));

		// select month
		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_month"), property.getProperty("user_month"));

		// select day
		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_day"), property.getProperty("user_day"));

		// enter password
		CommonHelpers.sendText(driver, property.getProperty("loc_firstpassword"), property.getProperty("user_firstpassword"));

		// enter conform password
		CommonHelpers.sendText(driver, property.getProperty("loc_conformpassword"), property.getProperty("user_conformpassword"));

		// click submit
		CommonHelpers.clickAction(driver, property.getProperty("loc_submit"));

	}


}
