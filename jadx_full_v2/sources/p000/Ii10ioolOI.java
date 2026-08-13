            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.jvm.functions.Function1;
            
            public final class Ii10ioolOI {
                public Object I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;
                public Object I000II;
                public Object I000O01llI0;
                public Object I000OOo1O;
                public Object I000OiO;
                public Object I000iOII;
                public Object I000l1;
                public Object I000lI;

                public Ii10ioolOI(IoIlI1oli ioIlI1oli, String str, O0l0IlolloIO o0l0IlolloIO, int i) {
/* 9 */             IlliIlI oiioI1Io0o = (i & 8) != 0 ? new OiioI1Io0o(15) : o0l0IlolloIO;
/* 21 */            this.I00000oIO = new I01iOOoiOI(0);
/* 29 */            this.I00000oOI = new I01OoIoio00O(1);
/* 36 */            this.I0000Il00O = new IOi10loi();
/* 45 */            this.I0000O = new I00oI0i(this, (IOoil1iiIilo) null, 2);
/* 47 */            this.I0000oI00 = ioIlI1oli;
/* 49 */            this.I0001Ioi1lo = str;
/* 51 */            this.I000II = oiioI1Io0o;
/* 58 */            this.I000OOo1O = new AtomicBoolean(false);
/* 72 */            this.I000l1 = new OllO00oiil(new Oi1O00OI(29));
                }

                /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
                
                    if (r14.invoke(r2, r0) == r1) goto L40;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
                
                    if (r12.invoke(r13, r0) == r1) goto L40;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000O(OOo0ooi oOo0ooi, OOo0ooi oOo0ooi2, Ii10ioolOI ii10ioolOI, StringBuilder sb, Function1 function1, Oi0IO1ii011 oi0IO1ii011, String str, IOoilo iOoilo) throws Throwable {
                    OlOiII10II olOiII10II;
                    Object objI00000oIO;
/* 3 */             if (iOoilo instanceof OlOiII10II) {
/* 6 */                 olOiII10II = (OlOiII10II) iOoilo;
/* 8 */                 int i = olOiII10II.I00io1l;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    olOiII10II.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    olOiII10II = new OlOiII10II(iOoilo);
                        }
                    }
/* 25 */            Object obj = olOiII10II.I00ilO0;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = olOiII10II.I00io1l;
/* 34 */            if (i2 == 0) {
/* 68 */                lIoii1l01l0i.I00000oOI(obj);
/* 73 */                String str2 = (String) oOo0ooi.I00iOIl;
/* 75 */                if (str2 != null) {
/* 77 */                    ii10ioolOI.I000lI = str2;
/* 79 */                    if (function1 != null) {
/* 81 */                        function1.invoke(str2);
                            }
                        }
/* 84 */                Object obj2 = oOo0ooi2.I00iOIl;
/* 86 */                if (obj2 == null || obj2.equals("message")) {
                            try {
/* 96 */                        O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 100 */                       i1i0olI i1i0oli = o011OoiO1I00000oIO.I00000oOI;
/* 114 */                       objI00000oIO = (O00OoO) o011OoiO1I00000oIO.I00000oOI(O00OoO.Companion.serializer(), str);
                            } catch (Throwable th) {
/* 118 */                       objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                            }
/* 124 */                   if (!(objI00000oIO instanceof Oi10Ii1i1lo)) {
/* 127 */                       O00OoO o00OoO = (O00OoO) objI00000oIO;
/* 129 */                       if (oi0IO1ii011 == null || !(o00OoO instanceof O00illI0o000)) {
/* 169 */                           IlliIl1l11O illiIl1l11O = (IlliIl1l11O) ii10ioolOI.I0000O;
/* 171 */                           olOiII10II.I00iOIl = oOo0ooi;
/* 173 */                           olOiII10II.I00iiI = oOo0ooi2;
/* 175 */                           olOiII10II.I00iiO = ii10ioolOI;
/* 177 */                           olOiII10II.I00iio = sb;
/* 179 */                           olOiII10II.I00ilI0I1 = objI00000oIO;
/* 181 */                           olOiII10II.I00io1l = 2;
                                } else {
/* 137 */                           IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) ii10ioolOI.I0000O;
/* 145 */                           O00illI0o000 o00illI0o000 = new O00illI0o000(oi0IO1ii011, ((O00illI0o000) o00OoO).I00000oOI);
/* 148 */                           olOiII10II.I00iOIl = oOo0ooi;
/* 150 */                           olOiII10II.I00iiI = oOo0ooi2;
/* 152 */                           olOiII10II.I00iiO = ii10ioolOI;
/* 154 */                           olOiII10II.I00iio = sb;
/* 156 */                           olOiII10II.I00ilI0I1 = objI00000oIO;
/* 158 */                           olOiII10II.I00io1l = 1;
                                }
                            }
                        }
/* 196 */               oOo0ooi.I00iOIl = null;
/* 198 */               oOo0ooi2.I00iOIl = null;
/* 201 */               sb.setLength(0);
/* 204 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 36 */            if (i2 != 1 && i2 != 2) {
/* 43 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 47 */            Object obj3 = olOiII10II.I00ilI0I1;
/* 49 */            sb = olOiII10II.I00iio;
/* 51 */            Ii10ioolOI ii10ioolOI2 = olOiII10II.I00iiO;
/* 53 */            OOo0ooi oOo0ooi3 = olOiII10II.I00iiI;
/* 55 */            OOo0ooi oOo0ooi4 = olOiII10II.I00iOIl;
/* 57 */            lIoii1l01l0i.I00000oOI(obj);
/* 61 */            objI00000oIO = obj3;
/* 62 */            oOo0ooi = oOo0ooi4;
/* 64 */            ii10ioolOI = ii10ioolOI2;
/* 65 */            oOo0ooi2 = oOo0ooi3;
/* 190 */           Throwable thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 194 */           if (thI00000oOI != null) {
/* 211 */               ((Function1) ii10ioolOI.I00000oOI).invoke(thI00000oOI);
/* 294 */               throw thI00000oOI;
                    }
/* 196 */           oOo0ooi.I00iOIl = null;
/* 198 */           oOo0ooi2.I00iOIl = null;
/* 201 */           sb.setLength(0);
/* 204 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
                
                    if (p000.l01oO1iOo.I0000Il00O(r11, r1) == r2) goto L34;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oIO(IOoilo iOoilo) throws Throwable {
                    OlOOlIOO0IOl olOOlIOO0IOl;
/* 3 */             AtomicBoolean atomicBoolean = (AtomicBoolean) this.I000OOo1O;
/* 7 */             if (iOoilo instanceof OlOOlIOO0IOl) {
/* 10 */                olOOlIOO0IOl = (OlOOlIOO0IOl) iOoilo;
/* 12 */                int i = olOOlIOO0IOl.I00iiO;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    olOOlIOO0IOl.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    olOOlIOO0IOl = new OlOOlIOO0IOl(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = olOOlIOO0IOl.I00iOIl;
/* 31 */            Object obj2 = Ii0111o.I00iOIl;
/* 33 */            int i2 = olOOlIOO0IOl.I00iiO;
/* 36 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
                    } catch (Exception unused) {
                    } catch (Throwable th) {
/* 142 */               atomicBoolean.set(false);
/* 149 */               ((IllOOo00lI) this.I00000oIO).invoke();
/* 186 */               throw th;
                    }
/* 41 */            if (i2 == 0) {
/* 63 */                lIoii1l01l0i.I00000oOI(obj);
/* 70 */                if (!atomicBoolean.get()) {
/* 72 */                    return ooiIlOl1iI;
                        }
/* 82 */                OlOiOI1oII1.I00000oIO.I000II(new Oi1O00OI(28));
/* 85 */                olOOlIOO0IOl.I00iiO = 1;
/* 91 */                if (I000OOo1O(olOOlIOO0IOl) == obj2) {
                        }
/* 117 */               return obj2;
                    }
/* 43 */            if (i2 != 1) {
/* 45 */                if (i2 != 2) {
/* 55 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 128 */               il001oo1.I00000oOI((Ii0110) ((OllO00oiil) this.I000l1).getValue(), null);
/* 131 */               atomicBoolean.set(false);
/* 138 */               ((IllOOo00lI) this.I00000oIO).invoke();
/* 141 */               return ooiIlOl1iI;
                    }
/* 59 */            lIoii1l01l0i.I00000oOI(obj);
/* 96 */            IOO01l iOO01l = (IOO01l) this.I000OiO;
/* 98 */            if (iOO01l != null) {
/* 100 */               il001oo1.I00000oOI(iOO01l, null);
                    }
/* 105 */           OlIl0i olIl0i = (OlIl0i) this.I000iOII;
/* 107 */           if (olIl0i != null) {
/* 109 */               olOOlIOO0IOl.I00iiO = 2;
                    }
/* 128 */           il001oo1.I00000oOI((Ii0110) ((OllO00oiil) this.I000l1).getValue(), null);
/* 131 */           atomicBoolean.set(false);
/* 138 */           ((IllOOo00lI) this.I00000oIO).invoke();
/* 141 */           return ooiIlOl1iI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r4v8 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oOI(IOO01l iOO01l, Oi0IO1ii011 oi0IO1ii011, Function1 function1, IOoilo iOoilo) throws Throwable {
                    OlOOoI1iO0 olOOoI1iO0;
/* 3 */             if (iOoilo instanceof OlOOoI1iO0) {
/* 6 */                 olOOoI1iO0 = (OlOOoI1iO0) iOoilo;
/* 8 */                 int i = olOOoI1iO0.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    olOOoI1iO0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    olOOoI1iO0 = new OlOOoI1iO0(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = olOOoI1iO0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = olOOoI1iO0.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 54 */                    IlOil1ii ilOil1iiI000l1 = iOO01l.I00iOIl.I000l1();
/* 61 */                    I0l0lIoI i0l0lIoI = new I0l0lIoI(6);
/* 64 */                    i0l0lIoI.I00iiI = this;
/* 66 */                    i0l0lIoI.I00iiO = function1;
/* 68 */                    i0l0lIoI.I00iio = oi0IO1ii011;
/* 70 */                    VarHandle.storeStoreFence();
/* 73 */                    olOOoI1iO0.I00iiO = 1;
/* 75 */                    Object objI00000oIO = ilOil1iiI000l1.I00000oIO(i0l0lIoI, olOOoI1iO0);
                            this = objI00000oIO;
/* 79 */                    if (objI00000oIO == ii0111o) {
/* 81 */                        return ii0111o;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 44 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                        return null;
                            }
/* 36 */                    lIoii1l01l0i.I00000oOI(obj);
                            this = this;
                        }
                    } catch (CancellationException unused) {
                    } catch (Throwable th) {
/* 86 */                ((Function1) this.I00000oOI).invoke(th);
                    }
/* 89 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
                
                    if (r4 == r11) goto L35;
                 */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00fa -> B:37:0x00fe). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0147 -> B:22:0x00ae). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000Il00O(Ii1olII1lO1 ii1olII1lO1, Oi0IO1ii011 oi0IO1ii011, Function1 function1, IOoilo iOoilo) throws Throwable {
                    OlOiI0io0I olOiI0io0I;
                    Ii10ioolOI ii10ioolOI;
                    Oi0IO1ii011 oi0IO1ii0112;
                    Function1 function12;
                    Object objI00000oIO;
                    IIIoloiiI1 iIIoloiiI1;
                    StringBuilder sb;
                    OOo0ooi oOo0ooi;
                    Function1 function13;
                    OOo0ooi oOo0ooi2;
                    OlOiI0io0I olOiI0io0I2;
                    Oi0IO1ii011 oi0IO1ii0113;
                    OOo0ooi oOo0ooi3;
                    IIIoloiiI1 iIIoloiiI12;
                    String str;
/* 1 */             Ii1olII1lO1 ii1olII1lO12 = ii1olII1lO1;
/* 7 */             if (iOoilo instanceof OlOiI0io0I) {
/* 10 */                olOiI0io0I = (OlOiI0io0I) iOoilo;
/* 12 */                int i = olOiI0io0I.I00l0OO0IO;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    olOiI0io0I.I00l0OO0IO = i - Integer.MIN_VALUE;
/* 23 */                    ii10ioolOI = this;
                        } else {
/* 28 */                    ii10ioolOI = this;
/* 30 */                    olOiI0io0I = new OlOiI0io0I(ii10ioolOI, iOoilo);
                        }
                    }
/* 33 */            Object obj = olOiI0io0I.I00ioIO;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i2 = olOiI0io0I.I00l0OO0IO;
/* 42 */            if (i2 == 0) {
/* 121 */               lIoii1l01l0i.I00000oOI(obj);
/* 133 */               OlOiOI1oII1.I00000oIO.I00000oOI(new Oi1O00OI(24));
/* 136 */               olOiI0io0I.I00iOIl = ii1olII1lO12;
/* 138 */               oi0IO1ii0112 = oi0IO1ii011;
/* 140 */               olOiI0io0I.I00iiI = oi0IO1ii0112;
/* 142 */               function12 = function1;
/* 144 */               olOiI0io0I.I00iiO = function12;
/* 146 */               olOiI0io0I.I00l0OO0IO = 1;
/* 148 */               objI00000oIO = io0OoioI0O1.I00000oIO(ii1olII1lO12, olOiI0io0I);
                    } else {
/* 44 */                if (i2 != 1) {
/* 46 */                    if (i2 == 2) {
/* 82 */                        OOo0ooi oOo0ooi4 = olOiI0io0I.I00io1l;
/* 84 */                        oOo0ooi2 = olOiI0io0I.I00ilO0;
/* 86 */                        StringBuilder sb2 = olOiI0io0I.I00ilI0I1;
/* 88 */                        IIIoloiiI1 iIIoloiiI13 = olOiI0io0I.I00iio;
/* 90 */                        function13 = olOiI0io0I.I00iiO;
/* 92 */                        oi0IO1ii0113 = olOiI0io0I.I00iiI;
/* 94 */                        Ii1olII1lO1 ii1olII1lO13 = olOiI0io0I.I00iOIl;
/* 96 */                        lIoii1l01l0i.I00000oOI(obj);
/* 99 */                        olOiI0io0I2 = olOiI0io0I;
/* 100 */                       iIIoloiiI12 = iIIoloiiI13;
/* 101 */                       sb = sb2;
/* 102 */                       oOo0ooi3 = oOo0ooi4;
/* 103 */                       ii1olII1lO12 = ii1olII1lO13;
/* 212 */                       str = (String) obj;
/* 214 */                       if (str != null) {
                                }
/* 336 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 48 */                    if (i2 != 3) {
/* 77 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 80 */                        return null;
                            }
/* 50 */                    OOo0ooi oOo0ooi5 = olOiI0io0I.I00io1l;
/* 52 */                    oOo0ooi2 = olOiI0io0I.I00ilO0;
/* 54 */                    StringBuilder sb3 = olOiI0io0I.I00ilI0I1;
/* 56 */                    IIIoloiiI1 iIIoloiiI14 = olOiI0io0I.I00iio;
/* 58 */                    function13 = olOiI0io0I.I00iiO;
/* 60 */                    Oi0IO1ii011 oi0IO1ii0114 = olOiI0io0I.I00iiI;
/* 62 */                    Ii1olII1lO1 ii1olII1lO14 = olOiI0io0I.I00iOIl;
/* 64 */                    lIoii1l01l0i.I00000oOI(obj);
/* 68 */                    sb = sb3;
/* 69 */                    iIIoloiiI1 = iIIoloiiI14;
/* 70 */                    oi0IO1ii0112 = oi0IO1ii0114;
/* 71 */                    oOo0ooi = oOo0ooi5;
/* 72 */                    ii1olII1lO12 = ii1olII1lO14;
/* 255 */                   ii10ioolOI = this;
/* 179 */                   if (!iIIoloiiI1.I000O01llI0()) {
/* 181 */                       olOiI0io0I.I00iOIl = ii1olII1lO12;
/* 183 */                       olOiI0io0I.I00iiI = oi0IO1ii0112;
/* 185 */                       olOiI0io0I.I00iiO = function13;
/* 187 */                       olOiI0io0I.I00iio = iIIoloiiI1;
/* 189 */                       olOiI0io0I.I00ilI0I1 = sb;
/* 191 */                       olOiI0io0I.I00ilO0 = oOo0ooi2;
/* 193 */                       olOiI0io0I.I00io1l = oOo0ooi;
/* 195 */                       olOiI0io0I.I00l0OO0IO = 2;
/* 200 */                       Object objI000lI = iOiOOIlI1o01.I000lI(iIIoloiiI1, Integer.MAX_VALUE, olOiI0io0I);
/* 204 */                       if (objI000lI != ii0111o) {
/* 207 */                           olOiI0io0I2 = olOiI0io0I;
/* 208 */                           iIIoloiiI12 = iIIoloiiI1;
/* 209 */                           oOo0ooi3 = oOo0ooi;
/* 210 */                           oi0IO1ii0113 = oi0IO1ii0112;
/* 211 */                           obj = objI000lI;
/* 212 */                           str = (String) obj;
/* 214 */                           if (str != null) {
/* 222 */                               if (str.length() != 0) {
/* 265 */                                   if (OlOolloIIOl0.I000l1(str, "id:", false)) {
/* 279 */                                       oOo0ooi2.I00iOIl = OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(str, "id:", str)).toString();
                                            } else if (OlOolloIIOl0.I000l1(str, "event:", false)) {
/* 302 */                                       oOo0ooi3.I00iOIl = OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(str, "event:", str)).toString();
                                            } else if (OlOolloIIOl0.I000l1(str, "data:", false)) {
/* 325 */                                       sb.append(OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(str, "data:", str)).toString());
                                            }
/* 328 */                                   ii10ioolOI = this;
/* 330 */                                   oi0IO1ii0112 = oi0IO1ii0113;
/* 331 */                                   oOo0ooi = oOo0ooi3;
/* 332 */                                   iIIoloiiI1 = iIIoloiiI12;
/* 333 */                                   olOiI0io0I = olOiI0io0I2;
/* 179 */                                   if (!iIIoloiiI1.I000O01llI0()) {
                                            }
                                        } else {
/* 224 */                                   String string = sb.toString();
/* 228 */                                   olOiI0io0I2.I00iOIl = ii1olII1lO12;
/* 230 */                                   olOiI0io0I2.I00iiI = oi0IO1ii0113;
/* 232 */                                   olOiI0io0I2.I00iiO = function13;
/* 234 */                                   olOiI0io0I2.I00iio = iIIoloiiI12;
/* 236 */                                   olOiI0io0I2.I00ilI0I1 = sb;
/* 238 */                                   olOiI0io0I2.I00ilO0 = oOo0ooi2;
/* 240 */                                   olOiI0io0I2.I00io1l = oOo0ooi3;
/* 242 */                                   olOiI0io0I2.I00l0OO0IO = 3;
/* 248 */                                   if (I0000O(oOo0ooi2, oOo0ooi3, ii10ioolOI, sb, function13, oi0IO1ii0113, string, olOiI0io0I2) != ii0111o) {
/* 251 */                                       oi0IO1ii0112 = oi0IO1ii0113;
/* 252 */                                       oOo0ooi = oOo0ooi3;
/* 253 */                                       iIIoloiiI1 = iIIoloiiI12;
/* 254 */                                       olOiI0io0I = olOiI0io0I2;
/* 255 */                                       ii10ioolOI = this;
/* 179 */                                       if (!iIIoloiiI1.I000O01llI0()) {
                                                }
                                            }
                                        }
                                    }
                                }
/* 250 */                       return ii0111o;
                            }
/* 336 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 106 */               Function1 function14 = olOiI0io0I.I00iiO;
/* 108 */               Oi0IO1ii011 oi0IO1ii0115 = olOiI0io0I.I00iiI;
/* 110 */               Ii1olII1lO1 ii1olII1lO15 = olOiI0io0I.I00iOIl;
/* 112 */               lIoii1l01l0i.I00000oOI(obj);
/* 116 */               function12 = function14;
/* 117 */               ii1olII1lO12 = ii1olII1lO15;
/* 118 */               objI00000oIO = obj;
/* 119 */               oi0IO1ii0112 = oi0IO1ii0115;
                    }
/* 155 */           iIIoloiiI1 = (IIIoloiiI1) objI00000oIO;
/* 159 */           sb = new StringBuilder();
/* 164 */           OOo0ooi oOo0ooi6 = new OOo0ooi();
/* 169 */           oOo0ooi = new OOo0ooi();
/* 173 */           function13 = function12;
/* 174 */           oOo0ooi2 = oOo0ooi6;
/* 179 */           if (!iIIoloiiI1.I000O01llI0()) {
                    }
/* 336 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:113:0x0332, code lost:
                
                    if (r4 == r6) goto L114;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
                
                    if (I000O01llI0(r2, r10, r3, r5) == r6) goto L114;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x0273, code lost:
                
                    if (r11.invoke(r4, r5) == r6) goto L114;
                 */
                /* JADX WARN: Removed duplicated region for block: B:109:0x02f2  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x01a7  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x01e2  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0232  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x027d  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0281  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000oI00(O00OoO o00OoO, String str, Function1 function1, IOoilo iOoilo) throws Throwable {
                    OlOiIO olOiIO;
                    String strI0000O;
                    OoiIlOl1iI ooiIlOl1iI;
                    O0O01O0o o0O01O0oI00000oIO;
                    Object objI00IlilI0i0i;
                    Ii1olII1lO1 ii1olII1lO1;
                    String strI000iOII;
                    Ii1olII1lO1 ii1olII1lO12;
                    String str2;
                    String str3;
                    O00OoO o00OoO2;
                    String str4;
                    Object objI00000oIO;
                    Throwable thI00000oOI;
                    IOoOloI0iI iOoOloI0iII00000oIO;
                    String string;
/* 3 */             O00OoO o00OoO3 = o00OoO;
/* 5 */             String str5 = str;
/* 7 */             Function1 function12 = function1;
/* 13 */            if (iOoilo instanceof OlOiIO) {
/* 16 */                olOiIO = (OlOiIO) iOoilo;
/* 18 */                int i = olOiIO.I00li1OI;
/* 24 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 27 */                    olOiIO.I00li1OI = i - Integer.MIN_VALUE;
                        } else {
/* 32 */                    olOiIO = new OlOiIO(this, iOoilo);
                        }
                    }
/* 35 */            Object objI00000oOI = olOiIO.I00l0I0l0lO1;
/* 37 */            Object obj = Ii0111o.I00iOIl;
/* 39 */            int i2 = olOiIO.I00li1OI;
/* 43 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
                    switch (i2) {
                        case 0:
/* 184 */                   lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 187 */                   O0Iioo1lO0o o0Iioo1lO0o = OlOiOI1oII1.I00000oIO;
/* 193 */                   O1l110o o1l110o = new O1l110o(27);
/* 196 */                   o1l110o.I00iiI = this;
/* 198 */                   o1l110o.I00iiO = o00OoO3;
/* 200 */                   VarHandle.storeStoreFence();
/* 203 */                   o0Iioo1lO0o.I000II(o1l110o);
/* 206 */                   if (str5 != null) {
/* 215 */                       Oi0IO1ii011 oi0IO1ii011 = o00OoO3 instanceof O00iOil ? ((O00iOil) o00OoO3).I00000oIO : null;
/* 217 */                       olOiIO.I00iOIl = o00OoO3;
/* 219 */                       olOiIO.I00iiI = str5;
/* 221 */                       olOiIO.I00iiO = function12;
/* 223 */                       olOiIO.I00iio = str5;
/* 226 */                       olOiIO.I00li1OI = 1;
                                break;
                            } else {
/* 240 */                       O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 244 */                       i1i0olI i1i0oli = o011OoiO1I00000oIO.I00000oOI;
/* 254 */                       strI0000O = o011OoiO1I00000oIO.I0000O(O00OoO.Companion.serializer(), o00OoO3);
/* 260 */                       IoIlI1oli ioIlI1oli = (IoIlI1oli) this.I0000oI00;
/* 264 */                       String str6 = (String) this.I0001Ioi1lo;
/* 268 */                       IoO10oI0o ioO10oI0o = new IoO10oI0o();
/* 273 */                       ioO10oI0o.I00000oOI = IoIolIO1.I0000Il00O;
/* 275 */                       I1OoollI1Il1 i1OoollI1Il1 = IoO110.I00000oIO;
/* 279 */                       Ooi11lI0l0.I00000oOI(ioO10oI0o.I00000oIO, str6);
/* 284 */                       String str7 = (String) this.I000O01llI0;
/* 286 */                       Io1O0I1i io1O0I1i = ioO10oI0o.I0000Il00O;
/* 288 */                       if (str7 != null) {
/* 290 */                           io1O0I1i.I00ll1("mcp-session-id", str7);
                                }
/* 293 */                       List list = IoIoIollo0O.I00000oIO;
/* 295 */                       IOoOloI0iI iOoOloI0iI = IOoOi11i1I.I00000oIO;
/* 297 */                       IOoOloI0iI iOoOloI0iI2 = IOoOiii0.I00000oOI;
/* 301 */                       StringBuilder sb = new StringBuilder();
/* 304 */                       sb.append(iOoOloI0iI);
/* 307 */                       ooiIlOl1iI = ooiIlOl1iI2;
/* 311 */                       sb.append(", ");
/* 314 */                       sb.append(iOoOloI0iI2);
/* 323 */                       io1O0I1i.I00ll1("Accept", sb.toString());
/* 326 */                       String string2 = iOoOloI0iI.toString();
/* 330 */                       io1O0I1i.I010I0(string2);
/* 335 */                       List listI00oI0i = io1O0I1i.I00oI0i("Content-Type");
/* 339 */                       listI00oI0i.clear();
/* 342 */                       listI00oI0i.add(string2);
/* 345 */                       ioO10oI0o.I0000O = strI0000O;
/* 351 */                       O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(String.class);
                                try {
/* 355 */                           o0O01O0oI00000oIO = OOoOl0i.I00000oIO(String.class);
                                } catch (Throwable unused) {
/* 360 */                           o0O01O0oI00000oIO = null;
                                }
/* 366 */                       ioO10oI0o.I00000oIO(new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO));
/* 373 */                       ((Function1) this.I000II).invoke(ioO10oI0o);
/* 378 */                       ioO10oI0o.I00000oOI = IoIolIO1.I0000Il00O;
/* 382 */                       I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(ioO10oI0o, ioIlI1oli);
/* 385 */                       olOiIO.I00iOIl = o00OoO3;
/* 387 */                       olOiIO.I00iiI = str5;
/* 389 */                       olOiIO.I00iiO = function12;
/* 391 */                       olOiIO.I00iio = strI0000O;
/* 393 */                       olOiIO.I00ilI0I1 = ioIlI1oli;
/* 395 */                       olOiIO.I00ilO0 = str6;
/* 397 */                       olOiIO.I00io1l = ioIlI1oli;
/* 399 */                       olOiIO.I00ioIO = ioO10oI0o;
/* 402 */                       olOiIO.I00li1OI = 2;
/* 404 */                       objI00IlilI0i0i = i1I0i0Ilo1Oi.I00IlilI0i0i(olOiIO);
/* 408 */                       if (objI00IlilI0i0i != obj) {
/* 412 */                           ii1olII1lO1 = (Ii1olII1lO1) objI00IlilI0i0i;
/* 418 */                           strI000iOII = ii1olII1lO1.I00000oOI().I000iOII("mcp-session-id");
/* 422 */                           if (strI000iOII != null) {
/* 424 */                               this.I000O01llI0 = strI000iOII;
                                    }
/* 436 */                           if (O0000Ioio00.I0000O(ii1olII1lO1.I0000O(), IoOIoo.I00iio)) {
/* 487 */                               int i3 = ii1olII1lO1.I0000O().I00iOIl;
/* 491 */                               if (200 > i3 || i3 >= 300) {
/* 790 */                                   Integer num = new Integer(ii1olII1lO1.I0000O().I00iOIl);
/* 793 */                                   olOiIO.I00iOIl = o00OoO3;
/* 795 */                                   olOiIO.I00iiI = str5;
/* 797 */                                   olOiIO.I00iiO = function12;
/* 799 */                                   olOiIO.I00iio = strI0000O;
/* 801 */                                   olOiIO.I00ilI0I1 = ii1olII1lO1;
/* 803 */                                   olOiIO.I00ilO0 = num;
/* 806 */                                   olOiIO.I00io1l = null;
/* 808 */                                   olOiIO.I00ioIO = null;
/* 811 */                                   olOiIO.I00li1OI = 4;
/* 815 */                                   objI00000oOI = io0OoioI0O1.I00000oOI(ii1olII1lO1, IO1IOI.I00000oIO, olOiIO);
                                            break;
                                        } else {
/* 497 */                                   IOoOloI0iI iOoOloI0iII00000oIO2 = io0Iiol0ol1.I00000oIO(ii1olII1lO1);
/* 508 */                                   IOoOloI0iI iOoOloI0iII0000Il00O = iOoOloI0iII00000oIO2 != null ? iOoOloI0iII00000oIO2.I0000Il00O() : null;
/* 515 */                                   if (O0000Ioio00.I0000O(iOoOloI0iII0000Il00O, IOoOi11i1I.I00000oIO)) {
/* 517 */                                       olOiIO.I00iOIl = o00OoO3;
/* 519 */                                       olOiIO.I00iiI = str5;
/* 521 */                                       olOiIO.I00iiO = function12;
/* 523 */                                       olOiIO.I00iio = strI0000O;
/* 525 */                                       olOiIO.I00ilI0I1 = ii1olII1lO1;
/* 528 */                                       olOiIO.I00ilO0 = null;
/* 530 */                                       olOiIO.I00io1l = null;
/* 532 */                                       olOiIO.I00ioIO = null;
/* 535 */                                       olOiIO.I00li1OI = 5;
/* 539 */                                       Object objI00000oOI2 = io0OoioI0O1.I00000oOI(ii1olII1lO1, IO1IOI.I00000oIO, olOiIO);
/* 543 */                                       if (objI00000oOI2 != obj) {
/* 548 */                                           str2 = str5;
/* 549 */                                           str3 = strI0000O;
/* 550 */                                           objI00000oOI = objI00000oOI2;
/* 551 */                                           o00OoO2 = o00OoO3;
/* 564 */                                           str4 = (String) (((String) objI00000oOI).length() <= 0 ? objI00000oOI : null);
/* 566 */                                           if (str4 != null) {
/* 742 */                                               return ooiIlOl1iI;
                                                    }
                                                    try {
/* 568 */                                               O011OoiO1 o011OoiO1I00000oIO2 = O01oO1I1O.I00000oIO();
/* 572 */                                               i1i0olI i1i0oli2 = o011OoiO1I00000oIO2.I00000oOI;
/* 586 */                                               objI00000oIO = (O00OoO) o011OoiO1I00000oIO2.I00000oOI(O00OoO.Companion.serializer(), str4);
                                                    } catch (Throwable th) {
/* 590 */                                               objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                                                    }
/* 596 */                                           if (!(objI00000oIO instanceof Oi10Ii1i1lo)) {
/* 599 */                                               O00OoO o00OoO4 = (O00OoO) objI00000oIO;
/* 603 */                                               IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I0000O;
/* 605 */                                               olOiIO.I00iOIl = o00OoO2;
/* 607 */                                               olOiIO.I00iiI = str2;
/* 609 */                                               olOiIO.I00iiO = function12;
/* 611 */                                               olOiIO.I00iio = str3;
/* 613 */                                               olOiIO.I00ilI0I1 = ii1olII1lO1;
/* 615 */                                               olOiIO.I00ilO0 = str4;
/* 617 */                                               olOiIO.I00io1l = objI00000oIO;
/* 619 */                                               olOiIO.I00ioIO = o00OoO4;
/* 622 */                                               olOiIO.I00li1OI = 6;
                                                        break;
                                                    }
/* 632 */                                           thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 636 */                                           if (thI00000oOI != null) {
/* 638 */                                               Oi10ii.I00000oIO(objI00000oIO);
/* 742 */                                               return ooiIlOl1iI;
                                                    }
/* 646 */                                           ((Function1) this.I00000oOI).invoke(thI00000oOI);
/* 649 */                                           throw thI00000oOI;
                                                }
                                            } else if (O0000Ioio00.I0000O(iOoOloI0iII0000Il00O, IOoOiii0.I00000oOI)) {
/* 668 */                                       Oi0IO1ii011 oi0IO1ii0112 = o00OoO3 instanceof O00iOil ? ((O00iOil) o00OoO3).I00000oIO : null;
/* 669 */                                       olOiIO.I00iOIl = o00OoO3;
/* 671 */                                       olOiIO.I00iiI = str5;
/* 673 */                                       olOiIO.I00iiO = function12;
/* 675 */                                       olOiIO.I00iio = strI0000O;
/* 677 */                                       olOiIO.I00ilI0I1 = ii1olII1lO1;
/* 680 */                                       olOiIO.I00ilO0 = null;
/* 682 */                                       olOiIO.I00io1l = null;
/* 684 */                                       olOiIO.I00ioIO = null;
/* 687 */                                       olOiIO.I00li1OI = 7;
/* 693 */                                       if (I0000Il00O(ii1olII1lO1, oi0IO1ii0112, function12, olOiIO) != obj) {
/* 742 */                                           return ooiIlOl1iI;
                                                }
                                            } else {
/* 697 */                                       olOiIO.I00iOIl = o00OoO3;
/* 699 */                                       olOiIO.I00iiI = str5;
/* 701 */                                       olOiIO.I00iiO = function12;
/* 703 */                                       olOiIO.I00iio = strI0000O;
/* 705 */                                       olOiIO.I00ilI0I1 = ii1olII1lO1;
/* 708 */                                       olOiIO.I00ilO0 = null;
/* 710 */                                       olOiIO.I00io1l = null;
/* 712 */                                       olOiIO.I00ioIO = null;
/* 716 */                                       olOiIO.I00li1OI = 8;
/* 720 */                                       objI00000oOI = io0OoioI0O1.I00000oOI(ii1olII1lO1, IO1IOI.I00000oIO, olOiIO);
/* 724 */                                       if (objI00000oOI != obj) {
/* 727 */                                           ii1olII1lO12 = ii1olII1lO1;
/* 728 */                                           String str8 = (String) objI00000oOI;
/* 734 */                                           if (io0Iiol0ol1.I00000oIO(ii1olII1lO12) != null && OlOoOIi0o.I001l0I00(str8)) {
/* 742 */                                               return ooiIlOl1iI;
                                                    }
/* 743 */                                           iOoOloI0iII00000oIO = io0Iiol0ol1.I00000oIO(ii1olII1lO12);
/* 747 */                                           if (iOoOloI0iII00000oIO != null || (string = iOoOloI0iII00000oIO.toString()) == null) {
/* 755 */                                               string = "<none>";
                                                    }
/* 762 */                                           new Integer(-1);
/* 771 */                                           OlOiOoO olOiOoO = new OlOiOoO("Unexpected content type: $".concat(string));
/* 778 */                                           ((Function1) this.I00000oOI).invoke(olOiOoO);
/* 781 */                                           throw olOiOoO;
                                                }
                                            }
                                        }
                                    } else {
/* 440 */                               if (!(o00OoO3 instanceof O00i1OoOll1I) || !O0000Ioio00.I0000O(((O00i1OoOll1I) o00OoO3).I00000oIO, "notifications/initialized")) {
/* 742 */                                   return ooiIlOl1iI;
                                        }
/* 455 */                               olOiIO.I00iOIl = o00OoO3;
/* 457 */                               olOiIO.I00iiI = str5;
/* 459 */                               olOiIO.I00iiO = function12;
/* 461 */                               olOiIO.I00iio = strI0000O;
/* 463 */                               olOiIO.I00ilI0I1 = ii1olII1lO1;
/* 466 */                               olOiIO.I00ilO0 = null;
/* 468 */                               olOiIO.I00io1l = null;
/* 470 */                               olOiIO.I00ioIO = null;
/* 473 */                               olOiIO.I00li1OI = 3;
/* 479 */                               if (I000O01llI0(null, null, function12, olOiIO) != obj) {
/* 742 */                                   return ooiIlOl1iI;
                                        }
                                    }
                                }
                            }
