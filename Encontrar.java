import java.math.BigInteger;
public class Encontrar
{
    String resultado(int dia, int mes, int año){
    String res = "";
    int enero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
    enero = 31; marzo = 31; abril = 30; mayo=31; junio=30; julio=31; agosto=31;
    septiembre=30; octubre=31; noviembre=30; diciembre = 31;
    int febreroBisiesto = 29;
    int febreroNormal = 28;
    int numerador = 0;
    int denominador;
    if ((año % 4 == 0 && año%100 !=0)||(año%400 ==0)) {
        switch (mes){
        case 1 : numerador = dia;
                break;
        case 2 : numerador = enero + dia;
                break;
        case 3 : numerador = enero+ febreroBisiesto + dia;
                break;
        case 4 : numerador = enero + febreroBisiesto + marzo + dia;
                break;
        case 5 : numerador = enero + febreroBisiesto + marzo + abril + dia;
                break;
        case 6 : numerador = enero + febreroBisiesto + marzo + abril + mayo + dia;
                break;
        case 7 : numerador = enero + febreroBisiesto + marzo + abril + mayo + junio + dia;
                break;
        case 8 : numerador = enero + febreroBisiesto + marzo + abril + mayo + junio + julio +dia;
                break;
        case 9 : numerador = enero + febreroBisiesto + marzo + abril + mayo + junio + julio + agosto + dia;
                break;
        case 10 : numerador = enero + febreroBisiesto + marzo + abril + mayo + junio + julio + agosto + septiembre + dia;
                break;
        case 11 : numerador = enero + febreroBisiesto + marzo + abril + mayo + junio + julio + agosto + septiembre + octubre + dia;
                break;
        case 12 : numerador = enero + febreroBisiesto + marzo + abril + mayo + junio + julio + agosto + septiembre +  octubre + noviembre + dia;
                break;
               
    }
    denominador = 366;
    }
    else{
        switch (mes){
        case 1 : numerador = dia;
                break;
        case 2 : numerador = enero + dia;
                break;
        case 3 : numerador = enero+ febreroNormal + dia;
                break;
        case 4 : numerador = enero + febreroNormal + marzo + dia;
                break;
        case 5 : numerador = enero + febreroNormal + marzo + abril + dia;
                break;
        case 6 : numerador = enero + febreroNormal + marzo + abril + mayo + dia;
                break;
        case 7 : numerador = enero + febreroNormal + marzo + abril + mayo + junio + dia;
                break;
        case 8 : numerador = enero + febreroNormal + marzo + abril + mayo + junio + julio +dia;
                break;
        case 9 : numerador = enero + febreroNormal + marzo + abril + mayo + junio + julio + agosto + dia;
                break;
        case 10 : numerador = enero + febreroNormal + marzo + abril + mayo + junio + julio + agosto + septiembre + dia;
                break;
        case 11 : numerador = enero + febreroNormal + marzo + abril + mayo + junio + julio + agosto + septiembre + octubre + dia;
                break;
        case 12 : numerador = enero + febreroNormal + marzo + abril + mayo + junio + julio + agosto + septiembre +  octubre + noviembre + dia;
                break;
 
    }
    denominador = 365;
}
BigInteger mcd = BigInteger.valueOf(numerador).gcd(BigInteger.valueOf(denominador));
numerador /= mcd.intValue();
denominador /= mcd.intValue();  
res = numerador + "/" + denominador;
return res;
    }
}

