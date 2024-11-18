package methods_constructor;
 //class called bike
public class bike {
	
	
	  // Private member variable
	
    private String brand;
	public String getBrand;

    // Constructor
    
    public bike(String bikeBrand) {
        this.brand = bikeBrand;
    }

    // Method to get the brand of the bike
    
    public String getBrand() {
        return brand;
    }
}