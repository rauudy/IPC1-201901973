package tarea1;

public class SeccionB {

    String[] nombresB = new String[5];
    int[] carnetB = new int[5];

    public SeccionB() {
        llenarSeccionB();
        mostrarSeccionB();
    }

    public void llenarSeccionB() {

        nombresB[0] = "Lucio Garcia";
        nombresB[1] = "Lionel Cuccittini";
        nombresB[2] = "Sergio del Castillo";
        nombresB[3] = "Martín Disalvo";
        nombresB[4] = "Ramón Rodríguez";

        carnetB[0] = 201904578;
        carnetB[1] = 201503625;
        carnetB[2] = 201807913;
        carnetB[3] = 201909382;
        carnetB[4] = 201906054;

    }

    public void mostrarSeccionB() {
        int posicion;
        for (posicion = 0; posicion < 5; posicion++) {
            System.out.println(nombresB[posicion] + " " + carnetB[posicion]);
        }

    }

}
