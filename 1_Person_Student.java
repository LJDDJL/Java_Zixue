
class Student{      //创造一个student类
    public Student(String name,String number,int math,int english,int computer){        //构造方法为属性赋值
        this.setName(name);
        this.setNumber(number);
        this.setMath(math);
        this.setEnglish(english);
        this.setComputer(computer);
    }


    private String name;    //private 姓名属性，无法被其他类直接调用
    private String number;  //private 编号属性，无法被其他类直接调用
    private int math;       //private 数学成绩属性，无法被其他类直接调用
    private int english;    //private 英语成绩属性，无法被其他类直接调用
    private int computer;   //private 计算机程序属性，无法被其他类直接调用

    //姓名的setter和getter
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    //编号的setter和getter
    public void setNumber(String n){
        number=n;
    }
    public String getNumber(){
        return number;
    }

    //数学成绩的setter和getter
    public void setMath(int n){
        math=n;
    }
    public int getMath(){
        return math;
    }

    //英语成绩的setter和getter
    public void setEnglish(int n){
        english=n;
    }
    public int getEnglish(){
        return english;
    }

    //计算机成绩的setter和getter
    public void setComputer(int n){
        computer=n;
    }
    public int getComputer(){
        return computer;
    }

    //总成绩
    public float sum(){
        return math+english+computer;
    }

    //平均成绩
    public float average(){
        return this.sum()/3;
    }

    //最高成绩
    public float max(){
        float max=math;
        max=max>english?math:english;
        max=max>computer?max:computer;

        return max;
    }

    //最低成绩
    public float min(){
        float min=math;
        min=min<english?math:english;
        min=min<computer?min:computer;

        return min;
    }

    public void print(){
        System.out.print("姓名: "+this.getName()+"\n编号 "+getNumber()+"\n数学成绩："+getMath()+"\n英语成绩"+getEnglish()+
                "\n计算机成绩："+getComputer()+"\n总成绩、平均成绩、最高科目成绩、最低科目成绩分别为"+
                sum()+" "+average()+" "+max()+" "+min());
    }
}


//测试调用类别中的方法是否可行
public class muban{
    public static void main(String[] args){
        Student stu=new Student("罗均元","12",95,89,96);
        stu.print();
    }
}
