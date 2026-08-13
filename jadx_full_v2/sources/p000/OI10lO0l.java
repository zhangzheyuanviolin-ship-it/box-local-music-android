            package p000;
            
            public final class OI10lO0l implements OlO11I0O1l {
                public OI10l00 I00iOIl;

                public final void I00000oIO(int i, boolean z) {
                    Ol1il1o1 ol1il1o1I000O01llI0;
/* 5 */             int i2 = z ? i : 0;
/* 14 */            int i3 = ((OI10l00) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl)).I0000Il00O;
/* 18 */            int i4 = ((~i) & i3) | i2;
/* 19 */            if (i3 != i4) {
/* 21 */                OI10l00 oI10l00 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 26 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 36 */                    ((OI10l00) Ol1l1lI1Ili.I001i1O0Ol(oI10l00, this, ol1il1o1I000O01llI0)).I0000Il00O = i4;
                        }
/* 39 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                    }
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             this.I00iOIl = (OI10l00) olO1Ol0il0i;
                }
            }
