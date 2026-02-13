1- Write the 2 test cases

CT01 - Login with success

Title: Login with sucess on web mobile application
Pre requisits: Use the browser mobile
Steps: 
- Access to url : https://the-internet.herokuapp.com/login
- Check the inputs username and password
- Check the text on header with Login 
- Check the description on page
- Filled the username credentials with "tomsmith"
- Filled the password credentials with "SuperSecretPassword!"
- Click on Login button

Expected results
User can login with success
Should shown the message with the text: "You loggeed in security area"
Should shon the button to loggout

CT02 - Login with unsuccess
Title: Login with unsucess on web mobile application
Pre requisits: Use the browser mobile
Steps:
- Access to url : https://the-internet.herokuapp.com/login
- Check the inputs username and password
- Check the text on header with Login
- Check the description on page
- Filled the username credentials with "tomsmith"
- Filled the password credentials with "WrongSuperSecretPassword!"
- Click on Login button

Expected results
User can't login with success
Should shown the message with the text: "Your password is invalid"
Should stay in the login page

Login with username wrong but password right
Should loggout with success
Try to close the message after login with success
Try to close the message after login wrong

-------------------------------------

Title: Button to close the message doesn't work

Severity: Low
Steps to reproduce: 
- Access to url : https://the-internet.herokuapp.com/login
- Check the inputs username and password
- Check the text on header with Login
- Check the description on page
- Filled the username credentials with "tomsmith"
- Filled the password credentials with "WrongSuperSecretPassword!"
- Click on Login button
- Click on the close button of the component to message with the text:"Your password is invalid"

Expected behavior: The component message should closet

Actual result: The click on close button didn't works and the component is shown
