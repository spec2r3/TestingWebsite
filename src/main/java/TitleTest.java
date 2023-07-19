import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest{
	
	
	@Test(priority=2,groups="smoke")
	public void hometitletest(){
		
		String WebTitle = "ParaBank | Welcome | Online Banking";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        String Title = driver.getTitle();
        Assert.assertEquals(Title, WebTitle);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void abouttitletest(){
		
		String WebTitle = "ParaBank | About Us";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/about.htm");
        String Title = driver.getTitle();
        Assert.assertEquals(Title, WebTitle);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void servicestitletest(){
		
		String WebTitle = "ParaBank | Services";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/services.htm");
        String Title = driver.getTitle();
        Assert.assertEquals(Title, WebTitle);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void admintitletest(){
		
		String WebTitle = "ParaBank | Administration";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        String Title = driver.getTitle();
        Assert.assertEquals(Title, WebTitle);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void contacttitletest(){
		
		String WebTitle = "ParaBank | Customer Care";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/contact.htm");
        String Title = driver.getTitle();
        Assert.assertEquals(Title, WebTitle);
        driver.quit();
        
}

	@Test(priority=2,groups="smoke")
	public void sitetitletest(){
		
		String WebTitle = "ParaBank | Site Map";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/sitemap.htm");
        String Title = driver.getTitle();
        Assert.assertEquals(Title, WebTitle);
        driver.quit();
        
}
}