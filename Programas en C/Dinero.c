#include <stdio.h>

int main()
{
    int num, unidades, decenas, centenas, miles;
    scanf("%i",&num);
    miles = num/1000;
    centenas = (num-(miles*1000))/100;
    decenas=(num- (miles*1000 + centenas*100))/10;
	unidades=num-(miles*1000 + centenas*100 + decenas*10 );
	printf("%i billete(s) de 1000\n", miles);
    switch(centenas){
        case 1:
        printf("1 billete(s) de 100\n");
        break;
    case 2:
        printf("1 billete(s) de 200\n");
        break;
    case 3:
        printf("1 billete(s) de 200\n");
        printf("1 billete(s) de 100\n");
        break;
    case 4:
        printf("2 billete(s) de 200\n");
        break;
    case 5:
        printf("1 billete(s) de 500\n");
        break;
    case 6:
        printf("1 billete(s) de 500\n");
        printf("1 billete(s) de 100\n");
        break;
    case 7:
        printf("1 billete(s) de 500\n");
        printf("1 billete(s) de 200\n");
        break;
    case 8:
        printf("1 billete(s) de 500\n");
        printf("1 billete(s) de 200\n");
        printf("1 billete(s) de 100\n");
        break;
    case 9:
        printf("1 billete(s) de 500\n");
        printf("2 billete(s) de 200\n");
        break;
    }
    switch(decenas){
        case 1:
        printf("1 moneda(s) de 10\n");
        break;
    case 2:
        printf("1 billete(s) de 20\n");
        break;
    case 3:
        printf("1 billete(s) de 20\n");
        printf("1 moneda(s) de 10\n");
        break;
    case 4:
        printf("2 billete(s) de 20\n");
        break;
    case 5:
        printf("1 billete(s) de 50\n");
        break;
    case 6:
        printf("1 billete(s) de 50\n");
        printf("1 moneda(s) de 10\n");
        break;
    case 7:
        printf("1 billete(s) de 50\n");
        printf("1 billete(s) de 20\n");
        break;
    case 8:
        printf("1 billete(s) de 50\n");
        printf("1 billete(s) de 20\n");
        printf("1 moneda(s) de 10\n");
        break;
    case 9:
        printf("1 billete(s) de 50\n");
        printf("2 billete(s) de 20\n");
        break;
    }
    switch(unidades){
        case 1:
        printf("1 moneda(s) de 1\n");
        break;
    case 2:
        printf("1 moneda(s) de 2\n");
        break;
    case 3:
        printf("1 moneda(s) de 2\n");
        printf("1 moneda(s) de 1\n");
        break;
    case 4:
        printf("2 moneda(s) de 2\n");
        break;
    case 5:
        printf("1 moneda(s) de 5\n");
        break;
    case 6:
        printf("1 moneda(s) de 5\n");
        printf("1 moneda(s) de 1\n");
        break;
    case 7:
        printf("1 moneda(s) de 5\n");
        printf("1 moneda(s) de 2\n");
        break;
    case 8:
        printf("1 moneda(s) de 5\n");
        printf("1 moneda(s) de 2\n");
        printf("1 moneda(s) de 1\n");
        break;
    case 9:
        printf("1 moneda(s) de 5\n");
        printf("2 moneda(s) de 2\n");
        break;
    }
    return 0;
}

