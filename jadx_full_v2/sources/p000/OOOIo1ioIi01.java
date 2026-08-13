            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.AccessControlException;
            import java.security.AccessController;
            import java.util.Map;
            
            public abstract class OOOIo1ioIi01 {
                public static final ThreadLocal I00000oIO = new ThreadLocal();

                public static String I00000oIO(String str) {
                    String str2;
/* 4 */             OOOIo1Oi oOOIo1Oi = new OOOIo1Oi(0);
/* 7 */             oOOIo1Oi.I00000oOI = str;
/* 9 */             VarHandle.storeStoreFence();
/* 16 */            String str3 = (String) AccessController.doPrivileged(oOOIo1Oi);
/* 18 */            if (str3 != null) {
/* 20 */                return str3;
                    }
/* 27 */            Map map = (Map) I00000oIO.get();
/* 29 */            if (map != null && (str2 = (String) map.get(str)) != null) {
/* 39 */                return str2;
                    }
/* 43 */            OOOIo1Oi oOOIo1Oi2 = new OOOIo1Oi(1);
/* 46 */            oOOIo1Oi2.I00000oOI = str;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            return (String) AccessController.doPrivileged(oOOIo1Oi2);
                }

                public static boolean I00000oOI(String str) {
                    try {
/* 2 */                 String strI00000oIO = I00000oIO(str);
/* 6 */                 if (strI00000oIO != null && strI00000oIO.length() == 4 && ((strI00000oIO.charAt(0) == 't' || strI00000oIO.charAt(0) == 'T') && ((strI00000oIO.charAt(1) == 'r' || strI00000oIO.charAt(1) == 'R') && (strI00000oIO.charAt(2) == 'u' || strI00000oIO.charAt(2) == 'U')))) {
/* 73 */                    if (strI00000oIO.charAt(3) != 'e') {
/* 81 */                        if (strI00000oIO.charAt(3) == 'E') {
                                }
                            }
/* 32 */                    return true;
                        }
                    } catch (AccessControlException unused) {
                    }
/* 1 */             return false;
                }
            }
