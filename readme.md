NCIProject2017 - An example on how to use the OWASP Dependency-Check Gradle Plugin to analyze your code base for vulnerabilities


Contents

This example contains the following

    a gradle multi-module project creating a JAR


Gradle and HTML Report

To execute the OWASP dependency check, just call

./gradlew build 

A report containing the scan results is generated to /build/reports/dependency-check-report.html
