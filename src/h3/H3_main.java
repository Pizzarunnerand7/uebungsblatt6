package h3;

import java.util.Arrays;

public class H3_main {
	public static void main(String[] args) {
		
	}
	public static boolean compareval(int[]a,int[]b) {
		Arrays.sort(a);
		Arrays.sort(b);
		return compareArrays(a,b);
		
		
	}
	public static boolean compareArrays(int[]c,int[]d) {
		if(c.length!=d.length) {
			return false;
		}
		else {
			for(int i=0; i<c.length; i++) {
				if(c[i]!=d[i]) {
					return false;
				}
			}
			return true;
		}
	}

}
