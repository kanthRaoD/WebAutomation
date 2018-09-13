Feature: Check functionality on amazon website				
Scenario Outline: Verification of amazon website with  credential
Given Open the Chrome and launch the application				
When I add electronics items to cart
When I enter Username as "<username>" and Password as "<password>"
Then Close the Browser					
Examples:                      		
|username       |password                |		
|8147319667   |yyyyy       |	


