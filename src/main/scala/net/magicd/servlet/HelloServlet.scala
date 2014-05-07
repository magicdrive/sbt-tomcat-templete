package net.magicd.servlet

import javax.servlet.http.{
  HttpServlet,
  HttpServletRequest  => HSReq,
  HttpServletResponse => HSResp
}

class HelloScalaServlet extends HttpServlet {

  override def doGet(req :HSReq, resp :HSResp) {
    val message =
    <html>
    Hello, Scala with Servlet
    </html>

    resp.getWriter().print(message + "\n")
  }
}


