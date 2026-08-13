            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOoilolI10I {
                public static final OOoilolI10I[] I00iOIl;

                static {
/* 65 */            OOoilolI10I[] oOoilolI10IArr = {new OOoilolI10I("IGNORE_CASE", 0, 2), new OOoilolI10I("MULTILINE", 1, 8), new OOoilolI10I("LITERAL", 2, 16), new OOoilolI10I("UNIX_LINES", 3, 1), new OOoilolI10I("COMMENTS", 4, 4), new OOoilolI10I("DOT_MATCHES_ALL", 5, 32), new OOoilolI10I("CANON_EQ", 6, Barcode.FORMAT_ITF)};
/* 69 */            I00iOIl = oOoilolI10IArr;
/* 71 */            ilIII1o11.I00000oIO(oOoilolI10IArr);
                }

                public OOoilolI10I(String str, int i, int i2) {
                }

                public static OOoilolI10I valueOf(String str) {
/* 7 */             return (OOoilolI10I) Enum.valueOf(OOoilolI10I.class, str);
                }

                public static OOoilolI10I[] values() {
/* 7 */             return (OOoilolI10I[]) I00iOIl.clone();
                }
            }
