<template>
  <div class="container-fluid">
    <div class="row">
      <div class="col-xl-4 col-sm-12" />
      <div class="col-xl-4 col-sm-12 loginForm">
        <a href="/Home"><img
          class="loginImage"
          src="../assets/Zesium-logo.png"
        ></a>
        <form>
          <div> 
            <input
              v-model="login.email"
              type="email"
              maxlength="30"
              placeholder="Email"
            >    
          </div>   
          <div> 
            <input
              v-model="login.password"
              type="password"
              maxlength="30"
              placeholder="Password"
            >
          </div>
          <div class="submitButton">
            <input
              class="buttSub"
              type="button"
              value="LOGIN"
              @click="createLogin(login.email, login.password)"
            > 
          </div>
          <div class="forgotPassword">
            <a href="/RecoverPassword">Forgot password?</a>
          </div>
        </form>
      </div>
      <div class="col-xl-4 col-sm-12 loginHeader">
        <div class="loginHeaderLinks">
          <a
            class="langSet"
          ><img
            class="Srb"
            src="../assets/srb_flag.png"
            alt=""
          > SRB </a> <span class="space"> &nbsp;/&nbsp; </span>  <a
            class="langSet"
          > EN <img
            class="Eng"
            src="../assets/eng_flag.png"
            alt=""
          ></a>
        </div>
      </div>
    </div>
  </div> 
</template>
<script>
import { Login }  from '../model/login';
import loginService from '../service/loginService';

export default {
	data () {
		return {
			login: new Login()
		};
	},
	methods: {
		createLogin (email, password){
			console.log(email + "244242");
			loginService.startLogin(email, password);
		}
	}
    
};
</script>

<style scoped>
.loginHeader {
    text-align: center;
    padding: 5px;
    margin-top: 53px;
}
.loginHeaderLinks a{
    cursor: pointer;
}
.loginHeader a:hover:not(.active) {
    background-color: #EB630A;
    color: white; 
}
.loginForm{
    text-align: center;
}
.loginImage{
    margin-bottom: 120px;
    margin-top: 104px;
}
.loginForm input[type = email], [type = password], [type = text], textarea{
    width: 380px;
    height: 50px;
    padding-left: 10px;
    font-size: 18px;
    margin-top: 45px;
    background-color: white;
}
::placeholder{
  color: #000000b4;
  opacity: 0.5;
}
.buttSub{
    margin-top: 45px;
    height: 45px;
    width: 200px;
    font-size: 20px;
    background-color: #EB630A;
    cursor: pointer;
    color: white;
}
.buttSub:hover:not(.active) {
    background-color: yellowgreen;
    color: black;
}

.forgotPassword{
    margin-top: 10px;
    color: #2196F3;
    text-decoration: none;   
    font-weight: 600;
}
.forgotPassword a{
    cursor: pointer;
}
.forgotPassword:hover{
    color: rgb(163, 14, 233);
}


</style>