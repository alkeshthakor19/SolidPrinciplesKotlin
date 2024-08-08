# SolidPrinciplesKotlin
Implementation of SOLID Principles in Kotlin.

**SOLID**

**S:** Single Responsibility Principle (SRP) 

**O:** Open/Closed Principle

**L:** Liskov’s Substitution Principle (LSP)

**I:** Interface Segregation Principle (ISP)

**D:** Dependency Inversion Principle (DIP)

**Benifits of SOLID Principles**
1. Help us in reducing tight coupling
2. Avoid duplicate code
3. Easy to maintain
4. Easy to understand
5. Flexible software
6. Reduce Complexity


**Single Responsibility Principle**
  1. A class should have only one reason to change. Class should have only one job or task to perform.

     
**Open/Closed Principle**
  1. Open for extension but closed for Modification
  2. A class, function or module should be open for extension but close for modification.


**Liskov’s Substitution Principle (LSP)**
  1. Subclass should extend the capability of parent class not narrow it down.
  2. If class B is subtype of class , then we should be able to replace object of A with B without breaking the behaviour of the program


**Interface Segregation Principle (ISP)**
  1. Do not force any client to implement an interface which is irrelevant to them
  2. Main goal is to focus on avoiding fat interface and give preference to many small client-specific interfaces.
  3. Prefer many client interfaces rather than one general interface and each interface should have a specific responsibility.


**Dependency Inversion Principle (DIP)**
  1. High-level modules should not depend on low-level modules. Both should depend on abstractions
  2. Abstractions should not depend on details. Details should depend on abstractions
  3. Classes should rely on abstractions (e.g., interfaces or abstract classes) rather than concrete implementations
