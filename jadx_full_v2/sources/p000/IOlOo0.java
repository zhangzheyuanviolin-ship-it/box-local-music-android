            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IOlOo0 {
                public static final IOlOo0 I00iOIl;
                public static final IOlOo0 I00iiI;
                public static final IOlOo0 I00iiO;
                public static final IOlOo0 I00iio;
                public static final IOlOo0[] I00ilI0I1;

                static {
/* 6 */             IOlOo0 iOlOo0 = new IOlOo0("ALWAYS_OVERRIDE", 0);
/* 9 */             I00iOIl = iOlOo0;
/* 16 */            IOlOo0 iOlOo02 = new IOlOo0("HIGH_PRIORITY_REQUIRED", 1);
/* 19 */            I00iiI = iOlOo02;
/* 26 */            IOlOo0 iOlOo03 = new IOlOo0("REQUIRED", 2);
/* 29 */            I00iiO = iOlOo03;
/* 36 */            IOlOo0 iOlOo04 = new IOlOo0("OPTIONAL", 3);
/* 39 */            I00iio = iOlOo04;
/* 45 */            I00ilI0I1 = new IOlOo0[]{iOlOo0, iOlOo02, iOlOo03, iOlOo04};
                }

                public static IOlOo0 valueOf(String str) {
/* 7 */             return (IOlOo0) Enum.valueOf(IOlOo0.class, str);
                }

                public static IOlOo0[] values() {
/* 7 */             return (IOlOo0[]) I00ilI0I1.clone();
                }
            }
