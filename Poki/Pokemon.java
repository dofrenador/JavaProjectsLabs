package Poki;
public class Pokemon
{
    // Variables
    private String species;
    private int speed;
    private int attack;
    private int defense;

    // Constructor
    public Pokemon(String species)
    {
        setSpecies(this.species = species);
        setAttack( species.length() * 4 + 2 );
        setDefense( species.length() * 2 + 7 );
        setSpeed( species.length() * 3 + 5);
    }

    // Methods

    /*
    * When called, the setAttack method will set the attack
    * variable to whatever value is passed to the method.
    */

    public void setAttack(int newAttack)

    {
        attack = newAttack;
    }

    /*
    * When called, the setSpeed method will set the speed variable
    * to whatever value is passed to the method.
    */

    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }

    /*
    * When called, the setDefense method will set the defense
    * variable to whatever value is passed to the method.
    */

    public void setDefense(int newDefense)
    {
        defense = newDefense;
    }
    /*
    * When called, the setSpecies method will set the species variable
    * to whatever value is passed to the method.
    */

    public void setSpecies(String newSpecies)
    {
        this.species = newSpecies;
    }

    /*
    * When called, the getSpeed method will return the speed
    * variable.
    */

    public int getSpeed()
    {
        return speed;
    }

    /*
    * When called, the getAttack method will return the attack
    * variable.
    */

    public int getAttack()
    {
        return attack;
    }

    /*
    * When called, the getDefense method will return the defense
    * variable.
    */

    public int getDefense()
    {
        return defense;
    }

    /*
    * When called, the getSpecies method will return the species
    * variable.
    */

    public String getSpecies()
    {
        return species;
    }

    /*
    * When called, the evolve method will double the speed stat,
    * triple the attack stat, and multiply the defense stat by 5.
    */

    public void evolve()
    {
        speed = 2 * speed;
        attack = 3 * attack;
        defense = 5 * defense;
    }

}
