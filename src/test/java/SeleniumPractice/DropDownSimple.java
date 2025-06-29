package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownSimple {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Go to the browser
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php#");

        //click on the dropdown to display the options

        WebElement DD = driver.findElement(By.xpath("//div[@data-toggle=\"dropdown\"]"));
        DD.click();

        //Get all the options
        List<WebElement> Options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for (WebElement option : Options){
            String optionText = option.getText();
            if(optionText.equals("Kenya")){
                option.click();
            }
        }


    }
}
