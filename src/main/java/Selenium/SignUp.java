package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Adithya");

        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("Srinivas");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("adithyasrinivas66@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("adithyasrinivas@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("@adithya233");

        Thread.sleep(2000);

        driver.findElement(By.id("day")).sendKeys("25");

        Thread.sleep(2000);

        driver.findElement(By.id("month")).sendKeys("Dec");

        Thread.sleep(2000);

        driver.findElement(By.id("year")).sendKeys("1998");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("websubmit")).click();

        driver.close();

    }

}
