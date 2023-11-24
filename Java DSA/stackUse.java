import java.util.Stack;

public class stackUse{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Initially Stack Is Empty --> "+stack);//Initialy stack is empty

        //Methods

        //push() method:

        stack.push("Srushti");
        stack.push("Sanjana");
        stack.push("Sunny");
        stack.push("Raj");
        System.out.println("Elements in stack after push method --> "+stack);

        //pop() method: - (Remove/Return) top element from the stack
        System.out.println("Applying pop operation -->" +stack.pop());
        System.out.println("Elements in stack after push method --> "+stack);

        //Peek() -> Returns the top element(Do not remove it)
        System.out.println("Tell me who is at the top -->"+stack.peek());

        //isEmpty() -> Checks whether the stack is empty or not
        System.out.println("Is stack is Empty -->" +stack.isEmpty());

        //Find() -> Find element in stack
        String findElement = "Sanjana";
        Integer foundIndx = stack.search(findElement);
        if(foundIndx!=-1)
        {
            System.out.println(findElement+" element found");
        }
        else
        {
            System.out.println(findElement+ " element not found");
        }
    }
}