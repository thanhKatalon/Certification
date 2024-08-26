import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.LocalFileDetector
import org.openqa.selenium.support.events.EventFiringWebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.selenium.driver.CRemoteWebDriver as CRemoteWebDriver

WebUI.openBrowser('')

EventFiringWebDriver driver = DriverFactory.getWebDriver()

WebDriver wrappedDriver = driver.getWrappedDriver()

System.out.println(wrappedDriver.getClass())

if (wrappedDriver.class == CRemoteWebDriver) {
    wrappedDriver.setFileDetector(new LocalFileDetector())
}

WS.sendRequest(findTestObject('post request'))

String file = new File((RunConfiguration.getProjectDir() + '/') + 'file/TestFile.rtf')

WebUI.navigateToUrl('https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button')

WebUI.setViewPortSize(1280, 697)

WebUI.uploadFile(findTestObject('Object Repository/input_concat(id(, , myFile, , ))_filename'), file)

WebUI.takeFullPageScreenshot()


