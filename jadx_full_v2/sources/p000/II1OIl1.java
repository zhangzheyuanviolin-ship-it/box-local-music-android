            package p000;
            
            public final class II1OIl1 implements IlOIll0o11Ii {
                public Oooii1o1 I00000oIO;
                public Ol010000lo00 I00000oOI;
                public IiIooOOOI I0000Il00O;
                public Ol1iIOI I0000O;
                public IllOOo00lI I0000oI00;

                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(OiOiliiO oiOiliiO, float f, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    II1OIiI iI1OIiI;
/* 1 */             IllOOo00lI illOOo00lI = this.I0000oI00;
/* 3 */             IiIooOOOI iiIooOOOI = this.I0000Il00O;
/* 5 */             Ol010000lo00 ol010000lo00 = this.I00000oOI;
/* 7 */             I0l1OOl1l10 i0l1OOl1l10 = ol010000lo00.I0000oI00;
/* 11 */            if (iOoil1iiIilo instanceof II1OIiI) {
/* 14 */                iI1OIiI = (II1OIiI) iOoil1iiIilo;
/* 16 */                int i = iI1OIiI.I00iiO;
/* 22 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 25 */                    iI1OIiI.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 32 */                    iI1OIiI = new II1OIiI(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 35 */            Object objI00000oIO = iI1OIiI.I00iOIl;
/* 37 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 39 */            int i2 = iI1OIiI.I00iiO;
                    try {
/* 42 */                if (i2 == 0) {
/* 59 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 64 */                    float fI0000oI00 = this.I00000oIO.I0000oI00();
/* 69 */                    float fI00000oOI = lIiioliIlo.I00000oOI(f, -fI0000oI00, fI0000oI00);
/* 76 */                    if (fI00000oOI > 0.0f) {
/* 78 */                        Ii1loIll001 ii1loIll001I0000Il00O = i0l1OOl1l10.I0000Il00O();
/* 82 */                        Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iOIl;
/* 88 */                        if (ii1loIll001I0000Il00O.I0000Il00O(ol010l0o0O)) {
/* 103 */                           float fMax = Math.max(0.0f, i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(ol010l0o0O) - i0l1OOl1l10.I0001Ioi1lo());
/* 109 */                           float fI00i0ilIl0i = iiIooOOOI.I00i0ilIl0i(II1Il0I.I0000oI00);
/* 115 */                           if (fMax < fI00i0ilIl0i) {
/* 117 */                               float f2 = fMax / fI00i0ilIl0i;
/* 119 */                               fI00000oOI *= f2 * f2;
/* 122 */                               float fI00i0ilIl0i2 = iiIooOOOI.I00i0ilIl0i(II1Il0I.I0000O);
/* 128 */                               if (f >= fI00i0ilIl0i2) {
/* 130 */                                   fI00000oOI = Math.max(fI00000oOI, fI00i0ilIl0i2);
                                        }
                                    }
                                }
                            }
/* 134 */                   Ol1iIOI ol1iIOI = this.I0000O;
/* 136 */                   iI1OIiI.I00iiO = 1;
/* 138 */                   objI00000oIO = ol1iIOI.I00000oIO(oiOiliiO, fI00000oOI, iI1OIiI);
/* 142 */                   if (objI00000oIO == ii0111o) {
/* 144 */                       return ii0111o;
                            }
                        } else {
/* 44 */                    if (i2 != 1) {
/* 54 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 57 */                        return null;
                            }
/* 46 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
                        }
/* 162 */               return new Float(((Number) objI00000oIO).floatValue());
                    } finally {
/* 170 */               if (!ol010000lo00.I0000oI00()) {
/* 172 */                   illOOo00lI.invoke();
                        }
                    }
                }
            }
