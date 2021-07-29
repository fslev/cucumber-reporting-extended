# Publish pretty [cucumber](https://cucumber.io/) reports

This is a Java report publisher primarily created to publish cucumber reports on the Jenkins build server.
It publishes pretty html reports with charts showing the results of cucumber runs. It has been split out into a standalone package so it can be used for Jenkins and maven command line as well as any other packaging that might be useful. Generated report has no dependency so can be viewed offline.

### This is a prettified version of [cucumber-reporting](https://github.com/damianszczepanik/cucumber-reporting)

## Install

Add a maven dependency to your pom
```xml
<dependency>
    <groupId>io.github.fslev</groupId>
    <artifactId>cucumber-reporting-extended</artifactId>
    <version>(check version above)</version>
</dependency>
```