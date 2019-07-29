Feature: Login into account

Scenario Outline: Login to the accout with correct credentials


Given User navigate to the  "<url>"   
And User enters the "<username>" username
And User enters the "<password>" password
Then User clicks on the login button 

Examples:
|url								|username	|password|	
|http://www.newtours.demoaut.com/	|mercury	|mercury	|