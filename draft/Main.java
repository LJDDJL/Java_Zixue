package draft;

public class Main {

    public static void main(String []args){
        Role role1=new Role("刘金东",20,4);
        Role role2=new Role("撒旦",20,4);



        while(true){
            role1.Attack(role2);
            if(role2.getBlood()==0){
                System.out.println(role1.getName()+"获胜，游戏结束");
                break;
            }

            try{
                Thread.sleep(2000);
            }catch (Exception e){
                System.exit(0);
            }

            role2.Attack(role1);
            if(role1.getBlood()==0){
                System.out.println(role2.getName()+"获胜，游戏结束");
                break;
            }
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                System.exit(0);
            }
        }




    }

}
