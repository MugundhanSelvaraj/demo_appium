package appium_demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {
public static  AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException
{
AndroidDriver<AndroidElement>  driver;

// TODO Auto-generated method stub
	File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     if(device.equals("real"))
    	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
     else
         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TestEmulator");
     
   //  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   
   return driver;
}

}