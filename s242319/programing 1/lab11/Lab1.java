public class Lab1 
{
public static void main(String[] args) 
{
  long[] k  = new long[11];       //Создаем олномерный массив k из 11 элементов
  k[0]=3;                         //Присваиваем элементу k0 значение 3
  for(byte i = 2; i <12; i++ )    // Заполняем массив элементами по формуле в задании
  {
      k[i-1] = 2*i+1; 
  }                               //заканчиваем заполнение
  for (byte i = 0; k.length/2 > i; i++)   //Отсартируем элементы массива k по убыванию
        {
            long buffer = k[i];           //
            k[i] = k[k.length - i - 1];   // buffer - временная переменная для сохранения k[i]
            k[k.length - i - 1] = buffer; //
        }                                 //конец сортировки
  for (byte i = 0; i < 11; i++)           //Выводим полученный массив для проверки 
        {
          System.out.print(k[i] + " ");             
        }                                 //Конец вывода
         System.out.println();            //Переход на новую строку     
  float[] x = new float[18];              //Создаем массив x из 18 элементов типа float
  for(int i = 0; i < 18; i++)             //Заполняем массив x
  {
      x[i]= (float) ((Math.random()*29.0009) -15.009); //Запоняем числами в промежутке от -15 до 14
      System.out.print(x[i] + " ");                    //Выводим массив для проверки
  }
  System.out.println();                                //Переход на новую строку
  double h [][] = new double [11][18];                 //Создаем массив h 11X18 типа double
  for (int i = 0; i < 11; i++)                         //Заполняем массив элементами по формулам в задании
    { int forswitch = (int) k[i];                      //Создаем переменную forswitch = k[i] для испльзования в switch
      for(int j = 0; j < 18; j++)
       switch(forswitch)
       {
          case 3:                                      //При k[i] = 3 выполняем действие из задания         
            h[i][j] = x[j] * 6 ;
          break;
          case 7:                                      //
          case 9:                                      //
          case 13:                                     //При k[i] = 7,9,13,15,23 выполняем действие из задани по действиям
          case 15:                                     //
          case 23:                                     //
              double degree;                           // Вводим переменную для подсеча степени     
              degree = - (Math.abs(x[j]));             //Вычисляем степень E      
              double eindegree;                        //Вводим переменную для вычисления E в степени degree
              eindegree = Math.pow(Math.E,degree);     //Вычисляем
              double dividend;                         //Переменная делитель
              dividend = Math.asin(eindegree);         //Вычисляем делимое
              double degreedenom_;                      //Вводим переменную для вычисления степени E^x
              degreedenom_ = (Math.pow(x[j],x[j]))*3000;                //
              int refreshdegreedenom = (int) Math.round(degreedenom_);  //Вычисляем сиепень E^x до 3 знака после запятой
              degreedenom_ = (double) refreshdegreedenom / 1000;        //
              double degreedenom;                                       // 
              degreedenom = Math.pow(Math.E, x[j]);                     // Вычисляем E^x
              double degreedenom2;                                        //Вводим переиенную для вычисления degreedenom^degreedenom_
              degreedenom2 = (Math.pow(degreedenom, degreedenom_))*1000;  //
              int refreshdegreedenom2 = (int) Math.round(degreedenom2);   //Вычисляем с точностью до 3 знаков
              degreedenom2 = (double) refreshdegreedenom2 / 1000;         //
              double denominator;                                         //Вводим переменную для вычисления делителя
              denominator = (0.25) + degreedenom2;                        //Вычисляем делитель
              double quotient;                            
              quotient = dividend / denominator;                          //Вычисляем частное
              double alldegree;
              alldegree = Math.sin(Math.cos(x[j]));                       //Вычисляем степень всего выражения
              double result;
              result = Math.pow(quotient,alldegree);                      //Вычисляем общий результат 
              h[i][j] =result;                                            //Записываем результат в массив
           break; 
          default:                                                        //При остальных k[i] выполняем вычисления из задания
             double atan;
             atan = Math.atan(Math.pow(((x[j] - 0.5)/29), 2)) + 0.5;      //Вычисляем аргтангетс и прибавляем к нему 0,5
             double fraction;
             fraction = 0.25/atan;                                        //Вычисляем значение дроби
             double result_;
             result_ = Math.cos(fraction);                                //Вычисляем конечный результат
             h[i][j] = result_;                                           //Записываем выражения в массив
          break;    
               
        }
    }
  
  for (byte i = 0; i < 11; i++) 
   {
    for(byte j = 0; j < 18; j++)
     {
       System.out.printf("%.3f", h[i][j]);                                //Выводим весь массив h с 3 знаками после запятой
       System.out.print(' ');
     }  
    System.out.println();
   }
}
}