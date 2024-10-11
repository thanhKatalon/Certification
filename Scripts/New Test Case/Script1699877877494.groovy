import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static customkeyword.AppPath.appPath_Test
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
import customkeyword.AppPath as AppPath
import customkeyword.AppStarter as AppStarter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.via.dovera.sk/')

WebUI.setViewPortSize(760, 1024)

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Via dvera/button_Prihlsi sa'))

WebUI.delay(5)

//String value = ('katalon03' + '@') + 'gmail.com'

WebUI.setText(findTestObject('Object Repository/Page_Dvera EP - Prihlsenie/input_Zisti viac_id-m22ra6yanu303sehyor-input'), 
    LOGIN)

