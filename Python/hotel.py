import os
def bill(path,text):
    os.chdir(g+path)
    f1=open(text,"r")
    l=f1.readlines()
    m=[]
    for i in range(len(l)):
        m.append(list(l[i].split(",")))
    for i in range(len(l)):
        k=list(l[i].split(","))
        print("%d.      %20s            %s"%(i+1,k[0],k[1]))
    num=list(map(int,input("Please enter your order's tokens: ").split()))
    confirmation=input("Would you like to take any other items(y/n): ")
    if confirmation=='y':
        num+=list(map(int,input("Please enter other orders: ").split()))
    bill=0
    for i in num:
        bill+=int(m[i-1][1])
    print("Your bill is ",bill)
    os.chdir(g+"\\hotel")
    fb=open("./bill.txt","a")
    fb.write("bill: %d\n"%(bill))

g=os.getcwd()
os.chdir(g+"\\hotel")
print("WELCOME TO KMIT HOTEL")
name = input("Enter your name: ")
menu=int(input("Please select your menu theme(S.no.):\n1.Break fast\n2.Lunch\n3.Dinner\n4.Show Transactions\nYour theme please: "))
print("                 MENU\n")
print("S.no                 Items              Price")
path=["\\hotel\\Breakfast","\\hotel\\lunch","\\hotel\\dinner"]
text=["./bm.txt","./lm.txt","./dm.txt"]
bill(path[menu-1],text[menu-1])