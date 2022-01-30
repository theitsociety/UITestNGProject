package test;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class TC08_VerifyAllProductsAndProductDetailPage_Bilal {

    @Test
    public void VerifyAllProducts(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
