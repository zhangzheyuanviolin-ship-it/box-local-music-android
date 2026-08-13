            package p000;
            
            public final class OoIlI111 extends Oll0io implements IlliIl1l11O {
                public OIOii1iO1[] I00iOIl;
                public OoIlIoo1oiOo I00iiI;
                public OO01Ol I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public final OIOii1iO1[] I00ioIO;
                public final OoIlIoo1oiOo I00l0I0l0lO1;
                public final OO01Ol I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OoIlI111(OIOii1iO1[] oIOii1iO1Arr, OoIlIoo1oiOo ooIlIoo1oiOo, OO01Ol oO01Ol, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ioIO = oIOii1iO1Arr;
/* 3 */             this.I00l0I0l0lO1 = ooIlIoo1oiOo;
/* 5 */             this.I00l0OO0IO = oO01Ol;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new OoIlI111(this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OoIlI111) create((OO01IO1Oo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
                
                    if (r8.I000iOII(r7, r12, r11) == r0) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
                
                    r6 = r10;
                 */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:26:0x0073). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int length;
                    int i;
                    OO01Ol oO01Ol;
                    OIOii1iO1[] oIOii1iO1Arr;
                    int i2;
                    OoIlIoo1oiOo ooIlIoo1oiOo;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i3 = this.I00io1l;
/* 8 */             if (i3 == 0) {
/* 36 */                lIoii1l01l0i.I00000oOI(obj);
/* 39 */                OIOii1iO1[] oIOii1iO1Arr2 = this.I00ioIO;
/* 41 */                length = oIOii1iO1Arr2.length;
/* 42 */                i = 0;
/* 43 */                OoIlIoo1oiOo ooIlIoo1oiOo2 = this.I00l0I0l0lO1;
/* 45 */                oO01Ol = this.I00l0OO0IO;
/* 47 */                oIOii1iO1Arr = oIOii1iO1Arr2;
/* 48 */                i2 = 0;
/* 49 */                ooIlIoo1oiOo = ooIlIoo1oiOo2;
/* 50 */                if (i >= length) {
                        }
                    } else {
/* 10 */                if (i3 != 1 && i3 != 2) {
/* 32 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 14 */                length = this.I00ilO0;
/* 16 */                i = this.I00ilI0I1;
/* 18 */                int i4 = this.I00iio;
/* 20 */                oO01Ol = this.I00iiO;
/* 22 */                ooIlIoo1oiOo = this.I00iiI;
/* 24 */                oIOii1iO1Arr = this.I00iOIl;
/* 26 */                lIoii1l01l0i.I00000oOI(obj);
/* 88 */                i2 = i4;
/* 116 */               i++;
/* 50 */                if (i >= length) {
/* 54 */                    int i5 = i2 + 1;
/* 56 */                    int iOrdinal = oIOii1iO1Arr[i].ordinal();
/* 60 */                    if (iOrdinal == 0) {
/* 115 */                       i2 = i5;
/* 116 */                       i++;
/* 50 */                        if (i >= length) {
/* 118 */                           return OoiIlOl1iI.I00000oIO;
                                }
                            } else {
/* 62 */                        if (iOrdinal != 1) {
/* 64 */                            if (iOrdinal != 2) {
/* 90 */                                I000II.I00000oIO();
/* 5 */                                 return null;
                                    }
/* 66 */                            this.I00iOIl = oIOii1iO1Arr;
/* 68 */                            this.I00iiI = ooIlIoo1oiOo;
/* 70 */                            this.I00iiO = oO01Ol;
/* 72 */                            this.I00iio = i5;
/* 74 */                            this.I00ilI0I1 = i;
/* 76 */                            this.I00ilO0 = length;
/* 78 */                            this.I00io1l = 2;
/* 84 */                            if (ooIlIoo1oiOo.I000l1(oO01Ol, i2, this) != ii0111o) {
/* 87 */                                i4 = i5;
/* 88 */                                i2 = i4;
                                    }
/* 114 */                           return ii0111o;
                                }
/* 94 */                        this.I00iOIl = oIOii1iO1Arr;
/* 96 */                        this.I00iiI = ooIlIoo1oiOo;
/* 98 */                        this.I00iiO = oO01Ol;
/* 100 */                       this.I00iio = i5;
/* 102 */                       this.I00ilI0I1 = i;
/* 104 */                       this.I00ilO0 = length;
/* 106 */                       this.I00io1l = 1;
/* 116 */                       i++;
/* 50 */                        if (i >= length) {
                                }
                            }
                        }
                    }
                }
            }
