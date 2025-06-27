package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {
        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //go to https://syntaxprojects.com/advanceXpath.php
        driver.get("https://syntaxprojects.com/advanceXpath.php");

        //Find input2
        WebElement input2 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        input2.sendKeys("Harry Potter");

        //Find the input textbox
        WebElement  textbox2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        textbox2.sendKeys("Lord of the Ring");

        //Find textbox3
        WebElement textbox3 =driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
       textbox3.sendKeys("ABCDEFG");

    }
}
