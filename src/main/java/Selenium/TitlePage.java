package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TitlePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println("The Title of the page is:"+driver.getTitle());

    }
}

