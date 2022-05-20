<template>
  <div id="register" class="text-center">
    <b><router-link id="login-link" :to="{ name: 'login' }">Already have an employee account?</router-link></b>
    <form class="form-register" @submit.prevent="register">
      <h1 class="h3 mb-3 font-weight-normal">Create Employee Account</h1>
      
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        {{ registrationErrorMsg }}
      </div>
      <label for="username" class="sr-only">Username:</label>
      <input
        type="text"
        id="username"
        autocomplete="off"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only">Password:</label>
      <input
        type="password"
        id="password"
        autocomplete="off"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        placeholder="Confirm Password"
        v-model="user.confirmPassword"
        required
      />
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Create Account
      </button>
    </form>
    <employeeInfoForm/>  
  </div>
</template>

<script>
import authService from '../services/AuthService';
import employeeInfoForm from '../components/EmployeeInfoForm.vue'
export default {
  name: 'employee-register',
  components: {employeeInfoForm},
  data() {
    return {
      user: {
        username: '',
        password: '',
        confirmPassword: '',
        role: 'user',
      },
      registrationErrors: false,
      registrationErrorMsg: 'There were problems registering this user.',
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = 'Password & Confirm Password do not match.';
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: '/login',
                query: { registration: 'success' },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = 'Bad Request: Validation Errors';
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = 'There were problems registering this user.';
    },
  },
};
</script>

<style>
label{
    display: block;
  margin-left: auto;
  margin-right: auto; 
  text-align: center;
  font-family: Arial, Helvetica, sans-serif;
  font-size: 20px;
}

.form-register{ 
  border-bottom: none;
}

#login-link{
   display: block;
    text-align: center;
}

.btn {
  margin-bottom: 60px;
}

</style>