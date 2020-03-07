package Interface;
// developing class is responsible to implement all the methods present in banking client
public class Developing implements Bankingclient{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create object for developing class
		Developing d=new Developing();
		d.checkingbalance();
	    d.paycreditcard();
	    d.Transferbalance();
	    
	    //call the method present only in developing client
	    d.login();
	   //used to call methods present in Bankingclient interface. It canot be used to call methods presnt in Developing class. this is called Runtime polymorphism
	    Bankingclient dr=new Developing();
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
	System.out.println("pay credit card implemented");
	}

	@Override
	public void Transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("Transferbalance implemented");	
	}	

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance implemented");	
	}
	
	//we have created a method for developing class. all other methods came automatically from banking client interface
	
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login implemented");		
	}
	

}
