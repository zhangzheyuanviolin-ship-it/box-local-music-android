            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IOoIiIOliiO1 {
                public static final IOoIiIOliiO1 I00iOIl;
                public static final IOoIiIOliiO1 I00iiI;
                public static final IOoIiIOliiO1[] I00iiO;

                static {
/* 6 */             IOoIiIOliiO1 iOoIiIOliiO1 = new IOoIiIOliiO1("VIEW_APPEAR", 0);
/* 9 */             I00iOIl = iOoIiIOliiO1;
/* 16 */            IOoIiIOliiO1 iOoIiIOliiO12 = new IOoIiIOliiO1("VIEW_DISAPPEAR", 1);
/* 19 */            I00iiI = iOoIiIOliiO12;
/* 21 */            IOoIiIOliiO1[] iOoIiIOliiO1Arr = {iOoIiIOliiO1, iOoIiIOliiO12};
/* 25 */            I00iiO = iOoIiIOliiO1Arr;
/* 27 */            ilIII1o11.I00000oIO(iOoIiIOliiO1Arr);
                }

                public static IOoIiIOliiO1 valueOf(String str) {
/* 7 */             return (IOoIiIOliiO1) Enum.valueOf(IOoIiIOliiO1.class, str);
                }

                public static IOoIiIOliiO1[] values() {
/* 7 */             return (IOoIiIOliiO1[]) I00iiO.clone();
                }
            }
