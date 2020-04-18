package com.example.covid_19dash;

public class Data {

    private String update_date_time;
    private  String local_new_cases;
    private  String  local_total_cases;
    private  String     local_total_number_of_individuals_in_hospitals;
    private   String      local_deaths;
    private String    local_recovered;
    private   String     global_new_cases;
    private String   global_total_cases;
    private  String    global_deaths;
    private  String     global_recovered;
    public hData hospital_data[];

    public String getUpdate_date_time() {
        return update_date_time;
    }

    public void setUpdate_date_time(String update_date_time) {
        this.update_date_time = update_date_time;
    }

    public String getLocal_new_cases() {
        return local_new_cases;
    }

    public void setLocal_new_cases(String local_new_cases) {
        this.local_new_cases = local_new_cases;
    }

    public String getLocal_total_cases() {
        return local_total_cases;
    }

    public void setLocal_total_cases(String local_total_cases) {
        this.local_total_cases = local_total_cases;
    }

    public String getLocal_total_number_of_individuals_in_hospitals() {
        return local_total_number_of_individuals_in_hospitals;
    }

    public void setLocal_total_number_of_individuals_in_hospitals(String local_total_number_of_individuals_in_hospitals) {
        this.local_total_number_of_individuals_in_hospitals = local_total_number_of_individuals_in_hospitals;
    }

    public String getLocal_deaths() {
        return local_deaths;
    }

    public void setLocal_deaths(String local_deaths) {
        this.local_deaths = local_deaths;
    }

    public String getLocal_recovered() {
        return local_recovered;
    }

    public void setLocal_recovered(String local_recovered) {
        this.local_recovered = local_recovered;
    }

    public String getGlobal_new_cases() {
        return global_new_cases;
    }

    public void setGlobal_new_cases(String global_new_cases) {
        this.global_new_cases = global_new_cases;
    }

    public String getGlobal_total_cases() {
        return global_total_cases;
    }

    public void setGlobal_total_cases(String global_total_cases) {
        this.global_total_cases = global_total_cases;
    }

    public String getGlobal_deaths() {
        return global_deaths;
    }

    public void setGlobal_deaths(String global_deaths) {
        this.global_deaths = global_deaths;
    }

    public String getGlobal_recovered() {
        return global_recovered;
    }

    public void setGlobal_recovered(String global_recovered) {
        this.global_recovered = global_recovered;
    }

    public hData[] getHospital_data() {
        return hospital_data;
    }

    public void setHospital_data(hData[] hospital_data) {
        this.hospital_data = hospital_data;
    }
}
