/*
 *Author Name :P.Hemanth Sai Teja
 *Date:29-11-2022
 *Created With: IntelliJ IDEA Community Edition
 */

package com.example.wave34.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User not found !!! Try again with Correct Credentials")
public class UserNotFoundException extends Exception {
}
