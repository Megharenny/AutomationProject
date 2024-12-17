package pagePackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class PageClass {
    WebDriver driver;

    
    public PageClass(WebDriver driver) {
        this.driver = driver;
    }
     public void titleVerification() {
    	String expectedTitle="Sephora India";
 		String actualTitle=driver.getTitle();
 		Assert.assertEquals(expectedTitle, actualTitle);
 		System.out.println("Title matches");
     }
    
    public void mouseOverMakeup() {
        WebElement makeupCategory = driver.findElement(By.xpath("//*[@id=\"l1-2\"]/a/div[1]/h5"));
        Actions actions = new Actions(driver);
        actions.moveToElement(makeupCategory).perform();
    }

   
    public void clickOnBlush() {
        WebElement blushOption = driver.findElement(By.xpath("//*[@id=\"l3-2-1-2\"]/h6"));
        blushOption.click();
    }

    public void selectSortByNewest() {
        WebElement sortDropdown = driver.findElement(By.xpath("//*[@id=\"product-sort\"]/div"));
        sortDropdown.click(); 
        WebElement newestOption = driver.findElement(By.xpath("//*[@id=\"sortopt\"]/li[2]/span"));
        newestOption.click();  
       
    }
    
    public void scrollDown() {
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        WebElement firstProduct = driver.findElement(By.xpath("//*[@id=\"product-0\"]/div/div/div[2]/div[1]/picture/img"));
        firstProduct.click();
    }


    
    public void addToBag() {
        WebElement addToBagButton = driver.findElement(By.xpath("//*[@id=\"pdp-info\"]/div/div[6]/div[2]/button"));
        addToBagButton.click();
    }
    
    
    public void searchForProduct(String productName) {
        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"search\"]"));
        searchBar.sendKeys("lipstick");
        searchBar.sendKeys(Keys.ENTER);
    }
    
    public void windowHandlePgm() {
    	String parentWindow=driver.getWindowHandle();
    	Set<String> allWindows=driver.getWindowHandles();
    	for(String handle :allWindows) {
    		if(!handle.equalsIgnoreCase(parentWindow)) {
    			driver.switchTo().window(parentWindow);
    			
    		}
    		
    	}
    }}