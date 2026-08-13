            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I0l0ioi11i extends Oll0io implements IlliOIilI {
                public int I00iOIl;
                public I0l1I0I0i10I I00iiI;
                public Ii1loIll001 I00iiO;
                public Object I00iio;
                public final I0l1OOl1l10 I00ilI0I1;
                public final float I00ilO0;
                public final I110IiI0o1Il I00io1l;
                public final OOo0lO I00ioIO;
                public final Ii1OoIll0 I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0l0ioi11i(I0l1OOl1l10 i0l1OOl1l10, float f, I110IiI0o1Il i110IiI0o1Il, OOo0lO oOo0lO, Ii1OoIll0 ii1OoIll0, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(4, iOoil1iiIilo);
/* 1 */             this.I00ilI0I1 = i0l1OOl1l10;
/* 3 */             this.I00ilO0 = f;
/* 5 */             this.I00io1l = i110IiI0o1Il;
/* 7 */             this.I00ioIO = oOo0lO;
/* 9 */             this.I00l0I0l0lO1 = ii1OoIll0;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
/* 10 */            OOo0lO oOo0lO = this.I00ioIO;
/* 12 */            Ii1OoIll0 ii1OoIll0 = this.I00l0I0l0lO1;
/* 20 */            I0l0ioi11i i0l0ioi11i = new I0l0ioi11i(this.I00ilI0I1, this.I00ilO0, this.I00io1l, oOo0lO, ii1OoIll0, (IOoil1iiIilo) obj4);
/* 23 */            i0l0ioi11i.I00iiI = (I0l1I0I0i10I) obj;
/* 25 */            i0l0ioi11i.I00iiO = (Ii1loIll001) obj2;
/* 27 */            i0l0ioi11i.I00iio = obj3;
/* 31 */            return i0l0ioi11i.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
                
                    if (p000.lOiIo0.I0000O(r1, r5, false, r3, r16) == r7) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
                
                    if (p000.I0l0lIoOIoIi.I0000oI00(r16.I00ilI0I1, r14, r0, r3, r10, r16.I00io1l, r16) == r7) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
                
                    if (p000.I0l0lIoOIoIi.I0000oI00(r16.I00ilI0I1, r15, r0, r3, r10, r16.I00io1l, r16) == r7) goto L42;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i = this.I00iOIl;
/* 8 */             int i2 = 2;
/* 10 */            OOo0lO oOo0lO = this.I00ioIO;
/* 14 */            if (i == 0) {
/* 43 */                lIoii1l01l0i.I00000oOI(obj);
/* 46 */                I0l1I0I0i10I i0l1I0I0i10I = this.I00iiI;
/* 49 */                Ii1loIll001 ii1loIll001 = this.I00iiO;
/* 51 */                Object obj2 = this.I00iio;
/* 53 */                float fI0001Ioi1lo = ii1loIll001.I0001Ioi1lo(obj2);
/* 61 */                if (!Float.isNaN(fI0001Ioi1lo)) {
/* 65 */                    OOo0lO oOo0lO2 = new OOo0lO();
/* 68 */                    I0l1OOl1l10 i0l1OOl1l10 = this.I00ilI0I1;
/* 90 */                    float fI000II = Float.isNaN(((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II()) ? 0.0f : ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II();
/* 94 */                    oOo0lO2.I00iOIl = fI000II;
/* 98 */                    if (fI000II != fI0001Ioi1lo) {
/* 104 */                       float f = this.I00ilO0;
/* 109 */                       if ((fI0001Ioi1lo - fI000II) * f < 0.0f || f == 0.0f) {
/* 200 */                           this.I00iiI = null;
/* 202 */                           this.I00iiO = null;
/* 204 */                           this.I00iOIl = 1;
                                } else {
/* 118 */                           Ii1OoIll0 ii1OoIll0 = this.I00l0I0l0lO1;
/* 120 */                           float fI00000oIO = il0OoiI.I00000oIO(ii1OoIll0, fI000II, f);
/* 124 */                           float f2 = this.I00ilO0;
/* 128 */                           if (f2 <= 0.0f ? fI00000oIO > fI0001Ioi1lo : fI00000oIO < fI0001Ioi1lo) {
/* 177 */                               this.I00iiI = null;
/* 179 */                               this.I00iiO = null;
/* 181 */                               this.I00iOIl = 3;
                                    } else {
/* 143 */                               I110IiI1I1 i110IiI1I1I00000oIO = iOO0I0.I00000oIO(oOo0lO2.I00iOIl, f2, 28);
/* 149 */                               Ol1iIOIIo0 ol1iIOIIo0 = new Ol1iIOIIo0(i2);
/* 152 */                               ol1iIOIIo0.I00iiI = fI0001Ioi1lo;
/* 154 */                               ol1iIOIIo0.I00iiO = oOo0lO2;
/* 156 */                               ol1iIOIIo0.I00iio = i0l1I0I0i10I;
/* 158 */                               ol1iIOIIo0.I00ilI0I1 = oOo0lO;
/* 160 */                               VarHandle.storeStoreFence();
/* 163 */                               this.I00iiI = null;
/* 165 */                               this.I00iiO = null;
/* 167 */                               this.I00iOIl = 2;
                                    }
                                }
/* 218 */                       return ii0111o;
                            }
                        }
                    } else if (i == 1) {
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
/* 219 */               oOo0lO.I00iOIl = 0.0f;
                    } else if (i == 2) {
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
                    } else {
/* 20 */                if (i != 3) {
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                    return null;
                        }
/* 22 */                lIoii1l01l0i.I00000oOI(obj);
/* 197 */               oOo0lO.I00iOIl = 0.0f;
                    }
/* 221 */           return OoiIlOl1iI.I00000oIO;
                }
            }
