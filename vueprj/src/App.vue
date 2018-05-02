<template>
  <div id="app">
    <img src="./assets/logo.png">

    <Study/>
  </div>
</template>

<script>

import Vue from 'vue'
import HelloWorld from './components/HelloWorld'
import Login from './components/Login'
import Study from './components/Study'






export default {
  name: 'App',
  components: {
    HelloWorld,
    Login,
    Study
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
