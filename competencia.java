package carrera;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class competencia extends Thread{
    private JLabel eti;
    private pista p;
    
    public competencia(JLabel eti, pista p){
        this.eti = eti;
        this.p = p;
    }
    @Override
    public void run(){
        int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0, c10=0;
        String tu = p.getcarla().getText();
        while(true){
            try{
                sleep((int)(Math.random()*350));
                c1=p.getcarro1().getLocation().x;
                c2=p.getcarro2().getLocation().x;
                c3=p.getcarro3().getLocation().x;
                c4=p.getcarro4().getLocation().x;
                c5=p.getcarro5().getLocation().x;
                c6=p.getcarro6().getLocation().x;
                c7=p.getcarro7().getLocation().x;
                c8=p.getcarro8().getLocation().x;
                c9=p.getcarro9().getLocation().x;
                c10=p.getcarro10().getLocation().x;
                if(c1<p.getllegada().getLocation().x-10&&c2<p.getllegada().getLocation().x-10&&c3<p.getllegada().getLocation().x-10&&c4<p.getllegada().getLocation().x-10&&c5<p.getllegada().getLocation().x-10&&c6<p.getllegada().getLocation().x-10&&c7<p.getllegada().getLocation().x-10&&c8<p.getllegada().getLocation().x-10&&c9<p.getllegada().getLocation().x-10&&c10<p.getllegada().getLocation().x-10){
                    eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                    p.repaint();
                }else{
                    break;
                }
            }catch (InterruptedException e){
                
            }
            if(eti.getLocation().x>=p.getllegada().getLocation().x-10){
                if(c1>c2&&c1>c3&&c1>c4&&c1>c5&&c1>c6&&c1>c7&&c1>c8&&c1>c9&&c1>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 1");
                    if("1.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c2>c3&&c2>c4&&c2>c5&&c2>c6&&c2>c7&&c2>c8&&c2>c9&&c2>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 2");
                    if("2.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c3>c4&&c3>c5&&c3>c6&&c3>c7&&c3>c8&&c3>c9&&c3>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 3");
                    if("3.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c4>c5&&c4>c6&&c4>c7&&c4>c8&&c4>c9&&c4>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 4");
                    if("4.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c5>c6&&c5>c7&&c5>c8&&c5>c9&&c5>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 5");
                    if("5.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c6>c7&&c6>c8&&c6>c9&&c6>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 6");
                    if("6.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c7>c8&&c7>c9&&c7>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 7");
                    if("7.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c8>c9&&c8>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 8");
                    if("8.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else if(c9>c10){
                    JOptionPane.showMessageDialog(null, "gano el carro 9");
                    if("9.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "gano el carro 10");
                    if("10.0".equals(tu)){
                        JOptionPane.showMessageDialog(null,"FELIZIDADES GANASTE");
                    } else {
                        JOptionPane.showMessageDialog(null, "lo sentimos, PERDISTE");
                    }
                }
            }
        }
    }
}
