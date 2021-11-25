package com.udemy.InterfaceChallenge;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read (List<String> savedValues);

}
