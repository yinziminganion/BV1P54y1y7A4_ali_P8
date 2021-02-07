# 指导思想

1. 可维护性 Maintainability
    + 修改功能需要改动的地方越少，可维护性就越好
1. 可复用性 Reusability
    + 代码可以被以后重复使用
    + 写出自己总结的类库
3. 可扩展性 Extensibility / Scalability
    + 添加功能无需修改原来的代码
3. 灵活性 Flexibility / Mobility / Adaptability
    + 代码接口可以灵活调用

# 面向对象六大原则

+ 单一职责原则 Single Responsibility Principal
    + 一个类只需要负责一个单一的职责
        + Person
        + PersonManager
    + 高内聚，低耦合
+ 开闭原则 Open-Closed Principle
    + 对扩展开放，对修改关闭
        + 尽量不修改原来代码的情况下进行扩展
    + 抽象化，多态是开闭原则的关键
+ 里氏替换原则 Liscov Substitution Principle
    + 所有使用父类的地方，必须能够透明地使用子类对象
+ 依赖倒置原则 Dependency Inversion Principle
    + 依赖抽象，而不是依赖具体
    + 面向抽象编程 / 面向接口编程
+ 接口隔离原则 Interface Segregation Principle
    + 每一个接口应该承担独立的角色，不干不该自己干的事情
        + Flyable、Runnable不该合二为一
        + 避免子类实现不需要实现的方法
        + 需要对客户提供接口的时候，只需要暴露最小的接口
+ 迪米特法则 Law of Demeter
    + 尽量不要和陌生人说话
    + 在迪米特法则中，对于一个对象，非陌生人包括以下几类：
        + 当前对象本身(this)
        + 以参数形式传入到当前对象方法中的对象
        + 当前对象的成员对象
        + 如果当前对象的成员对象是一个集合，那么集合中的元素也都是朋友
        + 当前对象所创建的对象
    + 使和其它类的耦合度变低

# 设计模式分类

+ 创建型模式
    + Abstract Factory
    + Builder
    + Factory Method
    + Prototype
    + Singleton
+ 结构型模式
    + Adapter
    + Bridge
    + Composite
    + Decorator
    + Facade
    + Flyweight
    + Proxy
+ 行为型模式
    + Chain of Responsibility
    + Command
    + Interpreter
    + Iterator
    + Mediator
    + Memento
    + Observer
    + State
    + Strategy
    + Template Method
    + Visitor
