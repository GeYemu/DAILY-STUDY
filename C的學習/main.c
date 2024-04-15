#include<stdio.h>
void larger(double*,double*);

int main()
{
    double a,b;
    printf("please input two numbers:a,b\n");
    scanf("%lf,%lf",&a,&b);
    printf("程序已启动，请输入两个数字：\n");
    // 然后是您的其他代码
}

    larger(&a,&b);
    printf("the change is%lf,%lf",a,b);
    return 0;
}
void larger(double *a,double *b)
{
    double x;
    if(*a>*b)
        x=*a;
    else if(*a==*b)
        ;
    else
   x=*b;
    *a=x;
    *b=x;
}

