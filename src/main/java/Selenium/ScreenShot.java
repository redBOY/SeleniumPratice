package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
public class ScreenShot {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("9731760530");

        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Adithyasrinivas66@120");

        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;

        File sourcefile =takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile =new File(".\\Screenshot\\"+System.currentTimeMillis()+"_screenshot.png");

        try {
            FileHandler.copy(sourcefile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(2000);

        driver.close();

    }
}

