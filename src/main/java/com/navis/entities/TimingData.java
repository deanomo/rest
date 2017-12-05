package com.navis.entities;

import java.util.HashMap;

/**
 * Created by bursode on 11/17/2017.
 */
public class TimingData extends HashMap<String, Long> {

    public static TimingData getNewInstance() { return new TimingData(); }
}
