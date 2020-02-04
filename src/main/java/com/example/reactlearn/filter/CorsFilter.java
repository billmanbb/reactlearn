package com.example.reactlearn.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class CorsFilter implements Filter {

    final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CorsFilter.class);

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse rep = (HttpServletResponse) response;

        HttpSession session = req.getSession();
        //LOG.info("Origin:{}", req.getHeader("Origin"));

        //设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
        rep.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
        //rep.setHeader("Access-Control-Allow-Origin", "*");
        rep.setHeader("Access-Control-Expose-Headers", "*");
        // 允许的访问方法
        rep.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
        // Access-Control-Max-Age 用于 CORS 相关配置的缓存
        rep.setHeader("Access-Control-Max-Age", "3600");
        rep.setHeader("Access-Control-Allow-Headers", "*");
        //若要返回cookie、携带seesion等信息则将此项设置我true
        rep.setHeader("Access-Control-Allow-Credentials", "true");
        // 把获取的Session返回个前端Cookie
        //rep.addCookie(new Cookie("JSSESIONID", session.getId()));
        chain.doFilter(req, rep);
    }
    public void init(FilterConfig filterConfig) {}
    public void destroy() {}
}
