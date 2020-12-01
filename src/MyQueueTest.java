import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NumberWhenAddedToQueueShouldHaveLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(56);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printStack();
		INode peak = myQueue.peak();
		Assert.assertEquals(myThirdNode, peak);
	}

}
