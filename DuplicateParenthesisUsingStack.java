package helloworld;

import java.util.Stack;

public class DuplicateParenthesisUsingStack {
    public static void main(String[] args) {
        String expression = "(((1*2))+5)";
//        boolean result = isParenthesisDuplicate(expression);
//        expression?statement1:statement2;
//        System.out.println(result?"Duplicate":"Not Duplicate");
        String result = isParenthesisDuplicate(expression)?"Duplicate":"Not Duplicate";
        System.out.println(result);
    }

    private static boolean isParenthesisDuplicate(String expression) {
        char expCharArray[] = expression.toCharArray();
        Stack<Character> stack = new Stack();
        for(char element : expCharArray){
            if(element == ')'){
                char temp =  stack.pop();
                int elementInside = 0;
                while(temp!='('){
                    elementInside++;
                    temp = stack.pop();
                }
                if(elementInside<=1){
                    return true;
                }
            }
            else{
                stack.push(element);
            }
        }
        return false;
    }
}
