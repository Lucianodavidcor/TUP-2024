suma = 0

for i in range(1,6):
    print(f"Salario del empleado {i}: ")

    hora = float(input("Digite las Horas Trabajadas: "))
    tarifa = float(input("Digite la tarifa Por Horas: "))

    salario = hora * tarifa
    print(f"El salario es: ${salario:.2f}")

    suma += salario

print(f"La suma de todos los salarios es: ${suma:.2f}")