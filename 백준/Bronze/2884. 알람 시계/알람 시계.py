T, M = map(int, input().split())

if M<45:
   M=M-45+60
   if T==0:
       T=23
   else:
       T=T-1
   print(T, M)
else:
    print(T, M-45)