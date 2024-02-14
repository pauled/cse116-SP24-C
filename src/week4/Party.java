package week4;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> members;
    private int battlesWon;

    public Party(){
        battlesWon=0;
        members=new ArrayList<>();
    }
    public void addMember(Character member){
        this.members.add(member);
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0; x<this.members.size(); x++){
            this.members.get(x).winBattle(xp);
        }
    }
}
