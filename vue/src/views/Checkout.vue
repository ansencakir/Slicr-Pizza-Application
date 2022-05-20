<template>
   <div id="cart">
    <CreditCardForm/>
    <Cart/>
    
    </div>
</template>

<script>
import Cart from '@/components/Cart.vue'
import CreditCardForm from '../components/CreditCardForm.vue'
export default {
name: 'checkout',
components: {Cart, CreditCardForm}
}
</script>

<style>

</style>