import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jcanepa/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Jeff");
        driver.findElement(By.id("last-name")).sendKeys("Canepa");
        driver.findElement(By.id("job-title")).sendKeys("Software Quality Engineer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("10/02/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
