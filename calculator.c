#include<stdio.h>
#include<math.h>
double division(double,double);
double modulus(int,int);
void print_menu();
int main()
{  
  int choice;
  double first,second,result;
while(1){
 print_menu();
  scanf("%d",&choice);
  if(choice == 7){
    break;
  }
  if(choice <1 || choice >7){
    fprintf(stderr,"Invalid menu choice: ");
    continue;
  }
  printf("\n Please enter the first number ");
  scanf("%lf",&first);
  printf("Now,enter the second number");
  scanf("%lf",&second);
  switch(choice)
 {
  case 1://add;
  result=first+second;
  break;
  case 2://subtract;
  result=first-second;
  break;
  case 3://multiply;
  result=first*second;
  break;
  case 4://divide;
  result=division(first,second);
  break;
  case 5://modulus;
  result= modulus(first,second);
  break;
  case 6://power;
  result=pow(first,second);
  break;
 }
  if(!isnan(result)){
 printf("\n Result of operation is : %.2f",result);
  }
}; 
   return 0;
}
  double division(double a , double b){
    if(b==0){
      fprintf(stderr,"Invaid Argument for Division");
      return NAN;
    }else {  
      return a/b;
   }
  }
  double modulus(int a , int b){
   if(b==0){
    fprintf(stderr,"Invlid Argument for modulus");
    return NAN;
   } else{
    return a % b;
   }
  }
void print_menu(){
  printf("\n\n_______________________________________");
  printf("\nWelcome to the simple calculator");

  printf("\n Choose one of the following options:");
  printf("\n n1. Add");
  printf("\n n2.suntract");
  printf("\n n3.multiply");
  printf("\n n4.divide");
  printf("\n n5.modulus");
  printf("\n n6.power");
  printf("\n n7. exit");
  printf("\n Now ,enter your choice:\n");
}