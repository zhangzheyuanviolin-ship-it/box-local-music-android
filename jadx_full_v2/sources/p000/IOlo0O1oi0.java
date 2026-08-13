            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IOlo0O1oi0 extends IIIII1OI1 {
                public final IIII0i I00oII;

                public IOlo0O1oi0(int i, IIII0i iIII0i, Function1 function1) {
/* 1 */             super(i, function1);
/* 4 */             this.I00oII = iIII0i;
/* 9 */             if (iIII0i == IIII0i.I00iOIl) {
/* 43 */                OIiilo1Ool0o.I0010o(OOoOl0i.I00000oIO.I00000oOI(IIIII1OI1.class).I000oI1ioi(), "This implementation does not support suspension for senders, use ", " instead");
/* 215 */               throw null;
                    }
/* 12 */            if (i >= 1) {
/* 14 */                return;
                    }
/* 23 */            I000II.I0010I0i(IIlIOloOOO.I00100l0("Buffered channel capacity must be at least 1, but ", i, " was specified"));
/* 26 */            throw null;
                }

                @Override
                public final Object I00000oOI(IOoil1iiIilo iOoil1iiIilo, Object obj) throws Throwable {
                    IOiIIo1l iOiIIo1lI00000oOI;
/* 8 */             if (!(I00IoiI(obj, true) instanceof IO10i1)) {
/* 34 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 10 */            Function1 function1 = this.I00iiI;
/* 12 */            if (function1 == null || (iOiIIo1lI00000oOI = l1l0ii1lOoI1.I00000oOI(function1, obj, null)) == null) {
/* 33 */                throw I00111O();
                    }
/* 25 */            ilIilolOlIoO.I00000oIO(iOiIIo1lI00000oOI, I00111O());
/* 28 */            throw iOiIIo1lI00000oOI;
                }

                @Override
                public final Object I000lI(Object obj) {
/* 2 */             return I00IoiI(obj, false);
                }

                @Override
                public final boolean I001lIiIIo1O() {
                    return this.I00oII == IIII0i.I00iiI;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
                
                    r1.I00000oIO = r0;
                    java.lang.invoke.VarHandle.storeStoreFence();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
                
                    return r1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00IoiI(Object obj, boolean z) {
                    Throwable thI00111O;
                    IO10i1 iO10i1;
                    Function1 function1;
                    IOiIIo1l iOiIIo1lI00000oOI;
/* 3 */             IIII0i iIII0i = this.I00oII;
/* 5 */             IIII0i iIII0i2 = IIII0i.I00iiO;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             OoooliO1IoI1 ooooliO1IoI1 = null;
/* 10 */            if (iIII0i == iIII0i2) {
/* 12 */                Object objI000lI = super.I000lI(obj);
/* 18 */                if (!(objI000lI instanceof IO10l0l0) || (objI000lI instanceof IO10i1)) {
/* 42 */                    return objI000lI;
                        }
/* 25 */                if (z && (function1 = this.I00iiI) != null && (iOiIIo1lI00000oOI = l1l0ii1lOoI1.I00000oOI(function1, obj, null)) != null) {
/* 41 */                    throw iOiIIo1lI00000oOI;
                        }
                    } else {
/* 43 */                Object obj2 = obj;
/* 45 */                Object obj3 = IIIIIoiliIiO.I0000O;
/* 53 */                IO10oOO iO10oOO = (IO10oOO) IIIII1OI1.I00ioIO.get(this);
                        while (true) {
/* 57 */                    long andIncrement = IIIII1OI1.I00iio.getAndIncrement(this);
/* 66 */                    long j = 1152921504606846975L & andIncrement;
/* 68 */                    boolean zI001i1lo1io = I001i1lo1io(andIncrement, false);
/* 72 */                    int i = IIIIIoiliIiO.I00000oOI;
                            long j2 = i;
/* 75 */                    long j3 = j / j2;
/* 77 */                    OoooliO1IoI1 ooooliO1IoI12 = ooooliO1IoI1;
/* 82 */                    int i2 = (int) (j % j2);
/* 87 */                    if (iO10oOO.I00iio != j3) {
/* 89 */                        IO10oOO iO10oOOI000l1 = I000l1(j3, iO10oOO);
/* 93 */                        if (iO10oOOI000l1 != null) {
/* 114 */                           iO10oOO = iO10oOOI000l1;
                                } else {
/* 95 */                            if (zI001i1lo1io) {
/* 97 */                                thI00111O = I00111O();
/* 103 */                               iO10i1 = new IO10i1();
                                        break;
                                    }
/* 112 */                           ooooliO1IoI1 = ooooliO1IoI12;
                                }
                            }
/* 117 */                   int iI00Io1o110i = I00Io1o110i(iO10oOO, i2, obj2, j, obj3, zI001i1lo1io);
/* 123 */                   if (iI00Io1o110i == 0) {
/* 214 */                       iO10oOO.I00000oIO();
/* 551 */                       return ooiIlOl1iI;
                            }
/* 126 */                   if (iI00Io1o110i == 1) {
                                break;
                            }
/* 129 */                   if (iI00Io1o110i != 2) {
/* 132 */                       if (iI00Io1o110i == 3) {
/* 170 */                           I000II.I001IO000("unexpected");
/* 173 */                           return ooooliO1IoI12;
                                }
/* 135 */                       if (iI00Io1o110i != 4) {
/* 138 */                           if (iI00Io1o110i == 5) {
/* 141 */                               iO10oOO.I00000oIO();
                                    }
/* 144 */                           obj2 = obj;
/* 112 */                           ooooliO1IoI1 = ooooliO1IoI12;
                                } else {
/* 153 */                           if (j < I0010o()) {
/* 155 */                               iO10oOO.I00000oIO();
                                    }
/* 158 */                           thI00111O = I00111O();
/* 164 */                           iO10i1 = new IO10i1();
                                }
                            } else if (zI001i1lo1io) {
/* 176 */                       iO10oOO.I000OOo1O();
/* 179 */                       thI00111O = I00111O();
/* 185 */                       iO10i1 = new IO10i1();
                            } else {
/* 197 */                       OoooliO1IoI1 ooooliO1IoI13 = obj3 instanceof OoooliO1IoI1 ? (OoooliO1IoI1) obj3 : ooooliO1IoI12;
/* 198 */                       if (ooooliO1IoI13 != null) {
/* 202 */                           ooooliO1IoI13.I00000oIO(iO10oOO, i2 + i);
                                }
/* 210 */                       I000O01llI0((iO10oOO.I00iio * j2) + i2);
                            }
                        }
                    }
/* 213 */           return ooiIlOl1iI;
                }
            }
