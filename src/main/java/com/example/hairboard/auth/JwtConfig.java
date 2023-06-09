package com.example.hairboard.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
			"MIIEowIBAAKCAQEAp8EapNEPC08K7O57yrTzV1ksPHtXe3XnxwuR3SxpHznts1cP\n" +
			"JNrVdX0h8TF2ptXbgSX8+Tb2FJL+14D5XJhvacG/yj6I8iDt/hBNPYHq7jKQRH2+\n" +
			"3u+/e9oW82gJyxDzKjIOCbHUX0w88PHr1nj6h85ZNCvRqD5mVuAsHIX73pyZv9a4\n" +
			"AhMf7EUNeyWyuTk6hJlbqX8pIc0LhFp4/FLaGW5ZdKkB4L21sulWN34stA6Qvxwi\n" +
			"JTJb0XOWQG2z2z5iI0eO2CUKjKOuPyVWMGO4V+2CgYw7K9Rk/1sHt+EbHQmncmc6\n" +
			"E0y3UyWffT6e6NDBxRX7YWtLJ9e+s+BTuFJ3oQIDAQABAoIBACSKyAcHE0PfX/3k\n" +
			"pUquyCNK5Xv3UkMul+Kf/pIzTmLi94iNelsI4F7Ld01W/QWyqDIl2ElhU5F/w8ul\n" +
			"6Kvm+L4M2n5vyN0Vl0I0wt6XIlno4cxJp/5gM1IDW+SB0UBO3OlgJfauqhhoPw4t\n" +
			"ZLY/fDOBG6VltjH0Bc7+3h0IgqknEXk2zba66Z9bbswjY1uCV6gw3GaV9fpZxSxT\n" +
			"CGwMY/9Q6tV05Z8eFtEu8tlk4+hz9Q0rttBfEboW63cul3lMvTOY+e9D9bVoXepO\n" +
			"b0wxujSZMFvlAebIIPxFbR1LB7LBWkCah+BOEb/avfd/BAJtvxSBYcckE7/qrhaY\n" +
			"oXqnuBECgYEA03/8TBfhy/Ahpt8mJO3XKRfaiTJrL7F4fV9L5dCChrv5uNjgV59c\n" +
			"ZCNDNZm1fKiX31uMn3Y6Ke+fFcRLCu8zKfu5dSATCOBwsTnP1RPe8E2l7Nj9RTl5\n" +
			"jxxkl2dST6IPV+ajA3CwWq5bBeDPZbTQi+G3/909/WrvszPlTFr6zA8CgYEAywzZ\n" +
			"XWXp4T/5i1eZ/rcgBVQ0clvHW6FA+1mhY+sZj1XoW+vo40eN09VozHjrhkZInbcK\n" +
			"BgRvuqXsykGRXIhooxiYsFhZpWepNaN9W1W9Z3OWnM/XX+TVWjgPu/CVBHkFspF9\n" +
			"n6rAw2WEj2Ks2OrOVPpiPsndM9gMTcEiHp4XkU8CgYAZ3aouaDFOLrT+4oWYuJm6\n" +
			"xdcNNmRTdeHle1Ud6w07ixu0VpnBPZUgDgv3LzA56aiBQYIGMoBUhqCvGc2PrcdV\n" +
			"GBsLTvvk9wXxNr/LMF3wh56GQ9ddsvTB4tgOiC1R3eEAgA1pq0t2G6K4KlFS//UN\n" +
			"VnKZUSZ2qrBb+znMx8eqUwKBgQCwpZoIxhvlaZm4ntqLHVePK0WBY9UZIz18LerZ\n" +
			"GXQgHdXK+n6eE+cQLm5AzMXiCA0uoEnpGDz3fVh2UPqcLNQTZ9eWOxaqbndoAbaS\n" +
			"GhJwCMAz5iFx/IucNH+DunZ58KuDQU2v9YZDt3LOp0LGZ+hfR4DnLQjzDHcPwgDj\n" +
			"8BeCwwKBgH7gc7llZVrwUgQtjtreCwYYS9iZJAbSOyWr0Cp6aIv6IhiprQKZaD4X\n" +
			"C2C3KLfUvS+psNYFYGT96EXfGNtuZlhX+dz6MRWGbaqV2f8/YLkeKh3u3OUkQncF\n" +
			"iJTufApIAejRyKZPwknSn21arbvAOwkIoZ8m5TGxaZGQH8yIPkqs\n" +
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp8EapNEPC08K7O57yrTz\n" +
			"V1ksPHtXe3XnxwuR3SxpHznts1cPJNrVdX0h8TF2ptXbgSX8+Tb2FJL+14D5XJhv\n" +
			"acG/yj6I8iDt/hBNPYHq7jKQRH2+3u+/e9oW82gJyxDzKjIOCbHUX0w88PHr1nj6\n" +
			"h85ZNCvRqD5mVuAsHIX73pyZv9a4AhMf7EUNeyWyuTk6hJlbqX8pIc0LhFp4/FLa\n" +
			"GW5ZdKkB4L21sulWN34stA6QvxwiJTJb0XOWQG2z2z5iI0eO2CUKjKOuPyVWMGO4\n" +
			"V+2CgYw7K9Rk/1sHt+EbHQmncmc6E0y3UyWffT6e6NDBxRX7YWtLJ9e+s+BTuFJ3\n" +
			"oQIDAQAB\n" +
			"-----END PUBLIC KEY-----";

}
