package chapter7;

public class Question23 {
	public static void main(String[] args) {
	    boolean[] lockers = new boolean[100];
	    for (int student = 1; student <= 100; student++) {
	        operate(lockers, student);
	    }
	    display(lockers);
	}
	public static void operate(boolean[] lockerstate, int student) {
	    for (int i = student - 1; i < lockerstate.length; i += student) {
	        lockerstate[i] = !lockerstate[i];
	    }
	}
	public static void display(boolean[] lockers) {
	    int lockerCount = 0;
	    for (int i = 0; i < lockers.length; i++) {
	        if (lockers[i]) {
	            System.out.printf("L%d ", i + 1);
	        }
	    }
	}
	}


