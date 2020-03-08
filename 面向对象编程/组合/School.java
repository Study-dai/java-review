package 面向对象编程.组合;
//组合
//和继承类似，组合也是一种表达类之间关系的方式，也是能够达到代码重用的效果
//例如表示一个学校
public class School {
    public student students;
    public teacher  teachers;
}
 class teacher{

}
class student{

}

/*
组合并没有涉及到特殊的语法（如extends关键字）
仅仅是将一个类饿实例作为另一个类的字段

组合表示  has a  学校包含学生和老师
继承表示  is  a  猫和鸟都是动物
 */