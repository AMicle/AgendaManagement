package AddressBook;

import java.util.*;

public class AddressBook implements Functionalities {
    Map<String,ContactData> dataSet= new HashMap<>();

    @Override
    public void add(ContactData contactData, String name) {
        dataSet.put(name, contactData);
    }

    public void getDataSet() {
        for(Map.Entry<String, ContactData> entry: dataSet.entrySet()){
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Name : " + key + " Value : " + value);
        }
    }

    public void getOnlyName() {
        for(Map.Entry<String, ContactData> entry: dataSet.entrySet()){
            String key = entry.getKey();
            System.out.println("Name : " + key);
        }
    }


    @Override
    public Map<String,ContactData> delete(String name) {

        for (Iterator<Map.Entry<String, ContactData>> i = dataSet.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry<String, ContactData> e = i.next();
            if (e.getKey().contains(name)) {
                i.remove();
            }
        }
        System.out.println("The contact " + name + " has been removed, the list of the remaining contacts will be displayed below...");
        getDataSet();
        return dataSet;
    }

    @Override
    public List<String> find(String finder) {
        List<String> currentContact =new ArrayList<>();
        for (Iterator<Map.Entry<String, ContactData>> i = dataSet.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry<String, ContactData> e = i.next();
            if (e.getKey().contains(finder)) {
                System.out.println("The contact for the name " + finder + " is: " + e.getValue());
            }
        }
        return currentContact;
    }

}
