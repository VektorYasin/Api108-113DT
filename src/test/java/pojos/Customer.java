package pojos;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    private String mobilePhoneNumber;
    private String phoneNumber;
    private String zipCode;
    private String address;
    private String city;
    private String ssn;
    private String createDate;
    private boolean zelleEnrolled;
    private Country country;
    private String state;
    private User user;
    private ArrayList<Object> accounts;

    public Customer(int id, String firstName, String lastName, String middleInitial, String email, String mobilePhoneNumber, String phoneNumber, String zipCode, String address, String city, String ssn, String createDate, boolean zelleEnrolled, Country country, String state, User user, ArrayList<Object> accounts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.email = email;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.address = address;
        this.city = city;
        this.ssn = ssn;
        this.createDate = createDate;
        this.zelleEnrolled = zelleEnrolled;
        this.country = country;
        this.state = state;
        this.user = user;
        this.accounts = accounts;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getSsn() {
        return ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public boolean isZelleEnrolled() {
        return zelleEnrolled;
    }

    public Country getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Object> getAccounts() {
        return accounts;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setZelleEnrolled(boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAccounts(ArrayList<Object> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", ssn='" + ssn + '\'' +
                ", createDate='" + createDate + '\'' +
                ", zelleEnrolled=" + zelleEnrolled +
                ", country=" + country +
                ", state='" + state + '\'' +
                ", user=" + user +
                ", accounts=" + accounts +
                '}';
    }
}
