package com.demoqa.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.demoqa.utils.ConfigReader.getValue;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size-1920,1080");
        if (Boolean.parseBoolean(getValue("headless"))) {
            options.addArguments("--headless");
        }
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }


    //        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions browserOptions = new ChromeOptions();
//        browserOptions.setPlatformName("Windows 11");
//        browserOptions.setBrowserVersion("latest");
//        Map<String, Object> sauceOptions = new HashMap<>();
//        sauceOptions.put("username", "oauth-meerim.baltabaeva.kk-28803");
//        sauceOptions.put("accessKey", "4cef4017-d669-46e8-b527-b9f14f51a7a0");
//        sauceOptions.put("build", "selenium-build-AHI0X");
//        sauceOptions.put("name", "<your test name>");
//        browserOptions.setCapability("sauce:options", sauceOptions);
//        URL url = null;
//        try {
//            url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
//
//        if (Boolean.parseBoolean(getValue("headless"))) {
//            browserOptions.addArguments("--headless");
//        }
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        return driver;
//    }
}