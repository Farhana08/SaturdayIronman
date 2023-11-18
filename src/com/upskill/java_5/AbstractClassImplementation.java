package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 doors ");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has dual motor engine ");
		return "Dual Motor";
	}

	@Override
	public void iColor() {
		System.out.println("My Car is RED ");
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 wheel ");
		return 4 ;
	}

}

/*
(Parent)				            (Keyword) 				       (Child)				        (Keyword) 				(GrandChild)

Class[R]						     extends				    Class[R]		 
Abstract Class[R][i] (+2)  		     extends				    Class[R][R] (-2=0)
Interface[i] (+2)			         implements				    Class[R] (-2=0)
Interface[i] (+2)				     extends				    Interface[i][i] (+2+2=+4)       implements				Class[R][R](-4=0)
Interface (+2)                       implement                  Abstract Class
Abstract Class                        extends                  Interface (+2+2=+4)              implements	Class(-4=0

*/
