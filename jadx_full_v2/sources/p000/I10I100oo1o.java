            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            
            public final class I10I100oo1o implements O1iOIl0o10 {
                public Oooio0iiI0 I00000oIO;
                public O0iiOioolIi I00000oOI;

                @Override
                public final int I00000oIO(IoooOl1001li ioooOl1001li, List list, int i) {
/* 1 */             Oooio0iiI0 oooio0iiI0 = this.I00000oIO;
/* 18 */            oooio0iiI0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), I10I1li0.I000l1(0, i, oooio0iiI0.getLayoutParams().height));
/* 21 */            return oooio0iiI0.getMeasuredWidth();
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
/* 1 */             Oooio0iiI0 oooio0iiI0 = this.I00000oIO;
/* 3 */             int childCount = oooio0iiI0.getChildCount();
/* 7 */             Map map = Il011I1OiO0I.I00iOIl;
/* 10 */            if (childCount == 0) {
/* 25 */                return o1iOIoOiO0.I001i1lo1io(IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000iOII(j), map, new I10I0o1ii10(0));
                    }
/* 34 */            if (IOo0oO11ll1O.I000l1(j) != 0) {
/* 44 */                oooio0iiI0.getChildAt(0).setMinimumWidth(IOo0oO11ll1O.I000l1(j));
                    }
/* 51 */            if (IOo0oO11ll1O.I000iOII(j) != 0) {
/* 61 */                oooio0iiI0.getChildAt(0).setMinimumHeight(IOo0oO11ll1O.I000iOII(j));
                    }
/* 100 */           oooio0iiI0.measure(I10I1li0.I000l1(IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000OiO(j), oooio0iiI0.getLayoutParams().width), I10I1li0.I000l1(IOo0oO11ll1O.I000iOII(j), IOo0oO11ll1O.I000OOo1O(j), oooio0iiI0.getLayoutParams().height));
/* 103 */           int measuredWidth = oooio0iiI0.getMeasuredWidth();
/* 107 */           int measuredHeight = oooio0iiI0.getMeasuredHeight();
/* 111 */           O0iiOioolIi o0iiOioolIi = this.I00000oOI;
/* 116 */           I101oll1o0 i101oll1o0 = new I101oll1o0(2);
/* 119 */           i101oll1o0.I00iiI = oooio0iiI0;
/* 121 */           i101oll1o0.I00iiO = o0iiOioolIi;
/* 123 */           VarHandle.storeStoreFence();
/* 126 */           return o1iOIoOiO0.I001i1lo1io(measuredWidth, measuredHeight, map, i101oll1o0);
                }

                @Override
                public final int I0000Il00O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 1 */             Oooio0iiI0 oooio0iiI0 = this.I00000oIO;
/* 18 */            oooio0iiI0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), I10I1li0.I000l1(0, i, oooio0iiI0.getLayoutParams().height));
/* 21 */            return oooio0iiI0.getMeasuredWidth();
                }

                @Override
                public final int I0000O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 1 */             Oooio0iiI0 oooio0iiI0 = this.I00000oIO;
/* 18 */            oooio0iiI0.measure(I10I1li0.I000l1(0, i, oooio0iiI0.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
/* 21 */            return oooio0iiI0.getMeasuredHeight();
                }

                @Override
                public final int I0000oI00(IoooOl1001li ioooOl1001li, List list, int i) {
/* 1 */             Oooio0iiI0 oooio0iiI0 = this.I00000oIO;
/* 18 */            oooio0iiI0.measure(I10I1li0.I000l1(0, i, oooio0iiI0.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
/* 21 */            return oooio0iiI0.getMeasuredHeight();
                }
            }
