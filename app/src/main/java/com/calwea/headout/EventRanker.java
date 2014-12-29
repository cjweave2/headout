package com.calwea.headout;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by calwea on 12/23/2014.
 */
public class EventRanker {
    public static void rankEventList(ArrayList events){
        int n = 100; // Number gotten from db

        for (int i = 0; i < events.size(); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rankEvent((Event)events.get(j)) > rankEvent((Event)events.get(j+1))) /* For descending order use < */
                {
                    Event swap = (Event)events.get(j);
                    events.set(j, (Event)events.get(j+1));
                    events.set(j+1, swap);
                }
            }
        }
    }
    public static double rankEvent(Event e){
        double rank = 0;
        int score = e.getMaxAttending() - e.getMinAttending();
        rank = Math.log(Math.max(Math.abs(score), 1));
        double sign;
        if (score>0) sign = 1;
        else if (score<0) sign = -1;
        else sign = 0;
        return Math.round(rank * sign);
    }


    public static void main(String[] args){
        ArrayList events = new ArrayList();
        events.add(new Event(1,"a","a","a", 45,45, 5,7,new Date(), new ArrayList()));
        EventRanker ranker = new EventRanker();
    }
}
