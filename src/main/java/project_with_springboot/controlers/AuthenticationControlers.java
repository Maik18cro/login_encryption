package project_with_springboot.controlers;

import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.*;
import project_with_springboot.model.responses.Response;
import project_with_springboot.model.responses.ResponseAuthentication;

import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;




@RestController
public class AuthenticationControlers {
  final String userName = "bWFpaWtvbGxsbGw=";
  final String userPassword = "anNvZGlqMjAzOTA1MDEzOTUxdnNkamdva3Nudm8jIw==";


  public static final int expirationTime = 5;
  public static final String keyServer = "siiiuu1234567890 123456789012 3456789012";


  @PostMapping("/register")
  @ResponseBody
  public String Authentication(@RequestParam String user, @RequestParam String pass) throws UnsupportedEncodingException {

    HashMap<String, Object> claims = new HashMap<>();
    claims.put("name", user);
    claims.put("password", pass);
    Date expirationDate = new Date(System.currentTimeMillis() + expirationTime * 60 * 60 * 10);


    String jwt = Jwts.builder()
            .header()
            .type("JWT")
            .and()
            .setSubject(user)
            .expiration(expirationDate)
            .claims(claims)
            .signWith(key(), Jwts.SIG.HS256)
            .compact();
    String encoded = Base64.getEncoder().encodeToString(jwt.getBytes(StandardCharsets.UTF_8));
    String nameEncoded = Base64.getEncoder().encodeToString(user.getBytes(StandardCharsets.UTF_8));
    String passEncoded = Base64.getEncoder().encodeToString(pass.getBytes(StandardCharsets.UTF_8));
    return  "json web token encrypted x64 : " + encoded
            + "\n" + "json web token : " + jwt
            + "\n" + "user name encrypted written by the user : " + nameEncoded
            + "\n" + "user name encrypted of on application : " + userName
            + "\n" + "password encrypted written by the user : " + passEncoded
            + "\n" +"user name encrypted of on application : " + userPassword
            + "\n" + "response of the authentication on the application : "
            + "\n" + verification(passEncoded, nameEncoded).getStatus()
            + "\n" + verification(passEncoded, nameEncoded).getStatusCode()
            + "\n" + verification(passEncoded, nameEncoded).getMessage()
            + "FormsAuthentication";
  }

  public SecretKey key() {
    return Keys.hmacShaKeyFor(keyServer.getBytes());
  }

  public Response verification(String passEncoded, String nameEncoded) {
    {
      System.out.printf(passEncoded + "\n");
      //    System.out.printf(userPassword);
      if (passEncoded.equals(userPassword) && userName.equals(nameEncoded)) {
        return new ResponseAuthentication("success",
                200,
                "User authenticated successfully");
      } else {
        return new ResponseAuthentication("error",
                401,
                "User not authenticated");
      }
    }
  }
}

