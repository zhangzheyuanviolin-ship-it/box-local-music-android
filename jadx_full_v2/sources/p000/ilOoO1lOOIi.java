            package p000;
            
            public abstract class ilOoO1lOOIi {
                public static final String[] I00000oIO = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
                public static final ilio1IO1 I00000oOI;

                static {
                    ilio1IO1 ilio1io1;
/* 11 */            int i = 0;
                    while (true) {
/* 13 */                if (i >= 2) {
/* 49 */                    ilio1io1 = new ilio1IO1();
                            break;
                        }
/* 19 */                ilio1io1 = null;
                        try {
/* 38 */                    ilio1io1 = (ilio1IO1) Class.forName(I00000oIO[i]).asSubclass(ilio1IO1.class).getDeclaredConstructor(null).newInstance(null);
                        } catch (Throwable unused) {
                        }
/* 41 */                if (ilio1io1 != null) {
                            break;
                        } else {
/* 44 */                    i++;
                        }
                    }
/* 52 */            I00000oOI = ilio1io1;
                }
            }
