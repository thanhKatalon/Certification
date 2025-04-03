package test
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.model.FailureHandling as FailureHandling

import com.kms.katalon.core.testobject.TestObject as TestObject

import internal.GlobalVariable as GlobalVariable

class demo {
	
		@Keyword
		def tapFirstExistingElement(List<TestObject> objects) {
			for (TestObject obj : objects) {
				if (Mobile.verifyElementExist(obj, 2, FailureHandling.OPTIONAL)) {
					Mobile.tap(obj, 0)
					return obj // Return the tapped object to identify it
				}
			}
			return null
		}
	
		@Keyword
		def handleDismissalButtons() {
			
			// Define objects using ObjectHelper for cross-platform compatibility
			TestObject jazzCashObject = CustomKeywords.'ObjectHelper.getObject'(
				'Object Repository/Android/Dashboard/android.widget.TextView - JazzCash',
				'Object Repository/IOS - HAIDER ALI/Dashboard/XCUIElementTypeImage - JazzCash'
			)
			TestObject closeButtonObject = CustomKeywords.'ObjectHelper.getObject'(
				'Object Repository/Android/Dashboard/More Option/More Option Close Screen Click',
				'Object Repository/IOS - HAIDER ALI/Dashboard/XCUIElementTypeStaticText - Close'
			)
			TestObject yesCancelButton = CustomKeywords.'ObjectHelper.getObject'("", "Yes, Cancel", "Text")
			TestObject notNowButton = findTestObject("Object Repository/IOS - HAIDER ALI/Dashboard/XCUIElementTypeButton - Not Now")
			TestObject backButton = findTestObject("Object Repository/IOS - HAIDER ALI/Dashboard/XCUIElementTypeButton - back")
			TestObject homeButton = findTestObject("Object Repository/IOS - HAIDER ALI/Money Transfer C2C/XCUIElementTypeButton - Home")
			TestObject bnHomeButton = findTestObject("Object Repository/IOS - HAIDER ALI/Dashboard/XCUIElementTypeImage - BN Home")
			
			
			List<TestObject> dismissalButtons = [yesCancelButton, closeButtonObject]
			int count = 0
	
			while (!Mobile.verifyElementVisible(jazzCashObject, 2, FailureHandling.OPTIONAL)) {
				if (Mobile.verifyElementVisible(closeButtonObject, 2, FailureHandling.OPTIONAL)) {
					CustomKeywords.'helperTapSet.HelperTapSet.waitForElementAndTap'(closeButtonObject, 'More Option')
				} else if (GlobalVariable.OS == 'IOS') {
					if (Mobile.verifyElementExist(notNowButton, 2, FailureHandling.OPTIONAL)) {
						Mobile.tap(notNowButton, 0)
						break
					} else {
						def tappedObject = tapFirstExistingElement(dismissalButtons)
						if (!tappedObject) {
							if (Mobile.verifyElementExist(backButton, 2, FailureHandling.OPTIONAL)) {
								Mobile.tap(backButton, 0)
							} else if (Mobile.verifyElementExist(homeButton, 2, FailureHandling.OPTIONAL)) {
								Mobile.tap(homeButton, 0)
							} else {
								Mobile.tapAtPosition(50, 50)
							}
						}
					}
				} else { // Android
					Mobile.pressBack()
				}
	
				Mobile.delay(0.5)
				count++
	
				if (count == 3 && GlobalVariable.OS == 'IOS') {
					Mobile.tap(bnHomeButton, 0, FailureHandling.OPTIONAL)
				}
	
				if (count == 10) {
					break
				}
			}
		}
	}