public class Main {
    public static void main(String[] args) {
int n = 250;
int bill = 0;

if(n <= 100){
   bill = n * 5;
}
else if( n <= 200){
    bill = 100 * 5 + (n-100)*7;  
}
else if(n <= 400){
    bill = 100*5 + 100 * 7 + (n-200)*10;
}
else{
     bill = 100*5 + 100 * 7 + 200*10 + (n-400)*15;
}

 System.out.println(bill);

    }
}
