package week6;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class BankTest {
    public boolean compareAccounts(BankAccount b1,BankAccount b2){
        if (b1.getAccountHolder()!=b2.getAccountHolder()){
            return false;
        }
        if (Math.abs(b1.checkAccount()-b2.checkAccount()) > .001){
            return false;
        }
        return true;
    }
    public boolean compareBAArrays(ArrayList<BankAccount> a1,ArrayList<BankAccount> a2){
        if (a1.size()!=a2.size()){
            return false;
        }
        for (BankAccount b1 : a1){
            boolean found=false;
            for (BankAccount b2 : a2){
                if (compareAccounts(b1,b2)){
                    found=true;
                }
            }
            if (!found){
                return false;
            }
        }
        return true;
    }
    @Test
    public void testCompare(){
        BankAccount b1=new BankAccount("A",1);
        BankAccount b2=new BankAccount("A",1);
        BankAccount b3=new BankAccount("B",1);
        BankAccount b4=new BankAccount("A",2);
        assertTrue("accounts same",compareAccounts(b1,b2));
        assertFalse("different owner",compareAccounts(b1,b3));
        assertFalse("different balance",compareAccounts(b1,b4));
        assertFalse("different both",compareAccounts(b4,b3));
    }
    @Test
    public void testBank(){
        Bank banksy=new Bank();
        banksy.addAccount(new BankAccount("A",1));
        banksy.addAccount(new BankAccount("B",2));
        banksy.addAccount(new BankAccount("C",3));

        ArrayList<BankAccount> accounts=new ArrayList<>();
        accounts.add(new BankAccount("A",1));
        accounts.add(new BankAccount("B",2));
        accounts.add(new BankAccount("C",3));

        //test the same
        assertTrue("same values",compareBAArrays(banksy.getAccounts(),accounts));
        accounts.add(new BankAccount("D",3));
        //test differnet
        assertFalse("extra account",compareBAArrays(banksy.getAccounts(),accounts));
        banksy.addAccount(new BankAccount("E",4));
        banksy.addAccount(new BankAccount("D",3));
        accounts.add(new BankAccount("E",4));
        assertTrue("same vvallues different order",compareBAArrays(banksy.getAccounts(),accounts));
    }
    @Test
    public void testBankAccount(){
        BankAccount B1=new BankAccount("A",100);
        assertEquals("checking account holder","A",B1.getAccountHolder());
    }
}
