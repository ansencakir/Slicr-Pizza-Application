import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import createPersistedState from 'vuex-persistedstate'

Vue.use(Vuex)

/*
 * The authorization header is set for axios when you login but what happens when you come back or
 * the page is refreshed. When that happens you need to check for the token in local storage and if it
 * exists you should set the header so that it will be attached to each request
 */
const currentToken = localStorage.getItem('token')
const currentUser = JSON.parse(localStorage.getItem('user'));

if (currentToken != null) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${currentToken}`;
}

export default new Vuex.Store({
  plugins: [createPersistedState({
    storage: window.sessionStorage,
  })],
  state: {
    token: currentToken || '',
    user: currentUser || {},
    pizzas: [],
    toppings: [],
    total: 15,
    specialtyToppings: [],
    selectedToppings: [],
    cart: [],
    sizes: [],
    specialties: [],
    sales: [],
    salePizzas: [],
    parsedCart: [],
    creditCard: {
      fullName: '',
      zipCode: '',
      creditCardNumber: '',
      securityCode: '',
      expirationDate: ''
    }
  },
  mutations: {
    SET_AUTH_TOKEN(state, token) {
      state.token = token;
      localStorage.setItem('token', token);
      axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
    },
    SET_USER(state, user) {
      state.user = user;
      localStorage.setItem('user', JSON.stringify(user));
    },
    LOGOUT(state) {
      localStorage.removeItem('token');
      localStorage.removeItem('user');
      state.token = '';
      state.user = {};
      axios.defaults.headers.common = {};
    },
    SET_PIZZA(state, data) {
      state.pizzas = data;
    },
    SET_TOPPING(state, data) {
      state.toppings = data;
    },
    SET_SIZE(state, data) {
      state.sizes = data;
    },
    SET_SPECIALTY(state, data) {
      state.specialties = data;
    },
    SET_SPECIALTY_TOPPINGS(state, data) {
      state.specialtyToppings = data;
    },
    ADD_PIZZA(state, pizza) {
      state.cart.push(pizza);
    },
    SET_PURCHASED_PIZZA(state, data) {
      state.purchasedPizza = data;
    },
    FLIP_AVAILABLE(state, pizza) {
      const index = state.pizzas.findIndex(item => item.pizzaId === pizza.pizzaId);
      state.pizzas[index].isAvailable = pizza.isAvailable;
    },
    ADD_CREDIT_CARD(state, data) {
      state.creditCard = data;
    },
    SET_SALE(state, data) {
      state.sales = data;
    },
    ADD_SALE(state, sale) {
      state.sales.push(sale);
    },
    SET_SALE_PIZZAS(state, data) {
      state.salePizzas = data;
    },
    SET_AVAILABLE_PIZZA(state, data) {
      state.pizzas.isAvailable = data;
    },
    CREATE_PARSED_CART(state, data) {
      state.parsedCart.push(data);
    },
    CLEAR_PARSED_CART(state, data) {
      state.parsedCart = data;
    },
    SET_TOTAL(state, total) {
      state.total = total;
    },
    SET_SELECTED_TOPPING(state, data) {
      state.selectedToppings.push(data);
    },
    CLEAR_CART(state, data){
      state.cart = data;
    }

  }
});

