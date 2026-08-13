            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class OlO001lI01Io extends Oll0io implements Function3 {
                public int I00iOIl;
                public IlOil1iooOO0 I00iiI;
                public int I00iiO;
                public final OlO00IIi I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlO001lI01Io(OlO00IIi olO00IIi, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iio = olO00IIi;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 5 */             int iIntValue = ((Number) obj2).intValue();
/* 15 */            OlO001lI01Io olO001lI01Io = new OlO001lI01Io(this.I00iio, (IOoil1iiIilo) obj3);
/* 18 */            olO001lI01Io.I00iiI = (IlOil1iooOO0) obj;
/* 20 */            olO001lI01Io.I00iiO = iIntValue;
/* 24 */            return olO001lI01Io.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
                
                    if (r0.emit(r12, r11) == r2) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
                
                    if (r0.emit(r12, r11) != r2) goto L33;
                 */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Ol00I1i00 ol00I1i00;
/* 1 */             IlOil1iooOO0 ilOil1iooOO0 = this.I00iiI;
/* 3 */             int i = this.I00iiO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i2 = this.I00iOIl;
/* 15 */            if (i2 == 0) {
/* 50 */                lIoii1l01l0i.I00000oOI(obj);
/* 53 */                if (i > 0) {
/* 55 */                    Ol00I1i00 ol00I1i002 = Ol00I1i00.I00iOIl;
/* 57 */                    this.I00iiI = null;
/* 59 */                    this.I00iiO = i;
/* 61 */                    this.I00iOIl = 1;
                        } else {
/* 72 */                    long j = this.I00iio.I00000oIO;
/* 74 */                    this.I00iiI = ilOil1iooOO0;
/* 76 */                    this.I00iiO = i;
/* 78 */                    this.I00iOIl = 2;
/* 84 */                    if (il0l1o1l.I00000oOI(j, this) != ii0111o) {
/* 87 */                        ol00I1i00 = Ol00I1i00.I00iiI;
/* 89 */                        this.I00iiI = ilOil1iooOO0;
/* 91 */                        this.I00iiO = i;
/* 93 */                        this.I00iOIl = 3;
/* 99 */                        if (ilOil1iooOO0.emit(ol00I1i00, this) != ii0111o) {
                                }
                            }
                        }
/* 134 */               return ii0111o;
                    }
/* 17 */            if (i2 != 1) {
/* 19 */                if (i2 == 2) {
/* 42 */                    lIoii1l01l0i.I00000oOI(obj);
/* 87 */                    ol00I1i00 = Ol00I1i00.I00iiI;
/* 89 */                    this.I00iiI = ilOil1iooOO0;
/* 91 */                    this.I00iiO = i;
/* 93 */                    this.I00iOIl = 3;
/* 99 */                    if (ilOil1iooOO0.emit(ol00I1i00, this) != ii0111o) {
/* 102 */                       this.I00iiI = ilOil1iooOO0;
/* 104 */                       this.I00iiO = i;
/* 106 */                       this.I00iOIl = 4;
/* 117 */                       if (il0l1o1l.I00000oOI(Long.MAX_VALUE, this) != ii0111o) {
                                }
                            }
/* 134 */                   return ii0111o;
                        }
/* 21 */                if (i2 == 3) {
/* 38 */                    lIoii1l01l0i.I00000oOI(obj);
/* 102 */                   this.I00iiI = ilOil1iooOO0;
/* 104 */                   this.I00iiO = i;
/* 106 */                   this.I00iOIl = 4;
/* 117 */                   if (il0l1o1l.I00000oOI(Long.MAX_VALUE, this) != ii0111o) {
/* 120 */                       Ol00I1i00 ol00I1i003 = Ol00I1i00.I00iiO;
/* 122 */                       this.I00iiI = null;
/* 124 */                       this.I00iiO = i;
/* 126 */                       this.I00iOIl = 5;
                            }
/* 134 */                   return ii0111o;
                        }
/* 23 */                if (i2 == 4) {
/* 34 */                    lIoii1l01l0i.I00000oOI(obj);
/* 120 */                   Ol00I1i00 ol00I1i0032 = Ol00I1i00.I00iiO;
/* 122 */                   this.I00iiI = null;
/* 124 */                   this.I00iiO = i;
/* 126 */                   this.I00iOIl = 5;
                        } else if (i2 != 5) {
/* 30 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                        }
                    }
/* 46 */            lIoii1l01l0i.I00000oOI(obj);
/* 135 */           return OoiIlOl1iI.I00000oIO;
                }
            }
