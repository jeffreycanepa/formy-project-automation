import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jcanepa/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement radioButton1 = driver.findElement(By.id("checkbox-1"));
        radioButton1.click();
        Thread.sleep(2000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        radioButton2.click();
        Thread.sleep(2000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        radioButton3.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
