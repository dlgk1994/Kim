/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-06-02 02:07:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.default_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/FinalProject/FinalWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Final/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1618967872751L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f0_reused = false;
      try {
        _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f0.setParent(null);
        // /WEB-INF/views/default/main.jsp(4,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setVar("contextPath");
        // /WEB-INF/views/default/main.jsp(4,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setValue(request.getContextPath());
        int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
        if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        _jspx_th_c_005fset_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Favicon-->\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap icons-->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<!-- Section-->\r\n");
      out.write("\t<section class=\"py-5\">\r\n");
      out.write("\t\t<div class=\"container px-4 px-lg-5 mt-5\">\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tclass=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Fancy Product</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t$40.00 - $80.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">View\r\n");
      out.write("\t\t\t\t\t\t\t\t\toptions</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t$18.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Sale Item</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$50.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t$25.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Popular Item</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t$40.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Sale Item</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$50.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t$25.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Fancy Product</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t$120.00 - $280.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">View\r\n");
      out.write("\t\t\t\t\t\t\t\t\toptions</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t$18.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Popular Item</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t\t$40.00\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JS-->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Core theme JS-->\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /WEB-INF/views/default/main.jsp(22,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("header.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f1_reused = false;
    try {
      _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f1.setParent(null);
      // /WEB-INF/views/default/main.jsp(307,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f1.setUrl("footer.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
        if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
      _jspx_th_c_005fimport_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f1_reused);
    }
    return false;
  }
}