/* 821 */                   return obj;
                        case 1:
/* 180 */                   lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 183 */                   return ooiIlOl1iI2;
                        case 2:
/* 154 */                   String str9 = olOiIO.I00iio;
/* 156 */                   Function1 function13 = olOiIO.I00iiO;
/* 158 */                   String str10 = olOiIO.I00iiI;
/* 160 */                   O00OoO o00OoO5 = olOiIO.I00iOIl;
/* 162 */                   lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 167 */                   strI0000O = str9;
/* 168 */                   o00OoO3 = o00OoO5;
/* 169 */                   objI00IlilI0i0i = objI00000oOI;
/* 173 */                   function12 = function13;
/* 174 */                   str5 = str10;
/* 176 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 412 */                   ii1olII1lO1 = (Ii1olII1lO1) objI00IlilI0i0i;
/* 418 */                   strI000iOII = ii1olII1lO1.I00000oOI().I000iOII("mcp-session-id");
/* 422 */                   if (strI000iOII != null) {
                            }
/* 436 */                   if (O0000Ioio00.I0000O(ii1olII1lO1.I0000O(), IoOIoo.I00iio)) {
                            }
/* 821 */                   return obj;
                        case 3:
/* 134 */                   lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 236 */                   return ooiIlOl1iI2;
                        case 4:
