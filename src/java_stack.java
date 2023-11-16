
import java.util.*;
public class java_stack{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input));

        }
        sc.close();
    }
    static boolean isBalanced(String paranthesis){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<paranthesis.length();i++){
            char ch=paranthesis.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(stack.empty()){
                return false;
            }
            else{
                char top=stack.pop();
                if((top=='(' && ch!=')') || (top=='{' && ch!='}') || (top=='[' && ch!=']')){
                    return false;

                }
            }
        }
        return stack.empty();

    }
}




