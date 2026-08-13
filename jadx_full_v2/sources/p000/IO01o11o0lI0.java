            package p000;

            import android.hardware.camera2.CaptureResult;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import kotlin.jvm.functions.Function1;
            
            public final class IO01o11o0lI0 implements IIooIO0II {
                public IIoo0IllI I00000oIO;
                public IlOI0O11011l I00000oOI;
                public OoI00O0l I0000Il00O;
                public Oooi11I0 I0000O;
                public OolOi0i I0000oI00;
                public IOi0Olo0Ol I0001Ioi1lo;
                public OolOliOI0Oii I000II;
                public OOiO01IO I000O01llI0;
                public OolO1O I000OOo1O;
                public OllO00oiil I000OiO;
                public OllO00oiil I000iOII;
                public int I000l1;
                public I0oIl0101 I000lI;
                public IO000io11iO1 I000o00OoI0I;

                @Override
                public final IO0011o I00000oIO(int i, int i2, IIlO0II00o iIlO0II00o) {
/* 3 */             IO0011o iO0011o = new IO0011o();
/* 6 */             iO0011o.I00000oIO = this;
/* 8 */             iO0011o.I00000oOI = i;
/* 10 */            iO0011o.I0000Il00O = i2;
/* 12 */            VarHandle.storeStoreFence();
/* 98 */            return iO0011o;
                }

                @Override
                public final void I00000oOI(int i) {
/* 1 */             this.I000l1 = i;
                }

                @Override
                public final Object I0000Il00O(List list, int i, IOlOo1ll1l1 iOlOo1ll1l1, int i2, int i3, int i4, IOoilo iOoilo) {
/* 11 */            List listI000O01llI0 = IOOi1I.I000O01llI0(IIooOO1o.I00iOIl, IIooOO1o.I00iiI, IIooOO1o.I00iiO);
/* 20 */            IIooO1o11oo1 iIooO1o11oo1 = new IIooO1o11oo1();
/* 23 */            iIooO1o11oo1.I00000oIO = list;
/* 25 */            iIooO1o11oo1.I00000oOI = i;
/* 27 */            iIooO1o11oo1.I0000Il00O = iOlOo1ll1l1;
/* 29 */            VarHandle.storeStoreFence();
/* 35 */            return I000O01llI0(listI000O01llI0, i2, i4, i3, iIooO1o11oo1, iOoilo);
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0154  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /* JADX WARN: Type inference failed for: r2v17 */
                /* JADX WARN: Type inference failed for: r2v18, types: [IOoil1iiIilo, Ii00l101O, Ii01I10] */
                /* JADX WARN: Type inference failed for: r2v21 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(IIooO1o11oo1 iIooO1o11oo1, long j, int i, List list, IOoilo iOoilo) throws Throwable {
                    IIooOoOIOo11 iIooOoOIOo11;
                    IIooO1o11oo1 iIooO1o11oo12;
                    int i2;
                    IO01o11o0lI0 iO01o11o0lI0;
                    IIooO1o11oo1 iIooO1o11oo13;
                    long j2;
                    int i3;
                    IO01o11o0lI0 iO01o11o0lI02;
                    AutoCloseable autoCloseable;
                    Throwable th;
                    AutoCloseable autoCloseable2;
                    AutoCloseable autoCloseable3;
                    IIooO1o11oo1 iIooO1o11oo14;
                    List list2;
                    int i4;
                    IO01o11o0lI0 iO01o11o0lI03;
                    List list3;
                    ?? r2;
                    List listSingletonList;
/* 3 */             List list4 = list;
/* 9 */             if (iOoilo instanceof IIooOoOIOo11) {
/* 12 */                iIooOoOIOo11 = (IIooOoOIOo11) iOoilo;
/* 14 */                int i5 = iIooOoOIOo11.I00l0I0l0lO1;
/* 20 */                if ((i5 & Integer.MIN_VALUE) != 0) {
/* 23 */                    iIooOoOIOo11.I00l0I0l0lO1 = i5 - Integer.MIN_VALUE;
                        } else {
/* 28 */                    iIooOoOIOo11 = new IIooOoOIOo11(this, iOoilo);
                        }
                    }
/* 31 */            Object objI0000Il00O = iIooOoOIOo11.I00io1l;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i6 = iIooOoOIOo11.I00l0I0l0lO1;
/* 38 */            boolean z = true;
/* 41 */            int i7 = 3;
                    try {
/* 43 */                if (i6 == 0) {
/* 121 */                   lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 124 */                   l11I11lO.I0000O(3, "CXCP");
/* 131 */                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 133 */                       Objects.toString(list4);
                            }
/* 142 */                   if (!list4.contains(IIooOO1o.I00iOIl)) {
/* 288 */                       iIooO1o11oo12 = iIooO1o11oo1;
/* 290 */                       i2 = i;
/* 292 */                       iO01o11o0lI0 = this;
/* 299 */                       if (list4.contains(IIooOO1o.I00iiI)) {
                                }
/* 339 */                       if (list4.contains(IIooOO1o.I00iiO)) {
                                }
/* 399 */                       return listSingletonList;
                            }
/* 144 */                   l11I11lO.I0000O(3, "CXCP");
/* 147 */                   l11I11lO.I0000O(3, "CXCP");
/* 152 */                   IIll0oO iIll0oOI00000oIO = this.I000OOo1O.I00000oIO();
/* 156 */                   iIooOoOIOo11.I00iiO = this;
/* 161 */                   iIooOoOIOo11.I00iio = list4;
/* 163 */                   iIooO1o11oo13 = iIooO1o11oo1;
/* 165 */                   iIooOoOIOo11.I00ilI0I1 = iIooO1o11oo13;
/* 167 */                   j2 = j;
/* 169 */                   iIooOoOIOo11.I00iOIl = j2;
/* 171 */                   i3 = i;
/* 173 */                   iIooOoOIOo11.I00iiI = i3;
/* 175 */                   iIooOoOIOo11.I00l0I0l0lO1 = 1;
/* 177 */                   objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(iIooOoOIOo11);
/* 181 */                   if (objI0000Il00O != ii0111o) {
/* 184 */                       iO01o11o0lI02 = this;
                            }
/* 261 */                   return ii0111o;
                        }
/* 45 */                if (i6 != 1) {
/* 47 */                    if (i6 == 2) {
/* 78 */                        i4 = iIooOoOIOo11.I00iiI;
/* 80 */                        autoCloseable3 = iIooOoOIOo11.I00ilO0;
/* 82 */                        iIooO1o11oo14 = iIooOoOIOo11.I00ilI0I1;
/* 84 */                        list2 = iIooOoOIOo11.I00iio;
/* 88 */                        iO01o11o0lI03 = iIooOoOIOo11.I00iiO;
                                try {
/* 90 */                            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 237 */                           iIooOoOIOo11.I00iiO = iO01o11o0lI03;
/* 242 */                           iIooOoOIOo11.I00iio = list2;
/* 244 */                           iIooOoOIOo11.I00ilI0I1 = iIooO1o11oo14;
/* 246 */                           iIooOoOIOo11.I00ilO0 = autoCloseable3;
/* 248 */                           iIooOoOIOo11.I00iiI = i4;
/* 250 */                           i7 = 3;
/* 251 */                           iIooOoOIOo11.I00l0I0l0lO1 = 3;
/* 259 */                           if (((O011OOl11) ((IiIOI1ol0o) objI0000Il00O)).I001l0I00(iIooOoOIOo11) != ii0111o) {
/* 262 */                               autoCloseable2 = autoCloseable3;
/* 263 */                               iIooO1o11oo12 = iIooO1o11oo14;
/* 264 */                               list3 = list2;
/* 265 */                               iO01o11o0lI0 = iO01o11o0lI03;
/* 266 */                               l11I11lO.I0000O(i7, "CXCP");
/* 270 */                               iOOl00.I00000oIO(autoCloseable2, null);
/* 273 */                               l11I11lO.I0000O(i7, "CXCP");
/* 276 */                               i2 = i4;
/* 277 */                               list4 = list3;
/* 299 */                               if (list4.contains(IIooOO1o.I00iiI)) {
                                        }
/* 339 */                               if (list4.contains(IIooOO1o.I00iiO)) {
                                        }
/* 399 */                               return listSingletonList;
                                    }
/* 261 */                           return ii0111o;
                                } catch (Throwable th2) {
/* 96 */                            th = th2;
/* 97 */                            autoCloseable2 = autoCloseable3;
/* 282 */                           throw th;
                                }
                            }
/* 49 */                    if (i6 != 3) {
/* 74 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 42 */                        return null;
                            }
/* 51 */                    i4 = iIooOoOIOo11.I00iiI;
/* 53 */                    autoCloseable2 = iIooOoOIOo11.I00ilO0;
/* 55 */                    iIooO1o11oo12 = iIooOoOIOo11.I00ilI0I1;
/* 57 */                    list3 = iIooOoOIOo11.I00iio;
/* 61 */                    iO01o11o0lI0 = iIooOoOIOo11.I00iiO;
                            try {
/* 63 */                        lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 266 */                       l11I11lO.I0000O(i7, "CXCP");
/* 270 */                       iOOl00.I00000oIO(autoCloseable2, null);
/* 273 */                       l11I11lO.I0000O(i7, "CXCP");
/* 276 */                       i2 = i4;
/* 277 */                       list4 = list3;
/* 299 */                       if (list4.contains(IIooOO1o.I00iiI)) {
/* 302 */                           l11I11lO.I0000O(3, "CXCP");
/* 305 */                           if (iIooO1o11oo12 == null) {
/* 319 */                               I000II.I001IO000("Required value was null.");
/* 322 */                               return null;
                                    }
/* 307 */                           ArrayList arrayListI000o00OoI0I = iO01o11o0lI0.I000o00OoI0I(iIooO1o11oo12);
/* 311 */                           l11I11lO.I0000O(3, "CXCP");
/* 314 */                           listSingletonList = arrayListI000o00OoI0I;
/* 315 */                           r2 = 0;
                                } else {
/* 324 */                           r2 = 0;
/* 329 */                           listSingletonList = Collections.singletonList(iiiO1IOliI0.I00000oIO(null));
                                }
/* 339 */                       if (list4.contains(IIooOO1o.I00iiO)) {
/* 351 */                           iOi1II01i0.I0000O(iO01o11o0lI0.I0000oI00.I0000oI00, r2, r2, new I00111O(listSingletonList, (IOoil1iiIilo) r2, this, i2), 3);
                                }
/* 399 */                       return listSingletonList;
                            } catch (Throwable th3) {
/* 69 */                        th = th3;
                                try {
/* 282 */                           throw th;
                                } catch (Throwable th4) {
/* 284 */                           iOOl00.I00000oIO(autoCloseable2, th);
/* 287 */                           throw th4;
                                }
                            }
                        }
/* 100 */               int i8 = iIooOoOIOo11.I00iiI;
/* 102 */               j2 = iIooOoOIOo11.I00iOIl;
/* 104 */               iIooO1o11oo13 = iIooOoOIOo11.I00ilI0I1;
/* 106 */               List list5 = iIooOoOIOo11.I00iio;
/* 110 */               iO01o11o0lI02 = iIooOoOIOo11.I00iiO;
/* 112 */               lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 117 */               i3 = i8;
/* 118 */               list4 = list5;
/* 188 */               IIll1i iIll1i = (IIll1i) autoCloseable;
/* 190 */               l11I11lO.I0000O(3, "CXCP");
/* 195 */               if (i3 != 0) {
/* 198 */                   z = false;
                        }
/* 204 */               boolean z2 = i3 == 0;
/* 206 */               iIooOoOIOo11.I00iiO = iO01o11o0lI02;
/* 211 */               iIooOoOIOo11.I00iio = list4;
/* 213 */               iIooOoOIOo11.I00ilI0I1 = iIooO1o11oo13;
/* 215 */               iIooOoOIOo11.I00ilO0 = autoCloseable;
/* 217 */               iIooOoOIOo11.I00iiI = i3;
/* 219 */               iIooOoOIOo11.I00l0I0l0lO1 = 2;
/* 221 */               IOi10loi iOi10loiI000II = IIll1i.I000II(iIll1i, z, z2, j2);
/* 225 */               if (iOi10loiI000II != ii0111o) {
/* 228 */                   IIooO1o11oo1 iIooO1o11oo15 = iIooO1o11oo13;
/* 229 */                   autoCloseable3 = autoCloseable;
/* 230 */                   objI0000Il00O = iOi10loiI000II;
/* 231 */                   iIooO1o11oo14 = iIooO1o11oo15;
/* 232 */                   list2 = list4;
/* 233 */                   i4 = i3;
/* 234 */                   iO01o11o0lI03 = iO01o11o0lI02;
/* 237 */                   iIooOoOIOo11.I00iiO = iO01o11o0lI03;
/* 242 */                   iIooOoOIOo11.I00iio = list2;
/* 244 */                   iIooOoOIOo11.I00ilI0I1 = iIooO1o11oo14;
/* 246 */                   iIooOoOIOo11.I00ilO0 = autoCloseable3;
/* 248 */                   iIooOoOIOo11.I00iiI = i4;
/* 250 */                   i7 = 3;
/* 251 */                   iIooOoOIOo11.I00l0I0l0lO1 = 3;
/* 259 */                   if (((O011OOl11) ((IiIOI1ol0o) objI0000Il00O)).I001l0I00(iIooOoOIOo11) != ii0111o) {
                            }
                        }
/* 261 */               return ii0111o;
                    } catch (Throwable th5) {
/* 280 */               th = th5;
/* 281 */               autoCloseable2 = autoCloseable;
/* 282 */               throw th;
                    }
/* 185 */           autoCloseable = (AutoCloseable) objI0000Il00O;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(IIooO1o11oo1 iIooO1o11oo1, int i, int i2, List list, IOoilo iOoilo) throws Throwable {
                    IIooi110lI iIooi110lI;
/* 3 */             if (iOoilo instanceof IIooi110lI) {
/* 6 */                 iIooi110lI = (IIooi110lI) iOoilo;
/* 8 */                 int i3 = iIooi110lI.I00ilO0;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIooi110lI.I00ilO0 = i3 - Integer.MIN_VALUE;
                        } else {
/* 23 */                    iIooi110lI = new IIooi110lI(this, iOoilo);
                        }
                    }
/* 19 */            IIooi110lI iIooi110lI2 = iIooi110lI;
/* 27 */            Object objI000iOII = iIooi110lI2.I00iio;
/* 29 */            Object obj = Ii0111o.I00iOIl;
/* 31 */            int i4 = iIooi110lI2.I00ilO0;
/* 38 */            if (i4 == 0) {
/* 81 */                lIoii1l01l0i.I00000oOI(objI000iOII);
/* 96 */                if (((Boolean) this.I000OiO.getValue()).booleanValue()) {
/* 98 */                    iIooi110lI2.I00iOIl = iIooO1o11oo1;
/* 103 */                   iIooi110lI2.I00iiI = list;
/* 105 */                   iIooi110lI2.I00iiO = i;
/* 107 */                   iIooi110lI2.I00ilO0 = 1;
/* 109 */                   objI000iOII = I000iOII(i2, iIooi110lI2);
/* 113 */                   if (objI000iOII != obj) {
                            }
                        } else {
/* 170 */                   iIooi110lI2.I00ilO0 = 4;
/* 172 */                   Object objI0001Ioi1lo = I0001Ioi1lo(iIooO1o11oo1, i, list, iIooi110lI2);
/* 176 */                   if (objI0001Ioi1lo != obj) {
/* 399 */                       return objI0001Ioi1lo;
                            }
                        }
/* 178 */               return obj;
                    }
/* 40 */            if (i4 != 1) {
/* 42 */                if (i4 == 2) {
/* 62 */                    lIoii1l01l0i.I00000oOI(objI000iOII);
/* 65 */                    return objI000iOII;
                        }
/* 44 */                if (i4 == 3) {
/* 58 */                    lIoii1l01l0i.I00000oOI(objI000iOII);
/* 61 */                    return objI000iOII;
                        }
/* 46 */                if (i4 == 4) {
/* 48 */                    lIoii1l01l0i.I00000oOI(objI000iOII);
/* 51 */                    return objI000iOII;
                        }
/* 54 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                return null;
                    }
/* 66 */            i = iIooi110lI2.I00iiO;
/* 68 */            list = iIooi110lI2.I00iiI;
/* 73 */            iIooO1o11oo1 = iIooi110lI2.I00iOIl;
/* 75 */            lIoii1l01l0i.I00000oOI(objI000iOII);
/* 78 */            IIooO1o11oo1 iIooO1o11oo12 = iIooO1o11oo1;
/* 79 */            int i5 = i;
/* 118 */           boolean zBooleanValue = ((Boolean) objI000iOII).booleanValue();
/* 130 */           long j = zBooleanValue ? 5000000000L : 1000000000L;
/* 133 */           if (zBooleanValue || i5 == 0) {
/* 152 */               iIooi110lI2.I00iOIl = null;
/* 154 */               iIooi110lI2.I00iiI = null;
/* 156 */               iIooi110lI2.I00ilO0 = 2;
/* 161 */               Object objI0000O = I0000O(iIooO1o11oo12, j, i5, list, iIooi110lI2);
/* 165 */               if (objI0000O != obj) {
/* 168 */                   return objI0000O;
                        }
                    } else {
/* 138 */               iIooi110lI2.I00iOIl = null;
/* 140 */               iIooi110lI2.I00iiI = null;
/* 142 */               iIooi110lI2.I00ilO0 = 3;
/* 144 */               Object objI0001Ioi1lo2 = I0001Ioi1lo(iIooO1o11oo12, i5, list, iIooi110lI2);
/* 148 */               if (objI0001Ioi1lo2 != obj) {
/* 151 */                   return objI0001Ioi1lo2;
                        }
                    }
/* 178 */           return obj;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(IIooO1o11oo1 iIooO1o11oo1, int i, List list, IOoilo iOoilo) throws Throwable {
                    IIooilo11oi iIooilo11oi;
                    int i2;
                    IO01o11o0lI0 iO01o11o0lI0;
                    IIooO1o11oo1 iIooO1o11oo12;
                    Object objSingletonList;
/* 1 */             List list2 = list;
/* 7 */             if (iOoilo instanceof IIooilo11oi) {
/* 10 */                iIooilo11oi = (IIooilo11oi) iOoilo;
/* 12 */                int i3 = iIooilo11oi.I00io1l;
/* 18 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 21 */                    iIooilo11oi.I00io1l = i3 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iIooilo11oi = new IIooilo11oi(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = iIooilo11oi.I00ilI0I1;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i4 = iIooilo11oi.I00io1l;
/* 41 */            if (i4 == 0) {
/* 67 */                lIoii1l01l0i.I00000oOI(obj);
/* 70 */                l11I11lO.I0000O(3, "CXCP");
/* 77 */                i2 = i == 0 ? 1 : 0;
/* 82 */                if (l11I11lO.I0000O(3, "CXCP")) {
/* 84 */                    Objects.toString(list2);
                        }
/* 93 */                if (list2.contains(IIooOO1o.I00iOIl)) {
/* 95 */                    l11I11lO.I0000O(3, "CXCP");
/* 98 */                    if (i2 == 0) {
/* 132 */                       iO01o11o0lI0 = this;
/* 133 */                       iIooO1o11oo12 = iIooO1o11oo1;
/* 134 */                       l11I11lO.I0000O(3, "CXCP");
/* 146 */                       IOoil1iiIilo iOoil1iiIilo = null;
/* 147 */                       if (list2.contains(IIooOO1o.I00iiI)) {
/* 149 */                           l11I11lO.I0000O(3, "CXCP");
/* 152 */                           if (iIooO1o11oo12 == null) {
/* 164 */                               I000II.I001IO000("Required value was null.");
/* 35 */                                return null;
                                    }
/* 154 */                           objSingletonList = iO01o11o0lI0.I000o00OoI0I(iIooO1o11oo12);
/* 158 */                           l11I11lO.I0000O(3, "CXCP");
                                } else {
/* 172 */                           objSingletonList = Collections.singletonList(iiiO1IOliI0.I00000oIO(null));
                                }
/* 182 */                       if (!list2.contains(IIooOO1o.I00iiO)) {
/* 205 */                           return objSingletonList;
                                }
/* 186 */                       IIOlO1ii iIOlO1ii = iO01o11o0lI0.I0000oI00.I0000oI00;
/* 190 */                       boolean z = i2 != 0;
/* 195 */                       Object obj2 = objSingletonList;
/* 201 */                       iOi1II01i0.I0000O(iIOlO1ii, null, null, new II1lO00lOl(obj2, iOoil1iiIilo, z, this, 2), 3);
/* 204 */                       return obj2;
                            }
/* 100 */                   l11I11lO.I0000O(3, "CXCP");
/* 103 */                   iIooilo11oi.I00iiI = this;
/* 108 */                   iIooilo11oi.I00iiO = list2;
/* 110 */                   iIooilo11oi.I00iio = iIooO1o11oo1;
/* 112 */                   iIooilo11oi.I00iOIl = i2;
/* 114 */                   iIooilo11oi.I00io1l = 1;
/* 123 */                   if (I000l1(1000000000L, false, iIooilo11oi) == ii0111o) {
/* 125 */                       return ii0111o;
                            }
/* 126 */                   iO01o11o0lI0 = this;
/* 127 */                   iIooO1o11oo12 = iIooO1o11oo1;
                        } else {
/* 138 */                   iO01o11o0lI0 = this;
/* 139 */                   iIooO1o11oo12 = iIooO1o11oo1;
/* 146 */                   IOoil1iiIilo iOoil1iiIilo2 = null;
/* 147 */                   if (list2.contains(IIooOO1o.I00iiI)) {
                            }
/* 182 */                   if (!list2.contains(IIooOO1o.I00iiO)) {
                            }
                        }
                    } else {
/* 43 */                if (i4 != 1) {
/* 63 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 45 */                int i5 = iIooilo11oi.I00iOIl;
/* 47 */                iIooO1o11oo12 = iIooilo11oi.I00iio;
/* 49 */                List list3 = iIooilo11oi.I00iiO;
/* 53 */                iO01o11o0lI0 = iIooilo11oi.I00iiI;
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                i2 = i5;
/* 59 */                list2 = list3;
                    }
/* 128 */           l11I11lO.I0000O(3, "CXCP");
/* 134 */           l11I11lO.I0000O(3, "CXCP");
/* 146 */           IOoil1iiIilo iOoil1iiIilo22 = null;
/* 147 */           if (list2.contains(IIooOO1o.I00iiI)) {
                    }
/* 182 */           if (!list2.contains(IIooOO1o.I00iiO)) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(IOoilo iOoilo) {
                    IO00Ooil10 iO00Ooil10;
                    IO01o11o0lI0 iO01o11o0lI0;
/* 3 */             if (iOoilo instanceof IO00Ooil10) {
/* 6 */                 iO00Ooil10 = (IO00Ooil10) iOoilo;
/* 8 */                 int i = iO00Ooil10.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO00Ooil10.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO00Ooil10 = new IO00Ooil10(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0010o = iO00Ooil10.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iO00Ooil10.I00iio;
/* 36 */            if (i2 == 0) {
/* 52 */                lIoii1l01l0i.I00000oOI(objI0010o);
/* 57 */                if (this.I000lI == null) {
/* 59 */                    l11I11lO.I0000O(3, "CXCP");
/* 62 */                    iO00Ooil10.I00iOIl = this;
/* 64 */                    iO00Ooil10.I00iio = 1;
/* 76 */                    objI0010o = I0010o(1000000000L, new I10I0o1ii10(29), iO00Ooil10);
/* 80 */                    if (objI0010o == ii0111o) {
/* 82 */                        return ii0111o;
                            }
/* 83 */                    iO01o11o0lI0 = this;
                        }
/* 98 */                if (l11I11lO.I0000O(3, "CXCP")) {
/* 102 */                   Objects.toString(this.I000lI);
                        }
/* 105 */               return this.I000lI;
                    }
/* 38 */            if (i2 != 1) {
/* 48 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 40 */            iO01o11o0lI0 = iO00Ooil10.I00iOIl;
/* 42 */            lIoii1l01l0i.I00000oOI(objI0010o);
/* 84 */            IllIi0lI illIi0lI = (IllIi0lI) objI0010o;
/* 92 */            iO01o11o0lI0.I000lI = illIi0lI != null ? illIi0lI.I0000Il00O() : null;
/* 98 */            if (l11I11lO.I0000O(3, "CXCP")) {
                    }
/* 105 */           return this.I000lI;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000O01llI0(List list, int i, int i2, int i3, IIooO1o11oo1 iIooO1o11oo1, IOoilo iOoilo) throws Throwable {
                    IO00iil1 iO00iil1;
/* 3 */             if (iOoilo instanceof IO00iil1) {
/* 6 */                 iO00iil1 = (IO00iil1) iOoilo;
/* 8 */                 int i4 = iO00iil1.I00io1l;
/* 14 */                if ((i4 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO00iil1.I00io1l = i4 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO00iil1 = new IO00iil1(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = iO00iil1.I00ilI0I1;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i5 = iO00iil1.I00io1l;
/* 36 */            if (i5 == 0) {
/* 80 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 89 */                if (l11I11lO.I0000O(3, "CXCP")) {
/* 91 */                    Objects.toString(list);
                        }
/* 94 */                this.I000lI = null;
/* 102 */               if (list.contains(IIooOO1o.I00iiI) && iIooO1o11oo1 == null) {
/* 109 */                   I000II.I001IO000("Must not be null for PipelineType.MAIN_CAPTURE");
/* 35 */                    return null;
                        }
/* 113 */               if (i2 == 3) {
/* 115 */                   iO00iil1.I00io1l = 1;
/* 117 */                   Object objI000lI = I000lI(iIooO1o11oo1, i, list, iO00iil1);
/* 121 */                   if (objI000lI != obj) {
/* 124 */                       return objI000lI;
                            }
                        } else {
/* 128 */                   iO00iil1.I00iOIl = list;
/* 130 */                   iO00iil1.I00iiI = iIooO1o11oo1;
/* 132 */                   iO00iil1.I00iiO = i;
/* 134 */                   iO00iil1.I00iio = i2;
/* 136 */                   iO00iil1.I00io1l = 2;
/* 157 */                   objI0000Il00O = (this.I000l1 == 3 || i3 == 1) ? Boolean.TRUE : this.I000II.I0000Il00O(new IIl00I(this, null, 1), iO00iil1);
/* 160 */                   if (objI0000Il00O != obj) {
                            }
                        }
/* 199 */               return obj;
                    }
/* 38 */            if (i5 == 1) {
/* 76 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 79 */                return objI0000Il00O;
                    }
/* 40 */            if (i5 != 2) {
/* 42 */                if (i5 == 3) {
/* 56 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 59 */                    return objI0000Il00O;
                        }
/* 44 */                if (i5 == 4) {
/* 46 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 49 */                    return objI0000Il00O;
                        }
/* 52 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                return null;
                    }
/* 60 */            i2 = iO00iil1.I00iio;
/* 62 */            i = iO00iil1.I00iiO;
/* 64 */            iIooO1o11oo1 = iO00iil1.I00iiI;
/* 66 */            list = iO00iil1.I00iOIl;
/* 70 */            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 73 */            List list2 = list;
/* 74 */            IIooO1o11oo1 iIooO1o11oo12 = iIooO1o11oo1;
/* 169 */           if (((Boolean) objI0000Il00O).booleanValue()) {
/* 171 */               iO00iil1.I00iOIl = null;
/* 173 */               iO00iil1.I00iiI = null;
/* 175 */               iO00iil1.I00io1l = 3;
/* 178 */               Object objI00100o1O0lo = I00100o1O0lo(iIooO1o11oo12, i, i2, list2, iO00iil1);
/* 182 */               if (objI00100o1O0lo != obj) {
/* 185 */                   return objI00100o1O0lo;
                        }
                    } else {
/* 186 */               IO00iil1 iO00iil12 = iO00iil1;
/* 187 */               iO00iil12.I00iOIl = null;
/* 189 */               iO00iil12.I00iiI = null;
/* 191 */               iO00iil12.I00io1l = 4;
/* 193 */               Object objI0000oI00 = I0000oI00(iIooO1o11oo12, i, i2, list2, iO00iil12);
/* 197 */               if (objI0000oI00 != obj) {
/* 685 */                   return objI0000oI00;
                        }
                    }
/* 199 */           return obj;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OOo1O(int i, IOoilo iOoilo) throws Throwable {
                    IO00lOIi1 iO00lOIi1;
                    int i2;
                    AutoCloseable autoCloseable;
                    Throwable th;
                    AutoCloseable autoCloseable2;
                    IIll1i iIll1i;
/* 3 */             if (iOoilo instanceof IO00lOIi1) {
/* 6 */                 iO00lOIi1 = (IO00lOIi1) iOoilo;
/* 8 */                 int i3 = iO00lOIi1.I00ilI0I1;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO00lOIi1.I00ilI0I1 = i3 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO00lOIi1 = new IO00lOIi1(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = iO00lOIi1.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i4 = iO00lOIi1.I00ilI0I1;
/* 34 */            boolean z = true;
/* 37 */            if (i4 == 0) {
/* 71 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 74 */                IlOI0O11011l ilOI0O11011l = this.I00000oOI;
/* 76 */                iO00lOIi1.I00iOIl = i;
/* 78 */                iO00lOIi1.I00ilI0I1 = 1;
/* 84 */                if (ilOI0O11011l.I0001Ioi1lo(iO00lOIi1) != ii0111o) {
                        }
/* 131 */               return ii0111o;
                    }
/* 39 */            if (i4 != 1) {
/* 41 */                if (i4 != 2) {
/* 43 */                    if (i4 != 3) {
/* 55 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                        return null;
                            }
/* 45 */                    autoCloseable2 = iO00lOIi1.I00iiI;
                            try {
/* 47 */                        lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 133 */                       l11I11lO.I0000O(3, "CXCP");
/* 136 */                       iOOl00.I00000oIO(autoCloseable2, null);
/* 139 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th2) {
/* 51 */                        th = th2;
                                try {
/* 146 */                           throw th;
                                } catch (Throwable th3) {
/* 148 */                           iOOl00.I00000oIO(autoCloseable2, th);
/* 332 */                           throw th3;
                                }
                            }
                        }
/* 59 */                i2 = iO00lOIi1.I00iOIl;
/* 61 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 109 */               autoCloseable = (AutoCloseable) objI0000Il00O;
                        try {
/* 112 */                   iIll1i = (IIll1i) autoCloseable;
/* 114 */                   l11I11lO.I0000O(3, "CXCP");
/* 117 */                   if (i2 == 0) {
/* 120 */                       z = false;
                            }
/* 121 */                   iO00lOIi1.I00iiI = autoCloseable;
/* 123 */                   iO00lOIi1.I00ilI0I1 = 3;
/* 129 */                   if (iIll1i.I001l0I00(z) != ii0111o) {
/* 132 */                       autoCloseable2 = autoCloseable;
/* 133 */                       l11I11lO.I0000O(3, "CXCP");
/* 136 */                       iOOl00.I00000oIO(autoCloseable2, null);
/* 139 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 131 */                   return ii0111o;
                        } catch (Throwable th4) {
/* 144 */                   th = th4;
/* 145 */                   autoCloseable2 = autoCloseable;
/* 146 */                   throw th;
                        }
                    }
/* 65 */            i = iO00lOIi1.I00iOIl;
/* 67 */            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 87 */            l11I11lO.I0000O(3, "CXCP");
/* 92 */            IIll0oO iIll0oOI00000oIO = this.I000OOo1O.I00000oIO();
/* 96 */            iO00lOIi1.I00iOIl = i;
/* 98 */            iO00lOIi1.I00ilI0I1 = 2;
/* 100 */           objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(iO00lOIi1);
/* 104 */           if (objI0000Il00O != ii0111o) {
/* 107 */               i2 = i;
/* 109 */               autoCloseable = (AutoCloseable) objI0000Il00O;
/* 112 */               iIll1i = (IIll1i) autoCloseable;
/* 114 */               l11I11lO.I0000O(3, "CXCP");
/* 117 */               if (i2 == 0) {
                        }
/* 121 */               iO00lOIi1.I00iiI = autoCloseable;
/* 123 */               iO00lOIi1.I00ilI0I1 = 3;
/* 129 */               if (iIll1i.I001l0I00(z) != ii0111o) {
                        }
                    }
/* 131 */           return ii0111o;
                }

                /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
                
                    if (r14 != r1) goto L45;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r12v0, types: [IO01o11o0lI0] */
                /* JADX WARN: Type inference failed for: r12v1 */
                /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.AutoCloseable] */
                /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.AutoCloseable] */
                /* JADX WARN: Type inference failed for: r12v20 */
                /* JADX WARN: Type inference failed for: r12v21 */
                /* JADX WARN: Type inference failed for: r12v8 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OiO(int i, IOoilo iOoilo) throws Throwable {
                    IO00lOlioo iO00lOlioo;
                    int i2;
                    AutoCloseable autoCloseable;
                    AutoCloseable autoCloseable2;
/* 3 */             if (iOoilo instanceof IO00lOlioo) {
/* 6 */                 iO00lOlioo = (IO00lOlioo) iOoilo;
/* 8 */                 int i3 = iO00lOlioo.I00ilI0I1;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO00lOlioo.I00ilI0I1 = i3 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO00lOlioo = new IO00lOlioo(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = iO00lOlioo.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i4 = iO00lOlioo.I00ilI0I1;
                    try {
/* 38 */                if (i4 == 0) {
/* 82 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 85 */                    IlOI0O11011l ilOI0O11011l = this.I00000oOI;
/* 87 */                    iO00lOlioo.I00iOIl = i;
/* 89 */                    iO00lOlioo.I00ilI0I1 = 1;
/* 95 */                    if (ilOI0O11011l.I0000oI00(iO00lOlioo) != ii0111o) {
                            }
/* 157 */                   return ii0111o;
                        }
/* 40 */                if (i4 == 1) {
/* 76 */                    i = iO00lOlioo.I00iOIl;
/* 78 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
                        } else {
/* 42 */                    if (i4 == 2) {
/* 70 */                        i2 = iO00lOlioo.I00iOIl;
/* 72 */                        lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 117 */                       autoCloseable = (AutoCloseable) objI0000Il00O;
                                try {
/* 120 */                           IIll1i iIll1i = (IIll1i) autoCloseable;
/* 122 */                           l11I11lO.I0000O(3, "CXCP");
/* 129 */                           boolean z = i2 != 0;
/* 130 */                           iO00lOlioo.I00iiI = autoCloseable;
/* 132 */                           iO00lOlioo.I00ilI0I1 = 3;
/* 137 */                           objI0000Il00O = IIll1i.I000II(iIll1i, z, true, 2000000000L);
/* 141 */                           if (objI0000Il00O != ii0111o) {
/* 144 */                               autoCloseable2 = autoCloseable;
/* 147 */                               iO00lOlioo.I00iiI = autoCloseable2;
/* 149 */                               iO00lOlioo.I00ilI0I1 = 4;
/* 151 */                               objI0000Il00O = ((IiIOI1ol0o) objI0000Il00O).I00o0iI0io1(iO00lOlioo);
                                        this = autoCloseable2;
                                    }
/* 157 */                           return ii0111o;
                                } catch (Throwable th) {
/* 177 */                           th = th;
/* 178 */                           this = autoCloseable;
                                    try {
/* 179 */                               throw th;
                                    } catch (Throwable th2) {
/* 181 */                               iOOl00.I00000oIO(this, th);
/* 332 */                               throw th2;
                                    }
                                }
                            }
/* 44 */                    if (i4 != 3) {
/* 46 */                        if (i4 != 4) {
/* 60 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                            return null;
                                }
/* 48 */                        AutoCloseable autoCloseable3 = iO00lOlioo.I00iiI;
/* 50 */                        lIoii1l01l0i.I00000oOI(objI0000Il00O);
                                this = autoCloseable3;
/* 158 */                       Oi10OoO0l oi10OoO0l = (Oi10OoO0l) objI0000Il00O;
/* 164 */                       if (l11I11lO.I0000O(3, "CXCP")) {
/* 166 */                           Objects.toString(oi10OoO0l);
                                }
/* 169 */                       iOOl00.I00000oIO(this, null);
/* 172 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 64 */                    AutoCloseable autoCloseable4 = iO00lOlioo.I00iiI;
/* 66 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
                            autoCloseable2 = autoCloseable4;
/* 147 */                   iO00lOlioo.I00iiI = autoCloseable2;
/* 149 */                   iO00lOlioo.I00ilI0I1 = 4;
/* 151 */                   objI0000Il00O = ((IiIOI1ol0o) objI0000Il00O).I00o0iI0io1(iO00lOlioo);
                            this = autoCloseable2;
                        }
/* 100 */               IIll0oO iIll0oOI00000oIO = this.I000OOo1O.I00000oIO();
/* 104 */               iO00lOlioo.I00iOIl = i;
/* 106 */               iO00lOlioo.I00ilI0I1 = 2;
/* 108 */               objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(iO00lOlioo);
/* 112 */               if (objI0000Il00O != ii0111o) {
/* 115 */                   i2 = i;
/* 117 */                   autoCloseable = (AutoCloseable) objI0000Il00O;
/* 120 */                   IIll1i iIll1i2 = (IIll1i) autoCloseable;
/* 122 */                   l11I11lO.I0000O(3, "CXCP");
/* 129 */                   if (i2 != 0) {
                            }
/* 130 */                   iO00lOlioo.I00iiI = autoCloseable;
/* 132 */                   iO00lOlioo.I00ilI0I1 = 3;
/* 137 */                   objI0000Il00O = IIll1i.I000II(iIll1i2, z, true, 2000000000L);
/* 141 */                   if (objI0000Il00O != ii0111o) {
                            }
                        }
/* 157 */               return ii0111o;
                    } catch (Throwable th3) {
/* 55 */                th = th3;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000iOII(int i, IOoilo iOoilo) throws Throwable {
                    IO00loo iO00loo;
/* 3 */             if (iOoilo instanceof IO00loo) {
/* 6 */                 iO00loo = (IO00loo) iOoilo;
/* 8 */                 int i2 = iO00loo.I00iiO;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO00loo.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO00loo = new IO00loo(this, iOoilo);
                        }
                    }
/* 25 */            Object objI000II = iO00loo.I00iOIl;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i3 = iO00loo.I00iiO;
/* 31 */            boolean z = false;
/* 33 */            if (i3 == 0) {
/* 48 */                lIoii1l01l0i.I00000oOI(objI000II);
/* 51 */                if (i != 0) {
/* 53 */                    if (i == 1) {
/* 68 */                        z = true;
                            } else if (i != 2 && i != 3) {
/* 67 */                        throw new AssertionError(i);
                            }
/* 104 */                   return Boolean.valueOf(z);
                        }
/* 70 */                iO00loo.I00iiO = 1;
/* 72 */                objI000II = I000II(iO00loo);
/* 76 */                if (objI000II == obj) {
/* 78 */                    return obj;
                        }
                    } else {
/* 35 */                if (i3 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 46 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI000II);
                    }
/* 79 */            I0oIl0101 i0oIl0101 = (I0oIl0101) objI000II;
/* 81 */            if (i0oIl0101 != null) {
/* 91 */                Integer num = (Integer) i0oIl0101.I00iOIl.get(CaptureResult.CONTROL_AE_STATE);
/* 93 */                if (num != null && num.intValue() == 4) {
                        }
                    }
/* 104 */           return Boolean.valueOf(z);
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Type inference failed for: r2v3 */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.AutoCloseable, java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v6 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000l1(long j, boolean z, IOoilo iOoilo) throws Throwable {
                    IO00oI iO00oI;
                    long j2;
                    boolean z2;
                    long j3;
                    AutoCloseable autoCloseable;
                    AutoCloseable autoCloseable2;
                    Ii0111o ii0111o;
                    ?? r2;
                    IO00oI iO00oI2;
                    AutoCloseable autoCloseable3;
                    Throwable th;
/* 7 */             if (iOoilo instanceof IO00oI) {
/* 10 */                iO00oI = (IO00oI) iOoilo;
/* 12 */                int i = iO00oI.I00ilO0;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    iO00oI.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iO00oI = new IO00oI(this, iOoilo);
                        }
                    }
/* 29 */            Object objI0000Il00O = iO00oI.I00iio;
/* 31 */            Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 33 */            int i2 = iO00oI.I00ilO0;
/* 36 */            int i3 = 1;
                    try {
/* 39 */                if (i2 == 0) {
/* 81 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 86 */                    IIll0oO iIll0oOI00000oIO = this.I000OOo1O.I00000oIO();
/* 90 */                    j2 = j;
/* 92 */                    iO00oI.I00iOIl = j2;
/* 94 */                    z2 = z;
/* 96 */                    iO00oI.I00iiI = z2;
/* 98 */                    iO00oI.I00ilO0 = 1;
/* 100 */                   objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(iO00oI);
/* 104 */                   if (objI0000Il00O == ii0111o2) {
/* 106 */                       return ii0111o2;
                            }
                        } else {
/* 41 */                    if (i2 != 1) {
/* 43 */                        if (i2 != 2) {
/* 45 */                            if (i2 == 3) {
/* 47 */                                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 50 */                                return objI0000Il00O;
                                    }
/* 53 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 38 */                            return null;
                                }
/* 57 */                        autoCloseable2 = iO00oI.I00iiO;
                                try {
/* 59 */                            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 62 */                            ii0111o = ii0111o2;
/* 63 */                            autoCloseable3 = autoCloseable2;
/* 64 */                            iO00oI2 = iO00oI;
/* 65 */                            r2 = 0;
                                } catch (Throwable th2) {
/* 68 */                            th = th2;
/* 69 */                            th = th;
                                    try {
/* 207 */                               throw th;
                                    } catch (Throwable th3) {
/* 209 */                               iOOl00.I00000oIO(autoCloseable2, th);
/* 408 */                               throw th3;
                                    }
                                }
                                try {
/* 181 */                           IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) objI0000Il00O;
/* 183 */                           iOOl00.I00000oIO(autoCloseable3, r2);
/* 186 */                           iO00oI2.I00iiO = r2;
/* 189 */                           iO00oI2.I00ilO0 = 3;
/* 191 */                           Object objI00o0iI0io1 = iiIOI1ol0o.I00o0iI0io1(iO00oI2);
                                    return objI00o0iI0io1 != ii0111o ? ii0111o : objI00o0iI0io1;
                                } catch (Throwable th4) {
/* 200 */                           th = th4;
/* 201 */                           autoCloseable2 = autoCloseable3;
/* 207 */                           throw th;
                                }
                            }
/* 72 */                    z2 = iO00oI.I00iiI;
/* 74 */                    j2 = iO00oI.I00iOIl;
/* 76 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
                        }
/* 117 */               O11ooiIoo0l o11ooiIoo0l = new O11ooiIoo0l();
/* 120 */               o11ooiIoo0l.I00000oIO = 2;
/* 122 */               VarHandle.storeStoreFence();
/* 127 */               I1loII i1loII = new I1loII(i3);
/* 130 */               i1loII.I00iiO = this;
/* 132 */               i1loII.I00iiI = z2;
/* 134 */               VarHandle.storeStoreFence();
/* 137 */               iO00oI.I00iiO = autoCloseable;
/* 139 */               iO00oI.I00ilO0 = 2;
/* 161 */               ii0111o = ii0111o2;
/* 163 */               IO00oI iO00oI3 = iO00oI;
/* 165 */               r2 = 0;
/* 167 */               Object objI0000Il00O2 = IIll1i.I0000Il00O((IIll1i) autoCloseable, null, null, null, null, o11ooiIoo0l, null, null, i1loII, j3, 1000000000L, iO00oI3, 6719);
/* 171 */               iO00oI2 = iO00oI3;
/* 173 */               if (objI0000Il00O2 == ii0111o) {
/* 197 */                   return ii0111o;
                        }
/* 178 */               autoCloseable3 = autoCloseable;
/* 179 */               objI0000Il00O = objI0000Il00O2;
/* 181 */               IiIOI1ol0o iiIOI1ol0o2 = (IiIOI1ol0o) objI0000Il00O;
/* 183 */               iOOl00.I00000oIO(autoCloseable3, r2);
/* 186 */               iO00oI2.I00iiO = r2;
/* 189 */               iO00oI2.I00ilO0 = 3;
/* 191 */               Object objI00o0iI0io12 = iiIOI1ol0o2.I00o0iI0io1(iO00oI2);
                        if (objI00o0iI0io12 != ii0111o) {
                        }
                    } catch (Throwable th5) {
/* 203 */               th = th5;
/* 204 */               autoCloseable2 = autoCloseable;
/* 69 */                th = th;
/* 207 */               throw th;
                    }
/* 79 */            j3 = j2;
/* 108 */           autoCloseable = (AutoCloseable) objI0000Il00O;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000lI(IIooO1o11oo1 iIooO1o11oo1, int i, List list, IOoilo iOoilo) throws Throwable {
                    IO010o0i iO010o0i;
                    IO01o11o0lI0 iO01o11o0lI0;
                    List listSingletonList;
/* 3 */             if (iOoilo instanceof IO010o0i) {
/* 6 */                 iO010o0i = (IO010o0i) iOoilo;
/* 8 */                 int i2 = iO010o0i.I00io1l;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO010o0i.I00io1l = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO010o0i = new IO010o0i(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iO010o0i.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = iO010o0i.I00io1l;
/* 36 */            if (i3 == 0) {
/* 60 */                lIoii1l01l0i.I00000oOI(obj);
/* 63 */                l11I11lO.I0000O(3, "CXCP");
/* 70 */                if (l11I11lO.I0000O(3, "CXCP")) {
/* 72 */                    Objects.toString(list);
                        }
/* 81 */                if (!list.contains(IIooOO1o.I00iOIl)) {
/* 111 */                   iO01o11o0lI0 = this;
/* 118 */                   if (list.contains(IIooOO1o.I00iiI)) {
/* 143 */                       listSingletonList = Collections.singletonList(iiiO1IOliI0.I00000oIO(null));
                            } else {
/* 120 */                       l11I11lO.I0000O(3, "CXCP");
/* 123 */                       if (iIooO1o11oo1 == null) {
/* 135 */                           I000II.I001IO000("Required value was null.");
/* 31 */                            return null;
                                }
/* 125 */                       listSingletonList = iO01o11o0lI0.I000o00OoI0I(iIooO1o11oo1);
/* 129 */                       l11I11lO.I0000O(3, "CXCP");
                            }
/* 153 */                   if (list.contains(IIooOO1o.I00iiO)) {
/* 164 */                       iOi1II01i0.I0000O(iO01o11o0lI0.I0000oI00.I0000oI00, null, null, new II1iIl0Ililo(listSingletonList, (IOoil1iiIilo) null, this, i), 3);
                            }
/* 204 */                   return listSingletonList;
                        }
/* 83 */                l11I11lO.I0000O(3, "CXCP");
/* 86 */                iO010o0i.I00iiI = this;
/* 91 */                iO010o0i.I00iiO = list;
/* 93 */                iO010o0i.I00iio = iIooO1o11oo1;
/* 95 */                iO010o0i.I00iOIl = i;
/* 97 */                iO010o0i.I00io1l = 1;
/* 103 */               if (I000OiO(i, iO010o0i) == ii0111o) {
/* 105 */                   return ii0111o;
                        }
/* 106 */               iO01o11o0lI0 = this;
                    } else {
/* 38 */                if (i3 != 1) {
/* 56 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 40 */                i = iO010o0i.I00iOIl;
/* 42 */                iIooO1o11oo1 = iO010o0i.I00iio;
/* 44 */                list = iO010o0i.I00iiO;
/* 48 */                iO01o11o0lI0 = iO010o0i.I00iiI;
/* 50 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 107 */           l11I11lO.I0000O(3, "CXCP");
/* 118 */           if (list.contains(IIooOO1o.I00iiI)) {
                    }
/* 153 */           if (list.contains(IIooOO1o.I00iiO)) {
                    }
/* 204 */           return listSingletonList;
                }

                public final ArrayList I000o00OoI0I(IIooO1o11oo1 iIooO1o11oo1) {
/* 1 */             List list = iIooO1o11oo1.I00000oIO;
/* 10 */            if (l11I11lO.I0000O(3, "CXCP")) {
/* 12 */                Objects.toString(list);
                    }
/* 17 */            ArrayList arrayList = new ArrayList();
/* 24 */            ArrayList arrayList2 = new ArrayList();
/* 27 */            Iterator it = list.iterator();
                    while (true) {
/* 35 */                Oi01iIoI oi01iIoII00000oIO = null;
/* 36 */                if (!it.hasNext()) {
                            break;
                        }
/* 42 */                IIoo00iOol0 iIoo00iOol0 = (IIoo00iOol0) it.next();
/* 46 */                IOi10loi iOi10loi = new IOi10loi();
/* 49 */                arrayList.add(iOi10loi);
                        try {
/* 52 */                    IIoo0IllI iIoo0IllI = this.I00000oIO;
/* 54 */                    int i = iIooO1o11oo1.I00000oOI;
/* 56 */                    IOlOo1ll1l1 iOlOo1ll1l1 = iIooO1o11oo1.I0000Il00O;
/* 60 */                    IO01I0i1OO iO01I0i1OO = new IO01I0i1OO();
/* 63 */                    iO01I0i1OO.I00iOIl = iOi10loi;
/* 65 */                    VarHandle.storeStoreFence();
/* 72 */                    oi01iIoII00000oIO = iIoo0IllI.I00000oIO(iIoo00iOol0, i, iOlOo1ll1l1, Collections.singletonList(iO01I0i1OO));
                        } catch (IllegalStateException e) {
/* 83 */                    if (l11I11lO.I0000O(4, "CXCP")) {
/* 87 */                        Log.i("CXCP", "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!", e);
                            }
/* 114 */                   iOi10loi.I00iIO(new Ioi1lIO("Capture request failed with reason " + e.getMessage(), e, 2));
                        }
/* 117 */               if (oi01iIoII00000oIO != null) {
/* 119 */                   arrayList2.add(oi01iIoII00000oIO);
                        }
                    }
/* 127 */           if (arrayList2.isEmpty()) {
/* 129 */               return arrayList;
                    }
/* 139 */           iOi1II01i0.I0000O(this.I0000oI00.I0000oI00, null, null, new I0iOI0o1i(null, this, arrayList, arrayList2), 3);
/* 168 */           return arrayList;
                }

                public final IO01oO I000oI1ioi(I0oIl0101 i0oIl0101) {
/* 3 */             IO01i10I iO01i10I = new IO01i10I();
/* 6 */             iO01i10I.I00iOIl = i0oIl0101;
/* 8 */             i0oIl0101.getClass();
/* 11 */            CaptureResult captureResult = i0oIl0101.I00iOIl;
/* 13 */            captureResult.getFrameNumber();
/* 16 */            IO000io11iO1 iO000io11iO1 = this.I000o00OoI0I;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            captureResult.getFrameNumber();
/* 26 */            return new IO01oO(iO000io11iO1, iO01i10I);
                }

                /* JADX WARN: Removed duplicated region for block: B:102:0x0287  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x029c  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x02ae  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x02cb  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0186  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x01e9  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01fc  */
                /* JADX WARN: Type inference failed for: r7v0, types: [int] */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.AutoCloseable] */
                /* JADX WARN: Type inference failed for: r7v36 */
                /* JADX WARN: Type inference failed for: r7v37 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00100l0(IIooO1o11oo1 iIooO1o11oo1, int i, long j, List list, boolean z, IOoilo iOoilo) throws Throwable {
                    IO01iI1oO iO01iI1oO;
                    Throwable th;
                    AutoCloseable autoCloseable;
                    int i2;
                    int i3;
                    IIooO1o11oo1 iIooO1o11oo12;
                    int i4;
                    boolean z2;
                    int i5;
                    boolean z3;
                    int i6;
                    IO01o11o0lI0 iO01o11o0lI0;
                    long j2;
                    boolean z4;
                    IO01o11o0lI0 iO01o11o0lI02;
                    int i7;
                    IO01o11o0lI0 iO01o11o0lI03;
                    boolean z5;
                    int i8;
                    IIooO1o11oo1 iIooO1o11oo13;
                    List list2;
                    int i9;
                    IO01o11o0lI0 iO01o11o0lI04;
                    List list3;
                    int i10;
                    int i11;
                    int i12;
                    IIooO1o11oo1 iIooO1o11oo14;
                    long j3;
                    AutoCloseable autoCloseable2;
                    Object objI000II;
                    AutoCloseable autoCloseable3;
                    List list4;
                    IO01o11o0lI0 iO01o11o0lI05;
                    List list5;
                    List listSingletonList;
/* 3 */             int i13 = i;
/* 5 */             List list6 = list;
/* 9 */             OoI00O0l ooI00O0l = this.I0000Il00O;
/* 13 */            if (iOoilo instanceof IO01iI1oO) {
/* 16 */                iO01iI1oO = (IO01iI1oO) iOoilo;
/* 18 */                int i14 = iO01iI1oO.I00ll1;
/* 24 */                if ((i14 & Integer.MIN_VALUE) != 0) {
/* 27 */                    iO01iI1oO.I00ll1 = i14 - Integer.MIN_VALUE;
                        } else {
/* 32 */                    iO01iI1oO = new IO01iI1oO(this, iOoilo);
                        }
                    }
/* 35 */            Object objI00o0iI0io1 = iO01iI1oO.I00l0OO0IO;
/* 37 */            Object obj = Ii0111o.I00iOIl;
/* 39 */            ?? r7 = iO01iI1oO.I00ll1;
                    try {
                        switch (r7) {
                            case 0:
/* 219 */                       lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 222 */                       l11I11lO.I0000O(3, "CXCP");
/* 231 */                       Integer num = (Integer) ooI00O0l.I0000oI00.I0000O();
/* 244 */                       i2 = (num != null && num.intValue() == 0) ? 1 : 0;
/* 252 */                       i3 = (i2 != 0 || i13 == 0) ? 1 : 0;
/* 257 */                       if (l11I11lO.I0000O(3, "CXCP")) {
/* 259 */                           Objects.toString(list6);
                                }
/* 268 */                       if (list6.contains(IIooOO1o.I00iOIl)) {
/* 270 */                           l11I11lO.I0000O(3, "CXCP");
/* 273 */                           if (i2 == 0) {
/* 324 */                               iIooO1o11oo12 = iIooO1o11oo1;
/* 326 */                               j2 = j;
/* 328 */                               z4 = z;
/* 330 */                               iO01o11o0lI02 = this;
/* 331 */                               if (z4) {
                                        }
/* 604 */                               return obj;
                                    }
/* 275 */                           l11I11lO.I0000O(3, "CXCP");
/* 9 */                             IOi10loi iOi10loiI0000Il00O = ooI00O0l.I0000Il00O(2, true, (6 & 4) == 0);
/* 283 */                           iO01iI1oO.I00ilO0 = this;
/* 288 */                           iO01iI1oO.I00io1l = list6;
/* 290 */                           iIooO1o11oo12 = iIooO1o11oo1;
/* 292 */                           iO01iI1oO.I00ioIO = iIooO1o11oo12;
/* 294 */                           iO01iI1oO.I00iOIl = i13;
/* 296 */                           j2 = j;
/* 298 */                           iO01iI1oO.I00iio = j2;
/* 300 */                           z4 = z;
/* 302 */                           iO01iI1oO.I00ilI0I1 = z4;
/* 304 */                           iO01iI1oO.I00iiI = i2;
/* 306 */                           iO01iI1oO.I00iiO = i3;
/* 309 */                           iO01iI1oO.I00ll1 = 1;
/* 315 */                           if (iOi10loiI0000Il00O.I001l0I00(iO01iI1oO) != obj) {
/* 319 */                               iO01o11o0lI02 = this;
/* 320 */                               l11I11lO.I0000O(3, "CXCP");
/* 331 */                               if (z4) {
/* 333 */                                   l11I11lO.I0000O(3, "CXCP");
/* 338 */                                   IIll0oO iIll0oOI00000oIO = this.I000OOo1O.I00000oIO();
/* 342 */                                   iO01iI1oO.I00ilO0 = iO01o11o0lI02;
/* 347 */                                   iO01iI1oO.I00io1l = list6;
/* 349 */                                   iO01iI1oO.I00ioIO = iIooO1o11oo12;
/* 351 */                                   iO01iI1oO.I00iOIl = i13;
/* 353 */                                   iO01iI1oO.I00iio = j2;
/* 355 */                                   iO01iI1oO.I00ilI0I1 = z4;
/* 357 */                                   iO01iI1oO.I00iiI = i2;
/* 359 */                                   iO01iI1oO.I00iiO = i3;
/* 361 */                                   iO01iI1oO.I00ll1 = 2;
/* 363 */                                   Object objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(iO01iI1oO);
/* 367 */                                   if (objI0000Il00O != obj) {
/* 371 */                                       boolean z6 = z4;
/* 372 */                                       iO01o11o0lI04 = iO01o11o0lI02;
/* 373 */                                       z5 = z6;
/* 374 */                                       list3 = list6;
/* 375 */                                       i10 = i2;
/* 376 */                                       objI00o0iI0io1 = objI0000Il00O;
/* 377 */                                       i11 = i13;
/* 378 */                                       i12 = i3;
/* 379 */                                       long j4 = j2;
/* 381 */                                       iIooO1o11oo14 = iIooO1o11oo12;
/* 382 */                                       j3 = j4;
/* 384 */                                       autoCloseable2 = (AutoCloseable) objI00o0iI0io1;
                                                try {
/* 387 */                                           IIll1i iIll1i = (IIll1i) autoCloseable2;
/* 393 */                                           boolean z7 = i11 != 0;
/* 394 */                                           List list7 = list3;
/* 400 */                                           boolean z8 = i11 != 0;
/* 401 */                                           iO01iI1oO.I00ilO0 = iO01o11o0lI04;
/* 403 */                                           IO01o11o0lI0 iO01o11o0lI06 = iO01o11o0lI04;
/* 409 */                                           iO01iI1oO.I00io1l = list7;
/* 411 */                                           iO01iI1oO.I00ioIO = iIooO1o11oo14;
/* 413 */                                           iO01iI1oO.I00l0I0l0lO1 = autoCloseable2;
/* 415 */                                           iO01iI1oO.I00iOIl = i11;
/* 417 */                                           iO01iI1oO.I00ilI0I1 = z5;
/* 419 */                                           iO01iI1oO.I00iiI = i10;
/* 421 */                                           iO01iI1oO.I00iiO = i12;
/* 424 */                                           iO01iI1oO.I00ll1 = 3;
/* 426 */                                           objI000II = IIll1i.I000II(iIll1i, z7, z8, j3);
/* 430 */                                           if (objI000II != obj) {
/* 435 */                                               autoCloseable3 = autoCloseable2;
/* 436 */                                               objI00o0iI0io1 = objI000II;
/* 437 */                                               list4 = list7;
/* 439 */                                               iIooO1o11oo12 = iIooO1o11oo14;
/* 440 */                                               iO01o11o0lI05 = iO01o11o0lI06;
/* 444 */                                               iO01iI1oO.I00ilO0 = iO01o11o0lI05;
/* 449 */                                               iO01iI1oO.I00io1l = list4;
/* 451 */                                               iO01iI1oO.I00ioIO = iIooO1o11oo12;
/* 453 */                                               iO01iI1oO.I00l0I0l0lO1 = autoCloseable3;
/* 455 */                                               iO01iI1oO.I00iOIl = i11;
/* 457 */                                               iO01iI1oO.I00ilI0I1 = z5;
/* 459 */                                               iO01iI1oO.I00iiI = i10;
/* 461 */                                               iO01iI1oO.I00iiO = i12;
/* 464 */                                               iO01iI1oO.I00ll1 = 4;
/* 466 */                                               objI00o0iI0io1 = ((IiIOI1ol0o) objI00o0iI0io1).I00o0iI0io1(iO01iI1oO);
/* 470 */                                               if (objI00o0iI0io1 == obj) {
/* 474 */                                                   i7 = i11;
/* 475 */                                                   iO01o11o0lI03 = iO01o11o0lI05;
/* 476 */                                                   list5 = list4;
                                                            r7 = autoCloseable3;
/* 477 */                                                   Oi10OoO0l oi10OoO0l = (Oi10OoO0l) objI00o0iI0io1;
/* 480 */                                                   iOOl00.I00000oIO(r7, null);
/* 488 */                                                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 490 */                                                       Objects.toString(oi10OoO0l);
                                                            }
/* 493 */                                                   i3 = i12;
/* 494 */                                                   i2 = i10;
/* 495 */                                                   list6 = list5;
/* 496 */                                                   i4 = 3;
/* 497 */                                                   z2 = true;
/* 622 */                                                   l11I11lO.I0000O(i4, "CXCP");
/* 625 */                                                   iO01o11o0lI0 = iO01o11o0lI03;
/* 626 */                                                   z3 = z5;
/* 627 */                                                   i5 = i3;
/* 628 */                                                   i6 = i7;
/* 646 */                                                   if (list6.contains(IIooOO1o.I00iiI)) {
/* 675 */                                                       listSingletonList = Collections.singletonList(iiiO1IOliI0.I00000oIO(null));
                                                            } else {
/* 648 */                                                       l11I11lO.I0000O(i4, "CXCP");
/* 651 */                                                       if (iIooO1o11oo12 == null) {
/* 663 */                                                           I000II.I001IO000("Required value was null.");
/* 666 */                                                           return null;
                                                                }
/* 653 */                                                       listSingletonList = iO01o11o0lI0.I000o00OoI0I(iIooO1o11oo12);
/* 657 */                                                       l11I11lO.I0000O(i4, "CXCP");
                                                            }
/* 685 */                                                   if (list6.contains(IIooOO1o.I00iiO)) {
/* 716 */                                                       return listSingletonList;
                                                            }
/* 689 */                                                   IIOlO1ii iIOlO1ii = iO01o11o0lI0.I0000oI00.I0000oI00;
/* 693 */                                                   int i15 = i5;
/* 698 */                                                   boolean z9 = i2 != 0 ? z2 : false;
/* 703 */                                                   boolean z10 = i15 != 0 ? z2 : false;
/* 705 */                                                   List list8 = listSingletonList;
/* 712 */                                                   iOi1II01i0.I0000O(iIOlO1ii, null, null, new IO01i1O(list8, null, z9, this, z3, z10, i6), 3);
/* 715 */                                                   return list8;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
/* 501 */                                           th = th2;
/* 502 */                                           autoCloseable = autoCloseable2;
                                                    try {
/* 503 */                                               throw th;
                                                    } catch (Throwable th3) {
/* 505 */                                               iOOl00.I00000oIO(autoCloseable, th);
/* 508 */                                               throw th3;
                                                    }
                                                }
                                            }
                                        } else if (i3 == 0) {
/* 617 */                                   i4 = 3;
/* 618 */                                   z2 = true;
/* 619 */                                   i7 = i13;
/* 620 */                                   iO01o11o0lI03 = iO01o11o0lI02;
/* 621 */                                   z5 = z4;
/* 622 */                                   l11I11lO.I0000O(i4, "CXCP");
/* 625 */                                   iO01o11o0lI0 = iO01o11o0lI03;
/* 626 */                                   z3 = z5;
/* 627 */                                   i5 = i3;
/* 628 */                                   i6 = i7;
/* 646 */                                   if (list6.contains(IIooOO1o.I00iiI)) {
                                            }
/* 685 */                                   if (list6.contains(IIooOO1o.I00iiO)) {
                                            }
                                        } else if (i13 == 0) {
/* 514 */                                   l11I11lO.I0000O(3, "CXCP");
/* 517 */                                   iO01iI1oO.I00ilO0 = iO01o11o0lI02;
/* 522 */                                   iO01iI1oO.I00io1l = list6;
/* 524 */                                   iO01iI1oO.I00ioIO = iIooO1o11oo12;
/* 526 */                                   iO01iI1oO.I00iOIl = i13;
/* 528 */                                   iO01iI1oO.I00ilI0I1 = z4;
/* 530 */                                   iO01iI1oO.I00iiI = i2;
/* 532 */                                   iO01iI1oO.I00iiO = i3;
/* 535 */                                   iO01iI1oO.I00ll1 = 5;
/* 537 */                                   z2 = true;
/* 542 */                                   if (I000l1(j2, true, iO01iI1oO) != obj) {
/* 545 */                                       i7 = i13;
/* 546 */                                       iO01o11o0lI03 = iO01o11o0lI02;
/* 547 */                                       i8 = i3;
/* 548 */                                       iIooO1o11oo13 = iIooO1o11oo12;
/* 549 */                                       z5 = z4;
/* 550 */                                       i4 = 3;
/* 551 */                                       list2 = list6;
/* 552 */                                       i9 = i2;
/* 553 */                                       l11I11lO.I0000O(i4, "CXCP");
/* 556 */                                       i2 = i9;
/* 557 */                                       list6 = list2;
/* 558 */                                       iIooO1o11oo12 = iIooO1o11oo13;
/* 559 */                                       i3 = i8;
/* 622 */                                       l11I11lO.I0000O(i4, "CXCP");
/* 625 */                                       iO01o11o0lI0 = iO01o11o0lI03;
/* 626 */                                       z3 = z5;
/* 627 */                                       i5 = i3;
/* 628 */                                       i6 = i7;
/* 646 */                                       if (list6.contains(IIooOO1o.I00iiI)) {
                                                }
/* 685 */                                       if (list6.contains(IIooOO1o.I00iiO)) {
                                                }
                                            }
                                        } else {
/* 562 */                                   z2 = true;
/* 563 */                                   l11I11lO.I0000O(3, "CXCP");
/* 570 */                                   I00iiI i00iiI = new I00iiI(10);
/* 573 */                                   i00iiI.I00iiI = this;
/* 575 */                                   VarHandle.storeStoreFence();
/* 578 */                                   iO01iI1oO.I00ilO0 = iO01o11o0lI02;
/* 583 */                                   iO01iI1oO.I00io1l = list6;
/* 585 */                                   iO01iI1oO.I00ioIO = iIooO1o11oo12;
/* 587 */                                   iO01iI1oO.I00iOIl = i13;
/* 589 */                                   iO01iI1oO.I00ilI0I1 = z4;
/* 591 */                                   iO01iI1oO.I00iiI = i2;
/* 593 */                                   iO01iI1oO.I00iiO = i3;
/* 596 */                                   iO01iI1oO.I00ll1 = 6;
/* 602 */                                   if (I0010o(j2, i00iiI, iO01iI1oO) != obj) {
/* 605 */                                       i7 = i13;
/* 606 */                                       iO01o11o0lI03 = iO01o11o0lI02;
/* 607 */                                       i8 = i3;
/* 608 */                                       iIooO1o11oo13 = iIooO1o11oo12;
/* 609 */                                       z5 = z4;
/* 610 */                                       i4 = 3;
/* 611 */                                       list2 = list6;
/* 612 */                                       i9 = i2;
/* 613 */                                       l11I11lO.I0000O(i4, "CXCP");
/* 556 */                                       i2 = i9;
/* 557 */                                       list6 = list2;
/* 558 */                                       iIooO1o11oo12 = iIooO1o11oo13;
/* 559 */                                       i3 = i8;
/* 622 */                                       l11I11lO.I0000O(i4, "CXCP");
/* 625 */                                       iO01o11o0lI0 = iO01o11o0lI03;
/* 626 */                                       z3 = z5;
/* 627 */                                       i5 = i3;
/* 628 */                                       i6 = i7;
/* 646 */                                       if (list6.contains(IIooOO1o.I00iiI)) {
                                                }
/* 685 */                                       if (list6.contains(IIooOO1o.I00iiO)) {
                                                }
                                            }
                                        }
                                    }
/* 604 */                           return obj;
                                }
/* 630 */                       iIooO1o11oo12 = iIooO1o11oo1;
/* 634 */                       i4 = 3;
/* 635 */                       z2 = true;
/* 636 */                       i5 = i3;
/* 637 */                       z3 = z;
/* 638 */                       i6 = i13;
/* 639 */                       iO01o11o0lI0 = this;
/* 646 */                       if (list6.contains(IIooOO1o.I00iiI)) {
                                }
/* 685 */                       if (list6.contains(IIooOO1o.I00iiO)) {
                                }
                                break;
                            case 1:
/* 185 */                       int i16 = iO01iI1oO.I00iiO;
/* 187 */                       int i17 = iO01iI1oO.I00iiI;
/* 189 */                       boolean z11 = iO01iI1oO.I00ilI0I1;
/* 191 */                       long j5 = iO01iI1oO.I00iio;
/* 193 */                       int i18 = iO01iI1oO.I00iOIl;
/* 195 */                       IIooO1o11oo1 iIooO1o11oo15 = iO01iI1oO.I00ioIO;
/* 197 */                       List list9 = iO01iI1oO.I00io1l;
/* 201 */                       IO01o11o0lI0 iO01o11o0lI07 = iO01iI1oO.I00ilO0;
/* 203 */                       lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 207 */                       i3 = i16;
/* 208 */                       i13 = i18;
/* 209 */                       i2 = i17;
/* 210 */                       list6 = list9;
/* 213 */                       z4 = z11;
/* 214 */                       iO01o11o0lI02 = iO01o11o0lI07;
/* 215 */                       iIooO1o11oo12 = iIooO1o11oo15;
/* 216 */                       j2 = j5;
/* 320 */                       l11I11lO.I0000O(3, "CXCP");
/* 331 */                       if (z4) {
                                }
/* 604 */                       return obj;
                            case 2:
/* 162 */                       i12 = iO01iI1oO.I00iiO;
/* 164 */                       i10 = iO01iI1oO.I00iiI;
/* 166 */                       z5 = iO01iI1oO.I00ilI0I1;
/* 168 */                       j3 = iO01iI1oO.I00iio;
/* 170 */                       i11 = iO01iI1oO.I00iOIl;
/* 172 */                       iIooO1o11oo14 = iO01iI1oO.I00ioIO;
/* 174 */                       list3 = iO01iI1oO.I00io1l;
/* 178 */                       iO01o11o0lI04 = iO01iI1oO.I00ilO0;
/* 180 */                       lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 384 */                       autoCloseable2 = (AutoCloseable) objI00o0iI0io1;
/* 387 */                       IIll1i iIll1i2 = (IIll1i) autoCloseable2;
/* 393 */                       if (i11 != 0) {
                                }
/* 394 */                       List list72 = list3;
/* 400 */                       if (i11 != 0) {
                                }
/* 401 */                       iO01iI1oO.I00ilO0 = iO01o11o0lI04;
/* 403 */                       IO01o11o0lI0 iO01o11o0lI062 = iO01o11o0lI04;
/* 409 */                       iO01iI1oO.I00io1l = list72;
/* 411 */                       iO01iI1oO.I00ioIO = iIooO1o11oo14;
/* 413 */                       iO01iI1oO.I00l0I0l0lO1 = autoCloseable2;
/* 415 */                       iO01iI1oO.I00iOIl = i11;
/* 417 */                       iO01iI1oO.I00ilI0I1 = z5;
/* 419 */                       iO01iI1oO.I00iiI = i10;
/* 421 */                       iO01iI1oO.I00iiO = i12;
/* 424 */                       iO01iI1oO.I00ll1 = 3;
/* 426 */                       objI000II = IIll1i.I000II(iIll1i2, z7, z8, j3);
/* 430 */                       if (objI000II != obj) {
                                }
/* 604 */                       return obj;
                            case 3:
/* 128 */                       i12 = iO01iI1oO.I00iiO;
/* 130 */                       i10 = iO01iI1oO.I00iiI;
/* 132 */                       z5 = iO01iI1oO.I00ilI0I1;
/* 134 */                       int i19 = iO01iI1oO.I00iOIl;
/* 136 */                       AutoCloseable autoCloseable4 = iO01iI1oO.I00l0I0l0lO1;
/* 138 */                       IIooO1o11oo1 iIooO1o11oo16 = iO01iI1oO.I00ioIO;
/* 140 */                       list4 = iO01iI1oO.I00io1l;
/* 144 */                       iO01o11o0lI05 = iO01iI1oO.I00ilO0;
                                try {
/* 146 */                           lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 151 */                           i11 = i19;
/* 152 */                           autoCloseable3 = autoCloseable4;
/* 153 */                           iIooO1o11oo12 = iIooO1o11oo16;
/* 444 */                           iO01iI1oO.I00ilO0 = iO01o11o0lI05;
/* 449 */                           iO01iI1oO.I00io1l = list4;
/* 451 */                           iO01iI1oO.I00ioIO = iIooO1o11oo12;
/* 453 */                           iO01iI1oO.I00l0I0l0lO1 = autoCloseable3;
/* 455 */                           iO01iI1oO.I00iOIl = i11;
/* 457 */                           iO01iI1oO.I00ilI0I1 = z5;
/* 459 */                           iO01iI1oO.I00iiI = i10;
/* 461 */                           iO01iI1oO.I00iiO = i12;
/* 464 */                           iO01iI1oO.I00ll1 = 4;
/* 466 */                           objI00o0iI0io1 = ((IiIOI1ol0o) objI00o0iI0io1).I00o0iI0io1(iO01iI1oO);
/* 470 */                           if (objI00o0iI0io1 == obj) {
                                    }
                                } catch (Throwable th4) {
/* 158 */                           th = th4;
/* 159 */                           autoCloseable = autoCloseable4;
/* 503 */                           throw th;
                                }
                                break;
                            case 4:
/* 101 */                       i12 = iO01iI1oO.I00iiO;
/* 103 */                       i10 = iO01iI1oO.I00iiI;
/* 105 */                       z5 = iO01iI1oO.I00ilI0I1;
/* 107 */                       i7 = iO01iI1oO.I00iOIl;
/* 109 */                       AutoCloseable autoCloseable5 = iO01iI1oO.I00l0I0l0lO1;
/* 111 */                       iIooO1o11oo12 = iO01iI1oO.I00ioIO;
/* 113 */                       list5 = iO01iI1oO.I00io1l;
/* 117 */                       iO01o11o0lI03 = iO01iI1oO.I00ilO0;
/* 119 */                       lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
                                r7 = autoCloseable5;
/* 477 */                       Oi10OoO0l oi10OoO0l2 = (Oi10OoO0l) objI00o0iI0io1;
/* 480 */                       iOOl00.I00000oIO(r7, null);
/* 488 */                       if (l11I11lO.I0000O(3, "CXCP")) {
                                }
/* 493 */                       i3 = i12;
/* 494 */                       i2 = i10;
/* 495 */                       list6 = list5;
/* 496 */                       i4 = 3;
/* 497 */                       z2 = true;
/* 622 */                       l11I11lO.I0000O(i4, "CXCP");
/* 625 */                       iO01o11o0lI0 = iO01o11o0lI03;
/* 626 */                       z3 = z5;
/* 627 */                       i5 = i3;
/* 628 */                       i6 = i7;
/* 646 */                       if (list6.contains(IIooOO1o.I00iiI)) {
                                }
/* 685 */                       if (list6.contains(IIooOO1o.I00iiO)) {
                                }
                                break;
                            case 5:
/* 78 */                        i8 = iO01iI1oO.I00iiO;
/* 80 */                        i9 = iO01iI1oO.I00iiI;
/* 82 */                        z5 = iO01iI1oO.I00ilI0I1;
/* 84 */                        i7 = iO01iI1oO.I00iOIl;
/* 86 */                        iIooO1o11oo13 = iO01iI1oO.I00ioIO;
/* 88 */                        list2 = iO01iI1oO.I00io1l;
/* 92 */                        iO01o11o0lI03 = iO01iI1oO.I00ilO0;
/* 94 */                        lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 97 */                        i4 = 3;
/* 98 */                        z2 = true;
/* 553 */                       l11I11lO.I0000O(i4, "CXCP");
/* 556 */                       i2 = i9;
/* 557 */                       list6 = list2;
/* 558 */                       iIooO1o11oo12 = iIooO1o11oo13;
/* 559 */                       i3 = i8;
/* 622 */                       l11I11lO.I0000O(i4, "CXCP");
/* 625 */                       iO01o11o0lI0 = iO01o11o0lI03;
/* 626 */                       z3 = z5;
/* 627 */                       i5 = i3;
/* 628 */                       i6 = i7;
/* 646 */                       if (list6.contains(IIooOO1o.I00iiI)) {
                                }
/* 685 */                       if (list6.contains(IIooOO1o.I00iiO)) {
                                }
                                break;
                            case 6:
/* 55 */                        i8 = iO01iI1oO.I00iiO;
/* 57 */                        i9 = iO01iI1oO.I00iiI;
/* 59 */                        z5 = iO01iI1oO.I00ilI0I1;
/* 61 */                        i7 = iO01iI1oO.I00iOIl;
/* 63 */                        iIooO1o11oo13 = iO01iI1oO.I00ioIO;
/* 65 */                        list2 = iO01iI1oO.I00io1l;
/* 69 */                        iO01o11o0lI03 = iO01iI1oO.I00ilO0;
/* 71 */                        lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 74 */                        i4 = 3;
/* 75 */                        z2 = true;
/* 613 */                       l11I11lO.I0000O(i4, "CXCP");
/* 556 */                       i2 = i9;
/* 557 */                       list6 = list2;
/* 558 */                       iIooO1o11oo12 = iIooO1o11oo13;
/* 559 */                       i3 = i8;
/* 622 */                       l11I11lO.I0000O(i4, "CXCP");
/* 625 */                       iO01o11o0lI0 = iO01o11o0lI03;
/* 626 */                       z3 = z5;
/* 627 */                       i5 = i3;
/* 628 */                       i6 = i7;
/* 646 */                       if (list6.contains(IIooOO1o.I00iiI)) {
                                }
/* 685 */                       if (list6.contains(IIooOO1o.I00iiO)) {
                                }
                                break;
                            default:
/* 51 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                        return null;
                        }
                    } catch (Throwable th5) {
/* 125 */               th = th5;
                        autoCloseable = r7;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00100o1O0lo(IIooO1o11oo1 iIooO1o11oo1, int i, int i2, List list, IOoilo iOoilo) throws Throwable {
                    IO01iioio iO01iioio;
                    Object objI0001Ioi1lo;
/* 3 */             if (iOoilo instanceof IO01iioio) {
/* 6 */                 iO01iioio = (IO01iioio) iOoilo;
/* 8 */                 int i3 = iO01iioio.I00ilO0;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO01iioio.I00ilO0 = i3 - Integer.MIN_VALUE;
                        } else {
/* 23 */                    iO01iioio = new IO01iioio(this, iOoilo);
                        }
                    }
/* 19 */            IO01iioio iO01iioio2 = iO01iioio;
/* 27 */            Object objI000iOII = iO01iioio2.I00iio;
/* 29 */            Object obj = Ii0111o.I00iOIl;
/* 31 */            int i4 = iO01iioio2.I00ilO0;
/* 39 */            if (i4 == 0) {
/* 74 */                lIoii1l01l0i.I00000oOI(objI000iOII);
/* 77 */                l11I11lO.I0000O(3, "CXCP");
/* 92 */                if (((Boolean) this.I000OiO.getValue()).booleanValue()) {
/* 94 */                    iO01iioio2.I00iOIl = iIooO1o11oo1;
/* 99 */                    iO01iioio2.I00iiI = list;
/* 101 */                   iO01iioio2.I00iiO = i;
/* 103 */                   iO01iioio2.I00ilO0 = 1;
/* 105 */                   objI000iOII = I000iOII(i2, iO01iioio2);
/* 109 */                   if (objI000iOII != obj) {
                            }
                        } else {
/* 170 */                   iO01iioio2.I00iOIl = null;
/* 172 */                   iO01iioio2.I00iiI = null;
/* 174 */                   iO01iioio2.I00ilO0 = 3;
/* 176 */                   objI0001Ioi1lo = I0001Ioi1lo(iIooO1o11oo1, i, list, iO01iioio2);
/* 180 */                   if (objI0001Ioi1lo != obj) {
/* 399 */                       return objI0001Ioi1lo;
                            }
                        }
/* 182 */               return obj;
                    }
/* 41 */            if (i4 != 1) {
/* 43 */                if (i4 == 2) {
/* 57 */                    lIoii1l01l0i.I00000oOI(objI000iOII);
/* 60 */                    return objI000iOII;
                        }
/* 45 */                if (i4 == 3) {
/* 47 */                    lIoii1l01l0i.I00000oOI(objI000iOII);
/* 50 */                    return objI000iOII;
                        }
/* 53 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                return null;
                    }
/* 61 */            i = iO01iioio2.I00iiO;
/* 63 */            list = iO01iioio2.I00iiI;
/* 68 */            iIooO1o11oo1 = iO01iioio2.I00iOIl;
/* 70 */            lIoii1l01l0i.I00000oOI(objI000iOII);
/* 118 */           if (((Boolean) objI000iOII).booleanValue()) {
/* 126 */               if (!this.I000II.I0000O()) {
/* 132 */                   int i5 = this.I0000O.I00000oIO.I00000oIO;
/* 134 */                   l11I11lO.I0000O(3, "CXCP");
/* 137 */                   boolean z = i5 <= 0;
/* 140 */                   boolean z2 = z;
/* 144 */                   iO01iioio2.I00iOIl = null;
/* 146 */                   iO01iioio2.I00iiI = null;
/* 148 */                   iO01iioio2.I00ilO0 = 2;
/* 159 */                   Object objI00100l0 = I00100l0(iIooO1o11oo1, i, 5000000000L, list, z2, iO01iioio2);
/* 163 */                   if (objI00100l0 != obj) {
/* 166 */                       return objI00100l0;
                            }
                        }
/* 182 */               return obj;
                    }
/* 170 */           iO01iioio2.I00iOIl = null;
/* 172 */           iO01iioio2.I00iiI = null;
/* 174 */           iO01iioio2.I00ilO0 = 3;
/* 176 */           objI0001Ioi1lo = I0001Ioi1lo(iIooO1o11oo1, i, list, iO01iioio2);
/* 180 */           if (objI0001Ioi1lo != obj) {
/* 182 */               return obj;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r7v0, types: [IO01o11o0lI0] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.AutoCloseable] */
                /* JADX WARN: Type inference failed for: r7v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0010I0i(long j, IOoilo iOoilo) throws Throwable {
                    IO01lOI iO01lOI;
/* 3 */             if (iOoilo instanceof IO01lOI) {
/* 6 */                 iO01lOI = (IO01lOI) iOoilo;
/* 8 */                 int i = iO01lOI.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO01lOI.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO01lOI = new IO01lOI(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = iO01lOI.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iO01lOI.I00ilI0I1;
                    try {
/* 35 */                if (i2 == 0) {
/* 67 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 72 */                    IIll0oO iIll0oOI00000oIO = this.I000OOo1O.I00000oIO();
/* 76 */                    iO01lOI.I00iOIl = j;
/* 78 */                    iO01lOI.I00ilI0I1 = 1;
/* 80 */                    objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(iO01lOI);
/* 84 */                    if (objI0000Il00O != ii0111o) {
                            }
                        }
/* 37 */                if (i2 != 1) {
/* 39 */                    if (i2 != 2) {
/* 41 */                        if (i2 == 3) {
/* 43 */                            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 46 */                            return objI0000Il00O;
                                }
/* 49 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                        return null;
                            }
/* 53 */                    AutoCloseable autoCloseable = iO01lOI.I00iiI;
/* 55 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
                            this = autoCloseable;
/* 106 */                   IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) objI0000Il00O;
/* 108 */                   iOOl00.I00000oIO(this, null);
/* 111 */                   iO01lOI.I00iiI = null;
/* 113 */                   iO01lOI.I00ilI0I1 = 3;
/* 115 */                   Object objI00o0iI0io1 = iiIOI1ol0o.I00o0iI0io1(iO01lOI);
                            return objI00o0iI0io1 != ii0111o ? ii0111o : objI00o0iI0io1;
                        }
/* 61 */                j = iO01lOI.I00iOIl;
/* 63 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 88 */                AutoCloseable autoCloseable2 = (AutoCloseable) objI0000Il00O;
/* 93 */                iO01lOI.I00iiI = autoCloseable2;
/* 95 */                iO01lOI.I00ilI0I1 = 2;
/* 99 */                objI0000Il00O = IIll1i.I001i1lo1io((IIll1i) autoCloseable2, j, 29);
                        this = autoCloseable2;
/* 103 */               if (objI0000Il00O != ii0111o) {
/* 106 */                   IiIOI1ol0o iiIOI1ol0o2 = (IiIOI1ol0o) objI0000Il00O;
/* 108 */                   iOOl00.I00000oIO(this, null);
/* 111 */                   iO01lOI.I00iiI = null;
/* 113 */                   iO01lOI.I00ilI0I1 = 3;
/* 115 */                   Object objI00o0iI0io12 = iiIOI1ol0o2.I00o0iI0io1(iO01lOI);
                            if (objI00o0iI0io12 != ii0111o) {
                            }
                        }
                    } finally {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0010o(long j, Function1 function1, IOoilo iOoilo) throws Throwable {
                    IO01liil0IO iO01liil0IO;
                    Oi10ili0 oi10ili0;
/* 1 */             OolOi0i oolOi0i = this.I0000oI00;
/* 3 */             IOi0Olo0Ol iOi0Olo0Ol = this.I0001Ioi1lo;
/* 7 */             if (iOoilo instanceof IO01liil0IO) {
/* 10 */                iO01liil0IO = (IO01liil0IO) iOoilo;
/* 12 */                int i = iO01liil0IO.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    iO01liil0IO.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iO01liil0IO = new IO01liil0IO(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = iO01liil0IO.I00iiI;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = iO01liil0IO.I00iio;
/* 35 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 37 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                Oi10ili0 oi10ili02 = new Oi10ili0();
/* 61 */                oi10ili02.I00iOIl = j;
/* 63 */                oi10ili02.I00iiI = function1;
/* 70 */                oi10ili02.I00iiO = new IOi10loi();
/* 72 */                VarHandle.storeStoreFence();
/* 77 */                iOi0Olo0Ol.I00000oIO(oi10ili02, oolOi0i.I0000O);
/* 90 */                iOi1II01i0.I0000O(oolOi0i.I0000oI00, null, null, new I00oI0i(oi10ili02, this, iOoil1iiIilo, 18), 3);
/* 101 */               I0II0OiI i0II0OiI = new I0II0OiI(oi10ili02, iOoil1iiIilo, 12);
/* 104 */               iO01liil0IO.I00iOIl = oi10ili02;
/* 106 */               iO01liil0IO.I00iio = 1;
/* 108 */               Object objI0000Il00O = lOlo0o.I0000Il00O(j / 1000000, i0II0OiI, iO01liil0IO);
/* 112 */               if (objI0000Il00O == ii0111o) {
/* 114 */                   return ii0111o;
                        }
/* 116 */               obj = objI0000Il00O;
/* 117 */               oi10ili0 = oi10ili02;
                    } else {
/* 39 */                if (i2 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 41 */                oi10ili0 = iO01liil0IO.I00iOIl;
/* 43 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 121 */           if (((IllIi0lI) obj) == null) {
/* 123 */               iOi0Olo0Ol.I00000oOI(oi10ili0);
                    }
/* 408 */           return obj;
                }
            }
