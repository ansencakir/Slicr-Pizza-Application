import axios from 'axios';

export default {

    listTopping() {
        return axios.get('/topping');
    },

    getToppingById(id) {
        return axios.get(`/topping/${id}`);
    },

    getToppingsByPizzaId(id) {
        return axios.get(`/pizza/topping/${id}`)
    }


}