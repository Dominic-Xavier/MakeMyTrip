Feature: Make my trip

Scenario: Checking with Flights
Given User opens "Chrome" browser and passURL "https://www.makemytrip.com/"
Given user clicks on login button
Then user enters EmailId
Then user enters username "Demo" and password "vzlys@1995" and clicks continue button
Given user is on Flights tab
Then user clicks on "roundTrip" tab
#departure date must be like Month in short form, date, year eg Nov 13 2020
Then user enters from "Mumbai" to "Dubai" departure date "Dec 10 2020" and return date "Dec 15 2020"
Then user enters enters number of tickets for adult "2" children "2" infants "2" and class "Business"
Then user clicks on search
#Then user books a flight




#Scenario: Checking with Hotels
#Given user is on Hotels tab
#Then user clicks on frontend Home page
#
#Scenario: Checking with Villas
#Given user is on Villas tab
#Then user clicks on frontend Home page
#
#Scenario: Checking with Holidays
#Given user is on Holidays tab
#Then user clicks on frontend Home page
#
#Scenario: Checking with Trains
#Given user is on Trains tab
#Then user clicks on frontend Home page
#
#Scenario: Checking with Buses
#Given user is on Buses tab
#Then user clicks on frontend Home page
#
#Scenario: Checking with Visa
#Given user is on Visa tab
#Then user clicks on frontend Home page
#
#Scenario: Checking with Cabs
#Given user is on Cabs tab
#Then user clicks on frontend Home page
#
#Scenario: Checking with Charters
#Given user is on Charters tab
#Then user clicks on frontend Home page