package com.cdsadmin.business.domain;

import java.time.LocalDate;

public class MergerNotes {

    private Customer customerFrom;

    private Customer customerTo;

    private String noteNo;

    private String industry;

    private LocalDate effectiveDate;

    private String instrumentType;

    private Long mergerId;

    private Long noteId;

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }


    public Long getMergerId() {
        return mergerId;
    }

    public void setMergerId(Long mergerId) {
        this.mergerId = mergerId;
    }

    public Customer getCustomerFrom() {
        return customerFrom;
    }

    public void setCustomerFrom(Customer customerFrom) {
        this.customerFrom = customerFrom;
    }

    public Customer getCustomerTo() {
        return customerTo;
    }

    public void setCustomerTo(Customer customerTo) {
        this.customerTo = customerTo;
    }

    public String getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(String noteNo) {
        this.noteNo = noteNo;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }


}
