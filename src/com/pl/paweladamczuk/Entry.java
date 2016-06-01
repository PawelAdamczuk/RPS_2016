package com.pl.paweladamczuk;

import java.util.List;

/**
 * Created by pawel on 6/1/16.
 */
public class Entry {
    public int timestamp;
    public int address;
    public int user;
    public List<Integer> eTypes;
    public int eTypeCount;
    public boolean singleEType;
    public int eType;

    public Entry(int timestamp, int address, int user, List<Integer> eTypes) {
        this.timestamp = timestamp;
        this.address = address;
        this.user = user;
        this.eTypes = eTypes;
        this.eTypeCount = eTypes.size();

        if(eTypes.size() == 1)
        {
            this.singleEType = true;
            this.eType = eTypes.get(0);
        }
        else
        {
            this.singleEType = false;
            this.eType = 0;
        }

    }
}
