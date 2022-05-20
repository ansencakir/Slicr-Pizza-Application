import axios from 'axios';

export default {

    listEmployee() {
        return axios.get('/employee');
    },

    getEmployeeById(id) {
        return axios.get(`/employee/${id}`);
    },

    createEmployee(employee) {
        return axios.post(`/employee`, employee);
    },

    updateEmployee(employee) {
        return axios.put(`/employee/${employee.id}`, employee);
    },

    deleteEmployee(id) {
        return axios.delete(`/employee/${id}`)
    },
}