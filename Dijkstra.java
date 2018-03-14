import java.util.*;
class ShortestPah
{

}
public class Dijkstra{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int x ;
int y,min = 9999999,min1 = 99999 ;
int r,next = 0;
int[][] adjecency = new int[n][n];
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
if(i == j){
adjecency[i][j] = 0;
}
else{
adjecency[i][j] = -1;
}
}
}
for(int i=0;i<n;i++){
 x = scan.nextInt();
 y =scan.nextInt();
 r =  scan.nextInt();
adjecency[x-1][y-1] = r;
adjecency[y-1][x-1] = r;
}
int s = scan.nextInt();
if((s-1)!=0){

for(int j = 0;j<n;j++){
int temp = adjecency[s-1][j];
adjecency[s-1][j] = adjecency[0][j];
adjecency[0][j] = temp;

}
}
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
System.out.print(adjecency[i][j] + " ");
}
System.out.println(" ");
}
int[] distance = new int[n];
Boolean sptSet[] = new Boolean[n];
for(int i = 0;i<n;i++){
distance[i] = 999999999;
sptSet[i] = false;
}
distance[s-1] = 0;
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
if(adjecency[next][j] > 0){
if(sptSet[j] == false &&distance[j]<=min){
min = distance[j];
System.out.print(distance[j] + " " + min);
next = j;
}
}
}
System.out.print(next);
sptSet[next] = true;
for(int k = 0;k<n;k++){
if((distance[next] + adjecency[next][k])<distance[k]){
distance[k] = distance[next] + adjecency[next][k];
}
}
}
for (int i = 0; i < n; i++){
            System.out.println(i+" tt "+distance[i]);
}
}
}
