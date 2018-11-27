package Mehmet_Cagri_HW3;

/**
 *
 * @author Mehmet Cagri Aksoy
 */

public class MyStack<AnyType> extends MyLinkedList<AnyType> {

	public int sSize;
	private MyLinkedList<AnyType> LinkedStack;

	public MyStack(){
		sSize = 0;
		LinkedStack = new MyLinkedList<AnyType>();
	}
	
	public void push(AnyType x){
		LinkedStack.add(0, x);
		sSize = LinkedStack.size();
	}
	
	public AnyType get(){
		AnyType data;
		data = LinkedStack.getNodeData(0);
		return data;
	}
	
	public AnyType pop(){
		AnyType t;
		if (LinkedStack.size() > 0) {
			t = LinkedStack.remove(0);
			sSize = LinkedStack.size();
			return t;
		}
		else
			throw new IndexOutOfBoundsException();
	}
	
	public boolean IsEmpty(){
		if(sSize == 0)
			return true;
		else
			return false;
	}
}

