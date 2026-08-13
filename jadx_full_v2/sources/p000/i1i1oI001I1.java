            package p000;
            
            public abstract class i1i1oI001I1 {
                public static final String[] I00000oIO = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
                public static final i1iIOoIiooo I00000oOI;

                static {
                    i1iIOoIiooo i1iiooiiooo;
/* 11 */            int i = 0;
                    while (true) {
/* 13 */                if (i >= 2) {
/* 49 */                    i1iiooiiooo = new i1iIOoIiooo();
                            break;
                        }
/* 19 */                i1iiooiiooo = null;
                        try {
/* 38 */                    i1iiooiiooo = (i1iIOoIiooo) Class.forName(I00000oIO[i]).asSubclass(i1iIOoIiooo.class).getDeclaredConstructor(null).newInstance(null);
                        } catch (Throwable unused) {
                        }
/* 41 */                if (i1iiooiiooo != null) {
                            break;
                        } else {
/* 44 */                    i++;
                        }
                    }
/* 52 */            I00000oOI = i1iiooiiooo;
                }
            }
