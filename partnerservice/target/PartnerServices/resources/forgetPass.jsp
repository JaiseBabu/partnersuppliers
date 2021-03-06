<%-- 
    Document   : forgetPass
    Created on : Aug 17, 2017, 9:58:26 AM
    Author     : c58810
--%>
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
        <form action="forgetPAction.jsp" method="post">
          <div class="form-group has-feedback">
              <input type="text" class="form-control" placeholder="Employee Id" name="username" required/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
         <div class="form-group has-feedback">
              <select name="role" required>
                          <option value="">Select Role</option>
                         <option value="Admin">Admin</option>
                         <option value="Lead">TeamLead</option>
                         <option value="Member">Team Member</option>
              </select>
          </div>
          <div class="row">
            
            <div class="col-xs-4">
              <button type="submit" name="submit" class="btn btn-primary btn-block btn-flat">Proceed</button>
            </div><!-- /.col -->
          </div>
        </form>

        

      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

    <!-- jQuery 2.1.3 -->
    
  </body>
</html>

