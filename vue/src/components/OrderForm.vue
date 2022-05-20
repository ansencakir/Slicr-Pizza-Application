<template>
  <div id="form-div">
    <form id="order-form">
      <h1 id="order-header">ORDER MENU</h1>
      <div id="button-container">
        <button @click.prevent="showSizes = !showSizes">Pick-up</button>
        <button @click.prevent="showAddressBox = !showAddressBox">
          Delivery
        </button>
      </div>

      <div class="form-group" v-show="showAddressBox">
        <input
          type="street"
          class="form-control"
          id="autocomplete"
          placeholder="Street"
        />

        <input
          type="city"
          class="form-control"
          id="inputCity"
          placeholder="City"
        />

        <input
          type="state"
          class="form-control"
          id="inputState"
          placeholder="State"
        />

        <input
          type="zip"
          class="form-control"
          id="inputZip"
          placeholder="Zip"
        />

        <button @click.prevent="showSizes = !showSizes">Submit</button>
      </div>

      <div id="sizes-div">
        <h2 class="choose_size">Choose a size:</h2>
        <button @click.prevent="listPizza('S')">Small -- 12"</button>
        <button @click.prevent="listPizza('M')">Medium -- 14"</button>
        <button @click.prevent="listPizza('L')">Large -- 16"</button>
      </div>

      <div id="options-div" v-show="showChoices">
        <h2 class="choose_pizza">Choose A Pizza</h2>
        <specialty-menu />
      </div>

      <!-- if specialty, show table of specialties
        if build own, populate toppings/size choices -->

      <!-- form for a custom pizza -->

      <!-- show add to cart when they actually get close to buying -->
    </form>
  </div>
</template>

<script>
import SpecialtyMenu from "./SpecialtyMenu.vue";
import pizzaService from "@/services/PizzaService.js";
export default {
  name: "order-form",
  data: function () {
    return {
      showSizes: false,
      showAddressBox: false,
      showToppings: false,
      showSpecials: false,
      showChoices: false,
      selectedSize: "",
      selectedPizza: {},
    };
  },
  components: { SpecialtyMenu },
  computed: {
    toppings() {
      return this.$store.state.toppings;
    },
    pizzas() {
      return this.$store.state.pizzas;
    },
    cart() {
      return this.$store.state.cart;
    },
    selectedToppings() {
      return this.$store.state.selectedToppings;
    },
  },
  methods: {
    listPizza(sizeId) {
      if (this.showChoices == false) {
        this.showChoices = !this.showChoices;
      }
      this.selectedSize = sizeId;
      pizzaService.getAvailablePizzaBySizeId(sizeId).then((response) => {
        this.$store.commit("SET_PIZZA", response.data);
      });
    },

    addToCart(pizza) {
      if (pizza != '{ "pizzaName": "", "sizeId": "", "price": "" }') {
      this.$store.commit("ADD_TO_CART", pizza);
      }
    },
  },
  created() {
    this.listPizza();
  },
};
</script>

<style>
body {
  padding: 50px;
}

.flex-grid {
  display: flex;
}
.col {
  flex: 1;
}
#form-div {
  display: flex;
  align-items: center;
  justify-content: center;
}
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap");

h1 {
  font-family: "Poppins", sans-serif;
  font-size: 2rem;
  color: black;
}

/* style for labels */
label {
  margin-top: 30px;
  margin-bottom: 5px;
  display: block;
  background-color: rgb(41, 139, 41);
  color: white;
  padding: 0.5rem;
  max-width: 50%;
  font-size: auto;
  border-style: groove;
  border-color: green;
  font-weight: 100;
  white-space: nowrap;
  text-align: center;
  border-radius: 15px;
}

/* form container */
form {
  display: flex;
  flex-direction: column;
  flex-basis: auto;
  align-items: center;
  margin: auto;
  max-width: 50%;
  min-width: 50%;
}
#order-form {
  border-bottom: none;
  border: 3px solid black;
}

/* style of dropdowns */
select {
  width: auto;
  height: 30px;
  text-align: center;
  font: 1.1em serif;
  font-family: "Poppins", sans-serif;
  margin: 0.25rem;
}

#add-to-cart {
  margin-top: 10px;
  margin-bottom: 20px;
}

input,
label {
  margin: 5px 5px;
}

.form-group {
  margin: 30px auto;
  width: 450px;
}

.form-control {
  float: left;
}

#inputStreet {
  width: 100%;
}

#inputCity {
  width: 50%;
}

#inputState {
  width: 15%;
}

#inputZip {
  width: 28%;
}

.cart {
  justify-content: center;
}

#options-div {
  text-align: center;
}

.choose_size {
  padding-right: 95px;
}
.choose_pizza {
  padding-right: 95px;
}

</style>