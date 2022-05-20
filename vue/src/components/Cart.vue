<template>
  <form class="cart">
    <h1>PIZZA CART</h1>

    <div class="pizzas">
      <div id="headers">
        <th>Pizza</th>
        <th>Size</th>
        <th>Price</th>
      </div>

      <span v-for="each in cart" v-bind:key="each.pizzaId">
        <p id="pizza-span">{{ each }}</p>
      </span>
    </div>

    <table id="total">
      <th v-bind:key="total">Total: ${{ this.total.toFixed(2) }}</th>
    </table>

    <button id="add-to-cart" type="submit">Complete Purchase</button>
  </form>
</template>



<script>
export default {
  computed: {
    parsedCart() {
      return this.$store.state.parsedCart;
    },
    total() {
      return this.$store.state.total;
    },
    cart() {
      return this.$store.state.cart;
    },
  },
  methods: {
    addTotal() {
      let subPrices = [];

      this.parsedCart.forEach((array) => subPrices.push(Number(array.at(-1))));
     let total = subPrices.reduce((sum, num) => sum + num, 0);
     console.log(total);
      this.$store.commit("SET_TOTAL", total);
    },

    addPizza() {
      this.$store.commit("SET_SELECTED_PIZZA");
    },
    parseString() {
      let emptyParsedCart = [];
      this.$store.commit("CLEAR_PARSED_CART", emptyParsedCart);
      this.cart.forEach((each) => {
        let cartString = each.split(" ");
        this.$store.commit("CREATE_PARSED_CART", cartString);
      });
    },
  },
  created() {
    return this.parseString(), this.addTotal();
  },
};
</script>

<style scoped>
.cart {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background: rgb(102, 230, 102);
  border: 4px;
  border: black;
  max-width: 30%;
  margin-left: auto;
  margin-right: auto;
  font-family: "Poppins", sans-serif;
}

#pizza-span {
  text-align: center;
  align-content: center;
}

#headers {
  display: flex;
  align-items: center;
  justify-content: center;
}

p {
  margin: 2px;
}

table,
th,
td {
  border: 1px solid black;
  background: rgb(102, 230, 102);
}

th{
  width: 60px;
  margin: 5px;
}

#pizzas{
  display: flex;
  align-content: center;
}

table {
  border: 1px;
  align-items: center;
  margin-left: auto;
  margin-right: auto;
}

td {
  height: 50px;
  width: 100px;
  font-size: 1.5rem;
  white-space: nowrap;
}



#button-column {
  text-align: center;
}

button {
  display: block;
  margin-left: auto;
  margin-right: auto;
  background-color: green;
  color: white;
  padding: 5px;
  border-radius: 15px;
  cursor: pointer;
  width: 180px;
  font-size: 20px;
  font-family: "Poppins", sans-serif;
}
</style>

