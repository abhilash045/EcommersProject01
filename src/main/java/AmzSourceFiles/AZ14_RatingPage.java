package AmzSourceFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ14_RatingPage {

	@FindBy(xpath = "//a[@id='nav-orders']")
	WebElement Oders;
	
	@FindBy (xpath ="(//a[@id='Leave-seller-feedback_2'])[1]")
	WebElement review ;
	
	@FindBy (xpath ="(//label[@name='star5'])[1]")
	WebElement rating;
	
	@FindBy (xpath = "(//input[@name='ItemAsDescribed'])[1]")
	WebElement radiobutton;
	
	@FindBy(xpath ="(//textarea[@name='feedback-text'])[1]")
	WebElement FeedBack;
	
	@FindBy(xpath ="(//button[@name='submitFeedback'])[1]")
	WebElement Submit;

	public void Oders() {
		Oders.click();
	}
	
	public void review() {
		review.click();
	}
	
	public void rating ()
	{
		rating.click();
	}
	
	public void radiobutton ()
	{
		radiobutton.click();
	}
	
	public void FeedBack(String Name)
	{
		FeedBack.sendKeys( Name);
	}
	
	
	public void submitButton ()
	{
		Submit.click();
	}
	

	public AZ14_RatingPage(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
