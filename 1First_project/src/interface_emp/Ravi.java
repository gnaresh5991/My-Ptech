package interface_emp;

public class Ravi implements Employee,Contact_Details
{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Ravi");
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("21");
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("Telangana");
	}

	@Override
	public void mobile() {
		// TODO Auto-generated method stub
		System.out.println("9898982345");
	}

	@Override
	public void e_mail() {
		// TODO Auto-generated method stub
		System.out.println("r@gmail.com");
	}
}
