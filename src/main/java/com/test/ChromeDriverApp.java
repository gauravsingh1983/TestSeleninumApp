package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverApp
{
    
    public static void main(
        String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C://Gaurav//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL = "https://about.me/gaurav.singh";
        driver.get(URL);
        
        WebElement e = driver.findElement(By.className("name-headline"));
        
        System.out.println(e.getText());
        
    }
}
