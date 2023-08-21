
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emerson
 */
public class TicketList {
 private static TicketList ticketList;
 private List<Ticket> tickets;
 

 public TicketList() {
 tickets= new ArrayList<>();   
 }

public boolean insert(Ticket ticket) {
    int newCode = getsiguienteCodigo(); 
    ticket.setCodigo(newCode); 
    return tickets.add(ticket);
}
public boolean delete(Ticket ticket) {
return tickets.remove(ticket);
    }
public boolean deleteforValue(Tipo tipo){
  return 
}
public Ticket search(int codigo) {
   for (Ticket ticket : tickets) {
   if (ticket.getCodigo() == codigo) {
    return ticket;
            }
        }
        return null;
    }

private int getsiguienteCodigo() {
        int maxCode = 0;
        for (Ticket ticket : tickets) {
            maxCode = Math.max(maxCode, ticket.getCodigo());
        }
        return maxCode + 1; 
    }
public void agregarTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}








