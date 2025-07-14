import pandas as pd
import matplotlib.pyplot as plt
data={'Year':[2015,2016,2017,2018,2019,2020],'Sales':[200,250,300,400,500,600]}
df=pd.DataFrame(data)

df.plot(x='Year',y='Sales',kind='line',title='Yearly Sales')
plt.show()
 
df.plot(x='Year',y='Sales',kind='bar',title='Yearly Sales')
plt.show()
df.plot(x='Year',y='Sales',kind='pie',title='Yearly Sales')
plt.show()
