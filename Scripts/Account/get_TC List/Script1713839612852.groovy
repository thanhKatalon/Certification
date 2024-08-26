import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import customkeyword.getTestCaseList as FailureHandling

getTestCaseList.getSuite('', '', '')

//String testsInSuite = CustomKeywords.'customkeyword.getTestCaseList.getSuite'('TS-01', "<tr><td>", "</td></tr>")
//println testsInSuite
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('your/object'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.verifyElementVisible(findTestObject(''), FailureHandling.OPTIONAL)

