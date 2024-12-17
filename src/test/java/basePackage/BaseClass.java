package basePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    protected WebDriver driver;

    
    public void initializeDriver() {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        
        driver.get("https://sephora.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    
    }


