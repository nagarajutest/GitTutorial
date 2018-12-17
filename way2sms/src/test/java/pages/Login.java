	package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Login
	{
		//Locators
		public WebDriver driver;
		public WebDriverWait wait;
		@FindBy(xpath="(//input[@name='mobileNo'])[1]")
		public WebElement mbno;
		@FindBy(xpath="(//input[@name='password'])[1]")
		public WebElement pwd;
		@FindBy(xpath="(//button[contains(text(),'Login')])[1]")
		public WebElement signin;
		@FindBy(xpath="//b[text()='Enter your mobile number']")
		public WebElement mbno_blank_err;
		@FindBy(xpath="(//b[text()='Enter password'])[1]")
		public WebElement pwd_blank_err;
		@FindBy(xpath="//b[text()='Enter valid mobile number']")
		public WebElement mbno_invalid;
		@FindBy(xpath="//b[text()='Incorrect number or password! Try Again.']")
		public WebElement pwd_invalid;
		@FindBy(xpath="//span[text()='Send SMS']")
		public WebElement all_valid;
		public Login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		//operations
		public void fillmbno(String x)
		{
			mbno.sendKeys(x);
		}
		public void fillpwd(String y)
		{
			pwd.sendKeys(y);
		}
		public void clickSignin()
		{
			signin.click();
		}
		
		
	}



