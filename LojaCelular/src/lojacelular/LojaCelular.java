

package lojacelular;

import javax.swing.JOptionPane;

public class LojaCelular {

    public static void main(String[] args) {
       
      Pais pais = new Pais();
      
      pais.setNome("EUA");
      pais.setCapital("Washington DC");
      pais.setNumhabitantes(319000000);
       
      Fabricante fabricante = new Fabricante();
      
      fabricante.setNome("Apple");
      fabricante.setPais(pais);
      fabricante.setDatafundacao("1/04/1976");
      
      Modelo modelo = new Modelo();
      
      modelo.setNomemodelo("Iphone 6");
      modelo.setMemoria("8");
      modelo.setChips("1");
      
      JOptionPane.showMessageDialog(null,"MODELO:" + modelo.getNomemodelo()+ "\nFABRICANTE:" + fabricante.getNome()+ "\nPAÍS:" + pais.getNome());
    }
    static {
        
      Pais pais = new Pais();
      
      pais.setNome("Coreia do sul");
      pais.setCapital("Seul");
      pais.setNumhabitantes(12000000);
       
      Fabricante fabricante = new Fabricante();
      
      fabricante.setNome("Samsung");
      fabricante.setPais(pais);
      fabricante.setDatafundacao("15/08/1970");
      
      Modelo modelo = new Modelo();
      
      modelo.setNomemodelo("SIII");
      modelo.setMemoria("8");
      modelo.setChips("1");
       
       JOptionPane.showMessageDialog(null,"MODELO:" + modelo.getNomemodelo()+ "\nFABRICANTE:" + fabricante.getNome()+ "\nPAÍS:" + pais.getNome());
               
               
    }
    static {
       Pais pais = new Pais();
      
      pais.setNome("Coreia do sul");
      pais.setCapital("Seul");
      pais.setNumhabitantes(12000000);
       
      Fabricante fabricante = new Fabricante();
      
      fabricante.setNome("Samsung");
      fabricante.setPais(pais);
      fabricante.setDatafundacao("15/08/1970");
      
      Modelo modelo = new Modelo();
      
      modelo.setNomemodelo("SII");
      modelo.setMemoria("8");
      modelo.setChips("1");
       
       JOptionPane.showMessageDialog(null,"MODELO:" + modelo.getNomemodelo()+ "\nFABRICANTE:" + fabricante.getNome()+ "\nPAÍS:" + pais.getNome());
       
    }
    
}
