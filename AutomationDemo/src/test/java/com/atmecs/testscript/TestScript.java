package com.atmecs.testscript;

import java.util.Properties;
import org.testng.annotations.Test;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class TestScript extends BaseClass {
	static Properties property;
	ReaderLocation read = new ReaderLocation();


	@Test
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

	// Select dropdown = new
	// Select(driver.findElement(By.id("//select[@type='text']")));
	// dropdown.selectByVisibleText("APIs");
	// Select dropdown1 = new
	// Select(driver.findElement(By.id("//select[@id'countries']")));
	// dropdown1.selectByVisibleText("India");
	// CommonHelpers.dropDown(driver, "//span[@role='combobox']",
	// "//span[text()='India']");
	// Select year = new
	// Select(driver.findElement(By.id("//select[@id='yearbox']")));
	// year.selectByVisibleText("2000");

	// Select month = new
	// Select(driver.findElement(By.id("//select[@placeholder='Month']")));
	// month.selectByVisibleText("May");

	// Select day = new Select(driver.findElement(By.id("//select[@id='daybox']")));
	// day.selectByVisibleText("12");

}
