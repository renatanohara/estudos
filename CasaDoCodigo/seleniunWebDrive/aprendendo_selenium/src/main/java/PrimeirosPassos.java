import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {
	
	WebDriver driver; 
	
	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "/home/nohara/Dropbox/Murah/chromedriver/137/chromedriver-linux64/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com.br");
		driver.manage().window().maximize(); // maximiza a janela
	}
	
	@Test
	public void meuPrimeiroTest() {
		String titulo = driver.getTitle();
		System.out.println("Pega o tíulo da página: " + titulo);
		
		String curretURL = driver.getCurrentUrl();
		System.out.println("Pega a URL atual: " + curretURL);	
	}
	
	@After
	public void posCondicao()
	{
		driver.quit();
	}
	
	

}
