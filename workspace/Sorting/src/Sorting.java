import javax.swing.JOptionPane;

public class Sorting {
	public static void main(String[]args){
//		int numinput[] = {3,9,5,6,4,7,9,8,11,22}; a test input
		int[] numinput = new int[10];
		numinput[0] = Integer.parseInt(JOptionPane.showInputDialog("Int input 1"));
		numinput[1] = Integer.parseInt(JOptionPane.showInputDialog("Int input 2"));
		numinput[2] = Integer.parseInt(JOptionPane.showInputDialog("Int input 3"));
		numinput[3] = Integer.parseInt(JOptionPane.showInputDialog("Int input 4"));
		numinput[4] = Integer.parseInt(JOptionPane.showInputDialog("Int input 5"));
		numinput[5] = Integer.parseInt(JOptionPane.showInputDialog("Int input 6"));
		numinput[6] = Integer.parseInt(JOptionPane.showInputDialog("Int input 7"));
		numinput[7] = Integer.parseInt(JOptionPane.showInputDialog("Int input 8"));
		numinput[8] = Integer.parseInt(JOptionPane.showInputDialog("Int input 9"));
		numinput[9] = Integer.parseInt(JOptionPane.showInputDialog("Int input 10"));
		int[] numoutput = new int[numinput.length]; //they need to be the same length
		System.out.println(numinput[0]);
		System.out.println(numinput[1]);
		System.out.println(numinput[2]);
		System.out.println(numinput[3]);
		System.out.println(numinput[4]);
		System.out.println(numinput[5]);
		System.out.println(numinput[6]);
		System.out.println(numinput[7]);
		System.out.println(numinput[8]);
		System.out.println(numinput[9]);
		numoutput = SortArray(numinput);
		System.out.println("BREAK"); //ease of reading
		System.out.println(numoutput[0]);
		System.out.println(numoutput[1]);
		System.out.println(numoutput[2]);
		System.out.println(numoutput[3]);
		System.out.println(numoutput[4]);
		System.out.println(numoutput[5]);
		System.out.println(numoutput[6]);
		System.out.println(numoutput[7]);
		System.out.println(numoutput[8]);
		System.out.println(numoutput[9]);
	}

	private static int[] SortArray(int[] numinput) {
		// TODO Auto-generated method stub
		int length = numinput.length;
		int counter = 0;
		int i = 1;
		int holder = 0;
		while (numinput[0]>numinput[1] || numinput[1]>numinput[2] || numinput[2]>numinput[3] || numinput[3]>numinput[4] || numinput[4]>numinput[5] || numinput[5]>numinput[6] || numinput[6]>numinput[7] || numinput[7]>numinput[8] || numinput[8]>numinput[9]) {
			if (numinput[counter] > numinput[counter + i]) {
				holder = numinput[counter]; //if numinput[counter] is 4 and numinput[counter+1] is 6, holder is now 4, then numinput[counter] becomes 6, then numinput[counter+1] becomes 4, so now holder is 4, numinput[counter] is 6, and numinput[counter+1] is 4
				numinput[counter] = numinput[counter + i];
				numinput[counter + i] = holder; // ^TLDR everything is OK
			} else if (numinput[counter] < numinput[counter + i]) {
				counter++; //if theyre already in the right spots dont move them
			} else if (numinput[counter] == numinput[counter + i]) {
				counter++; //if they are equal dont move them
			}
			if ((counter + i) >= length){
				counter = 0; //to try the whole thing over again to check the moved numbers
			}else{
				i = 1;
			}
		}
		return numinput;
	}
}
