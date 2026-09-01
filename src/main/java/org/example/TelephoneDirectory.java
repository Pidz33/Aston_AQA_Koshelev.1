package org.example;

import java.util.*;

public class TelephoneDirectory {
    private Map<String, List<String>> directory;

    public TelephoneDirectory() {
        directory = new HashMap<>();
    }
    public void add(String surname, String phoneNumber) {
        if(!directory.containsKey(surname)) {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            directory.put(surname, phones);
        } else {
            List<String> phones = directory.get(surname);
            if(!phones.contains(phoneNumber)) {
                phones.add(phoneNumber);
            }
        }
    }

    public List<String> get(String surname) {
        List<String> phones = directory.get(surname);
        if (phones == null) {
            return Collections.emptyList();
        }
        return phones;
    }
}