
package my;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class myh {

	public static void main(String[] args) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\msedgedriver.exe");
//        
        // Initialize the FirefoxDriver
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");

	}

}
