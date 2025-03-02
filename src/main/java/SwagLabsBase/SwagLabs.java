package SwagLabsBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.PredefinedActions;

public class SwagLabs extends PredefinedActions {
	
	@BeforeMethod 
	public static void launchSwagLabs() {
		
		System.out.println("STEP: Launching Swag Labs");
		PredefinedActions.launchBrowser("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public static void closeSwagLabs() {
		System.out.println("STEP: Closing Swag Labs");
		PredefinedActions.closeBrowser();
	}

}
