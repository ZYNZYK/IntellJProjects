package com.syntax;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String str = "dad";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("the string is Palindrome");
        } else{
                    System.out.println("the string is not palindorme");

                }
            }

        }
