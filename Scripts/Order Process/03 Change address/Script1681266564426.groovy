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

WebUI.click(findTestObject('Object Repository/a_Change address'))

WebUI.click(findTestObject('Object Repository/span_Vietnam'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_My account  Katalon Shop/Page_Katalon Shop  Katalon Ecommerce/Page_Cart  Katalon Shop/li_Venezuela'))

WebUI.delay(3)

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input_Venezuela_calc_shipping_state'), 'ff')

WebUI.delay(3)

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input_Venezuela_calc_shipping_city'), 'SG')

WebUI.delay(3)

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/input_Venezuela_calc_shipping_postcode'), '5000')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Button_Update'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/p_Shipping to SG, a, 5000, Venezuela'), 'Shipping to SG, ff, 5000, Venezuela.')

WebUI.click(findTestObject('Page_My account  Katalon Shop/Page_Katalon Shop  Katalon Ecommerce/Page_Cart  Katalon Shop/a_Proceed to checkout'))

