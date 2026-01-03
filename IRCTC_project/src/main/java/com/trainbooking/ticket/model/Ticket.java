package com.trainbooking.ticket.model;

public class Ticket
{
    private int ticketId;
    private String userId;
    private String status;
    private int trainNo;

    public Ticket(int ticketId, String userId, String status, int trainNo){
        this.ticketId = ticketId;
        this.userId = userId;
        this.status = status;
        this.trainNo = trainNo;

    }
    public int getTicketId(){return ticketId;}

    public String getStatus(){return status;}
    public void setStatus(String newStatus){this.status = newStatus;}

    public String getUserId(){return userId;}

    public int getTrainNo(){return trainNo;}
    public void setTrainNo(int trainNo){this.trainNo = trainNo;}

}