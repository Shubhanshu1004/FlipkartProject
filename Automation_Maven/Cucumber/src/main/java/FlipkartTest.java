import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

    WebDriver driver;

    @Given("User wants to login")
    public void userWantsToLogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

    }


}
