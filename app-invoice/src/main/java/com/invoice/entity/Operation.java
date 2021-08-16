package com.invoice.entity;

import java.sql.Date;

public class Operation {

    private Integer id;
    private Integer idInvoice;
    private Double amount;
    private Date date;

    public Operation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", idInvoice=" + idInvoice +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
