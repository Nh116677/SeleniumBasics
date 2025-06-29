package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownSelectTag {
    public static void main(String[] args) throws InterruptedException{
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();

        //Go to browser
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //Find the dropdown
        WebElement DD =  driver.findElement(By.xpath("//select[@id='select-demo']"));
        //As the dropdown has select tag so we can use select class from selenium
        //Declare the instance of the select class
        Select sel= new Select(DD);
        //select the option Sunday
        sel.selectByIndex(1);
        Thread.sleep(2000);
        //select option Wednesday
        sel.selectByValue("Wednesday");
        //Select by visible text Friday
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");

        //get all the option in the dropdown and print them in the console
        List<WebElement> allOption =sel.getOptions();
        for (WebElement option : allOption){
            System.out.println(option.getText());
        }


    }
}
