            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IIII0iI10 implements OoooliO1IoI1 {
                public Object I00iOIl;
                public IIoOoIol0Io0 I00iiI;
                public IIIII1OI1 I00iiO;

                @Override
                public final void I00000oIO(Oii1O0I oii1O0I, int i) {
/* 1 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00iiI;
/* 3 */             if (iIoOoIol0Io0 != null) {
/* 5 */                 iIoOoIol0Io0.I00000oIO(oii1O0I, i);
                    }
                }

                public final Object I00000oOI(IOoilo iOoilo) throws Throwable {
                    Boolean bool;
                    IO10oOO iO10oOOI000OiO;
/* 1 */             IIIII1OI1 iiiii1oi1 = this.I00iiO;
/* 3 */             Object obj = this.I00iOIl;
/* 7 */             boolean z = true;
/* 8 */             if (obj == IIIIIoiliIiO.I00100l0 || obj == IIIIIoiliIiO.I000l1) {
/* 22 */                IO10oOO iO10oOO = (IO10oOO) IIIII1OI1.I00l0I0l0lO1.get(iiiii1oi1);
                        while (true) {
/* 28 */                    if (iiiii1oi1.I001iOo1i0O()) {
/* 32 */                        this.I00iOIl = IIIIIoiliIiO.I000l1;
/* 34 */                        Throwable thI00100l0 = iiiii1oi1.I00100l0();
/* 38 */                        if (thI00100l0 != null) {
/* 43 */                            int i = OlIl00i.I00000oIO;
/* 45 */                            throw thI00100l0;
                                }
/* 40 */                        z = false;
                            } else {
/* 48 */                        long andIncrement = IIIII1OI1.I00ilI0I1.getAndIncrement(iiiii1oi1);
/* 52 */                        long j = IIIIIoiliIiO.I00000oOI;
/* 55 */                        long j2 = andIncrement / j;
/* 59 */                        int i2 = (int) (andIncrement % j);
/* 64 */                        if (iO10oOO.I00iio != j2) {
/* 66 */                            IO10oOO iO10oOOI000OiO2 = iiiii1oi1.I000OiO(j2, iO10oOO);
/* 70 */                            if (iO10oOOI000OiO2 == null) {
                                        continue;
                                    } else {
/* 73 */                                iO10oOO = iO10oOOI000OiO2;
                                    }
                                }
/* 75 */                        Object objI00Io1lO = iiiii1oi1.I00Io1lO(iO10oOO, i2, andIncrement, null);
/* 79 */                        I0OooiI1I i0OooiI1I = IIIIIoiliIiO.I000lI;
/* 81 */                        I0illI1iI i0illI1iI = null;
/* 82 */                        if (objI00Io1lO == i0OooiI1I) {
/* 338 */                           I000II.I001IO000("unreachable");
/* 81 */                            return null;
                                }
/* 84 */                        I0OooiI1I i0OooiI1I2 = IIIIIoiliIiO.I000oI1ioi;
/* 86 */                        if (objI00Io1lO == i0OooiI1I2) {
/* 94 */                            if (andIncrement < iiiii1oi1.I001IIilI0O()) {
/* 96 */                                iO10oOO.I00000oIO();
                                    }
                                } else {
/* 102 */                           if (objI00Io1lO == IIIIIoiliIiO.I000o00OoI0I) {
/* 108 */                               IIoOoIol0Io0 iIoOoIol0Io0I00000oOI = iOl0iOoIl.I00000oOI(l00iIoI.I0000Il00O(iOoilo));
                                        try {
/* 112 */                                   this.I00iiI = iIoOoIol0Io0I00000oOI;
/* 114 */                                   IIII0iI10 iIII0iI10 = this;
/* 115 */                                   Object objI00Io1lO2 = iiiii1oi1.I00Io1lO(iO10oOO, i2, andIncrement, iIII0iI10);
/* 119 */                                   Function1 function1 = iiiii1oi1.I00iiI;
/* 121 */                                   if (objI00Io1lO2 == i0OooiI1I) {
/* 123 */                                       iIII0iI10.I00000oIO(iO10oOO, i2);
                                            } else {
/* 132 */                                       int i3 = 5;
/* 133 */                                       if (objI00Io1lO2 == i0OooiI1I2) {
/* 141 */                                           if (andIncrement < iiiii1oi1.I001IIilI0O()) {
/* 143 */                                               iO10oOO.I00000oIO();
                                                    }
/* 152 */                                           IO10oOO iO10oOO2 = (IO10oOO) IIIII1OI1.I00l0I0l0lO1.get(iiiii1oi1);
                                                    while (true) {
/* 158 */                                               if (iiiii1oi1.I001iOo1i0O()) {
/* 160 */                                                   IIoOoIol0Io0 iIoOoIol0Io0 = iIII0iI10.I00iiI;
/* 162 */                                                   iIII0iI10.I00iiI = null;
/* 166 */                                                   iIII0iI10.I00iOIl = IIIIIoiliIiO.I000l1;
/* 168 */                                                   Throwable thI00100l02 = iiiii1oi1.I00100l0();
/* 172 */                                                   if (thI00100l02 == null) {
/* 176 */                                                       iIoOoIol0Io0.resumeWith(Boolean.FALSE);
                                                            } else {
/* 185 */                                                       iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(thI00100l02));
                                                            }
                                                        } else {
/* 192 */                                                   long andIncrement2 = IIIII1OI1.I00ilI0I1.getAndIncrement(iiiii1oi1);
/* 196 */                                                   long j3 = IIIIIoiliIiO.I00000oOI;
/* 199 */                                                   long j4 = andIncrement2 / j3;
/* 203 */                                                   int i4 = (int) (andIncrement2 % j3);
/* 208 */                                                   if (iO10oOO2.I00iio != j4) {
/* 210 */                                                       iO10oOOI000OiO = iiiii1oi1.I000OiO(j4, iO10oOO2);
/* 214 */                                                       if (iO10oOOI000OiO == null) {
                                                                }
                                                            } else {
/* 217 */                                                       iO10oOOI000OiO = iO10oOO2;
                                                            }
/* 218 */                                                   Object objI00Io1lO3 = iiiii1oi1.I00Io1lO(iO10oOOI000OiO, i4, andIncrement2, iIII0iI10);
/* 223 */                                                   IIIII1OI1 iiiii1oi12 = iiiii1oi1;
/* 224 */                                                   IIII0iI10 iIII0iI102 = iIII0iI10;
/* 228 */                                                   if (objI00Io1lO3 == IIIIIoiliIiO.I000lI) {
/* 230 */                                                       iIII0iI102.I00000oIO(iO10oOOI000OiO, i4);
                                                                break;
                                                            }
/* 236 */                                                   if (objI00Io1lO3 == IIIIIoiliIiO.I000oI1ioi) {
/* 244 */                                                       if (andIncrement2 < iiiii1oi12.I001IIilI0O()) {
/* 246 */                                                           iO10oOOI000OiO.I00000oIO();
                                                                }
/* 249 */                                                       iIII0iI10 = iIII0iI102;
/* 250 */                                                       iO10oOO2 = iO10oOOI000OiO;
/* 251 */                                                       iiiii1oi1 = iiiii1oi12;
                                                            } else {
/* 255 */                                                       if (objI00Io1lO3 == IIIIIoiliIiO.I000o00OoI0I) {
/* 291 */                                                           throw new IllegalStateException("unexpected");
                                                                }
/* 257 */                                                       iO10oOOI000OiO.I00000oIO();
/* 260 */                                                       iIII0iI102.I00iOIl = objI00Io1lO3;
/* 262 */                                                       iIII0iI102.I00iiI = null;
/* 264 */                                                       bool = Boolean.TRUE;
/* 266 */                                                       if (function1 != null) {
/* 270 */                                                           i0illI1iI = new I0illI1iI(i3);
/* 273 */                                                           i0illI1iI.I00iiI = function1;
/* 275 */                                                           i0illI1iI.I00iiO = objI00Io1lO3;
                                                                }
                                                            }
                                                        }
                                                    }
/* 280 */                                           iIoOoIol0Io0I00000oOI.I000OiO(bool, i0illI1iI);
                                                } else {
/* 293 */                                           iO10oOO.I00000oIO();
/* 296 */                                           iIII0iI10.I00iOIl = objI00Io1lO2;
/* 298 */                                           iIII0iI10.I00iiI = null;
/* 300 */                                           bool = Boolean.TRUE;
/* 302 */                                           if (function1 != null) {
/* 306 */                                               i0illI1iI = new I0illI1iI(i3);
/* 309 */                                               i0illI1iI.I00iiI = function1;
/* 311 */                                               i0illI1iI.I00iiO = objI00Io1lO2;
/* 277 */                                               VarHandle.storeStoreFence();
                                                    }
/* 280 */                                           iIoOoIol0Io0I00000oOI.I000OiO(bool, i0illI1iI);
                                                }
                                            }
/* 314 */                                   Object objI0010I0i = iIoOoIol0Io0I00000oOI.I0010I0i();
/* 318 */                                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 320 */                                   return objI0010I0i;
                                        } catch (Throwable th) {
/* 321 */                                   iIoOoIol0Io0I00000oOI.I001lIiIIo1O();
/* 324 */                                   throw th;
                                        }
                                    }
/* 326 */                           iO10oOO.I00000oIO();
/* 329 */                           this.I00iOIl = objI00Io1lO;
                                }
                            }
                        }
                    }
/* 331 */           return Boolean.valueOf(z);
                }

                public final Object I0000Il00O() throws Throwable {
/* 1 */             Object obj = this.I00iOIl;
/* 3 */             I0OooiI1I i0OooiI1I = IIIIIoiliIiO.I00100l0;
/* 5 */             if (obj == i0OooiI1I) {
/* 25 */                I000II.I001IO000("`hasNext()` has not been invoked");
/* 28 */                return null;
                    }
/* 7 */             this.I00iOIl = i0OooiI1I;
/* 11 */            if (obj != IIIIIoiliIiO.I000l1) {
/* 13 */                return obj;
                    }
/* 16 */            Throwable thI0010I0i = this.I00iiO.I0010I0i();
/* 20 */            int i = OlIl00i.I00000oIO;
/* 22 */            throw thI0010I0i;
                }
            }
