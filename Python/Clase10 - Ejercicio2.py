def main():
    N = int(input("Ingrese la cantidad de Numeros: "))

    sumaP = 0
    conteoP = 0
    sumaI = 0
    conteoI = 0

    for i in range(N):
        num = int(input("Ingrese el numero {i+1}: "))
        if num % 2 == 0:
            sumaP += num
            conteoP += 1
        else:
            sumaI += num
            conteoI += 1
    
    if conteoI > 0:
        promedioI = sumaI / conteoI
    else:
        promedioI = 0
    
    print(f"Suma numeros Pares: {sumaP}")
    print(f"Cantidad Numeros Pares: {conteoP}")
    print(f"Promedio numeros Impares: {promedioI}")
if __name__ == "__main__":
    main()