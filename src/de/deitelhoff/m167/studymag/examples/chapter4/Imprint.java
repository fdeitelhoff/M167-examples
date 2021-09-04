package de.deitelhoff.m167.studymag.examples.chapter4;

public class Imprint {

    private String companyName;
    private String companyAddress;

    public void printCompanyBanner() {
        // ...
    }

    public void printImprint() {
        printCompanyBanner();
        printCompanyDetails();
    }

    public void printCompanyDetails() {
        System.out.println("Company name: " + companyName);
        System.out.println(companyAddress);
    }
}
