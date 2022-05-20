<template>
  <form id="pizza-form" v-on:submit.prevent="addPizza()">
    <table class="wp-table">
      <tr>
        <th>Pizza</th>
        <!-- <th>Size</th>
        <th>Price</th> -->
      </tr>

      <div id="app">
        <select v-model="selected">
          <option value="none" disabled selected >Select Item</option>
          <option v-for="pizza in pizzas" v-bind:key="pizza.pizzaId">
            {{ pizza.pizzaName }} {{ pizza.sizeId }} {{ pizza.price }}
          </option>
        </select>

        <p v-show="!this.cart.empty" id="selected"><b>Pizza In Cart</b>: {{ selected }}</p>
      </div>
    </table>

    <div v-show="selected == 'Build Your Own S 9.99' || selected == 'Build Your Own M 11.99' || selected == 'Build Your Own L 13.99' "> 
    <h2>Select your toppings:</h2>
    <topping-menu />
   </div> 
    <button type="submit">Add Pizza To Cart</button>
    <button type="button" v-on:click="emptyCart()" value="Empty Cart"> Empty Cart </button>
    <button type="button"   v-on:click="checkout" value="Checkout"> Checkout </button>
  </form>
</template>


<script>
import pizzaService from "@/services/PizzaService.js";
import toppingService from "@/services/ToppingService.js";
import ToppingMenu from "@/components/ToppingMenu.vue";

export default {
  name: "pizza-menu",
  components: { ToppingMenu },
  data() {
    return {
      selected: { pizzaName: "", sizeId: "", price: "" },
    };
  },

  computed: {
    pizzas() {
      return this.$store.state.pizzas;
    },
    toppings() {
      return this.$store.state.toppings;
    },
    cart() {
      return this.$store.state.cart;
    },
  },
  methods: {
    listPizza(sizeId) {
      pizzaService.getPizzaBySizeId(sizeId).then((response) => {
        this.$store.commit("SET_PIZZA", response.data);
      });
    },
    getToppingsByPizzaId(pizza) {
      toppingService.getToppingsByPizzaId(pizza.id).then((response) => {
        this.$store.commit("SET_TOPPING", response.data);
      });
    },
    addPizza() {
      let pizza = this.selected;
      this.$store.commit("ADD_PIZZA", pizza);
    },
    emptyCart(){
      let emptyCart = [];
      this.$store.commit("CLEAR_CART",  emptyCart);
    },
    checkout(){
      this.$router.push({path: '/checkout'})
    }

  },

  created() {
    this.listPizza("S");
  },
};
</script>


<style scoped>
#selected {
  font: inherit;
  color: black;
  font-size-adjust: inherit;
}
.menu {
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-color: lightgreen;
  font-family: "Poppins", serif;
}

h1 {
  align-self: center;
  font-family: "Poppins", serif;
  font-size: 0.8rem;
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

ul {
  padding-inline-start: 0px;
  justify-content: center;
}

#list {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-rows: 1fr 1fr 1fr;
  flex-direction: column;
  justify-content: center;
}
li {
  list-style: none;

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



a:link, a:visited, a:hover, a:active, #checkout {
   text-decoration: none;
  color:white;
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

#pizza-form{
  border: none;
}

#selected {
  font: inherit;
  font-feature-settings: inherit;
  color: black;
}
</style>