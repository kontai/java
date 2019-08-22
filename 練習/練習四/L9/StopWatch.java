package 練習.練習四.L9;
import java.util.GregorianCalendar;

public class StopWatch {
    private GregorianCalendar startTime;
    private GregorianCalendar endTime;

    public StopWatch()
    {
        this.startTime=new GregorianCalendar();
        this.endTime=new GregorianCalendar();
    }

    public void start()
    {
        this.startTime=new GregorianCalendar();
    }

    public void stop()
    {
        this.endTime=new GregorianCalendar();
    }

    public long getElapsedTime()
    {
        return this.endTime.getTimeInMillis()-this.startTime.getTimeInMillis();
    }
}
