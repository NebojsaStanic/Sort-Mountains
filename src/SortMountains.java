import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

class Mountain {
	String name;
	int height;
	public Mountain(String n,int h) {
		this.name = n;
		this.height = h;
	}
	@Override
	public String toString() {
		return name + " " + height;
	}
	
	
	
}
public class SortMountains {
	
	
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	
	class NameCompare implements Comparator<Mountain>{

		@Override
		public int compare(Mountain o1, Mountain o2) {
			return o1.name.compareTo(o2.name);
		}
		
	}
	
	class HeightCompare implements Comparator<Mountain>{

		@Override
		public int compare(Mountain o1, Mountain o2) {
			return (o2.height-o1.height);
		}
		
	}

	public static void main(String[] args) {
		new SortMountains().go();

	}
	public void go(){
		mtn.add(new Mountain("Longs", 14255));
		mtn.add(new Mountain("Elbert", 14443));
		mtn.add(new Mountain("Maroon", 14156));
		mtn.add(new Mountain("Castle", 14265));
		
		
		
		System.out.println("as entered:\n" + mtn);
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("by name:\n" + mtn);
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("by height:\n" + mtn);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
