#include <stdio.h> 
void main( )
{  int  n, i, j; 
    printf("input a number\n");  scanf("%d",&n);
    for( i=1; i<=n; i++)
   {   for( j=1;  j<=n-i;  j++) printf(" ");   
        for( j=1;  j<=i;  j++)  printf("%d " ,j );
        for( j=i-1;  j>=1;  j--) printf("%d ",j );
        printf("\n");
    }
    put(”這是哈哈“)；
    put("haha")
}

