def Bisiesto(year):
    if year % 4 == 0:
        return str(year) + " es bisiesto"
    else:
        return str(year) + " no es bisiesto"


print(Bisiesto(2023))
