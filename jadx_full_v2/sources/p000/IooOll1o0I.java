            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IooOll1o0I {
                public static final IooOll1o0I[] I00iOIl;

                static {
/* 17 */            IooOll1o0I[] iooOll1o0IArr = {new IooOll1o0I("COMMON_SUPER_TYPE", 0), new IooOll1o0I("INTERSECTION_TYPE", 1)};
/* 21 */            I00iOIl = iooOll1o0IArr;
/* 23 */            ilIII1o11.I00000oIO(iooOll1o0IArr);
                }

                public static IooOll1o0I valueOf(String str) {
/* 7 */             return (IooOll1o0I) Enum.valueOf(IooOll1o0I.class, str);
                }

                public static IooOll1o0I[] values() {
/* 7 */             return (IooOll1o0I[]) I00iOIl.clone();
                }
            }
