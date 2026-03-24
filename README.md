# Sportradar Coding Assignment – Sport Events Management

This project is an implementation of the Sportradar backend assignment using **Spring Boot**, **MySQL**, **Hibernate/JPA**, **Thymeleaf** and **Bootstrap 5**.

The application allows you to manage sport events, display them on a  HTML page and add new events using a REST API.

---

##  Features

### ✔ Backend (Spring Boot 3.2)
- Add new sport events (REST API)
- Retrieve all events
- Automatic entity mapping using JPA/Hibernate
- DTO-based data transfer
- Proper handling of relationships (`@ManyToOne`, `@OneToMany`)
- MySQL database support

### ✔ Frontend (HTML + Thymeleaf + Bootstrap 5)
- Navigation bar (Bootstrap)
- Clean, modern UI

---

## 🛠 Technologies Used

| Layer | Technology                    |
|------|-------------------------------|
| Backend | Java 17, Spring Boot 4        |
| Persistence | Hibernate, JPA, MySQL 8       |
| View Layer | Thymeleaf, HTML5, Bootstrap 5 |
| Build | Maven                         |
| Other | Lombok                        |

---

## 📡 API Endpoints

### ➤ Get all events
`GET localhost:8080/v1/events`

### ➤ Add new event
`POST localhost:8080/api/v2/events`

Example body:

```json
{
	"eventStatus": "new",
    "eventTimeVenueUTC": "08:30",
	"eventDateVenue": "2025-12-03",
	"homeTeamId": 1,
    "awayTeamId": 2,
    "resultId": 2,
    "sportId": 1
}
```
▶ How to Run

1. Install Necessary Tools

Before you start, make sure you have the following tools installed:

Java Development Kit (JDK): Ensure that the JDK is installed (preferably version 17 or higher). Check the installation by running the following command in the terminal:

java -version

Maven: Make sure Maven is installed. Check the installation by running:

mvn -version

If anything is not installed, follow the installation instructions for your operating system.

2. Run the Database Container
   Execute the following command in your terminal to pull and start the database:
   
````
   docker run -d \
   --name spring-boot-mysql \
   -p 5432:3306 \
   -e MYSQL_ROOT_PASSWORD=root \
   -e MYSQL_DATABASE=CopySpringDB \
   bogdanmikhalkiv/spring-mysql-with-data:v1
   
   ````


3. Open the Terminal

On Windows, open cmd or PowerShell.
On Linux or macOS, open the Terminal.
4. Navigate to Your Project Directory

Use the cd command to navigate to the folder where your project is located, which contains the pom.xml file. For example:
cd /path/to/your/project
5. Run the Application

Now you can run your application with the following command:

mvn spring-boot:run

This command will compile the project and start your application.

6. Open the Browser and Check

After the application starts successfully, open your browser and navigate to:

http://localhost:8080/v1/events

If your application is set up correctly, you should see your application’s interface or the corresponding result.

7. Stopping the Application
   To stop the application, return to the terminal where it is running and press Ctrl + C. This will terminate the application.


You can also open a project using the IDE(IntelliJ IDEA). Then you need to follow the following path to launch the application ergoTask/src/main/java/com/example/ergotask/ErgoTaskApplication.java . In this class, click on the green triangle that is parallel to the 7th or 9th line of code to launch the program. And then you need to go to the browser and write in the search bar: http://localhost:8080 . And that's it. 
