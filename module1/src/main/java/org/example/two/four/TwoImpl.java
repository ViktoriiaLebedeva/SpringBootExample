package org.example.two.four;

import org.example.three.Three;
import org.example.two.Two;

import java.util.ArrayList;
import java.util.List;

public class TwoImpl implements Two {

    List<Three> entities = new ArrayList<>();

    public TwoImpl() {
        entities.add(new Three("sjdhfkdsf", (byte) 21));
    }

    @Override
    public void createUser(Three newThree) {
        entities.add(newThree);
    }

    @Override
    public boolean deleteUser(Three three) {
        return false;
    }

    @Override
    public List<Three> getAll() {
        return entities;
    }
}
