import java.util.Arrays;
import java.util.Scanner;
public class Swap{
public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("enter size");
int si = s.nextInt();
int a[] = new int[si];
for (int i=0;i<si;i++){
a[i]=s.nextInt();
}
int f=0;
int l=si-1;
while(f<l){
int t = a[l];
a[l] = a[f];
a[f]=t;
f++;
l--;
}
System.out.println(Arrays.toString(a));
}
}
