<snippet>
  <content>
# LoggingApplication
A small piece of code using wildfly, maven, mongo(morphia), logback/log4j and JEE CDI framework. This demo does two things mainly:
- Writes a log into a file, depending on applicationName field (AppA and Appb are possible values).
- Writes into a local MongoDB instance (port 27017) inside users.userActivity collection, depending on web method used. It inserts a log search, log results selection and a log of checkout step.

## Installation
Run maven install of LoggingAppDemo of pom project. This task will deploy a WAR file into wildfly.

## Usage
Use any REST client and refer to restwsinputs.txt file for all posiible inputs of four web methods.
</content>
</snippet>
