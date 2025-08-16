s=[0 for x in range(31)]
for i in range(28):
    n=int(input())
    s[n]=1
for i in range(1,31):
    if s[i]==0:
        print(i)