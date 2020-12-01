import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3NumberWhenAddedToStackShouldHaveLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}
	
	@Test
	public void given3NumberWhenPopedToStackShouldMatchWithLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = null;
		while(myStack.peak().getNext() != null) {
			pop = myStack.pop();
			myStack.printStack();
		}
		pop = myStack.pop();
		Assert.assertEquals(myFirstNode, pop);
	}
}
