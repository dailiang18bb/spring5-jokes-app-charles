# spring5-jokes-app-charles
A joke app for Spring Boot

### Development Plan

1. Create Spring Boot Project from Spring Initializr, Only select ‘Web’ and ‘Thymeleaf’ dependencies

2. Add Dependency: group: 'guru.springframework', name: 'chuck-norris-for-actuator', version: ‘0.0.2'
3. Create Service to return joke string from class `guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote()`
4. Create Spring MVC Jokes controller
5. Map context root (“/“, “”) to Jokes view
6. Add Joke text to ‘joke’ property of Model
7. Return view name of ‘chucknorris’
8. Create Thymeleaf view for ‘chucknorris’.
9. Display Joke string property  
10. Run App
11. Refresh for more Chuck Norris Jokes!
