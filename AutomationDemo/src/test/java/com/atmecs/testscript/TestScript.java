package com.atmecs.testscript;

import java.util.Properties;
import org.testng.annotations.Test;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.readerlocation.ReaderLocation;

public class TestScript extends BaseClass {
	static Properties property;
	ReaderLocation read = new ReaderLocation();

	@Test
	public void fillingFormDetails() throws Exception {
		System.out.println("launch chrome");
		// enter user first name
		CommonHelpers.sendText(driver, "loc_firstname", "user_name");

		// enter user second name
		CommonHelpers.sendText(driver, "loc_secondname", "user_secondname");

		// enter user place
		CommonHelpers.sendText(driver, "loc_address", "user_place");

		// enter user mail id
		CommonHelpers.sendText(driver, "loc_emailaddress", "user_emailaddress");

		// enter user contact number
		CommonHelpers.sendText(driver, "loc_contactnumber", "user_contactnumber");

		// select gender option
		CommonHelpers.clickAction(driver, "loc_femele");

		// select hobbies
		CommonHelpers.clickAction(driver, "loc_checkbox");

		// select language
		CommonHelpers.clickAction(driver, "loc_languages");
		CommonHelpers.clickAction(driver, "loc_selectlanguage");

		// select skills
		CommonHelpers.dropDownMenu(driver, "loc_skills", "user_skills");

		// select country
		CommonHelpers.dropDownMenu(driver, "loc_country", "user_country");

		// select additional country
		CommonHelpers.dropDownMenu(driver, "loc_ selectcountry", "user_selectcountry");

		// select year
		CommonHelpers.dropDownMenu(driver, "loc_year", "user_year");

		// select month
		CommonHelpers.dropDownMenu(driver, "loc_month", "user_month");

		// select day
		CommonHelpers.dropDownMenu(driver, "loc_day", "user_day");

		// enter password
		CommonHelpers.sendText(driver, "loc_firstpassword", "user_firstpassword");

		// enter conform password
		CommonHelpers.sendText(driver, "loc_conformpassword", "user_conformpassword");

		// click submit
		CommonHelpers.clickAction(driver, "loc_submit");

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
