# Selenium-TestNG-POM

A testing repository using Selenium and TestNG to automate an e-commerce website<a href="https://envothemes.com/envo-ecommerce/"> Envo Ecommerce</a> and its suite of applications.


1. [Technology](#technology)
2. [Prerequisites](#prerequisites)
3. [How to run this project](#How-to-run-this-project)
4. [Reports View](#Reports-View)


### Technology:
- Tool: selenium
- IDE: IntelIJ
- Build tool: Gradle
- Language: Java
- Framework: TestNG

### Prerequisites
* Install jdk 8 or any LTS version
* Configure **JAVA_HOME** and **GRADLE_HOME**
* Download Allure latest version and configure system environment path
* Stable internet connection

### How to run this project
* Clone the repo in your local directory
* Open terminal to the project folder
* Run command `gradle clean test` to build the project
```
gradle clean test
```
6. Run command `allure generate allure-results --clean -o allure-report` to generate allure report.
```
allure generate allure-results --clean -o allure-report
```
7. Run command `allure serve allure-results` to generate html report and automatically open it in a web browser.
```
allure serve allure-results
```

### Reports View
These are the screenshots of **Allure** reports:

![image](https://user-images.githubusercontent.com/36601919/156862330-f6e2516b-6288-4d10-a0eb-600229a9aeb7.png)

![image](https://user-images.githubusercontent.com/36601919/156862427-b7337cf8-8ce0-41f4-8449-b0f47283a1d0.png)
