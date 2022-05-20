<template>
  <div id="app">
    <div id="nav">
      <!-- <div class="date-time [ u-df-mb ]">
                <div class="date-time-detail">
                    <p class="p" data-catcher="current-date"> Monday, April 18, 2022</p>
                    <h3 class="h3" data-catcher="clock">03:01:10 PM</h3>
                </div>
            </div> -->
                <p>{{currentDateTime()}}</p>
      <img id="logo" src="../public/slicr-red-transparent.png" alt="Slicr Logo">
      <div id="links">
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <span>
      <a><router-link v-bind:to="{ name: 'home' }" v-if="$store.state.token != '' && this.$route.path != '/employee/home'">Home &nbsp;</router-link></a>
      <router-link v-bind:to="{ name: 'employee-home' }" v-if="$store.state.token != '' && this.$route.path == '/employee/home'">Home &nbsp;</router-link>
      <router-link v-bind:to="{ name: 'landing-page' }" v-if="$store.state.token == ''">Home &nbsp;</router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">|&nbsp; Logout &nbsp;</router-link> 
      <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == '' && this.$route.path != '/login'"> |&nbsp;Login &nbsp;</router-link>
      <router-link v-bind:to="{ name: 'checkout' }" >|&nbsp;Checkout</router-link>
      </span>
      </div>
    </div>
    <router-view />
    <Footerx/>
  </div>
</template>

<script>
import Footerx from './components/Footerx.vue'

export default {
components: {Footerx}
,
methods: {
    currentDateTime() {
      const current = new Date();
      const date = (current.getMonth()+1)+'-'+current.getDate()+'-'+current.getFullYear();
      const time = current.getHours() + ":" + current.getMinutes();
      const dateTime = date +' '+ time;

      return dateTime;
    }
  }
};
</script>




<style>
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap');


#nav{
  display: flex;
  align-items: center;
  background-color: #232425;
  justify-content: space-evenly;
  border-radius: 5px;
}

a:link {
  color: rgb(247, 86, 86);
}

a:visited {
  color: rgb(247, 86, 86);
}

.h3 {
  font-family: 'Poppins', sans-serif;
  text-transform: uppercase;
  color: rgb(3, 85, 3);
  font-size: 25px;
}

#nav, .p {
   font-family: 'Poppins', sans-serif;
    font-size: 30px;
      color: rgb(209, 74, 74) ;

}

#logo {
display: flex;
width: 235px;
position: absolute;
padding-bottom: 35px;
}

span {
  padding-left: 600px;
}

body{
  margin: 0px;
}

</style>
