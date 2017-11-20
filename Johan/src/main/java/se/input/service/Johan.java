package se.input.service;

import com.input.utilities.Math;
import se.input.BaseService;
import se.input.hiddenservice.Andreas;

public class Johan extends BaseService {

    public String getMood() {
        return getRandomItem();
    }

    public String getAndreasMood() {
        Math.addTwo(2);
        return new Andreas().getMood();
    }
}
