package test
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testobject.TestObject

class Action {

	@Keyword
	def action(TestObject elementToCheck) {
		int device_Height = Mobile.getDeviceHeight();
		int device_Width = Mobile.getDeviceWidth();
		Mobile.comment('[INFO] Device height: ' + device_Height + " and width: " + device_Width);
				int startX = device_Width * 0.5;
				int endX = device_Width * 0.5;
				int startY = device_Height * 0.6;
				int endY = device_Height * 0.1;


		AppiumDriver driver = getCurrentSessionMobileDriver();
		if (driver instanceof IOSDriver) {
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			Sequence sequence;
			boolean isVisible = false;
			int attempts = 0;
			int maxAttempts = 5; // Set a maximum number of attempts

			while (!isVisible && attempts < maxAttempts) {
				sequence = new Sequence(finger, 2);
				sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
				sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
				sequence.addAction(finger.createPointerMove(Duration.ofMillis(400), PointerInput.Origin.viewport(), endX, endY));
				sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

				// Execute the sequence of touch actions.
				driver.perform(Collections.singletonList(sequence));

				// Check if the element is visible every 2 attempts
				if (attempts % 2 == 0) {
					isVisible = Mobile.verifyElementVisible(elementToCheck, 3, FailureHandling.OPTIONAL);
				}
				attempts++;
			}
			Mobile.comment('Element is now visible!');
		}
	}

	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}
}