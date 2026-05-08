package src;


public class LogDecorator extends NotificationDecorator {
 
 public LogDecorator(Notification notification) {
     super(notification);
 }

 @Override
 public void sendMessage(String message, String target) {
     
     String timestamp = java.time.LocalDateTime.now().toString();
     String loggedMessage = "[LOG - " + timestamp + "] " + message;
     

     super.sendMessage(loggedMessage, target);
 }
}
