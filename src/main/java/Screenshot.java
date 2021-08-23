import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void setScreenshot(WebDriver driver, WebElement img) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        BufferedImage fullImg = ImageIO.read(screenshot);
//        根据img的位置进行定位
        Point point = img.getLocation();

        // 获取图片元素的大小
        int eleWidth = img.getSize().getWidth();
        int eleHeight = img.getSize().getHeight();
        // 设置图片要截取的位置和大小
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX() + 90, point.getY() + 120, eleWidth + 80, eleHeight + 40);
//        图片的后缀
        ImageIO.write(eleScreenshot, "png", screenshot);
        // 图片存储的位置和图片每一次都是覆盖上一次的图片
        File screenshotLocation = new File("d:/test.png");
        FileUtils.copyFile(screenshot, screenshotLocation);
    }

}
