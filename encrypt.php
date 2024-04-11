<?php

$password = "user_password";
$hashedPassword = password_hash($password, PASSWORD_DEFAULT);

// echo $hashedPassword;

if(password_verify($password, $hashedPassword)) {
    echo "Password verified";
} else {
    echo "Bad password";
}



?>