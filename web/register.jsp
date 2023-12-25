<%-- 
    Document   : register.jsp
    Created on : Nov 6, 2023, 6:25:33 PM
    Author     : Bichitra Sinha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register page</title>
    </head>
    <body>
        <h2 style="color: graytext">please fill the give below options</h2>
        
        <form method="post" action="reg">
            Name    :  <input type="text" name="name1"><br><br>
            Email   :  <input type="email" name="email1"><br><br>
            Password:  <input type="password" name="password1"><br><br>
            Gender  :  <input type="radio" name="gender" value="male"> Male <input type="radio" name="gender" value="male"> Female <br><br>
            City    : <select>
                            <option>select your city</option>
                            <option value="Agartala">Agartala</option>
                            <option value="Kolkata">Kolkata</option>
                            <option value="Delhi">Delhi</option>
                            <option value="Hyderabad">Hyderabad</option>
                            <option value="Bangalore">Bangalore</option>
                            <option value="Pune">Pune</option>
                            <option value="Mysore">Mysore</option>                                                      
            </select><br><br>
            <input type="submit" value="Register">
        </form>
    </body>
</html>
