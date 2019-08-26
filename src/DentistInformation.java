public class DentistInformation {
    private String fName;
    private String lName;
    private String eAddress;
    private String website;
    private String phoneNumber;
    private String licenseCountryName;
    private String licenseNumber;
    private int yearsInPractice;
    private String gender;
    private DentistAddress dentistAddress;
    private DentistEducation dentistEducation;
    private DentistSpecialization dentistSpecialization;

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLicenseCountryName(String licenseCountryName) {
        this.licenseCountryName = licenseCountryName;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setYearsInPractice(int yearsInPractice) {
        this.yearsInPractice = yearsInPractice;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String geteAddress() {
        return eAddress;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLicenseCountryName() {
        return licenseCountryName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getYearsInPractice() {
        return yearsInPractice;
    }

    public String getGender() {
        return gender;
    }
}