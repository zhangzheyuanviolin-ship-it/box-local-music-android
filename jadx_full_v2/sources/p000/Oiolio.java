            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public class Oiolio extends I01OooO0o0o implements OI10Ol0, IlOil1ii, Illo1I00lOl {
                public final int I00ilI0I1;
                public final int I00ilO0;
                public final IIII0i I00io1l;
                public Object[] I00ioIO;
                public long I00l0I0l0lO1;
                public long I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;

                public Oiolio(int i, int i2, IIII0i iIII0i) {
/* 4 */             this.I00ilI0I1 = i;
/* 6 */             this.I00ilO0 = i2;
/* 8 */             this.I00io1l = iIII0i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0077, B:34:0x007f, B:38:0x0092, B:41:0x0099, B:42:0x009d, B:43:0x009e, B:22:0x0049), top: B:50:0x0020 }] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0090 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r5v1, types: [I01OooO0o0o] */
                /* JADX WARN: Type inference failed for: r5v12 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v4, types: [Oiolio] */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /* JADX WARN: Type inference failed for: r9v0, types: [IlOil1iooOO0] */
                /* JADX WARN: Type inference failed for: r9v1 */
                /* JADX WARN: Type inference failed for: r9v15 */
                /* JADX WARN: Type inference failed for: r9v16 */
                /* JADX WARN: Type inference failed for: r9v17 */
                /* JADX WARN: Type inference failed for: r9v2, types: [I01i000i0iI] */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX WARN: Type inference failed for: r9v4 */
                /* JADX WARN: Type inference failed for: r9v5, types: [OiolliO0] */
                /* JADX WARN: Type inference failed for: r9v8, types: [OiolliO0] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ac -> B:16:0x0034). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I000lI(Oiolio oiolio, IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OioliOloIl oioliOloIl;
                    ?? r5;
                    IlOil1iooOO0 ilOil1iooOO02;
                    O010OIi o010OIi;
                    O010OIi o010OIi2;
                    IlOil1iooOO0 ilOil1iooOO03;
                    Object objI001IIilI0O;
                    OiolliO0 oiolliO0;
/* 3 */             if (iOoil1iiIilo instanceof OioliOloIl) {
/* 6 */                 oioliOloIl = (OioliOloIl) iOoil1iiIilo;
/* 8 */                 int i = oioliOloIl.I00io1l;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oioliOloIl.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oioliOloIl = new OioliOloIl(oiolio, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = oioliOloIl.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oioliOloIl.I00io1l;
                    try {
                    } catch (Throwable th) {
/* 57 */                th = th;
                    }
                    try {
/* 33 */                if (i2 == 0) {
/* 93 */                    lIoii1l01l0i.I00000oOI(obj);
/* 103 */                   ilOil1iooOO02 = ilOil1iooOO0;
/* 100 */                   ilOil1iooOO0 = (OiolliO0) oiolio.I0000O();
                        } else {
/* 36 */                    if (i2 != 1) {
/* 38 */                        if (i2 == 2) {
/* 66 */                            o010OIi2 = oioliOloIl.I00iio;
/* 68 */                            OiolliO0 oiolliO02 = oioliOloIl.I00iiO;
/* 70 */                            ilOil1iooOO03 = oioliOloIl.I00iiI;
/* 72 */                            Oiolio oiolio2 = oioliOloIl.I00iOIl;
/* 74 */                            lIoii1l01l0i.I00000oOI(obj);
                                    r5 = oiolio2;
                                    ilOil1iooOO0 = oiolliO02;
/* 142 */                           do {
/* 120 */                               objI001IIilI0O = r5.I001IIilI0O(ilOil1iooOO0);
/* 126 */                               if (objI001IIilI0O == Oiolio0iO1.I00000oIO) {
                                        }
/* 142 */                           } while (r5.I000iOII(ilOil1iooOO0, oioliOloIl) != ii0111o);
                                }
/* 40 */                        if (i2 != 3) {
/* 62 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 65 */                            return;
                                }
/* 42 */                        o010OIi2 = oioliOloIl.I00iio;
/* 44 */                        OiolliO0 oiolliO03 = oioliOloIl.I00iiO;
/* 46 */                        ilOil1iooOO03 = oioliOloIl.I00iiI;
/* 48 */                        Oiolio oiolio3 = oioliOloIl.I00iOIl;
/* 50 */                        lIoii1l01l0i.I00000oOI(obj);
                                Oiolio oiolio4 = oiolio3;
                                OiolliO0 oiolliO04 = oiolliO03;
/* 53 */                        ilOil1iooOO02 = ilOil1iooOO03;
/* 54 */                        o010OIi = o010OIi2;
/* 55 */                        oiolio = oiolio4;
                                oiolliO0 = oiolliO04;
/* 117 */                       r5 = oiolio;
/* 118 */                       o010OIi2 = o010OIi;
/* 119 */                       ilOil1iooOO03 = ilOil1iooOO02;
                                ilOil1iooOO0 = oiolliO0;
/* 142 */                       do {
/* 120 */                           objI001IIilI0O = r5.I001IIilI0O(ilOil1iooOO0);
/* 126 */                           if (objI001IIilI0O == Oiolio0iO1.I00000oIO) {
/* 145 */                               if (o010OIi2 != null && !o010OIi2.I0000Il00O()) {
/* 158 */                                   throw o010OIi2.I00Io1lO();
                                        }
/* 159 */                               oioliOloIl.I00iOIl = r5;
/* 161 */                               oioliOloIl.I00iiI = ilOil1iooOO03;
/* 163 */                               oioliOloIl.I00iiO = ilOil1iooOO0;
/* 165 */                               oioliOloIl.I00iio = o010OIi2;
/* 167 */                               oioliOloIl.I00io1l = 3;
                                        oiolio4 = r5;
                                        oiolliO04 = ilOil1iooOO0;
/* 173 */                               if (ilOil1iooOO03.emit(objI001IIilI0O, oioliOloIl) == ii0111o) {
/* 175 */                                   return;
                                        }
/* 53 */                                ilOil1iooOO02 = ilOil1iooOO03;
/* 54 */                                o010OIi = o010OIi2;
/* 55 */                                oiolio = oiolio4;
                                        oiolliO0 = oiolliO04;
/* 117 */                               r5 = oiolio;
/* 118 */                               o010OIi2 = o010OIi;
/* 119 */                               ilOil1iooOO03 = ilOil1iooOO02;
                                        ilOil1iooOO0 = oiolliO0;
/* 120 */                               objI001IIilI0O = r5.I001IIilI0O(ilOil1iooOO0);
/* 126 */                               if (objI001IIilI0O == Oiolio0iO1.I00000oIO) {
/* 128 */                                   oioliOloIl.I00iOIl = r5;
/* 130 */                                   oioliOloIl.I00iiI = ilOil1iooOO03;
/* 132 */                                   oioliOloIl.I00iiO = ilOil1iooOO0;
/* 134 */                                   oioliOloIl.I00iio = o010OIi2;
/* 136 */                                   oioliOloIl.I00io1l = 2;
                                        }
                                    }
/* 142 */                       } while (r5.I000iOII(ilOil1iooOO0, oioliOloIl) != ii0111o);
                            }
/* 78 */                    ilOil1iooOO0 = oioliOloIl.I00iiO;
/* 80 */                    IlOil1iooOO0 ilOil1iooOO04 = oioliOloIl.I00iiI;
/* 82 */                    Oiolio oiolio5 = oioliOloIl.I00iOIl;
                            try {
/* 84 */                        lIoii1l01l0i.I00000oOI(obj);
/* 87 */                        ilOil1iooOO02 = ilOil1iooOO04;
/* 88 */                        oiolio = oiolio5;
                                ilOil1iooOO0 = ilOil1iooOO0;
                            } catch (Throwable th2) {
/* 90 */                        th = th2;
/* 91 */                        r5 = oiolio5;
/* 179 */                       r5.I000OOo1O(ilOil1iooOO0);
/* 215 */                       throw th;
                            }
                        }
/* 115 */               o010OIi = (O010OIi) oioliOloIl.getContext().I00lli11(Iioi0lilII.I00iio);
                        oiolliO0 = ilOil1iooOO0;
/* 117 */               r5 = oiolio;
/* 118 */               o010OIi2 = o010OIi;
/* 119 */               ilOil1iooOO03 = ilOil1iooOO02;
                        ilOil1iooOO0 = oiolliO0;
/* 142 */               do {
/* 120 */                   objI001IIilI0O = r5.I001IIilI0O(ilOil1iooOO0);
/* 126 */                   if (objI001IIilI0O == Oiolio0iO1.I00000oIO) {
                            }
/* 142 */               } while (r5.I000iOII(ilOil1iooOO0, oioliOloIl) != ii0111o);
                    } catch (Throwable th3) {
/* 177 */               r5 = oiolio;
/* 178 */               th = th3;
/* 179 */               r5.I000OOo1O(ilOil1iooOO0);
/* 215 */               throw th;
                    }
                }

                @Override
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             I000lI(this, ilOil1iooOO0, iOoil1iiIilo);
/* 4 */             return Ii0111o.I00iOIl;
                }

                @Override
                public final IlOil1ii I00000oOI(Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 1 */             return Oiolio0iO1.I0000Il00O(this, ii00l101O, i, iIII0i);
                }

                @Override
                public final void I0000oI00() throws Throwable {
                    Oiolio oiolio;
                    synchronized (this) {
                        try {
/* 35 */                    oiolio = this;
                            try {
/* 36 */                        oiolio.I001IO000(I00100o1O0lo() + this.I00li1OI, this.I00l0OO0IO, I00100o1O0lo() + this.I00li1OI, I00100o1O0lo() + this.I00li1OI + this.I00ll1);
                            } catch (Throwable th) {
/* 41 */                        th = th;
/* 42 */                        Throwable th2 = th;
/* 113 */                       throw th2;
                            }
                        } catch (Throwable th3) {
/* 44 */                    th = th3;
/* 45 */                    oiolio = this;
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(Object obj) {
                    int i;
                    boolean z;
/* 1 */             IOoil1iiIilo[] iOoil1iiIiloArrI00100l0 = I1O11ll000.I00000oIO;
                    synchronized (this) {
/* 9 */                 if (I0010o(obj)) {
/* 11 */                    iOoil1iiIiloArrI00100l0 = I00100l0(iOoil1iiIiloArrI00100l0);
/* 15 */                    z = true;
                        } else {
/* 19 */                    z = false;
                        }
                    }
/* 22 */            for (IOoil1iiIilo iOoil1iiIilo : iOoil1iiIiloArrI00100l0) {
/* 26 */                if (iOoil1iiIilo != null) {
/* 30 */                    iOoil1iiIilo.resumeWith(OoiIlOl1iI.I00000oIO);
                        }
                    }
/* 36 */            return z;
                }

                @Override
                public final I01i000i0iI I000II() {
/* 3 */             OiolliO0 oiolliO0 = new OiolliO0();
/* 8 */             oiolliO0.I00000oIO = -1L;
/* 29 */            return oiolliO0;
                }

                @Override
                public final I01i000i0iI[] I000O01llI0() {
/* 2 */             return new OiolliO0[2];
                }

                public final Object I000iOII(OiolliO0 oiolliO0, OioliOloIl oioliOloIl) {
/* 8 */             IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(oioliOloIl));
/* 11 */            iIoOoIol0Io0.I00111O();
                    synchronized (this) {
                        try {
/* 23 */                    if (I00111O(oiolliO0) < 0) {
/* 25 */                        oiolliO0.I00000oOI = iIoOoIol0Io0;
                            } else {
/* 32 */                        iIoOoIol0Io0.resumeWith(OoiIlOl1iI.I00000oIO);
                            }
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
/* 36 */            Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
                    return objI0010I0i == Ii0111o.I00iOIl ? objI0010I0i : OoiIlOl1iI.I00000oIO;
                }

                public final void I000l1() {
/* 4 */             if (this.I00ilO0 != 0 || this.I00ll1 > 1) {
/* 11 */                Object[] objArr = this.I00ioIO;
/* 15 */                while (this.I00ll1 > 0) {
/* 17 */                    long jI00100o1O0lo = I00100o1O0lo();
/* 21 */                    int i = this.I00li1OI;
/* 23 */                    int i2 = this.I00ll1;
/* 39 */                    if (objArr[((int) ((jI00100o1O0lo + (i + i2)) - 1)) & (objArr.length - 1)] != Oiolio0iO1.I00000oIO) {
/* 113 */                       return;
                            }
/* 43 */                    this.I00ll1 = i2 - 1;
/* 57 */                    Oiolio0iO1.I0000O(objArr, I00100o1O0lo() + this.I00li1OI + this.I00ll1, null);
                        }
                    }
                }

                public final void I000o00OoI0I() {
                    I01i000i0iI[] i01i000i0iIArr;
/* 8 */             Oiolio0iO1.I0000O(this.I00ioIO, I00100o1O0lo(), null);
                    this.I00li1OI--;
/* 23 */            long jI00100o1O0lo = I00100o1O0lo() + 1;
/* 28 */            if (this.I00l0I0l0lO1 < jI00100o1O0lo) {
/* 30 */                this.I00l0I0l0lO1 = jI00100o1O0lo;
                    }
/* 36 */            if (this.I00l0OO0IO < jI00100o1O0lo) {
/* 40 */                if (this.I00iiI != 0 && (i01i000i0iIArr = this.I00iOIl) != null) {
/* 48 */                    for (I01i000i0iI i01i000i0iI : i01i000i0iIArr) {
/* 52 */                        if (i01i000i0iI != null) {
/* 54 */                            OiolliO0 oiolliO0 = (OiolliO0) i01i000i0iI;
/* 56 */                            long j = oiolliO0.I00000oIO;
/* 62 */                            if (0 <= j && j < jI00100o1O0lo) {
/* 68 */                                oiolliO0.I00000oIO = jI00100o1O0lo;
                                    }
                                }
                            }
                        }
/* 73 */                this.I00l0OO0IO = jI00100o1O0lo;
                    }
                }

                public final void I000oI1ioi(Object obj) {
/* 5 */             int i = this.I00li1OI + this.I00ll1;
/* 6 */             Object[] objArrI0010I0i = this.I00ioIO;
/* 9 */             if (objArrI0010I0i == null) {
/* 13 */                objArrI0010I0i = I0010I0i(null, 0, 2);
                    } else if (i >= objArrI0010I0i.length) {
/* 23 */                objArrI0010I0i = I0010I0i(objArrI0010I0i, i, objArrI0010I0i.length * 2);
                    }
/* 33 */            Oiolio0iO1.I0000O(objArrI0010I0i, I00100o1O0lo() + i, obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final IOoil1iiIilo[] I00100l0(IOoil1iiIilo[] iOoil1iiIiloArr) {
                    I01i000i0iI[] i01i000i0iIArr;
                    OiolliO0 oiolliO0;
                    IIoOoIol0Io0 iIoOoIol0Io0;
/* 1 */             int length = iOoil1iiIiloArr.length;
/* 4 */             if (this.I00iiI != 0 && (i01i000i0iIArr = this.I00iOIl) != null) {
/* 10 */                int length2 = i01i000i0iIArr.length;
/* 11 */                int i = 0;
                        iOoil1iiIiloArr = iOoil1iiIiloArr;
/* 12 */                while (i < length2) {
/* 14 */                    I01i000i0iI i01i000i0iI = i01i000i0iIArr[i];
/* 16 */                    if (i01i000i0iI != null && (iIoOoIol0Io0 = (oiolliO0 = (OiolliO0) i01i000i0iI).I00000oOI) != null && I00111O(oiolliO0) >= 0) {
/* 35 */                        int length3 = iOoil1iiIiloArr.length;
                                iOoil1iiIiloArr = iOoil1iiIiloArr;
/* 36 */                        if (length >= length3) {
/* 45 */                            iOoil1iiIiloArr = Arrays.copyOf(iOoil1iiIiloArr, Math.max(2, iOoil1iiIiloArr.length * 2));
                                }
/* 54 */                        iOoil1iiIiloArr[length] = iIoOoIol0Io0;
/* 57 */                        oiolliO0.I00000oOI = null;
/* 52 */                        length++;
                            }
/* 60 */                    i++;
                            iOoil1iiIiloArr = iOoil1iiIiloArr;
                        }
                    }
/* 63 */            return iOoil1iiIiloArr;
                }

                public final long I00100o1O0lo() {
/* 5 */             return Math.min(this.I00l0OO0IO, this.I00l0I0l0lO1);
                }

                public final Object[] I0010I0i(Object[] objArr, int i, int i2) {
/* 1 */             if (i2 <= 0) {
/* 35 */                I000II.I001IO000("Buffer size overflow");
/* 38 */                return null;
                    }
/* 3 */             Object[] objArr2 = new Object[i2];
/* 5 */             this.I00ioIO = objArr2;
/* 7 */             if (objArr != null) {
/* 10 */                long jI00100o1O0lo = I00100o1O0lo();
/* 15 */                for (int i3 = 0; i3 < i; i3++) {
/* 18 */                    long j = i3 + jI00100o1O0lo;
/* 26 */                    Oiolio0iO1.I0000O(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                        }
                    }
/* 32 */            return objArr2;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0010o(Object obj) {
/* 1 */             int i = this.I00iiI;
/* 3 */             int i2 = this.I00ilI0I1;
/* 6 */             if (i != 0) {
/* 36 */                int i3 = this.I00li1OI;
/* 38 */                int i4 = this.I00ilO0;
/* 40 */                if (i3 < i4 || this.I00l0OO0IO > this.I00l0I0l0lO1) {
/* 71 */                    I000oI1ioi(obj);
/* 76 */                    int i5 = this.I00li1OI + 1;
/* 77 */                    this.I00li1OI = i5;
/* 79 */                    if (i5 > i4) {
/* 81 */                        I000o00OoI0I();
                            }
/* 91 */                    long jI00100o1O0lo = I00100o1O0lo() + this.I00li1OI;
/* 92 */                    long j = this.I00l0I0l0lO1;
/* 96 */                    if (((int) (jI00100o1O0lo - j)) > i2) {
/* 124 */                       I001IO000(1 + j, this.I00l0OO0IO, I00100o1O0lo() + this.I00li1OI, I00100o1O0lo() + this.I00li1OI + this.I00ll1);
                            }
                        } else {
/* 52 */                    int iOrdinal = this.I00io1l.ordinal();
/* 56 */                    if (iOrdinal == 0) {
/* 69 */                        return false;
                            }
/* 58 */                    if (iOrdinal != 1) {
/* 61 */                        if (iOrdinal != 2) {
/* 64 */                            I000II.I00000oIO();
/* 67 */                            return false;
                                }
                            }
                        }
                    } else if (i2 != 0) {
/* 12 */                I000oI1ioi(obj);
/* 17 */                int i6 = this.I00li1OI + 1;
/* 18 */                this.I00li1OI = i6;
/* 20 */                if (i6 > i2) {
/* 22 */                    I000o00OoI0I();
                        }
/* 33 */                this.I00l0OO0IO = I00100o1O0lo() + this.I00li1OI;
/* 5 */                 return true;
                    }
/* 5 */             return true;
                }

                public final long I00111O(OiolliO0 oiolliO0) {
/* 1 */             long j = oiolliO0.I00000oIO;
/* 13 */            if (j >= I00100o1O0lo() + this.I00li1OI && (this.I00ilO0 > 0 || j > I00100o1O0lo() || this.I00ll1 == 0)) {
/* 34 */                return -1L;
                    }
/* 49 */            return j;
                }

                public final Object I001IIilI0O(OiolliO0 oiolliO0) {
                    Object obj;
/* 1 */             IOoil1iiIilo[] iOoil1iiIiloArrI001i1O0Ol = I1O11ll000.I00000oIO;
                    synchronized (this) {
                        try {
/* 4 */                     long jI00111O = I00111O(oiolliO0);
/* 12 */                    if (jI00111O < 0) {
/* 14 */                        obj = Oiolio0iO1.I00000oIO;
                            } else {
/* 19 */                        long j = oiolliO0.I00000oIO;
/* 28 */                        Object obj2 = this.I00ioIO[((int) jI00111O) & (r0.length - 1)];
/* 32 */                        if (obj2 instanceof Oioli1i) {
/* 36 */                            obj2 = ((Oioli1i) obj2).I00iiO;
                                }
/* 41 */                        oiolliO0.I00000oIO = jI00111O + 1;
/* 47 */                        Object obj3 = obj2;
/* 43 */                        iOoil1iiIiloArrI001i1O0Ol = I001i1O0Ol(j);
/* 49 */                        obj = obj3;
                            }
                        } catch (Throwable th) {
/* 186 */                   throw th;
                        }
                    }
/* 53 */            for (IOoil1iiIilo iOoil1iiIilo : iOoil1iiIiloArrI001i1O0Ol) {
/* 57 */                if (iOoil1iiIilo != null) {
/* 61 */                    iOoil1iiIilo.resumeWith(OoiIlOl1iI.I00000oIO);
                        }
                    }
/* 67 */            return obj;
                }

                public final void I001IO000(long j, long j2, long j3, long j4) {
/* 1 */             long jMin = Math.min(j2, j);
/* 11 */            for (long jI00100o1O0lo = I00100o1O0lo(); jI00100o1O0lo < jMin; jI00100o1O0lo++) {
/* 16 */                Oiolio0iO1.I0000O(this.I00ioIO, jI00100o1O0lo, null);
                    }
/* 23 */            this.I00l0I0l0lO1 = j;
/* 25 */            this.I00l0OO0IO = j2;
/* 30 */            this.I00li1OI = (int) (j3 - jMin);
/* 34 */            this.I00ll1 = (int) (j4 - j3);
                }

                public final IOoil1iiIilo[] I001i1O0Ol(long j) {
                    int i;
                    long j2;
                    long j3;
                    IOoil1iiIilo[] iOoil1iiIiloArr;
                    I01i000i0iI[] i01i000i0iIArr;
/* 3 */             long j4 = this.I00l0OO0IO;
/* 7 */             IOoil1iiIilo[] iOoil1iiIiloArr2 = I1O11ll000.I00000oIO;
/* 9 */             if (j <= j4) {
/* 12 */                long jI00100o1O0lo = I00100o1O0lo();
/* 19 */                long j5 = this.I00li1OI + jI00100o1O0lo;
/* 20 */                int i2 = this.I00ilO0;
/* 24 */                if (i2 == 0 && this.I00ll1 > 0) {
/* 30 */                    j5++;
                        }
/* 33 */                int i3 = 0;
/* 34 */                if (this.I00iiI != 0 && (i01i000i0iIArr = this.I00iOIl) != null) {
/* 42 */                    for (I01i000i0iI i01i000i0iI : i01i000i0iIArr) {
/* 46 */                        if (i01i000i0iI != null) {
/* 50 */                            long j6 = ((OiolliO0) i01i000i0iI).I00000oIO;
/* 56 */                            if (0 <= j6 && j6 < j5) {
/* 62 */                                j5 = j6;
                                    }
                                }
                            }
                        }
/* 70 */                if (j5 > this.I00l0OO0IO) {
/* 80 */                    long jI00100o1O0lo2 = I00100o1O0lo() + this.I00li1OI;
/* 81 */                    int i4 = this.I00iiI;
/* 83 */                    int iMin = this.I00ll1;
/* 85 */                    if (i4 > 0) {
/* 92 */                        iMin = Math.min(iMin, i2 - ((int) (jI00100o1O0lo2 - j5)));
                            }
/* 99 */                    long j7 = this.I00ll1 + jI00100o1O0lo2;
/* 100 */                   I0OooiI1I i0OooiI1I = Oiolio0iO1.I00000oIO;
/* 102 */                   if (iMin > 0) {
/* 104 */                       IOoil1iiIilo[] iOoil1iiIiloArr3 = new IOoil1iiIilo[iMin];
/* 106 */                       j3 = 1;
/* 108 */                       Object[] objArr = this.I00ioIO;
/* 110 */                       int i5 = i2;
/* 113 */                       long j8 = jI00100o1O0lo2;
                                while (true) {
/* 116 */                           if (jI00100o1O0lo2 >= j7) {
/* 166 */                               j2 = j5;
/* 168 */                               i = i5;
                                        break;
                                    }
/* 118 */                           j2 = j5;
/* 125 */                           Object obj = objArr[((int) jI00100o1O0lo2) & (objArr.length - 1)];
/* 127 */                           if (obj != i0OooiI1I) {
/* 129 */                               Oioli1i oioli1i = (Oioli1i) obj;
/* 131 */                               int i6 = i3 + 1;
/* 133 */                               i = i5;
/* 137 */                               iOoil1iiIiloArr3[i3] = oioli1i.I00iio;
/* 139 */                               Oiolio0iO1.I0000O(objArr, jI00100o1O0lo2, i0OooiI1I);
/* 144 */                               Oiolio0iO1.I0000O(objArr, j8, oioli1i.I00iiO);
/* 147 */                               j8++;
/* 149 */                               if (i6 >= iMin) {
                                            break;
                                        }
/* 151 */                               i3 = i6;
                                    } else {
/* 157 */                               i = i5;
                                    }
/* 159 */                           jI00100o1O0lo2++;
/* 161 */                           j5 = j2;
/* 163 */                           i5 = i;
                                }
/* 153 */                       jI00100o1O0lo2 = j8;
/* 154 */                       iOoil1iiIiloArr = iOoil1iiIiloArr3;
                            } else {
/* 171 */                       i = i2;
/* 173 */                       j2 = j5;
/* 175 */                       j3 = 1;
/* 177 */                       iOoil1iiIiloArr = iOoil1iiIiloArr2;
                            }
/* 189 */                   long jMax = Math.max(this.I00l0I0l0lO1, Math.max(jI00100o1O0lo, jI00100o1O0lo2 - this.I00ilI0I1));
/* 193 */                   if (i == 0 && jMax < j7) {
/* 212 */                       if (O0000Ioio00.I0000O(this.I00ioIO[((int) jMax) & (r3.length - 1)], i0OooiI1I)) {
/* 214 */                           jI00100o1O0lo2 += j3;
/* 216 */                           jMax += j3;
                                }
                            }
/* 218 */                   long j9 = jI00100o1O0lo2;
/* 229 */                   I001IO000(jMax, this.I00iiI == 0 ? j9 : j2, j9, j7);
/* 232 */                   I000l1();
                            return iOoil1iiIiloArr.length == 0 ? iOoil1iiIiloArr : I00100l0(iOoil1iiIiloArr);
                        }
                    }
/* 72 */            return iOoil1iiIiloArr2;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    IOoil1iiIilo[] iOoil1iiIiloArrI00100l0;
                    Oioli1i oioli1i;
/* 5 */             if (I0001Ioi1lo(obj)) {
/* 7 */                 return OoiIlOl1iI.I00000oIO;
                    }
/* 17 */            IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 20 */            iIoOoIol0Io0.I00111O();
/* 23 */            IOoil1iiIilo[] iOoil1iiIiloArrI00100l02 = I1O11ll000.I00000oIO;
                    synchronized (this) {
                        try {
/* 30 */                    if (I0010o(obj)) {
/* 34 */                        iIoOoIol0Io0.resumeWith(OoiIlOl1iI.I00000oIO);
/* 37 */                        iOoil1iiIiloArrI00100l0 = I00100l0(iOoil1iiIiloArrI00100l02);
/* 41 */                        oioli1i = null;
                            } else {
/* 57 */                        long jI00100o1O0lo = I00100o1O0lo() + this.I00li1OI + this.I00ll1;
/* 58 */                        Oioli1i oioli1i2 = new Oioli1i();
/* 61 */                        oioli1i2.I00iOIl = this;
/* 63 */                        oioli1i2.I00iiI = jI00100o1O0lo;
/* 65 */                        oioli1i2.I00iiO = obj;
/* 67 */                        oioli1i2.I00iio = iIoOoIol0Io0;
/* 69 */                        VarHandle.storeStoreFence();
/* 72 */                        I000oI1ioi(oioli1i2);
                                this.I00ll1++;
/* 82 */                        if (this.I00ilO0 == 0) {
/* 84 */                            iOoil1iiIiloArrI00100l02 = I00100l0(iOoil1iiIiloArrI00100l02);
                                }
/* 88 */                        iOoil1iiIiloArrI00100l0 = iOoil1iiIiloArrI00100l02;
/* 89 */                        oioli1i = oioli1i2;
                            }
                        } catch (Throwable th) {
/* 551 */                   throw th;
                        }
                    }
/* 91 */            if (oioli1i != null) {
/* 93 */                iOl0iOoIl.I00000oIO(iIoOoIol0Io0, oioli1i);
                    }
/* 98 */            for (IOoil1iiIilo iOoil1iiIilo2 : iOoil1iiIiloArrI00100l0) {
/* 102 */               if (iOoil1iiIilo2 != null) {
/* 106 */                   iOoil1iiIilo2.resumeWith(OoiIlOl1iI.I00000oIO);
                        }
                    }
/* 112 */           Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 116 */           Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 118 */           if (objI0010I0i != ii0111o) {
/* 121 */               objI0010I0i = OoiIlOl1iI.I00000oIO;
                    }
                    return objI0010I0i == ii0111o ? objI0010I0i : OoiIlOl1iI.I00000oIO;
                }
            }
