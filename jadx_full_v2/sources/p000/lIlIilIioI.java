            package p000;
            
            public abstract class lIlIilIioI {
                public static final Class I00000oIO(ClassLoader classLoader, String str) {
                    try {
/* 2 */                 return Class.forName(str, false, classLoader);
                    } catch (ClassNotFoundException unused) {
/* 7 */                 return null;
                    }
                }
            }
