.PHONY: clean


Lab2.jar: Lab2.class manifest.txt
	jar -cfm Lab2.jar manifest.txt Lab2.class Prog/Program.class Out/Output.class Inp/Input.class  
Lab2.class:  Lab2.java Inp/Input.class Out/Output.class Prog/Program.class
	javac Lab2.java

Inp/Input.class: Input.java
	javac -d . Input.java
Out/Output.class: Output.java
	javac -d . Output.java
Prog/Program.class: Program.java
	javac -d . Program.java

clean:             
	rm -rf *.class             
	rm -r Inp Out Prog Lab2.jar	

