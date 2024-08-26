import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject as findTestObject
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
import org.openqa.selenium.support.Color as Color

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon.com/')

WebUI.verifyElementPresent(findTestObject('Page_Katalon AI-augmented Software Quality _596167/Page_Katalon AI-augmented Software Quality Management Platform/button_Reject All'), 
    3)

def r = WebUI.getCSSValue(findTestObject('Page_Katalon AI-augmented Software Quality _596167/Page_Katalon AI-augmented Software Quality Management Platform/button_Reject All'), 
    'color')

println(r)

String h = Color.fromString(r).asHex()

System.out.println('Color is :' + r)

System.out.println('Hex code for color:' + h)

WebUI.verifyMatch(h, '#ffffff', false)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Account/open browser'), [:], FailureHandling.STOP_ON_FAILURE)

