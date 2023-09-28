/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Usuário
 */
public class Conta {
    public double saldo;
    public int agencia=0;
    public int numero=0;
    
    public Conta(){}
    
    public Conta(int numero,int agencia,double saldo)
    {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    
    public  void depositar (double valor)
    {
        saldo += valor;
    }
    
    public void retirar (double valor)
    {
        saldo -= valor;
    }
    
    public double verificarSaldo()
    {
        return saldo;
    }
}
