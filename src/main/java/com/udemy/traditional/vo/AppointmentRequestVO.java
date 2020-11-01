package com.udemy.traditional.vo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Document(collection = "AppointmentVO")
public class AppointmentRequestVO {



    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime appointmentDateTime;

    private String hospitalName;

    private String doctorName;

    private String patientMobileNumber;

    private String patientName;

    private Integer durationInMinutes;

    private String purpose;

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientMobileNumber() {
        return patientMobileNumber;
    }

    public void setPatientMobileNumber(String patientMobileNumber) {
        this.patientMobileNumber = patientMobileNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }


    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "AppointmentRequestVO{" +
                "appointmentDateTime=" + appointmentDateTime +
                ", organizationId='" + hospitalName + '\'' +
                ", staffId='" + doctorName + '\'' +
                ", customerMobileNumber='" + patientMobileNumber + '\'' +
                ", customerName='" + patientName + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
