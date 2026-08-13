            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii1Io1loiI implements IlOil1ii {
                public final int I00iOIl;
                public Object I00iiI;

                public Ii1Io1loiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    I010OIo1l i010OIo1l;
                    Throwable th;
                    OiIOl1io oiIOl1io;
/* 1 */             int i = this.I00iOIl;
/* 4 */             int i2 = 5;
/* 5 */             IOoil1iiIilo iOoil1iiIilo2 = null;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 201 */                   IlOlOlI0 ilOlOlI0 = (IlOlOlI0) this.I00iiI;
/* 206 */                   I10OIli10o1 i10OIli10o1 = new I10OIli10o1(2);
/* 209 */                   i10OIli10o1.I00iiI = ilOil1iooOO0;
/* 211 */                   VarHandle.storeStoreFence();
/* 214 */                   Object objI00000oIO = ilOlOlI0.I00000oIO(i10OIli10o1, iOoil1iiIilo);
                            return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : ooiIlOl1iI;
                        case 1:
/* 188 */                   Object objEmit = ilOil1iooOO0.emit(this.I00iiI, iOoil1iiIilo);
                            return objEmit == Ii0111o.I00iOIl ? objEmit : ooiIlOl1iI;
                        case 2:
/* 167 */                   OOli00O001 oOli00O001 = (OOli00O001) this.I00iiI;
/* 171 */                   I10OIli10o1 i10OIli10o12 = new I10OIli10o1(i2);
/* 174 */                   i10OIli10o12.I00iiI = ilOil1iooOO0;
/* 176 */                   VarHandle.storeStoreFence();
/* 179 */                   oOli00O001.I00000oIO(i10OIli10o12, iOoil1iiIilo);
/* 182 */                   return Ii0111o.I00iOIl;
                        case 3:
/* 67 */                    if (iOoil1iiIilo instanceof I010OIo1l) {
/* 70 */                        i010OIo1l = (I010OIo1l) iOoil1iiIilo;
/* 72 */                        int i3 = i010OIo1l.I00iio;
/* 78 */                        if ((i3 & Integer.MIN_VALUE) != 0) {
/* 81 */                            i010OIo1l.I00iio = i3 - Integer.MIN_VALUE;
                                } else {
/* 86 */                            i010OIo1l = new I010OIo1l(this, iOoil1iiIilo);
                                }
                            }
/* 89 */                    Object obj = i010OIo1l.I00iiI;
/* 91 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 93 */                    int i4 = i010OIo1l.I00iio;
/* 95 */                    if (i4 != 0) {
/* 97 */                        if (i4 != 1) {
/* 110 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 99 */                        oiIOl1io = i010OIo1l.I00iOIl;
                                try {
/* 101 */                           lIoii1l01l0i.I00000oOI(obj);
/* 147 */                           oiIOl1io.releaseIntercepted();
/* 150 */                           return ooiIlOl1iI;
                                } catch (Throwable th2) {
/* 106 */                           th = th2;
/* 160 */                           oiIOl1io.releaseIntercepted();
/* 163 */                           throw th;
                                }
                            }
/* 114 */                   lIoii1l01l0i.I00000oOI(obj);
/* 123 */                   OiIOl1io oiIOl1io2 = new OiIOl1io(ilOil1iooOO0, i010OIo1l.getContext());
                            try {
/* 126 */                       i010OIo1l.I00iOIl = oiIOl1io2;
/* 128 */                       i010OIo1l.I00iio = 1;
                                try {
/* 134 */                           Object objInvoke = ((IlliIl1l11O) this.I00iiI).invoke(oiIOl1io2, i010OIo1l);
/* 138 */                           if (objInvoke != ii0111o) {
/* 141 */                               objInvoke = ooiIlOl1iI;
                                    }
/* 142 */                           if (objInvoke == ii0111o) {
/* 144 */                               return ii0111o;
                                    }
/* 146 */                           oiIOl1io = oiIOl1io2;
/* 147 */                           oiIOl1io.releaseIntercepted();
/* 150 */                           return ooiIlOl1iI;
                                } catch (Throwable th3) {
/* 154 */                           th = th3;
/* 155 */                           oiIOl1io = oiIOl1io2;
/* 160 */                           oiIOl1io.releaseIntercepted();
/* 163 */                           throw th;
                                }
                            } catch (Throwable th4) {
/* 158 */                       th = th4;
                            }
                        default:
/* 14 */                    IlOil1ii[] ilOil1iiArr = (IlOil1ii[]) this.I00iiI;
/* 20 */                    O0l1iloO o0l1iloO = new O0l1iloO(10);
/* 23 */                    o0l1iloO.I00iiI = ilOil1iiArr;
/* 25 */                    VarHandle.storeStoreFence();
/* 38 */                    IOOo0ll iOOo0ll = new IOOo0ll(ilOil1iiArr, o0l1iloO, new IiIIl0OOio0O(3, iOoil1iiIilo2, i2), ilOil1iooOO0, null);
/* 47 */                    IlOil1l01 ilOil1l01 = new IlOil1l01(iOoil1iiIilo, iOoil1iiIilo.getContext());
/* 50 */                    Object objI00000oIO2 = li0011.I00000oIO(ilOil1l01, true, ilOil1l01, iOOo0ll);
/* 54 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 56 */                    if (objI00000oIO2 != ii0111o2) {
/* 59 */                        objI00000oIO2 = ooiIlOl1iI;
                            }
                            return objI00000oIO2 == ii0111o2 ? objI00000oIO2 : ooiIlOl1iI;
                    }
                }
            }
