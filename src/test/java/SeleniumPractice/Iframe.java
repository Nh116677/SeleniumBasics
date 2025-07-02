package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Go to the browser
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        //switch focus to the iframe
        driver.switchTo().frame(0);


        //Send the topic in the textbox
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("Hello Syntax");

        driver.switchTo().defaultContent();

        //Switch the focus of driver to iframe 2 having dropdown
        driver.switchTo().frame("dropdownIframe");

        //Find dropdown
        WebElement animalsDD = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(animalsDD);
        //Select the option
        sel.selectByVisibleText("Big Baby Cat");
        //Switch to main page
        driver.switchTo().defaultContent();
        //Switch to focus to the first iframe
        driver.switchTo().frame(0);
        //Find the nested iframe as WebElement
        WebElement nestedIframe = driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        //Switch the focus tot he nested iframe
        driver.switchTo().frame(nestedIframe);
        //Find the checkbox ans click on it
        WebElement cb1 = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        cb1.click();









    }
}
