package performers;

import browser.Browser;
import pages.Cart;
import pages.Checkout;
import pages.Home;
import pages.Login;

public class DryRun {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Browser.setDriver();
		Thread.sleep(4000);
		Browser.getUrl("http://demowebshop.tricentis.com");
		Thread.sleep(6000);
		Home.clickLogin();
		Thread.sleep(4000);
		Login.enterCredentials();
		Thread.sleep(4000);
		Login.clickLogin();
		Thread.sleep(4000);
		Home.laptopAddToCart();
		Thread.sleep(4000);
		Home.clickShoppingCart();
		Cart.termsAndServiceCheckbox();
		Thread.sleep(4000);
		Cart.checkoutButton();
		Thread.sleep(4000);
		Checkout.billingAddressContinueButton();
		Thread.sleep(4000);
		Checkout.shippingAddressContinueButton();
		Thread.sleep(4000);
		Checkout.shippingMethodContinueButton();
		Thread.sleep(4000);
		Checkout.paymentMethodContinueButton();
		Thread.sleep(4000);
		Checkout.paymentInformationContinueButton();
		Thread.sleep(4000);
		Checkout.confirmOrderContinueButton();

		
		
		
		
		
		
		
		

	}

}
