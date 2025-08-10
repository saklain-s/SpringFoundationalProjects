# Spring Foundational Projects

A comprehensive collection of Spring Framework and Spring Boot projects demonstrating core concepts, best practices, and progressive learning path from basic dependency injection to advanced enterprise features.

## Table of Contents

- [About](#about)
- [Project Structure](#project-structure)
- [Learning Path](#learning-path)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Running Projects](#running-projects)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## About

This repository contains 10 comprehensive modules covering the entire Spring ecosystem, designed as a progressive learning journey. Each module builds upon previous concepts and includes multiple hands-on projects with practical examples.

**Key Features:**
- ✅ **Progressive Learning**: From basic Spring Core to advanced enterprise patterns
- ✅ **Hands-on Projects**: 40+ individual projects with working code
- ✅ **Real-world Examples**: Employee management systems, security implementations, and more
- ✅ **Best Practices**: Industry-standard patterns and configurations
- ✅ **Modern Stack**: Spring Boot 3.5.0, Java 21, Maven

## Project Structure

### 📁 Module Overview

| Module | Focus Area | Projects | Key Concepts |
|--------|------------|----------|--------------|
| **01-spring-boot-overview** | Spring Boot Fundamentals | 6 projects | Auto-configuration, DevTools, Actuator, Properties |
| **02-Spring_Core** | Dependency Injection & IoC | 9 projects | Constructor/Setter Injection, Qualifiers, Bean Scopes |
| **03-spring-boot-hibernate-jpa-crud** | Data Persistence | Multiple projects | JPA, Hibernate, CRUD Operations |
| **04-REST CRUD** | RESTful Web Services | 4 projects | REST APIs, Spring Data JPA, Data REST |
| **05-Spring boot rest security** | API Security | Security projects | Authentication, Authorization, JWT |
| **06-spring-boot-spring-mvc** | Web Applications | 2 projects | Thymeleaf, Form Validation, MVC Pattern |
| **07-spring-boot-spring-mvc-crud** | Web CRUD Operations | CRUD projects | Full-stack web applications |
| **08_spring-boot-spring-mvc-security** | Web Security | 3 projects | Login forms, JDBC authentication, Bootstrap UI |
| **09-spring-boot-jpa-advanced-mappings** | Advanced JPA | 5 projects | One-to-One, One-to-Many, Many-to-Many relationships |
| **10-spring-aop** | Aspect-Oriented Programming | 2 projects | Cross-cutting concerns, Pointcuts, Advice |

### 📋 Detailed Project Breakdown

#### 01-spring-boot-overview
- `01-spring-boot-demo` - Basic Spring Boot application setup
- `02-devtools-demo` - Development tools and hot reload
- `03-actuator-demo` - Application monitoring and metrics
- `04-actuator-security-demo` - Securing actuator endpoints
- `05-command-line-demo` - Command line runners
- `06-properties-demo` - External configuration management

#### 02-Spring_Core
- `01-constructor-injection` - Constructor-based dependency injection
- `02-component-scanning` - Automatic component discovery
- `03-setter-injection` - Setter-based dependency injection
- `04-qualifiers` - Resolving ambiguous dependencies
- `05-primary` - Primary bean selection
- `06-lazy-initialization` - Lazy loading of beans
- `07-bean-scopes` - Singleton, prototype, and other scopes
- `08-bean-lifecycle-methods` - Init and destroy methods
- `09-java-config-bean` - Java-based configuration

#### 04-REST CRUD
- `01-spring-boot-rest-crud` - Basic REST API implementation
- `20-spring-boot-employee-crud` - Employee management REST API
- `30-spring-boot-employee-crud-spring-datajpa` - JPA integration
- `40-spring-boot-employee-crud-spring-data-rest` - Automatic REST endpoints
- `spring-boot-employee-sql-script` - Database setup scripts

## Learning Path

**🎯 Recommended Learning Sequence:**

1. **Start Here**: `01-spring-boot-overview` - Get familiar with Spring Boot basics
2. **Core Concepts**: `02-Spring_Core` - Master dependency injection and IoC
3. **Data Layer**: `03-spring-boot-hibernate-jpa-crud` - Learn data persistence
4. **REST APIs**: `04-REST CRUD` - Build RESTful web services
5. **Security**: `05-Spring boot rest security` - Secure your APIs
6. **Web Layer**: `06-spring-boot-spring-mvc` - Create web applications
7. **Full Stack**: `07-spring-boot-spring-mvc-crud` - Complete web CRUD apps
8. **Web Security**: `08_spring-boot-spring-mvc-security` - Secure web applications
9. **Advanced Data**: `09-spring-boot-jpa-advanced-mappings` - Complex relationships
10. **AOP**: `10-spring-aop` - Cross-cutting concerns

## Prerequisites

- **Java 21** (JDK 21 or later)
- **Maven 3.6+** (All projects use Maven)
- **IDE**: IntelliJ IDEA, Eclipse, or VS Code with Java extensions
- **Database**: MySQL (for some projects) or H2 (embedded)
- **Optional**: Docker for database containers

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/saklain-s/SpringFoundationalProjects.git
cd SpringFoundationalProjects
```

### 2. Verify Prerequisites
```bash
java -version  # Should show Java 21
mvn -version   # Should show Maven 3.6+
```

### 3. Start with Module 01
```bash
cd "01-spring-boot-overview/01-spring-boot-demo"
mvn clean compile
mvn spring-boot:run
```

## Running Projects

### Standard Maven Commands
```bash
# Navigate to any project directory
cd "module-name/project-name"

# Clean and compile
mvn clean compile

# Run tests
mvn test

# Run the application
mvn spring-boot:run

# Package as JAR
mvn clean package

# Run the packaged JAR
java -jar target/project-name-0.0.1-SNAPSHOT.jar
```

### Common Ports
- Most Spring Boot apps run on `http://localhost:8080`
- Some projects may use different ports (check application.properties)
- Actuator endpoints typically available at `/actuator`

## Technologies Used

### Core Framework
- **Spring Boot 3.5.0** - Application framework
- **Spring Framework 6.x** - Core container and features
- **Java 21** - Programming language

### Data & Persistence
- **Spring Data JPA** - Data access abstraction
- **Hibernate** - ORM implementation
- **MySQL** - Production database
- **H2** - In-memory database for testing

### Web & REST
- **Spring MVC** - Web framework
- **Spring Data REST** - Automatic REST endpoints
- **Thymeleaf** - Server-side templating
- **Bootstrap** - Frontend styling

### Security
- **Spring Security** - Authentication and authorization
- **JWT** - Token-based authentication
- **BCrypt** - Password hashing

### Testing & Tools
- **JUnit 5** - Unit testing framework
- **Mockito** - Mocking framework
- **Spring Boot Test** - Integration testing
- **Maven** - Build tool and dependency management

### Additional Libraries
- **OkHttp** - HTTP client
- **Gson** - JSON processing
- **Spring Boot DevTools** - Development utilities
- **Spring Boot Actuator** - Production monitoring

## Project File Structure

```
SpringFoundationalProjects/
├── 01-spring-boot-overview/          # Spring Boot fundamentals
│   ├── 01-spring-boot-demo/
│   ├── 02-devtools-demo/
│   ├── 03-actuator-demo/
│   ├── 04-actuator-security-demo/
│   ├── 05-command-line-demo/
│   └── 06-properties-demo/
├── 02-Spring_Core/                   # Dependency injection & IoC
│   ├── 01-constructor-injection/
│   ├── 02-component-scanning/
│   ├── 03-setter-injection/
│   ├── 04-qualifiers/
│   ├── 05-primary/
│   ├── 06-lazy-initialization/
│   ├── 07-bean-scopes/
│   ├── 08-bean-lifecycle-methods/
│   └── 09-java-config-bean/
├── 03-spring-boot-hibernate-jpa-crud/ # Data persistence
├── 04-REST CRUD/                     # RESTful web services
│   ├── 01-spring-boot-rest-crud/
│   ├── 20-spring-boot-employee-crud/
│   ├── 30-spring-boot-employee-crud-spring-datajpa/
│   ├── 40-spring-boot-employee-crud-spring-data-rest/
│   └── spring-boot-employee-sql-script/
├── 05-Spring boot rest security/     # API security
├── 06-spring-boot-spring-mvc/        # Web applications
│   ├── 01-helloworld-thymeleaf/
│   └── 30-validationdemo/
├── 07-spring-boot-spring-mvc-crud/   # Web CRUD operations
├── 08_spring-boot-spring-mvc-security/ # Web security
│   ├── 01-spring-boot-mvc-security/
│   ├── bootstrap-login-form-template/
│   └── spring-mvc-security-jdbc/
├── 09-spring-boot-jpa-advanced-mappings/ # Advanced JPA
│   ├── 00-jpa-advanced-mappings-database-scripts/
│   ├── 01-jpa-one-to-one-uni/
│   ├── 02-jpa-one-to-one-bi/
│   ├── 03-jpa-one-to-many/
│   ├── 04-jpa-one-to-many-uni/
│   └── 05-jpa-many-to-many/
└── 10-spring-aop/                    # Aspect-oriented programming
    ├── 01-spring-boot-aop-demo/
    └── 02-spring-boot-aop-demo-pointcut-declarations/
```

## Quick Start Examples

### 1. Hello World Spring Boot
```bash
cd "01-spring-boot-overview/01-spring-boot-demo"
mvn spring-boot:run
# Visit: http://localhost:8080
```

### 2. REST API with CRUD
```bash
cd "04-REST CRUD/01-spring-boot-rest-crud"
mvn spring-boot:run
# Test: http://localhost:8080/api/students
```

### 3. Web Application with Thymeleaf
```bash
cd "06-spring-boot-spring-mvc/01-helloworld-thymeleaf"
mvn spring-boot:run
# Visit: http://localhost:8080
```

## Troubleshooting

### Common Issues

**Port Already in Use**
```bash
# Kill process on port 8080
netstat -ano | findstr :8080
taskkill /PID <PID> /F
```

**Java Version Issues**
```bash
# Check Java version
java -version
# Should show Java 21

# Set JAVA_HOME if needed
set JAVA_HOME=C:\Program Files\Java\jdk-21
```

**Maven Issues**
```bash
# Clean Maven cache
mvn dependency:purge-local-repository
mvn clean install
```

## Contributing

We welcome contributions! Here's how to get started:

### 1. Fork & Clone
```bash
git clone https://github.com/your-username/SpringFoundationalProjects.git
cd SpringFoundationalProjects
```

### 2. Create Feature Branch
```bash
git checkout -b feature/your-feature-name
```

### 3. Make Changes
- Add new projects or improve existing ones
- Follow existing code style and structure
- Add appropriate documentation

### 4. Test Your Changes
```bash
mvn clean test  # Run tests
mvn spring-boot:run  # Test the application
```

### 5. Submit Pull Request
```bash
git add .
git commit -m "Add: your feature description"
git push origin feature/your-feature-name
```

### Contribution Guidelines
- ✅ Follow existing project structure
- ✅ Include proper documentation
- ✅ Add tests for new features
- ✅ Use consistent naming conventions
- ✅ Update README if needed

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

## Support & Resources

### 📚 Learning Resources
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Framework Reference](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [Spring Data JPA Reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)

### 🆘 Getting Help
- Check individual project README files
- Review code comments and documentation
- Open an issue for bugs or questions
- Join Spring community forums

### 🎯 Next Steps
1. Complete all modules in sequence
2. Build your own projects using learned concepts
3. Explore Spring Cloud for microservices
4. Learn Spring WebFlux for reactive programming

---

**Happy Learning! 🚀**

*This repository represents a comprehensive journey through the Spring ecosystem. Take your time with each module and practice the concepts thoroughly.*