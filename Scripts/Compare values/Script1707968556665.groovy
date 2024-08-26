import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions

import com.kms.katalon.core.webui.driver.DriverFactory
 

System.setProperty("webdriver.gecko.driver", '/Users/thanh.pnguyen/Documents/Katalon/Certificate/Include/drivers/geckodriver_mac64/geckodriver')

a = DriverFactory.getGeckoDriverPath()

println a
FirefoxOptions ff = new FirefoxOptions()

ff.addPreference("browser.link.open_newwindow", 3)

FirefoxDriver fd = new FirefoxDriver(ff)
//WebDriver fd = new FirefoxDriver(ff)

DriverFactory.changeWebDriver(fd)
  
//WebUI.openBrowser('')




//  WebUI.navigateToUrl('https://katalon.com/')
//  
//  WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/button_Accept All Cookies'))
//  
//  WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Start free trial'), 0)
//  
//  WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Resources'))
//  
//  WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Product Documentation'))
// 

