package se.input.hiddenservice;

import se.input.BaseService;

public class Andreas extends BaseService {

    public String getMood() {
        return getRandomItem();
    }
}
