package AddressBook;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    Map<Integer,AddressBook> storeAddresses= new HashMap<>();
    int counter=0;



    public boolean store(AddressBook addressBook){
        storeAddresses.put(counter,addressBook);
        counter++;
        if(storeAddresses.isEmpty()){
            return false;
        }
        else return true;
    }
}
