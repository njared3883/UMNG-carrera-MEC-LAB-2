package carrera;
import java.util.Scanner;
public class Carrera {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int [] wendy = new int [11];
        float a, b;
        float num=50;
        float [] corredoras = new float[11];
        float [] vel = new float [11];
        boolean [] gan = new boolean [11];
        for(int x=1; x<11; x++){
            vel[x] = (float) (Math.random()*num);
            wendy[x]=x;
            gan[x] = false;
            corredoras[x]=0;
        }
        System.out.println("que tan larga es pista de carrera en metros");
        a=ingreso.nextFloat();
        System.out.println("quien crees que ganara la carrera");
        b=ingreso.nextFloat();
        for(int x=1; x<11; x++){
            corredoras[x]=a/vel[x];
            System.out.println(x+" | "+corredoras[x]);
        }
        System.out.println("fin de la carrera");
        if(corredoras[1]<corredoras[2]&&corredoras[1]<corredoras[3]&&corredoras[1]<corredoras[4]&&corredoras[1]<corredoras[5]&&corredoras[1]<corredoras[6]&&corredoras[1]<corredoras[7]&&corredoras[1]<corredoras[8]&&corredoras[1]<corredoras[9]&&corredoras[1]<corredoras[10]){
            System.out.println("la ganadora es la corredora 1");
            a=1;
            gan[1]=true;
            if(b==a){
                System.out.println("lo adivinaste felicidades");
            }
        }else{
            if(corredoras[2]<corredoras[3]&&corredoras[2]<corredoras[4]&&corredoras[2]<corredoras[5]&&corredoras[2]<corredoras[6]&&corredoras[2]<corredoras[7]&&corredoras[2]<corredoras[8]&&corredoras[2]<corredoras[9]&&corredoras[2]<corredoras[10]){
                System.out.println("la ganadora es la corredora 2");
                a=2;
                gan[2]=true;
                if(b==a){
                    System.out.println("lo adivinaste felicidades");
                }
            }else{
                if(corredoras[3]<corredoras[4]&&corredoras[3]<corredoras[5]&&corredoras[3]<corredoras[6]&&corredoras[3]<corredoras[7]&&corredoras[3]<corredoras[8]&&corredoras[3]<corredoras[9]&&corredoras[3]<corredoras[10]){
                    System.out.println("la ganadora es la corredora 3");
                    a=3;
                    gan[3]=true;
                    if(b==a){
                        System.out.println("lo adivinaste felicidades");
                    }
                }else{
                    if(corredoras[4]<corredoras[5]&&corredoras[4]<corredoras[6]&&corredoras[4]<corredoras[7]&&corredoras[4]<corredoras[8]&&corredoras[4]<corredoras[9]&&corredoras[4]<corredoras[10]){
                        System.out.println("la ganadora es la corredora 4");
                        a=4;
                        gan[4]=true;
                        if(b==a){
                            System.out.println("lo adivinaste felicidades");
                        }
                    }else{
                        if(corredoras[5]<corredoras[6]&&corredoras[5]<corredoras[7]&&corredoras[5]<corredoras[8]&&corredoras[5]<corredoras[9]&&corredoras[5]<corredoras[10]){
                            System.out.println("la ganadora es la corredora 5");
                            a=5;
                            gan[5]=true;
                            if(b==a){
                                System.out.println("lo adivinaste felicidades");
                            }
                        }else{
                            if(corredoras[6]<corredoras[7]&&corredoras[6]<corredoras[8]&&corredoras[6]<corredoras[9]&&corredoras[6]<corredoras[10]){
                                System.out.println("la ganadora es la corredora 6");
                                a=6;
                                gan[6]=true;
                                if(b==a){
                                    System.out.println("lo adivinaste felicidades");
                                }
                            }else{
                                if(corredoras[7]<corredoras[8]&&corredoras[7]<corredoras[9]&&corredoras[7]<corredoras[10]){
                                    System.out.println("la ganadora es la corredora 7");
                                    a=7;
                                    gan[7]=true;
                                    if(b==a){
                                        System.out.println("lo adivinaste felicidades");
                                    }
                                }else{
                                    if(corredoras[8]<corredoras[9]&&corredoras[8]<corredoras[10]){
                                        System.out.println("la ganadora es la corredora 8");
                                        a=8;
                                        gan[8]=true;
                                        if(b==a){
                                            System.out.println("lo adivinaste felicidades");
                                        }
                                    }else{
                                        if(corredoras[9]<corredoras[10]){
                                            System.out.println("la ganadora es la corredora 9");
                                            a=9;
                                            gan[9]=true;
                                            if(b==a){
                                                System.out.println("lo adivinaste felicidades");
                                            }
                                        }else{
                                            System.out.println("la ganadora es la corredora 10");
                                            a=10;
                                            gan[10]=true;
                                            if(b==a){
                                                System.out.println("lo adivinaste felicidades");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int x=1; x<11; x++){
            System.out.println(wendy[x]+"|"+vel[x]+"|"+corredoras[x]+"|"+gan[x]);
        }
    }
}