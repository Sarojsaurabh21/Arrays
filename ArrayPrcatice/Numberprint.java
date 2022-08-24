
package ArrayPrcatice;

public class Numberprint {
	int search(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr= {45,84,35,17,95,75,241,420};
		int  num=17;
		Numberprint obj=new Numberprint();
		int arr1=obj.search(arr, num);
		
		if(arr1==-1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element  found at index "+arr1);
		}
		
		
		// TODO Auto-generated method stub

	}

}
