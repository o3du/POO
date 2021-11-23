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
public class Pessoa {

    String nome;
    String genero;
    String bioTipo;
    String corCabelo;
    String corPele;
    int idade;

    //Nome da pessoa
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Gênero da pessoa
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //BioTipo da pessoa
    public String getBioTipo() {
        return bioTipo;
    }

    public void setBioTipo(String bioTipo) {
        this.bioTipo = bioTipo;
    }

    //Cor do Cabelo da pessoa
    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    //Cor da Pele da pessoa
    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    //idade da pessoa
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
