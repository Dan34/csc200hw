
public class Meth {
	public static int Average(int[] i){
		int j = 0;
		int k = 0;
		while (j < i.length){
			k += i[j];
			j++;
		}
		return k;
	}
	public static double Sum(int i[]){
		int j = 0;
		double k = 0;
		while (j < i.length){
			k += i[j];
			j++;
		}
		k = k / i.length;
		return k;
	}
	public static long factorial(long i){
		long j = 1;
		long m = i;
		while (j != i){
			m = j*m;
			j++;
		}
		return m;
	}
}
