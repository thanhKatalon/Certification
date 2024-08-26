import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.automationtesting.in/FileDownload.html#google_vignette')

CustomKeywords.'customkeyword.SetTextHelper.setTextWithJavascript'(findTestObject('Object Repository/Page_File input - Multi select/textarea_Enter Data_textbox'), 'hello bro')

WebUI.click(findTestObject('Object Repository/Page_File input - Multi select/button_Generate File'))

WebUI.click(findTestObject('Object Repository/Page_File input - Multi select/a_Download'))

File filePath = new File(RunConfiguration.getProjectDir() + '/' + 'file/Test.rtf')

if (filePath.exists()==true)
	
{
	println "file exists"
}

