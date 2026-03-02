# CS 320 – Software Test, Automation, and Quality Assurance  
## Module Eight Journal Reflection  

This repository contains selected artifacts from both projects in this course.  
From Project One, I included the following files:  

- `Contact.java`  
- `ContactService.java`  
- `ContactTest.java`  
- `ContactServiceTest.java`  

From Project Two, I included my Summary and Reflections Report.  

Together, these artifacts demonstrate my ability to design backend services, apply unit testing strategies, and use automated testing to validate functionality and enforce requirements.

---

## How I Ensure Code Is Functional and Secure  

To ensure software is functional and secure, I focus on validating requirements through testing. In this course, I learned that writing unit tests is not just about checking if code runs. It is about verifying behavior under normal conditions and edge cases.

For the Contact Service project, I created tests to confirm that data constraints were enforced. For example, I verified that IDs could not be null, strings did not exceed maximum lengths, and invalid inputs triggered appropriate exceptions. These tests acted as safeguards to prevent bad data from entering the system.

Security at this level begins with validation and controlled access. By restricting how objects are created and modified, and by enforcing input constraints through constructors and setters, I reduced the risk of inconsistent or unsafe states within the application.

Automated testing gave me confidence that changes to the code would not silently break existing functionality. This mindset will carry forward into future projects.

---

## How I Interpret User Needs and Incorporate Them Into a Program  

Interpreting user needs starts with carefully analyzing requirements. In this course, the requirements defined specific rules for contact creation, updates, and deletions. Instead of jumping straight into coding, I translated those requirements into testable conditions.

I approached each requirement by asking, “What should happen if this rule is followed?” and “What should happen if it is violated?” That thought process helped me design both the implementation and the corresponding test cases.

By turning requirements into unit tests first, I ensured that the program behavior aligned directly with user expectations. This approach prevents assumptions and keeps development grounded in documented needs.

---

## How I Approach Designing Software  

When designing software, I start by defining responsibilities. In the Contact Service project, I separated concerns clearly. The `Contact` class handled data validation and object integrity, while the `ContactService` class managed operations such as adding, updating, and deleting contacts.

This separation improved clarity and made testing easier. Each class had a focused role, which reduced complexity and improved maintainability.

Throughout the milestones, my design approach became more structured. I began thinking more about defensive programming, validation boundaries, and how automated testing supports long term reliability. I also gained a stronger appreciation for how small design decisions affect scalability and maintainability.

---

## Final Reflection  

This course strengthened my understanding of software testing, automation, and quality assurance. Writing JUnit tests forced me to think critically about how software can fail, not just how it succeeds.

I now approach development with a stronger emphasis on validation, structured design, and automated verification. These skills are essential for building reliable systems and will directly support my future coursework and professional goals in software engineering.

This repository reflects my growth in writing testable code, analyzing requirements, and applying structured testing strategies to produce functional and secure software.
