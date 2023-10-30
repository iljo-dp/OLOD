package cui;

public class bubbleSort {
    public static void main(String[] args) {
	//Bubble sort
	args = new String[]{"c", "a", "b", "d"};
	for (int i = 0; i < args.length; i++) {
	    for (int j = 0; j < (args.length - 1 - i); j++) {
		if (args[j].compareTo(args[j + 1]) > 0) {
		    String temp = args[j];
		    args[j] = args[j + 1];
		    args[j + 1] = temp;
		}
	    }
	}
	for (String arg : args) {
	    System.out.println(arg);
	}
    }
}
