package leet.problem.definitions;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}


	@Override
	public String toString() {
	    ListNode curr = this;
	    String formatString = "[" + curr.val;
	    curr = curr.next;

	    while (curr != null) {
	        formatString += "," + curr.val;
	        curr = curr.next;
	    }

	    return formatString + "]";
	}
	
}
