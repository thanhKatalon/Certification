package customkeyword

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.Platform

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement


public class clearText {

	@Keyword

	def FindAndClearText(findTestObjectPath) {

		WebUI.verifyElementPresent(findTestObject(findTestObjectPath), 5)

		Platform currentPlatform = Platform.getCurrent();

		WebUI.comment("Platform is: "+ currentPlatform)

		Keys cmdCtrl
		if (currentPlatform.is(Platform.MAC)) {

			cmdCtrl = Keys.COMMAND
		} else {

			cmdCtrl = Keys.CONTROL
		}

		WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject(findTestObjectPath),2)
		String inputText = element1.getText()

		if( inputText != null ) {

			element1.sendKeys(cmdCtrl,"a")
			//	element1.sendKeys("x")
		}
	}
}
