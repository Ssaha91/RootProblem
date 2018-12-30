import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLoginTest {

    @Test
    public void loginTest(){
        System.setProperty("webdriver.gecko.driver", "/Users/sukantasaha/Downloads/udemyseleniumjava-maven/geckodriver");

        WebDriver driver =  new ChromeDriver();

        driver.get("https://github.com/login");

    }
}
