package design.system.DeskBookingSystem;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    private String plotNo;
    private String laneNo;
    private String blockNo;
    private String landmark;
    private String city;
    private String state;
    private String pinCode;
    private String country;

    public Address(String plotNo, String laneNo, String blockNo, String landmark, String city, String state, String pinCode, String country) {
        this.plotNo = plotNo;
        this.laneNo = laneNo;
        this.blockNo = blockNo;
        this.landmark = landmark;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public String getLaneNo() {
        return laneNo;
    }

    public String getBlockNo() {
        return blockNo;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(plotNo, address.plotNo) &&
                Objects.equals(laneNo, address.laneNo) &&
                Objects.equals(blockNo, address.blockNo) &&
                Objects.equals(landmark, address.landmark) &&
                Objects.equals(city, address.city) &&
                Objects.equals(state, address.state) &&
                Objects.equals(pinCode, address.pinCode) &&
                Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plotNo, laneNo, blockNo, landmark, city, state, pinCode, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo='" + plotNo + '\'' +
                ", laneNo='" + laneNo + '\'' +
                ", blockNo='" + blockNo + '\'' +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
