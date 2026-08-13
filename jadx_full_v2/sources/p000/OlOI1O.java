            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedList;
            import java.util.Objects;
            
            public final class OlOI1O implements Ool1II0ii {
                public IlOI0O11011l I00000oIO;
                public OolOi0i I00000oOI;
                public OI1I0OoOl I0000Il00O;
                public Ool1lo I0000O;
                public LinkedList I0000oI00;

                /* JADX WARN: Multi-variable type inference failed */
                public final void I00000oIO(IiIOI1ol0o iiIOI1ol0o, OlO1ooI0i olO1ooI0i, Ool1lo ool1lo) {
/* 5 */             I0O1IO i0o1io = new I0O1IO(24);
/* 8 */             i0o1io.I00iiI = this;
/* 10 */            i0o1io.I00iiO = iiIOI1ol0o;
/* 12 */            i0o1io.I00iio = olO1ooI0i;
/* 14 */            i0o1io.I00ilI0I1 = ool1lo;
/* 16 */            VarHandle.storeStoreFence();
/* 21 */            ((O011OOl11) iiIOI1ol0o).I00iiI(i0o1io);
                }

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
/* 1 */             this.I0000O = ool1lo;
/* 14 */            iOi1II01i0.I0000O(this.I00000oOI.I0000oI00, null, null, new I1iIiIIIio0(this, null), 3);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(OlO1ooI0i olO1ooI0i, Ool1lo ool1lo, IOoilo iOoilo) {
                    OlOI01l1 olOI01l1;
/* 3 */             if (iOoilo instanceof OlOI01l1) {
/* 6 */                 olOI01l1 = (OlOI01l1) iOoilo;
/* 8 */                 int i = olOI01l1.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    olOI01l1.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    olOI01l1 = new OlOI01l1(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = olOI01l1.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = olOI01l1.I00ilI0I1;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 36 */            if (i2 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 61 */                if (l11I11lO.I0000O(3, "CXCP")) {
/* 63 */                    Objects.toString(olO1ooI0i);
/* 66 */                    Objects.toString(ool1lo);
                        }
/* 69 */                IlOI0O11011l ilOI0O11011l = this.I00000oIO;
/* 71 */                olOI01l1.I00iOIl = olO1ooI0i;
/* 73 */                olOI01l1.I00iiI = ool1lo;
/* 75 */                olOI01l1.I00ilI0I1 = 1;
/* 77 */                objI0000Il00O = ilOI0O11011l.I0000Il00O(olOI01l1);
/* 81 */                if (objI0000Il00O == ii0111o) {
/* 83 */                    return ii0111o;
                        }
                    } else {
/* 38 */                if (i2 != 1) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 40 */                ool1lo = olOI01l1.I00iiI;
/* 42 */                olO1ooI0i = olOI01l1.I00iOIl;
/* 44 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
                    }
/* 86 */            int iIntValue = ((Number) objI0000Il00O).intValue();
/* 90 */            l11I11lO.I0000O(3, "CXCP");
/* 113 */           return iOi1II01i0.I00000oOI(this.I00000oOI.I0000oI00, null, new Ol110ii1I(ool1lo.I0001Ioi1lo(olO1ooI0i.I00000oIO, olO1ooI0i.I00000oOI, olO1ooI0i.I0000Il00O, iIntValue), olO1ooI0i, iOoil1iiIilo, 4), 3);
                }

                @Override
                public final void reset() {
/* 14 */            iOi1II01i0.I0000O(this.I00000oOI.I0000oI00, null, null, new OO11OilO(this, null, 19), 3);
                }
            }
