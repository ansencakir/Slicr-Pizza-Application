<template>
  <div class="menu">
    <h1>Current Available Menu:</h1>

    <ul id="list" >
      <li v-for="p in this.pizzas" v-bind:key="p.pizzaId">
        <h2>{{p.pizzaName}} - {{p.sizeId}}</h2>

        <div class="img-container">
         <img :src="require(`/public/images/${p.imgURL}`)"  class="image">   
          <div class="price">
            <div class="text">${{p.price}}</div>
          </div>
        </div> 
        
        <!-- <h3 v-for="topping in this.toppings" v-bind:key="topping.name"> 
          <span>{{topping.name}}</span>
        </h3> -->
        <div class="available-button">
        <h3> 
          <button class="available-button" @click="changeAvailability(p)" v-show="p.available" >
            Available</button>
            <button class="available-button" @click="changeAvailability(p)" v-show="!p.available" >
            Not Available</button>
        </h3>
        </div>
      </li>
    </ul>

  </div>
</template>
<script>
    import pizzaService from "@/services/PizzaService.js";
export default {
    name: "employee-menu",
    data() {
      return {
        isAvailable: true,
      };
    },
    computed: {
        pizzas() { return this.$store.state.pizzas;},
    },
    methods: {
        listPizza() {
            pizzaService.listPizza().then(response => {
                this.$store.commit("SET_PIZZA", response.data);
            });
        },
    
        changeAvailability(pizza) {
          pizza.available = ! pizza.available;
          pizzaService.updatePizza(pizza).then(response => {
            this.$store.commit("FLIP_AVAILABLE", response.data);
          })
        }
    },
    created() {
        this.listPizza();
        
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

h1 {
  align-self: center;
  font-family: 'Poppins', sans-serif;
}

h2 {
  margin: 10px 0px;
}
h3 {
  margin: 5px 0px;
  font-size: 0.8em;
  overflow-wrap: anywhere;
  width: 200px;
}

img {
  width: 200px;
  height: 200px;
}

ul li {
  padding-inline-start: 0px;
  justify-content: center;
}

#list {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr ;
  grid-template-rows: 1fr 1fr 1fr;
  flex-direction: column;
  justify-content: center;
}
li {
  list-style: none;
  border: 1px solid #04aa6d;
  padding-left: 130px;
}

.img-container {
  position: relative;
  width: 50%;
}

.image {
  opacity: 1;
  display: block;
  /* width: 100%;
  height: auto; */
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
}

</style>