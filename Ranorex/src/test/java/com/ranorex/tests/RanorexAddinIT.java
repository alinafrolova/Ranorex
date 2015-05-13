package com.ranorex.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.RanorexMainPaige;

/**
 * Created by User on 18.04.2015.
 */
public class RanorexAddinIT {
    @BeforeClass
    public static void initPathes(){
       // System.setProperty("webdriver.ie.driver","F:\\Selenium\\java\\Ranorex-2015-04-18\\Ranorex\\drivers\\IEDriverServer.exe");
    }
    @Test
    public void userCanAddPersenToRanorexDataBase(){
      // WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
      //  WebDriver driver = BrowserFactory.createDriver();
       // WebDriver driver = new HtmlUnitDriver();
      //  WebDriver driver = new InternetExplorerDriver();

        RanorexMainPaige ranorexMainPaige = PageFactory.initElements(driver, RanorexMainPaige.class);
        ranorexMainPaige.open();
        ranorexMainPaige.fillField();
        ranorexMainPaige.addMan();
        ranorexMainPaige.fillField();
        ranorexMainPaige.chooseMale();
        ranorexMainPaige.addMan();
        ranorexMainPaige.deleteMan();

       // driver.quit();

    }
}
