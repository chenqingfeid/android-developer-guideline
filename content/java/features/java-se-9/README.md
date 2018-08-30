# Java SE 9 新特性

## Java Platform Module System



## The Java Shell



## Make G1 the Default Garbage Collector



## Compiler Control



## Segmented Code Cache



## Dynamic Linking of Language-Defined Object Models



## Version-String Scheme

新的版本号格式：`$MAJOR.$MINOR.$SECURITY.$PATCH`



## Validate JVM Command-Line Flag Arguments



## Remove the JVM TI hprof Agent



## Remove the jhat Tool



## Compile for Older Platform Versions



## Java 语言的一些小变化

- 允许在私有实例方法上使用 `@SafeVargs`。 `@SafeVarargs` 注释只能应用于不能重写的方法，包括静态方法和最终实例方法。 私有实例方法是 `@SafeVargs` 可以容纳的另一个用例。
-  Java SE 7 中的 `try-with-resources` 语句要求对语句管理的每个资源声明一个新的变量，而在 Java SE 9 中 允许有效的 final 变量作为资源在 `try-with-resources` 语句中使用。
- 如果参数类型的推导类型是可表示的，则允许带有匿名类的 `<>` 操作符。 由于推导类型使用了具有 `<>` 操作符的匿名类构造函数可能不属于由签名属性支持的一组类型，所以  Java SE 7 中禁止使用带匿名类的 `<>` 操作符。
- 完成了从 Java SE 8 开始的从法律标识符名称集合中删除下划线。
- 支持私有接口方法，从而使接口的非抽象方法能够在它们之间共享代码。



