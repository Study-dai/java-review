package 面向对象编程.继承;

 class Bird extends Animal{
     public Bird(String name) {
         super(name);
     }
     public void fly(){
         System.out.println(this.name+"正在飞");
     }
 }
