package com.app.myapplication.pages

class LoginPage {
    fun accessUrl(){
        // I don't remember exacly the function to open new browser, but we can add this step in base setup in other folder
        goto="https://the-internet.herokuapp.com/login"
    }

    fun fillUsernameInput(username: String){
        OnView(withId(R.id.usaname))
            .perform(replaceText(username), closeKeyboard())
    }

    fun fillPassowrdInput(username: String){
        OnView(withId(R.id.usaname))
            .perform(replaceText(username), closeKeyboard())
    }

    fun clickOnLoginButton(){
        OnView(withId(R.id.login_button))
            .perform(click())
    }

    fun assertSucessMessage(){
        OnView(withId(R.id.messageText))
            .check(matchers(withText("You loggeed in security area")))
            .check(matcher(isDiplay()))
    }

    fun assertWrongMessage(){
        OnView(withId(R.id.messageText))
            .check(matchers(withText("Your password is invalid")))
            .check(matcher(isDiplay()))
    }
}