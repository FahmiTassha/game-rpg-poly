public class Hero extends Character {
    

    @Override
    public void move(){
        System.out.println("Hero sleep");
    }

    public void move(String direction){
        System.out.println("Hero " + direction);
    }
}
