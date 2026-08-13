            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIol010llO0i {
                public static final OIol010llO0i I00iOIl;
                public static final OIol010llO0i I00iiI;
                public static final OIol010llO0i I00iiO;
                public static final OIol010llO0i[] I00iio;

                static {
/* 6 */             OIol010llO0i oIol010llO0i = new OIol010llO0i("ALL", 0);
/* 9 */             I00iOIl = oIol010llO0i;
/* 16 */            OIol010llO0i oIol010llO0i2 = new OIol010llO0i("ONLY_NON_SYNTHESIZED", 1);
/* 19 */            I00iiI = oIol010llO0i2;
/* 26 */            OIol010llO0i oIol010llO0i3 = new OIol010llO0i("NONE", 2);
/* 29 */            I00iiO = oIol010llO0i3;
/* 31 */            OIol010llO0i[] oIol010llO0iArr = {oIol010llO0i, oIol010llO0i2, oIol010llO0i3};
/* 35 */            I00iio = oIol010llO0iArr;
/* 37 */            ilIII1o11.I00000oIO(oIol010llO0iArr);
                }

                public static OIol010llO0i valueOf(String str) {
/* 7 */             return (OIol010llO0i) Enum.valueOf(OIol010llO0i.class, str);
                }

                public static OIol010llO0i[] values() {
/* 7 */             return (OIol010llO0i[]) I00iio.clone();
                }
            }
