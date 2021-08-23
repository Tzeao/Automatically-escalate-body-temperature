import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.List;

/**
 * @author 童泽沼
 * @version 1.0
 * @description 启动Edge浏览器示例代码
 */
public class TestEdgeBrower {
    @Test
    public void testEdge() throws IOException {
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().setSize(new Dimension(200, 1000));
        driver.get("http://service-hall-h5.ehall.gupt.edu.cn/login");

//        input
        List<WebElement> elements = driver.findElements(By.cssSelector(".van-field__control"));
//        登录按钮
        WebElement button = driver.findElement(By.cssSelector(".submit.van-button.van-button--info.van-button--small"));
//      验证码
        WebElement element = driver.findElement(By.cssSelector(".code"));
        WebElement img = element.findElement(By.tagName("img"));

////  得到截图
//        Screenshot.setScreenshot(driver, img);
//
////        得到截图的编码
//        String captchaData = IdentifyAndConversion.getImageStr("d:/test.png");
//        // post图片数据，账号信息，进行打码
//        String returnStr = IdentifyAndConversion.sendPost(
//                "http://www.bingtop.com/ocr/upload/",
//                "username=Tzeao&password=Tzeao258012.&captchaType=1000&captchaData=" + captchaData, "UTF-8"
//        );
////        将结果转为java对象
//        Object o = JSON.parseObject(returnStr).get("data");
////        二次转换得到结果
//        String string = JSON.toJSONString(o);
//        Object code = JSON.parseObject(string).get("recognition");
//
////        填写信息
//        elements.get(0).sendKeys("201505238");
//        elements.get(1).sendKeys("jhwsxjhwsx5@");
//        elements.get(2).sendKeys(code.toString());

        WebElement element1 = driver.findElement(By.cssSelector(".van-checkbox"));
        WebElement div = element1.findElement(By.tagName("div"));
        div.click();
////        触发登录
//        button.click();
//        driver.findElement(By.cssSelector(".iconfont.icon.icon-appstore-fill")).click();
    }
}