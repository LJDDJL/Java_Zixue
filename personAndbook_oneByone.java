//类一一对应关系-例题


//定义Person类
class Person{
    private Book book;          //一个人有一本书，所以Book也算Person的属性，封装Book属性
    private String address;     //封装地址属性
    private int age;            //封装年龄属性
    public Person(String address,int age){      //构造方法
        this.setAddress(address);
        this.setAge(age);
    }

    public void setAddress(String n){     //获取书名方法
        address=n;
    }
    public String getAddress(){
        return address;
    }

    public void setAge(int n){      //获取价格方法
        age=n;
    }
    public int getAge(){
        return age;
    }

    public void setBook(Book b){    //获取本人的书
        this.book=b;
    }
    public Book getBook(){
        return book;
    }

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

    public void setTitle(String n){     //获取书名方法
        title=n;
    }
    public String getTitle(){
        return title;
    }

    public void setPrice(float n){      //获取价格方法
        price=n;
    }
    public float getPrice(){
        return price;
    }

    public void setPerson(Person p){    //获取书的人
        this.person=p;
    }
    public Person getPerson(){
        return person;
    }
}

public class muban {
    public static void main(String[] args){
        Person student=new Person("知行7舍",19);
        Book bk=new Book("《动物世界》",100);
        student.setBook(bk);
        bk.setPerson(student);
        System.out.println("\n从人来找书——>\n"+"\t1.书的价格 "+student.getBook().getPrice()+" \n(此处所用方法是在person类中使用getBook" +
                "\n方法，然后再调用Book类中的getPrice方法," +
                "\n这能调用的原因是Person类与Book类已经关联)\n"+"\n"+"\t2.书的名字 "+student.getBook().getTitle()
        +"\n");
        System.out.println("从书来找人——>\n"+"\t1.所属人的地址 "+bk.getPerson().getAddress()+"\n"+
                "\t2.所属人年龄 "+bk.getPerson().getAge());
    }
}
