            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OiloO0IOoII1 {
                public static final OiloO0IOoII1 I00iOIl;
                public static final OiloO0IOoII1 I00iiI;
                public static final OiloO0IOoII1 I00iiO;
                public static final OiloO0IOoII1[] I00iio;

                static {
/* 6 */             OiloO0IOoII1 oiloO0IOoII1 = new OiloO0IOoII1("PENDING", 0);
/* 9 */             I00iOIl = oiloO0IOoII1;
/* 16 */            OiloO0IOoII1 oiloO0IOoII12 = new OiloO0IOoII1("CREATING", 1);
/* 19 */            I00iiI = oiloO0IOoII12;
/* 26 */            OiloO0IOoII1 oiloO0IOoII13 = new OiloO0IOoII1("CREATED", 2);
/* 29 */            I00iiO = oiloO0IOoII13;
/* 31 */            OiloO0IOoII1[] oiloO0IOoII1Arr = {oiloO0IOoII1, oiloO0IOoII12, oiloO0IOoII13};
/* 35 */            I00iio = oiloO0IOoII1Arr;
/* 37 */            ilIII1o11.I00000oIO(oiloO0IOoII1Arr);
                }

                public static OiloO0IOoII1 valueOf(String str) {
/* 7 */             return (OiloO0IOoII1) Enum.valueOf(OiloO0IOoII1.class, str);
                }

                public static OiloO0IOoII1[] values() {
/* 7 */             return (OiloO0IOoII1[]) I00iio.clone();
                }
            }
