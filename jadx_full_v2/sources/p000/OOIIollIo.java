            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOIIollIo {
                public static final OOIIollIo I00iOIl;
                public static final OOIIollIo I00iiI;
                public static final OOIIollIo[] I00iiO;

                static {
/* 6 */             OOIIollIo oOIIollIo = new OOIIollIo("IDLE", 0);
/* 9 */             I00iOIl = oOIIollIo;
/* 16 */            OOIIollIo oOIIollIo2 = new OOIIollIo("STREAMING", 1);
/* 19 */            I00iiI = oOIIollIo2;
/* 25 */            I00iiO = new OOIIollIo[]{oOIIollIo, oOIIollIo2};
                }

                public static OOIIollIo valueOf(String str) {
/* 7 */             return (OOIIollIo) Enum.valueOf(OOIIollIo.class, str);
                }

                public static OOIIollIo[] values() {
/* 7 */             return (OOIIollIo[]) I00iiO.clone();
                }
            }
