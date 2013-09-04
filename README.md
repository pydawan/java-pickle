java-pickle
===========

Author: Thiago Alexandre Martins Monteiro
Local: Goiania/Goias/Brazil


Description

    Java application for serializing data based on the Python pickle module.


How to compile?

    javac -cp .:src:lib/* -d bin src/*.java

How to run?

    java -cp .:bin:lib/* PickleApplication

Note

    Do not forget to make your class is serializable.

    For example:

    public class Something implements java.io.Serializable {

    }


    d:p

    It's simple but I hope it is helpful to someone.
