import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cgi-lib.berkeley.edu/ex/fup.html')

WebUI.delay(15)

Robot robot = new Robot()

robot.delay(1000)

//Open Goto window
robot.keyPress(KeyEvent.VK_META)

robot.keyPress(KeyEvent.VK_SHIFT)

robot.keyPress(KeyEvent.VK_G)

robot.keyRelease(KeyEvent.VK_META)

robot.keyRelease(KeyEvent.VK_SHIFT)

robot.keyRelease(KeyEvent.VK_G)

robot.delay(500)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

File file = new File('/Users/thanh.pnguyen/Documents/Katalon/Certificate/file/info.txt')

StringSelection stringSelection = new StringSelection(file.getAbsolutePath())

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null)

//Paste the clipboard value
robot.keyPress(KeyEvent.VK_META)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_META)

robot.keyRelease(KeyEvent.VK_V)

robot.delay(500)

//Press Enter key to close the Goto window and Upload window
//
robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.delay(1000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.takeFullPageScreenshot()

