/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-06-20 08:27:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.adminProduct;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminProductInput_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1618967872751L));
    _jspx_dependants.put("jar:file:/D:/project/Kim/FinalWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/z_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f0_reused = false;
      try {
        _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f0.setParent(null);
        // /WEB-INF/views/adminProduct/adminProductInput.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setVar("contextPath");
        // /WEB-INF/views/adminProduct/adminProductInput.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
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
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<!-- 글 입력 창 -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- include summernote css/js -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.wrap{width: 1200px;height: 800px; margin: -490px 0 0 140px;}\r\n");
      out.write("\t.t{width: 1500px; height: 1000px;  margin: auto;}\r\n");
      out.write("\t.subTitle{margin-left: 450px; font-size: 40px;}\r\n");
      out.write("\t.iTitle{margin: 20px 0 0 100px; height: 20px; }\r\n");
      out.write("\t/* .#ProName{margin: 100px 0 0 500px} */\r\n");
      out.write("\r\n");
      out.write("\t.inpuptTile{width: 400px;}\r\n");
      out.write("\t.t{width: 1500px; height: 1000px;  margin: auto; }\r\n");
      out.write("\t.category1{margin: 20px 0 0 100px; border: 1px solid black;}\r\n");
      out.write("\t.category2{margin: 40px 0 0 100px; border: 1px solid black;}\r\n");
      out.write("\t\r\n");
      out.write("\t.thumbnail{width:150px; height:200px; margin: -300px 0 0 900px; }\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t.summernote1{width: 1000px; margin: 60px 0 0 100px; }\r\n");
      out.write("\t\r\n");
      out.write("\t.file{margin: 0 0 0 100px;}\r\n");
      out.write("\t\r\n");
      out.write("\t.button{margin: 10px 0 0 900px;}\r\n");
      out.write("\t#ok{font-size: 16px;}\r\n");
      out.write("\t#cancel{font-size: 16px;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//summernoet\r\n");
      out.write("\t$(document).ready(function() { /* 이거 없으면 summernote 없어짐 */\r\n");
      out.write("\t  $('#summernote').summernote();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// 취소버튼\r\n");
      out.write("\tfunction removeCheck() {\r\n");
      out.write("\t\t if (confirm(\"등록 취소하시겠습니까?\") == true){    //확인\r\n");
      out.write("\t\t\t location.href='adminProductList'\r\n");
      out.write("\t\t }else{   //취소\r\n");
      out.write("\t\t     return false;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t//사진 업로드\r\n");
      out.write("\tfunction readURL(input) {\r\n");
      out.write("\t\tvar file = input.files[0] // 파일에 대한 정보를 가지고 잇음\r\n");
      out.write("\t\tif(file !=''){\r\n");
      out.write("\t\t\tvar reader = new FileReader() //첨부 사진 파일 읽기 위해\r\n");
      out.write("\t\t\treader.readAsDataURL(file) //파일의 정보를 토대로 파일을 읽고\r\n");
      out.write("\t\t\treader.onload = function(e) { //파일 로드한 값을 표현\r\n");
      out.write("\t\t\t\t//e : 이벤트 안에 result값이 파일의 정보를 가지고 있다\r\n");
      out.write("\t\t\t\t$(\"#preview\").attr('src', e.target.result)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction readURL2(input) {\r\n");
      out.write("\t\tvar file = input.files[0] // 파일에 대한 정보를 가지고 잇음\r\n");
      out.write("\t\tif(file !=''){\r\n");
      out.write("\t\t\tvar reader = new FileReader() //첨부 사진 파일 읽기 위해\r\n");
      out.write("\t\t\treader.readAsDataURL(file) //파일의 정보를 토대로 파일을 읽고\r\n");
      out.write("\t\t\treader.onload = function(e) { //파일 로드한 값을 표현\r\n");
      out.write("\t\t\t\t//e : 이벤트 안에 result값이 파일의 정보를 가지고 있다\r\n");
      out.write("\t\t\t\t$(\"#preview2\").attr('src', e.target.result)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction productSave() {\r\n");
      out.write("\t\tlocation.href='productSave'\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"t\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../adminCategory/category.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("\t<h1 class=\"subTitle\" >상품등록</h1><!--                                             입력값 전달 -->\r\n");
      out.write("\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/adminProduct/productSave\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<div class=\"iTitle\">\r\n");
      out.write("\t\t\t글제목<br>\r\n");
      out.write("\t\t\t<input type=\"text\" name=productTitle class=\"inpuptTile\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"ProName\" style=\"margin: 50px 0 0 100px;\">\r\n");
      out.write("\t\t\t상품명<br>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"productName\" class=\"inpuptTile\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<select name=\"productCategory\" class=\"category1\">\r\n");
      out.write("\t\t\t\t<option value=\"0\">카테고리\r\n");
      out.write("\t\t\t\t<option value=\"휴대폰\">휴대폰\r\n");
      out.write("\t\t\t\t<option value=\"스마트워치\">스마트 워치\r\n");
      out.write("\t\t\t\t<option value=\"블루투스 이어폰\">블루투스 이어폰\r\n");
      out.write("\t\t\t\t<option value=\"태블릿PC\">태블릿PC\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<select name=\"productCompany\" class=\"category2\">\r\n");
      out.write("\t\t\t\t<option value=\"0\">제조사\r\n");
      out.write("\t\t\t\t<option value=\"삼성\">삼성\r\n");
      out.write("\t\t\t\t<option value=\"LG\">LG\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 10px 0 0 100px;\">\r\n");
      out.write("\t\t\t상품코드<br>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"productNum\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 30px 0 0 100px;\">\r\n");
      out.write("\t\t\t상품가격<br>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"productPee\">원\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 10px 0 0 100px; height: 100px;\">\r\n");
      out.write("\t\t\t상품수량<br>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"productQuantity\">개\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"thumbnail\" >\r\n");
      out.write("\t\t\t<img alt=\"선택된 이미지 없음\" src=\"D:\\photo\" id=\"preview\" style=\"width:150px; height:200px;\">\r\n");
      out.write("\t\t\t<input type=\"file\" name=\"productThumbnail\" onchange=\"readURL(this);\">\r\n");
      out.write("\t\t\t<!-- src에 사진 저장할 경로(정하고) 입력 저장방법 알아보기-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"summernote1\">\r\n");
      out.write("\t\t\t<textarea rows=\"5\" cols=\"5\" id=\"summernote\" name=\"productContent\" placeholder=\"내용작성\"></textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- <div class=\"file\">\t\t\r\n");
      out.write("\t\t\t<input type=\"file\" name=\"product_photo1\" onchange=\"readURL2(this);\">\r\n");
      out.write("\t\t</div> -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"button\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"등록\" class=\"btn btn-outline-primary\" id=\"ok\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-outline-primary\" id=\"cancel\" onclick=\"removeCheck()\">취소</button>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JS-->\r\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Core theme JS-->\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}
