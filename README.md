# Selenium-TestNG-POM

A testing repository using Selenium and TestNG to automate an E-commerce website<a href="https://envothemes.com/envo-ecommerce/">Envo Ecommerce</a> and its suite of applications.

## How to run
1. First of all you need to have java installed in your pc.
2. Allure 7.3.3 need to be configured in system path
3. Clone the repo in your local directory.
4. Open terminal and go to porject location.
5. Run command `gradle clean test` to build the project.
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
