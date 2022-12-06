# SWE6623-HotelApplication
Hardware Requirements for Hotel Reservation Application:
•	RAM: Minimum 1GB or higher
•	HDD: Minimum 50GB or higher
•	Processor: Intel i5 or higher or AMD

Software Requirements include:
•	Operating System: Windows, MAC, or any system which supports a web browser
•	Web Browser:     
•	Data Base: MySQL
•	Development: Spring STS (Back end), visual studio (Front End), MySQL Workbench(Data Base)
•	Server: Tomcat

The following are the internal interfaces that will be used as a part of the hotel reservation system:
•	Login API – which allows the users to login
•	Home API- Home page of the application where a list of hotels is displayed
•	Booking API-where the user can select a particular hotel and room and see details
•	Payment API-where the user can make payment for the hotel
•	Orders API-list all the bookings of the customer

Download all the code to your local

In visual studio tool open hotel-frontend folder

In Spring STS open the hotel-backend folder

Front end to back end connection- Mention the address and port of backend server in the files booking.service.ts and customer-registration.service.ts

Back end to DB connection- Open the application.properties file and mention your values for the data base as shown below
                            spring.datasource.url = jdbc:mysql://127.0.0.1:3306/hotelreservation
                            spring.datasource.username = root
                            spring.datasource.password = root

For the front end, Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

Run the SpringBoot Application on tomcat server  `http://localhost:8080/`

Run the DB on the address http://127.0.0.1:3306/
                            
After this step values directly get stored into the DB, Here I have used MYSQL workbench for creating DB.

The application will be up and running

Below is the architecture diagram

![image](https://user-images.githubusercontent.com/71249872/205821977-0ea14670-8fce-449b-899e-522f1c93d158.png)



