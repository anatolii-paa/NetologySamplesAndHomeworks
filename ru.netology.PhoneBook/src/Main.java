import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addGroup("family");
        phoneBook.addGroup("work");

        Contact contact1 = new Contact("Anatolii", "+79250111222"); //family
        Contact contact2 = new Contact("Elena", "+79250999888"); //family+work
        Contact contact3 = new Contact("Kseniia", "+79860111222"); //family
        Contact contact4 = new Contact("Dad", "+79990999888"); //family
        Contact contact5 = new Contact("Aleksandr", "+77770333555"); //work
        Contact contact6 = new Contact("Andrey", "+79022949494"); //family+work

        phoneBook.addContact(contact1, "family");
        phoneBook.addContact(contact2, new String[]{"family", "work"});
        phoneBook.addContact(contact3, "family");
        phoneBook.addContact(contact4, "family");

        System.out.println("Найдем контакт " + contact1.getName() + " по номеру " + contact1.getMobilePhone() + " и получим: " + phoneBook.searchByPhone("+79250111222"));
        System.out.println("Найдем все контакты по группе: " + phoneBook.searchByGroup("family"));

        System.out.println("Добавим контакт в группу ");
        phoneBook.addContact(contact5, "work"); // добавим контакт в группу
        System.out.println("Найдем все контакты по группе: " + phoneBook.searchByGroup("work"));

        System.out.println("Добавим контакт в группу ");
        phoneBook.addContact(contact6, new String[]{"work", "family"}); //добавим контакт сразу в две группы
        System.out.println("Найдем все контакты по группе: " + phoneBook.searchByGroup("family"));
    }
}