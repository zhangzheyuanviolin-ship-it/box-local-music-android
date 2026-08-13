            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IlOl01I111 implements IlOil1ii {
                public final int I00iOIl;
                public IlOil1ii I00iiI;
                public Object I00iiO;

                public IlOl01I111(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
                
                    if (r2 == r11) goto L30;
                 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
                /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0092 -> B:34:0x00bd). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ad -> B:31:0x00b1). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IlOiooioi ilOiooioi;
                    OiIOl1io oiIOl1io;
                    OiIOl1io oiIOl1io2;
                    IlOil1ii ilOil1ii;
                    IlOlOIll ilOlOIll;
                    long j;
                    int i;
                    IlOil1iooOO0 ilOil1iooOO02;
                    Object objI00000oOI;
                    int i2;
                    int i3;
                    Throwable th;
/* 3 */             IlOil1iooOO0 ilOil1iooOO03 = ilOil1iooOO0;
/* 7 */             int i4 = this.I00iOIl;
/* 15 */            int i5 = 0;
/* 16 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i4) {
                        case 0:
/* 203 */                   if (iOoil1iiIilo instanceof IlOiooioi) {
/* 206 */                       ilOiooioi = (IlOiooioi) iOoil1iiIilo;
/* 208 */                       int i6 = ilOiooioi.I00iiI;
/* 212 */                       if ((i6 & Integer.MIN_VALUE) != 0) {
/* 215 */                           ilOiooioi.I00iiI = i6 - Integer.MIN_VALUE;
                                } else {
/* 220 */                           ilOiooioi = new IlOiooioi(this, iOoil1iiIilo);
                                }
                            }
