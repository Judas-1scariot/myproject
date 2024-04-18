     import org.junit.Test;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;

     public class MyTest {
         @Test
         public void testGoogleSearch() {
             System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
             WebDriver driver = new ChromeDriver();
             driver.get("https://www.google.com");
             driver.quit();
         }
     }
