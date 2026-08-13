            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import sun.misc.Unsafe;
            
            public abstract class iOi1II01i0 {
                public static final IiIOIO1I I00000oIO(Ii0110 ii0110, Ii00l101O ii00l101O, Ii01I10 ii01I10, IlliIl1l11O illiIl1l11O) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    IiIOIO1I iiIOIO1I;
/* 1 */             Ii00l101O ii00l101OI00000oOI = iioloOl.I00000oOI(ii0110, ii00l101O);
/* 5 */             ii01I10.getClass();
/* 10 */            if (ii01I10 == Ii01I10.I00iiI) {
/* 15 */                O0ioiIilI o0ioiIilI = new O0ioiIilI(ii00l101OI00000oOI, false);
/* 22 */                o0ioiIilI.I00ilI0I1 = l00iIoI.I00000oIO(o0ioiIilI, o0ioiIilI, illiIl1l11O);
/* 24 */                VarHandle.storeStoreFence();
                        iiIOIO1I = o0ioiIilI;
                    } else {
/* 31 */                iiIOIO1I = new IiIOIO1I(ii00l101OI00000oOI, true);
                    }
/* 34 */            iiIOIO1I.I00iiO(ii01I10, iiIOIO1I, illiIl1l11O);
/* 483 */           return iiIOIO1I;
                }

                public static IiIOIO1I I00000oOI(Ii0110 ii0110, Ii00l101O ii00l101O, IlliIl1l11O illiIl1l11O, int i) {
/* 1 */             Ii01I10 ii01I10 = Ii01I10.I00iio;
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 ii00l101O = Il00o11.I00iOIl;
                    }
/* 11 */            if ((i & 2) != 0) {
/* 13 */                ii01I10 = Ii01I10.I00iOIl;
                    }
/* 15 */            return I00000oIO(ii0110, ii00l101O, ii01I10, illiIl1l11O);
                }

                public static final OlIl0i I0000Il00O(Ii0110 ii0110, Ii00l101O ii00l101O, Ii01I10 ii01I10, IlliIl1l11O illiIl1l11O) {
                    OlIl0i olIl0i;
/* 1 */             Ii00l101O ii00l101OI00000oOI = iioloOl.I00000oOI(ii0110, ii00l101O);
/* 5 */             ii01I10.getClass();
/* 10 */            if (ii01I10 == Ii01I10.I00iiI) {
/* 15 */                O0o1Iii111 o0o1Iii111 = new O0o1Iii111(ii00l101OI00000oOI, false);
/* 22 */                o0o1Iii111.I00ilI0I1 = l00iIoI.I00000oIO(o0o1Iii111, o0o1Iii111, illiIl1l11O);
/* 24 */                VarHandle.storeStoreFence();
                        olIl0i = o0o1Iii111;
                    } else {
/* 31 */                olIl0i = new OlIl0i(ii00l101OI00000oOI, true);
                    }
/* 34 */            olIl0i.I00iiO(ii01I10, olIl0i, illiIl1l11O);
/* 483 */           return olIl0i;
                }

                public static OlIl0i I0000O(Ii0110 ii0110, Ii00l101O ii00l101O, Ii01I10 ii01I10, IlliIl1l11O illiIl1l11O, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 ii00l101O = Il00o11.I00iOIl;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                ii01I10 = Ii01I10.I00iOIl;
                    }
