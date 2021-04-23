package helloworld;
import java.util.*;
import java.util.Stack;

class Movie {
    public String title;
    public int rating;

    public Movie(String title) {
        this.title = title;
        this.rating = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        System.out.println("Giving " + rating + " star(s) to the movie " + this.title);
        this.rating = rating;
    }
}


public class QueueModule {
//    static Queue<Integer> q = new LinkedList<Integer>();

    static Stack<Event> pushNotificationStack = new Stack<Event>();
    static Queue<Event> emailQueue = new LinkedList<Event>();

    public static void storeEvent(Event event, String channel) {
        // Write code here
        event.sendAsEmail();
        event.sendAsPushNotification();

    }

    public static void sendEmails() {
        // Write code here
        emailQueue.add(pushNotificationStack.pop());
    }

    public static void sendPushNotifications() {
        // Write code here
        pushNotificationStack.push(emailQueue.remove());

    }
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            queue.add(s.nextInt());
//        printFifthElementFromEnd(queue);

//        Queue<Integer> queue = new LinkedList<Integer>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            queue.add(s.nextInt());
//        deleteSecondHalf(queue);

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int j = 0; j < n; j++) {
//            q.add(in.nextInt());
//        }
//        reverse(q);

//        Scanner scanner = new Scanner(System.in);
//        Movie movie1 = new Movie("Dangal");
//        Movie movie2 = new Movie("Gangs of Wasseypur");
//        Movie movie3 = new Movie("Tubelight");
//        Movie movie4 = new Movie("Padvamat");
//
//        Queue<Movie> movieQueue = new LinkedList<Movie>();
//        movieQueue.add(movie1);
//        movieQueue.add(movie2);
//        movieQueue.add(movie3);
//        movieQueue.add(movie4);
//
//        // Here are the movies and their ratings in the correct order, e.g. Gangs of Wasseypur has a rating 5 and so on.
//        int[] movieRatings = { 5, 3, 4, 1 };
//        String[] movieTitles = { "Gangs of Wasseypur", "Padvamat", "Dangal", "Tubelight" };
//
//        for (int i = 0; i < 4; i++) {
//            int rating = movieRatings[i];
//            String title = movieTitles[i];
//
//            // Iterate over Queue to find the movie with the correct title
//            // and update its Rating
//            // Write logic here
//            if(movie1.getTitle() == title){
//                movie1.setRating(rating);
//            }
//            else if(movie2.getTitle() == title){
//                movie2.setRating(rating);
//            }
//            else if(movie3.getTitle() == title){
//                movie3.setRating(rating);
//            }
//            else if(movie4.getTitle() == title){
//                movie4.setRating(rating);
//            }
//        }

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

//        Queue<Integer> queue = new LinkedList<Integer>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0) {
//            queue.add(s.nextInt());
//        }
//        sort(queue);

        Queue<Integer> q = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        shiftMaxToLast(q);
        System.out.println(q);

    }

    private static void shiftMaxToLast(Queue<Integer> q) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        int max = 0;
        int number = 0;
        while(!q.isEmpty()){
            int element = q.remove();
            if(element>max){
                max = element;
            }
            q1.add(element);
        }
        while(!q1.isEmpty()){
            int element = q1.remove();
            if(element!=max){
                q.add(element);
            }
            else{
                number = element;
            }
        }
        q.add(number);
    }

    static void sortQueue(Queue<Integer> queue) {
        Queue<Integer> temp = new LinkedList<Integer>();
        temp.add(queue.remove());
        while (!queue.isEmpty()) {
            // Remove the first element from the queue
            int n = queue.remove();
            int size = temp.size();
            boolean flag = true;
            // Remove the elements from the temp queue which are less than n and add them back to the same queue
            // then add n to the temp queue and then the remaining elements which are greater than n
            for (int i = 0; i < size; i++) {
                if (flag) {
                    if (!temp.isEmpty() && temp.peek() < n)
                        temp.add(temp.remove());
                    else {
                        temp.add(n);
                        temp.add(temp.remove());
                        flag = false;
                    }
                } else
                    temp.add(temp.remove());
            }
            // If all the elements in the temp queue are less than n, add n at the end of the queue
            if (flag)
                temp.add(n);
        }
        System.out.println(temp);
    }

    static void sort(Queue<Integer> queue) {
        // Write your code here
        int n = queue.size();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i] = queue.remove();
        }
        int first=0;
        int last= n-1;
        SelectionSortUsingMinAndRecursion(array,first,last);
        for(int i=0;i<n;i++){
            queue.add(array[i]);
        }
        System.out.println(queue);

    }

    public static void SelectionSortUsingMinAndRecursion(int arr[],int first,int last){
        if(first==last){
            return;
        }
        int minIndex=first;

        for (int i=first+1;i<=last;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        int temp=arr[minIndex];
        arr[minIndex]=arr[first];
        arr[first]=temp;
        SelectionSortUsingMinAndRecursion(arr,first+1,last);

    }

    public static void reverse(Queue<Integer> q) {
        //write your code here
        Stack<Integer> stack =  new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        System.out.println(q);
    }

    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        Queue<Integer> queue1 = new LinkedList<>();
        int size = queue.size();
        if(size%2==0){
            for(int i=0;i<size/2;i++){
                queue1.add(queue.remove());
            }
        }
        else{
            for(int i=0;i<size/2+1;i++){
                queue1.add(queue.remove());
            }
        }
        System.out.println(queue1);
    }

    static void printFifthElementFromEnd(Queue<Integer> queue) {
        // Write your code here
        if(queue.size()<5){
            System.out.println("There are not enough elements in the queue");
        }
        else{
            int size = queue.size();
            for(int i=0;i<size-5;i++){
                queue.remove();
            }
            System.out.println(queue.peek());
        }
    }

    static void printFifthElementFromStart(Queue<Integer> queue) {
        // Write your code here
        if(queue.size()<5){
            System.out.println("There are not enough elements in the queue");
        }
        else{
            for(int i=0;i<4;i++){
                queue.remove();
            }
            System.out.println(queue.peek());
        }
    }
}
