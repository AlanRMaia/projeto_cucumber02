package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHelper {
	
	private static WebDriver driver;

	
	//método para abrir o navegador e acessar
	//uma 

public static WebDriver create(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alanr\\OneDrive\\Curso Teste COTI\\WorkrSpace\\chromedriver.exe");
		// abrindo o navegador e acessar a página de cadastro de usuários
		if (driver == null)
			driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window();
		
		return driver;
	}	

	
}
