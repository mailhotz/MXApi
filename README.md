**Setup**

This project was written with Maven 3.6.2

All code was tested and ran in Intellij and used Apache Tomcat 9.0.26 for local testing

Notes: The libraries that were used for this project are as follows: dnsjava, jersey and gson

**Api Documentation**

The api has two endpoints:
1) The default which is located at /MxApi will return the MX target names for 'oracle.com'
2) the second endpoint is located at /MxApi/{domain} where domain is any valid domain 

**Improvements**

There's test for the process of getting MX Records but there's no test for the API end points themselves. 
Given more time I would of tried to come up with a few integration tests to validate some of the API. 






