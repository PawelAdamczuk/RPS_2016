package com.pl.paweladamczuk;

import java.util.List;

/**
 * Created by pawel on 6/1/16.
 */
public class Entry {
    public int id;
    public int timestamp;
    public int address;
    public int user;
    public List<Integer> eTypes;
    public int eTypeCount;
    public boolean singleEType;
    public int eType;

    public Entry(int id, int timestamp, int address, int user, List<Integer> eTypes) {
        this.timestamp = timestamp;
        this.address = address;
        this.user = user;
        this.eTypes = eTypes;
        this.eTypeCount = eTypes.size();
        this.id = id;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.id);
        result.append(" ");
        result.append(this.timestamp);
        result.append(" ");
        result.append(this.address);
        result.append(" ");
        result.append(this.user);
        result.append(" ");
        result.append(this.eTypeCount);

        return result.toString();
    }

    public String eTypesString() {
        StringBuilder result = new StringBuilder();
        result.append(this.id);
        result.append(" ");
        for (int i = 0; i < eTypeCount; i++) {
            result.append(this.eTypes.get(i));
            result.append(" ");
        }
        return result.toString();
    }
}
