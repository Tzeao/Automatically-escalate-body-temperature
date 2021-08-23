import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;

/**
 * @Author 君子慎独
 * @create 2021/8/20 0020 16:32
 */
public class a {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        String URL = "https://www.baidu.com";

        HashMap<String,String>  mobileEmulation = new HashMap<String,String>();
        mobileEmulation.put("deviceName","iPhone X");
        EdgeOptions options = new EdgeOptions();
         options.setCapability("mobileEmulation", mobileEmulation);
        //options.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new EdgeDriver(options);
        driver.get(URL);    //进入目的链接
    }
}
