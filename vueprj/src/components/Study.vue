<template>
  <div>
      {{msg}}
      <p v-html="userName" />
      <span v-bind:class="vbclass">CSS</span>
    <br/>
      <span v-bind:title="vbtitle">TITLE</span>
    <br/>
      {{msg.split('').join(',')}}
    <br/>
    <p v-if="showflg">TRUE</p>
    <p v-else>FALSE</p>

    <p v-show="showflg">v-show</p>

    <div>
        <ul>
            <li v-for="(a,index) in names" v-bind:key="index">{{a}}-{{index}}
            </li>
        </ul>
    </div>

    <button v-on:click="num+=1">add</button>
    {{num}}
    <button v-on:click="handlerClick">method</button>

     <button v-on:click="postData">postData</button>

  </div>
</template>

<script>
export default {
  data(){
      return{
          msg:'用户登录',
          userName : '用户名：',
          vbclass : 'c1',
          vbtitle : '动态',
          showflg : true,
          names : ['aa','bb','cc'],
          num:1
      }
  },
  methods:{
      handlerClick(){
          this.num +=1;
      },
      postData(){
        this.$axios.get(this.HOST+"/abc")
        .then(function(response){
            console.log(response);
        })
        .catch(function(error){
            console.log(error);
        });
      }
  },
  computed:{

  },
  watch:{

  }
  
}
</script>

<style>
c1{
    color: red
}
</style>