/* 125 */                   lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 826 */                   OlOiOoO olOiOoO2 = new OlOiOoO((String) objI00000oOI);
/* 833 */                   ((Function1) this.I00000oOI).invoke(olOiOoO2);
/* 836 */                   throw olOiOoO2;
                        case 5:
/* 97 */                    Ii1olII1lO1 ii1olII1lO13 = (Ii1olII1lO1) olOiIO.I00ilI0I1;
/* 99 */                    str3 = olOiIO.I00iio;
/* 101 */                   function12 = olOiIO.I00iiO;
/* 103 */                   String str11 = olOiIO.I00iiI;
/* 105 */                   O00OoO o00OoO6 = olOiIO.I00iOIl;
/* 107 */                   lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 110 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 112 */                   o00OoO2 = o00OoO6;
/* 113 */                   str2 = str11;
/* 114 */                   ii1olII1lO1 = ii1olII1lO13;
/* 564 */                   str4 = (String) (((String) objI00000oOI).length() <= 0 ? objI00000oOI : null);
/* 566 */                   if (str4 != null) {
                            }
                            break;
                        case 6:
/* 78 */                    objI00000oIO = olOiIO.I00io1l;
/* 88 */                    lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 91 */                    ooiIlOl1iI = ooiIlOl1iI2;
/* 632 */                   thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 636 */                   if (thI00000oOI != null) {
                            }
                            break;
                        case 7:
