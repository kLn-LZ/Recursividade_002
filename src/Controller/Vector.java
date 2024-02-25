package Controller;

public class Vector {

    public Vector () {
        super();

    }

    public int menor (int vec[], int tam, int lastV) {


        // Condição de parada: váriavel tam ser negativo
        if (tam < 0) {

            return lastV;

        }

        if (vec[tam] < lastV) {

            lastV = vec[tam];
        }

        // Chamada de passo: chamando a função até a váriavel ser negativa (percorrer o vetor inteiro)
        return menor(vec, tam - 1, lastV);




    }

}
