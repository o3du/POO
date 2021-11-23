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
        //Construtor 1 - com assinatura
        Carro carro = new Carro("Gol", "Vermelho", "BAT-4740", 2);
        
        carro.imprimeDadosCarro();
        
        Carro outroCarro = new Carro();
        outroCarro.setCor("Preto");
        outroCarro.setTipo("Fusca");
        outroCarro.setNumPortas(2);
        outroCarro.setPlaca("ASP-458");
        
        System.out.println("-------CARRO------");
        System.out.println("Cor do carro: " + outroCarro.getCor());
        System.out.println("Numero de portas: " + outroCarro.getNumPortas());
        System.out.println("Placa do carro: " + outroCarro.getPlaca());
        System.out.println("Modelo do carro: " + outroCarro.getTipo());
        
        /* double a=3,b=2;
        System.out.println("Quadrado de "+a+" "
                + "é: "+Calculo.elevar(a)); */
        
        
                
        
        Pessoa pessoa = new Pessoa();
    
          pessoa.setNome("Eduardo");
          pessoa.setGenero("Masculino");
          pessoa.setBioTipo("Magro");
          pessoa.setCorCabelo("Preto");
          pessoa.setCorPele("Pardo");
          pessoa.setIdade(17);
          
          pessoa.imprimeDadosPessoa();
        
        
    }
        
        
        
}

