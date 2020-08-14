import navbar from './components/Navbar.vue';
import home from './components/Home.vue';
import login from './components/Login.vue';
import forgotPassword from './components/forgotPassword.vue';
import signup from './components/Signup.vue';

export default[
	{path: '/Home',  components: {
		default: home,
		navbar: navbar
	}, alias: '/'},
	{path: '/Login', name: 'Login', component: login},
	{path: '/RecoverPassword', name: 'Forgot', component: forgotPassword},
	{path: '/Signup', name: 'Signup', components: {
		default: signup,
		navbar: navbar
	}}
];