/* 223 */                   Object obj = ilOiooioi.I00iOIl;
/* 225 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 227 */                   int i7 = ilOiooioi.I00iiI;
/* 229 */                   if (i7 == 0) {
/* 258 */                       lIoii1l01l0i.I00000oOI(obj);
/* 267 */                       oiIOl1io = new OiIOl1io(ilOil1iooOO03, ilOiooioi.getContext());
                                try {
/* 272 */                           Ii1IiiOOOO ii1IiiOOOO = (Ii1IiiOOOO) this.I00iiO;
/* 274 */                           ilOiooioi.I00iio = ilOil1iooOO03;
/* 276 */                           ilOiooioi.I00ilI0I1 = oiIOl1io;
/* 278 */                           ilOiooioi.I00ilO0 = 0;
/* 280 */                           ilOiooioi.I00iiI = 1;
/* 286 */                           if (ii1IiiOOOO.invoke(oiIOl1io, ilOiooioi) != ii0111o) {
/* 289 */                               oiIOl1io.releaseIntercepted();
/* 292 */                               ilOil1ii = this.I00iiI;
/* 294 */                               ilOiooioi.I00iio = null;
/* 296 */                               ilOiooioi.I00ilI0I1 = null;
/* 298 */                               ilOiooioi.I00ilO0 = i5;
/* 300 */                               ilOiooioi.I00iiI = 2;
/* 306 */                               if (ilOil1ii.I00000oIO(ilOil1iooOO03, ilOiooioi) != ii0111o) {
                                        }
                                    }
                                } catch (Throwable th2) {
/* 310 */                           th = th2;
/* 311 */                           oiIOl1io2 = oiIOl1io;
/* 312 */                           oiIOl1io2.releaseIntercepted();
/* 315 */                           throw th;
                                }
                            } else {
/* 231 */                       if (i7 != 1) {
/* 233 */                           if (i7 == 2) {
/* 235 */                               lIoii1l01l0i.I00000oOI(obj);
/* 309 */                               return ooiIlOl1iI;
                                    }
/* 239 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                            return null;
                                }
/* 244 */                       i5 = ilOiooioi.I00ilO0;
/* 246 */                       oiIOl1io2 = ilOiooioi.I00ilI0I1;
/* 248 */                       IlOil1iooOO0 ilOil1iooOO04 = ilOiooioi.I00iio;
                                try {
/* 250 */                           lIoii1l01l0i.I00000oOI(obj);
/* 253 */                           oiIOl1io = oiIOl1io2;
/* 254 */                           ilOil1iooOO03 = ilOil1iooOO04;
/* 289 */                           oiIOl1io.releaseIntercepted();
/* 292 */                           ilOil1ii = this.I00iiI;
/* 294 */                           ilOiooioi.I00iio = null;
/* 296 */                           ilOiooioi.I00ilI0I1 = null;
/* 298 */                           ilOiooioi.I00ilO0 = i5;
/* 300 */                           ilOiooioi.I00iiI = 2;
/* 306 */                           if (ilOil1ii.I00000oIO(ilOil1iooOO03, ilOiooioi) != ii0111o) {
/* 309 */                               return ooiIlOl1iI;
                                    }
                                } catch (Throwable th3) {
/* 256 */                           th = th3;
/* 312 */                           oiIOl1io2.releaseIntercepted();
/* 315 */                           throw th;
                                }
                            }
/* 308 */                   return ii0111o;
                        case 1:
/* 47 */                    if (iOoil1iiIilo instanceof IlOlOIll) {
/* 50 */                        ilOlOIll = (IlOlOIll) iOoil1iiIilo;
/* 52 */                        int i8 = ilOlOIll.I00iiI;
/* 56 */                        if ((i8 & Integer.MIN_VALUE) != 0) {
/* 59 */                            ilOlOIll.I00iiI = i8 - Integer.MIN_VALUE;
                                } else {
/* 64 */                            ilOlOIll = new IlOlOIll(this, iOoil1iiIilo);
                                }
                            }
/* 67 */                    Object objI000l1 = ilOlOIll.I00iOIl;
/* 69 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 71 */                    int i9 = ilOlOIll.I00iiI;
/* 73 */                    if (i9 == 0) {
/* 115 */                       lIoii1l01l0i.I00000oOI(objI000l1);
/* 118 */                       j = 0;
/* 120 */                       i = 0;
/* 121 */                       IlOil1ii ilOil1ii2 = this.I00iiI;
/* 123 */                       ilOlOIll.I00iio = ilOil1iooOO03;
/* 125 */                       ilOlOIll.I00ilI0I1 = null;
/* 127 */                       ilOlOIll.I00ilO0 = i;
/* 129 */                       ilOlOIll.I00ioIO = j;
/* 131 */                       ilOlOIll.I00io1l = 0;
/* 133 */                       ilOlOIll.I00iiI = 1;
/* 135 */                       objI00000oOI = ilOo1lI1o10.I00000oOI(ilOil1ii2, ilOil1iooOO03, ilOlOIll);
/* 139 */                       if (objI00000oOI != ii0111o2) {
                                }
/* 176 */                       return ii0111o2;
                            }
/* 75 */                    if (i9 != 1) {
/* 77 */                        if (i9 != 2) {
/* 91 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                            return null;
                                }
/* 79 */                        j = ilOlOIll.I00ioIO;
/* 81 */                        i3 = ilOlOIll.I00ilO0;
/* 83 */                        th = ilOlOIll.I00ilI0I1;
/* 85 */                        ilOil1iooOO02 = ilOlOIll.I00iio;
/* 87 */                        lIoii1l01l0i.I00000oOI(objI000l1);
/* 184 */                       if (!((Boolean) objI000l1).booleanValue()) {
/* 194 */                           throw th;
                                }
/* 188 */                       j++;
/* 189 */                       i2 = 1;
/* 190 */                       IlOlOIll ilOlOIll2 = ilOlOIll;
/* 191 */                       int i10 = i3;
/* 192 */                       ilOil1iooOO03 = ilOil1iooOO02;
/* 195 */                       if (i2 == 0) {
/* 197 */                           return ooiIlOl1iI;
                                }
/* 198 */                       i = i10;
/* 199 */                       ilOlOIll = ilOlOIll2;
/* 121 */                       IlOil1ii ilOil1ii22 = this.I00iiI;
/* 123 */                       ilOlOIll.I00iio = ilOil1iooOO03;
/* 125 */                       ilOlOIll.I00ilI0I1 = null;
/* 127 */                       ilOlOIll.I00ilO0 = i;
/* 129 */                       ilOlOIll.I00ioIO = j;
/* 131 */                       ilOlOIll.I00io1l = 0;
/* 133 */                       ilOlOIll.I00iiI = 1;
/* 135 */                       objI00000oOI = ilOo1lI1o10.I00000oOI(ilOil1ii22, ilOil1iooOO03, ilOlOIll);
/* 139 */                       if (objI00000oOI != ii0111o2) {
/* 142 */                           ilOil1iooOO02 = ilOil1iooOO03;
/* 143 */                           i3 = i;
/* 144 */                           i2 = 0;
/* 145 */                           th = (Throwable) objI00000oOI;
/* 147 */                           if (th != null) {
/* 151 */                               OoiI0oiiIo ooiI0oiiIo = (OoiI0oiiIo) this.I00iiO;
/* 155 */                               Long l = new Long(j);
/* 158 */                               ilOlOIll.I00iio = ilOil1iooOO02;
/* 160 */                               ilOlOIll.I00ilI0I1 = th;
/* 162 */                               ilOlOIll.I00ilO0 = i3;
/* 164 */                               ilOlOIll.I00ioIO = j;
/* 166 */                               ilOlOIll.I00io1l = i2;
/* 168 */                               ilOlOIll.I00iiI = 2;
/* 170 */                               objI000l1 = ooiI0oiiIo.I000l1(ilOil1iooOO02, th, l, ilOlOIll);
                                        break;
                                    }
/* 190 */                           IlOlOIll ilOlOIll22 = ilOlOIll;
/* 191 */                           int i102 = i3;
/* 192 */                           ilOil1iooOO03 = ilOil1iooOO02;
/* 195 */                           if (i2 == 0) {
                                    }
                                }
/* 176 */                       return ii0111o2;
                            }
/* 97 */                    int i11 = ilOlOIll.I00io1l;
/* 99 */                    j = ilOlOIll.I00ioIO;
/* 101 */                   int i12 = ilOlOIll.I00ilO0;
/* 103 */                   ilOil1iooOO02 = ilOlOIll.I00iio;
/* 105 */                   lIoii1l01l0i.I00000oOI(objI000l1);
/* 110 */                   i2 = i11;
/* 111 */                   i3 = i12;
/* 112 */                   objI00000oOI = objI000l1;
/* 145 */                   th = (Throwable) objI00000oOI;
/* 147 */                   if (th != null) {
                            }
/* 190 */                   IlOlOIll ilOlOIll222 = ilOlOIll;
/* 191 */                   int i1022 = i3;
/* 192 */                   ilOil1iooOO03 = ilOil1iooOO02;
/* 195 */                   if (i2 == 0) {
                            }
                        default:
/* 22 */                    IlOil1ii ilOil1ii3 = this.I00iiI;
/* 27 */                    I10OIli10o1 i10OIli10o1 = new I10OIli10o1(6);
/* 30 */                    i10OIli10o1.I00iiI = ilOil1iooOO03;
/* 32 */                    VarHandle.storeStoreFence();
/* 35 */                    Object objI00000oIO = ilOil1ii3.I00000oIO(i10OIli10o1, iOoil1iiIilo);
                            return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : ooiIlOl1iI;
                    }
                }
            }
