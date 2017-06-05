#include<stdio.h>
void main()
{
 int a[10],avg,n,sum=0;
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
  scanf("%d",&a[i]);
  sum=sum+a[i];
 }
 avg=sum/n;
 printf("%d",avg);
} 
