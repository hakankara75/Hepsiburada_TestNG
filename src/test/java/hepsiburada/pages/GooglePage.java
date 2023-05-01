package hepsiburada.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import hepsiburada.utilities.Driver;

public class GooglePage {
    public  GooglePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@name='q']")
    public WebElement aramaKutusu;
}