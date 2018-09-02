#  Java 简介：表达式、标准输出 #
## Java简介

- a pure OOP language
- with powerful tools
- in simple&clear grammar 
- more features

## Java 开发环境搭建
- JDK(Java Development Kits)
- Eclipse
- IntelliJ (Recommend)


## 第一个java程序
```Java
public class Welcome {
	public static void main(String[] args) {
		System.out.println("Welcome to learn Java Programming~");
	}
}

```
## 表达式计算
```Java
public class Expression {
	public static void main(String[] args) {
		int x;//variable
		final int y=3;//constant
		//literal 字面量 0
		System.out.println(3+4);
		System.out.println(3/4);
		System.out.println(3/4.0);//3/4.0=>3.0/4.0=>0.75
		System.out.println(1+2-3*4/5);//???
	}
}
```
```Java
public class Life {
	public static void main(String[] args) {
		System.out.println(100 * 365 * 24 * 3600 * 1000 * 1L);//bugs here
		System.out.println(1L* 100 * 365 * 24 * 3600 * 1000 );

	}
}
```
## 标准输出:```System.out```
- 输出表达式 ```System.out.print(exp)```
- 输出表达式并换行 ```System.out.println(exp)```
- 格式化输出 ```System.out.printf``` (vs printf in C)
## AOJ介绍和使用
- [AOJ](http://acm.ahstu.cc)
- 安科在线编译器 
- 平时作业
- 期中考试
- 期末考试
## excise
- 输出Hello World
- 输出两个变量的和
- 计算100年的毫秒值
## homework
- 计算半径为10的圆的面积和周长
- 输出一个整数的长度

## 顺序程序设计习题集（前2周习题
http://oj.ahstu.cc/JudgeOnline/contest.php?cid=1057