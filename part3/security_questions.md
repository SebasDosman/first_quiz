# Security Questions

## Factors to consider

- Broken Access Control
- Cryptographic Failures 
- SQL Injections 
- Insecure Design
- Vulnerable and Outdated Components
- Identification and Authentication Failures 
- Software and Data Integrate Failures 
- Server Side Request Forgery 
- Security Logging and Monitoring Failures


## To make a secure system 

Initially, in this specific problem it would be very efficient to reduce the number of engineers that have full access to the system, since I consider that 12 is too many people, so I would reduce these people to a maximum of 3 and re-distribute the remaining ones in different groups that would be in charge of a specific task. 
Before any implementation it is important to shape an architecture adapted to the needs, modeling the problem is a fundamental part of the development of the application in order to take into account the different factors that must intervene in the application.
For the system to be secure, I would take into account what is proposed in the problem, servers on AWS or Google Cloud for the deployment of the application, relying fully on the security and stability of the cloud servers of these companies.
On the other hand, we have an application that handles sensitive data, such as passwords for example, so it is important to have an encryption or encryption of the same as well as manage an authentication through JWT or OAuth, always looking for the standards for authentications.
It is also important to work with an ORM in the back-end that allows neutralizing SQL injections attacks and facilitates the development, on the other hand, it is important to protect the end-points with a previous authentication and authorization to avoid a server crash as a consequence of attacks with multiple requests to the back-end and/or different attacks that allow accessing the information. 
When working with components, it is important to take into account their integrity, making sure that each of them complements each other and that they do not have vulnerabilities. It is very common that certain dependencies are constantly being updated, so it is important to work with the most stable versions to avoid working with obsolete libraries or dependencies and thus avoid possible compatibility errors or application crashes.
Finally, it is very necessary to monitor the possible vulnerabilities of the system, so that a record of these can always be kept and the effects or consequences of the vulnerabilities can be mitigated, thus avoiding their exploitation. 