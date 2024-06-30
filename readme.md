Clase 6

cd tecnicatura

cd class-git

ls

code .

git log #Vemos los commit hechos hasta ahora

Copiar el hash #El número largo que tiene el commit

git reset hash-nombre-commit #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave

git status

git add .

git commit -m "Agregamos datos de estudios en historia.txt"

git config --list #Veremos la configuración que ya hemos hecho con en nombre y email

git reset hash-nombre-commit --hard #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo

git reset hash-nombre-commit --soft #Este es el suave, lo que tengamos en staging segirá allí

crear un archivo #portafolio.html introducir el código y

touch portafolio.html

html : 5 #Con esto se carga el código básico de html y modificamos

ctrl + s #Guardamos

Clic derecho en VSC Open with Live Server para ver en el navegador

git status

ls

ls -al

git add .

git status

git commit -m "Agregamos el html para nuestro portafolio"

creamos CSS #Este es un archivo de estilos, para esto creamos una nueva carpeta llamada css

mkdir css

ls

cd css

touch style.css #creamos un archivo dentro: estilos.css le cargamos el código.

ctrl + s #abrimos en el navegador y todo esta allí, pero todo esto supuestamente en git no existe.

git status #tenemos cosas en el área de trabajo, en staging distintas

git diff + enter #y nos muestra los cambios en memoria ram y en disco

git add . #Agregamos todo al staging

git status #Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea

git commit -m "Creamos el css para darle algo de estilo a nuestro portafolio"

git log #vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte

hacer cambios en historia.txt #Cambiamos la última línea y

ctrl + s 

git diff

git commit -am "cambio en la última línea del historia.txt"

git log

q  #Esto para salir

git log --stat #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits

q #salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit

git checkout hash-nombre-commit historia.txt #Veremos el archivo en su estado original

git status #Nos sugiere hacer un commit, si lo hacemos borramos todo lo que hicimos antes, debemos seguir con el siguiente commando

git checkout master historia.txt #Volvemos a la versión master del archivo historia.txt, esto es muy peligroso

git checkout hash-nombre-commit historia.txt #Volvemos a hacer esto y cambiamos cosas del archivo

git commit -am "Reemplazo de una versión por otra de la historia"

git log #Veremos los cambios sin tocar ningun otro archivo, esta es la forma de volver a una versión hacía atrás y llevarla a la cabeza de la master

cd ..

cd ..

Clase 7




mkdir git_reset_test #Vamos a hacer pruebas, es por esto que creamos una carpeta nueva

cd git_reset_test #Entramos en la carpeta

git init #Inicializamos el repositorio

touch reset_file.txt

git add reset_file.txt

git commit -m"Iniciando el primer commit"



¿Cómo funciona Git Reset en tu flujo de trabajo? 

Git reset permite moverte entre diferentes commits para deshacer o rehacer cambios. Git guarda todo lo nuevo del repositorio como commits, que son instantáneas del estado del código en un momento dado y existen variaciones de este comando.

Variaciones de Git Reset 

git reset --soft: Borra el historial y los registros de Git de commits anteriores, pero guarda los cambios en Staging para aplicar las últimas actualizaciones a un nuevo commit. 

git reset --hard: Deshace todo, absolutamente todo. Toda la información de los commits y del área de staging se elimina del historial. 

git reset --mixed: Borra todo, exactamente todo. Toda la información de los commits y del área de staging se elimina del historial. 

git reset HEAD: El comando git reset saca archivos del área de staging sin borrarlos ni realizar otras acciones. Esto impide que los últimos cambios en estos archivos se envíen al último commit. Podemos incluirlos de nuevo en staging con git add si cambiamos de opinión. Ten en cuenta que, si deshaces commits en un repositorio compartido en GitHub, estarás cambiando su historia y esto puede causar problemas de sincronización con otros colaboradores.

¿Qué es git reset HEAD? 

git reset HEAD es un comando que te permite revertir los cambios que ya habías preparado para subir, y moverlos de vuelta a tu proyecto. Con este comando puedes cancelar los cambios que ya habías agregado, para que puedas revisarlos, modificarlos o deshacerlos antes de confirmarlos con un commit.

git rm Por otro lado, es un comando que nos ayuda a eliminar archivos de Git sin eliminar su historial del sistema de versiones. Para recuperar el archivo eliminado, necesitamos retroceder en la historia del proyecto, recuperar el último commit y obtener la última confirmación antes de la eliminación del archivo.

