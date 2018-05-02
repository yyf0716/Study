import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

const constantRouterMap = [
    { path: '/login', component: () => import('@/views/login/login_index'), hidden: true },
    { path: '/404', component: () => import('@/views/404'), hidden: true },
    { path: '/', component: () => import('@/views/login/login_index'), hidden: true },
    { path: '*', redirect: '/404', hidden: true }
  ]
  
export default new Router({
  routes: constantRouterMap
})