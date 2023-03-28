#!/bin/bash
java org.antlr.v4.Tool Little.g4
javac *.java
diff -B -b -s outputs/test1.out <(java Driver < inputs/test1.micro)
diff -B -b -s outputs/test5.out <(java Driver < inputs/test5.micro)
diff -B -b -s outputs/test6.out <(java Driver < inputs/test6.micro)
diff -B -b -s outputs/test7.out <(java Driver < inputs/test7.micro)
diff -B -b -s outputs/test8.out <(java Driver < inputs/test8.micro)
diff -B -b -s outputs/test9.out <(java Driver < inputs/test9.micro)
diff -B -b -s outputs/test11.out <(java Driver < inputs/test11.micro)
diff -B -b -s outputs/test13.out <(java Driver < inputs/test13.micro)
diff -B -b -s outputs/test14.out <(java Driver < inputs/test14.micro)
diff -B -b -s outputs/test16.out <(java Driver < inputs/test16.micro)
diff -B -b -s outputs/test18.out <(java Driver < inputs/test18.micro)
diff -B -b -s outputs/test19.out <(java Driver < inputs/test19.micro)
diff -B -b -s outputs/test20.out <(java Driver < inputs/test20.micro)
diff -B -b -s outputs/test21.out <(java Driver < inputs/test21.micro)
