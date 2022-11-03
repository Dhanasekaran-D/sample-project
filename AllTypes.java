package com.java.dhanasekaran;

public class AllTypes {

	private String name;
	public String fathername;
	public String mothername;
	public double monthsalary;
	public long mobile;
	public String email;
	public int sekarage;
	public char myletter;
	public boolean Sekarjavadeveloper;
	public float h;
	public static String sri = "vicky";
	public final static String dhana = "Ravi";

	public void setname(String yourname) {
		this.name = yourname;
	}

	public String getname() {
		return this.name;
	}

	public void normalmethod() {
		System.out.println("this is normal method");
	}

	public static void staticmethod() {
		System.out.println("this is a static method");
	}

	public AllTypes(String name, String fathername, String mothername, double monthsalary, long mobile, String email,
			int Ramage, char Myletter, boolean Javadeveloper, float A) {
		this.name = name;
		this.fathername = fathername;
		this.mothername = mothername;
		this.monthsalary = monthsalary;
		this.mobile = mobile;
		this.email = email;
		this.sekarage = sekarage;
		this.myletter = Myletter;
		this.Sekarjavadeveloper = Javadeveloper;
		this.h = A;
	}

	public AllTypes() {

	}

	public static void main(String[] args) {
		AllTypes myobj = new AllTypes();
		myobj.name = "Dhanasekaran";
		myobj.fathername = "Dhanapal";
		myobj.mothername = "Cithra";
		myobj.monthsalary = 50000;
		myobj.mobile = 9095113137L;
		myobj.email = "dhanasekaran2122001@gmail.com";
		myobj.sekarage = 21;
		myobj.myletter = 'D';
		myobj.Sekarjavadeveloper = true;
		myobj.h = 5.980f;
		AllTypes dd = new AllTypes();
		dd.setname("Dhanasekaran");
		System.out.println(dd.name);
		AllTypes ds = new AllTypes();
		ds.normalmethod();
		AllTypes.staticmethod();
		AllTypes obj = new AllTypes("Sekar", "Dharanee", "Srimathi", 2354.00, 9095113136L,
				"dhanasekaran2122001@gmail.com", 29, 'r', false, 5.00f);
		System.out.println(obj.name + "  " + obj.fathername + "  " + obj.mothername + "  " + obj.monthsalary + "  "
				+ obj.mobile + "  " + obj.email + "   " + obj.sekarage + "  " + obj.myletter + "  "
				+ obj.Sekarjavadeveloper + "  " + obj.h);
		System.out.println(myobj.name + " " + myobj.fathername + " " + myobj.mothername + "  " + myobj.monthsalary
				+ "  " + myobj.mobile + "  " + myobj.email + "   " + myobj.sekarage + "  " + myobj.myletter + "  "
				+ myobj.Sekarjavadeveloper + "  " + myobj.h);
		System.out.println(sri);
		System.out.println(dhana);
	}
}
