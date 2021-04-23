package helloworld;
import java.util.Stack;

public class KthLargestElementInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(0);
        stack.push(5);
        stack.push(2);
        System.out.println(stack);
        Stack<Integer> sortedStack = sortStack(stack);
        System.out.println(sortedStack);
        int  k = 2;
        KthLargestElement(sortedStack,k);

    }

    private static void KthLargestElement(Stack<Integer> sortedStack, int k) {
        for(int i=0;i<k-1;i++){
            sortedStack.pop();
        }
        System.out.println(k + "th Largest Element: " + sortedStack.peek());
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()){
            int temp = stack.pop();
//            if temp is smaller than tempStack.peek(), then push all the elements in original stack
            while (!tempStack.isEmpty() && tempStack.peek()>temp){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

}
