package stackoperations;
//Package is a grouping of related types providing access protection and name 
//space management
//Stack is an abstract data type that serves as a collection of elements with two main operations
//push and pop.Push adds an element and pop deletes an element from collection
class Stack {
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

		// TODO Auto-generated method stub
		private int length=0;
		private Node top=null;//top means first element in the stack
		public void push(int item)
//public keyword is used in the declaration of a class,method or field;public classes,method and fields 
//can be accessed by the members of any class.
		{
			Node node=new Node(item);
//node is a primary data type.It represents single node in a tree
//here we add the new node to the collection
			if(top==null)
//A stack is linear list in which all additions and deletions are restricted to one end
//is called as Top.If the top is equal to null then the top will be equal to the node
			{
				top=node;
			}
			else
//if not it will go to the next node and the next will node will be equal to top
			{
				node.next=top;
				top=node;
			}
			length++;//length will be incremented
		}
		public int pop()
//pop sends the data in the node at the top of the stack back to the calling algorithm.
//It then adjusts the pointers to logically delete the node
		{
			int result=-1;
	//until result is equal to -1
			if(top!=null)
			//if top is not equal to null
			{
				result=top.data;
			//the result will be equal the top of the data and top will point to next 
				//element and length of the stack will be decremented
				top=top.next;
				length--;
			}
			return result;
			//it will return the result
		}
		public int peek()
//peek is a method used to look at the object at the top of the stack without removing 
//it from the stack
		{
			return(top==null)?-1:top.data;
			//return top is equal to null and gets the absolute value of top data
			//it first looks at the expression to the left the question mark.If Denominator 
			//is equal to zero then the expression between the question and colon is 
			//evaluated and used as the value of the entire ? expression. If not the expression 
			//after colon is evaluated and used the value of the entire ? expression. 
		}
		@Override
	//when the method in subclass has the same name and type signature as a method in its
		//over class, then the method in the subclass is said to be override.
	    public String toString()
//Java implements string as a object
	    //toString means by which we can determine the string representation for objects
	    //of classes that we create.
	    //to implement toString(),simply return a String object that contains the human readable
	    //string that appropriately describes an object of your class
	    {
	        StringBuilder result = new StringBuilder();
	  //StringBuilder is used because fixed and immutable strings can be implemented more
	        //efficiently than changeable ones
	        Node tempNode = null;
	     //tempNode means temporary node.tempNode will be equal to null
	        result.append("[");
	        //append() method concatenate the string representation of any 
	        //other data type of data to the end of the invoking StringBuffer object
	      if (top != null) {
	            for(tempNode = top; tempNode != null; tempNode = tempNode.next) {
	                result.append(tempNode.data + " ");
	       //top is not equal to null then tempNode is equal to top but not null an tempNode 
	                //will points to next node and the result will give the tempNode data
	            }
	        }
	 result.append("]");
	       return result.toString();
	       //returns the result of the toString
	    }
	public int size()//here we will give the value of size
	{
		return length;// length of the array will be returned
	}
	public static void main(String[] args)
	//	{
//public keyword is an access modifier
//static allows main() to be called without having to instantiate a particular instance of the class
//void simply says the compiler that main() does not return a value
	{
		Stack stack=new Stack();
		//here stack will be created
		System.out.println("Stack Length:"+stack.size());
		//length of the stack will be given
		stack.push(4);//here it creates an object for stack and pushes the item 
		stack.push(5);//into top of stack
		stack.push(6);
		stack.push(7);
		System.out.println(stack);
		//print the stack values. this will call toString method.
		System.out.println("Stack Length:"+stack.size());
		System.out.println("Peek:"+stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("Stack Length:"+stack.size());
		System.out.println("Peek:"+stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("Stack Length:"+stack.size());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("Stack Length:"+stack.size());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("Peek:"+stack.peek());
		System.out.println("Stack Length:"+stack.size());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("Peek:"+stack.peek());
		System.out.println("Stack Length:"+stack.size());
	//Through these statements it declares as at first it takes value of stack is zero
	//once the stack values are printed the stack length will be equal to 4 and through
	//peek operation one element will be looked and will not be eliminated from stack.
	//Then the element will be popped out of the stack.
	//This operation will be done until the peek value is -1 and length is equal to zero
	}
	private class Node{
		private Node next=null;
		private int data=0;
		private Node(int value)
		{
			this.data=value;//this is a keyword refers to the current object
		}
	}
	
}
