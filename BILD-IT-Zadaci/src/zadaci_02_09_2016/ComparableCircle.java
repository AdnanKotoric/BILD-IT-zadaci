package zadaci_02_09_2016;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	
public ComparableCircle() {
	super();
}
	// pronalazi najveci krug
	public static ComparableCircle max(ComparableCircle o, ComparableCircle o2) {
		if (o.compareTo(o2) > 0)
			return o;
		else
			return o2;
	}

	@Override
	public int compareTo(ComparableCircle o) {
		
		return 0;
	}

}