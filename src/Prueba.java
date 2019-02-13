import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Prueba {

//	private static int [] numeros = {3, 7, 2, 9, 8, 6, 4, 5, 1};
	private static int [] numeros = {10, 3, 201, 4, 957, 2, 87, 531, 402, 27, 95};
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		for (Integer n: numeros) {
			arrayList.add(n);
			arrayList.add(n);
			linkedList.add(n);
			linkedList.add(n);
			queue.add(n);
			queue.add(n);
			hashSet.add(n);
			hashSet.add(n);
			treeSet.add(n);
			treeSet.add(n);
		}
		mostrarColeccion(arrayList);
		mostrarColeccion(linkedList);
		mostrarColeccion(queue);
		mostrarColeccion(hashSet);
		mostrarColeccion(treeSet);
	}
	
	private static void mostrarColeccion(Collection<Integer> c) {
		System.out.println(c.getClass().getSimpleName() + ": " + c.size() + " elementos");
		Iterator<Integer> i = c.iterator();
		while (i.hasNext()) {
			Integer n = i.next();
			System.out.print(n);
			if (i.hasNext())
				System.out.print(", ");
		}
		System.out.println();
	}
	
}
