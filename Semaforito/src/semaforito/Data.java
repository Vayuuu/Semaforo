package semaforito;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @val
 */
public class Data implements Runnable{
        JButton rojo, amarillo, verde;
        JTextField texto;
        int contador=0,temp=0,temp2=0,temp3=0,temp4=0;
public Data(JButton entrada1, JButton entrada2, JButton entrada3) {
        this.rojo = entrada1;
        this.amarillo = entrada2;
        this.verde = entrada3;
}
public void Data(){
            new Thread(this).start();
}
    @Override
    public void run() {
        while(true){
            contador ++;
            if(contador>=1 && contador<=5){
                temp ++;
            }
            if(contador==1){
                rojo.setBackground(Color.red);
                amarillo.setBackground(Color.gray);
                verde.setBackground(Color.gray);
            }
            if(contador>=5 && contador<=8){
                temp2 ++;
            }
            if(contador==5){
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.gray);
            }
            if(contador>=8 && contador <= 15){
                temp3 ++;
            }
            if(contador==8){
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.gray);
                verde.setBackground(Color.green);
            }
            if(contador>=15 && contador<=21){
                temp4 ++;
            }
            if(contador==15){
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.gray);   
            }
            if(contador==20){
                contador=0;
                temp=0;
                temp2=0;
                temp3=0;
                temp4=0;
            }
            try{
                sleep(1000);
            }catch(Exception e){
            }
            
        }
    }
}