/* 13 */            return I0000Il00O(ii0110, ii00l101O, ii01I10, illiIl1l11O);
                }

                public static final Object I0000oI00(Ii00l101O ii00l101O, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
                    Object objI00000oIO;
/* 1 */             Ii00l101O context = iOoil1iiIilo.getContext();
/* 32 */            Ii00l101O ii00l101OI00ioIO = !((Boolean) ii00l101O.I00IoiI(new IOioOOi0I(27), Boolean.FALSE)).booleanValue() ? context.I00ioIO(ii00l101O) : iioloOl.I00000oIO(context, ii00l101O, false);
/* 36 */            l01oO1iOo.I0000O(ii00l101OI00ioIO);
/* 40 */            if (ii00l101OI00ioIO == context) {
/* 44 */                OiOOI1I1I101 oiOOI1I1I101 = new OiOOI1I1I101(iOoil1iiIilo, ii00l101OI00ioIO);
/* 47 */                objI00000oIO = li0011.I00000oIO(oiOOI1I1I101, true, oiOOI1I1I101, illiIl1l11O);
                    } else {
/* 53 */                o0iOli o0ioli = o0iOli.I00iiO;
/* 68 */                if (O0000Ioio00.I0000O(ii00l101OI00ioIO.I00lli11(o0ioli), context.I00lli11(o0ioli))) {
/* 72 */                    IIoiil1l0I iIoiil1l0I = IIoiil1l0I.I00iio;
/* 86 */                    OoiI00olo ooiI00olo = new OoiI00olo(iOoil1iiIilo, ii00l101OI00ioIO.I00lli11(iIoiil1l0I) == null ? ii00l101OI00ioIO.I00ioIO(iIoiil1l0I) : ii00l101OI00ioIO);
/* 94 */                    ooiI00olo.I00ilO0 = new ThreadLocal();
/* 106 */                   if (!(iOoil1iiIilo.getContext().I00lli11(o0ioli) instanceof Ii00lIOoi)) {
/* 108 */                       Object objI00000oOI = Oo0ooOi10I.I00000oOI(ii00l101OI00ioIO, null);
/* 112 */                       Oo0ooOi10I.I00000oIO(ii00l101OI00ioIO, objI00000oOI);
/* 115 */                       ooiI00olo.I00io1l(ii00l101OI00ioIO, objI00000oOI);
                            }
/* 118 */                   VarHandle.storeStoreFence();
/* 121 */                   Ii00l101O ii00l101O2 = ooiI00olo.I00iio;
/* 123 */                   Object objI00000oOI2 = Oo0ooOi10I.I00000oOI(ii00l101O2, null);
                            try {
/* 127 */                       Object objI00000oIO2 = li0011.I00000oIO(ooiI00olo, true, ooiI00olo, illiIl1l11O);
/* 131 */                       Oo0ooOi10I.I00000oIO(ii00l101O2, objI00000oOI2);
/* 134 */                       objI00000oIO = objI00000oIO2;
                            } catch (Throwable th) {
/* 138 */                       Oo0ooOi10I.I00000oIO(ii00l101O2, objI00000oOI2);
/* 141 */                       throw th;
                            }
                        } else {
/* 144 */                   IiiIIO0O0o iiiIIO0O0o = new IiiIIO0O0o(iOoil1iiIilo, ii00l101OI00ioIO);
                            try {
/* 157 */                       IiiIIO0IO.I00000oIO(l00iIoI.I0000Il00O(l00iIoI.I00000oIO(iiiIIO0O0o, iiiIIO0O0o, illiIl1l11O)), OoiIlOl1iI.I00000oIO);
                                while (true) {
/* 160 */                           Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 162 */                           long j = IiiIIO0O0o.I00ilO0;
/* 164 */                           int intVolatile = unsafe.getIntVolatile(iiiIIO0O0o, j);
/* 168 */                           if (intVolatile != 0) {
/* 171 */                               if (intVolatile != 2) {
/* 193 */                                   I000II.I001IO000("Already suspended");
/* 67 */                                    return null;
                                        }
/* 177 */                               objI00000oIO = O011OiI01.I00000oIO(iiiIIO0O0o.I00Io1o110i());
/* 183 */                               if (objI00000oIO instanceof IOiIII1I) {
/* 190 */                                   throw ((IOiIII1I) objI00000oIO).I00000oIO;
                                        }
                                    } else if (unsafe.compareAndSwapInt(iiiIIO0O0o, j, 0, 1)) {
/* 205 */                               objI00000oIO = Ii0111o.I00iOIl;
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
/* 212 */                       iOl0ii00.I00000oIO(iiiIIO0O0o, th2);
/* 215 */                       throw null;
                            }
                        }
                    }
/* 207 */           Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 209 */           return objI00000oIO;
                }
            }
