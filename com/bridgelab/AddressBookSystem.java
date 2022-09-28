package com.bridgelab;

public class AddressBookSystem {
	/**
     * create a main method ,all program execute in main method
     * @param args no arguments
     */

    public static void main(String[] args) {
        /**
         * 1st print welcome msg.
         */
        System.out.println("Welcome to Address Book System\n");
        /**
         * We are just calling an object using class name.
         * Simply passing the argument value according to the parameter defined in the constructor.
         */
        Contact details = new Contact("NSrikanth", "Naidu", "Alampur", "Hyderabad",
                "Telangana", "nksru044@gmail.com", 4123, 630166309);
        System.out.println("The following contact details is mentioned below : \n");
        System.out.println("First Name : " + details.getFirstName());
        System.out.println("Last Name  : " + details.getLastName());
        System.out.println("Address    : " + details.getAddress());
        System.out.println("City       : " + details.getCity());
        System.out.println("State      : " + details.getState());
        System.out.println("E-mail     : " + details.getEmail());
        System.out.println("Zip Code   : " + details.getZip());
        System.out.println("Phone No   : " + details.getPhoneNumber());
    }
}