Es importante tener en cuenta que git rm no puede usarse sin evaluarlo antes. Debemos usar uno de los flags siguientes para indicarle a Git cómo eliminar los archivos que ya no necesitamos en la última versión del proyecto.

Variaciones de Git rm

git rm --cached: Elimina archivos del repositorio local y del área de staging, pero los mantiene en el disco duro. Deja de trackear el historial de cambios de estos archivos, por lo que quedan en estado untracked, que significa: que un archivo no está siendo rastreado por Git

git rm --force: Elimina los archivos de Git y del disco duro. Git guarda todo, por lo que podemos recuperar archivos eliminados si es necesario (empleando comandos avanzados). ¡Al usar git rm lo que haremos será eliminar este archivo completamente de git!

¿Cuál es la diferencia entre git rm y git reset Head? 

La diferencia principal entre git rm y git reset HEAD radica en que git rm elimina archivos del repositorio y de la historia del proyecto, mientras que git reset saca los cambios del área de preparación y los mueve del espacio de trabajo, sin afectar la historia del repositorio.

Es importante tener en cuenta el efecto que cada comando tiene en el proyecto y usarlos según tus necesidades y objetivos específicos.

¿Cuándo utilizar git reset en lugar de git revert? 

Para reescribir la historia del repositorio y eliminar confirmaciones anteriores, se utiliza git reset. Para deshacer cambios de confirmaciones anteriores de forma segura sin modificar la historia del repositorio, se emplea git revert.


Resumen Para evitar problemas en el trabajo, es valioso entender las implicaciones y riesgos de cada comando y elegir el enfoque adecuado según las necesidades y el flujo de trabajo del proyecto.

Con git rm eliminamos un archivo de Git, pero mantenemos su historial de cambios. Si no queremos borrar un archivo, sino dejarlo como está y actualizarlo después, no debemos usar este comando en este commit.

Empleando git reset HEAD, movemos los cambios de Staging a Unstaged, pero mantenemos el archivo en el repositorio con los últimos cambios en los que hicimos commit. Así, no perdemos nada relevante.

Siguientes pasos Bueno, todos los cambios están en el área de Staging, incluido el archivo con los cambios que no están listos. Esto significa que debemos sacar ese archivo de Staging para poder hacer commit de todos los demás.

Crear cambios en el archivo creado, donde vamos a hacer varios commits, para ir probando los nuevos comandos, al finalizar las pruebas, eliminar el directorio con todo su contenido.

CLASE 8



Comandos para trabajo remoto con GIT

git clone url_del_servidor_remoto #Nos permite descargar los archivos de la última versión de la rama principal y todo el historial de cambios en la carpeta .git

git push #Luego de hacer git add y git commit debemos ejecutar este comando para mandar los cambios al servidor remoto.

git fetch #Lo usamos para traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local (en caso de que hayan, por supuesto).

git merge #También usamos el comando git merge con servidores remotos. Lo necesitamos para combinar los últimos cambios del servidor remoto y nuestro directorio de trabajo.

git pull #Básicamente, git fetch y git merge al mismo tiempo.

#Adicionalmente, tenemos otros comandos que nos sirven para trabajar en proyectos muy grandes:

git log --oneline #Te muestra el id commit y el título del commit.

git log --decorate #Te muestra donde se encuentra el head point en el log.

git log --stat #Explica el número de líneas que se cambiaron brevemente.

git log -p #Explica el número de líneas que se cambiaron y te muestra que se cambió en el contenido.

git shortlog #Indica que commits ha realizado un usuario, mostrando el usuario y el título de sus commits.

git log --graph --oneline --decorate --all

git log --pretty=format #"%cn hizo un commit %h el dia %cd": Muestra mensajes personalizados de los commits.

git log -3 #Limitamos el número de commits.

git log --after=“2018-1-2”

git log --after=“today” 

git log --after=“2018-1-2” --before=“today” #Commits para localizar por fechas.

git log --author=“Name Author” #Commits hechos por autor que cumplan exactamente con el nombre.

git log --grep=“INVIE” #Busca los commits que cumplan tal cual está escrito entre las comillas.

git log --grep=“INVIE” –i #Busca los commits que cumplan sin importar mayúsculas o minúsculas.

git log – index.html #Busca los commits en un archivo en específico.

git log -S “Por contenido” #Buscar los commits con el contenido dentro del archivo.

git log > log.txt #guardar los logs en un archivo txt


