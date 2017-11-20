package se.input.service;

import se.input.BaseService;
import se.input.hiddenservice.Andreas;

public class Johan extends BaseService {

    public String getMood() {
        return getRandomItem();
    }

    public String getAndreasMood() {
        return new Andreas().getMood();
    }
}
