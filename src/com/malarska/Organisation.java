package com.malarska;

import java.util.ArrayList;
import java.util.Iterator;

public class Organisation<T extends Person> {
    private ArrayList<T> participants;

    public Organisation() {
        participants = new ArrayList<T>();
    }

    public void addParticipant(T p) {
        participants.add(p);
    }

    public T getParticipant(int index) {
        return participants.get(index);
    }

    public void printAllParticipants() {
        Iterator<T> iterator = participants.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
