package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {


    public static void main(String[] args) {
        testcase1();

    }

    @Test
    public static void testcase1() {
        //check chromedriver version with your current browser version
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver-117.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getSessionId());
        driver.findElementById("email").sendKeys("standard_user");
        driver.findElementById("pass").sendKeys("secret_sauce");
        driver.quit();
    }
}

//execution delivers error=invalid session id, message=invalid session id}
//how to make it work without main() -> public static  testcase1