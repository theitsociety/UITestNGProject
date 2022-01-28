package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;
/* getDriver() method is used:
* 1.setUp driver
* 2.create driver
* 3.return driver
* driver =======>Driver.getDriver()
 */

    public static WebDriver getDriver(){

        if(driver==null) {//if driver is not pointing anywhere , then instantiate the driver

           switch(ConfigReader.getProperty("browser")){

               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;

               case "firefox":
                   WebDriverManager.chromedriver().setup();
                   driver=new FirefoxDriver();
                   break;
               /*headless browser runs in the background without actual browser on the screen*/
               case "chrome-headless":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                   break;

           }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){

        if(driver!=null){//if driver is pointing somewhere is beigng used

            driver.quit();//close the driver

            driver=null;// and make the driver null so that we can instantiate the driver again

        }

    }

}
