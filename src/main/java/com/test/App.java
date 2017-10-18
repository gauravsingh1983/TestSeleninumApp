package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int TABLE_LENGTH = 13;
    private static final int TABLE_COL = 2;
    
    public static void main( String[] args )
    {

        HtmlUnitDriver driver = new HtmlUnitDriver();

        String policy_num= "";//"AMHI11000234566";
        String URL = "https://kourierkonnect.com/aph/";
        driver.get(URL);
        driver.findElement(By.id("txtPlcy")).clear();
        driver.findElement(By.id("txtPlcy")).sendKeys(policy_num);
        driver.findElement(By.id("cmdGO")).click();
        
        

        System.out.println(driver.findElement(By.id("lblErr")).getText());
        
        Map<String, String> kourierMap = new LinkedHashMap<>();        
        
        String key = null;
        String value = null;
        
        for(int i=1; i < TABLE_LENGTH; i++)
        {
            key = driver.findElement(By.xpath("//table[@id='dgTrns']/tbody/tr["+i+"]/td[1]")).getText();
            value = driver.findElement(By.xpath("//table[@id='dgTrns']/tbody/tr["+i+"]/td[2]")).getText();
            if(!key.isEmpty())
            {
                kourierMap.put(key, value);
            }
            
        }
        
        JSONObject json = new JSONObject(kourierMap);
        System.out.println(json);
    }
}
