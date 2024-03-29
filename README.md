# RandomQuoteApp

## Description
RandomQuoteApp is a microservices app retrieves and displays random quotes using a free quote API (https://forismatic.com/en/api/).
<img width="799" alt="Screenshot 2024-03-29 at 5 54 24 PM" src="https://github.com/Neure6676/RandomQuote/assets/72249816/9abcdf95-8b4c-4477-b19d-79f87ef7d799">

### Backend: Java Spring Boot 3
Fetch a random quote using the API's functionalities. Users click the botton "Get Quote" for a random quote 

Microservices design:
I developed 3 microservices:
1. RandomQuote service: 
 port 8080
 description: firstly call GetKey service for a random key. Then made the http call for random quote 

2. GetKey service: 
 port 8081
 description: get a random key (from 100000 to 999999) and return to RandomQuote service

### Frontend: React + Chakra UI
Display the retrieved quote and its author

## Demo
<img width="835" alt="Screenshot 2024-03-29 at 5 56 08 PM" src="https://github.com/Neure6676/RandomQuote/assets/72249816/ef55648b-2670-407f-812c-106d45d51b3a">






getKey api call

<img width="843" alt="Screenshot 2024-03-29 at 6 01 10 PM" src="https://github.com/Neure6676/RandomQuote/assets/72249816/06a86348-6869-4daf-85f6-762cb7387906">

integration api call

<img width="849" alt="Screenshot 2024-03-29 at 6 02 04 PM" src="https://github.com/Neure6676/RandomQuote/assets/72249816/cc322ccc-4430-4e15-8571-43a388cb1e44">





