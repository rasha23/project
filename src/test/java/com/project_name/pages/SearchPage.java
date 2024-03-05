package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  SearchPage   {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy()
    public WebElement searchBox;



}
