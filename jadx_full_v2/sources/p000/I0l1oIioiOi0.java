            package p000;
            
            public abstract class I0l1oIioiOi0 {
                public static final Class I00000oIO;
                public static final boolean I00000oOI;

                static {
                    Class<?> cls;
/* 3 */             Class<?> cls2 = null;
                    try {
/* 4 */                 cls = Class.forName("libcore.io.Memory");
                    } catch (Throwable unused) {
/* 9 */                 cls = null;
                    }
/* 10 */            I00000oIO = cls;
                    try {
/* 14 */                cls2 = Class.forName("org.robolectric.Robolectric");
                    } catch (Throwable unused2) {
                    }
/* 23 */            I00000oOI = cls2 != null;
                }

                public static boolean I00000oIO() {
                    return (I00000oIO == null || I00000oOI) ? false : true;
                }
            }
