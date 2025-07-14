import numpy as np
##dt=np.dtype([('day number',int),('Steps walked',int)])
arr1=np.array([6012,7079,8564,2586,8736,9874,8245,2589,5154,7485])
arr2=np.arange(1,11,1)
arr3=np.column_stack((arr2,arr1))
print(arr3)
print(arr1)
arr3[:, 1]+=2000
print(arr3)
arr4=np.sort(arr3[:,1])
print(arr4)

