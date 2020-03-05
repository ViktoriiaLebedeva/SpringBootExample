package org.example.two;

import org.example.three.Three;

import java.util.List;

public interface Two {

    void createUser(Three newThree);

    boolean deleteUser(Three three);

    List<Three> getAll();
}
