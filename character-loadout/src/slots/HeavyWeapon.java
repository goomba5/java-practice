package slots;

public class HeavyWeapon {
    int id;
    String weaponName;
    String weaponFlavorText;
    int powerLevel;
    boolean isEnergy;
    boolean isExotic;
    boolean isEquipped;

    public HeavyWeapon(int id, String weaponName, String weaponFlavorText,
                       int powerLevel, boolean isEnergy,
                       boolean isExotic, boolean isEquipped) {
        this.id = id;
        this.weaponName = weaponName;
        this.weaponFlavorText = weaponFlavorText;
        this.powerLevel = powerLevel;
        this.isEnergy = isEnergy;
        this.isExotic = isExotic;
        this.isEquipped = isEquipped;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponFlavorText() {
        return weaponFlavorText;
    }

    public void setWeaponFlavorText(String weaponFlavorText) {
        this.weaponFlavorText = weaponFlavorText;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public boolean isEnergy() {
        return isEnergy;
    }

    public void setEnergy(boolean energy) {
        isEnergy = energy;
    }

    public boolean isExotic() {
        return isExotic;
    }

    public void setExotic(boolean exotic) {
        isExotic = exotic;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}
