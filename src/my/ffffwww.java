package my;

public class ffffwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\msedgedriver.exe");
//        
        // Initialize the FirefoxDriver
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");
	}

}
