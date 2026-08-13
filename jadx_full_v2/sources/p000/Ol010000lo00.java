            package p000;

            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol010000lo00 {
                public final Set I00000oIO;
                public final IllOOo00lI I00000oOI;
                public final Function1 I0000Il00O;
                public final boolean I0000O;
                public final I0l1OOl1l10 I0000oI00;
                public IlIoO1ilo1 I0001Ioi1lo;
                public IlIoO1ilo1 I000II;

                public Ol010000lo00(Set set, IllOOo00lI illOOo00lI, Ol010l0o0O ol010l0o0O, Function1 function1, boolean z) {
/* 4 */             this.I00000oIO = set;
/* 6 */             this.I00000oOI = illOOo00lI;
/* 8 */             this.I0000Il00O = function1;
/* 10 */            this.I0000O = z;
/* 19 */            if (!set.contains(Ol010l0o0O.I00iiI)) {
/* 57 */                I000II.I000iOII("Expanded must be one of the enabled values.");
/* 399 */               throw null;
                    }
/* 25 */            if (!set.contains(ol010l0o0O)) {
/* 51 */                I000II.I000iOII("The initial value must be one of the enabled values.");
/* 54 */                throw null;
                    }
/* 27 */            int i = Ol00iioo.I00000oIO;
/* 34 */            this.I0000oI00 = new I0l1OOl1l10(ol010l0o0O, function1);
/* 40 */            this.I0001Ioi1lo = iOO01lio0.I00000oOI();
/* 46 */            this.I000II = iOO01lio0.I00000oOI();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(II1OIl1 iI1OIl1, float f, IOoilo iOoilo) throws Throwable {
                    Ol00oO ol00oO;
                    OOo0lO oOo0lO;
/* 3 */             if (iOoilo instanceof Ol00oO) {
/* 6 */                 ol00oO = (Ol00oO) iOoilo;
/* 8 */                 int i = ol00oO.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol00oO.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ol00oO = new Ol00oO(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ol00oO.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ol00oO.I00iio;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 54 */                OOo0lO oOo0lO2 = new OOo0lO();
/* 63 */                Ol00oioi0oI ol00oioi0oI = new Ol00oioi0oI(oOo0lO2, iI1OIl1, this, f, null);
/* 66 */                ol00oO.I00iOIl = oOo0lO2;
/* 68 */                ol00oO.I00iio = 1;
/* 76 */                if (I0l1OOl1l10.I00000oOI(this.I0000oI00, ol00oioi0oI, ol00oO) == ii0111o) {
/* 78 */                    return ii0111o;
                        }
/* 79 */                oOo0lO = oOo0lO2;
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                oOo0lO = ol00oO.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 84 */            return new Float(oOo0lO.I00iOIl);
                }

                public final Object I00000oOI(Ol010l0o0O ol010l0o0O, IlIoO1ilo1 ilIoO1ilo1, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             I01OoIoio00O i01OoIoio00O = I0l0lIoOIoIi.I00000oIO;
/* 6 */             I0l1OOl1l10 i0l1OOl1l10 = this.I0000oI00;
/* 13 */            Object objI00000oIO = i0l1OOl1l10.I00000oIO(ol010l0o0O, OI110lo.I00iOIl, new I0l0iIiilloO(i0l1OOl1l10, ilIoO1ilo1, null), iOoil1iiIilo);
/* 17 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 19 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 21 */            if (objI00000oIO != ii0111o) {
/* 24 */                objI00000oIO = ooiIlOl1iI;
                    }
                    return objI00000oIO == ii0111o ? objI00000oIO : ooiIlOl1iI;
                }

                public final Ol010l0o0O I0000Il00O() {
/* 11 */            return (Ol010l0o0O) ((OIooliIO0) this.I0000oI00.I000O01llI0).getValue();
                }

                public final Object I0000O(IOoil1iiIilo iOoil1iiIilo) {
                    Object objI00000oOI;
/* 1 */             Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iOIl;
/* 9 */             if (this.I00000oIO.contains(ol010l0o0O)) {
                        return (((Boolean) this.I0000Il00O.invoke(ol010l0o0O)).booleanValue() && (objI00000oOI = I00000oOI(ol010l0o0O, this.I000II, iOoil1iiIilo)) == Ii0111o.I00iOIl) ? objI00000oOI : OoiIlOl1iI.I00000oIO;
                    }
/* 41 */            I000II.I001IO000("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
/* 44 */            return null;
                }

                public final boolean I0000oI00() {
                    return ((OIooliIO0) this.I0000oI00.I000II).getValue() != Ol010l0o0O.I00iOIl;
                }

                public final Object I0001Ioi1lo(Oll0io oll0io) {
                    Object objI00000oOI;
/* 1 */             Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iiO;
/* 9 */             if (this.I00000oIO.contains(ol010l0o0O)) {
                        return (((Boolean) this.I0000Il00O.invoke(ol010l0o0O)).booleanValue() && (objI00000oOI = I00000oOI(ol010l0o0O, this.I000II, oll0io)) == Ii0111o.I00iOIl) ? objI00000oOI : OoiIlOl1iI.I00000oIO;
                    }
/* 41 */            I000II.I001IO000("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
/* 44 */            return null;
                }

                public final Object I000II(Oll0io oll0io) {
                    Object objI00000oOI;
/* 3 */             Ii1loIll001 ii1loIll001I0000Il00O = this.I0000oI00.I0000Il00O();
/* 7 */             Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iiO;
/* 13 */            if (!ii1loIll001I0000Il00O.I0000Il00O(ol010l0o0O)) {
/* 16 */                ol010l0o0O = Ol010l0o0O.I00iiI;
                    }
                    return (((Boolean) this.I0000Il00O.invoke(ol010l0o0O)).booleanValue() && (objI00000oOI = I00000oOI(ol010l0o0O, this.I0001Ioi1lo, oll0io)) == Ii0111o.I00iOIl) ? objI00000oOI : OoiIlOl1iI.I00000oIO;
                }
            }
