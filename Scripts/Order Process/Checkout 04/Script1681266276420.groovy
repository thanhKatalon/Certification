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
import org.eclipse.persistence.jpa.jpql.Assert as Assert
import org.openqa.selenium.Keys as Keys

//import static org.testng.Assert.assertEquals;
PageTitle = WebUI.getWindowTitle()

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input__billing_first_name'), 'Eve')

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input__billing_last_name'), 'L')

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input_(optional)_billing_company'), 'Katalon')

WebUI.delay(3)

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input__billing_address_1'), '19 Nguyen Thi Thap')

WebUI.delay(3)

WebUI.click(findTestObject('input_(optional)_billing_postcode'))

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input_(optional)_billing_postcode'), '5000')

WebUI.delay(3)

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input__billing_phone'), '0359912894')

WebUI.click(findTestObject('Object Repository/div_Have a coupon Click here to enter your _f97527'))

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input__billing_email'), 'katalonLover@outlook.com')

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/textarea_(optional)_order_comments'), 'cash')

WebUI.click(findTestObject('Object Repository/button_Place order'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Order Process/05 Verify last order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Order Process/06 remove items'), [:], FailureHandling.STOP_ON_FAILURE)

