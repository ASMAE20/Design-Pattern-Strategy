
public class Test {

	public static void main(String[] args) {
		int[] array = {5,2,3,4,8};
		//Context ctx = new Context (new InsertionSort());
		//ctx.arrange(array);
		
		//Context ctx = new Context (new  BubbleSort());
		//ctx.arrange(array);
		
		//Context ctx = new Context (new QuickSort());
		//ctx.arrange(array);
		
		Context ctx = new Context (new MergeSort());
		ctx.arrange(array);
		
		
		
		
		
				
	
	}

}


