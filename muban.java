//类一一对应关系-例题进阶


//定义Person类
class Person{
    private Book book;        //一个人有一本书，所以Book也算Person的属性，封装Book属性
    private String name;     //封装地址属性
    private int age;        //封装年龄属性
    private Person child;   //一个人有一个孩子
    public Person(String name,int age){      //构造方法
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String n){
        name=n;
    }           //获取person名字的方法（包括child,因为child属于person类）
    public String getName(){
        return name;
    }

    public void setAge(int n){
        age=n;
    }               //获取person年龄的方法
    public int getAge(){
        return age;
    }

    public void setBook(Book b){
        this.book=b;
    }       //获取本人的书
    public Book getBook(){
        return book;
    }

    public void setChild(Person c){
        this.child=c;
    }   //获取人的孩子的方法
    public Person getChild(){
        return child;
    }

    //其实还可以写一个获取孩子的父亲的getter和setter，自处简略
}

//定义Book类
class Book{
    private Person person;     //一本书对应一个人，所以Person也算Book的属性，封装Person属性
    private String title;       //封装书名属性
    private float price;        //封装价格属性
    public Book(String title,float price){      //构造方法
        this.setTitle(title);
        this.setPrice(price);
    }

    public void setTitle(String n){
        title=n;
    }   //获取书名的方法
    public String getTitle(){
        return title;
    }

    public void setPrice(float n){
        price=n;
    }    //获取价格方法
    public float getPrice(){
        return price;
    }

    public void setPerson(Person p){
        this.person=p;
    }   ////获取书的持有人
    public Person getPerson(){
        return person;
    }
}



public class muban {
    public static void main(String[] args){
        Person father=new Person("刘金东",18);     //实例化Person类为father
        Person child=new Person("罗钧元",19);      //实例化Person类为child
        Book kePu=new Book("《动物世界》",100);     //实例化Book类为kePu
        Book history=new Book("《上下五千年》",200);//实例化Book类为history

        father.setChild(child);     //设置对象间一对一关系，一个father有个child
        father.setBook(history);    //设置对象间一对一关系，一个father有本Book history
        child.setBook(kePu);        //设置对象间一对一关系，一个child有本Book kePu
        kePu.setPerson(child);      //设置对象间一对一关系，一本kePu被child持有
        history.setPerson(father);  //设置对象间一对一关系，一本history被father持有
        System.out.println("\n从孩子来找书——>\n"+"\t1.孩子的名字 "+child.getName()+"\t2.孩子的年龄 "+ child.getAge()+"\n"+
                "\t使用setter与getter方法得知  3.书的名字 "+child.getBook().getTitle()+
                "\t4.书的价格 "+child.getBook().getPrice()+"\n");

        System.out.println("\n从父亲来找书——>\n"+"\t1.父亲的名字 "+father.getName()+"\t2.父亲的年龄 "+ father.getAge()+"\n"+
                "\t使用setter与getter方法得知  3.书的名字 "+father.getBook().getTitle()+
                "\t4.书的价格 "+father.getBook().getPrice()+"\n");

        System.out.println("\n从书来找人——>\n"+"\t1.书的的名字 "+kePu.getTitle()+"\t2.书的价格 "+ kePu.getPrice()+"\n"+
                "\t书与人关联后,在使用getPerson方法后再次使用getName与getAge方法  3.人的名字 "+kePu.getPerson().getName()+
                "\t4.人的年龄 "+kePu.getPerson().getAge()+"\n");

        System.out.println("history找father也是类似");

    }
}