CLASE 9


Introducción a las ramas o branches de Git parte 9

Cuando entramos en el proyecto veremos que nos encontramos con la rama master, y es a partir de allí que debe saber que esta es la rama madre o principal rama, y las otras ramas se crean para no afectar a la master


Las ramas (branches) son la forma de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.

La cabecera o HEAD representan la rama y el commit de esa rama donde estamos trabajando. Por defecto, esta cabecera aparecerá en el último commit de nuestra rama principal. Pero podemos cambiarlo al crear una rama (git branch rama, git checkout -b rama) o movernos en el tiempo a cualquier otro commit de cualquier otra rama con los comandos (git reset id-commit, git checkout rama-o-id-commit).

Repasa: ¿Qué es Git?

Cómo funcionan las ramas en GIT
Las ramas son la manera de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.


git branch nombre de la rama #Con este comando se genera una nueva rama.

git checkout nombre de la rama #Con este comando puedes saltar de una rama a otra.

git checkout -b rama #Genera una rama y nos mueve a ella automáticamente, Es decir, es la combinación de git branch y git checkout al mismo tiempo.

git reset id-commit #Nos lleva a cualquier commit no importa la rama, ya que identificamos el id del tag., eliminando el historial de los commit posteriores al tag seleccionado.

git checkout rama-o-id-commit #Nos lleva a cualquier commit sin borrar los commit posteriores al tag seleccionado.



Vamos a hacer una practica: mientras la rama master esta cambiando normalmente, vamos a crear una rama paralela que va a crear nuevas secciones: osea una sección y a esta rama la vamos a llamar segunda y con esto, la vamos a fusionar para ver como queda en la rama master y así entender el flujo de ramas entre git. Al crear otra rama estamos creando una copia de todos los commit que ya tiene la rama master en la nueva rama y todos los cambios que hagamos en esta nueva rama, no los va a ver la rama master hasta que no la volvamos a fusionar con un proceso que se llama merge.

Abrir terminal #En ubuntu

Abrir como adminstrados git bash #En window

cd Tecnicatura

cd class-git

code . #En ubuntu

code . #En window, abrir como administrador

ctrl + s #Guardamos

clic mouse derecho #Abrimos en el navegador con Live Server vemos los cambios

git status

git commit -am "mensaje del commit" #Este solo funciona con archivos creado previamente

git commit -a -m "Mensaje del commit" #Esto es lo mismo que el anterior

git commit -a + enter #Se abrira el entorno para editar el vim con el mensaje

Escribir el mensaje

ctrl + x

s + enter #No cambiar el nombre ni ruta de ubicación

git log #Veremos los cambios guardados

q #Para salir

git log --stat #Veremos los cambios nombrando cada archivo

q #Para salir

git branch #Muestra en la rama que estamos, desde aquí crearemos una nueva

git show #Muestra el último cambio que hicimos, esto significa que desde el HEAD -> master es que haremos cambios

q #Para salir

ctrl + l #Limpiamos consola

git branch segunda #creamos una nueva rama

git show #Nos muestra ahora que esta en el HEAD -> master, cabecera aquí es donde esta apuntando, es decir el último commit esta pegado a dos ramas distintas, aunque todavía estemos en master

q #Para salir

git status #No hay nada para hacer commit

git chekout segunda #Nos movemos hacía otras ramas, en este caso a segunda, esto no se ve en mac ni en ubuntu, para ver donde estamos hay que ingresar...

git branch #veremos en que rama estamos ubicados o ingresando...

git status #Veremos en que HEAD estamos apuntando

VSC #hacemos cambios que veremos con Nico

CLASE 10


Fusión de ramas con Git merge parte 10

La fusión en Git es la forma en que este sistema une un historial bifurcado. El comando git merge permite integrar líneas de desarrollo independientes generadas por git branch en una sola rama. Con este comando, podemos crear un nuevo commit que combina dos ramas o branches: la rama actual y la rama que se indica después del comando.

Estos comandos de fusión del merge afectan solo a la rama actual y no a la rama de destino. Por lo tanto, te recomendamos utilizar git checkout para seleccionar la rama actual y git branch -d para eliminar la rama de destino obsoleta.


Funcionamiento de Git merge

Git merge fusiona secuencias de confirmaciones en un solo historial, generalmente para combinar dos ramas. Busca una confirmación de base común y genera una confirmación de fusión que representa la combinación de las dos ramas hasta el resultado final.

