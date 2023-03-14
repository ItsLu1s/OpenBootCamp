def Bisiesto():
    year = int(input("Inserte el año aquí: "))
    
    if year % 4 == 0 and year % 400:
        return str(year) + " es bisiesto"
    else:
        return str(year) + " no es bisiesto"


print(Bisiesto())
