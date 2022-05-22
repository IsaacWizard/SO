package procesador;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Proceso {
    
    String nombre;
    int prioridad, tiempo, llegada, fin, T, E;
    double I;
    ImageIcon logo;
    
    public Proceso(){
        
    }
    
    public Proceso(String name){
        this.nombre=name;
        
        
            this.tiempo = (int) (Math.random()*10+5);
            JOptionPane.showMessageDialog(null, "El tiempo que durará en ejecución el proceso "+name+" es de "+this.tiempo+" segundos");
    
        
    }
    public Proceso(String name, int time){
        this.nombre=name;
        this.tiempo=time;
    }
    public void setLogo(String name){
        ImageIcon imgCh = new ImageIcon(getClass().getResource("/imgs/chrMini.png"));
    ImageIcon imgChG = new ImageIcon(getClass().getResource("/imgs/google-chrome-logo.png"));
    ImageIcon imgIe = new ImageIcon(getClass().getResource("/imgs/ieMini.png"));
    ImageIcon imgIeG = new ImageIcon(getClass().getResource("/imgs/ielogo.png"));
    ImageIcon imgMc = new ImageIcon(getClass().getResource("/imgs/mcMini.png"));
    ImageIcon imgMcG = new ImageIcon(getClass().getResource("/imgs/mclogo.png"));
    ImageIcon imgIm = new ImageIcon(getClass().getResource("/imgs/imMini.png"));
    ImageIcon imgImG = new ImageIcon(getClass().getResource("/imgs/imlogo.png"));
    ImageIcon imgCd = new ImageIcon(getClass().getResource("/imgs/cdMini.png"));
    ImageIcon imgCdG = new ImageIcon(getClass().getResource("/imgs/cdlogo.png"));
        switch(name){
                       case "Chrome":
                          this.logo = imgCh;
                          break;
                          
                       case "Internet Explorer":
                           this.logo = imgIe;
                          break;
                          
                       case "McAfee":
                           this.logo = imgMc;
                          break;
                          
                       case "Impresora":
                           this.logo = imgIm;
                          break;
                          
                       case "CD":
                           this.logo = imgCd;
                          break;
                   }
    }
    public void setTiempo(int time){
        this.tiempo=time;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setLlegada(int ins){
        this.llegada=ins;
    }
    public void setFinal(int end){
        this.fin=end;
    }
    public void setTiempoServicio(){
        this.T=this.fin-this.llegada;
    }
    public void setTiempoEspera(){
        this.E=this.T-this.tiempo;
    }
    public void setIndiceServicio(){
        this.I=this.tiempo/this.T;
    }
    
}
