
import java.util.ArrayList;
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }
    
    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }
        
        LicensePlate comparedLP = (LicensePlate) comparedObject;
        
        if ((this.toString().equals(comparedLP.country + " " + comparedLP.liNumber))) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
