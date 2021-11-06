//创建person类

class Person{

    public Person(String name,int age){         //构造方法，给属性赋值，避免重复调用setter方法
        this.setAge(age);
        this.setName(name);
    }

    private int age;//属性一：姓名    private使其无法被外部其他类调用
    private String name;//属性二：年龄

    public void tell(){                 //取得信息方法
        System.out.print("姓名："+this.getName()+"，年龄："+this.getAge());
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        if(a>0) {
            age = a;
        }
    }

}
public class 1_Person{
    public static void main(String[] args){
        Person Luo_Junyuan=new Person("罗均元",30);
        Luo_Junyuan.tell();
    }
}
