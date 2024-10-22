package sprint05.t34.p3.zd2;
// Дополните объявление класса Contact
public abstract class Contact {
        // Класс должен содержать одно полe - имя пользователя name
        private  final String name;

    protected Contact(String name) {
        this.name = name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
        public abstract  void sendMessage();
        public abstract void print();

        }