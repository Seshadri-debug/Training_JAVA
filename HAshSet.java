// import java.util.*;
// class Main
// {
// 	public static void main(String[] args) {
// 		HashSet<Integer> set = new HashSet<>();
// 		set.add(10);
// 		set.add(20);
// 		set.add(30);
// 		set.add(40);
// 		System.out.println(set);
// 		System.out.println(set.size());
// 		boolean a = set.contains(20);
// 		System.out.println(a);
// 		boolean c = set.isEmpty();
// 		System.out.println(c);
// 		System.out.println(set.remove(20));
// 		set.clear();
// 		System.out.println(set);
// 	}
// }





// import java.util.*;
// class Main
// {
//     public static void main(String[]args)
//     {
//         HashSet<Integer>list = new HashSet<>();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);
//         System.out.println(list);
//         if(list.contains(3))
//         {
//         System.out.println("yes");
//         }
//         else
//         {
//             System.out.println("no");
//         }
//         list.remove(30);
//         System.out.println(list);
//         int n = list.size();
//         System.out.println(n);
//         list.clear();
//         System.out.println(list);
//         Iterator<Integer>it = list.iterator();
//         while(it.hasNext())
//         {
//             System.out.println(it.next());
//         }
//     }
// }







// import java.util.*;
// class Main
// {
//     public static void main(String[]args)
//     {
//         LinkedHashSet<Integer>list = new LinkedHashSet<>();
//         list.add(10);
//         list.add(45);
//         list.add(33);
//         list.add(18);
//         list.add(98);
//         System.out.println(list);
//         if(list.contains(3))
//         {
//         System.out.println("yes");
//         }
//         else
//         {
//             System.out.println("no");
//         }
//         list.remove(33);
//         System.out.println(list);
//         int n = list.size();
//         System.out.println(n);
//         list.clear();
//         System.out.println(list);
//         Iterator<Integer>it = list.iterator();
//         while(it.hasNext())
//         {
//             System.out.println(it.next());
//         }
//     }
// }







// import java.util.*;
// class Main
// {
//     public static void main(String[] args)
//     {
//         LinkedHashSet<String> set = new LinkedHashSet<>();
//         set.add("apple");
//         set.add("banana");
//         set.add("apple");
//         set.add("orange");
//         set.add("banana");
//         System.out.print(set);
//     }
// }











// import java.util.*;
// class Main
// {
//     public static void main(String[] args)
//     {
//         LinkedHashSet<Integer> list1 = new LinkedHashSet<>();
//         list1.add(1);
//         list1.add(2);
//         list1.add(4);
//         list1.add(5);
//         list1.add(6);
//         System.out.println("arr1-"+list1);
//         LinkedHashSet<Integer> list2 = new LinkedHashSet<>();
//         list2.add(2);
//         list2.add(3);
//         list2.add(4);
//         list2.add(7);
//         list2.add(6);
//         System.out.println("arr2-"+list2);
//         int size = list1.size();
//         System.out.println(size);
//         list1.retainAll(list2);
//         System.out.println(list1);
//     }
// }










import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        TreeSet<Integer> list = new TreeSet<>();
        list.add(12);
        list.add(15);
        list.add(45);
        list.add(98);
        list.add(60);
        System.out.println(list);
        Integer first = list.first();
        Integer last = list.last();
        Integer higher = list.higher(45);
        Integer lower = list.lower(45);
        Integer ceiling = list.ceiling(45);
        Integer floor = list.floor(45);
        System.out.println(first);
        System.out.println(last);
        System.out.println(higher);
        System.out.println(lower);
        System.out.println(ceiling);
        System.out.println(floor);
    }
}
