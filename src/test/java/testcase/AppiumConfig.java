package testcase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class AppiumConfig {

	public AppiumDriver<MobileElement> driver;
	public AppiumDriverLocalService service;
	public int screenHeight;
	public int screenWidth;
	WebDriverWait wait;

	public AppiumConfig(boolean loggedin) throws MalformedURLException {
		// service = AppiumDriverLocalService.buildDefaultService();
		// service.start();
		System.out.println("INITIATING APPIUM DRIVER");


		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "PrimeJ7");
		caps.setCapability("udid", "3300464a34ee3521");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion","8.1.0");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "io.flutter.demo.gallery");
		caps.setCapability("appActivity", "io.flutter.demo.gallery.MainActivity");
		if (loggedin) {
			caps.setCapability("noReset", "true");
		} else {
			caps.setCapability("noReset", "false");
		}
		caps.setCapability("automationName", "uiautomator2");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		// driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:5555/wd/hub"), caps);
		wait = new WebDriverWait(driver, 30);
		screenHeight = driver.manage().window().getSize().getHeight();
		screenWidth = driver.manage().window().getSize().getWidth();
		System.out.println("ScreenHeight=" + screenHeight);
		System.out.println("ScreenWidth=" + screenWidth);
		System.out.println("~~FINISH INITIATING APPIUM DRIVER");
	}

	public void waitUntilVisible(By locator) {
		this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitUntilInvisible(By locator) {
		this.wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public void swipeLeft() {
		TouchAction ts = new TouchAction(this.driver);
		int startX = (int) (this.screenWidth * 0.85);
		int startY = (int) (this.screenHeight * 0.3);
		int endX = (int) (this.screenWidth * 0.15);
		int endY = (int) (this.screenHeight * 0.3);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
	}

	public void clickByCoordinate() {
		TouchAction ts = new TouchAction(this.driver);
		int startX = (int) (this.screenWidth * 0.5);
		int startY = (int) (this.screenHeight * 0.3);
		int endX = (int) (this.screenWidth * 0.15);
		int endY = (int) (this.screenHeight * 0.3);
		ts.longPress(PointOption.point(startX, startY)).release().perform();
	}

	public void clickByCoordinateWithInput(Double x, Double y) {
		TouchAction ts = new TouchAction(this.driver);
		int startX = (int) (this.screenWidth * x);
		int startY = (int) (this.screenHeight * y);
		int endX = (int) (this.screenWidth * 0.15);
		int endY = (int) (this.screenHeight * 0.3);
		ts.press(PointOption.point(startX, startY)).release().perform();
	}

	public void swipeByCoordinate(Double x, Double y,Double x2, Double y2) {
		TouchAction ts = new TouchAction(this.driver);
		int startX = (int) (this.screenWidth * x);
		int startY = (int) (this.screenHeight * y);
		int endX = (int) (this.screenWidth * x2);
		int endY = (int) (this.screenHeight * y2);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
	}
}
