import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, List<Contact>> contacts = new TreeMap<>();

    public void addGroup(String groupName) {
        contacts.put(groupName, new ArrayList<>());
    }

    public void addContact(Contact contact, String group) {
        if (contacts.containsKey(group)) {
            contacts.get(group).add(contact);
        }
    }

    public void addContact(Contact contact, String[] groups) {
        for (String group : groups) {
            addContact(contact, group);
        }
    }

    public List<Contact> searchByGroup(String group) {
        if (contacts.containsKey(group)) {
            return contacts.get(group);
        } else {
            return new ArrayList<>();
        }
    }

    public Contact searchByPhone(String phone) {
        for (List<Contact> groupContacts : contacts.values()) {
            for (Contact contact : groupContacts) {
                if (contact.getMobilePhone().equals(phone)) {
                    return contact;
                }
            }
        }
        return null;
    }
}
