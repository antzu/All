import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class MyFirstTest {
    @Test
    public void goToWebPage () {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        assertTrue(driver.getTitle().equals("The Internet"));

        driver.quit();
    }


}
