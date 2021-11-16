/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubarthuralves;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GithubArthurAlves {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        String nome;  
        nome = JOptionPane.showInputDialog(null,"qual seu nome ");
        JOptionPane.showMessageDialog(null, nome+" Bem vindo");
        System.exit(0);
    }
    
}
