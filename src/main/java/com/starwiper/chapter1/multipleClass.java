package com.starwiper.chapter1;

class Foo {
    public static int func() {
        return 10;
    }
}

class Sample {
    public static void main(String[] args) {
        System.out.print(Foo.func());
        System.out.print("Sample");
    }
}

