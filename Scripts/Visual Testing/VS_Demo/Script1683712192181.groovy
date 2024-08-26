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

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption

Mobile.startApplication('/Users/thanh.pnguyen/Documents/Katalon/Certificate/file/ApiDemos.apk', true)

Mobile.getDeviceOSVersion(FailureHandling.OPTIONAL)

Mobile.getDeviceHeight(FailureHandling.OPTIONAL)

Mobile.getDeviceWidth(FailureHandling.OPTIONAL)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

TouchAction touchAction = new TouchAction(driver) 

OrientationBefore = Mobile.getCurrentOrientation(FailureHandling.OPTIONAL)

if (OrientationBefore == 'portrait') {
	
	Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.Button - OK'), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)
	
	touchAction.longPress(PointOption.point(667, 773)).moveTo(PointOption.point(65, 773)).release().perform()
	
} else {
	
	Mobile.tap(findTestObject('Object Repository/android.widget.TextView - App'), 0)
	
}



