import axios from 'axios';

export default {

    listCustomer() {
        return axios.get('/customer');
    },

    getCustomerById(id) {
        return axios.get(`/customer/${id}`);
    },

    createCustomer(customer) {
        return axios.post(`/customer`, customer);
    },

    updateCustomer(customer) {
        return axios.put(`/customer/${customer.id}`, customer);
    },

    deleteCustomer(id) {
        return axios.delete(`/customer/${id}`)
    },
}