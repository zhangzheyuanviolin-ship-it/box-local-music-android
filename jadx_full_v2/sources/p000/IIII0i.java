            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIII0i {
                public static final IIII0i I00iOIl;
                public static final IIII0i I00iiI;
                public static final IIII0i I00iiO;
                public static final IIII0i[] I00iio;

                static {
/* 6 */             IIII0i iIII0i = new IIII0i("SUSPEND", 0);
/* 9 */             I00iOIl = iIII0i;
/* 16 */            IIII0i iIII0i2 = new IIII0i("DROP_OLDEST", 1);
/* 19 */            I00iiI = iIII0i2;
/* 26 */            IIII0i iIII0i3 = new IIII0i("DROP_LATEST", 2);
/* 29 */            I00iiO = iIII0i3;
/* 31 */            IIII0i[] iIII0iArr = {iIII0i, iIII0i2, iIII0i3};
/* 35 */            I00iio = iIII0iArr;
/* 37 */            ilIII1o11.I00000oIO(iIII0iArr);
                }

                public static IIII0i valueOf(String str) {
/* 7 */             return (IIII0i) Enum.valueOf(IIII0i.class, str);
                }

                public static IIII0i[] values() {
/* 7 */             return (IIII0i[]) I00iio.clone();
                }
            }
