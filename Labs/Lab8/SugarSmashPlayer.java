package Labs.Lab8;

public class SugarSmashPlayer
{
    // add private variables here
    int playerId;
    String screenName;
    int points;

    public SugarSmashPlayer()
    {
        // add constructor code here
        points = 0;
        playerId = 12345;
        screenName = "John";
    }
    public void setIdNumber(int num)
    {
        // add method code here
        playerId = num;
    }
    public void setName(String player)
    {
        // add method code here
        screenName = player;
    }
    public void setPoints(int pts)
    {
        // add method code here
        points = pts;
    }
    public void earnPoints()
    {
        // add method code here
        points  = points + 100;
    }
    public int getIdNumber()
    {
        // add method code here
        return playerId;
    }
    public String getName()
    {
        // add method code here
        return screenName;
    }
    public int getPoints()
    {
        // add method code here
        return points;
    }
}