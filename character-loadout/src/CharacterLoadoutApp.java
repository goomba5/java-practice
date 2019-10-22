import slots.KineticWeapon;

import java.util.ArrayList;
import java.util.List;

public class CharacterLoadoutApp {
    public static void main(String[] args) {
    /*Kinetic Slot */
    List<KineticWeapon> kineticWeapons = new ArrayList<>();


    KineticWeapon kineticOne = new KineticWeapon(1, "Randy's Throwing Knife",
            "I'm taking the left flank!", 951,
            false, false, true);
    KineticWeapon kineticTwo = new KineticWeapon(2, "Outbreak Perfected",
                "<NEW DIRECTIVE:> ~~* consume enhance terminate *~~", 949,
                false, true, false);
    KineticWeapon kineticThree = new KineticWeapon(3, "Ace of Spades",
                "Never fold.", 947,
                false, true, false);

    if(kineticWeapons.size() > 9){
        System.out.println("Kinetic slot cannot hold anymore weapons.");
    }

    kineticWeapons.add(kineticOne);
    kineticWeapons.add(kineticTwo);
    kineticWeapons.add(kineticThree);

    }
    public static String equipKineticWeapon(KineticWeapon kw){
        String value = "";
        if(kw.isExotic()){
            System.out.println("You cannot equip ");
        }

        return value;
    }
}
