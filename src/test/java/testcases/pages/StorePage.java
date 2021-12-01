package testcases.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcases.utils.Driver;

public class StorePage {

    public StorePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(linkText = "Mağaza Yorumları")
    public WebElement commentButton;
    public void switchCommentSection(){
        commentButton.click();
    }

    @FindBy(className = "selectedReview")
    public WebElement reviewText;
    public void verifyStoreComment(){
        if(reviewText.isDisplayed()){
            String[] keywords = reviewText.getText().split(" ");
            System.out.println("Yapılan yorum sayısı => "+keywords[2]);
        }else{
            System.out.println("Yorum bulunamadı!");
        }
    }

}
