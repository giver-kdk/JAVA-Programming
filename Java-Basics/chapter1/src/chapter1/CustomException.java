/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author Nagarjuna 14
 */

public class CustomException extends Exception{
    public CustomException(){}
    public CustomException(String message){
        super(message);
    }
}
