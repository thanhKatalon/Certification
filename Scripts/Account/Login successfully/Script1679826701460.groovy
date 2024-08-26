import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://cms.demo.katalon.com/my-account/')
WebUI.callTestCase(findTestCase('Account/open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_My account  Katalon Shop/input__username'))

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Page_My account  Katalon Shop/input__username'), GlobalVariable.username, 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_My account  Katalon Shop/input__password'))

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Page_My account  Katalon Shop/input__password'), GlobalVariable.password)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_My account  Katalon Shop/input__rememberme'))

WebUI.click(findTestObject('Page_My account  Katalon Shop/button_Log in'))

