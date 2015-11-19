
public class Sorting {
	public static void main(String[]args){
		new guiswing();
//		int[] numinput = new int[10];
//		int[] numoutput = new int[numinput.length]; //they need to be the same length
//		numoutput = SortArray(numinput);
//	}
//
//	private static int[] SortArray(int[] numinput) {
//		// TODO Auto-generated method stub
//		int length = numinput.length;
//		int counter = 0;
//		int i = 1;
//		int holder = 0;
//		while (numinput[0]>numinput[1] || numinput[1]>numinput[2] || numinput[2]>numinput[3] || numinput[3]>numinput[4] || numinput[4]>numinput[5] || numinput[5]>numinput[6] || numinput[6]>numinput[7] || numinput[7]>numinput[8] || numinput[8]>numinput[9]) {
//			if (numinput[counter] > numinput[counter + i]) {
//				holder = numinput[counter]; //if numinput[counter] is 4 and numinput[counter+1] is 6, holder is now 4, then numinput[counter] becomes 6, then numinput[counter+1] becomes 4, so now holder is 4, numinput[counter] is 6, and numinput[counter+1] is 4
//				numinput[counter] = numinput[counter + i];
//				numinput[counter + i] = holder; // ^TLDR everything is OK
//			} else if (numinput[counter] < numinput[counter + i]) {
//				counter++; //if theyre already in the right spots dont move them
//			} else if (numinput[counter] == numinput[counter + i]) {
//				counter++; //if they are equal dont move them
//			}
//			if ((counter + i) >= length){
//				counter = 0; //to try the whole thing over again to check the moved numbers
//			}else{
//				i = 1;
//			}
//		}
//		return numinput;
//	}
}}
