package AddressBook;

import java.util.List;
import java.util.Map;

public interface Functionalities {
    void add(ContactData contactData, String name);
    public Map<String,ContactData> delete(String name);
    List<String> find(String finder);
}
