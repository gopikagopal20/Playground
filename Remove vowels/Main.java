#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  int len,i,temp;
  scanf("%[^\n]s", str);
  len=strlen(str);
  for(i=0;i<len;i++)
  {
    if(str[i]== 'a'||str[i]== 'e' ||str[i]== 'i' ||str[i]== 'o' ||str[i]== 'u' ||str[i]== 'A' ||str[i]== 'E' ||str[i]== 'I' ||str[i]== 'O' ||str[i]== 'U' )
      continue;
    else
      printf("%c",str[i]);
  }
  return 0;
}
   