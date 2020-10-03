/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.util;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author sKm
 */
public class Validator {

    public ArrayList<String> msgErro = new ArrayList<>();

    /**
     * Método para validar número em um TextField
     *
     * @param txt
     */
    
    public void validaNumero(JTextField txt, JLabel lbl) {

        try {
            // Verificar se o campo está vazio

            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            
            //Converter valor recebido

            int valorConvertido = Integer.parseInt(txt.getText());
            lbl.setForeground(Color.getHSBColor(78, 100, 22));

        } catch (NumberFormatException e) {
            this.msgErro.add("Falha ao converter o valor informado no campo" + txt.getName() + "em Inteiro");
            lbl.setForeground(Color.RED);

        } catch (IllegalArgumentException e) {
            this.msgErro.add("Digite um valor para o campo " + txt.getName());
            lbl.setForeground(Color.RED);
        }

    }
    
    
    
    // Metodo valida Campo Float
   public void validaFloat (JTextField txt){
       
   }
   

    public static void main(String[] args) {

    }

}
