# Java编程技术第一讲: Java 简介与开发环境 #
## Java简介

## Java 开发环境搭建
- JDK
- Eclipse
- IntelliJ 

## 第一个java程序
```
public class Welcome {
	public static void main(String[] args) {
		System.out.println("Welcome to learn Java Programming~");
	}
}

```
## 表达式计算
```
public class Life {
	public static void main(String[] args) {
		int x;//variable
		final int y=3;//constant
		//literal 字面量 0
		System.out.println(3+4);
		System.out.println(3/4);
		System.out.println(3/4.0);//3/4.0=>3.0/4.0=>0.75
		System.out.println(1+2-3*4/5);//???
		System.out.println(100 * 365 * 24 * 3600 * 1000 * 1L);//bugs here
		System.out.println(1L* 100 * 365 * 24 * 3600 * 1000 );

		//expression {type value}
	}
}

```
## AOJ介绍和使用
## homework
- 输出Hello World
- 输出 变量
- 计算100年的毫秒值
