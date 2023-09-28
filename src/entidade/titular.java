/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Usuário
 */
public class titular {
    private int conta;
    private String nome;
    private double saldo;
    private double taxa = 5.00;
    
    
public titular (int conta,String nome){
    this.conta = conta;
    this.nome= nome;
}    
public titular (int conta,String nome,double saldoInicial){
    this.conta = conta;
    this.nome= nome;
    deposito(saldoInicial);
}
    
public String getNome(){
    return nome;
}    
    
public void setNome(String nome){
    this.nome = nome;
}    
 
public int getConta (){
    return conta ;
}    

public double getSaldo (){
    return saldo;

}
    
public  void deposito(double deposito){ 
    this.saldo += deposito;
   }
   
public void saque(double saque) {
   this.saldo = this.saldo - saque - taxa;
   }

public String toString(){
   return "Conta "
           + conta
           + ", "
           + nome
           +", Saldo: R$ "
           + String.format("%.2f",saldo);
}


}
