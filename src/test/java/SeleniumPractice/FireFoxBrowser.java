package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public static void main(String[] args) {

        //create an object of the webdriver interface
        WebDriver driver = new FirefoxDriver();

        //navigate the browser to syntax project website
        driver.get("https://facebook.com");

        //get the current url and print in on the console
        String url = driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println("the title of the webpage is:" + title);
        System.out.println("the url of the webpage is " + url);
        //close the browser
        driver.quit();

    }
}


