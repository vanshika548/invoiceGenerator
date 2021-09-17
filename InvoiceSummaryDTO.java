package main;

public class InvoiceSummaryDTO {

	private int noOfRides;
	private double totalFare;
	private double averageFare;

	public InvoiceSummaryDTO(int noOfRides, double totalFare) {
		// TODO Auto-generated constructor stub
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.noOfRides;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		InvoiceSummaryDTO that = (InvoiceSummaryDTO)obj;
		return noOfRides == that.noOfRides &&
				            Double.compare(that.totalFare, totalFare) == 0 &&
				            		Double.compare(that.averageFare, averageFare) == 0 ;
	}

	
}
