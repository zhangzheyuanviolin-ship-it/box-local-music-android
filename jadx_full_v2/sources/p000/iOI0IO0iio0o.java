            package p000;
            
            public abstract class iOI0IO0iio0o {
                public static final byte I00000oIO(char c) {
/* 3 */             if (c < '~') {
/* 7 */                 return IO11Iool0.I00000oOI[c];
                    }
/* 10 */            return (byte) 0;
                }

                public static final String I00000oOI(byte b) {
                    return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
                }
            }
