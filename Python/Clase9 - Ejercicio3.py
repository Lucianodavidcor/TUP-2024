def contarNumeros():
    conteo_positivos = 0
    conteo_negativos = 0
    conteo_neutros = 0

    while True:
        num = int(input("Digite un numero: "))

        if num > 0:
            conteo_positivos += 1

        elif num < 0:
            conteo_negativos += 1

        else:
            conteo_neutros += 1

        print (f"La cantidad de numeros positivos es: {conteo_positivos}")
        print (f"La cantidad de numeros Negativos es: {conteo_negativos}")
        print (f"La cantidad de numeros Neutros es: {conteo_neutros}")

        opcion = input("Desea ingresar otro numero? (S/N): ")
        if opcion.lower() != "s":
            break

contarNumeros()