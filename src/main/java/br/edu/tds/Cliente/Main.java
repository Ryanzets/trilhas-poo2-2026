/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Cliente;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 250.0f, 10);
        Produto p2 = new Produto("Mouse", 80.0f, 5);

        
        System.out.println("Produto 1:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Quantidade: " + p1.getQuantidade());

        System.out.println("\nProduto 2:");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Preço: " + p2.getPreco());
        System.out.println("Quantidade: " + p2.getQuantidade());

        
        Produto p3 = new Produto();
        Produto p4 = new Produto();

        // Atribuindo valores com setters
        p3.setNome("Teclado");
        p3.setPreco(150.0f);
        p3.setQuantidade(20);

        p4.setNome("Monitor");
        p4.setPreco(800.0f);
        p4.setQuantidade(15);

        
        System.out.println("\nProduto 3:");
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Preço: " + p3.getPreco());
        System.out.println("Quantidade: " + p3.getQuantidade());

        System.out.println("\nProduto 4:");
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Preço: " + p4.getPreco());
        System.out.println("Quantidade: " + p4.getQuantidade());

        
        p1.aplicarDesconto(10);
        p1.aumentarQuantidade(5);
        p1.diminuirQuantidade(3);

        
        // Exibindo dados atualizados
        System.out.println("\nProduto 1 após atualização:");
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Quantidade: " + p1.getQuantidade());
    }
}
