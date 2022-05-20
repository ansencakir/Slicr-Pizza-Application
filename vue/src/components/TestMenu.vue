<template>
  <div class="test-menu">
    <ul v-for="pizza in this.pizzas" v-bind:key="pizza.id">
        <li> {{pizza.pizzaName}} </li>
    </ul>
      <!-- <tbody>
            <tr v-for="pizza in this.$store.state.pizza" v-bind:key="pizza.id">
                <td>
                    {{pizza.name}}
                </td>
            </tr>
      </tbody> -->
  </div>
</template>

<script>
    import pizzaService from "@/services/PizzaService.js";

export default {
    name: "test-menu",
    data () {
        return {
            posts: []
        };
    },
    computed: {
        pizzas( ) { return this.$store.state.pizzas;}
    },
    methods: {
        listPizza() {
            pizzaService.listPizza().then(response => {
                this.$store.commit("SET_PIZZA", response.data);
            });
        }
    },
    created() {
        this.listPizza();
    }
};
</script>

<style>

</style>