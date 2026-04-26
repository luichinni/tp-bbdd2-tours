package unlp.info.bd2.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Route {

    @Id
    private Long id;

    @Column(length = 100)
    private String name;

    private float price;

    private float totalKm;

    private int maxNumberUsers;

    private List<Stop> stops;

    private List<DriverUser> driverList;

    private List<TourGuideUser> tourGuideList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(float totalKm) {
        this.totalKm = totalKm;
    }

    public int getMaxNumberUsers() {
        return maxNumberUsers;
    }

    public void setMaxNumberUsers(int maxNumberUsers) {
        this.maxNumberUsers = maxNumberUsers;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    @ManyToMany
    @JoinTable(
            name="ROUTE_USERDRIVER",
            joinColumns=@JoinColumn(name="ROUTE_ID"),
            inverseJoinColumns=@JoinColumn(name="USERDRIVER_ID")
    )
    public List<DriverUser> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<DriverUser> driverList) {
        this.driverList = driverList;
    }

    @ManyToMany
    @JoinTable(
            name="ROUTE_TOURGUIDE",
            joinColumns=@JoinColumn(name="ROUTE_ID"),
            inverseJoinColumns=@JoinColumn(name="TOURGUIDE_ID")
    )
    public List<TourGuideUser> getTourGuideList() {
        return tourGuideList;
    }

    public void setTourGuideList(List<TourGuideUser> tourGuideList) {
        this.tourGuideList = tourGuideList;
    }

}