/* 70 */                    lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 73 */                    return ooiIlOl1iI2;
                        case 8:
/* 57 */                    ii1olII1lO12 = (Ii1olII1lO1) olOiIO.I00ilI0I1;
/* 59 */                    lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 62 */                    ooiIlOl1iI = ooiIlOl1iI2;
/* 728 */                   String str82 = (String) objI00000oOI;
/* 734 */                   if (io0Iiol0ol1.I00000oIO(ii1olII1lO12) != null) {
                                break;
                            }
/* 743 */                   iOoOloI0iII00000oIO = io0Iiol0ol1.I00000oIO(ii1olII1lO12);
/* 747 */                   if (iOoOloI0iII00000oIO != null) {
/* 755 */                       string = "<none>";
                                break;
                            }
/* 762 */                   new Integer(-1);
/* 771 */                   OlOiOoO olOiOoO3 = new OlOiOoO("Unexpected content type: $".concat(string));
/* 778 */                   ((Function1) this.I00000oOI).invoke(olOiOoO3);
/* 781 */                   throw olOiOoO3;
                        default:
/* 51 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                    }
                }

                public Object I0001Ioi1lo(O00OoO o00OoO, lOo1Ooii loo1ooii, IOoilo iOoilo) throws Throwable {
/* 2 */             Object objI0000oI00 = I0000oI00(o00OoO, null, null, iOoilo);
                    return objI0000oI00 == Ii0111o.I00iOIl ? objI0000oI00 : OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
                
                    if (p000.l01oO1iOo.I0000Il00O(r0, r1) == r2) goto L33;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000O01llI0(String str, Oi0IO1ii011 oi0IO1ii011, Function1 function1, IOoilo iOoilo) throws Throwable {
                    OlOiIO110OiI olOiIO110OiI;
                    Oi0IO1ii011 oi0IO1ii0112;
                    Function1 function12;
                    String str2;
                    Ii10ioolOI ii10ioolOI;
                    Oi0IO1ii011 oi0IO1ii0113;
                    Function1 function13;
/* 5 */             if (iOoilo instanceof OlOiIO110OiI) {
/* 8 */                 olOiIO110OiI = (OlOiIO110OiI) iOoilo;
/* 10 */                int i = olOiIO110OiI.I00io1l;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    olOiIO110OiI.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    olOiIO110OiI = new OlOiIO110OiI(this, iOoilo);
                        }
                    }
