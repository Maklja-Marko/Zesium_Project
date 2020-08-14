<template>
  <div class="container-fluid">
    <div class="row">
      <div
        class="col-lg-5 leftSide"
      > 	
        <a
          class="signup"
        >Sign up</a>
        <!--
            <a
              class="Signup"
            >Welcome</a>
             -->
      </div>
      <div
        class="col-lg-7 rightSide"
        align="center"
      >
        <img
          class="img-fluid homeImage"
          src="../assets/home_image.png"
          alt=""
        >
      </div>
    </div>
  </div>
</template>
<script>
export default {
  
};
</script>
<style scoped>
.rightSide{
  overflow: hidden;
  margin-left: -80px;
}
.homeImage{
  margin-top: -130px;

}
.leftSide{
	display : flex;
  align-items: center;
	justify-content: flex-end;
}
.signup{
	padding: 2px 50px 2px 50px;
  margin-right: 90px;
  font-size: 22px;
	background-color: #EB630A;
  font-family: Montserrat semibold;
  cursor: pointer;
}
a:not([href]):not([tabindex]){
  color: white;
}
.signup:hover:not(.active) {
  background-color: yellowgreen;
  color: black;
}
@media (max-width: 992px) {
    .leftSide {
      justify-content: center;
      margin-left: 0px;
    }
    .signup {
      margin-right: 0px;
    }
    .homeImage{
      margin-top: 0px;
      margin-left: 17px;
    }
    .rightSide{
      overflow: hidden;
      margin-left: 0px;
    }
}

</style>