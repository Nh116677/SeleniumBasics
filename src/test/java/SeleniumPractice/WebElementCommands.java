package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands {
    public static void main(String[] args) {

        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to facebook.com
        driver.get("https:syntaxprojects.com/selenium_commands_selector.php");

        //Clear the text box and send some keys
        WebElement textbox = driver.findElement(By.xpath("//input[@id= 'textInput']"));
        textbox.clear();
        textbox.sendKeys("Hello World!!!!");

        //Find the radio button and check if it is selected or not

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='option1']"));
        boolean stateofR1 = radioButton1.isSelected();
        System.out.println("The state of radio button selection in " + stateofR1);
        radioButton1.click();
        stateofR1 = radioButton1.isSelected();
        System.out.println("The state of radio button selection is " + stateofR1);

    }
}
