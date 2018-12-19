package com.example.demo.dto;

public class UserDataDTO {
    private String countryFrom;
    private String countryTo;
    private String startDate;
    private String endDate;
    private String amount;

    public void setCountryFrom(String countryFrom) {
        this.countryFrom = countryFrom;
    }

    public void setCountryTo(String countryTo) {
        this.countryTo = countryTo;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public String getCountryTo() {
        return countryTo;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDataDTO userDataDTO = (UserDataDTO) o;

        if (countryFrom != null ? !countryFrom.equals(userDataDTO.countryFrom) : userDataDTO.countryFrom != null)
            return false;
        if (countryTo != null ? !countryTo.equals(userDataDTO.countryTo) : userDataDTO.countryTo != null) return false;
        if (startDate != null ? !startDate.equals(userDataDTO.startDate) : userDataDTO.startDate != null) return false;
        if (endDate != null ? !endDate.equals(userDataDTO.endDate) : userDataDTO.endDate != null) return false;
        return amount != null ? amount.equals(userDataDTO.amount) : userDataDTO.amount == null;
    }

    @Override
    public int hashCode() {
        int result = countryFrom != null ? countryFrom.hashCode() : 0;
        result = 31 * result + (countryTo != null ? countryTo.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
