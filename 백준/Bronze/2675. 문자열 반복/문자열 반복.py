S = int(input())
answer1=[]
for i in range(S):
    temp=""
    R,P = map(str,input().split())
    for j in range(len(P)):
        temp+=(P[j]*int(R))
        #print(P[len(P)-1])
    answer1.append(temp)
for i in range(0,len(answer1)):
    print(answer1[i])