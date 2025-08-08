package Collection;
import java.util.Scanner;
import java.util.LinkedList;

public class PatientQueue {
	public static void main(String[] args)
    {
 
	LinkedList<String> patientQueue=new LinkedList<>();   
	Scanner sc= new Scanner(System.in);
	int choice;
	
	do {
		System.out.println("\n Hospital Patient Queue_ _ _ :");
		System.out.println("1. Add New Patient(normal)");
		System.out.println("2. Add emergeny patient");
		System.out.println("3. Remove patient");
		System.out.println("4. View all Patient");
		System.out.println("5. View first and last patient");
		System.out.println("6. Patient count");
		System.out.println("7. Search Patient");
		System.out.println("8. cancel Patient appointment");
		System.out.println("9. Viewing all the patients who is next");
		System.out.println("10. Exit");
		System.out.println("Enter your choice :");
		choice =sc.nextInt();
		sc.nextLine();
		
	switch(choice)
	{
	case 1:
		System.out.println("Enter patient name :");
        String patient =sc.nextLine();
        patientQueue.addLast(patient);
	    System.out.println("Added to queue.");
	    break;    
	case 2:
		System.out.println("Enter emergency patient name :");
		String emergencyPatient= sc.nextLine();
        patientQueue.addFirst(emergencyPatient);
	    System.out.println("Emergency pateint added to front :");
	    break;
	case 3:
		if(!patientQueue.isEmpty())
{
	String remove= patientQueue.removeFirst();
	System.out.println("Removed patient :" + remove );
}
		else
		{
			System.out.println("No patient in queue");
		}
		break;
	case 4:
		System.out.println("Current Queue :" +patientQueue);
        break;
        
	case 5:
		if(!patientQueue.isEmpty())
		{
			System.out.println(" First :" +patientQueue.getFirst());
			System.out.println("Last :" +patientQueue.getLast());
		}
        else
		{
			System.out.println("Queue is empty");
		}
        break;
	case 6:
	    System.out.println("Total patients : " + patientQueue.size());
	    break;
	    
	case 8:
		System.out.print("Enter patient name to cancel: ");
		String cancelName = sc.nextLine();  

		boolean found = false;
		for (String name : patientQueue) {
		    if (name.equalsIgnoreCase(cancelName)) {
		        found = true;
		        break;
		    }
		}

		if (found) {
		    patientQueue.remove(cancelName); 
		    System.out.println("Cancelled appointment for " + cancelName);
		} else {
		    System.out.println("No such patient found.");
		}
	case 9:
	    if (!patientQueue.isEmpty()) {
	        System.out.println("All Patients in row: " + patientQueue);
	        System.out.println("Next Patient iin row: " + patientQueue.getFirst());
	        System.out.println("Last Patient in row: " + patientQueue.getLast());
	    } else {
	        System.out.println("No patients in the queue.");
	    }
	    break;

	case 10:
		System.out.println("Exiting......");
		break;
    
	default:
		System.out.println("Invalid Choice");
	}
    }while (choice !=10);
	sc.close();
}
}