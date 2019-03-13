<?php
        include('connection.php');

        if(isset($_POST['register']))
        {
            $count=0;
            $name=$_POST["getName"];
            $pass=$_POST["getPass"];
            $querry="INSERT into user values('$name','$pass')";
            $data=mysqli_query($connect,"SELECT * from user where username='$name' or password=$pass");

            if(mysqli_num_rows($data)==0){
                mysqli_query($connect,$querry); 
                echo "Registered Succesfully";
            }
            else{
                echo "Already Exist";
            }
        } 
        if(isset($_POST['login']))
        {
            $name=$_POST["getName"];
            $pass=$_POST["getPass"];
            $querry=mysqli_query($connect,"SELECT * from user where username='$name' and password=$pass");
            $data=mysqli_query($connect,"SELECT * from user");
            //echo "<table><th>username</th><th> passwords</th>";
               if(mysqli_num_rows($querry)>0){
                    while($display=mysqli_fetch_assoc($data)){
                 echo "<table><td>".$display["username"]."</td> <td>".$display["password"]."</td></table>";
                }
               }
                    else{
                    echo "  Not exist in the database";
                }
            
        }     
        mysqli_close($connect);

?>