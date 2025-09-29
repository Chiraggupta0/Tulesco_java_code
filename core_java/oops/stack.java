import java.util.Stack;
class stack
{
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(3);
        System.out.println("stack elements are:" + stack);
        stack.pop();
        System.out.println("stack elements are:" + stack);

    }
}