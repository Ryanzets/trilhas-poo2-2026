package br.edu.tds.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Produto {

    private String nome;
    private float preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    // Getters
    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public void aplicarDesconto(float percentual) {
        preco = preco - (preco * percentual / 100);
    }

    public void aumentarQuantidade(int valor) {
        quantidade += valor;
    }

    public void diminuirQuantidade(int valor) {
        quantidade -= valor;
        if (quantidade < 0) {
            quantidade = 0;
        }
    }
}    

