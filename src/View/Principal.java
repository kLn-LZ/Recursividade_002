package View;

import Controller.Vector;

public class Principal {

    public static void main(String[] args) {

        Vector menorVec = new Vector();

        int a[] = {5,0, 3, 4};

        int result = 0;

        int vetor = a.length;

        result = menorVec.menor(a, vetor - 1, 4);

        System.out.println(result);

    }
}
