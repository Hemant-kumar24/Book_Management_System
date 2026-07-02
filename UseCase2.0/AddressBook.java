public class AddressBook {
    private Contact contact;
    public void addContact(Contact contact) {
        this.contact = contact;
    }
    public void displayContact() {
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("No Contact Found");
        }
    }
}