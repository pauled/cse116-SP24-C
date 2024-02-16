package week4;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> members;
    private int battlesWon;

    public Party(){
        this.battlesWon=0;
        this.members=new ArrayList<>();
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
    public String toString(){
        String out="battles won: "+this.battlesWon;
        for (int x=0; x<this.members.size(); x++){
            out+="\n "+this.members.get(x);
        }
        return out;
    }
    public static void main(String[] args) {
        Character hero1=new Character();
        Character hero2=new Character();
        hero2.winBattle(5);
        Party party=new Party();
        party.addMember(hero1);
        party.addMember(hero2);
        party.winBattle(10);
        System.out.println(party);
    }
}
