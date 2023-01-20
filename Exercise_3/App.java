public class App {

    public static void main(String[] args) {



        Character knight = new Character();



        knight.strength = 10;

        knight.agility = 5;

        knight.intelligence = 0;

        knight.name = "Chen";

        knight.sayMyName();



        Character mage = new Character();



        mage.strength = 0;

        mage.agility = 5;

        mage.intelligence = 10;

        mage.name = "Akasha";

        mage.sayMyName();



        Character thief = new Character();



        thief.strength = 5;

        thief.agility = 10;

        thief.intelligence = 0;

        mage.name = "Gondar";

        thief.sayMyName();



        Character swordsman = new Character();



        swordsman.strength = 5;

        swordsman.agility = 10;

        swordsman.intelligence = 0;

        swordsman.name = "panday";

        swordsman.sayMyName();

       

        Weapon pandaysword = new Weapon();



        pandaysword.name = "pandaysword";

        pandaysword.damage = 180;

        pandaysword.rarity = "legendary";

        pandaysword.myWeapon();

       

        swordsman.Attack();

        System.out.println(pandaysword.showNameandRarity());

        pandaysword.addDamge(0);

       





       



       




       

     







    }

}
