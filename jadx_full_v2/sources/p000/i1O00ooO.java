            package p000;

            import android.os.Build;
            import dalvik.system.VMStack;
            
            public final class i1O00ooO extends i1IioiiO1 {
                public static final Iioi0lilII I00000oOI;

                static {
                    try {
/* 10 */                Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
/* 23 */                i1Ioli1II.class.getName().equals(I00000oIO());
                    } catch (Throwable unused) {
                    }
/* 26 */            String str = Build.FINGERPRINT;
/* 28 */            if (str != null) {
/* 32 */                "robolectric".equals(str);
                    }
/* 42 */            I00000oOI = new Iioi0lilII(18);
                }

                public static String I00000oIO() {
                    try {
/* 5 */                 return VMStack.getStackClass2().getName();
                    } catch (Throwable unused) {
/* 10 */                return null;
                    }
                }
            }
