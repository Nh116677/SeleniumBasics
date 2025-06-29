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
        System.out.println("The state of radio button selection is " + stateofR1);
        radioButton1.click();
        stateofR1 = radioButton1.isSelected();
        System.out.println("The state of radio button selection is " + stateofR1);

        //check if radiobutton 2 is disableed
        WebElement radioButton2 = driver.findElement(By.xpath("//input[@value='option2']"));
        Boolean stateofR2 = radioButton2.isEnabled();
        System.out.println("The radio button is enabled: " + stateofR2);

        //Check weather the radio button 3 is display or not
        WebElement radioButton3 = driver.findElement(By.xpath("//input[@value='option3']"));
        boolean displayedstateofR3 = radioButton3.isDisplayed();
        if (displayedstateofR3) {
            System.out.println("The radio button is displayed");
        } else {
            System.out.println("Radio button 3 is not displayed");
        }
        //Click on the toggle visibility button to display the radio button3
        WebElement radioButtonVisibilityToggle = driver.findElement(By.xpath("//button[text()='Toggle Visibility of Option 3']"));
        radioButtonVisibilityToggle.click();
        displayedstateofR3 = radioButton3.isDisplayed();
        System.out.println("The radio button 3 is displayed: " + displayedstateofR3);

        //Check if the text is present in the WebElement and print it in the console
        WebElement textElement = driver.findElement(By.xpath("//div[@id='textElement']"));
        String text = textElement.getText();
        System.out.println("The text in the WebElement is: " + text ) ;

        //get the value of the attribute data of the element
        WebElement attributeElement = driver.findElement(By.xpath("//div[@id='attributeElement']"));
        String attributeValue =  attributeElement.getAttribute("data-custom-attribute");
        System.out.println("The Value of the data attribute is: "  + attributeValue);



    }
}
