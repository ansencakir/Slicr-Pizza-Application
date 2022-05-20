<template>
<body>
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <h1 class="h3 mb-3 font-weight-normal">Log in to your account</h1>
      <div
        class="alert_alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert_alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <label for="username" class="sr-only-username">Username:</label>
      <input
        type="text"
        autocomplete="off"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only-password">Password:</label>
      <input
        type="password"
        autocomplete="off"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <div id="registration">
      <b><router-link :to="{ name: 'register' }">Need an account?</router-link></b>
      </div>
      <button type="submit">Sign in</button>
    </form>
  </div>
  </body>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/home");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap');

body {
  background-color: rgb(102, 230, 102);
}

#login{
  display: flex;
  align-items: center;
  justify-content: center;
}


.sr-only-username {
  display: block;
  margin-left: auto;
  margin-right: auto; 
  text-align: center;
  font-family: 'Poppins', sans-serif;
  font-size: 20px;
}

.sr-only-password {
 display: block;
 margin-left: auto;
 margin-right: auto; 
 text-align: center;
 font-family: 'Poppins', sans-serif;
 font-size: 20px;
}

.form-control {
 display: block;
 /* margin-left: auto;
 margin-right: auto; */
 border-radius: 5px;
 padding: 10px;
 margin-bottom: 15px;
}

h1 {
  text-align: center;
  font-family: 'Poppins', sans-serif;  
  font-size: 30px;
  color: #232425;
  }

button {
  display: block;
  margin-left: auto;
  margin-right: auto;
  background-color: green;
  color: white; 
  padding: 5px;
  border-radius: 15px;
  cursor: pointer;
  width: 180px;
  font-size: 20px;
  font-family: 'Poppins', sans-serif;
  margin-bottom: 20px;
  }

  #registration {
  text-align: center;
  }
 

</style>