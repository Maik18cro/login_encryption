package project_with_springboot.controlers;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;



@RestController
public class AuthenticationControlers {
  final String userName = "bWFpaWtvbGxsbGw=";
  final String userPassword = "anNvZGlqMjAzOTA1MDEzOTUxdnNkamdva3Nudm8jIw==";

  public static final int expirationTime = 5;
  public static final String keyServer = "siiiuu1234567890 123456789012 3456789012"; ;

  @PostMapping("/login")
  @ResponseBody
  public String Authentication(@RequestParam String user, @RequestParam String pass) {


    HashMap<String, Object> claims = new HashMap<>();
    claims.put("name",user );
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
    return jwt;

  }

  public static SecretKey key() {
      return Keys.hmacShaKeyFor(keyServer.getBytes());
    }
}

