<template>
  <form id="orderForm">
     <h1>User Info Form </h1>
    <div id="firstName" class="orderFormStart">
    <label for="firstName">First Name: </label>
    <input  type="text" autocomplete="off"
 class="form-control" placeholder="First Name"/>
    </div>

    <label for="lastName">Last Name </label>
    <input type="text" autocomplete="off"
 class="form-control" placeholder="Last Name"/>

    <label for="streetAddress">Street Address: </label>
    <input type="text" autocomplete="off"
 class="form-control" placeholder="Street Address"/>

    <label for="City"> City: </label>
    <input type="text" autocomplete="off"
 class="form-control" placeholder="City"/>

    <label for="phoneNumber">Phone Number: </label>
    <input type="text" autocomplete="off"
 class="form-control" placeholder="Phone #"/>

     <label for="emailAddress">Email Address: </label>
    <input type="text" autocomplete="off"
 class="form-control" placeholder="Email Address"/>

     <label for="emailOffers">Sign up for email offers? </label>
    <input type="checkbox" class="form-control"/>

    <button id="submit-info" type="submit">Confirm info</button>
  </form>
</template>

<script>
export default {};
</script>

<style>

.form-control {
 display: block;
 margin-left: auto;
 margin-right: auto;
 border-radius: 5px;
 padding: 10px;
 margin-bottom: 15px;
}

#orderForm{
   border-bottom: none;
   border-top: none;
}

</style>