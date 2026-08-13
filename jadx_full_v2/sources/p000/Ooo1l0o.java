            package p000;
            
            public final class Ooo1l0o extends OIoOo11 {
                public OIooliIO0 I00ilI0I1;
                public OIooliIO0 I00ilO0;
                public Ooo0Oo01l I00io1l;
                public OIooliIO0 I00ioIO;
                public float I00l0I0l0lO1;
                public IOOil0 I00l0OO0IO;

                @Override
                public final void I00000oIO(float f) {
/* 1 */             this.I00l0I0l0lO1 = f;
                }

                @Override
                public final void I0000Il00O(IOOil0 iOOil0) {
/* 1 */             this.I00l0OO0IO = iOOil0;
                }

                @Override
                public final long I000OOo1O() {
/* 9 */             return ((Ol0i1I) this.I00ilI0I1.getValue()).I00000oIO;
                }

                @Override
                public final void I000OiO(IilloIOOO0i iilloIOOO0i) {
/* 1 */             Ooo0Oo01l ooo0Oo01l = this.I00io1l;
/* 3 */             IOOil0 iOOil0 = this.I00l0OO0IO;
/* 5 */             if (iOOil0 == null) {
/* 13 */                iOOil0 = (IOOil0) ooo0Oo01l.I000II.getValue();
                    }
/* 27 */            if (((Boolean) this.I00ilO0.getValue()).booleanValue() && iilloIOOO0i.getLayoutDirection() == O0iOOoiioO.I00iiI) {
/* 37 */                long jI00lli11 = iilloIOOO0i.I00lli11();
/* 41 */                IOO000ilo iOO000iloI00iiI = iilloIOOO0i.I00iiI();
/* 45 */                long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 53 */                iOO000iloI00iiI.I0010o().I000II();
                        try {
/* 64 */                    ((IIOOoll) iOO000iloI00iiI.I00iiI).I00i01iIIliI(-1.0f, 1.0f, jI00lli11);
/* 69 */                    ooo0Oo01l.I0000oI00(iilloIOOO0i, this.I00l0I0l0lO1, iOOil0);
                        } finally {
/* 77 */                    IIlIOloOOO.I001IO000(iOO000iloI00iiI, jI001iOo1i0O);
                        }
                    } else {
/* 83 */                ooo0Oo01l.I0000oI00(iilloIOOO0i, this.I00l0I0l0lO1, iOOil0);
                    }
/* 88 */            this.I00ioIO.getValue();
                }
            }
