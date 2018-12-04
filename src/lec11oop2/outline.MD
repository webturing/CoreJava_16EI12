# OOP2 Inheritance and Polymorphism
## 面向对象三大特征：
### 封装: java class 封装了字段Field和方法Method
#### static fields:
- 静态字段，相当于全局变量
- 调用方式  ClassName.staticFieldName;
#### static methods
- 静态方法，相当于全局方法
- 调用方法 ClassName.staticMethodName();
#### non-static  field
- 成员字段，对象实例化后拥有的独立的字段/数据
- 调用方法 objectName.memberedField;
### non-static method
- 成员方法， 对象实例化后才可以执行的方法
- 调用方法  objectName.memberedMethod();
### 权限描述符
- public 公有权限 所有都可以访问
- protected 保护权限： 该类的子类（多级子类）可以访问
- default(没有描述符，称为default) 包权限 :一个包下都可以访问
- private 私有权限，只有本类/自身可以访问
### 继承  class subClass extends parentClass{}
- 所有类的根类 java.lang.Object
- 继承可以直接获得父类中的protected public方法和字段
- super关键字(对比于this)重名规则：子类优先，
- 子类的字段隐藏了父类的同名字段
- 子类的方法重载了父类的同名方法

### 多态Polymorphism
- 抽象类的存在
- 具体子类
- 多态和动态绑定
