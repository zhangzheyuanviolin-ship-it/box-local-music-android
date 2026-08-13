            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIio0Ii1Ii {
                public static final OIio0Ii1Ii I00iOIl;
                public static final OIio0Ii1Ii I00iiI;
                public static final OIio0Ii1Ii[] I00iiO;

                static {
/* 6 */             OIio0Ii1Ii oIio0Ii1Ii = new OIio0Ii1Ii("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
/* 9 */             I00iOIl = oIio0Ii1Ii;
/* 16 */            OIio0Ii1Ii oIio0Ii1Ii2 = new OIio0Ii1Ii("DROP_WORK_REQUEST", 1);
/* 19 */            I00iiI = oIio0Ii1Ii2;
/* 21 */            OIio0Ii1Ii[] oIio0Ii1IiArr = {oIio0Ii1Ii, oIio0Ii1Ii2};
/* 25 */            I00iiO = oIio0Ii1IiArr;
/* 27 */            ilIII1o11.I00000oIO(oIio0Ii1IiArr);
                }

                public static OIio0Ii1Ii valueOf(String str) {
/* 7 */             return (OIio0Ii1Ii) Enum.valueOf(OIio0Ii1Ii.class, str);
                }

                public static OIio0Ii1Ii[] values() {
/* 7 */             return (OIio0Ii1Ii[]) I00iiO.clone();
                }
            }
