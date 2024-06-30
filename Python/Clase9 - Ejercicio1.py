while True:
    num = int(input("Ingre el año: "))
    if (num % 4 == 0) and ((num % 100 != 0) or (num % 400 == 0)):
        print("El año es Bisiesto")
    else:
        print("El año no es Bisiesto")

    opcion = int(input("Para seguir adelante, digite la opcion:\n1. Continuar\n2. salir\nOpcion: "))
    if opcion != 1:
        break