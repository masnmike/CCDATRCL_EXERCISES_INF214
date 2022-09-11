// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Colors = new Stack(5);
        
      // Insert new elements into the stack
      Colors.push("Red");
      Colors.push("Blue");
      Colors.push("White");
      Colors.push("Green");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Colors.size());
  
      // Show top element in the stack
      System.out.println("The color of the grass is: " + Colors.peek());
  
      // Remove top element in the stack
      Colors.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Colors.printStack();
  
      // Show top element in the stack
      System.out.println("The color of clouds is " + Colors.peek());
    }
  }
