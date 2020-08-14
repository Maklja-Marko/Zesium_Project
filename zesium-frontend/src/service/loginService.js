import axios from 'axios';
import url from '../config/url';

export class LoginService{

	async startLogin (email, password){
		try{
			console.log(`${url}/loginCheck`);
			await axios.post(`${url}/loginCheck`,{
				email,
				password
			});
		} catch (error_1) {
			return error_1;
		}
	}
}

export default new LoginService();