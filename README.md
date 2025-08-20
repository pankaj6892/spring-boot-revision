# spring-boot-revision
Revising Core Concepts of Spring-Boot and Mircoservices

<img width="2155" height="1128" alt="image" src="https://github.com/user-attachments/assets/f1f76e55-edad-4748-bc5b-93ec59581037" />

<img width="679" height="405" alt="Screenshot 2025-08-15 at 12 58 23 PM" src="https://github.com/user-attachments/assets/585d64eb-67d1-462c-a4d6-6ea24e44b20e" />

<img width="1508" height="778" alt="image" src="https://github.com/user-attachments/assets/6611d18d-f7a1-40ad-a0da-0ebdc110c631" />

<img width="1680" height="800" alt="image" src="https://github.com/user-attachments/assets/9db7627b-ccc1-4bab-8a49-90b00cdb3aaa" />

Bean is just a normal java object managed by Spring.

<img width="1680" height="800" alt="image" src="https://github.com/user-attachments/assets/2878befa-b50a-4e37-a1db-5e9a63c36b28" />

<img width="2132" height="830" alt="image" src="https://github.com/user-attachments/assets/2186e0fc-5d0c-4f55-9762-84625c11a48b" />

<img width="1075" height="270" alt="Screenshot 2025-08-15 at 11 32 36 PM" src="https://github.com/user-attachments/assets/fa2a4b2f-2281-42e1-9aae-ddbd6f416caa" />

<img width="2108" height="794" alt="image" src="https://github.com/user-attachments/assets/c31edf54-2830-4039-afb0-4f931456e7cd" />

<img width="1540" height="766" alt="image" src="https://github.com/user-attachments/assets/6afb07a5-35dd-4968-b914-1c3dfe60766a" />

<img width="1502" height="772" alt="image" src="https://github.com/user-attachments/assets/d32500b8-f8e4-4561-b645-2f31c492c735" />

<img width="1798" height="788" alt="image" src="https://github.com/user-attachments/assets/77d2ea3d-0ed3-4499-b2f2-700c35eb66aa" />

<img width="2232" height="392" alt="image" src="https://github.com/user-attachments/assets/c02cb8a0-0b69-4d03-ac11-f8187f77fa47" />



-----------------
The **@Service** annotation in Spring Boot is a specialization of the @Component annotation, used to indicate that a class belongs to the service layer of an application. This layer typically encapsulates the business logic and orchestrates interactions between the presentation layer (e.g., controllers) and the data access layer (e.g., repositories).
Key aspects of @Service:
Semantic Meaning:
It provides clear semantic meaning, indicating that the annotated class is a service provider responsible for handling business functionalities. This improves code readability and organization.
Automatic Bean Registration:
When a class is annotated with @Service, Spring Boot's component scanning automatically detects and registers it as a Spring Bean in the application context. This eliminates the need for manual bean configuration.
Dependency Injection:
Services are eligible for dependency injection, allowing other components (like controllers or other services) to easily inject and use instances of the annotated class using annotations like @Autowired. This promotes a loosely coupled design.
Business Logic Encapsulation:
It is the designated place for implementing core business logic, performing operations, and managing transactions (often in conjunction with @Transactional).
Separation of Concerns:
@Service helps enforce a clear separation of concerns by distinguishing the business logic layer from the presentation and data access layers, enhancing maintainability and modularity.
Example Usage:
Java

import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Business logic methods
    public User createUser(User user) {
        // ... implementation to create a user
        return user;
    }

    public User getUserById(Long id) {
        // ... implementation to retrieve a user
        return null;
    }
}

----------------

