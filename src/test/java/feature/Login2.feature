Feature: Login Functionality


@Reg
Scenario Outline:: Verify login functionality with valid credentials
Given Go to login page
When Fill valid user name "<userName>"
And Fill valid password "<password>"
Then Click on login button



Examples:
|userName|password|
|7465002896.R@gmail.com|Rashid@123|
|423wdsc.p@gmail.com|Rsjshf3423r|
