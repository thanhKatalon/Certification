import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.mobilink.jazzcash')

//Mobile.startApplication('9db4aaf1-f555-4ba6-bda4-756346c8cbd8', true)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeTextField - 03XXXXXXXXX'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeButton - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 1 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 2 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 4 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - 5 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - Skip Tour'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - Dont Allow'), 0)

Mobile.tap(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - More'), 0)

Mobile.delay(2)

CustomKeywords.'test.Action.action'(findTestObject('Object Repository/Jazz Cash/XCUIElementTypeStaticText - Government Payments'))

