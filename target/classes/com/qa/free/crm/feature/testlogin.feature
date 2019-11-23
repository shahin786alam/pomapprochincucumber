Feature: free crm application Test
 
Scenario: validate free crm home page 

Given user opens browser
Then user is on login page
Then user logs in to app
Then validate home page title
#Then validate logged in username
Then user close the browser