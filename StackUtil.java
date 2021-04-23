package helloworld;
import java.util.*;
import java.util.Stack;

public class StackUtil {
    public static boolean isBalanced(String input){
        Stack stack = new Stack();
        for(int i=0;i<input.length();i++){
//            System.out.println("We are processing: " + input.charAt(i));

            if(input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '('){
                stack.push(input.charAt(i));
            }
            if(input.charAt(i) == ']' || input.charAt(i) == '}' || input.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                Character top = (Character) stack.pop();
                Character in = input.charAt(i);
                if((top == '[' && in !=']') ||(top == '{' && in !='}')||(top == '(' && in !=')')){
                    return false;
                }
            }

        }
        System.out.print(stack);
        return stack.isEmpty();

    }
    public static void main(String[] args) {

        String input = "(((){}{(}))";
        if(isBalanced(input)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }

//
//
//        Stack<Character> s = new Stack<>();
//        char arr[] = {'[','(',')','(',')','{','}',']'};
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
//                s.push(arr[i]);
//            }
//            switch (arr[i]){
//                case ')' : if(arr[i] == '{' || arr[i] == '['){
//                    System.out.println("Array is Not Balanced");
//                }
//                s.pop();
//                break;
//
//                case '}' : if(arr[i] == '(' || arr[i] == '['){
//                    System.out.println("Array is Not Balanced");
//                }
//                s.pop();
//                break;
//
//                case ']' : if(arr[i] == '(' || arr[i] == '{'){
//                    System.out.println("Array is Not Balanced");
//                }
//                s.pop();
//                break;
//
//            }
//        }
//        if(s.isEmpty()){
//            System.out.println("Array is Balanced");
//        }
//        else{
//            System.out.println("Array is not Balanced");
//        }

//        Stack<Integer> stack = new Stack<>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            stack.push(s.nextInt());
//        printFifthElementFromEnd(stack);

//        Stack<Character> s = new Stack<Character>();
//        Scanner in = new Scanner(System.in);
//        String data = in.nextLine();
//        for(int i=data.length()-1;i>=0;i--){
//            s.push(data.charAt(i));
//        }
//        for(int i=0;i<s.size();i++){
//            System.out.print(s.elementAt(i));
//        }

    }

    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here
        if(stack.size()<5){
            System.out.println("There are no enough elements in the stack");
        }
        else{
            System.out.println(stack.elementAt(4));
        }
    }
}
