import java.util.*;

class time {
    int hour, minute, second;

    time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    time timeSum(time t1, time t2) {
        int hour = 0, min = 0;
        time finalTime = new time(0, 0, 0);

        finalTime.minute = t1.minute + t2.minute;
        finalTime.second = t1.second + t2.second;
        finalTime.hour = t1.hour + t2.hour;

        min = finalTime.second / 60;
        finalTime.second = finalTime.second % 60;
        hour = finalTime.minute / 60;
        finalTime.minute = (finalTime.minute % 60) + min;
        finalTime.hour = finalTime.hour + hour;

        return finalTime;
    }

    void showTime(time t) {
        System.out.println("Ans : " + t.hour + " " + t.minute + " " + t.second);
    }
}

public class time_adding {
    public static void main(String[] args) {
        time t1 = new time(18, 27, 36);
        time t2 = new time(22, 53, 48);
        time t = new time(0, 0, 0);
        t.showTime(t.timeSum(t1, t2));
    }
}
