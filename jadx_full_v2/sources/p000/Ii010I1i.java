            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ii010I1i {
                public static final Ii010I1i I00iOIl;
                public static final Ii010I1i I00iiI;
                public static final Ii010I1i I00iiO;
                public static final Ii010I1i I00iio;
                public static final Ii010I1i I00ilI0I1;
                public static final Ii010I1i[] I00ilO0;

                static {
/* 6 */             Ii010I1i ii010I1i = new Ii010I1i("CPU_ACQUIRED", 0);
/* 9 */             I00iOIl = ii010I1i;
/* 16 */            Ii010I1i ii010I1i2 = new Ii010I1i("BLOCKING", 1);
/* 19 */            I00iiI = ii010I1i2;
/* 26 */            Ii010I1i ii010I1i3 = new Ii010I1i("PARKING", 2);
/* 29 */            I00iiO = ii010I1i3;
/* 36 */            Ii010I1i ii010I1i4 = new Ii010I1i("DORMANT", 3);
/* 39 */            I00iio = ii010I1i4;
/* 46 */            Ii010I1i ii010I1i5 = new Ii010I1i("TERMINATED", 4);
/* 49 */            I00ilI0I1 = ii010I1i5;
/* 51 */            Ii010I1i[] ii010I1iArr = {ii010I1i, ii010I1i2, ii010I1i3, ii010I1i4, ii010I1i5};
/* 55 */            I00ilO0 = ii010I1iArr;
/* 57 */            ilIII1o11.I00000oIO(ii010I1iArr);
                }

                public static Ii010I1i valueOf(String str) {
/* 7 */             return (Ii010I1i) Enum.valueOf(Ii010I1i.class, str);
                }

                public static Ii010I1i[] values() {
/* 7 */             return (Ii010I1i[]) I00ilO0.clone();
                }
            }
