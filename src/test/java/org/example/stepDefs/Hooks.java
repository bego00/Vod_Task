package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
      public static WebDriver driver =null;

    @Before
    public static void OpenBrowser() {
        //1 Bridge
        String ChromePath = System.getProperty("user.dir") + "\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromePath);

        //2- create object from Chrome browser
        driver= new ChromeDriver();

        //3- Configurations
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //4- navigate to url
        driver.get("https://eshop.vodafone.com.eg/shop/home");
    }
//
//    @After
//    public static void quitDriver() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.quit();
//    }
}
