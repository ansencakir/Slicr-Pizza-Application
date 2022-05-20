<template>
  <div>
    <CustomerInfoForm />
    <CreditCardForm />
  </div>
</template>

<script>
import CreditCardForm from "@/components/CreditCardForm.vue";
import CustomerInfoForm from "@/components/CustomerInfoForm";
export default {
  name: "add-personal-info",
  components: { CreditCardForm, CustomerInfoForm },
};
</script>

<style>
</style>