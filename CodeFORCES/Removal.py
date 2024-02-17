import heapq as hordicbst
for ___ in range(int(input())):
    n=int(input())
    s=input()
    dic={}
    for i in s:
        if i in dic:
            dic[i]+=1
        else:dic[i]=1
    a=[]
    for i in dic:
        hordicbst.heappush(a,-dic[i])
    while len(a)>1:
        Que1=hordicbst.heappop(a)
        Que1=abs(Que1)
        Que2=hordicbst.heappop(a)
        Que2=abs(Que2)
        Que1-=1
        Que2-=1
        if Que1>0:
            hordicbst.heappush(a,-Que1)
        if Que2>0:
            hordicbst.heappush(a,-Que2)
    asn=0
    for i in a:
        asn+=abs(i)
    print(asn)