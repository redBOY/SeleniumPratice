package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#email.inputtext._55r1")).sendKeys("9731760530");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("AdityaSrinivas@120");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

        driver.switchTo().alert();


    }

}
