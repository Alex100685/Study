
public class MaxMinByte {
    public static void main(String[] args){
        byte [] massive = {25,11,12,5,47,15,65,87,12,26,45};
        int max = massive[0];
        int min = massive[0];
        for(int i = 0; i< massive.length; i ++){
            if(massive[i] > max){
                max = massive[i];
            }
            else  if(massive[i] < min){
                min = massive[i];
            }
        }
        System.out.println(min + " " + max);
        
   int n = massive.length - 1;
   System.out.println("Первый элемент :" +massive[0]+ "Последний элемент :" +massive[n]);
   System.out.println("Среднеарифметическое первого и последнего элементов :" +(massive[0]+massive[n])/2);
   int sum = 0;
   for (int i = 0; i<massive.length; i++) {
	   sum = sum + massive[i];
   }
   System.out.println("Сумма всех элементов :" +sum);
    
    
    } }