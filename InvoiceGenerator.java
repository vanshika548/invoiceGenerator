package main;

public class InvoiceGenerator {

	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST = 10;
	private static final double MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		// TODO Auto-generated method stub
		double totalFare = distance * MINIMUM_COST + time * COST_PER_TIME;
		return Math.max(totalFare,MINIMUM_FARE);
	}
	
	public InvoiceSummaryDTO calculateFare(Ride[] rides) {
		double totalFare = 0.0;
		for (Ride ride : rides) {
			totalFare = totalFare+this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummaryDTO(rides.length,totalFare);
	}
}
