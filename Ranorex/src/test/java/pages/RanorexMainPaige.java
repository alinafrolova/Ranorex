package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import templete.Temp;

/**
 * Created by User on 18.04.2015.
 */
public class RanorexMainPaige {
    private  WebDriver driver;
    String name = "test" + Temp.randomtxt(5);
    public RanorexMainPaige(WebDriver driver){this.driver = driver;}
    @FindBy(id = "searchInput")
    WebElement searchinput;
    @FindBy(id = "FirstName")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(id = "Add")
    WebElement add;
    @FindBy(xpath = "//tr[3]/td/input")
    WebElement male;
    @FindBy(id = "Gender")
    WebElement female;
    @FindBy(id = "Clear")
    WebElement clear;
    @FindBy(id = "Delete")
    WebElement delete;
    public  void open(){driver.get("http://www.ranorex.com/web-testing-examples/vip/");}

 //   public void search() {searchinput.submit();}
    public void fillField(){
        firstName.sendKeys(name);
        lastName.sendKeys(name);
    }
    public void addMan(){
        add.click();
    }
    public void chooseMale(){
        male.click();
    }
    public void chooseFemale(){
      male.click();
    }
    public void deleteMan(){
       delete.click();
    }
    public void clearDB(){
        clear.click();
    }
}
