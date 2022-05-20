<template>
  <div id="topping-menu">
    <table class="wp-table">
      <tr>
        <th>Topping</th>
        <th>Price</th>
        <th>Add to Order</th>
      </tr>
      <tr
        id="toppings"
        v-for="topping in this.toppings"
        v-bind:key="topping.toppingName"
      >
        <td>{{ topping.toppingName }}</td>
        <td>${{ topping.additionalPrice.toFixed(2) }}</td>
        <td><input type="checkbox" id="selected" v-bind:key="topping.toppingName"/></td>
      </tr>
    </table>
    <p v-if="$store.state.selectedToppings.length > 0" id="select"></p>
    <p v-show="this.selected != ''" id="selected">
      <b>Topping Selected</b>: {{ selected }}
    </p>
  </div>
</template>

<script>
import toppingService from "@/services/ToppingService.js";

export default {
  name: "topping-menu",
  data() {
    return {
      selected: {
        toppingName: "",
        additionalPrice: "",
      },
    };
  },
  computed: {
    toppings() {
      return this.$store.state.toppings;
    },
    selectedToppings() {
      return this.$store.state.selectedToppings;
    },
  },
  methods: {
 
    listTopping() {
      toppingService.listTopping().then((response) => {
        this.$store.commit("SET_TOPPING", response.data);
      });
    },
    addTopping() {
      let topping = this.selected;
      this.$store.commit("ADD_TOPPINGS_TO_CART", topping);
    },
  },
  created() {
    this.listTopping();
  },
};
</script>


<style>
.wp-table tr:nth-child(odd) {
  background-color: rgb(102, 230, 102);
  border: 1px solid black;
}

.wp-table tr:nth-child(even) {
  background-color: rgb(102, 230, 102);
  border: 1px solid black;
}

.wp-table tr {
  border-bottom: 1px solid rgb(102, 230, 102);
}

/* .wp-table th:first-child, 
.wp-table td:first-child {
    padding-left: 16px;
} */

.wp-table td,
.wp-table th {
  padding: 8px 8px;
  display: table-cell;
  text-align: center;
  vertical-align: center;
  background: rgb(102, 230, 102);
  font-family: "Poppins", serif;
  border: 1px solid black;
}

.wp-table th {
  font-weight: bold;
  font-size: 1.5rem;
  text-align: center;
  padding-left: 50px;
  padding-right: 50px;
}

.wp-table {
  font-size: 18px !important;
  border: 1px solid black;
  border-collapse: collapse;
  border-spacing: 0;
  display: table;
}
</style>