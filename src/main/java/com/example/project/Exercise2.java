package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int rana = 0, total = a.length, menorSaltos = 0;
		int [] saltos = new int [total+1];
		int [] aux = new int [total+1];
		saltos[rana]=0;
		for(int i = 1; i <= total; i++){
			saltos[i] = a[i-1];
		}
		for(int i = 0; i < total; i++){
			aux[i] = a[i];
		}
		aux[total] = a[total-1]+50;

		int i = 0;
		while(i <= total){
			if((aux[i] - saltos[rana]) <= 50){
				i++;
			}else if((aux[i] - aux[i-1]) > 50){
				return menorSaltos = -1;
			}else{
				rana = i;
				i++;
				menorSaltos++;
				System.out.println("paso 2 " + saltos[rana]);
			}
		}

		return menorSaltos;
	}
}
