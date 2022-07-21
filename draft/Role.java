package draft;

import java.util.Random;

public class Role {
    private String name;
    private int atk;
    private int blood;

    public Role(String name,int blood,int atk){
        this.name=name;
        this.blood = blood;
        this.atk=atk;
    }

    //攻击方式描述
    String []attackFunction={
        "%s使出了绝招【降龙十八掌】，直接让%s倒地不起",
            "%s大喝一声，使出了技能【无敌啪啪手】，直接打断了%s的双腿",
            "%s上前一步，对%s打出一招【卧虎藏龙】，让对手毫无招架之力",
            "%s使用了【东方华府】"
    };




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }


    public void Attack(Role attackedRole){

        Random random=new Random();
        int hurts=random.nextInt(this.atk*2)+this.atk;

        int index=random.nextInt(attackFunction.length);
        String kungFu=attackFunction[index];
        System.out.printf(kungFu,this.name,attackedRole.name);
        System.out.println();

        attackedRole.setBlood(attackedRole.getBlood()-hurts);
        attackedRole.blood= Math.max(attackedRole.blood, 0);
        System.out.println(this.name+"对"+attackedRole.name+"造成了"+hurts+"点伤害，"+attackedRole.name+"剩余血量为"+attackedRole.getBlood());
    }


}
