//June5

public class Time 
{
    private int hours;
    private int minutes;
    private int seconds;

    public Time() //1st constructor
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    public Time(int hours, int minutes, int seconds) //2nd constructor
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void setHours(int h)
    {
        this.hours = h;
    }
    public void setMinutes(int m)
    {
        this.minutes = m;
    }
    public void setSeconds(int s)
    {
        this.seconds = s;
    }
    public int getHours()
    {
        return hours;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public int getSeconds()
    {
        return seconds;
    }
    public String toString()
    {
        return "This time is " + hours + ":" + minutes + ":" + seconds;
    }
}
