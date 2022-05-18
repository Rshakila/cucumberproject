Feature: validation of AdactinHotel Web application

Scenario Outline: TC01_Validation of order ID adactin webapplication
Given User Launch Adactin Web Application
When User enter valid "<username>" and "<password>"
And  User click login button
Then user verify Home page Displayed
When User Select "<Location>","<Hotel>","<Roomtype>","<Number of Rooms>","<Check in Date>"
When User select "<Check out Date>","<Adults>","<Children>"
And  User click search button
Then verify and select Home page Displayed
When User click  Radiobutton and click continue
Then User verify hotel page is displayed
When User enter "<firstname>","<lastname>","<billing Address>"
When User enter Valid "<Creditcard No>","<card Type>","<expirymonth>","<expiry year>","<CVV>"
And click Book Now button
Then user Verify Order Id

Examples:
|username|password|Location|Hotel|Roomtype|Number of Rooms|Check in Date|Check out Date|Adults|Children|firstname|lastname|billing Address|Creditcard No|card Type|expirymonth|expiry year|CVV|
|shakila555|ramapriya|ooty|gusjh|ac|2|25.5.22|27.22|3|4|rama|Rajendran|moovalur|754387687582895|MASTRO|9|2022|8765|
|shakila555|ramapriya|Gujarat|gusjh|ac|2|4.5.22|2.5.22|3|4|Deepa|Prabhu|manakudi|754387687582895|VISA|4|2021|765|
|shakila555|ramapriya|munnar|gusjh|delaux|2|5.6.22|24.6.22|3|4|faisal|Basheer|Avoor|754387687582895|MASTRO|3|2022|876|
|shakila555|ramapriya|UAE|gusjh|delaux|2|11.5.22|7.5.22|3|4|Saki|Rajendran|moovalur|754387687582895|VISA|7|2020|3456|





