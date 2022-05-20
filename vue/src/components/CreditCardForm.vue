<template>
  <form id="creditCardForm" v-on:submit.prevent="addCreditCard">
    <h1>Credit Card Form </h1>
    <div id="creditCardInformation" class="CreditCardFormStart">
    <label for="fullName">Full Name: </label>
    <input type="text"  autocomplete="off" name="fullName" v-model="creditCard.fullName"
 class="form-control" placeholder="Full Name"/>
    </div>

    <label for="zipCode">Zip Code: </label>
    <input type="text" autocomplete="off" name="zipCode" v-model="creditCard.zipCode"
 class="form-control" placeholder="Zip Code"/>

    <label for="creditCardNumber">Credit Card Number: </label>
    <input type="text" autocomplete="off" name="creditCardNumber" v-model="creditCard.creditCardNumber"
 class="form-control" placeholder="Credit Card #"/>

    <label for="securityCode"> Security Code: </label>
    <input type="text" autocomplete="off" name="securityCode" v-model="creditCard.securityCode"
 class="form-control" placeholder="Security Code"/>

    <label for="expirationDate">Exp Date: </label>
    <input type="text" autocomplete="off"  name="expirationDate" v-model="creditCard.expirationDate"
 class="form-control" placeholder="Exp Date"/>

        <button type="submit">Confirm</button>
  </form>
</template>

<script>
export default {
name: 'credit-card-form',
computed: {
creditCard(){
  return this.$store.state.creditCard;
}
},
methods: {
addCreditCard(){
  let creditCard = {
    fullName: this.fullName,
      zipCode: this.zipCode,
      creditCardNumber: this.creditCardNumber,
      securityCode: this.securityCode,
      expirationDate: this.expirationDate
  }
  this.$store.commit("ADD_CREDIT_CARD", creditCard);

}
}
};
</script>

<style>
body {
  font-family: Arial, Helvetica, serif;
}

/* style for labels */
  label {
  margin-top: 30px;
  margin-bottom: 5px;
  display: block;
  background-color: rgb(41, 139, 41);
  color: white; 
  padding: .5rem;
  width: auto;
  font-size: auto;
  border-style: groove;
  border-color: green;
  font-weight: 100;
  white-space: nowrap;
  text-align: center;
  border-radius: 15px;

  }

/* form container */
form {
  display:flex;
  flex-direction: column;
  align-items: center;
  border-color: black;
   margin-left: auto;
 margin-right: auto;
  border-style: groove;
  border-color: green;
  border-width: auto;

    
}

/* style of dropdowns */
select {
  width: auto;
  height: 30px;
  text-align: center;
  font: 1.1em serif;
  font-family: Arial, Helvetica, sans-serif;
  margin: .25rem;

}


#creditCardForm{
  border-top: none;
}
button {
  margin-top: 10px;
  
}

</style>