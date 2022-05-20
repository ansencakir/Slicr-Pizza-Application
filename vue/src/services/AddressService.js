import axios from 'axios';



export default {

    listAddress() {
        return axios.get('/address');
    },

    getAddressById(id) {
        return axios.get(`/address/${id}`);
    },

    createAddress(address) {
        return axios.post(`/address`, address);
    },

    updateAddress(address) {
        return axios.put(`/address/${address.id}`, address);
    },

    deleteAddress(id) {
        return axios.delete(`/address/${id}`)
    },
}