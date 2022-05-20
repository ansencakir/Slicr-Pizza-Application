<template>
  <div id="footer">
    <p> <a href="http://www.dominos.com/en/pages/content/opt-in/opt-in">
      Contact Us </a></p>
    <p><router-link v-bind:to="{ name: 'about' }">About Us &nbsp; </router-link></p>
    <p><router-link v-bind:to="{ name: 'add-new-customer' }"> 
      Sign Up For Email Offers</router-link></p>
    <p><router-link v-bind:to="{ name: 'employee-login' }"
      >Employee Login</router-link></p>
  </div>
</template>

<script>
export default {
  name: "footerx",
};
</script>

<style>
#footer{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: flex-end;
    font-family: 'Poppins', sans-serif;
    background-color: #232425;
    border-radius: 5px;
    font-size: 20px;
    }

div > p {
  flex-flow: 1;
  color: rgb(247, 86, 86);
}
</style>