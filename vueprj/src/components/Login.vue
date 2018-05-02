<template>
  <div>
      {{msg}}
      <p v-html="userName" />

  </div>
</template>

<script>
export default {
  data(){
      return{
          msg:'用户登录',
          userName : '用户名：',
          vbclass : 'c1',
          vbtitle : '动态'
      }
  }
}
</script>

<style>
c1{
    color: red
}
</style>


