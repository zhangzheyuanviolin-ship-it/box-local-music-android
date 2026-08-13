            package p000;

            import android.view.View;
            
            public final class Ill0iliOoOl1 extends ilioOIIoIi10 {
                public Ill0l1 I00iOIl;

                @Override
                public final View I0000Il00O(int i) {
/* 1 */             Ill0l1 ill0l1 = this.I00iOIl;
/* 3 */             View view = ill0l1.I0100i;
/* 5 */             if (view != null) {
/* 7 */                 return view.findViewById(i);
                    }
/* 16 */            IioIoO10iOiI.I000O01llI0(ill0l1, "Fragment ", " does not have a view");
/* 19 */            return null;
                }

                @Override
                public final boolean I0000O() {
                    return this.I00iOIl.I0100i != null;
                }
            }
