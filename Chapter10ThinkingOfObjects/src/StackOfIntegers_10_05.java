public class StackOfIntegers_10_05
{
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 16;

  /** Construct a stack with the default capacity 16 */
  public StackOfIntegers_10_05() 
  {
    this(DEFAULT_CAPACITY);
  }

  /** Construct a stack with the specified maximum capacity */
  public StackOfIntegers_10_05(int capacity) 
  {
    elements = new int[capacity];
  }

  /** Push a new integer into the top of the stack */
  public void push(int value)
  {
    if (size >= elements.length) 
    {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = value;
  }

  /** Return and remove the top element from the stack */
  public int pop()
  {
    return elements[--size];
  }

  /** Return the top element from the stack */
  public int peek() 
  {
    return elements[size - 1];
  }

  /** Test whether the stack is empty */
  public boolean empty()
  {
    return size == 0;
  }

  /** Return the number of elements in the stack */
  public int getSize() 
  {
    return size;
  }
}
