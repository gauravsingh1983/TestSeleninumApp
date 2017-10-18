 package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumTest
{

     public static void main( String[] args )
     {

         // Declaring and initializing the HtmlUnitWebDriver
         HtmlUnitDriver driver = new HtmlUnitDriver();

         String URL = "https://about.me/gaurav.singh";
         driver.get(URL);       
         
         WebElement e = driver.findElement(By.className("name-headline"));
         
         System.out.println(e.getText());
         
         //JSONObject json = new JSONObject(kourierMap);
         //System.out.println(json);
     }

}
