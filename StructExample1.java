
import theleo.jstruct.Struct;

public class StructExample1 {

	@Struct
	public static class EmpName {
	    public String firstName,middleName,lastName;
	}

	public static void main(String[] args) {
		
		EmpName[] empArray = new EmpName[2];
		empArray[0].firstName="Java";
		empArray[0].middleName="Code";
		empArray[0].lastName="Geek";
		System.out.println("Name : "+empArray[0].firstName
				+" "+empArray[0].middleName
				+" "+empArray[0].lastName);
	}

}
