/*	Q-12 : Implement a simple class with getters and setters for encapsulation.	*/

package LabExercise;

class employee {
	private int id;
	private String name;
	private long number;
	private String address;

	public void setid(int id) {
		this.id = id;
	}

	public int getid() {
		return id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setnumber(long number) {
		this.number = number;
	}

	public long getnumber() {
		return number;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getaddress() {
		return address;
	}
}

public class Que_012 {
	public static void main(String[] args) {
		employee e = new employee();
		e.setid(1);
		e.setname("Mike");
		e.setnumber(942128165l);
		e.setaddress("ahemdabad");

		System.out.println("employee id : " + e.getid());
		System.out.println("employee name : " + e.getname());
		System.out.println("employee number : " + e.getnumber());
		System.out.println("employee address : " + e.getaddress());
	}
}
