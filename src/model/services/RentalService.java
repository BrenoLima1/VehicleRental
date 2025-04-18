package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService taxService;

	public RentalService(Double privePerHour, Double privePerDAy, BrazilTaxService taxService) {
		this.pricePerHour = privePerHour;
		this.pricePerDay = privePerDAy;
		this.taxService = taxService;
	}
	
	public void ProcessInvoice(CarRental carRental) {
		
		double minutes =  Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes() ;
		double hours = minutes / 60.0;
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}else {
			basicPayment = pricePerDay * Math.ceil(hours/24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
