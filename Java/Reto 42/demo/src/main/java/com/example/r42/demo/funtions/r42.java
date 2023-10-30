package com.example.r42.demo.funtions;

/*
 * Crea una función que calcule el punto de encuentro de dos objetos en movimiento
 * en dos dimensiones.
 * - Cada objeto está compuesto por una coordenada xy y una velocidad de desplazamiento
 *   (vector de desplazamiento) por unidad de tiempo (también en formato xy).
 * - La función recibirá las coordenadas de inicio de ambos objetos y sus velocidades.
 * - La función calculará y mostrará el punto en el que se encuentran y el tiempo que tardarn en lograrlo.
 * - La función debe tener en cuenta que los objetos pueden no llegar a encontrarse.
 */
public class r42 {


    public void main(){

        int time = 0;
        int[] object1 = object(2,4,1,1);
        int[] object2 = object(0,2,2,2);

        while (!colision(object1[0], object1[1], object2[0], object2[1]) && time < 180){
            //while no colision->
            object1[0] = object1[0] + object1[2];
            object1[1] = object1[1] + object1[3];

            object2[0] = object2[0] + object2[2];
            object2[1] = object2[1] + object2[3];
            time++;
            System.out.println("Object1-> X: " + object1[0] + " Y:" + object1[1]);
            System.out.println("Object2-> X: " + object2[0] + " Y:" + object2[1]);
            System.out.println("Time: " + time);
        }

        if(colision(object1[0], object1[1], object2[0], object2[1])){
            System.out.println("Colision happends -> \n Object1: X; " + object1[0] + " Y" + object1[1] +
                                "\n Object2: X; " +object2[0] + " Y;" + object2[1]);
            System.out.println("Time: " + time);
        }
        if(time >= 180){
            System.out.println("No Colision happends.");
        }
    }

    public static int[] object(int coorX, int coorY, int velx, int vely){
        return new int[]{coorX, coorY, velx, vely};
    }

    private static int randomNumber(int index) {
        return (int)(Math.random() * (index + 1));
    }

    private boolean colision(int coorX1, int coorY1, int coorX2, int coorY2){
        return coorX1 == coorX2 && coorY1 == coorY2;
    }


}
