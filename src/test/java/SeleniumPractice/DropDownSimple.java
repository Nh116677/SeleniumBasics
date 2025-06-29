package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSimple {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Go to the browser
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php#");

        //click on the dropdown to display the options


    }
}
