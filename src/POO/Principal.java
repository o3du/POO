/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Principal {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setTipo("Gol");
        carro.setCor("Amarelo");
        carro.setPlaca("BAT-474");
        carro.setNumPortas(4);
        
        System.out.println("-------CARRO------");
        System.out.println("Cor do carro: "+carro.getCor());
        System.out.println("Numero de portas: "+carro.getNumPortas());
        System.out.println("Placa do carro: "+carro.getPlaca());
        System.out.println("Modelo do carro: "+carro.getTipo());
        
        
    }
    
}