/* 27 */            Object objI00000oIO = olOiIO110OiI.I00ilI0I1;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = olOiIO110OiI.I00io1l;
/* 34 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 37 */            Object[] objArr = 0;
                    try {
/* 38 */                if (i2 == 0) {
/* 80 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 85 */                    IOO01l iOO01l = (IOO01l) this.I000OiO;
/* 87 */                    if (iOO01l != null) {
/* 89 */                        il001oo1.I00000oOI(iOO01l, null);
                            }
/* 94 */                    OlIl0i olIl0i = (OlIl0i) this.I000iOII;
/* 96 */                    if (olIl0i != null) {
/* 98 */                        olOiIO110OiI.I00iOIl = str;
/* 100 */                       oi0IO1ii0112 = oi0IO1ii011;
/* 102 */                       olOiIO110OiI.I00iiI = oi0IO1ii0112;
/* 104 */                       function12 = function1;
/* 106 */                       olOiIO110OiI.I00iiO = function12;
/* 108 */                       olOiIO110OiI.I00io1l = 1;
                            } else {
/* 117 */                       oi0IO1ii0112 = oi0IO1ii011;
/* 119 */                       function12 = function1;
                            }
/* 121 */                   str2 = str;
                        } else {
/* 40 */                    if (i2 != 1) {
/* 42 */                        if (i2 != 2) {
/* 62 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 65 */                            return null;
                                }
/* 44 */                        ii10ioolOI = olOiIO110OiI.I00iio;
/* 46 */                        Function1 function14 = olOiIO110OiI.I00iiO;
/* 48 */                        Oi0IO1ii011 oi0IO1ii0114 = olOiIO110OiI.I00iiI;
/* 50 */                        lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 53 */                        oi0IO1ii0113 = oi0IO1ii0114;
/* 54 */                        function13 = function14;
/* 181 */                       ii10ioolOI.I000OiO = (IOO01l) objI00000oIO;
/* 192 */                       OlOiOI1oII1.I00000oIO.I000II(new Oi1O00OI(25));
/* 232 */                       this.I000iOII = iOi1II01i0.I0000O((Ii0110) ((OllO00oiil) this.I000l1).getValue(), new Ii00oll(Oi010OO0.I000oI1ioi(hashCode(), "StreamableHttpTransport.collect#")), null, new OO11OilO(this, oi0IO1ii0113, function13, objArr == true ? 1 : 0, 20), 2);
/* 234 */                       return ooiIlOl1iI;
                            }
/* 67 */                    Function1 function15 = olOiIO110OiI.I00iiO;
/* 69 */                    oi0IO1ii0112 = olOiIO110OiI.I00iiI;
/* 71 */                    String str3 = olOiIO110OiI.I00iOIl;
/* 73 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 77 */                    function12 = function15;
/* 78 */                    str2 = str3;
                        }
/* 122 */               O0Iioo1lO0o o0Iioo1lO0o = OlOiOI1oII1.I00000oIO;
/* 126 */               OlOOOii olOOOii = new OlOOOii(1);
/* 129 */               olOOOii.I00iiI = this;
/* 131 */               VarHandle.storeStoreFence();
/* 134 */               o0Iioo1lO0o.I000II(olOOOii);
/* 139 */               IoIlI1oli ioIlI1oli = (IoIlI1oli) this.I0000oI00;
/* 143 */               String str4 = (String) this.I0001Ioi1lo;
/* 149 */               OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(8);
/* 152 */               oiOi011iI1ol.I00iiO = this;
/* 154 */               oiOi011iI1ol.I00iiI = str2;
/* 156 */               VarHandle.storeStoreFence();
/* 159 */               olOiIO110OiI.I00iOIl = str2;
/* 161 */               olOiIO110OiI.I00iiI = oi0IO1ii0112;
/* 163 */               olOiIO110OiI.I00iiO = function12;
/* 165 */               olOiIO110OiI.I00iio = this;
/* 167 */               olOiIO110OiI.I00io1l = 2;
/* 169 */               objI00000oIO = IIIO11i.I00000oIO(ioIlI1oli, str4, oiOi011iI1ol, olOiIO110OiI);
/* 173 */               if (objI00000oIO != ii0111o) {
/* 176 */                   ii10ioolOI = this;
/* 177 */                   oi0IO1ii0113 = oi0IO1ii0112;
/* 178 */                   function13 = function12;
/* 181 */                   ii10ioolOI.I000OiO = (IOO01l) objI00000oIO;
/* 192 */                   OlOiOI1oII1.I00000oIO.I000II(new Oi1O00OI(25));
/* 232 */                   this.I000iOII = iOi1II01i0.I0000O((Ii0110) ((OllO00oiil) this.I000l1).getValue(), new Ii00oll(Oi010OO0.I000oI1ioi(hashCode(), "StreamableHttpTransport.collect#")), null, new OO11OilO(this, oi0IO1ii0113, function13, objArr == true ? 1 : 0, 20), 2);
/* 234 */                   return ooiIlOl1iI;
                        }
/* 175 */               return ii0111o;
                    } catch (OiIIoOll0Il e) {
/* 235 */               Ii1olII1lO1 ii1olII1lO1 = e.I00iOIl;
/* 244 */               IoOIoo ioOIooI0000O = ii1olII1lO1 != null ? ii1olII1lO1.I0000O() : null;
/* 247 */               IOoOloI0iI iOoOloI0iII00000oIO = ii1olII1lO1 != null ? io0Iiol0ol1.I00000oIO(ii1olII1lO1) : null;
/* 257 */               if (O0000Ioio00.I0000O(ioOIooI0000O, IoOIoo.I00ilO0)) {
/* 268 */                   OlOiOI1oII1.I00000oIO.I000OiO(new Oi1O00OI(26));
/* 271 */                   return ooiIlOl1iI;
                        }
/* 272 */               if (iOoOloI0iII00000oIO == null || !iOoOloI0iII00000oIO.I00000oIO(IOoOi11i1I.I00000oIO)) {
/* 299 */                   ((Function1) this.I00000oOI).invoke(e);
/* 483 */                   throw e;
                        }
/* 291 */               OlOiOI1oII1.I00000oIO.I000OiO(new Oi1O00OI(27));
/* 294 */               return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000OOo1O(IOoilo iOoilo) throws Throwable {
                    OlOiIi olOiIi;
/* 3 */             if (iOoilo instanceof OlOiIi) {
/* 6 */                 olOiIi = (OlOiIi) iOoilo;
/* 8 */                 int i = olOiIi.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    olOiIi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    olOiIi = new OlOiIi(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00IlilI0i0i = olOiIi.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = olOiIi.I00iiO;
/* 32 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 35 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI00IlilI0i0i);
/* 56 */                if (((String) this.I000O01llI0) == null) {
/* 58 */                    return ooiIlOl1iI;
                        }
/* 59 */                O0Iioo1lO0o o0Iioo1lO0o = OlOiOI1oII1.I00000oIO;
/* 64 */                OlOOOii olOOOii = new OlOOOii(0);
/* 67 */                olOOOii.I00iiI = this;
/* 69 */                VarHandle.storeStoreFence();
/* 72 */                o0Iioo1lO0o.I000II(olOOOii);
/* 77 */                IoIlI1oli ioIlI1oli = (IoIlI1oli) this.I0000oI00;
/* 81 */                String str = (String) this.I0001Ioi1lo;
/* 85 */                IoO10oI0o ioO10oI0o = new IoO10oI0o();
/* 88 */                IoIolIO1 ioIolIO1 = IoIolIO1.I0000O;
/* 90 */                ioO10oI0o.I00000oOI = ioIolIO1;
/* 92 */                I1OoollI1Il1 i1OoollI1Il1 = IoO110.I00000oIO;
/* 96 */                Ooi11lI0l0.I00000oOI(ioO10oI0o.I00000oIO, str);
/* 101 */               String str2 = (String) this.I000O01llI0;
/* 103 */               if (str2 != null) {
/* 109 */                   ioO10oI0o.I0000Il00O.I00ll1("mcp-session-id", str2);
                        }
/* 116 */               ((Function1) this.I000II).invoke(ioO10oI0o);
/* 119 */               ioO10oI0o.I00000oOI = ioIolIO1;
/* 123 */               I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(ioO10oI0o, ioIlI1oli);
/* 126 */               olOiIi.I00iiO = 1;
/* 128 */               objI00IlilI0i0i = i1I0i0Ilo1Oi.I00IlilI0i0i(olOiIi);
/* 132 */               if (objI00IlilI0i0i == ii0111o) {
/* 134 */                   return ii0111o;
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 39 */                lIoii1l01l0i.I00000oOI(objI00IlilI0i0i);
                    }
/* 135 */           Ii1olII1lO1 ii1olII1lO1 = (Ii1olII1lO1) objI00IlilI0i0i;
/* 141 */           int i3 = ii1olII1lO1.I0000O().I00iOIl;
/* 145 */           if ((200 <= i3 && i3 < 300) || O0000Ioio00.I0000O(ii1olII1lO1.I0000O(), IoOIoo.I00ilO0)) {
/* 164 */               this.I000O01llI0 = null;
/* 166 */               this.I000lI = null;
/* 177 */               OlOiOI1oII1.I00000oIO.I000II(new Oi1O00OI(23));
/* 180 */               return ooiIlOl1iI;
                    }
/* 191 */           new Integer(ii1olII1lO1.I0000O().I00iOIl);
/* 206 */           OlOiOoO olOiOoO = new OlOiOoO("Failed to terminate session: ".concat(ii1olII1lO1.I0000O().I00iiI));
/* 218 */           OlOiOI1oII1.I00000oIO.I00000oIO(olOiOoO, new Oi1O00OI(22));
/* 225 */           ((Function1) this.I00000oOI).invoke(olOiOoO);
/* 966 */           throw olOiOoO;
                }
            }
