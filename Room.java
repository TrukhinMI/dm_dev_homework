package hw7;

import java.sql.SQLOutput;

public class Room {
    private boolean passage;


    public Room(boolean passage) {
        this.passage = passage;
    }

    public boolean isPassage() {
        return passage;
    }

    public void print(){
        if (isPassage()){
            System.out.println("Комната проходная");
        }else {
            System.out.println("Комната не проходная");
        }
    }
}
