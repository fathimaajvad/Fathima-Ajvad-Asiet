s=input("enter a string:")
word=s.split()
occurrence={}
for w in word:
	if w in occurrence:
		occurrence[w]=occurrence[w]+1
	else:
		occurrence[w]=1
print("word occurred:")
for w,count in occurrence.items():
		print(w,":",count)

