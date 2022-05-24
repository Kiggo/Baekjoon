package servlet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EncoderFilter implements Filter {
	ServletContext context;
    public EncoderFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("utf-8 인코딩......");
		request.setCharacterEncoding("utf-8");
		
		String context=((HttpServletRequest)request).getContextPath();
		String pathInfo=((HttpServletRequest)request).getRequestURI();
		@SuppressWarnings("deprecation")
		String realPath=request.getRealPath(pathInfo);
		String msg="Context 정보 : "+context
								+"\n URI 정보 :"+pathInfo
								+"\n물리적 경로 :"+realPath;
		System.out.println(msg);
		chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
