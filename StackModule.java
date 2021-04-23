package helloworld;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
public class StackModule {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Book book1 = new Book("Harry Potter", 200);
//        Book book2 = new Book("Champak", 100);
//        Book book3 = new Book("Lord of the Rings", 300);
//        Book book4 = new Book("Tinkle", 100);
//
//        Stack<Book> bookStack = new Stack<Book>();
//
//        // Add code to push the books on the Stack here (in order: book1,book2,book3,book4)
//        bookStack.push(book1);
//        bookStack.push(book2);
//        bookStack.push(book3);
//        bookStack.push(book4);
//
//        // Add code to pick the book at the top and read 100 pages
//
//        while(book4.completed()==false) {
//            book4.read100Pages();
//        }
//        bookStack.pop();
//        while(book3.completed()==false) {
//            book3.read100Pages();
//        }
//        bookStack.pop();
//        while(book2.completed()==false) {
//            book2.read100Pages();
//        }
//        bookStack.pop();
//        while(book1.completed()==false) {
//            book1.read100Pages();
//        }
//        bookStack.pop();
//        // Remove the book from the stack if it is completed
//
//        Scanner scanner = new Scanner(System.in);
//        String line1 = scanner.nextLine();
//        String line2 = scanner.nextLine();
//        Stack<Integer> sequence1 = new Stack<Integer>();
//        Stack<Integer> sequence2 = new Stack<Integer>();
//        int boxIndex = 0;
//        for (String elem1 : line1.split(" ")) {
//            sequence1.add(Integer.parseInt(elem1));
//        }
//        for (String elem2 : line2.split(" ")) {
//            sequence2.add(Integer.parseInt(elem2));
//        }
//        int n = sequence1.size();
//        int m = sequence2.size();
//        Boolean isSubsequence = contains(sequence1, sequence2,n,m);
//        System.out.println(isSubsequence);

//        Stack<Integer> stack = new Stack<>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            stack.push(s.nextInt());
//        reverseSecondHalf(stack);

//        Stack<Integer> stack = new Stack<>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            stack.push(s.nextInt());
//        sort(stack);

//        String str = "{}}{{{";
//        int minOperation = getMinOperation(str);
//        System.out.println(minOperation);

//        Stack<Integer> stack = new Stack<>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            stack.push(s.nextInt());
//        deleteMiddleElement(stack);

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int size = s.nextInt();
//        System.out.println("Enter values in array: ");
//        int arr[] = new int[size];
//        for(int i=0;i<size;i++){
//            arr[i] = s.nextInt();
//        }
//        System.out.println("Enter value of K: ");
//        int k = s.nextInt();
//        reverseKElements(arr,k);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = s.nextInt();
        System.out.println("Enter values in array: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter value of K: ");
        int k = s.nextInt();
        firstNegative(arr,k);

    }

    private static void firstNegative(int[] arr, int k) {

        for(int i=0;i<arr.length-2;i++){
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.println("First Negative in " +(i+1)+ " window is: " + arr[j]);
                    break;
                }
            }
        }

    }

    private static void reverseKElements(int[] arr,int k) {
        if(k <= 1){
            System.out.println("Cannot Reverse");
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(arr[i]);
        }
        for(int i=0;i<k;i++){
            arr[i] = stack.pop();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void deleteMiddleElement(Stack<Integer> stack) {
        if(stack.size() <= 1){
            System.out.println("No Middle Element");
            return;
        }
        Stack<Integer> stack1 = new Stack<>();
        for(int i=0;i<stack.size()/2;i++){
            stack1.push(stack.pop());
        }
        stack.pop();
        while(!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
        System.out.println(stack);
    }


    public static int getMinOperation(String str){
        if(str.length()%2!=0){
            return -1;
        }
        //        remove the balanced part
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '}' && stack.isEmpty() == false){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
//        calculate the opening brackets
        int openCount = 0;
        while(!stack.isEmpty() && stack.peek() == '{'){
            stack.pop();
            openCount++;
        }
//        calculate the closing brackets
        int closeCount = 0;
        while(!stack.isEmpty() && stack.peek() == '}'){
            stack.pop();
            closeCount++;
        }

        int openCountCeil = (openCount + 1)/2;
        int closeCountCeil = (closeCount+1)/2;

        return openCountCeil + closeCountCeil;
    }

    static void sort(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer> newStack = new Stack<>();
        while(!stack.isEmpty()) {
            int min = stack.pop();
            while (!newStack.isEmpty() && (newStack.peek() > min)) {
                stack.push(newStack.pop());
            }
            newStack.push(min);
        }
        System.out.println(newStack);
    }

    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer> stack1 = new Stack<>();
        int n = stack.size();
        if(n%2==0) {
            for (int i = 0; i < n / 2; i++) {
                stack1.push(stack.elementAt(i));
            }
            for (int i = n - 1; i >= n / 2; i--) {
                stack1.push(stack.elementAt(i));
            }
        }
        else{
            for (int i = 0; i <= n / 2; i++) {
                stack1.push(stack.elementAt(i));
            }
            for (int i = n - 1; i > n / 2; i--) {
                stack1.push(stack.elementAt(i));
            }
        }
        System.out.println(stack1);
    }

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2, int n, int m) {
        // This block will be filled by the student
        if(n==0){
            return true;
        }
        if(m==0){
            return false;
        }
        if(sequence1.elementAt(n-1) == sequence2.elementAt(m-1)){
            return contains(sequence1,sequence2,n-1,m-1);

        }
        else{
            return contains(sequence1,sequence2,n,m-1);
        }
    }
}


class Book {
    public String title;
    public int pagesLeft;

    public Book(String title, int pages) {
        this.title = title;
        this.pagesLeft = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pagesLeft;
    }

    public void read100Pages() {
        System.out.println("Reading 100 pages of " + this.title);
        this.pagesLeft = this.pagesLeft - 100;
    }

    public Boolean completed() {
        return this.pagesLeft <= 0;
    }
}
