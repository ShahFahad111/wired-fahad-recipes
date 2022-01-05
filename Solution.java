import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    static final String pattern = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC";

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int t = input.nextInt();
       while(t-- > 0){
           int n = input.nextInt();
           String s = input.next();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(s);
            if(m.find()){
                System.out.println("VALID");
            }else{
                System.out.println("INVALID");
            }
       }
    }
}