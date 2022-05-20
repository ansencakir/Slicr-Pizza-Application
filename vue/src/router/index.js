import Vue from 'vue'
import Router from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Logout from '../views/Logout.vue'
import Register from '../views/Register.vue'
import store from '../store/index'
import LandingPage from '../views/LandingPage.vue'
import TestView from '../views/TestView.vue'
import AddPersonalInfo from '../views/AddPersonalInfo.vue'
import EmployeeLogin from '../views/EmployeeLogin.vue'
import EmployeeRegister from '../views/EmployeeRegister.vue'
import EmployeeHome from '../views/EmployeeHome.vue'
import Checkout  from '../views/Checkout.vue'
import About from '../views/About.vue'
Vue.use(Router)

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 *
 * It also is used to detect whether or not a route requires the user to have first authenticated.
 * If the user has not yet authenticated (and needs to) they are redirected to /login
 * If they have (or don't need to) they're allowed to go about their way.
 */

const router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/home',
      name: 'home',
      component: Home,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: '/',
      name: 'landing-page',
      component: LandingPage,
      meta: {
        requiresAuth: false
      }

    },
    {
      path: "/login",
      name: "login",
      component: Login,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/logout",
      name: "logout",
      component: Logout,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/register",
      name: "register",
      component: Register,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/test",
      name: "test-view",
      component: TestView,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/customer/new",
      name: "add-new-customer",
      component: AddPersonalInfo,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/checkout",
      name: "checkout",
      component: Checkout,
      meta:{
        requiresAuth: true
      }
    },
    {
    path: "/employee/login",
    name: "employee-login",
    component: EmployeeLogin,
    meta: {
      requiresAuth: false
    }
    },
    {
      path: "/employee/register",
      name: "employee-register",
      component: EmployeeRegister,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/employee/home",
      name: "employee-home",
      component: EmployeeHome,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/about",
      name: "about",
      component: About,
      meta: {
        requiresAuth: false
      }
    },
  ]
})

router.beforeEach((to, from, next) => {
  // Determine if the route requires Authentication
  const requiresAuth = to.matched.some(x => x.meta.requiresAuth);

  // If it does and they are not logged in, send the user to "/login"
  if (requiresAuth && store.state.token === '') {
    next("/login");
  } else {
    // Else let them go to their next destination
    next();
  }
});

export default router;