¿Cómo unir dos ramas en git?

Ahora bien, para combinar ramas en tu repositorio local, usa git checkout para cambiar a la rama donde deseas fusionar. Por lo general, esta es la rama principal. Luego, emplea git merge y especifica el nombre de la otra rama que deseas traer a esta rama. Ten en cuenta que esto es una combinación de avance rápido.

¿Cómo realizar un merge en git?

Para hacer un merge en Git, primero asegúrate de estar en la rama correcta. Después, usa el comando git merge seguido del nombre de la rama que quieres combinar. Por ejemplo, si quieres crear un nuevo commit en la rama master con los cambios de la rama segunda, usa este comando:


git checkout master

git merge segunda



Es importante tener en cuenta que en caso de haber conflictos, debes guardar tus cambios antes de hacer git checkout para evitar perder tu trabajo. También es recomendable emplear los comandos básicos de GitHub, como git fetch, git push y git pull, para mantener actualizado tu repositorio.

En este ejemplo, vamos a crear un nuevo commit en la rama master combinando los cambios de una rama llamada segunda: Otra opción es crear un nuevo commit en la rama segunda combinando los cambios de cualquier otra rama:

Git es asombroso porque puede saber cuáles cambios deben conservarse en una rama y cuáles no. En casos de conflictos, asegúrate de guardar tus cambios antes de hacer git checkout para evitar perder tu trabajo.

Comandos básicos de GitHub:

git init # crear un repositorio, si ya esta en la nube traerlo sin hacer git init

git add . #agregar un archivo a staging.

git commit -m “mensaje” #guardar el archivo en git con un mensaje.

git branch nombre_rama #crear una nueva rama.

git checkout nombre_rama #moverse entre ramas.

git push origin rama #mandar cambios a un servidor remoto.

git fetch #traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local.

git merge rama #tiene dos usos. Uno es la fusión de ramas, funcionando como un commit en la rama actual, trayendo la rama indicada. Su otro uso es guardar los cambios de un servidor remoto en nuestro directorio.

git pull origin rama #fetch y merge al mismo tiempo.

git checkout “codigo de version” “nombre del archivo” #volver a la última versión de la que se ha hecho commit.

git reset #vuelve al pasado sin posibilidad de volver al futuro, se debe usar con especificaciones.

git reset --soft #vuelve a la versión en el repositorio, pero guarda los cambios en staging. Así, podemos aplicar actualizaciones a un nuevo commit.

git reset --hard #todo vuelve a su versión anterior

git reset HEAD #saca los cambios de staging, pero no los borra. Es lo opuesto a git add.

git rm #elimina los archivos, pero no su historial. Si queremos recuperar algo, solo hay que regresar. se utiliza así:

git rm --cached #elimina los archivos en staging pero los mantiene en el disco duro.

git rm --force #elimina los archivos de git y del disco duro.

git status #estado de archivos en el repositorio.

git log #historia entera del archivo.

git log --stat #cambios específicos en el archivo a partir de un commit.

git show #cambios históricos y específicos hechos en un archivo.

git diff “codigo de version 1” “codigo de version 2” #comparar cambios entre versiones.


git diff #comparar directorio con staging.



Comando en producción: TUVE QUE SOLUCIONAR UN CONFLICTO

git status #En rama segunda: hacemos cambios en el archivo y guardamos

git commit -am "Finalizado el cambio en rama segunda" #enter

git status

git checkout master #perdemos todo lo que ya habíamos hecho, hacemos cambios en el archivo agregando un nuevo parrafo y guardamos

git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"

git checkout segunda #vemos como desaparecen los cambios

git checkout master #Aquí es que vamos a hacer el merge

git merge segunda #En mi caso tuve algunos conflictos que solucione a través de VSC, aclaro que nunca debemos utilizar Fusionar los dos cambios

git commit -am "Arreglando conflicto" #Una vez solucionado debemos commitear

git status #Debemos revisar en el navegador y en el código si algo quedo mal y cambiarlo

git commit -am "Solucionado el conflicto 2"

git merge segunda #ahora todo va bien

git commit -am "Volvi a comentar en este caso de mi area laboral" #Añado información al archivo

git log

q #Para salir

git commit -am "Para guardar estos cambios en el README.md"

git checkout segunda

git merge master #Traemos todos los cambios

git commit -am "Cargamos esto ahora" #vamos a master y mergeamos

git checkout master


git merge segunda #y terminamos con esto
.