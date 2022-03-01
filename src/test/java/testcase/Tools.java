package testcase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileElement;

public class Tools {
	public static String generatedPhone;
	public static String generatedUserId;


	public static void assertDisabled(WebElement element) {
		Assert.assertEquals(false, element.isEnabled());
	}
	public static void assertEnabled(WebElement element) {
		Assert.assertEquals(true, element.isEnabled());
	}

	public static void assertVisible(WebElement element) {
		Assert.assertEquals(true, element.isDisplayed());
	}
	public static void assertNotAvailable(List<MobileElement> list) {
		Assert.assertEquals(0, list.size());
	}

	public static void assertNotAvailableCamera(List<MobileElement> list) {
		Assert.assertEquals(1, list.size());
	}

	public static void assert1MonthFulfilled(List<MobileElement> list) {
		Assert.assertEquals(1, list.size());
	}

	public static void assert2MonthFulfilled(List<MobileElement> list) {
		Assert.assertEquals(2, list.size());
	}

	public static void assert3MonthFulfilled(List<MobileElement> list) {
		Assert.assertEquals(3, list.size());
	}

	public static void assertBonusSuper(List<MobileElement> list) {
		Assert.assertEquals(1, list.size());
	}

}
