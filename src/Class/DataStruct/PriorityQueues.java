package Class.DataStruct;

import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		PriorityQueue<WorkOrder> q = new PriorityQueue<WorkOrder>();
		q.add(new WorkOrder(4, "Watch TV"));
		q.add(new WorkOrder(1, "Go Home"));
		q.add(new WorkOrder(3, "Eat Food"));
		q.add(new WorkOrder(2, "Do Homework"));
		q.add(new WorkOrder(5, "Go To Sleep"));
		System.out.println(q.remove());
		System.out.println(q.remove());

		//You could also use strings instead of the WorkOrder class
		System.out.println("///////////////////////");

		PriorityQueue<String> s = new PriorityQueue<String>();
		s.add("4 - Watch TV");
		s.add("1 - Go Home");
		s.add("3 - Eat Food");
		s.add("2 - Do Homework");
		s.add("5 - Go To Sleep");
		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println("///////////////////////");

		//now we add back the elements we removed and add a priority 10;
		s.add("1 - Go Home");
		s.add("2 - Do Homework");
		s.add("3 - Eat Food");
		s.add("10 - Go to School");

		/*
		now we call remove twice and think we should get "Go Home" first
		and "Do Homework" second
		*/

		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println(s.remove());

		/*
		why is priority 10 listed before priority 2?
		It turns out that using Strings with PriorityQueue
		only works if the priority number is <= 9 because
		elements are removed in a lexicographic order. The
		number 10 starts with 1 so the element with priority 10
		is removed before the element with priority 2.
		*/
	}

}
