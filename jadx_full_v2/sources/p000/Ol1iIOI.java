            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol1iIOI implements IlOIll0o11Ii {
                public Ol1iiOol0 I00000oIO;
                public Ii1OoIll0 I00000oOI;
                public I110IiI0o1Il I0000Il00O;
                public Iii1i0i0lllo I0000O;

                @Override
                public Object I00000oIO(OiOiliiO oiOiliiO, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             return I0000Il00O(oiOiliiO, f, iO11i1liO1l.I00000oIO, (IOoilo) iOoil1iiIilo);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(OiOiliiO oiOiliiO, float f, Function1 function1, IOoilo iOoilo) throws Throwable {
                    Ol1i0liOII ol1i0liOII;
                    Function1 function12;
/* 3 */             if (iOoilo instanceof Ol1i0liOII) {
/* 6 */                 ol1i0liOII = (Ol1i0liOII) iOoilo;
/* 8 */                 int i = ol1i0liOII.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol1i0liOII.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ol1i0liOII = new Ol1i0liOII(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000oI00 = ol1i0liOII.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ol1i0liOII.I00iio;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 52 */                Iii1i0i0lllo iii1i0i0lllo = this.I0000O;
/* 61 */                Ii1oIO ii1oIO = new Ii1oIO(this, f, function1, oiOiliiO, null);
/* 64 */                ol1i0liOII.I00iOIl = function1;
/* 66 */                ol1i0liOII.I00iio = 1;
/* 68 */                objI0000oI00 = iOi1II01i0.I0000oI00(iii1i0i0lllo, ii1oIO, ol1i0liOII);
/* 72 */                if (objI0000oI00 == ii0111o) {
/* 74 */                    return ii0111o;
                        }
/* 75 */                function12 = function1;
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                function12 = ol1i0liOII.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
                    }
/* 76 */            I1101l i1101l = (I1101l) objI0000oI00;
/* 84 */            function12.invoke(new Float(0.0f));
/* 204 */           return i1101l;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(OiOiliiO oiOiliiO, float f, Function1 function1, IOoilo iOoilo) throws Throwable {
                    Ol1i110i1il ol1i110i1il;
/* 3 */             if (iOoilo instanceof Ol1i110i1il) {
/* 6 */                 ol1i110i1il = (Ol1i110i1il) iOoilo;
/* 8 */                 int i = ol1i110i1il.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol1i110i1il.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ol1i110i1il = new Ol1i110i1il(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oOI = ol1i110i1il.I00iOIl;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = ol1i110i1il.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 50 */                ol1i110i1il.I00iiO = 1;
/* 52 */                objI00000oOI = I00000oOI(oiOiliiO, f, function1, ol1i110i1il);
/* 56 */                if (objI00000oOI == obj) {
/* 58 */                    return obj;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
                    }
/* 59 */            I1101l i1101l = (I1101l) objI00000oOI;
/* 87 */            return new Float(i1101l.I00000oIO.floatValue() != 0.0f ? ((Number) i1101l.I00000oOI.I00000oIO()).floatValue() : 0.0f);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(OiOiliiO oiOiliiO, float f, float f2, Ol1i0oil0 ol1i0oil0, IOoilo iOoilo) throws Throwable {
                    Ol1iIIOoO ol1iIIOoO;
                    Oi00IilOloo0 oi00IilOloo0;
/* 3 */             if (iOoilo instanceof Ol1iIIOoO) {
/* 6 */                 ol1iIIOoO = (Ol1iIIOoO) iOoilo;
/* 8 */                 int i = ol1iIIOoO.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol1iIIOoO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    ol1iIIOoO = new Ol1iIIOoO(this, iOoilo);
                        }
                    }
/* 19 */            Ol1iIIOoO ol1iIIOoO2 = ol1iIIOoO;
/* 27 */            Object objI001IIilI0O = ol1iIIOoO2.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ol1iIIOoO2.I00iiO;
/* 34 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI001IIilI0O);
/* 59 */                if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
/* 72 */                    return iOO0I0.I00000oIO(f, f2, 28);
                        }
/* 77 */                ol1iIIOoO2.I00iiO = 1;
/* 79 */                Ii1OoIll0 ii1OoIll0 = this.I00000oOI;
/* 95 */                if (Math.abs(il0OoiI.I00000oIO(ii1OoIll0, 0.0f, f2)) >= Math.abs(f)) {
/* 101 */                   O1OIll00i o1OIll00i = new O1OIll00i(9);
/* 104 */                   o1OIll00i.I00iiI = ii1OoIll0;
/* 106 */                   VarHandle.storeStoreFence();
                            oi00IilOloo0 = o1OIll00i;
                        } else {
/* 113 */                   I110IiI0o1Il i110IiI0o1Il = this.I0000Il00O;
/* 115 */                   Oi00IilOloo0 oi00IilOloo02 = new Oi00IilOloo0();
/* 118 */                   oi00IilOloo02.I00iOIl = i110IiI0o1Il;
/* 120 */                   VarHandle.storeStoreFence();
/* 123 */                   oi00IilOloo0 = oi00IilOloo02;
                        }
/* 136 */               objI001IIilI0O = oi00IilOloo0.I001IIilI0O(oiOiliiO, new Float(f), new Float(f2), ol1i0oil0, ol1iIIOoO2);
/* 140 */               if (objI001IIilI0O == ii0111o) {
/* 142 */                   return ii0111o;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 38 */                lIoii1l01l0i.I00000oOI(objI001IIilI0O);
                    }
/* 145 */           return ((I1101l) objI001IIilI0O).I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Ol1iIOI)) {
/* 39 */                return false;
                    }
/* 5 */             Ol1iIOI ol1iIOI = (Ol1iIOI) obj;
                    return O0000Ioio00.I0000O(ol1iIOI.I0000Il00O, this.I0000Il00O) && O0000Ioio00.I0000O(ol1iIOI.I00000oOI, this.I00000oOI) && ol1iIOI.I00000oIO.equals(this.I00000oIO);
                }

                public final int hashCode() {
/* 24 */            return this.I00000oIO.hashCode() + ((this.I00000oOI.hashCode() + (this.I0000Il00O.hashCode() * 31)) * 31);
                }
            }
