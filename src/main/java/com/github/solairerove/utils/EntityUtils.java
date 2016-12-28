package com.github.solairerove.utils;

import com.github.solairerove.domain.Model;

import java.util.ArrayList;
import java.util.Collection;

import static org.apache.commons.lang3.RandomStringUtils.random;

public class EntityUtils {

    private static final int NUMBER_OF_ENTITIES_IN_COLLECTION = 15;

    private static final int MAX_STRING_LENGTH = 25;

    private static String getRandomString() {
        return random(MAX_STRING_LENGTH, true, true);
    }

    private static Model generateModel() {
        Model model = new Model();
        model.setFirstField(getRandomString());
        model.setSecondField(getRandomString());

        return model;
    }

    public static Collection<Model> generateModelCollection() {
        Collection<Model> models = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ENTITIES_IN_COLLECTION; i++) {
            models.add(generateModel());
        }

        return models;
    }
}
