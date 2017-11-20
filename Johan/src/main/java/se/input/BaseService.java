package se.input;

import java.util.Random;

public abstract class BaseService {

    public abstract String getMood();

    public String getRandomItem() {
        Random random = new Random();
        int moodInt = random.nextInt(2);

        String mood = null;
        switch (moodInt) {
            case 0:
                mood = "Happy";
                break;
            case 1:
                mood = "Sad";
                break;
        }
        return mood;
    }
}
