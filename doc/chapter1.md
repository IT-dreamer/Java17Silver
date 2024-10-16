# 一个java文件中包含多个类时

## 1. 当一个类中包含多个内部类
```java
class multipleClass {
    static class testA{
        public void aFunc(){
            System.out.println("aFunc");
        }
    }
    static class testB{
        public void bFunc(){
            System.out.println("bFunc");
        }
    }
    public static void main(String[] args) {
        testA objA = new testA();
        objA.aFunc();
        testB objB = new testB();
        objB.bFunc();
    }
}
```
此时编译该java文件
```bash
javac multipleClass.java
```
则会生成 `multipleClass$testA.class`, `multipleClass$testB.class` 以及 `multipleClass.class`。即一个主类和其两个内部类，内部类的名称为主类与特殊符号的组合

## 2. 当含有多个类时，关于main的运行顺序问题
```java
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
```
运行该代码会出现错误
```text
错误: 在类 com.starwiper.chapter1.Foo 中找不到 main(String[]) 方法
```

