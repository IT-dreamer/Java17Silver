package com.starwiper.chapter1;

public class CommandLine {
  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println(i + ": " + Integer.valueOf(args[i]));
    }
  }
}
