            package p000;

            import android.util.SparseArray;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIIO00i1 {
                public static final SparseArray I00iOIl;
                public static final OIIO00i1[] I00iiI;

                OIIO00i1 EF1;

                static {
/* 6 */             OIIO00i1 oIIO00i1 = new OIIO00i1("UNKNOWN_MOBILE_SUBTYPE", 0);
/* 15 */            OIIO00i1 oIIO00i12 = new OIIO00i1("GPRS", 1);
/* 23 */            OIIO00i1 oIIO00i13 = new OIIO00i1("EDGE", 2);
/* 32 */            OIIO00i1 oIIO00i14 = new OIIO00i1("UMTS", 3);
/* 41 */            OIIO00i1 oIIO00i15 = new OIIO00i1("CDMA", 4);
/* 50 */            OIIO00i1 oIIO00i16 = new OIIO00i1("EVDO_0", 5);
/* 59 */            OIIO00i1 oIIO00i17 = new OIIO00i1("EVDO_A", 6);
/* 68 */            OIIO00i1 oIIO00i18 = new OIIO00i1("RTT", 7);
/* 78 */            OIIO00i1 oIIO00i19 = new OIIO00i1("HSDPA", 8);
/* 87 */            OIIO00i1 oIIO00i110 = new OIIO00i1("HSUPA", 9);
/* 96 */            OIIO00i1 oIIO00i111 = new OIIO00i1("HSPA", 10);
/* 105 */           OIIO00i1 oIIO00i112 = new OIIO00i1("IDEN", 11);
/* 114 */           OIIO00i1 oIIO00i113 = new OIIO00i1("EVDO_B", 12);
/* 123 */           OIIO00i1 oIIO00i114 = new OIIO00i1("LTE", 13);
/* 134 */           OIIO00i1 oIIO00i115 = new OIIO00i1("EHRPD", 14);
/* 145 */           OIIO00i1 oIIO00i116 = new OIIO00i1("HSPAP", 15);
/* 156 */           OIIO00i1 oIIO00i117 = new OIIO00i1("GSM", 16);
/* 167 */           OIIO00i1 oIIO00i118 = new OIIO00i1("TD_SCDMA", 17);
/* 178 */           OIIO00i1 oIIO00i119 = new OIIO00i1("IWLAN", 18);
/* 189 */           OIIO00i1 oIIO00i120 = new OIIO00i1("LTE_CA", 19);
/* 234 */           I00iiI = new OIIO00i1[]{oIIO00i1, oIIO00i12, oIIO00i13, oIIO00i14, oIIO00i15, oIIO00i16, oIIO00i17, oIIO00i18, oIIO00i19, oIIO00i110, oIIO00i111, oIIO00i112, oIIO00i113, oIIO00i114, oIIO00i115, oIIO00i116, oIIO00i117, oIIO00i118, oIIO00i119, oIIO00i120, new OIIO00i1("COMBINED", 20)};
/* 238 */           SparseArray sparseArray = new SparseArray();
/* 241 */           I00iOIl = sparseArray;
/* 246 */           sparseArray.put(0, oIIO00i1);
/* 250 */           sparseArray.put(1, oIIO00i12);
/* 254 */           sparseArray.put(2, oIIO00i13);
/* 258 */           sparseArray.put(3, oIIO00i14);
/* 262 */           sparseArray.put(4, oIIO00i15);
/* 266 */           sparseArray.put(5, oIIO00i16);
/* 270 */           sparseArray.put(6, oIIO00i17);
/* 274 */           sparseArray.put(7, oIIO00i18);
/* 279 */           sparseArray.put(8, oIIO00i19);
/* 284 */           sparseArray.put(9, oIIO00i110);
/* 289 */           sparseArray.put(10, oIIO00i111);
/* 294 */           sparseArray.put(11, oIIO00i112);
/* 299 */           sparseArray.put(12, oIIO00i113);
/* 304 */           sparseArray.put(13, oIIO00i114);
/* 311 */           sparseArray.put(14, oIIO00i115);
/* 318 */           sparseArray.put(15, oIIO00i116);
/* 325 */           sparseArray.put(16, oIIO00i117);
/* 332 */           sparseArray.put(17, oIIO00i118);
/* 339 */           sparseArray.put(18, oIIO00i119);
/* 346 */           sparseArray.put(19, oIIO00i120);
                }

                public static OIIO00i1 valueOf(String str) {
/* 7 */             return (OIIO00i1) Enum.valueOf(OIIO00i1.class, str);
                }

                public static OIIO00i1[] values() {
/* 7 */             return (OIIO00i1[]) I00iiI.clone();
                }
            }
