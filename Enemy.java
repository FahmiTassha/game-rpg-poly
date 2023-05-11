public class Enemy extends Character {


    @Override
    public void move(){
        System.out.println("Enemy sleep");
    }

    public void move(int step){
        System.out.println("Enemy woke up after " + step + " hours");
    }
}
