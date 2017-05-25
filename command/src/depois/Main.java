package depois;

public class Main {
	Queue q = new Queue();
	
	Command com = new Command(new Giant(), Giant.fee);
	Command com1 = new Command(new Giant(), Giant.phi);
	Command com2 = new Command(new Giant(), Giant.pheaux);
	Command com3 = new Command(new Giant(), Giant.fee);
	Command com4 = new Command(new Giant(), Giant.phi);
	Command com5 = new Command(new Giant(), Giant.pheaux);
	
	for (int i = 0; i < 6; i++){
		q.enque(input[i]);
	}
	
	for (int i = 0; i < 6; i++){
		q.deque(input[i]);
	}
	
	System.out.print('\n');
	}
}
