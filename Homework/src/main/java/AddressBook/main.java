package AddressBook;

public class main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Storage storage = new Storage();

        ContactData contactData = new ContactData("Victoriei nr 49", "0743932180","alexmicle89@gmail.com");
        ContactData contactData2 = new ContactData("Viile Apei nr 8", "0743932180","mihaimarcel@gmail.com");
        ContactData contactData3 = new ContactData("Ciresilor nr 2", "072245679","alexmicle@gmail.com");
        ContactData contactData4 = new ContactData("Somcuta Apei nr 2", "0743932180","vasivasi@gmail.com");


        addressBook.add(contactData, "Alex");
        addressBook.add(contactData2, "Mihai");
        addressBook.add(contactData3, "Marius");
        addressBook.add(contactData4, "Dora");
        storage.store(addressBook);

        addressBook.find("Mihai");
        addressBook.delete("Dora");

    }
}
