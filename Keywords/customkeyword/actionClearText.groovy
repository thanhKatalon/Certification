package customkeyword

import org.openqa.selenium.Keys
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords


public class actionClass {
	@Keyword

	def copyText(TestObject to, int timeout){
		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		WebDriver driver = DriverFactory.getWebDriver();
		Actions a = new Actions(driver)
		WebElement element = 	WebUiBuiltInKeywords.findWebElement(to, timeout);
		a.keyDown(element, cmdCtrl).sendKeys("a").sendKeys(Keys.DELETE).keyUp(cmdCtrl).build().perform()
	}
}