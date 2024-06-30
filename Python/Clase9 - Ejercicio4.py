calificacionPromedio = 0.0
calificacionBaja = 99999
suma = 0.0
calificacion = 0.0

for i in range(10):
    calificacion = float(input(f"{i + 1}. Digite Una calificacion: "))
    suma += calificacion

    if calificacion < calificacionBaja:
        calificacionBaja = calificacion

calificacionPromedio = suma / 10
print (f"La Calificacion Promedia es: {calificacionPromedio}")
print (f"La calificacion mas baja es: {calificacionBaja}")