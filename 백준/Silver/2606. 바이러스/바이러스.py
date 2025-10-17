def dfs(graph, start):
    visited = set()
    stack = [start]
    cnt=0
    while stack:
        node = stack.pop()
        if node not in visited:
            #print(node, end=' ')  # You can replace this with any desired action
            cnt+=1
            visited.add(node)
            stack.extend(neighbor for neighbor in graph[node] if neighbor not in visited)
    return cnt-1

# Define your graph
graph = {

}
n=int(input())#컴퓨터 수
s=int(input())#쌍의 수
for i in range(n):
    graph[i+1]=[]
#print(graph)
for i in range(s):
    start, end=map(int, input().split())
    graph[start].append(end)
    graph[end].append(start)
#print(graph)
print(dfs(graph, 1))