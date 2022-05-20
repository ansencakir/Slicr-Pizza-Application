import axios from 'axios';



export default {

    listPizza() {
        return axios.get('/pizza');
    },

    listAvailablePizza() {
        return axios.get('/pizza/available');
    },


    getPizzaById(id) {
        return axios.get(`/pizza/${id}`);
    },
    createPizza(pizza) {
        return axios.post(`/pizza`, pizza);
    },

    updatePizza(pizza) {
        return axios.put(`/pizza/${pizza.pizzaId}`, pizza);
    },

    deletePizza(id) {
        return axios.delete(`/pizza/${id}`)
    },

    getPizzaBySaleId(id) {
        return axios.get(`/pizza/sale/${id}`)
    },

    getPizzaBySizeId(id) {
        return axios.get(`/pizza/size/${id}`)
    },


    getAvailablePizzaBySizeId(id) {
        return axios.get(`/pizza/available/size/${id}`)
    }
}