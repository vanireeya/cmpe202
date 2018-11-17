### Lab 9

#### Observer Pattern

- Core Design Pattern implementations:

Observer pattern is implemented in the original code. Here my subject is Moon, and its observers are Nasa, Aliens and Isro. Here function startSpying is attaching the observers to the subject and land notifies the observer. Here Nasa.java, Aliens.java and Isro.java are java classes which implements LandingObserver inteface. 

- Java Lambda / Functional Style

Here, after implementation of the lambda function, there was no need for separate classes to implement observer. Thus additional classes required for implementation were eliminated, instead observer behaviour is written directly in the subject class using lambda function

- Comparison

Lambda functions enable functions to be treated as method arguments and be passed as block around. This leads to elimination of additional classes and thus gives concise, easy to manage code. 

