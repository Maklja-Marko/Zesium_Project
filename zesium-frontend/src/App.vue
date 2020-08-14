<template>
  <div
    id="app"
  >
    <!-- <Navbar /> -->
    <router-view name="navbar" />
    <router-view />
  </div>
</template>

<script>
// import Navbar from './components/Navbar.vue';

export default {
	name: 'App',
	components: {
		
	}
};
</script>

<style>
html body{
  background-color: #F3F7FA;
}

</style>
