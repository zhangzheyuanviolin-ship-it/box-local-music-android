            package p000;

            import android.util.Rational;
            import android.util.Size;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            
            public final class Ili1i1o00Oo implements Ool1II0ii, OolOII {
                public IIloIoOOiO0l I00000oIO;
                public O1ll0I0i0OO I00000oOI;
                public OlO01I1 I0000Il00O;
                public OolOi0i I0000O;
                public i0I0OoIIOO01 I0000oI00;
                public Ool1lo I0001Ioi1lo;
                public Rational I000II;
                public Integer I000O01llI0;
                public Integer I000OOo1O;
                public Integer I000OiO;
                public boolean I000iOII;
                public ArrayList I000l1;
                public ArrayList I000lI;
                public IOi10loi I000o00OoI0I;
                public IOi10loi I000oI1ioi;
                public OlIl0i I00100l0;
                public OlIl0i I00100o1O0lo;

                @Override
                public final void I00000oIO(LinkedHashSet linkedHashSet) {
                    Size sizeI0000Il00O;
/* 2 */             this.I000II = null;
/* 4 */             Iterator it = linkedHashSet.iterator();
/* 12 */            while (it.hasNext()) {
/* 18 */                Ool10o ool10o = (Ool10o) it.next();
/* 22 */                if ((ool10o instanceof OOIIOiolI) && (sizeI0000Il00O = ((OOIIOiolI) ool10o).I0000Il00O()) != null) {
/* 45 */                    this.I000II = new Rational(sizeI0000Il00O.getWidth(), sizeI0000Il00O.getHeight());
                        }
                    }
                }

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
/* 1 */             this.I0001Ioi1lo = ool1lo;
                }

                public final Rational I0000Il00O() {
/* 1 */             i0I0OoIIOO01 i0i0ooiioo01 = this.I0000oI00;
/* 3 */             Rational rational = this.I000II;
                    return rational == null ? new Rational(i0i0ooiioo01.I000lI().width(), i0i0ooiioo01.I000lI().height()) : rational;
                }

                @Override
                public final void reset() {
/* 2 */             this.I000II = null;
/* 6 */             IOi10loi iOi10loi = new IOi10loi();
/* 9 */             Ool1lo ool1lo = this.I0001Ioi1lo;
/* 11 */            if (ool1lo == null) {
/* 71 */                IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
/* 110 */               return;
                    }
/* 13 */            OlIl0i olIl0i = this.I00100l0;
/* 15 */            if (olIl0i != null) {
/* 17 */                olIl0i.I000II(null);
                    }
/* 20 */            OlIl0i olIl0i2 = this.I00100o1O0lo;
/* 22 */            if (olIl0i2 != null) {
/* 24 */                olIl0i2.I000II(null);
                    }
/* 27 */            IOi10loi iOi10loi2 = this.I000oI1ioi;
/* 29 */            if (iOi10loi2 != null) {
/* 33 */                IIl001iO0Io.I001l0I00("Cancelled by another cancelFocusAndMetering()", iOi10loi2);
                    }
/* 36 */            this.I000oI1ioi = iOi10loi;
/* 38 */            IOi10loi iOi10loi3 = this.I000o00OoI0I;
/* 40 */            if (iOi10loi3 != null) {
/* 44 */                IIl001iO0Io.I001l0I00("Cancelled by cancelFocusAndMetering()", iOi10loi3);
                    }
/* 47 */            OlO01I1 olO01I1 = this.I0000Il00O;
                    synchronized (olO01I1.I0000O) {
/* 52 */                olO01I1.I000l1 = null;
                    }
/* 55 */            olO01I1.I0001Ioi1lo();
/* 62 */            iiolOOio1.I0000Il00O(ool1lo.I000lI(), iOi10loi);
                }
            }
