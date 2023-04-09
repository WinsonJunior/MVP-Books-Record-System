# Introduction

This project is a part of the Toppan Fullstack Developer Assessment. The purpose of this guide is to help you set up the application on your local machine. In this guide, I will walk you through the steps required to set up the frontend and backend of the application.

Before going into the local development setup, there are several assumptions made when building the solution. Since no questions are allowed to be asked to clarify these assumptions, the next section will list some of the important assumptions and elaborate on why they are made.


# Setup

### Pre-Requisite

Before we begin, please ensure that you have the following software/packages installed on your machine:

- ReactJS (18.2.0)
- npm (8.14.0)
- Node (16.16.0)
- Java (17)
- Git (2.28.0)
- IntelliJ or other IDE

### Clone GitHub Repository

The first step is to clone the GitHub repository. To do this, navigate to the directory where you want the project to be cloned and run the following command:

```
cd my_directory
git clone https://github.com/WinsonJunior/MVP-Books-Record-System.git
```

### Setting up BackEnd in IntelliJ

The backend is built using Java and Spring Boot, and we will use IntelliJ to set it up. Here are the steps to follow:

Step 1. Open IntelliJ and navigate to `File > Open`.

Step 2. Choose the backend folder from the cloned repository and open it.

Step 3. Run the `pom.xml` file or `right click on pom.xml > Maven > Reload project`

Step 4. Run the backend by going to the `BackendApplication.java` file in `src/main/java/com/winsonjunior/mvpbooksrecord/BackendApplication.java` and running the file. You can do this by pressing the green play button in IntelliJ or right-clicking on the file and selecting `Run`. After the backend is started, you should see a message in the terminal similar to this:


```
2023-04-08 18:51:06.520  INFO 19088 --- [           main] c.e.b.BackendSpringApplication           : Started BackendSpringApplication in 4.424 seconds (JVM running for 5.168)
```

Optionally, if you want to insert custom data into the database, you can modify the data.sql file.

### Setup the Frontend
The frontend is built using ReactJS, and we will use npm to set it up. Here are the steps to follow:

1. Open a new terminal window and navigate to the `frontend/` directory of the cloned repository.
2. Run `npm install` to install the necessary packages. You may see some warnings about vulnerabilities, but you can ignore them for now.
3. Run `npm start` to start the application. This should automatically open your default browser and load the page `http://localhost:3000/`.
4. If everything was set up correctly, you should see the application running in your browser.


# Last Note

If you encounter any issues during the setup process, feel free to contact me using the contact details provided in my resume. Thank you for reading this guide, and I hope you find it helpful!
