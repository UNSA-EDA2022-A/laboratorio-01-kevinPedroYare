package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int gabriel = 0, num = a, k = 0, numTotal = 0, aux = 0, min = 0;

		while (a > 0) {
			num = a % 10;
			if (num != 0 && num != 1 && !(num == 2 && min == 0)) {
				gabriel = 1;
				break;
			}
			if (num == 1) {
				min = 1;
			}
			aux = numTotal;
			numTotal = (int) (num * (Math.pow(2, k+1) - 1));
			k++;
			numTotal = numTotal + aux;
			a = a / 10;
		}
		if (gabriel == 0)
			return "" + numTotal;
		else
			return "El numero proporcionado no esta en base Gabriel.";
	}
}
