/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Cliente;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args){
        System.out.println("Testando objetos da classe cliente");
        
        String mensagem = "Ola mundo";
        int contador = 1;
        Cliente c1 = new Cliente("Davi", 19, "123456789");
        c1.imprimeDadosCliente();
        
        Cliente c2 = new Cliente("Leo", 18, "987654321");
         c2.imprimeDadosCliente();
         
        Cliente c3 = new Cliente("Gabriel", 20, "1020304050");
        c3.imprimeDadosCliente();
        
        Cliente c4 = new Cliente();
        c4.setNome("Amaral");
        c4.setCPF("9999999999");  
        c4.setIdade(88);  
        c4.imprimeDadosCliente();
        
        String nome = c4.getNome();
        System.out.println("Nome obtido pelo get: "+ nome); 
       
        
    }
        
}