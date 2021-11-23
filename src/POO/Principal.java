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
        
        carro.imprimeDadosCarro();
        
        
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

