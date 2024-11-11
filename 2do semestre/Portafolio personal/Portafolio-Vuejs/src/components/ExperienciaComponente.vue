<script setup>
import icono1 from '/src/assets/ventas.svg';
import icono2 from '/src/assets/ecomerce.svg';
import icono3 from '/src/assets/configuracion.svg';
import icono4 from '/src/assets/uiux.svg';
import icono5 from '/src/assets/watch.svg';

import { ref } from 'vue';
const titulo = 'Desarrollador Full Stack';
const fecha = 'Desde Enero 2022 / Julio 2024';
const experiencias = ref([
{ "id": 1, "src": "iconoA", "parrafo": "Dirigí un equipo de analistas en el desarrollo de un sistema de recomendación de productos, logrando un aumento del 45% en la conversión de ventas." },
  { "id": 2, "src": "iconoB", "parrafo": "Diseñé y optimicé bases de datos para una plataforma de gestión empresarial, reduciendo los tiempos de consulta en un 60% y mejorando la eficiencia general." },
  { "id": 3, "src": "iconoC", "parrafo": "Implementé un sistema de inteligencia artificial para la detección de anomalías en datos financieros, disminuyendo el fraude en un 25%." },
  { "id": 4, "src": "iconoD", "parrafo": "Colaboré con un equipo de marketing para desarrollar una app de interacción con clientes, lo que incrementó la retención de usuarios en un 30%." },
  { "id": 5, "src": "iconoE", "parrafo": "Automatizamos el flujo de trabajo de análisis de datos con scripts de Python, ahorrando un 50% en el tiempo de procesamiento de informes." }
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experencia in experiencias" :key="experencia.id">
                <img class="imagen-svg" :src="experencia.src" width="45rem" :alt="experencia.parrafo">
                <p>{{ experencia.parrafo }}</p>
            </li>

            <!-- <li class="item"><img class="imagen-svg" src="/src/assets/ventas.svg" width="45rem" alt="">
                <p>Lideré un equipo de 5 desarrolladores en la creación de una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/ecomerce.svg" width="45rem" alt="">
                <p>Diseñé y desarrollé aplicaciones web utilizando Node.js, React y MongoDB, logrando reducir el tiempo de carga de las páginas en un 50%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/configuracion.svg" width="45rem" alt="">
                <p>Implementé soluciones de autenticación y autorización, mejorando la seguridad del sitio web y reduciendo los intentos de acceso no autorizado en un 20%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/uiux.svg" width="45rem" alt="">
                <p>Colaboré con diseñadores de UX/UI para crear interfaces de usuario atractivas y fáciles de usar, aumentando la satisfacción del cliente en un 15%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/watch.svg" width="45rem" alt="">
                <p>Automaticé procesos de despliegue continuo utilizando Jenkins y Docker, reduciendo los tiempos de despliegue en un 40%.</p>
            </li> -->
        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: rgb(28, 41, 52);
    border-radius: 15px;
}

.titulo {
    font-size: 1.5rem;
    color: coral;
}

.fecha {
    font-size: 1rem;
    color: burlywood;
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
}
</style>