import java.Calender.*;
public class Time implements Comparable<Time>
{
    //variables
    private long time;
    private int hour; // JA: You don't need these
    private int minute;
    private int second;
    //calender
    public Time()
    {
        this.time = System.currentTimeMillis();
    }
    //set time
    public Time(long time)
    {
        this.time = time;
    }
    //constructor
    public Time(int hours, int minutes, int seconds)
    {
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
        // JA: These should be converted into time.
    }
    //setter
    public void setTime(long elapsedT)
    {
        this.time = elapsedT;

    }
    //getters with math
    public int getHour()
    {
        return (int)(this.time / (1000 * 60 * 60)) % 24;

    }
    public int getMinute()
    {
        return (int)(this.minute / (1000 * 60)) % 60;

    }
    public int getSecond()
    {
        return (int)(this.time / 1000) % 60;

    }
    //elapsed time
    public long getSeconds()
    {
        return this.time;

    }
    //to string method override
    @Override
    public String toString()
    {
        return this.hour + ":" + this.minute + ":" + this.second + "\n";
    }
    //compare to method
    @Override
    // JA: Difference between the two
    public int compareTo(Time o) {
        // compare times based on total seconds
        if (this.time < o.getSeconds())
        {
            return -1;
        }
        else if ( this.time > o.getSeconds())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
        
}
