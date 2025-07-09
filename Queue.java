import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Queue<Integer>pq=new PriorityQueue<>();
		pq.offer(10);
		pq.offer(25);
		pq.offer(30);
		pq.offer(5);
		pq.offer(20);
		System.out.println(pq);
		System.out.println("Head Element(element()):"+pq.element());
		System.out.println("Contains 30?"+pq.contains(30));
		System.out.println("Elements using iterator:");
		Iterator<Integer>it=pq.iterator();
		while(it.hasNext()){
		    System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("Size before clear : "+pq.size());
		pq.clear();
		System.out.println("Size After clear : "+pq.size());
	}
}
