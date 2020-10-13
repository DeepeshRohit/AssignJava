package com.company;
import java.util.*;
public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int i;

                do{

                        System.out.println("Enter"+"\n"+"1  missing number in array"+"\n"+"2 largest 3 elements in array"+"\n"+"3 for finding common elements in 3 sorted array"
                                +"\n"+"4 moving all zeroes at end of array" + "\n"+"5 to exit");

                        i = scanner.nextInt();

                        switch(i) {
                                case 1:
                                {

                                        int a[]= {1,2,3,4,7,6,8};
                                        int n =a.length;
                                        MissingNo mn =  new MissingNo();
                                        int missingNo = mn.getMissingNo(a,n);
                                        System.out.println(missingNo);

                                        break;
                                }
                                case 2:
                                {
                                        int a[] = new int[10];
                                        System.out.println("Enter size of array <= 10");
                                        int n=scanner.nextInt();
                                        System.out.println("Enter array elements");
                                        for(int j=0;j<n;j++) {
                                                a[j]=scanner.nextInt();
                                        }
                                        PrintLargest pl= new PrintLargest();
                                        pl.print3largest(a,n);
                                        break;
                                }

                                case 3:
                                {
                                        int a1[] = {1,5,10,20,40,80};
                                        int a2[] = {6,7,20,80,100};
                                        int a3[] = {3,4,15,20,30,70,80,120};

                                       FindCommon com = new FindCommon();
                                        System.out.println("Common Elements :");
                                      com.findCommon(a1,a2,a3);
                                        break;
                                }

                                case 4:
                                {
                                        System.out.println("Enter array length :");
                                        int n = scanner.nextInt();
                                        int a[] = new int[n];
                                        System.out.println("Enter array elements");
                                        for(int j=0;j<n;j++) {
                                                a[j]=scanner.nextInt();
                                        }
                                        System.out.println("Array after pushing zeroes at end :");
                                        ZeroInEnd zero = new ZeroInEnd(a,n);
                                        int[]b =zero.zeroInEnd(a,n);
                                        for(int k=0;k<n;k++)
                                        {
                                                System.out.println(b[k]+" ");
                                        }
                                        break;
                                }


                                default :
                                {

                                        break;
                                }

                        }

                }while(i!=5);
                scanner.close();
        }
}