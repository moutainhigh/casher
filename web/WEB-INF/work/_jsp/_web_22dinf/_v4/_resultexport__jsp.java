/*
 * JSP generated by Resin-4.0.42 (built Tue, 20 Jan 2015 08:45:25 PST)
 */

package _jsp._web_22dinf._v4;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _resultexport__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = new TagState();

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_state.release();
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=utf-8");
    com.caucho.jsp.IteratorLoopSupportTag _jsp_loop_1 = null;
    com.caucho.jstl.el.FormatNumberTag _jsp_FormatNumberTag_2 = null;
    com.caucho.jstl.el.FormatDateTag _jsp_FormatDateTag_3 = null;

    out.write(_jsp_string0, 0, _jsp_string0.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string3, 0, _jsp_string3.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string4, 0, _jsp_string4.length);
    pageContext.requestSetOrRemove("base", "");
    out.write(_jsp_string5, 0, _jsp_string5.length);
    pageContext.sessionSetOrRemove("lang", "i18n/Page");
    out.write(_jsp_string5, 0, _jsp_string5.length);
    pageContext.sessionSetOrRemove("bundle", "i18n/Credit_card");
    out.write(_jsp_string6, 0, _jsp_string6.length);
    _caucho_expr_1.print(out, _jsp_env, false);
    out.write(_jsp_string7, 0, _jsp_string7.length);
    _jsp_loop_1 = _jsp_state.get_jsp_loop_1(pageContext, _jsp_parent_tag);
    java.lang.Object _jsp_items_4 = _caucho_expr_2.evalObject(_jsp_env);
    java.util.Iterator _jsp_iter_4 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_4);
    _jsp_loop_1.init(0, Integer.MAX_VALUE, 1, false, false, false);
    while (_jsp_iter_4.hasNext()) {
      Object _jsp_i_4 = _jsp_iter_4.next();
      _jsp_loop_1.setCurrent(_jsp_i_4, _jsp_iter_4.hasNext());
      pageContext.setAttribute("map", _jsp_i_4);
      out.write(_jsp_string8, 0, _jsp_string8.length);
      _caucho_expr_3.print(out, _jsp_env, false);
      out.write(_jsp_string9, 0, _jsp_string9.length);
      _caucho_expr_4.print(out, _jsp_env, false);
      out.write(_jsp_string10, 0, _jsp_string10.length);
    }
    pageContext.pageSetOrRemove("map", null);
    out.write(_jsp_string11, 0, _jsp_string11.length);
    if (_caucho_expr_5.evalBoolean(_jsp_env)) {
      out.write(_jsp_string12, 0, _jsp_string12.length);
      _jsp_FormatNumberTag_2 = _jsp_state.get_jsp_FormatNumberTag_2(pageContext, _jsp_parent_tag);
      _jsp_FormatNumberTag_2.setValue(_caucho_expr_6);
      _jsp_FormatNumberTag_2.doEndTag();
      out.write(_jsp_string13, 0, _jsp_string13.length);
    }
    out.write(_jsp_string13, 0, _jsp_string13.length);
    if (_caucho_expr_7.evalBoolean(_jsp_env)) {
      out.write(_jsp_string13, 0, _jsp_string13.length);
      _jsp_FormatNumberTag_2 = _jsp_state.get_jsp_FormatNumberTag_2(pageContext, _jsp_parent_tag);
      _jsp_FormatNumberTag_2.setValue(_caucho_expr_8);
      _jsp_FormatNumberTag_2.doEndTag();
      out.write(_jsp_string13, 0, _jsp_string13.length);
    }
    out.write(_jsp_string14, 0, _jsp_string14.length);
    if (_caucho_expr_9.evalBoolean(_jsp_env)) {
      out.write(_jsp_string15, 0, _jsp_string15.length);
      _caucho_expr_10.print(out, _jsp_env, false);
      out.write(_jsp_string16, 0, _jsp_string16.length);
    }
    out.write(_jsp_string17, 0, _jsp_string17.length);
    if (_caucho_expr_11.evalBoolean(_jsp_env)) {
      out.write(_jsp_string18, 0, _jsp_string18.length);
      _caucho_expr_12.print(out, _jsp_env, false);
      out.write(_jsp_string19, 0, _jsp_string19.length);
    }
    out.write(_jsp_string20, 0, _jsp_string20.length);
    if (_caucho_expr_13.evalBoolean(_jsp_env)) {
      out.write(_jsp_string21, 0, _jsp_string21.length);
    }
    out.write(_jsp_string22, 0, _jsp_string22.length);
    if (_caucho_expr_13.evalBoolean(_jsp_env)) {
      out.write(_jsp_string23, 0, _jsp_string23.length);
    }
    out.write(_jsp_string24, 0, _jsp_string24.length);
    java.util.Date now;
    now = (java.util.Date) pageContext.getAttribute("now");
    if (now == null) {
      now = new java.util.Date();
      pageContext.setAttribute("now", now);
    }
    out.write(_jsp_string25, 0, _jsp_string25.length);
    _jsp_FormatDateTag_3 = _jsp_state.get_jsp_FormatDateTag_3(pageContext, _jsp_parent_tag);
    _jsp_FormatDateTag_3.setValue(_caucho_expr_14);
    _jsp_FormatDateTag_3.doEndTag();
    out.write(_jsp_string26, 0, _jsp_string26.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != 7031370602740370491L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/v4/resultExport.jsp"), -1088892477329970952L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/style.jsp"), -8516269833883808472L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/tags.jsp"), -3608291857756734149L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/head.jsp"), 897729539195959627L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/tail.jsp"), 5980026621458825039L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(mergePath.lookup("jar:file:/e:/Program%20Files/resin-4.0.42/resin-4.0.42/lib/resin.jar!/com/caucho/jstl/fmt-el.tld"), -449626256852172091L, false);
    _caucho_depends.add(depend);
    _caucho_depends.add(new com.caucho.make.ClassDependency("com.caucho.jstl.el.FormatNumberTag", -6030755003306909354L));
    _caucho_depends.add(new com.caucho.make.ClassDependency("com.caucho.jstl.el.FormatDateTag", 5899277161707882428L));
  }

  static {
    try {
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  final static class TagState {
    private com.caucho.jsp.IteratorLoopSupportTag _jsp_loop_1;

    final com.caucho.jsp.IteratorLoopSupportTag get_jsp_loop_1(PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jsp_parent_tag) throws Throwable
    {
      if (_jsp_loop_1 == null) {
        _jsp_loop_1 = new com.caucho.jsp.IteratorLoopSupportTag();
        _jsp_loop_1.setParent((javax.servlet.jsp.tagext.Tag) null);
      }

      return _jsp_loop_1;
    }
    private com.caucho.jstl.el.FormatNumberTag _jsp_FormatNumberTag_2;

    final com.caucho.jstl.el.FormatNumberTag get_jsp_FormatNumberTag_2(PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jsp_parent_tag) throws Throwable
    {
      if (_jsp_FormatNumberTag_2 == null) {
        _jsp_FormatNumberTag_2 = new com.caucho.jstl.el.FormatNumberTag();
        _jsp_FormatNumberTag_2.setPageContext(pageContext);
        if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.Tag)
          _jsp_FormatNumberTag_2.setParent((javax.servlet.jsp.tagext.Tag) _jsp_parent_tag);
        else if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.SimpleTag)
          _jsp_FormatNumberTag_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jsp_parent_tag));
        else
          _jsp_FormatNumberTag_2.setParent((javax.servlet.jsp.tagext.Tag) null);
        _jsp_FormatNumberTag_2.setPattern(_caucho_expr_15);
      }

      return _jsp_FormatNumberTag_2;
    }
    private com.caucho.jstl.el.FormatDateTag _jsp_FormatDateTag_3;

    final com.caucho.jstl.el.FormatDateTag get_jsp_FormatDateTag_3(PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jsp_parent_tag) throws Throwable
    {
      if (_jsp_FormatDateTag_3 == null) {
        _jsp_FormatDateTag_3 = new com.caucho.jstl.el.FormatDateTag();
        _jsp_FormatDateTag_3.setPageContext(pageContext);
        if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.Tag)
          _jsp_FormatDateTag_3.setParent((javax.servlet.jsp.tagext.Tag) _jsp_parent_tag);
        else if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.SimpleTag)
          _jsp_FormatDateTag_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jsp_parent_tag));
        else
          _jsp_FormatDateTag_3.setParent((javax.servlet.jsp.tagext.Tag) null);
        _jsp_FormatDateTag_3.setType(_caucho_expr_16);
      }

      return _jsp_FormatDateTag_3;
    }

    void release()
    {
      if (_jsp_FormatNumberTag_2 != null) {
        _jsp_FormatNumberTag_2.release();
        _jsp_FormatNumberTag_2 = null;
      }
      if (_jsp_FormatDateTag_3 != null) {
        _jsp_FormatDateTag_3.release();
        _jsp_FormatDateTag_3 = null;
      }
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      manager.addTaglibFunctions(_jsp_functionMap, "spring", "http://www.springframework.org/tags");
      manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jstl/core");
      manager.addTaglibFunctions(_jsp_functionMap, "fmt", "http://java.sun.com/jstl/fmt");
      manager.addTaglibFunctions(_jsp_functionMap, "fn", "http://java.sun.com/jsp/jstl/functions");
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
      _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${base}");
      _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.action}");
      _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.forms}");
      _caucho_expr_3 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${map.key}");
      _caucho_expr_4 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${map.value}");
      _caucho_expr_5 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.result.order!=null}");
      _caucho_expr_6 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.result.order.amount/100.00}");
      _caucho_expr_7 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.result.order==null}");
      _caucho_expr_8 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.result.trx.amount/100.00}");
      _caucho_expr_9 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${!(res.result.order==null||res.result.order.ordernum==null)}");
      _caucho_expr_10 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.result.order.ordernum}");
      _caucho_expr_11 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${!(res.result.trx==null||res.result.trx.trxnum==null)}");
      _caucho_expr_12 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.result.trx.trxnum}");
      _caucho_expr_13 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${res.action!='#'}");
      _caucho_expr_14 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${now}");
      _caucho_expr_15 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "0.00");
      _caucho_expr_16 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "both");
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;
  private static com.caucho.el.Expr _caucho_expr_3;
  private static com.caucho.el.Expr _caucho_expr_4;
  private static com.caucho.el.Expr _caucho_expr_5;
  private static com.caucho.el.Expr _caucho_expr_6;
  private static com.caucho.el.Expr _caucho_expr_7;
  private static com.caucho.el.Expr _caucho_expr_8;
  private static com.caucho.el.Expr _caucho_expr_9;
  private static com.caucho.el.Expr _caucho_expr_10;
  private static com.caucho.el.Expr _caucho_expr_11;
  private static com.caucho.el.Expr _caucho_expr_12;
  private static com.caucho.el.Expr _caucho_expr_13;
  private static com.caucho.el.Expr _caucho_expr_14;
  private static com.caucho.el.Expr _caucho_expr_15;
  private static com.caucho.el.Expr _caucho_expr_16;

  private final static char []_jsp_string15;
  private final static char []_jsp_string13;
  private final static char []_jsp_string20;
  private final static char []_jsp_string7;
  private final static char []_jsp_string10;
  private final static char []_jsp_string18;
  private final static char []_jsp_string17;
  private final static char []_jsp_string24;
  private final static char []_jsp_string14;
  private final static char []_jsp_string1;
  private final static char []_jsp_string9;
  private final static char []_jsp_string22;
  private final static char []_jsp_string23;
  private final static char []_jsp_string6;
  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string21;
  private final static char []_jsp_string25;
  private final static char []_jsp_string2;
  private final static char []_jsp_string11;
  private final static char []_jsp_string26;
  private final static char []_jsp_string16;
  private final static char []_jsp_string5;
  private final static char []_jsp_string12;
  private final static char []_jsp_string8;
  private final static char []_jsp_string0;
  private final static char []_jsp_string19;
  static {
    _jsp_string15 = "\r\n                                       \u5546\u5bb6\u8ba2\u5355\u53f7\uff1a".toCharArray();
    _jsp_string13 = "\r\n            ".toCharArray();
    _jsp_string20 = "</div>\r\n			   ".toCharArray();
    _jsp_string7 = "\" method=\"post\">\r\n      ".toCharArray();
    _jsp_string10 = "\"/>\r\n      ".toCharArray();
    _jsp_string18 = "\r\n			            \u94f6\u884c\u4ea4\u6613\u53f7\uff1a".toCharArray();
    _jsp_string17 = "  \r\n                </div>\r\n                <div class=\"resultItem\">    	     ".toCharArray();
    _jsp_string24 = "\r\n			      -->\r\n			    </script> \r\n	      \r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>\r\n		\r\n		\r\n       \r\n\r\n\r\n<!--<div class=\"foot\">\u5173\u4e8e\u5409\u5361   | \u7ecf\u9500\u5546\u4f53\u7cfb | \u4f53\u9a8c\u8ba1\u5212 | \u5b98\u65b9\u535a\u5ba2 | \u8bda\u5f81\u82f1\u624d | \u8054\u7cfb\u6211\u4eec | International Business | About\u5409\u5361<br />-->\r\n<!--          <br />-->\r\n<!--        \u5409\u5361\u7248\u6743\u6240\u6709 ICP\u8bc1\uff1a\u4eacICP\u590713002947\u53f7</div>-->\r\n<!-- </div>-->\r\n<!--".toCharArray();
    _jsp_string14 = " \u5143</div>\r\n             <div class=\"resultItem\">\r\n                   ".toCharArray();
    _jsp_string1 = "/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<link href=\"".toCharArray();
    _jsp_string9 = "\" value=\"".toCharArray();
    _jsp_string22 = "   \r\n	     	 \r\n	     	 <script language=\"javascript\">\r\n			      <!--\r\n			      //document.all.msg.innerText=5;\r\n			      ".toCharArray();
    _jsp_string23 = "\r\n			      	document.getElementById(\"msg\").innerText=5;\r\n			        var i=5;\r\n			        window.status=i+\"\u79d2\u81ea\u52a8\u8df3\u8f6c,\u7a0d\u540e...\";	    \r\n				    function clock(){\r\n					   //document.all.msg.innerText=i;\r\n				    	document.getElementById(\"msg\").innerText=i;\r\n				       i=i-1;\r\n				       if(i>0) setTimeout( \"clock(); \",1000);\r\n				       else document.forms[\"frmToMerchant\"].submit();\r\n				    }\r\n				    clock();\r\n			       //setTimeout('document.forms[\"frmToMerchant\"].submit();',5000);\r\n			      ".toCharArray();
    _jsp_string6 = "\r\n<style type=\"text/css\">\r\nbody{background:#eeeeee}\r\n</style>\r\n<body>\r\n	\r\n		\r\n<div class=\"PAY_InHeader\">\r\n    <div class=\"topBarArea\">\r\n        <div class=\"topBar\"><a target=\"_blank\" href=\"http://www.gigold.com\">\u5409\u9ad8\u9996\u9875</a></div>\r\n    </div>\r\n    <div class=\"contentArea\">\r\n    	<div style=\"float: left;padding:10px\"><SCRIPT LANGUAGE=\"JavaScript\" TYPE=\"text/javascript\" SRC=\"https://seal.wosign.com/tws.js\"></SCRIPT></div>\r\n        <div class=\"logo\"></div>\r\n    </div>\r\n</div>\r\n	\r\n	    <Form name=frmToMerchant Action=\"".toCharArray();
    _jsp_string4 = "/css/payFor.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n\r\n<style type=\"text/css\">\r\n\r\n.table_ui thead th {\r\ncolor: #333;\r\npadding: 8px 10px;\r\nfont-size: 12px;\r\ntext-align: center;\r\nbackground: #f5f5f5;\r\nfont-weight: normal;\r\nborder: 1px solid #DBDBDB;\r\n}\r\n\r\n.table_ui  th {\r\ncolor: #333;\r\npadding: 8px 10px;\r\nfont-size: 12px;\r\ntext-align: center;\r\nbackground: #f5f5f5;\r\nfont-weight: normal;\r\nborder: 1px solid #DBDBDB;\r\n}\r\n\r\n.table_ui {\r\nborder-collapse: collapse;\r\nborder: 1px solid #DBDBDB;\r\nfont-family: Arial, Helvetica, sans-serif;\r\n}\r\n\r\n.table_ui td {\r\ntext-align: center;\r\npadding: 4px 10px;\r\nborder: 1px solid #DBDBDB;\r\nfont-size: 12px;\r\nline-height: 26px;\r\n}\r\n\r\n</style>\r\n\r\n<script language=\"javascript\" src=\"/js/jquery-1.7.js\"></script>\r\n<script language=\"javascript\" src=\"/js/jqstyle.js\"></script>\r\n</head>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string3 = "/css/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<link href=\"".toCharArray();
    _jsp_string21 = "\r\n                <div class=\"resultItem\"><button id=\"button\" value=\"\u8fd4\u56de\u5546\u6237\u7f51\u7ad9\" onclick=\"javascript:document.frmToMerchant.submit();\">\u8fd4\u56de\u5546\u6237\u7f51\u7ad9</button></div>\r\n                <div class=\"resultItem\">\u672c\u6b21\u4ea4\u6613<span id=\"msg\" class=\"red\"></span>\u79d2\u540e\u81ea\u52a8\u8df3\u8f6c\uff0c\u5982\u4e0d\u80fd\u81ea\u52a8\u8fd4\u56de\uff0c\u8bf7\u70b9\u51fb\u8fd9\u91cc\u8fdb\u884c\u8df3\u8f6c</div>\r\n	     	 ".toCharArray();
    _jsp_string25 = "-->\r\n<!-- ".toCharArray();
    _jsp_string2 = "/css/cash.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n\r\n<link href=\"".toCharArray();
    _jsp_string11 = "\r\n    </form>\r\n		\r\n<div class=\"InContent\">\r\n	<div class=\"boxContent\">\r\n\r\n        <div class=\"sucessContent\">\r\n            <div class=\"dialogTipsArea\">\r\n                <span class=\"TipIco_sucess\"></span>\r\n                <span class=\"TipText\">\u652f\u4ed8\u6210\u529f\uff01 <br><span>\u611f\u8c22\u4f7f\u7528\u5409\u9ad8\uff0c\u60a8\u6709\u4efb\u4f55\u95ee\u9898\u6216\u5efa\u8bae\u53ef\u4ee5\u53d1\u9001\u90ae\u4ef6\u81f3service@gigold.net</span></span>\r\n                <div style=\"clear:both\"></div>\r\n            </div>\r\n\r\n            <div class=\"sucessResult\">\r\n                <div class=\"resultItem\">\u672c\u6b21\u4ea4\u6613\u91d1\u989d\uff1a\r\n             ".toCharArray();
    _jsp_string26 = "  -->\r\n    <div class=\"copyright\">\r\n    	<div class=\"adress\">Copyright @ since 2014 All Rights Reserved \u7248\u6743\u6240\u6709 \u4fb5\u6743\u5fc5\u7a76 \u5929\u6d25\u5409\u9ad8\u5728\u7ebf\u652f\u4ed8\u6280\u672f\u6709\u9650\u516c\u53f8<br /> \r\n\u6d25ICP\u590713003754\u53f7-1</div>\r\n        <div class=\"bottomMenu\"><a href=\"#\">\u5173\u4e8e\u6211\u4eec</a> | <a href=\"#\">\u5546\u52a1\u5408\u4f5c</a> | <a href=\"#\">\u8054\u7cfb\u6211\u4eec</a> | <a href=\"#\">\u5b89\u5168\u8054\u76df</a></div>\r\n    </div>\r\n    <div class=\"clearFloat\"></div>\r\n\r\n\r\n\r\n       \r\n  \r\n  </body>\r\n\r\n</html>\r\n".toCharArray();
    _jsp_string16 = "\r\n                ".toCharArray();
    _jsp_string5 = "\r\n".toCharArray();
    _jsp_string12 = "\r\n             ".toCharArray();
    _jsp_string8 = "\r\n        <input type=\"hidden\" name=\"".toCharArray();
    _jsp_string0 = "\r\n\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n<title></title> \r\n<link href=\"".toCharArray();
    _jsp_string19 = "<br/>\r\n			   ".toCharArray();
  }
}