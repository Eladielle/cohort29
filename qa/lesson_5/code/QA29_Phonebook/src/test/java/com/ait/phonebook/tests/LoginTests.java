package com.ait.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    //precondition: User should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {
        clickOnLoginLink();

        fillLoginRegisterForm("manuel@gm.com", "Manuel1234$");

        clickOnLoginButton();
        //assert: User logged in
        Assert.assertTrue(isSignOutButtonPresent());
    }

}