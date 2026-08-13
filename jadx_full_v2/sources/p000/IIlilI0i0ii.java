            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIlilI0i0ii {
                public static final IIlilI0i0ii I00iOIl;
                public static final IIlilI0i0ii[] I00iiI;

                static {
/* 6 */             IIlilI0i0ii iIlilI0i0ii = new IIlilI0i0ii("AT_LEAST", 0);
/* 9 */             I00iOIl = iIlilI0i0ii;
/* 19 */            IIlilI0i0ii[] iIlilI0i0iiArr = {iIlilI0i0ii, new IIlilI0i0ii("EXACT", 1)};
/* 23 */            I00iiI = iIlilI0i0iiArr;
/* 25 */            ilIII1o11.I00000oIO(iIlilI0i0iiArr);
                }

                public static IIlilI0i0ii valueOf(String str) {
/* 7 */             return (IIlilI0i0ii) Enum.valueOf(IIlilI0i0ii.class, str);
                }

                public static IIlilI0i0ii[] values() {
/* 7 */             return (IIlilI0i0ii[]) I00iiI.clone();
                }
            }
