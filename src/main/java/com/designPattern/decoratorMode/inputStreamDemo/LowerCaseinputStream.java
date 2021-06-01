/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode.inputStreamDemo;

import java.io.*;

/**
 *
 * @author wb-ycj545508
 * @version $Id: LowerCaseinputStream.java, v 0.1 2021年05月20日 16:04 wb-ycj545508 Exp $
 */
public class LowerCaseinputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code> by assigning the  argument <code>in</code> to the field <code>this.in</code> so as to
     * remember
     * it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if this instance is to be created without an underlying stream.
     */
    public LowerCaseinputStream(InputStream in) {
        super(in);
    }

    public int read(byte[] b, int offset, int len ) throws IOException {
        int result = super.read(b, offset, len);
        for(int i = offset; i<len; i++){
            b[i]= (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public int read() throws IOException {
        int i = super.read();
        return i==-1? i: Character.toLowerCase((char)i);
    }
}