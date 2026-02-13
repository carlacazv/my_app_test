package com.app.myapplication.test

import android.util.Log
import org.junit.Test

class LoginTest {

    private val loginScreen = LoginScreen()

    @Test
    fun whenUserLoginWithSuccessCredentials(){
        loginScreen
            .accessUrl()
            .fillUsernameInput(Credentials.VALID_USERNAME)
            .fillPassowrdInput(Credentials.VALID_PASSWORD)
            .clickOnLoginButton()
            .assertSucessMessage()
            .assertLoggoutButton
    }

    @Test
    fun whenUserLoginWithWrongCredentials(){
        loginScreen
            .accessUrl()
            .fillUsernameInput(Credentials.VALID_USERNAME)
            .fillPassowrdInput(Credentials.WRONG_PASSWORD)
            .clickOnLoginButton()
            .assertWrongMessage()
    }
}