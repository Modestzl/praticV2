package sprint05.t34.p3.zd2;

import java.util.ArrayList;

// Ограничьте класс ContactBook так, чтобы он могу хранить в себе только список контактов
public class ContactBook extends Contact {
        public ContactBook() {
                super(name);
        }
        // Объявите поле класса contacts - список контактов книги
        ...

public void addContact(ArrayList<> contact) {
        contacts.add(contact);
        }

public void printList() {
        // Выведите на экран весь список контактов книги
        ...
        System.out.println("Имя: " + contact.getName());
        contact.print();
        }

public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        ...
        System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
        contact.sendMessage();

        // Если контакт не найден, выведите соответствующее сообщение
        System.out.println("Не найден контакт с указанным именем.");
        }

        }