# test upload
Feature: Open home page and upload file
Background: Flow till signup page
Given open home page "<browser>"
| chrome |
When enter url of signup "<url>"
| http://qa.cockpit.pylot.de/ |
Then signup page open up

Scenario: Signup with valid details
Given click on signup button
When enter valid details submit
| test | fineleap | testfineleap40@yopmail.com | Password@123 |
Then welcome page open up

Scenario: Signup with invalid email
Given click on signup button
When enter invalid email
| test | fineleap | testfineleap@yop | Password@123 |
Then button disabled

Scenario: Signup with invalid name
Given click on signup button
When enter invalid first name
| t | fineleap | testfineleap@yopmail.com | Password@123 |
Then button disabled

Scenario: Signup with invalid emailid
Given click on signup button
When enter invalid last name
| test | f | testfineleap@yopmail.com | Password@123 |
Then button disabled

Scenario: Signup with invalid emailid
Given click on signup button
When enter invalid password
| test | fineleap | testfineleap@yopmail.com | Passwo |
Then button disabled

Scenario: Signup with checkbox not checked
Given click on signup button
When enter valid details but checkbox not checked
| test | fineleap | testfineleap11@yopmail.com | Password@123 |
Then button disabled

Scenario: Signup with existing emailid
Given click on signup button
When enter valid details submit
| test | fineleap | testfineleap14@yopmail.com | Password@123 |
Then error message displayed

Scenario: SignIn with valid details
Given click on SignIn button
When enter credentials
| testfineleap20@yopmail.com | Password@123 |
Then Welcome page open up

Scenario: SignIn with invalid details
Given click on SignIn button
When enter credentials
| testfineleap20@yopmail.com | Password@187 |
Then error invalid credentials








