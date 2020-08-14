<template>
  <div class="container-fluid">
    <div class="row">
      <div class="col-xl-4 col-sm-12" />
      <div class="col-xl-4 col-sm-12 forgotForm">
        <a href="/Home"><img
          class="forgotImage"
          src="../assets/Zesium-logo.png"
        ></a>
        <form
          method="Post"
        >
          <div> 
            <input
              type="phone"
              maxlength="30"
              placeholder="Enter phone number"
            >    
          </div>   
          <div class="submitButton">
            <input
              class="buttSub"
              type="submit"
              value="SEND"
            > 
          </div>
        </form>
      </div>
      <div class="col-xl-4 col-sm-12 forgotHeader">
        <div class="forgotHeaderLinks">
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
export default {
    
};
</script>
<style scoped>
.forgotHeader {
    text-align: center;
    padding: 5px;
    margin-top: 53px;
}
.forgotHeader a:hover:not(.active) {
    background-color: #EB630A;
    color: white; 
}
.forgotHeaderLinks a{
    cursor: pointer;
}
.forgotForm{
    text-align: center;
}
.forgotImage{
    margin-bottom: 120px;
    margin-top: 104px;
}
.forgotForm input[type = phone]{
    width: 380px;
    height: 50px;
    padding-left: 10px;
    font-size: 18px;
    margin-top: 45px;
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
</style>