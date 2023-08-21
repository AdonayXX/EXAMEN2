/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wendy
 */
public class Ticket {
    private int codigo; 
    private String Tipo; 

    public Ticket(String Tipo) {
        this.Tipo = Tipo;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int numero) {
        this.codigo= numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Ticket " + "Numero: " + codigo + "Tipo: " + Tipo + ' ';
    }
    
    
}
