package cn.edu.bjfu.securityJwt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

/**
 * @author Chaos
 * @date 2020/12/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtUser implements UserDetails {

    private Long id;
    private String name;
    private String account;
    private String password;

    private Date lastPasswordResetDate;

    private Collection<? extends GrantedAuthority> authorities;

    public JwtUser()
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {


    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
