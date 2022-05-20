<template>
  <div id="PendingOrders">
      <h1>Pending Orders:</h1>
      <table class="wp-table">
        <tr>
            <th>sale id</th>
            <th>pizzas</th>
            <th>customer id</th>
            <th>delivery</th>
            <th>total</th>
        </tr>
        <tr id="pizzas" v-for="sale in this.sales" v-bind:key="sale.saleId">
            <td> {{sale.saleId}} </td>
            <td v-on:load="getPizzaBySaleId(sale.saleId)">
                <div v-for="pizza in this.salePizzas" v-bind:key="pizza.pizzaId">
                    {{pizza.pizzaName}}
                    toppings:
                    <div 
                        v-on:load="getToppingsByPizzaId(pizza)"
                        v-for="topping in specialtyToppings" 
                        v-bind:key="topping.toppingName">
                        {{topping.toppingName}}
                    </div>
                </div>
            </td>
            <td> {{sale.customerId}} </td>
            <td> {{sale.isDelivery}} </td>
            <td> {{sale.total}} </td>
        </tr>
      </table>
  </div>
</template>

<script>
import saleService from "@/services/SaleService.js";
import pizzaService from "@/services/PizzaService.js";
import toppingService from "@/services/ToppingService.js";

export default {
  name: "pending_orders",
  computed: {
    sales() {
      return this.$store.state.sales;
    },
    salePizzas(){
        return this.$store.state.salePizzas
    },
    specialtyToppings() {
      return this.$store.state.specialtyToppings;
    },
    toppings() {
      return this.$store.state.toppings;
    }

  },
  methods: {
    listSale() {
      saleService.listSale().then((response) => {
        this.$store.commit("SET_SALE", response.data);
      });
    },
    getPizzaBySaleId(id) {
        pizzaService.getPizzaBySaleId(id).then((response) => {
            this.$store.commit("SET_SALE_PIZZAS", response.data)
        });
    },
    getToppingsByPizzaId(pizza) {
      toppingService.getToppingsByPizzaId(pizza.pizzaId).then((response) => {
        this.$store.commit("SET_SPECIALTY_TOPPINGS", response.data);
      });
    },
    resetSpecialtyToppings() {
      let specialtyToppings = [];
      this.$store.commit("SET_SPECIALTY_TOPPINGS", specialtyToppings);
    },
  },
  created() {
    this.listSale();
  }

}
</script>

<style>

</style>