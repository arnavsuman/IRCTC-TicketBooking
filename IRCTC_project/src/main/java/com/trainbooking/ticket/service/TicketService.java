package com.trainbooking.ticket.service;

import java.util.HashMap;
import com.trainbooking.ticket.model.Ticket;

public class TicketService{
    private HashMap<Integer, Ticket> ticketList;

    public TicketService() {
        ticketList = new HashMap<>();
    }
    public boolean createTicket(int ticketId, String userId, String status, int trainNo){
        if (!ticketList.containsKey(ticketId)){
            Ticket newTicket = new Ticket(ticketId, userId, status, trainNo);
            ticketList.put(ticketId, newTicket);
            return true;
        }
        else{
            System.out.println("Ticket already exists");
        }
        return false;
    }

    public Ticket getTicket(int ticketId){
        return ticketList.get(ticketId);
    }

    public boolean updateTicket(int ticketId, String userId, String new_status, int new_trainNo) {
        if (ticketList.containsKey(ticketId)) {
            Ticket currentTicket = getTicket(ticketId);
            currentTicket.setStatus(new_status);
            currentTicket.setTrainNo(new_trainNo);
            ticketList.put(ticketId, currentTicket);
            return true;
        } else {
            System.out.println("Ticket already exists");
        }
        return false;
    }

    public boolean cancel_Ticket(int ticketId) {
        if (ticketList.containsKey(ticketId)) {
            Ticket currentTicket = getTicket(ticketId);
            currentTicket.setStatus("Cancelled");
            ticketList.put(ticketId, currentTicket);
            return true;
        } else {
            System.out.println("Ticket already exists");
        }
        return false;
    }

}