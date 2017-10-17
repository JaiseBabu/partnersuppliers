<%-- 
    Document   : frontpage
    Created on : Jul 28, 2017, 4:33:17 PM
    Author     : C58810
--%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
       <!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Anthem Team</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="assets/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="assets/dist/css/skins/_all-skins.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="login-page">
    <div class="login-box">
      <div class="login-logo">
        <a href="#"><b>Anthem</b></a>
      </div><!-- /.login-logo -->
      <div class="login-box-body">
        <p class="login-box-msg">Login Here</p>
                
        <form id="login" action="loginprocess" method="login">
          <div class="form-group has-feedback">
              <input type="text" class="form-control" placeholder="Username" name="Username" id="Username"/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
              <input type="password" class="form-control" placeholder="Password" name="Password" id="Password"/>
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="row">
            
            <div class="col-xs-4">
              <button type="Submit" name="Submit" class="btn btn-primary btn-block btn-flat">Login</button>
            </div><!-- /.col -->
          </div>
        </form>

        <!-- <a href="forgetPass.jsp">I forgot my password</a><br> -->

      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

    <!-- jQuery 2.1.3 -->
    
    <script>
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
    </script>
  </body>
</html>

====================================================================================================================
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
            <form id="login" action="loginprocess" method="login">
                <table align="center">
                    <tr>
                        <td>
                            Username
                        </td>
                        <td>
                            <input type="text" name="Username" id="Username" />
                        </td>  
                    </tr>
                    <tr>
                        <td>
                            Password
                        </td>
                        <td>
                            <input type="text" name="Password" id="Password" />
                        </td>  
                    </tr>
                    <tr>
                         <td>
                            <button id="Submit" name="Submit">Submit</button>
                        </td>
                    </tr>
                    
                    
                   
                </table>
            </form>
        </body>
        </html>