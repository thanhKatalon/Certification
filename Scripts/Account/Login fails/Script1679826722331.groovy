import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'open the website\n'
WebUI.openBrowser('')

'navigate to website'
WebUI.navigateToUrl('https://cms.demo.katalon.com/my-account/')

WebUI.click(findTestObject('Page_My account  Katalon Shop/input__rememberme'))

WebUI.takeFullPageScreenshot()

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Page_My account  Katalon Shop/input__username'), 
    GlobalVariable.username)

WebUI.click(findTestObject('Page_My account  Katalon Shop/input__password'))

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Page_My account  Katalon Shop/input__password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Page_My account  Katalon Shop/input__rememberme'))

WebUI.click(findTestObject('Page_My account  Katalon Shop/button_Log in'))

WebUI.getText(findTestObject('Object Repository/Page_My account  Katalon Shop/Page_My account  Katalon Shop/strong_KatalonLover'), 
    FailureHandling.STOP_ON_FAILURE)

//verify the text without considering its format 
String responseString = 'KatalonLover'

String expectedString = 'katalonlover'

if (responseString.toUpperCase() == expectedString) {
    println('Response is correct')
} else {
    println('Response is not correct')
}

