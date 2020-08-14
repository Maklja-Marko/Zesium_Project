<template>
  <div class="container-fluid">
    <div class="row">
      <div
        class="col-lg-12 title"
      > 
        <span
          class="signupTitle"
        > Sign up</span>
      </div>
    </div>

    <b-form
      class="row align-items-start signupForm"
    >
      <div class="col-lg-1" />
      <div class="col-lg-5 leftForm">
        <b-form-group
          label-for="nameId"
          label-cols-md="4"
          label-align-md="right"
          label="Name and Surname:"
        >
          <b-form-input
            id="nameId"
            type="text"
            class="name"
          />
        </b-form-group>

        <b-form-group
          label-for="emailId"
          label-cols-md="4"
          label-align-md="right"
          label="E-mail:"
        >
          <b-form-input 
            id="emailId"
            type="email"
          />
        </b-form-group>

        <b-form-group
          label-for="passwordId"
          label-cols-md="4"
          label-align-md="right"
          label="Password:"
          class="password1"
        >
          <b-form-input
            id="passwordId"
            type="password"
          />
        </b-form-group>
        <b-form-group
          label-for="repPassId"
          label-cols-md="4"
          label-align-md="right"
          label="Repeat password:"
        >
          <b-form-input
            id="repPassId"
            type="password"
          />
        </b-form-group>
      </div>
      <div class="col-lg-5">
        <b-form-group
          label-for="phoneId"
          label-cols-md="4"
          label-align-md="right"
          description="eg: ( 1234-567-890 )"
          label="Phone number:"
        >
          <b-form-input
            id="phoneId"
            type="text"
          />
        </b-form-group>
        <b-form-group
          label-for="compNameId"
          label-cols-md="4"
          label-align-md="right"
          label="Company name:"
        >
          <b-form-input
            id="compNameId"
            type="text"
          />
        </b-form-group>
        <b-form-group
          label-for="compAdressId"
          label-cols-md="4"
          label-align-md="right"
          label="Company address:"
        >
          <b-form-input
            id="compAdressId"
            type="text"
            class="compAdress"
          />
        </b-form-group>
        <b-form-group
          label-for="orgId"
          label-cols-md="4"
          label-align-md="right"
          label="Organizatio number:"
        >
          <b-form-input id="orgId" />
          <ul class="policy">
            <li>By registering i accept the Terms of use and <a href="#">Privaciy policy</a></li>
          </ul>
        </b-form-group>
      </div> 
      <div class="col-lg-1" />
      <div
        class="col-lg-12 btnDiv"
      > 
        <b-button
          type="submit"
          class="btnRegister"
          size="lg"
        >
          REGISTER
        </b-button>
      </div>
    </b-form>
  </div>
</template>
<script>
export default {
    
};
</script>

<style scoped>
.signupForm{
    font-weight: 600;
    font-size: 15px;
    color: gray;
}
input[type = email], input[type = password], input[type = text], input[type = number]{
    width: 100%;
    height: 42px;
    align-items: center;
}
.password1{
    margin-top: 87px;
    align-items: center;
}
.title{
    margin-top: 7%;
    margin-bottom: 50px;
	text-align: center;
}
.signupTitle{
	font-family: Montserrat semibold;
	font-size: 40px;
	font-weight: 600;
}
.leftForm{
    padding-left: 120px;
}
.btnDiv{
    text-align: center;
	margin-top: 90px;
}
.btnRegister{
	border: 1px #EB630A;
	padding: 8px 60px 8px 60px;
	color: white;
    font-size: 22px;
    background-color: #EB630A;
}
.btnRegister:hover{
    color: #000000;
    background-color: yellowgreen;
}
.policy{
    margin-top: 20px;
    padding-left: 17px;
}
@media (max-width: 1100px) {
    
   .leftForm{
        padding-left: 15px;
    }
    input[type = email], input[type = password], input[type = text], input[type = number]{
        margin-top: 5px;
    }
    .password1{
        margin-top: 0px;
    }
    .space{
        margin-left: 13px;
    }
}
@media (max-width: 765px) {
    .form-row{
        text-align: center;
    }
    .btnDiv{    
        margin-top: 0px;
    }
    .policy{
         text-align: left;
    }
}
</style>