The **@Component** annotation in Spring Boot is a core annotation used to define Spring-managed beans. It indicates that the annotated class is a component and should be automatically detected and registered as a Spring Bean within the application context. 
Key aspects of @Component:
Automatic Bean Registration:
When a class is annotated with @Component, Spring's component scanning mechanism automatically detects it and creates an instance (bean) of that class, managing its lifecycle.
Dependency Injection:
Classes annotated with @Component are eligible for dependency injection. Other Spring-managed components can have instances of @Component-annotated classes injected into them using annotations like @Autowired.
General-Purpose Stereotype:
@Component serves as a general-purpose stereotype annotation. More specialized stereotype annotations like @Service, @Repository, and @Controller are essentially specializations of @Component and provide more semantic meaning for specific layers of an application.
Bean Naming:
By default, the bean name generated for a class annotated with @Component is the class name with the first letter in lowercase. A custom name can be specified by providing a value to the annotation, e.g., @Component("myCustomBean").
Integration with @ComponentScan:
The @ComponentScan annotation, often found on the main application class in Spring Boot (via @SpringBootApplication), triggers the scanning for classes annotated with @Component (and its specializations) within specified packages.

----------------

The **@Repository** annotation in Spring Boot is a specialization of the @Component annotation, used to indicate that a class is a repository.
Here's a breakdown of its purpose and usage:
Data Access Layer:
It marks a class responsible for interacting with a database or other data sources. This class typically encapsulates storage, retrieval, search, update, and delete (CRUD) operations on objects, effectively acting as a Data Access Object (DAO).
Automatic Exception Translation:
A key benefit of @Repository is that it enables automatic exception translation. Spring will convert database-specific exceptions into Spring's unified DataAccessException hierarchy, making error handling more consistent and manageable across different data access technologies.
Classpath Scanning:
As a stereotype annotation (a specialized @Component), @Repository classes are automatically detected by the Spring Framework through classpath scanning, and Spring manages them as beans in the application context.
Integration with Spring Data JPA:
When working with Spring Data JPA, you often define repository interfaces that extend JpaRepository (or other CrudRepository sub-interfaces). These interfaces are typically annotated with @Repository to signify their role in the data access layer and enable Spring Data's powerful features like deriving queries from method names.
In essence, @Repository clearly defines the role of a class in the persistence layer, facilitates automatic exception handling, and integrates seamlessly with Spring's dependency injection and data access mechanisms.

-----------------
The **@Controller** annotation in Spring Boot is a stereotype annotation that marks a class as a Spring MVC controller. This annotation indicates that the class is responsible for handling incoming HTTP requests and preparing a model to be rendered as a view (e.g., an HTML page, a JSP, or a Thymeleaf template).
Key aspects of @Controller:
Web Request Handling:
It is used in combination with handler methods, typically annotated with @RequestMapping (or its specialized versions like @GetMapping, @PostMapping, etc.), to map specific URLs to methods within the controller.
Returns Views:
Unlike @RestController, which directly serializes the return value into the response body (e.g., JSON or XML), @Controller is primarily used when the application needs to return a view name that Spring's view resolver will then resolve to an actual view template.
Specialization of @Component:
@Controller is a specialization of the @Component annotation, meaning that Spring's component scanning mechanism will automatically detect and register classes annotated with @Controller as Spring beans.
Used in UI-based applications:
It is commonly employed in traditional web applications where the primary goal is to render dynamic web pages for users.
Example:
Java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot!");
        return "home"; // This refers to a view named "home" (e.g., home.html or home.jsp)
    }
}
-----------------

The **@Autowired** annotation in Spring is a mechanism for automatic dependency injection. It instructs the Spring container to automatically resolve and inject dependencies into a class, eliminating the need for manual configuration of these dependencies.
How it works:
When Spring encounters a field, constructor, or setter method annotated with @Autowired, it attempts to find a matching bean in its application context and inject it. The matching typically occurs by type, meaning Spring looks for a bean whose type is compatible with the dependency being injected.
Where it can be used:
Field Injection: The @Autowired annotation can be directly applied to a field, allowing Spring to inject the required bean directly into that field.
Java

    @Component
    public class UserService {
        @Autowired
        private UserRepository userRepository;
        // ...
    }
