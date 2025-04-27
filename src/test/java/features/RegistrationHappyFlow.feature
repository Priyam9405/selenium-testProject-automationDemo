Feature: Automation Demo Site Register

Scenario Outline: Register on Automation Demo site

Given User is on the Automation Demo site URL
When User enetrs all the informations "<FirstName>""<LastName>""<Address>""<mail>""<tel>""<Gender>""<Hobby>""<Language>""<Skill>""<Country>""<DOB>""<Password>"
And clicks on Submit button
Then User will get successfully registered

Examples:
|FirstName||LastName||Address||mail||tel||Gender||Hobby||Language||Skill||Country||DOB||Password|

|David||Lewis||Test Address1||david@gmail.com||9876767675||Male||Cricket||Hindi||Java||India||July 4,1994||TestPsw@1|
|Sarah||Smith||Test Address2||sarah@gmail.com||9876763443||FeMale||Movies||English||HTML||Netherlands||September 19,1998||TestPsw@2|

