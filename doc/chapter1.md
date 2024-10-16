## 一个java文件中包含多个类时

### 1. 当一个类中包含多个内部类
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

### 2. 当含有多个类时，关于main的运行顺序问题
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

## package与子package的问题
在Java中，`import` 语句不会自动导入子包。每个包（package）都需要单独导入。
也就是说，如果你导入了一个包，比如`java.util`，该包的子包（如`java.util.concurrent`）不会自动被导入。你需要显式地使用`import java.util.concurrent.*;` 来导入子包中的类。
```java
import java.util.*;  // 导入 java.util 包中的所有类
import java.util.concurrent.*;  // 需要明确导入子包 java.util.concurrent 中的类
```
