<template>
  <div class="menu">
    <h1>Menu:</h1>
    <div id="list">
      <ul v-for="pizza in this.pizzas" v-bind:key="pizza.pizzaId">
        <li v-on:mouseover="getToppingsByPizzaId(pizza)" v-on:mouseleave.prevent="resetSpecialtyToppings()">
          <h2>{{ pizza.pizzaName }}</h2>
          <div id="toppings-box">
          <div
            class="img-container"
            
          >
            <img
              :src="require(`/public/images/${pizza.imgURL}`)"
              class="image"
              
            />
            <div class="price">
              <div class="text">${{ pizza.price }}</div>
              <div id="toppings" >
            <h4>Toppings:</h4>
            <h3
              v-for="topping in specialtyToppings"
              v-bind:key="topping.toppingName"
            >
              {{ topping.toppingName }}
            </h3>
          </div>
            </div>
          </div>
          
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>
<script>

import pizzaService from "@/services/PizzaService.js";
import toppingService from "@/services/ToppingService.js";
export default {
  name: "pizza-menu",
  computed: {
    pizzas() {
      return this.$store.state.pizzas;
    },
    specialtyToppings() {
      return this.$store.state.specialtyToppings;
    },
    toppings() {
      return this.$store.state.toppings;
    }
  },
  methods: {
    listPizza() {
      pizzaService.getAvailablePizzaBySizeId('S').then((response) => {
        this.$store.commit("SET_PIZZA", response.data);
      });
    },
    getToppingsByPizzaId(pizza) {
      toppingService.getToppingsByPizzaId(pizza.pizzaId).then((response) => {
        this.$store.commit("SET_SPECIALTY_TOPPINGS", response.data);
      });
    },
    setActivePizza(click) {
      this.$store.commit("SET_ACTIVE_PIZZA", click.target);
    },
    resetSpecialtyToppings() {
      let specialtyToppings = [];
      this.$store.commit("SET_SPECIALTY_TOPPINGS", specialtyToppings);
    },
  },
  created() {
    this.listPizza('S');
  }
};
</script>


<style>
/* .menu {
    display: grid;
  grid-template-columns: 1fr 1fr 1fr ;
  grid-template-rows: 1fr 1fr 1fr;
  flex-direction: column;
  justify-content: center;
  background-color: lightgreen;
  font-family: Arial, Helvetica, sans-serif;
} */

@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap");

.menu {
  background-color: rgb(102, 230, 102)
}

h1 {
  align-self: center;
  font-family: 'Poppins', sans-serif;
  color: black;
}

#toppings-box{
  display: flex;
}

h2 {
  margin: 10px 0px;
  font-family: 'Poppins', sans-serif;
  text-align: center;
  align-items: center;
  padding-left: 95px;
}
h3 {
  margin: 5px 5px;
  font-size: 0.8em;
  overflow-wrap: anywhere;
  width: 200px;
  align-content: center;
}

img {
  width: 200px;
  height: 200px;
  border-radius: 10px;
  padding-bottom: 20px;
}

.image {
  padding-left: 185px;
}

ul {
  padding-inline-start: 10px;
  justify-content: center;
}

#toppings {
  color:  black;
}

#toppings:hover {
  color: black;
  opacity: 1;
}

#list {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-rows: 1fr 1fr 1fr;
  flex-direction: column;
  /* justify-content: center; */
}
li {
  list-style: none;
  border: 1px solid green;
  /* padding-left: 130px; */
  border-radius: 5px;
  padding-right: 110px;
}

.img-container {
  position: relative;
  width: 50%;
  }

.image {
  opacity: 1;
  display: block;
  transition: 0.5s ease;
  backface-visibility: hidden;
}

.price {
  transition: 0.5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
  padding-left: 31px;
  margin-left: 150px;
}

.img-container:hover .image {
  opacity: 0.3;
  filter: blur(1px);
}

.img-container:hover .price {
  opacity: 1;
}

.text {
  background-color: #04aa6d;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  font-family: "Poppins", serif;
  border-radius: 5px;
}
</style>