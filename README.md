# 🧪 PetStore API Automation Framework

This project is an **API Automation Framework** designed for the [Swagger PetStore API]((https://petstore.swagger.io/)) using **Java**, **Rest Assured**, and **TestNG**. It supports **BDD-style testing**, integration with **CI/CD pipelines**, and is designed with extensibility and modularity in mind.

---

## 📂 Project Structure

```
PetStoreAPIAutomation/
├── src/test/java/
│   ├── api.endpoints/
│   │   ├── Routes.java
│   │   ├── UserEndPoints.java
│   │   └── UserEndPointsProperties.java
│   ├── api.payload/
│   │   └── User.java
│   ├── api.test/
│   │   ├── DataDrivenUserTest.java
│   │   ├── userTest.java
│   │   └── userTestUsingPropertiesfile.java
│   └── api.utilities/
│       ├── DataProviders
│       ├── ExtentReportManager
│       └── XLUtility
│
├── src/test/resources/
│   ├── log4j2.xml
│   └── routes.properties
│
├── testData/
│   └── Userdata.xlsx
│
├── test-output/
├── Logs/
│   └── automation.log
├── Reports/
├── pom.xml
├── testng.xml
```

---

## 🧰 Tech Stack

* **Language**: Java 8+
* **API Testing**: Rest Assured
* **Test Framework**: TestNG
* **Design Pattern**: BDD + Modular + Page Object Model
* **Data Driven Testing**: Apache POI + Excel
* **Logging**: Log4j2
* **Build Tool**: Maven
* **CI/CD Integration**: Jenkins
* **Version Control**: Git & GitHub
* **API Specification**: Swagger

---

## 🚀 How to Run

### 1. Prerequisites

* Java JDK 1.8+
* Maven
* TestNG plugin (in Eclipse/IntelliJ)
* Git (for cloning repo)

### 2. Clone the Repository

```bash
git clone https://github.com/ni3patil2601/PetStoreAPIAutomation.git
cd PetStoreAPIAutomation
```

### 3. Run via TestNG XML

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

### 4. Run via IDE

* Right-click on `testng.xml` → Run As → TestNG Suite
* Or right-click any class in `api.test` package and run it

---

## 🥺 Test Scenarios

* ✅ **Create User** – POST Request validation
* ✅ **Read User** – GET request using username
* ✅ **Update User** – PUT request to modify user details
* ✅ **Delete User** – DELETE request to remove user
* ✅ **Data-Driven Tests** – Read user data from Excel (Userdata.xlsx)
* ✅ **Properties-Based Testing** – Dynamic routing via `routes.properties`

---

## 📊 Reports & Logs

* **Reports**: Generated inside `/Reports/`
* **Logs**: Stored in `/Logs/automation.log`
* **Console Output**: Shows request/response logs via Rest Assured

---

## 🔧 CI/CD Integration

Ready for Jenkins integration.

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

Add the above command in Jenkins Pipeline Script or Freestyle Project build step.

---

## 🛠️ Future Improvements

* 🔄 Retry logic for flaky tests
* 📤 Email reports post-execution
* 💬 Slack integration for results
* 📦 Dockerization for environment isolation
* ⏱️ Parallel test execution using TestNG or Maven Surefire plugin

---

## 👨‍💼 Author

**Nitin Patil**
[GitHub](https://github.com/ni3patil2601) | [LinkedIn](https://www.linkedin.com/in/nitinpatilsdet/) | 📧 [Gmail](mailto:ni3patil2601@gmail.com)


---

## 🌏 Sample Project Structure

![Project Structure Screenshot](./path-to-your-image.png)

> Replace `./path-to-your-image.png` with the actual path to the image inside your repository (e.g., `/assets/structure.png` or `/docs/screenshot.png`).
