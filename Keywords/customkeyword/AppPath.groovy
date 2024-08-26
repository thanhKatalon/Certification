package customkeyword
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable


public enum AppPath {
appPath_Test,
appPath_Prod,
appPath_Azure;
}

 @Keyword
class AppStarter {

	static void startApplication(AppPath appPath) {
		
		String appPathString
		switch (appPath) {
		  case AppPath.appPath_Test:
			appPathString = GlobalVariable.appPath_Test
			Mobile.startApplication(appPathString, true);
			break;
			
		  case AppPath.appPath_Prod:
			appPathString - GlobalVariable.appPath_Prod
			Mobile.startApplication(appPathString, true);
			break;
			
		  case AppPath. appPath_Azure:
			appPathString = GlobalVariable.appPath_Azure
			Mobile.startApplication(appPathString, true);
			break;
		}
	}
}