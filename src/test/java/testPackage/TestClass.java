package testPackage;

import basePackage.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pagePackage.PageClass;

public class TestClass extends BaseClass {
    
    PageClass select;
    
    @BeforeClass
    public void setup() {
        initializeDriver();  
        select = new PageClass(driver);  
    }

    @Test
    public void testSephoraAutomationFlow() throws InterruptedException {
        
    	
    	select.titleVerification();
    	Thread.sleep(2000);
    	
        select.mouseOverMakeup();
        Thread.sleep(2000); 

        
        select.clickOnBlush();
        Thread.sleep(2000);  

        
        select.selectSortByNewest();
        Thread.sleep(2000);  
        
        select.scrollDown();
        Thread.sleep(2000); 

        
        select.addToBag();
        Thread.sleep(2000);  
        
      
        select.searchForProduct("lipstick");
        Thread.sleep(2000); 
        
        select.windowHandlePgm();
        Thread.sleep(2000);
    }

    
}
