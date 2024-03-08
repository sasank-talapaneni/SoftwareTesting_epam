import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {
    public static void main(String[] args) {
         WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://lms.kluniversity.in/login/index.php");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.findElement(By.id("username")).sendKeys("2100030529");
        driver.findElement(By.id("password")).sendKeys("S@si20256");
        driver.findElement(By.id("password")).submit();
        System.out.println("Alert Message:");
        System.out.print(driver.findElement(By.className("alert")).getText());
    }
}
