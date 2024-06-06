package week3;

public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    // Overloading {
    // constructor
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    // constructor
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
    // }

    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0)
        {
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime()
    {
        return displayString;
    }

    public void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}