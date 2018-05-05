package Logic_1;

/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
(See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */

class FizzString {
    static String fizzString(String str) {
        if(str.startsWith("f"))
            return str.endsWith("b") ? "FizzBuzz" : "Fizz";
        return str.endsWith("b") ? "Buzz" : str;
    }
}
