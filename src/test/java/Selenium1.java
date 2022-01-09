import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Selenium1 {
    WebDriver driver;

    @BeforeMethod
    void bm(){
        System.setProperty("webdriver.chrome.driver", "C://Program Files//ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial");
        driver.manage().window().maximize();
    }
    @Test
    void count_img() {

        List<WebElement> elements=driver.findElements(By.tagName("img"));
        System.out.println("Img Count is :"+elements.size());
    }
    @Test
    void count_hyperlink() {

        List<WebElement> elements=driver.findElements(By.tagName("a"));
        System.out.println("Hyper link Count is :"+elements.size());
    }
    @AfterMethod
    void am(){
        driver.close();
    }

}
