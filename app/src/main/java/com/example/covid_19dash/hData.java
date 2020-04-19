package com.example.covid_19dash;

public class hData {

        private int id;
        private String hospital_id;
        private String cumulative_local;
        private String cumulative_foreign;
        private String treatment_local;
        private String treatment_foreign;
        private String  created_at;
        private String updated_at;
        private  String deleted_at;
        private  String cumulative_total;
        private String treatment_total;
       public Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getCumulative_local() {
        return cumulative_local;
    }

    public void setCumulative_local(String cumulative_local) {
        this.cumulative_local = cumulative_local;
    }

    public String getCumulative_foreign() {
        return cumulative_foreign;
    }

    public void setCumulative_foreign(String cumulative_foreign) {
        this.cumulative_foreign = cumulative_foreign;
    }

    public String getTreatment_local() {
        return treatment_local;
    }

    public void setTreatment_local(String treatment_local) {
        this.treatment_local = treatment_local;
    }

    public String getTreatment_foreign() {
        return treatment_foreign;
    }

    public void setTreatment_foreign(String treatment_foreign) {
        this.treatment_foreign = treatment_foreign;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getCumulative_total() {
        return cumulative_total;
    }

    public void setCumulative_total(String cumulative_total) {
        this.cumulative_total = cumulative_total;
    }

    public String getTreatment_total() {
        return treatment_total;
    }

    public void setTreatment_total(String treatment_total) {
        this.treatment_total = treatment_total;
    }
}
