package Set7.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int h;
    private int min;

    public Time(int h, int min) {

        int t = h * 60 + min;

        this.h = t / 60;
        this.min = t % 60;
    }

    public Time(String s) {
        List<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                String num = "";
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num += s.charAt(i++);
                }
                l.add(Integer.parseInt(num));
            }
        }
        h = l.get(0);
        min = l.get(1);
    }

    @Override
    public String toString() {
        return "Time{" +
                h + " h " +
                min + " min" +
                '}';
    }

    public Time addTime(Time t) {
        int tmpH, tmpMin;
        tmpH = this.h + t.h;
        tmpMin = this.min + t.min;
        Time tmpT = new Time(tmpH, tmpMin);

        return tmpT;
    }

    public Time substractTime(Time t) {
        int tmpH, tmpMin;
        tmpH = this.h - t.h;
        tmpMin = this.min - t.min;
        Time tmpT = new Time(tmpH, tmpMin);

        return tmpT;
    }

    public Time multiplyTime(int x) {
        int tmpH = this.h * x;
        int tmpM = this.min * x;

        Time tmpT = new Time(tmpH, tmpM);

        return tmpT;
    }

    static Time sumTime(Time[] tab, int n) {
        int sumH = 0;
        int sumMin = 0;

        for (int i = 0; i < n; i++) {
            sumH += tab[i].h;
            sumMin += tab[i].min;
        }

        Time tmpT = new Time(sumH, sumMin);

        return tmpT;
    }

}


