package be.abis.exjava.model;

public  class AgeCannotBeNegativeException  extends Exception {
	   
    public AgeCannotBeNegativeException (String errorMessage) {
       super(errorMessage) ;
   }
}
