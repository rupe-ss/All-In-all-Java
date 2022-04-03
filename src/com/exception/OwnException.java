package com.exception;

public class OwnException extends Throwable {
    OwnException(String str){
        //What happens when you use super keyword here. Meaning throwable should have constructor what takes String parameter.
        //Even we don't mention super it will call the default super(), but instead of default we are calling one that takes String as parameter.
        super(str);
    }
}
