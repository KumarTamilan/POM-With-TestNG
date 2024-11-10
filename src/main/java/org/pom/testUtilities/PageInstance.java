package org.pom.testUtilities;

import org.pom.pageObjects.BecomeAResellerModule;
import org.pom.pageObjects.BuyNowModule;
import org.pom.pageObjects.CreateNewAccountModule;
import org.pom.pageObjects.PolicyModule;
import org.pom.pageObjects.PrivacyModule;
import org.pom.pageObjects.RediffMailModule;
import org.pom.pageObjects.SignInModule;
import org.pom.pageObjects.UserPanelModule;
import org.pom.pageObjects.UserServiceModule;
import org.pom.pageObjects.AdvertiseModule;

public class PageInstance {
	public RediffMailModule getRediffMailModule() {
		return new RediffMailModule();
	}
	public CreateNewAccountModule getCreateNewAccountModule() {
		return new CreateNewAccountModule();
	}
	public PolicyModule getPolicyModule() {
		return new PolicyModule();
	}
	public AdvertiseModule getAdvertiseModule() {
		return new AdvertiseModule();
	}
	public PrivacyModule getPrivacyModule() {
		return new PrivacyModule();
	}
	public BecomeAResellerModule getBecomeAResellerModule() {
		return new BecomeAResellerModule();
	}
	public BuyNowModule getBuyNowModule() {
		return new BuyNowModule();
	}
	public SignInModule getSignInModule() {
		return new SignInModule();
	}
	public UserPanelModule getUserPanelModule() {
		return new UserPanelModule();
	}
	public UserServiceModule getUserServiceModule() {
		return new UserServiceModule();
	}
}




	










