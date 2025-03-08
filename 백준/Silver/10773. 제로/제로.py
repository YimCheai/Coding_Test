def push(n):
    stack.append(n)

def pop():
    return stack.pop()

stack=[]
K = int(input())
for i  in range(K):
    n=int(input())

    if n==0:
        pop()
    else:
        push(n)

print(sum(stack))