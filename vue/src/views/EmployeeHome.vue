<template>
  <div class="employeeHome">
   <EmployeeMenu/>
   <PendingOrders/>
  </div>
</template>

<script>
import EmployeeMenu from '../components/EmployeeMenu.vue';
import PendingOrders from '../components/PendingOrders.vue';
export default {
  name: "employee-home",
  components: {EmployeeMenu, PendingOrders}
};
</script>
