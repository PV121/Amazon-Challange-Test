package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class amazonTest extends Utility {
    String baseUrl= "https://www.amazon.co.uk/";

    @Before

    public void openBrowserAmazon(){
        openBrowser(baseUrl);
    }

    @Test
    public void amazonTest(){

        //   Button.

        // to click on accept button for cookies
        clickOnElement(By.xpath("//input[@id='sp-cc-accept']"));
        //Type "Dell Laptop" in the search box
        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"),"Dell Laptop");
        //and press enter or click on search
        clickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
        //Click on the checkbox brand dell on the left side.
        clickOnElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]"));

        //Verify that the  30(May be different) products are displayed on the page.
        List<WebElement> dell=driver.findElements(By.xpath("//div[@data-component-type=\"s-search-result\"]"));
        System.out.println(dell.size());

        //Print all product names in the console.
        List<WebElement> nameOfLaptop= driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));

        for (WebElement name :nameOfLaptop) {
            System.out.println(name.getText());
        }
    }
}
