[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/dashboard?id=buddhikac96_calang)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=buddhikac96_calang&metric=bugs)](https://sonarcloud.io/dashboard?id=buddhikac96_calang)

# calang
calang is a Simple Programming language which is compiled into Java.
This language contains simple arithmetic operations..

## Sample Code

#### calang
```
int a = 5;
int b = 10;
check(a > b) {
    a = 10;
    b = 5;
}otherwise{
    a = a - 1;
    b = b - 1;
}
show(a);
```

#### java
```java
public class Main{
	public static void main(String... args){
		a = 5;
		b = 10;
		if(a > b){
			a = 10;
			b = 5;
		}else{
			a = a - 1;
			b = b - 1;
		}
                System.out.println(a);
	}
}
```

### Features
* Initialize variables
* Assign values to variables
* Arithmetic operations
    * Multiplication (*)
    * Division (/)
    * Subtraction (-)
    * Addition (+)
* Comparison operations
    * Equal (==)
    * Not Equal (!=)
    * Greater Than (>)
    * Less Than (<)
* If condition (check)
* Print (show)

### About
I have antlr4 parser generator to create the parser. 
Currently, code is get compiled into Java in parse tree tier.
I hope to develop the AST, which allows some semantic analysis as well.
Currently, there is mock model for AST, but not fully implemented yet.

Here, I have used the visitor to traverse the parse-tree.

### Project Structure

#### src
src folder contains all dev packages.
* antlr
* app
* ast
    * gen
    
##### antlr
Antlr generated parser, lexer, visitor and listener.

##### app
Entry point of the compiler

##### ast
Mock model of the AST

##### gen
<b>Antlr2Java.java</b> file contains the implementation for 
compiling calang into Java in parse tree tier.
