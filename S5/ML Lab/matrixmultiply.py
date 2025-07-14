r1=int(input("enter the no: of rows in the matrix1:"))
c1=int(input("enter the no: of columns in the matrix1:"))
r2=int(input("enter the no: of rows in matrix2:"))
c2=int(input("enter the no: of columns in matrix2:"))
if c1!=r2:
	print("Matrix multiplication not possible")
else:
	print("enter matrix A")
	A=[]
	for i in range(r1):
		row=list(map(int ,input().split()))
		A.append(row)
		
	print("Enter matrix B")
	B=[]
	for i in range(r2):
		row=list(map(int ,input().split()))
		B.append(row)
	result=[]
	for i in range(r1):
		row=[]
		for j in range(c2):
			s=0
			for k in range(c1):
				s+=A[i][k]*B[k][j]
			row.append(s)
		result.append(row)
	print("Result")
	for row in result:
		print(*row)
				
		
		
