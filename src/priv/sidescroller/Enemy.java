package priv.sidescroller;
//import static java.lang.Math.random;

/**
 * Created with IntelliJ IDEA.
 * User: Welf
 * Date: 05.08.13
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
public class Enemy {
  int classs, weapon, agi, str, wis, x=Main.w, y, p;


    /**
     * @brief Konstruktor ohne Parameter
     *
     * Dieser Konstrukter erstellt einen zufälligen Gegner
     */
    Enemy() {
        setRandomClass();
        setRandomPosition();
    }

    /**
     * @brief Methode zum zufällien auswählen einer Klasse
     */
    public void setRandomClass() {
        int r = (int)(Math.random() * 3);
        setClasss(r);
    }

    /**
     * @brief Methode zum festlegen einer Klasse
     *
     * @param Integer c mit Ziffer der Klasse
     */
    public void setClasss(int c) {

        classs = c;
        switch (c) {
            case 0: agi = 50;                 // Hunter
                    str = 30;
                    wis = 20;
                break;
            case 1: agi = 20;                 // Warrior
                    str = 50;
                    wis = 30;
                break;
            case 2: agi = 30;                 // Mage
                    str = 20;
                    wis = 50;
                break;
            default: break;
        }
    }

    /**
     * @brief Get-Methode für die Klasse
     *
     * @return Integer classs als Ziffer für die KLasse
     */
    public int getClasss() {
        return classs;
    }

    /**
     * @brief Methode zum zufällien auswählen der Position
     */
    public void setRandomPosition() {
        int r = (int)(Math.random() * (Main.h-10))+10;
        p = r;
        setPosition(r);
    }

    /**
     * @brief Methode zum festlegen der Position
     *
     * @param Integer p mit ZIffer der Position
     */
    public void setPosition(int p) {
        y = p;
    }

    /**
     * @brief Get-Methode für die Position
     *
     * @return Integer y als Ziffer für die Position
     */
    public int getPosititon() {
        return p;
    }

    /**
     * @brief Methode zum zufällien auswählen einer Waffe
     */
    public void setRandomWeapon() {
        int r = (int)(Math.random() * 4);
        setWeapon(r);
    }

    /**
     * @brief Methode zum festlegen der Waffe
     *
     * @param Integer w mit ZIffer der Waffe
     */
    public void setWeapon(int w) {
        weapon = w;
    }

    /**
     * @brief Get-Methode für die Waffe
     *
     * @return Integer weapon als Ziffer für die Waffe
     */
    public int getWeapon() {
        return weapon;
    }
}
