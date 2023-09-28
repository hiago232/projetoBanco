/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.banco;

/**
 *
 * @author Usuário
 */

import entidade.Conta;
import javax.swing.*;


public class aplicacao {
    // Declarando as instancias de Conta
       
  public void poupanc(){}
    public static void main (String entrada[])
    {
      
        Conta cc = new Conta();
        Conta poupanca = new Conta();
        double deposito;
         //Entrada de Dados
      
         poupanca.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta:", "Banco Natureza", JOptionPane.QUESTION_MESSAGE));
         poupanca.agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da agência da conta:", "Banco Natureza", JOptionPane.QUESTION_MESSAGE));
         deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor do depósito:", "Banco Natureza", JOptionPane.QUESTION_MESSAGE));
         poupanca.depositar(deposito);
         JOptionPane.showMessageDialog(null, "Saldo atual: R$"+poupanca.verificarSaldo(),"Banco Natureza",JOptionPane.INFORMATION_MESSAGE);
         
    
          
          
    }
}
