package com.company;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    private static void lab1(){
        System.out.println("Hello World!");
    }

    private static void lab21(){
        System.out.println("Лабораторная 2 задание 1");
        for(int i=2; i<=100; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void lab22()
    {
        System.out.println("Лабораторная 2 задание 2");
        Scanner in = new Scanner(System.in);
        System.out.println("M:");
        int m=0;
        if(in.hasNextInt()) m=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.println("N:");
        int n=0;
        if(in.hasNextInt()) n=in.nextInt();
        else System.out.println("Введены неверные значения");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print("8");
            System.out.println();
        }
    }

    private static void lab23()
    {
        System.out.println("Лабораторная 2 задание 3");
        for(int i=0; i<=10; i++)
        {
            for(int j=0; j<i; j++)
                System.out.print("8");
            System.out.println();
        }
    }

    private static int min(int a, int b){       //метод возвращает минимальлный элемент или сумму элементов, есло они равны
        if(a<b) return a;
        if(a>b) return b;
        return a+b;
    }

    private static void lab24()
    {
        System.out.println("Лабораторная 2 задание 4");
        System.out.println("M:");
        Scanner in = new Scanner(System.in);
        int m=0;
        if(in.hasNextInt()) m=in.nextInt();
        System.out.println("N:");
        int n=0;
        if(in.hasNextInt()) n=in.nextInt();
        if(min(m,n)!=m+n) System.out.println(min(m,n));
        else System.out.println("Числа равны");
    }

    private static void lab25()
    {
        System.out.println("Лабораторная 2 задание 5");
        System.out.println("Имя 1:");
        Scanner in = new Scanner(System.in);
        String m=in.nextLine();
        System.out.println("Имя 2:");
        String n=in.nextLine();
        if(m.length()==n.length()) System.out.println("Длинны равны");
        else System.out.println("Длинны различны");
        if(m.compareToIgnoreCase(n)==m.length()) System.out.println("Имена идентичны");
        else System.out.println("Имена различны");
    }

    private static void min(int m, int n, int a, int b)     //Метод возвращает минимальное из 4 чисел
    {
        if(min(m,n)!=m+n) m=min(m,n);
        if(min(a,b)!=a+b) a=min(a,b);
        if (min(m,a)==a+b) System.out.println("Числа равны");
        else System.out.println(min(m,a));
    }

    private static void lab26()
    {
        System.out.println("Лабораторная 2 задание 6");
        System.out.println("M:");
        Scanner in = new Scanner(System.in);
        int m=0;
        if(in.hasNextInt()) m=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.println("N:");
        int n=0;
        if(in.hasNextInt()) n=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.println("a:");
        int a=0;
        if(in.hasNextInt()) a=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.println("b:");
        int b=0;
        if(in.hasNextInt()) b=in.nextInt();
        else System.out.println("Введены неверные значения");
        min(m,n,a,b);
        System.out.println();
    }

    private static void lab27()
    {
        System.out.println("Лабораторная 2 задание 7");
        System.out.println("X");
        Scanner in = new Scanner(System.in);
        int x=0;
        if(in.hasNextInt()) x=in.nextInt();
        System.out.println("Y:");
        int y=0;
        if(in.hasNextInt()) y=in.nextInt();
        else System.out.println("Введены неверные значения");
        if(x>0) {
            if (y > 0) System.out.println("I четверть");
            if (y < 0) System.out.println("IV четверть");
        }
        if(x<0) {
            if (y > 0) System.out.println("II четверть");
            if (y < 0) System.out.println("III четверть");
        }
    }

    private static void lab31()
    {
        System.out.println("Лабораторная 3 задание 1");
        int a=10;
        int[] mass=new int[a];
        mass[0]=2;
        for(int i=1; i<a; i++) {
            mass[i]=mass[i-1]+2;
        }
        for(int i=0; i<a; i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        for(int i=0; i<a; i++) {
            System.out.println(mass[i]);
        }
    }

    private static void lab32()
    {
        System.out.println("Лабораторная 3 задание 2");
        int a=50;
        int[] mass=new int[a];
        mass[0]=1;
        for(int i=1; i<a; i++) {
            mass[i]=mass[i-1]+2;
        }
        for(int i=0; i<a; i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.println(' ');
        for(int i=a-1; i>-1; i--) {
            System.out.print(mass[i]+" ");
        }
        System.out.println();
    }

    private static void lab33()
    {
        System.out.println("Лабораторная 3 задание 3");
        int a=15;
        int[] mass=new int[a];

        for(int i=0; i<a; i++){
            mass[i]=(int)Math.ceil(Math.random()*10-1);
        }
        for(int i=0; i<a; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int count=0;
        for(int i=0; i<a; i++) {
            if(mass[i]%2==0 && mass[i]!=0)  count++;
        }
        System.out.println(count);
    }

    private static void lab34()
    {
        System.out.println("Лабораторная 3 задание 4");
        int a=8;
        int b=5;
        int[][] mass=new int[a][b];
        for(int i=0; i<a; i++){
            for (int j = 0; j < b; j++){
                mass[i][j] = (int) Math.ceil(Math.random() * 90 + 9);
            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void lab35() {
        System.out.println("Лабораторная 3 задание 5");
        int a=7;
        int b=4;
        int[][] mass=new int[a][b];

        for(int i=0; i<a; i++){
            for (int j = 0; j < b; j++){
                mass[i][j] = (int) Math.ceil(Math.random() * 5 - 5);
            }
        }
        int[] mult = new int[a];
        for(int i=0; i<a; i++) {
            mult[i]=1;
            for(int j=0; j<b; j++){
                System.out.print(mass[i][j] + " ");
                mult[i]=abs(mult[i]*mass[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int max = mult[0];
        int imax = 0;
        for (int i = 0; i < mult.length; i++){
            int multi = mult[i];
            if (max < multi){
                max = multi;
                imax=i;
            }
        }
        System.out.println(imax);
    }

    private static int[] lab41input (int a, int b, int c) {     //Метод возвращает массив чисел заданной размерности в заданном отрезке
        int[] mass=new int[c];
        for(int i=0;i<c;i++){
            mass[i]=(int) Math.ceil(Math.random() * (b-a) +a);
        }
        return mass;
    }

    private static void lab41() {
        System.out.println("Лабораторная 4 задание 1");
        Scanner in = new Scanner(System.in);
        int count=20;
        System.out.println("a:");
        int a=0;
        if(in.hasNextInt()) a=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.println("b:");
        int b=0;
        if(in.hasNextInt()) b=in.nextInt();
        else System.out.println("Введены неверные значения");
        int[] mass;
        mass=lab41input(a,b,count);
        for(int i=0; i<count; i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.println();
    }

    private static void lab42(){
        System.out.println("Лабораторная 4 задание 2");
        Scanner in = new Scanner(System.in);
        int[][] ab = new int[5][2];
        int[][] mass=new int[5][10];
        for(int i=0; i<5; i++){
            System.out.println("a"+(i+1));
            if(in.hasNextInt()) ab[i][0]=in.nextInt();
            else System.out.println("Введены неверные значения");
            System.out.println("b"+(i+1));
            if(in.hasNextInt()) ab[i][1]=in.nextInt();
            else System.out.println("Введены неверные значения");
            mass[i]=lab41input(ab[i][0],ab[i][1],10);
            for(int j=0; j<10; j++) {
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void lab43()
    {
        System.out.println("Лабораторная 4 задание 3");
        Scanner in = new Scanner(System.in);
        System.out.println("a:");
        int a2=0;
        if(in.hasNextInt()) a2=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.println("b:");
        int b2=0;
        if(in.hasNextInt()) b2=in.nextInt();
        else System.out.println("Введены неверные значения");
        int[] mass=lab41input(a2,b2,20);
        for(int i=0; i<19; i++) {
            for(int j=0; j<19; j++) {
                if(mass[j]>mass[j+1]) {
                    int tmp=mass[j];
                    mass[j]=mass[j+1];
                    mass[j+1]=tmp;
                }
            }
        }
        for(int i=0; i<20; i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.println();
    }

    private static long lab44fibo(int n){           //Метод возвращает n-ное число Фибоначчи
        if(n==1||n==2)
            return 1;
        if(n==0)
            return 0;
        return lab44fibo(n-1)+lab44fibo(n-2);
    }

    private static void lab44()                     //Метод отправляет номер числа Фибоначчи
    {
        System.out.println("Лабораторная 4 задание 4");
        for(int i=1; i<9999; i++){
            System.out.print(i);
            System.out.print(":\t");
            System.out.println(lab44fibo(i));
        }
    }

    public static void main(String[] args) {
        lab1();
        lab21();
        lab22();
        lab23();
        lab24();
        lab25();
        lab26();
        lab27();
        lab31();
        lab32();
        lab33();
        lab34();
        lab35();
        lab41();
        lab42();
        lab43();
        lab44();
    }
}
