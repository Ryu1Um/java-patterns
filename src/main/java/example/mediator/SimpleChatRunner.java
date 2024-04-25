package example.mediator;

public class SimpleChatRunner {

    public static void main(String[] args) {
        var chat = new SimpleTextChat();

        var admin = new Admin(chat, "Admin");
        var user1 = new SimpleUser(chat, "User 1");
        var user2 = new SimpleUser(chat, "Users 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        user1.sendMessage("Hello, I am User1!!!");

    }
}
