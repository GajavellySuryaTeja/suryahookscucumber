package hookspractice2;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class Stepdefination {
	@Before(order = 1)
	public void application() {
	System.out.println("application starts");	
	}
	@Before
	public void openapplication() {
		System.out.println("application opened");
	}
		@Given("open url")
	public void open_url() {
	 System.out.println("browser opened successfully");   
	}
     @BeforeStep
     public void step1() {
    	 System.out.println("before step for every scenario");
     }
     @AfterStep
     public void step2() {
    	 System.out.println("after the step for every scenario");
     }
     @After(order = 1)
     public void closingapplication() {
    	 System.out.println("application closed successfully");
     }
     @After
     public void quit() {
    	 System.out.println("select to close the application");
     }
	@And("select login credentials")
	public void select_login_credentials() {
	    System.out.println("give credentials of username and password");
	}

	@Then("select login")
	public void select_login() {
	    System.out.println("click on login button");
	}

	@When("select logout")
	public void select_logout() {
	 System.out.println("click onm logout");
	}

	@And("close")
	public void close() {
	   System.out.println("close browser"); 
	}
}
