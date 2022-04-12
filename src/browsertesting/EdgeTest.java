package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseURL="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");// setting edge driver
        WebDriver driver=new EdgeDriver();
        driver.get(baseURL);//launch URL
        driver.manage().window().maximize();// maximising the windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// wait
        String title=driver.getTitle();// storing the title
        System.out.println("Title of the page : "+title);// printing the title of the page
        String currentURL=driver.getCurrentUrl();// getting URL of the page
        System.out.println("Current URL of the page is : "+currentURL);// printing the URl of the page
        WebElement userNameField=driver.findElement(By.id("username"));// storing username field
        userNameField.sendKeys("Prime123@gmail;.com");// sending keys to username field
        WebElement passwordField=driver.findElement(By.id("password"));// storing password field
        passwordField.sendKeys("12345");// sending keys to password field
        driver.close();
    }
}
