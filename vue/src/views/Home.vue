<template>
  <div class="home">
   <PizzaMenu/>
   <OrderForm/>
  </div>
</template>

<script>
import OrderForm from '../components/OrderForm.vue'
import PizzaMenu from "../components/PizzaMenu.vue"
export default {
  name: "home",
  components: { PizzaMenu, OrderForm}
};
</script>
