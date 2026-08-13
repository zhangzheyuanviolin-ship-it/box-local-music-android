            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            
            public final class Oii110oOoO extends I01O1lIi {
                public static final I110iOiOllO I00oII = new I110iOiOllO(0.0f);
                public static final I110iOiOllO I00oIiI10 = new I110iOiOllO(1.0f);
                public final OIooliIO0 I00iiI;
                public final OIooliIO0 I00iiO;
                public Object I00iio;
                public OoI1Oi0l1I0o I00ilI0I1;
                public long I00ilO0;
                public final OIOo1iiI I00io1l;
                public Ol1olI0o1I01 I00ioIO;
                public final OIooO1iiliI I00l0I0l0lO1;
                public IIoOoIol0Io0 I00l0OO0IO;
                public final OI1I0OoOl I00li1OI;
                public final OI11i1OO I00ll1;
                public long I00lli11;
                public final OI0oiiIO0 I00lll10;
                public Oii0iO0iOI I00o0iI0io1;
                public final Oii0i00Io I00o0l1o1o0;
                public float I00o101lO;
                public final Oii0i00Io I00oI0i;

                public Oii110oOoO(Object obj) {
/* 2 */             super(7);
/* 9 */             this.I00iiI = lOO00IiI0li.I00000oIO(obj);
/* 15 */            this.I00iiO = lOO00IiI0li.I00000oIO(obj);
/* 17 */            this.I00iio = obj;
/* 23 */            OIOo1iiI oIOo1iiI = new OIOo1iiI(23);
/* 26 */            oIOo1iiI.I00iiI = this;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            this.I00io1l = oIOo1iiI;
/* 39 */            this.I00l0I0l0lO1 = new OIooO1iiliI(0.0f);
/* 46 */            this.I00li1OI = new OI1I0OoOl();
/* 53 */            this.I00ll1 = new OI11i1OO();
/* 57 */            this.I00lli11 = Long.MIN_VALUE;
/* 64 */            this.I00lll10 = new OI0oiiIO0();
/* 69 */            Oii0i00Io oii0i00Io = new Oii0i00Io(0);
/* 72 */            oii0i00Io.I00iiI = this;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            this.I00o0l1o1o0 = oii0i00Io;
/* 82 */            Oii0i00Io oii0i00Io2 = new Oii0i00Io(1);
/* 85 */            oii0i00Io2.I00iiI = this;
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            this.I00oI0i = oii0i00Io2;
                }

                public static Object I010i10l(Oii110oOoO oii110oOoO, Object obj, Oll0io oll0io) {
                    Object objI00000oIO;
/* 1 */             OoI1Oi0l1I0o ooI1Oi0l1I0o = oii110oOoO.I00ilI0I1;
                    return (ooI1Oi0l1I0o != null && (objI00000oIO = OI11i1OO.I00000oIO(oii110oOoO.I00ll1, new Oii0l0IIIlI(oii110oOoO, obj, ooI1Oi0l1I0o, null, 0), oll0io)) == Ii0111o.I00iOIl) ? objI00000oIO : OoiIlOl1iI.I00000oIO;
                }

                public static void I010l10O(Oii0iO0iOI oii0iO0iOI, long j) {
/* 3 */             long j2 = oii0iO0iOI.I00000oIO + j;
/* 5 */             oii0iO0iOI.I00000oIO = j2;
/* 7 */             long j3 = oii0iO0iOI.I000O01llI0;
/* 13 */            if (j2 >= j3) {
/* 15 */                oii0iO0iOI.I0000O = 1.0f;
/* 17 */                return;
                    }
/* 18 */            OooI0100Oill oooI0100Oill = oii0iO0iOI.I00000oOI;
/* 20 */            I110iOiOllO i110iOiOllO = oii0iO0iOI.I0000oI00;
/* 23 */            if (oooI0100Oill == null) {
/* 58 */                float f = j2 / j3;
/* 64 */                oii0iO0iOI.I0000O = (f * 1.0f) + ((1.0f - f) * i110iOiOllO.I00000oIO(0));
/* 106 */               return;
                    }
/* 25 */            I110iOiOllO i110iOiOllO2 = oii0iO0iOI.I0001Ioi1lo;
/* 27 */            if (i110iOiOllO2 == null) {
/* 29 */                i110iOiOllO2 = I00oII;
                    }
/* 49 */            oii0iO0iOI.I0000O = lIiioliIlo.I00000oOI(((I110iOiOllO) oooI0100Oill.I00Io1lO(j2, i110iOiOllO, I00oIiI10, i110iOiOllO2)).I00000oIO(0), 0.0f, 1.0f);
                }

                @Override
                public final Object I00olI() {
/* 3 */             return this.I00iiO.getValue();
                }

                @Override
                public final Object I00oliIiO01i() {
/* 3 */             return this.I00iiI.getValue();
                }

                @Override
                public final void I00oooO(Object obj) {
/* 3 */             this.I00iiO.setValue(obj);
                }

                @Override
                public final void I0100i(OoI1Oi0l1I0o ooI1Oi0l1I0o) {
/* 1 */             OoI1Oi0l1I0o ooI1Oi0l1I0o2 = this.I00ilI0I1;
/* 3 */             if (ooI1Oi0l1I0o2 != null && !ooI1Oi0l1I0o.equals(ooI1Oi0l1I0o2)) {
/* 36 */                OO1olIl.I00000oOI("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.I00ilI0I1 + ", new instance: " + ooI1Oi0l1I0o);
                    }
/* 39 */            this.I00ilI0I1 = ooI1Oi0l1I0o;
                }

                @Override
                public final void I0100o111I() {
/* 2 */             this.I00ilI0I1 = null;
/* 4 */             Ol1olI0o1I01 ol1olI0o1I01 = this.I00ioIO;
/* 6 */             if (ol1olI0o1I01 != null) {
/* 8 */                 ol1olI0o1I01.I00000oOI(this);
                    }
                }

                public final Object I010OIo1l(IOoilo iOoilo) throws Throwable {
/* 5 */             float fI000O01llI0 = lOiIo0.I000O01llI0(iOoilo.getContext());
/* 12 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 14 */            if (fI000O01llI0 <= 0.0f) {
/* 16 */                I010iIIOlo();
/* 19 */                return ooiIlOl1iI;
                    }
/* 20 */            this.I00o101lO = fI000O01llI0;
/* 32 */            Object objI00000oIO = l1i0lii.I00000oIO(iOoilo.getContext()).I00000oIO(iOoilo, this.I00oI0i);
                    return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : ooiIlOl1iI;
                }

                public final void I010iIIOlo() {
/* 1 */             OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00ilI0I1;
/* 3 */             if (ooI1Oi0l1I0o != null) {
/* 5 */                 ooI1Oi0l1I0o.I0000Il00O();
                    }
/* 10 */            this.I00lll10.I0000oI00();
/* 15 */            if (this.I00o0iI0io1 != null) {
/* 18 */                this.I00o0iI0io1 = null;
/* 22 */                I010o0o0oO(1.0f);
/* 25 */                I010lI0oi();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010ioo() {
/* 1 */             OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00ilI0I1;
/* 3 */             if (ooI1Oi0l1I0o == null) {
/* 5 */                 return;
                    }
/* 6 */             Oii0iO0iOI oii0iO0iOI = this.I00o0iI0io1;
/* 9 */             if (oii0iO0iOI == null) {
/* 17 */                if (this.I00ilO0 > 0) {
/* 19 */                    OIooO1iiliI oIooO1iiliI = this.I00l0I0l0lO1;
/* 29 */                    if (oIooO1iiliI.I000II() == 1.0f || O0000Ioio00.I0000O(this.I00iiO.getValue(), this.I00iiI.getValue())) {
/* 94 */                        oii0iO0iOI = null;
                            } else {
/* 53 */                        Oii0iO0iOI oii0iO0iOI2 = new Oii0iO0iOI();
/* 60 */                        oii0iO0iOI2.I0000O = oIooO1iiliI.I000II();
/* 62 */                        long j = this.I00ilO0;
/* 64 */                        oii0iO0iOI2.I000II = j;
/* 80 */                        oii0iO0iOI2.I000O01llI0 = O1OooO0IlOo.I000O01llI0((1.0d - oIooO1iiliI.I000II()) * j);
/* 89 */                        oii0iO0iOI2.I0000oI00.I0000oI00(0, oIooO1iiliI.I000II());
/* 92 */                        oii0iO0iOI = oii0iO0iOI2;
                            }
                        }
                    }
/* 95 */            if (oii0iO0iOI != null) {
/* 99 */                oii0iO0iOI.I000II = this.I00ilO0;
/* 103 */               this.I00lll10.I00000oOI(oii0iO0iOI);
/* 106 */               ooI1Oi0l1I0o.I000oI1ioi(oii0iO0iOI);
                    }
/* 109 */           this.I00o0iI0io1 = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I010l1O(IOoilo iOoilo) throws Throwable {
                    Oii0lI11001O oii0lI11001O;
/* 3 */             if (iOoilo instanceof Oii0lI11001O) {
/* 6 */                 oii0lI11001O = (Oii0lI11001O) iOoilo;
/* 8 */                 int i = oii0lI11001O.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oii0lI11001O.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oii0lI11001O = new Oii0lI11001O(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oii0lI11001O.I00iOIl;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = oii0lI11001O.I00iiO;
/* 31 */            OI0oiiIO0 oI0oiiIO0 = this.I00lll10;
/* 37 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 39 */            if (i2 == 0) {
/* 57 */                lIoii1l01l0i.I00000oOI(obj);
/* 64 */                if (oI0oiiIO0.I000OOo1O() && this.I00o0iI0io1 == null) {
/* 70 */                    return ooiIlOl1iI;
                        }
/* 82 */                if (lOiIo0.I000O01llI0(oii0lI11001O.getContext()) == 0.0f) {
/* 84 */                    I010iIIOlo();
/* 87 */                    this.I00lli11 = Long.MIN_VALUE;
/* 89 */                    return ooiIlOl1iI;
                        }
/* 94 */                if (this.I00lli11 == Long.MIN_VALUE) {
/* 96 */                    oii0lI11001O.I00iiO = 1;
/* 112 */                   if (l1i0lii.I00000oIO(oii0lI11001O.getContext()).I00000oIO(oii0lI11001O, this.I00o0l1o1o0) != obj2) {
                            }
                        }
/* 168 */               return obj2;
                    }
/* 41 */            if (i2 != 1 && i2 != 2) {
/* 48 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                return null;
                    }
/* 53 */            lIoii1l01l0i.I00000oOI(obj);
/* 135 */           do {
/* 119 */               if (!oI0oiiIO0.I000OiO() && this.I00o0iI0io1 == null) {
/* 126 */                   this.I00lli11 = Long.MIN_VALUE;
/* 128 */                   return ooiIlOl1iI;
                        }
/* 129 */               oii0lI11001O.I00iiO = 2;
/* 135 */           } while (I010OIo1l(oii0lI11001O) != obj2);
/* 168 */           return obj2;
                }

                public final Object I010l1ol111(float f, Object obj, Oll0io oll0io) {
/* 4 */             if (0.0f > f || f > 1.0f) {
/* 27 */                OO1olIl.I00000oIO("Expecting fraction between 0 and 1. Got " + f);
                    }
/* 30 */            OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00ilI0I1;
/* 32 */            if (ooI1Oi0l1I0o != null) {
/* 52 */                Object objI00000oIO = OI11i1OO.I00000oIO(this.I00ll1, new Oii0o0(obj, this.I00iiI.getValue(), this, ooI1Oi0l1I0o, f, null), oll0io);
/* 58 */                if (objI00000oIO == Ii0111o.I00iOIl) {
/* 60 */                    return objI00000oIO;
                        }
                    }
/* 61 */            return OoiIlOl1iI.I00000oIO;
                }

                public final void I010lI0oi() {
/* 1 */             OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00ilI0I1;
/* 3 */             if (ooI1Oi0l1I0o == null) {
/* 5 */                 return;
                    }
/* 23 */            ooI1Oi0l1I0o.I000o00OoI0I(O1OooO0IlOo.I000O01llI0(this.I00l0I0l0lO1.I000II() * ooI1Oi0l1I0o.I000II()));
                }

                public final void I010o0o0oO(float f) {
/* 3 */             this.I00l0I0l0lO1.I000O01llI0(f);
                }

                public final void I010oio1OO0(Ol1olI0o1I01 ol1olI0o1I01) {
                    I0IOIlIOIII i0IOIlIOIII;
/* 7 */             if (O0000Ioio00.I0000O(this.I00ioIO, ol1olI0o1I01)) {
/* 77 */                return;
                    }
/* 9 */             Ol1olI0o1I01 ol1olI0o1I012 = this.I00ioIO;
/* 11 */            if (ol1olI0o1I012 != null) {
/* 13 */                ol1olI0o1I012.I00000oOI(this);
                    }
/* 16 */            Ol1olI0o1I01 ol1olI0o1I013 = this.I00ioIO;
/* 18 */            if (ol1olI0o1I013 != null && (i0IOIlIOIII = ol1olI0o1I013.I000O01llI0) != null) {
/* 24 */                i0IOIlIOIII.I000II();
                    }
/* 27 */            this.I00ioIO = ol1olI0o1I01;
/* 29 */            if (ol1olI0o1I01 != null) {
/* 31 */                ol1olI0o1I01.I0001Ioi1lo();
                    }
/* 34 */            Ol1olI0o1I01 ol1olI0o1I014 = this.I00ioIO;
/* 36 */            if (ol1olI0o1I014 != null) {
/* 42 */                ol1olI0o1I014.I0000oI00(this, iO1IIloiOoiO.I00000oIO, this.I00io1l);
                    }
                }

                public final Object I01101IOlO(Object obj, Oll0io oll0io) {
/* 1 */             OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00ilI0I1;
/* 3 */             if (ooI1Oi0l1I0o != null && (!O0000Ioio00.I0000O(this.I00iiO.getValue(), obj) || !O0000Ioio00.I0000O(this.I00iiI.getValue(), obj))) {
/* 42 */                Object objI00000oIO = OI11i1OO.I00000oIO(this.I00ll1, new Oii0l0IIIlI(this, obj, ooI1Oi0l1I0o, null, 1), oll0io);
/* 48 */                if (objI00000oIO == Ii0111o.I00iOIl) {
/* 50 */                    return objI00000oIO;
                        }
                    }
/* 51 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I01101olii(IOoilo iOoilo) throws Throwable {
                    Oii0ooio0O1 oii0ooio0O1;
                    Object value;
                    Object obj;
/* 3 */             if (iOoilo instanceof Oii0ooio0O1) {
/* 6 */                 oii0ooio0O1 = (Oii0ooio0O1) iOoilo;
/* 8 */                 int i = oii0ooio0O1.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oii0ooio0O1.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oii0ooio0O1 = new Oii0ooio0O1(this, iOoilo);
                        }
                    }
/* 25 */            Object obj2 = oii0ooio0O1.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oii0ooio0O1.I00iio;
/* 32 */            OI1I0OoOl oI1I0OoOl = this.I00li1OI;
/* 36 */            if (i2 == 0) {
/* 61 */                lIoii1l01l0i.I00000oOI(obj2);
/* 66 */                value = this.I00iiI.getValue();
/* 70 */                oii0ooio0O1.I00iOIl = value;
/* 72 */                oii0ooio0O1.I00iio = 1;
/* 78 */                if (oI1I0OoOl.I00000oIO(oii0ooio0O1) != ii0111o) {
                        }
/* 108 */               return ii0111o;
                    }
/* 38 */            if (i2 != 1) {
/* 40 */                if (i2 != 2) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 42 */                obj = oii0ooio0O1.I00iOIl;
/* 44 */                lIoii1l01l0i.I00000oOI(obj2);
/* 116 */               if (!O0000Ioio00.I0000O(obj2, obj)) {
/* 118 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 123 */               this.I00lli11 = Long.MIN_VALUE;
/* 168 */               throw new CancellationException("targetState while waiting for composition");
                    }
/* 54 */            Object obj3 = oii0ooio0O1.I00iOIl;
/* 56 */            lIoii1l01l0i.I00000oOI(obj2);
/* 59 */            value = obj3;
/* 81 */            oii0ooio0O1.I00iOIl = value;
/* 83 */            oii0ooio0O1.I00iio = 2;
/* 91 */            IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(oii0ooio0O1));
/* 94 */            iIoOoIol0Io0.I00111O();
/* 97 */            this.I00l0OO0IO = iIoOoIol0Io0;
/* 99 */            oI1I0OoOl.I00000oOI(null);
/* 102 */           Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 106 */           if (objI0010I0i != ii0111o) {
/* 110 */               obj = value;
/* 111 */               obj2 = objI0010I0i;
/* 116 */               if (!O0000Ioio00.I0000O(obj2, obj)) {
                        }
                    }
/* 108 */           return ii0111o;
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0110OiO(IOoilo iOoilo) throws Throwable {
                    Oii101 oii101;
                    Object value;
                    Object obj;
/* 3 */             if (iOoilo instanceof Oii101) {
/* 6 */                 oii101 = (Oii101) iOoilo;
/* 8 */                 int i = oii101.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oii101.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oii101 = new Oii101(this, iOoilo);
                        }
                    }
/* 25 */            Object obj2 = oii101.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oii101.I00iio;
/* 33 */            OI1I0OoOl oI1I0OoOl = this.I00li1OI;
/* 36 */            if (i2 == 0) {
/* 61 */                lIoii1l01l0i.I00000oOI(obj2);
/* 66 */                value = this.I00iiI.getValue();
/* 70 */                oii101.I00iOIl = value;
/* 72 */                oii101.I00iio = 1;
/* 78 */                if (oI1I0OoOl.I00000oIO(oii101) != ii0111o) {
                        }
/* 120 */               return ii0111o;
                    }
/* 38 */            if (i2 != 1) {
/* 40 */                if (i2 != 2) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 42 */                obj = oii101.I00iOIl;
/* 44 */                lIoii1l01l0i.I00000oOI(obj2);
/* 128 */               if (!O0000Ioio00.I0000O(obj2, obj)) {
/* 135 */                   this.I00lli11 = Long.MIN_VALUE;
/* 168 */                   throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
/* 130 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 54 */            Object obj3 = oii101.I00iOIl;
/* 56 */            lIoii1l01l0i.I00000oOI(obj2);
/* 59 */            value = obj3;
/* 87 */            if (O0000Ioio00.I0000O(value, this.I00iio)) {
/* 89 */                oI1I0OoOl.I00000oOI(null);
/* 130 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 93 */            oii101.I00iOIl = value;
/* 95 */            oii101.I00iio = 2;
/* 103 */           IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(oii101));
/* 106 */           iIoOoIol0Io0.I00111O();
/* 109 */           this.I00l0OO0IO = iIoOoIol0Io0;
/* 111 */           oI1I0OoOl.I00000oOI(null);
/* 114 */           Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 118 */           if (objI0010I0i != ii0111o) {
/* 122 */               obj = value;
/* 123 */               obj2 = objI0010I0i;
/* 128 */               if (!O0000Ioio00.I0000O(obj2, obj)) {
                        }
/* 130 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 120 */           return ii0111o;
                }
            }
