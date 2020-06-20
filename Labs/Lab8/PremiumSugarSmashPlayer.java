package Labs.Lab8;
// extend SugarSmashPlayer as PremiumSugarSmashPlayer here
public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
    // declare private variables here
    int boosters;

    public PremiumSugarSmashPlayer()
    {
        // add constructor code here
        boosters = 3;
    }

    // override (public!) earnPoints() method here
    @Override
    public void earnPoints()
    {
        // add method code here
        if (boosters != 0) {
            points += 500;
            boosters = boosters - 1;
        } else {
            System.out.println("Out of boosters!");
            points += 100;
        }

    }

    public void buyBoosters()
    {
        // add method code here
        boosters += 3;
    }
}