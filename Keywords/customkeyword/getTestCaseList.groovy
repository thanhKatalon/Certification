package customkeyword

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.time.TimeCategory
import groovy.time.TimeDuration
import groovy.xml.XmlSlurper


public class getTestCaseList {
	@Keyword

	static String getSuite(String suiteName, String before = "", String after = "") {
		int count = 0
		String projDir = RunConfiguration.getProjectDir()
		String fname = projDir + "/Test Suites/" + suiteName + ".ts"
		WebUI.comment("getSuiteTests reading: " + fname)
		String xmlText = new File(fname).getText()
		WebUI.comment("getSuiteTests parsing: " + fname)
		def testList = new XmlSlurper().parseText(xmlText)
		String output = ""

		testList.testCaseLink.testCaseId.each {
			count++
			output += before + count.toString() + ": " + it.toString() + after + "\n\n"
		}

		return output
	}
}
