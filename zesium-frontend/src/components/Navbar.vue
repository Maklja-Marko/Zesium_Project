<template>
  <b-navbar
    class="navMain"
    toggleable="lg"
  >
    <b-navbar-brand href="/Home">
      <img
        src="../assets/Zesium-logo_sign_up.png"
      >
    </b-navbar-brand>
    <b-navbar-toggle target="nav-collapse" />
    <b-collapse
      id="nav-collapse"
      class="navSub"
      is-nav
    >
      <!-- Right aligned nav items -->
      <b-navbar-nav class="ml-auto navList">
        <b-nav-item href="/Home">
          Home
        </b-nav-item>
        <b-nav-item href="#">
          Fleaty
        </b-nav-item>
        <b-nav-item-dropdown
          text="How it works?"
        >
          <b-dropdown-item href="#">
            Random stuff 1
          </b-dropdown-item>
          <b-dropdown-item href="#">
            Random stuff 2
          </b-dropdown-item>
          <b-dropdown-item href="#">
            Random stuff 3
          </b-dropdown-item>
          <b-dropdown-item href="#">
            Random stuff 4
          </b-dropdown-item>
        </b-nav-item-dropdown>
        <b-nav-item href="#">
          About Us
        </b-nav-item>
        <b-nav-item href="/Login">
          Login
        </b-nav-item>
        <span class="slash"> &nbsp; /</span>
        <b-nav-item
          class="signup"
          href="/Signup"
        >
          Sign up
        </b-nav-item>
        <b-nav-item href="#">
          <img
            src="../assets/srb_flag.png"
          >SRB
        </b-nav-item>
        <span class="slash"> &nbsp; /</span>
        <b-nav-item
          class="en"
          href="#"
        >
          <img
            src="../assets/eng_flag.png"
          >EN
        </b-nav-item>
      </b-navbar-nav>
    </b-collapse>
    <!--
        <li
          class="nav-item"
        >
          <a
            class="nav-link"
          >Admin</a>
        </li>
        
        <li
          class="nav-item"
        >
          <a
            class="nav-link"
          >Logout</a>
        </li>	
    -->
  </b-navbar>
</template>

<script>
export default {
    
};
</script>
<style scoped>

.navMain .navSub .navList .nav-item > a:hover{
  background-color: #EB630A;
  color: white;
  font-weight: 600;
}
::v-deep .dropdown .nav-link:hover {
   color: rgb(255, 255, 255)!important;
   background-color: #EB630A;
   font-weight: 600;
}
.navMain{
  margin-right: 10%;
  margin-left: 10%;
}
.nav-item{
  font-weight: 600;
	margin-left: 20px;
  text-align: center;
}
.signup, .en{
  margin-left: -1px;
}
.slash{
  padding-top: 6px; 
}
@media (max-width: 992px) {
    .nav-item {    
      margin-left: 0px; 
      text-align: left;
    }
    .navbar-nav .nav-link  {    
      padding-left: 10px;   
    }
    ::v-deep .dropdown .nav-link {
      padding-left: 10px;   
    }
    .slash{
      display: none;
    }
}

</style>