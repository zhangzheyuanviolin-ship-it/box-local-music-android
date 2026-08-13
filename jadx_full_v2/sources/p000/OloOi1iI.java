            package p000;

            import android.text.Layout;
            
            public abstract class OloOi1iI {
                public static final Layout.Alignment I00000oIO;
                public static final Layout.Alignment I00000oOI;

                static {
/* 1 */             Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
/* 5 */             Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
/* 10 */            Layout.Alignment alignment2 = alignment;
/* 11 */            for (Layout.Alignment alignment3 : alignmentArrValues) {
/* 25 */                if (O0000Ioio00.I0000O(alignment3.name(), "ALIGN_LEFT")) {
/* 27 */                    alignment = alignment3;
                        } else if (O0000Ioio00.I0000O(alignment3.name(), "ALIGN_RIGHT")) {
/* 41 */                    alignment2 = alignment3;
                        }
                    }
/* 45 */            I00000oIO = alignment;
/* 47 */            I00000oOI = alignment2;
                }
            }
