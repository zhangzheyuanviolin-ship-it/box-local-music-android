            package p000;

            import android.app.Dialog;
            import android.view.View;
            
            public final class Iii01iIil extends ilioOIIoIi10 {
                public Ill0iliOoOl1 I00iOIl;
                public Iii01o00i I00iiI;

                @Override
                public final View I0000Il00O(int i) {
/* 1 */             Ill0iliOoOl1 ill0iliOoOl1 = this.I00iOIl;
/* 7 */             if (ill0iliOoOl1.I0000O()) {
/* 9 */                 return ill0iliOoOl1.I0000Il00O(i);
                    }
/* 16 */            Dialog dialog = this.I00iiI.I011lIilI0lo;
/* 18 */            if (dialog != null) {
/* 20 */                return dialog.findViewById(i);
                    }
/* 25 */            return null;
                }

                @Override
                public final boolean I0000O() {
                    return this.I00iOIl.I0000O() || this.I00iiI.I01I01Oolii;
                }
            }
