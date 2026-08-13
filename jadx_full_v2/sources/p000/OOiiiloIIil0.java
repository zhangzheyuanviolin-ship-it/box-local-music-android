            package p000;

            import android.util.SparseArray;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOiiiloIIil0 {
                public static final OOiiiloIIil0 I00iOIl;
                public static final OOiiiloIIil0[] I00iiI;

                static {
/* 6 */             OOiiiloIIil0 oOiiiloIIil0 = new OOiiiloIIil0("DEFAULT", 0);
/* 9 */             I00iOIl = oOiiiloIIil0;
/* 16 */            OOiiiloIIil0 oOiiiloIIil02 = new OOiiiloIIil0("UNMETERED_ONLY", 1);
/* 24 */            OOiiiloIIil0 oOiiiloIIil03 = new OOiiiloIIil0("UNMETERED_OR_DAILY", 2);
/* 32 */            OOiiiloIIil0 oOiiiloIIil04 = new OOiiiloIIil0("FAST_IF_RADIO_AWAKE", 3);
/* 40 */            OOiiiloIIil0 oOiiiloIIil05 = new OOiiiloIIil0("NEVER", 4);
/* 48 */            OOiiiloIIil0 oOiiiloIIil06 = new OOiiiloIIil0("UNRECOGNIZED", 5);
/* 55 */            I00iiI = new OOiiiloIIil0[]{oOiiiloIIil0, oOiiiloIIil02, oOiiiloIIil03, oOiiiloIIil04, oOiiiloIIil05, oOiiiloIIil06};
/* 59 */            SparseArray sparseArray = new SparseArray();
/* 62 */            sparseArray.put(0, oOiiiloIIil0);
/* 65 */            sparseArray.put(1, oOiiiloIIil02);
/* 68 */            sparseArray.put(2, oOiiiloIIil03);
/* 71 */            sparseArray.put(3, oOiiiloIIil04);
/* 74 */            sparseArray.put(4, oOiiiloIIil05);
/* 78 */            sparseArray.put(-1, oOiiiloIIil06);
                }

                public static OOiiiloIIil0 valueOf(String str) {
/* 7 */             return (OOiiiloIIil0) Enum.valueOf(OOiiiloIIil0.class, str);
                }

                public static OOiiiloIIil0[] values() {
/* 7 */             return (OOiiiloIIil0[]) I00iiI.clone();
                }
            }
