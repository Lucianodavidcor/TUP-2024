num = int(input("Digite un Numero: "))

if num >= 0:
    factorial = 1
    i = 1
    while i <= num:
        factorial *= i
        i += 1

    print(f"El factor es: {factorial}")
else:
    print(f"El Numero debe ser igual o mayor a 0")