Constructor Injection: @Autowired can be applied to a constructor, indicating that Spring should use this constructor to create the bean and inject its dependencies as constructor arguments. This is generally the preferred method as it promotes immutability and makes dependencies explicit.
Java

    @Service
    public class UserService {
        private final UserRepository userRepository;

        @Autowired
        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }
        // ...
    }
Setter Injection: @Autowired can be applied to a setter method, allowing Spring to inject the dependency by calling the setter method after the bean's creation.
Java

    @Component
    public class TextEditor {
        private SpellChecker spellChecker;

        @Autowired
        public void setSpellChecker(SpellChecker spellChecker) {
            this.spellChecker = spellChecker;
        }
        // ...
    }
Advantages:
Reduced boilerplate code:
Eliminates the need for explicit XML or Java configuration for wiring dependencies.
Loose coupling:
Promotes a design where components are less dependent on each other, as Spring manages the dependency resolution.
Improved testability:
Makes it easier to test components in isolation by providing mock dependencies.
Considerations:
Multiple matching beans:
If multiple beans of the same type are found, Spring will throw an exception unless the @Qualifier annotation is used to specify which specific bean to inject.
Required dependencies:
By default, @Autowired dependencies are required. If a matching bean is not found, an exception will be thrown. This behavior can be changed by setting required = false in the annotation. 

------------

The **@Qualifier** annotation in Spring Boot is used to resolve ambiguity when multiple beans of the same type are available for dependency injection. When Spring's @Autowired annotation attempts to inject a dependency and finds more than one bean of the required type in the application context, it cannot determine which one to inject, leading to an error. 
To address this, @Qualifier is used in conjunction with @Autowired to specify the exact bean to be injected. The name of the desired bean is passed as a value to the @Qualifier annotation, explicitly instructing Spring which specific bean to use.
Key aspects of @Qualifier:
Resolving Ambiguity:
Its primary purpose is to differentiate between multiple beans of the same type, especially when multiple implementations of an interface exist.
Used with @Autowired:
It always works in conjunction with @Autowired to provide a more specific instruction for dependency injection.
Bean Naming:
The value provided to @Qualifier typically corresponds to the name of the target bean. By default, Spring assigns a bean name that is the class name with the first letter in lowercase (e.g., MyClass becomes myClass).
Application:
It can be applied to fields, constructors, or setter methods where dependency injection is being performed.
Example Scenario:
Consider an interface NotificationService with two implementations, EmailNotificationService and SmsNotificationService. When injecting NotificationService into a class, Spring would encounter ambiguity. Using @Qualifier allows you to specify whether you want emailNotificationService or smsNotificationService to be injected.

Java

    @Autowired
    @Qualifier("emailNotificationService")
    private NotificationService notificationService;

-------------------

The **@Value** annotation in Spring Boot is used to inject values from external sources into fields, method parameters, or constructors within a Spring-managed bean. This enables the configuration of an application without directly modifying the source code, leveraging various external sources for property values. 
Key features and uses of @Value:
Property Injection:
It allows injecting values from property files (e.g., application.properties, application.yml), environment variables, system properties, or even literal values and SpEL (Spring Expression Language) expressions.
Syntax for Property Keys:

To inject a value from a property file, the syntax ${property.key} is used within the @Value annotation, where property.key corresponds to the key defined in the property file.

Default Values:
@Value supports providing a default value in case the specified property key is not found in any of the configured property sources. This is done by using the syntax ${property.key:defaultValue}.
Use Cases:
Injecting single configuration properties like database connection strings, API keys, or specific application settings.
Providing default values for properties that might not always be present.
Injecting values from system properties or environment variables for dynamic configuration.
Limitations and Alternatives:
While @Value is convenient for injecting individual properties, it can become less manageable for a large number of related properties. For such scenarios, the **@ConfigurationProperties** annotation is a more structured and recommended alternative, as it allows binding a set of related properties to a dedicated configuration class, providing better organization and often improved tooling support (like IDE autocompletion).


