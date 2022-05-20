<template>
  <form id="orderForm">
     <h1 class="h3 mb-3 font-weight-normal"> Employee Information Form </h1>
    <div id="firstName" class="orderFormStart">
    <label for="firstName">First Name: </label>
    <input  type="text" autocomplete="off"
 class="form-control" placeholder="First Name" />
    </div>

    <label for="lastName">Last Name: </label>
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
 class="form-control" placeholder="Phone Number"/>


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

</style>