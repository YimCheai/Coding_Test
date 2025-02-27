
n=int(input())#반복 횟수 입력받기
#횟수만큼 반복
sum=0
for i in range(n):

    #학생, 사과 입력받기
    student, apple = map(int, input().split())
    #사과를 학생으로 나눈 나머지를 누적시켜서 더하기

    sum+=apple%student

#누적합 출력
print(sum)