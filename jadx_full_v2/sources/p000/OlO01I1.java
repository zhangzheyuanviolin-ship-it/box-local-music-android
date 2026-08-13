            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class OlO01I1 implements Ool1II0ii, OolOII {
                public IIloIoOOiO0l I00000oIO;
                public I1iil1I00 I00000oOI;
                public OolOi0i I0000Il00O;
                public Object I0000O;
                public Ool1lo I0000oI00;
                public ArrayList I0001Ioi1lo;
                public long I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public boolean I000OiO;
                public Integer I000iOII;
                public Integer I000l1;

                @Override
                public final void I00000oIO(LinkedHashSet linkedHashSet) {
/* 12 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 17 */            iOi1II01i0.I0000O(this.I0000Il00O.I0000oI00, null, null, new Ol0Oli(iOoil1iiIilo, IOOi0Ool1i.I00iio(linkedHashSet), this, 6), 3);
                }

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
/* 1 */             this.I0000oI00 = ool1lo;
/* 3 */             I0001Ioi1lo();
                }

                public final void I0000Il00O(Exception exc) {
                    List listI00iIi0i1o;
                    synchronized (this.I0000O) {
/* 6 */                 listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I0001Ioi1lo);
/* 12 */                this.I0001Ioi1lo.clear();
                    }
/* 18 */            Iterator it = listI00iIi0i1o.iterator();
/* 26 */            while (it.hasNext()) {
/* 34 */                ((IOi10loi) it.next()).I00iIO(exc);
                    }
                }

                public final int I0000O(int i, boolean z, Integer num) {
/* 20 */            int iIntValue = num != null ? num.intValue() : i != 0 ? i != 1 ? 1 : 3 : this.I00000oOI.I00O10llo();
/* 26 */            if (z && iOiloi0oOI1.I00000oOI(this.I00000oIO.I00000oOI, 5) == 5) {
/* 39 */                l11I11lO.I0000O(3, "CXCP");
/* 42 */                iIntValue = 5;
                    }
/* 43 */            l11I11lO.I0000O(3, "CXCP");
/* 98 */            return iIntValue;
                }

                public final int I0000oI00() {
                    int iI00000oOI;
                    synchronized (this.I0000O) {
/* 18 */                iI00000oOI = iOiloi0oOI1.I00000oOI(this.I00000oIO.I00000oOI, I0000O(this.I000O01llI0, this.I000OiO, this.I000iOII));
                    }
/* 23 */            return iI00000oOI;
                }

                public final IOi10loi I0001Ioi1lo() {
/* 3 */             IOi10loi iOi10loi = new IOi10loi();
/* 8 */             OOo0o0oO oOo0o0oO = new OOo0o0oO();
                    synchronized (this.I0000O) {
/* 16 */                this.I0001Ioi1lo.add(iOi10loi);
/* 23 */                long j = this.I000II + 1;
/* 24 */                this.I000II = j;
/* 26 */                oOo0o0oO.I00iOIl = j;
                    }
/* 41 */            iOi1II01i0.I0000O(this.I0000Il00O.I0000oI00, null, null, new Ol0Oli((IOoil1iiIilo) null, this, oOo0o0oO, 7), 3);
/* 44 */            return iOi10loi;
                }

                @Override
                public final void reset() {
                    synchronized (this.I0000O) {
/* 5 */                 this.I000OiO = false;
/* 8 */                 this.I000iOII = null;
/* 10 */                this.I000l1 = null;
/* 13 */                this.I000O01llI0 = 2;
/* 16 */                this.I000OOo1O = 1;
                    }
/* 19 */            I0001Ioi1lo();
                }
            }
