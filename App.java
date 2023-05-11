public class App {
    public static void main(String[] args){
        //poin pertama
        Hero hero = new Hero();
        hero.move();
        hero.move("wake up");
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(3);
        System.out.println();

        //poin kedua
        Character char1 = new Hero();
        char1.move();
        Character char2 = new Enemy();
        char2.move();
        Character char3 = new Witch();
        char3.move();
        Character char4 = new Fighter();
        char4.move();
        System.out.println();

        //poin ketiga
        Character char5 = new Witch();
        char5.move();
        char5 = new Fighter();
        char5.move();
    }
}
