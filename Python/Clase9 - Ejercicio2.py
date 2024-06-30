def es_primo(num):
    if num < 2:
        return False
    for i in range(2,num):
        if num % i == 0:
            return False
    return True

def suma_Primeros_primos(n):
    suma = 0
    i = 2
    while n > 0:
        if es_primo(i):
            suma += i
            n -= 1
        i += 1
    return suma

n = int(input("Digite la cantida de numeros a sumarse: "))
resultado = suma_Primeros_primos(n)
print(f"La suma de los Primos {n} Numeros Primos es : {resultado}")