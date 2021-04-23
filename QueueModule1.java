package helloworld;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Event {
    public String userId;
    public String eventType;

    public Event(String userId, String eventType) {
        this.userId = userId;
        this.eventType = eventType;
    }

    public void sendAsEmail() {
        System.out.println("Sent email to " + userId + " for event " + eventType);
    }

    public void sendAsPushNotification() {
        System.out.println("Sent push notification to " + userId + " for event " + eventType);
    }

}
public class QueueModule1 {
    static Stack<Event> pushNotificationStack = new Stack<Event>();
    static Queue<Event> emailQueue = new LinkedList<Event>();

    public static void storeEvent(Event event, String channel) {
        // Write code here
        if (channel.equals("email")) {
            emailQueue.add(event);
        } else {
            pushNotificationStack.push(event);
        }
    }

    public static void sendEmails() {
        // Write code here
        while (!emailQueue.isEmpty()) {
            emailQueue.remove().sendAsEmail();
        }
    }

    public static void sendPushNotifications() {
        // Write code here
        while (!pushNotificationStack.isEmpty()) {
            pushNotificationStack.pop().sendAsPushNotification();
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String event_stream = scanner.nextLine();
//        for (String event : event_stream.split(" ")) {
//            String eventType = event.split("_")[0];
//            switch (eventType) {
//                case "sendMails":
//                    sendEmails();
//                    break;
//                case "sendPushNotifications":
//                    sendPushNotifications();
//                    break;
//                default:
//                    String userId = event.split("_")[1];
//                    String channel = event.split("_")[2];
//                    storeEvent(new Event(userId, eventType), channel);
//                    break;
//            }
//        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(6);
        q.add(7);
        q.add(5);

        boolean result = checkSorted(q);
        System.out.println(result);

    }

    public static boolean checkSorted(Queue<Integer> q) {
        int size = q.size();
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q1 = new LinkedList<>();
        int expectedValue = 1;
        while(!q.isEmpty()){
            int temp = q.remove();
            if(temp == expectedValue){
                q1.add(temp);
                expectedValue++;
            }
            else{
                if(!s.isEmpty()) {
                    if(s.peek()<temp){
                        return false;
                    }
                    else{
                        s.push(temp);
                    }
                }
                else{
                    s.push(temp);
                }
            }
            while(!s.isEmpty() && s.peek() == expectedValue){
                q1.add(s.pop());
                expectedValue++;
            }
        }
        if(expectedValue-1 == size && s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}


