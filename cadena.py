import math 

max=5;
min=1;
presicion=0.001;
# CONVERTIR UN BINARIO  A UN  DECIMAL
cadena=(input('INTRODUCE UN BINARIO:'))
cadena1=len(cadena)
decimal=int(cadena, base=2)
print("TU NUMERO EN DECIMAL ES:")
print(decimal)
# CONVERTIR UN DECIMAL A UN BINARIO
# CONVERTIR A UN NUMERO REAL
real = min + (decimal * ((max - min) / ((pow(2, cadena1)) - 1)))
print("TU NUMERO REAL:")
print(real)
# CONVERTIR ADAPTADO
adaptador=(5*math.cos(real))+2*real
print("TU VALOR ADAPTADO ES:")
print(adaptador)
# CONVERTIR LONGITUD
longitud=math.log(1 + ((max-min)/(presicion)),2)
print("TU VALOR DE LONGITUD ES:")
print(longitud)