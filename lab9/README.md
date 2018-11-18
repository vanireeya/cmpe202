## Lab 9


### Strategy Pattern

- Core Design Pattern implementations:

Strategy pattern is implemented in the original code. Here three strategies are present to compute on 2 numbers. The three strategies are: IntSum, IntProduct, IntDifference which adds, multiplies and subtracts the two numbers. There is one strategy interface Computation which contains the method compute(). This interface is implemented by the three strategies.

- Java Lambda / Functional Style

In the lambda way of writing the Strategy pattern, there was no need for three separate classes for the three different strategies. Thus the three strategy classes are eliminated and the strategy behavior is directly written in the context class using lambda function.


### Observer Pattern

- Core Design Pattern implementations:

Observer pattern is implemented in the original code. Here my subject is Moon, and its observers are Nasa, Aliens and Isro. Here function startSpying is attaching the observers to the subject and land notifies the observer. Here Nasa.java, Aliens.java and Isro.java are java classes which implements LandingObserver inteface. 

- Java Lambda / Functional Style

Here, after implementation of the lambda function, there was no need for separate classes to implement observer. Thus additional classes required for implementation were eliminated, instead observer behaviour is written directly in the subject class using lambda function



### Comparison between Java Pattern implementation and Java Lambda/Functional Style

Lambda functions enable functions to be treated as method arguments and be passed as block around. This leads to elimination of additional classes and thus gives concise, easy to manage code. 

