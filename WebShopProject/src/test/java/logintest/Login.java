package logintest;

import org.testng.annotations.Test;

import action.AddBookCartAction;
import action.AddComputerCartAction;
import action.LoginAction;
import base.BaseTest;

public class Login extends BaseTest {

	LoginAction action = new LoginAction(); // instance for action
	AddBookCartAction cart = new AddBookCartAction();
	AddComputerCartAction cart1 = new AddComputerCartAction();

	@Test(priority = 1)
	public void VerifyLogin() {

		action.login("Jerry1489@gmail.com", "Jerry@1997");
		System.out.println("1");
	}

	@Test(priority = 2)
	public void VerifyAddBookCart() {

		Integer value = 3;
		cart.AddBook(value);
		System.out.println("2");
	}

	@Test(priority = 3)
	public void VerifyComputerCart() {

		Integer value1 = 3;
		cart1.VerifyComputer(value1);
		System.out.println("3");
		
	}

	@Test(priority = 4)
	public void VerifyLogout() {

		action.logout();
		System.out.println("4");

	}

}
