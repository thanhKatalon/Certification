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

WebUI.callTestCase(findTestCase('Account/Login successfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_My account  Katalon Shop/Page_Katalon Shop  Katalon Ecommerce/Page_Cart  Katalon Shop/a_Cart'))

SamplePageTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(SamplePageTitle, 'Cart – Katalon Shop', false)

WebUI.waitForElementPresent(findTestObject('Page_My account  Katalon Shop/Page_Katalon Shop  Katalon Ecommerce/img__attachment-woocommerce_thumbnail size-woocommerce_thumbnail'), 
    5)

WebUI.verifyTextPresent('Ship Your Idea', false)

WebUI.verifyEqual('2', '2')

WebUI.scrollToElement(findTestObject('Page_My account  Katalon Shop/Page_Katalon Shop  Katalon Ecommerce/Page_Cart  Katalon Shop/button_Update cart'), 
    0)

WebUI.callTestCase(findTestCase('Order Process/03 Change address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Order Process/Checkout 04'), [:], FailureHandling.STOP_ON_FAILURE)

