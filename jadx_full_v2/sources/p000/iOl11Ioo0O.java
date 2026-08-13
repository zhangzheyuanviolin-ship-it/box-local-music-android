            package p000;
            
            public abstract class iOl11Ioo0O {
                public static int I00000oIO(String str) {
/* 1 */             int length = str.length();
/* 6 */             int lowerCase = 0;
/* 7 */             for (int i = 0; i < length; i++) {
/* 19 */                lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
                    }
/* 49 */            return lowerCase;
                }
            }
