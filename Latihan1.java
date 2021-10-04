class Player{
    String name;
    double health;
    int level;
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

public class Latihan1{

    public static void main(String[] args) {
        
        Player player1 = new Player("Hanzo",100);
        Player player2 = new Player("Zhao Yun",200);

        Weapon pedang = new Weapon("Pedang",40);
        Weapon golok = new Weapon("Golok",80);

        Armor OrochiArmor = new Armor("Orochi armor",50);
        Armor ZirahBesi = new Armor("Zirah besi",20);
        
        player1.equipWeapon(pedang);
        player1.equipArmor(OrochiArmor);
        player1.display();

        player2.equipWeapon(golok);
        player2.equipArmor(ZirahBesi);
        player2.display();
    }
}