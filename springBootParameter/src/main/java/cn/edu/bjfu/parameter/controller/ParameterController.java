package cn.edu.bjfu.parameter.controller;

import cn.edu.bjfu.parameter.entity.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chaos
 * @date 2021/1/4
 */
@RestController
public class ParameterController {

    /**
     * <p>@PathVariable获取请求路径中占位符的值，可以使用Map获取所有的占位符k-v</p>
     * <p>@RequestHeader获取请求头信息，可以使用Map获取所有请求头信息</p>
     */
    @GetMapping("/car/{id}/owner/{name}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("name") String name,
                                      @PathVariable Map<String, String> car,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String, String> header) {

        Map<String, Object> map = new HashMap<>(16);

        map.put("id", id);
        map.put("name", name);
        map.put("car", car);
        map.put("userAgent", userAgent);
        map.put("head", header);

        return map;
    }

    /**
     * <p>@RequestParam获取请求参数，可以使用Map获取所有参数</p>
     * <p>@CookieValue获取Cookie信息，可以使用Cookie类型获取Cookie所有信息</p>
     */
    @GetMapping("/cat")
    public Map<String, Object> getCat(@RequestParam("age") Integer age,
                                      @RequestParam("inters") List<String> inters,
                                      @RequestParam Map<String, String> cat,
                                      @CookieValue("JSESSIONID") String sessionId,
                                      @CookieValue("JSESSIONID") Cookie cookie) {

        Map<String, Object> map = new HashMap<>(16);

        map.put("age", age);
        map.put("inters", inters);
        map.put("cat", cat);
        map.put("sessionId", sessionId);

        System.out.println(cookie);

        return map;
    }

    /**
     * 获取请求体参数，全部参数为一个字符串
     */
    @PostMapping("/save")
    public Map<String, Object> postParam(@RequestBody String content) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("content", content);
        return map;
    }

    //@RequestAttribute 获取request域属性

    /**
     * <p>@MatrixVariable 获取矩阵变量值</p>
     * <p>语法:/cars/sell;low=20;brand=byd,audi</p>
     * <p>SpringBoot默认禁用矩阵变量功能</p>
     */
    @GetMapping("/cars/{path}")
    public Map<String, Object> carsSell(@MatrixVariable Integer low,
                                        @MatrixVariable List<String> brand,
                                        @PathVariable String path) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("low", low);
        map.put("brand", brand);
        System.out.println(path);
        return map;
    }


    @PostMapping("/person")
    public String person(Person person) {
        if (1) {

        }
        return person.toString();
    }
}
