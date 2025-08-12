basket = []
N,M=map(int,input().split()) #N=바구니 개수, M=공 넣을 룃수
for i in range(N):
    basket.append(0)

for i in range(M):
    a, b, c = map(int, input().split())
    for j in range(a,b+1):
        basket[j-1]=c

print(*basket)