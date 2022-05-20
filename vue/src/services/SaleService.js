import axios from 'axios';


export default {

    listSale() {
        return axios.get('/sale');
    },

    getSaleById(id) {
        return axios.get(`/sale/${id}`);
    },

    createSale(sale) {
        return axios.post(`/sale`, sale);
    }
   
}