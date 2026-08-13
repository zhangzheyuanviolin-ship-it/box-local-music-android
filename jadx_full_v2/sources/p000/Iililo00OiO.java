            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
/* 11 */    public final class Iililo00OiO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public OOo0ooi I00iiI;
                public OOo0ooi I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public final Iilio0oo0 I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iililo00OiO(OOo0ooi oOo0ooi, Iilio0oo0 iilio0oo0, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             super(2, iOoil1iiIilo);
/* 4 */             this.I00iiO = oOo0ooi;
/* 6 */             this.I00ilO0 = iilio0oo0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Iilio0oo0 iilio0oo0 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 20 */                    Iililo00OiO iililo00OiO = new Iililo00OiO(this.I00iiO, iilio0oo0, iOoil1iiIilo);
/* 23 */                    iililo00OiO.I00ilI0I1 = obj;
/* 25 */                    return iililo00OiO;
                        default:
/* 10 */                    Iililo00OiO iililo00OiO2 = new Iililo00OiO(iilio0oo0, iOoil1iiIilo);
/* 13 */                    iililo00OiO2.I00ilI0I1 = obj;
/* 15 */                    return iililo00OiO2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    return ((Iililo00OiO) create((Function1) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((Iililo00OiO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
                
                    if (r4.I011IOil(r8) != r0) goto L12;
                 */
                /* JADX WARN: Path cross not found for [B:45:0x00ca, B:41:0x00b8], limit reached: 87 */
                /* JADX WARN: Path cross not found for [B:47:0x00ce, B:20:0x005e], limit reached: 87 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r3 r6
                  0x003a: PHI (r3v19 OOo0ooi) = (r3v11 OOo0ooi), (r3v23 OOo0ooi) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
                  0x003a: PHI (r6v8 Ii0110) = (r6v6 Ii0110), (r6v9 Ii0110) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[PHI: r7
                  0x005e: PHI (r7v14 Ii0110) = (r7v7 Ii0110), (r7v10 Ii0110), (r7v10 Ii0110), (r7v10 Ii0110), (r7v12 Ii0110), (r7v15 Ii0110) binds: [B:19:0x0056, B:46:0x00cc, B:48:0x00d9, B:42:0x00c5, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0135 -> B:76:0x0136). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0139 -> B:78:0x013b). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Function1 function1;
                    Object obj2;
                    Ii0110 ii0110;
                    OOo0ooi oOo0ooi;
                    OOo0ooi oOo0ooi2;
                    OOo0ooi oOo0ooi3;
                    Ii0110 ii01102;
                    Ii0110 ii01103;
                    Object obj3;
                    Iililo00OiO iililo00OiO;
                    IilIol11Ii iilIol11Ii;
                    Object obj4;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             Iilio0oo0 iilio0oo0 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 236 */                   OOo0ooi oOo0ooi4 = this.I00iiO;
/* 238 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 240 */                   int i2 = this.I00iio;
/* 242 */                   if (i2 == 0) {
/* 261 */                       lIoii1l01l0i.I00000oOI(obj);
/* 266 */                       function1 = (Function1) this.I00ilI0I1;
/* 269 */                       obj2 = oOo0ooi4.I00iOIl;
                                if (obj2 instanceof IilIoiI1Oo01) {
                                }
                            } else {
/* 244 */                       if (i2 != 1) {
/* 256 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 246 */                       OOo0ooi oOo0ooi5 = this.I00iiI;
/* 250 */                       function1 = (Function1) this.I00ilI0I1;
/* 252 */                       lIoii1l01l0i.I00000oOI(obj);
/* 311 */                       IilIol11Ii iilIol11Ii2 = (IilIol11Ii) obj;
/* 316 */                       oOo0ooi5.I00iOIl = iilIol11Ii2;
/* 269 */                       obj2 = oOo0ooi4.I00iOIl;
/* 277 */                       if ((obj2 instanceof IilIoiI1Oo01) && !(obj2 instanceof IilIi0I)) {
/* 286 */                           IilIiOlii iilIiOlii = obj2 instanceof IilIiOlii ? (IilIiOlii) obj2 : null;
/* 287 */                           if (iilIiOlii != null) {
/* 289 */                               function1.invoke(iilIiOlii);
                                    }
/* 292 */                           IIIII1OI1 iiiii1oi1 = iilio0oo0.I00oO101o;
/* 294 */                           if (iiiii1oi1 != null) {
/* 296 */                               this.I00ilI0I1 = function1;
/* 298 */                               this.I00iiI = oOo0ooi4;
/* 300 */                               this.I00iio = 1;
/* 302 */                               obj = iiiii1oi1.I000iOII(this);
/* 306 */                               if (obj == ii0111o) {
/* 308 */                                   return ii0111o;
                                        }
/* 310 */                               oOo0ooi5 = oOo0ooi4;
/* 311 */                               IilIol11Ii iilIol11Ii22 = (IilIol11Ii) obj;
/* 316 */                               oOo0ooi5.I00iOIl = iilIol11Ii22;
/* 269 */                               obj2 = oOo0ooi4.I00iOIl;
                                        return obj2 instanceof IilIoiI1Oo01 ? ooiIlOl1iI : ooiIlOl1iI;
                                    }
/* 314 */                           oOo0ooi5 = oOo0ooi4;
/* 315 */                           iilIol11Ii22 = null;
/* 316 */                           oOo0ooi5.I00iOIl = iilIol11Ii22;
/* 269 */                           obj2 = oOo0ooi4.I00iOIl;
                                    if (obj2 instanceof IilIoiI1Oo01) {
                                    }
                                }
                            }
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
                            switch (this.I00iio) {
                                case 0:
/* 87 */                            lIoii1l01l0i.I00000oOI(obj);
/* 92 */                            ii0110 = (Ii0110) this.I00ilI0I1;
/* 99 */                            if (!il001oo1.I0000O(ii0110)) {
/* 103 */                               oOo0ooi = new OOo0ooi();
/* 106 */                               IIIII1OI1 iiiii1oi12 = iilio0oo0.I00oO101o;
/* 108 */                               if (iiiii1oi12 == null) {
/* 130 */                                   oOo0ooi2 = oOo0ooi;
/* 131 */                                   iilIol11Ii = null;
/* 132 */                                   oOo0ooi.I00iOIl = iilIol11Ii;
/* 134 */                                   obj4 = oOo0ooi2.I00iOIl;
/* 138 */                                   if (obj4 instanceof IilIli) {
                                            }
/* 234 */                                   return ii0111o2;
                                        }
/* 110 */                               this.I00ilI0I1 = ii0110;
/* 112 */                               this.I00iiI = oOo0ooi;
/* 114 */                               this.I00iiO = oOo0ooi;
/* 116 */                               this.I00iio = 1;
/* 118 */                               obj = iiiii1oi12.I000iOII(this);
/* 122 */                               if (obj != ii0111o2) {
/* 126 */                                   oOo0ooi2 = oOo0ooi;
/* 127 */                                   iilIol11Ii = (IilIol11Ii) obj;
/* 132 */                                   oOo0ooi.I00iOIl = iilIol11Ii;
/* 134 */                                   obj4 = oOo0ooi2.I00iOIl;
/* 138 */                                   if (obj4 instanceof IilIli) {
/* 142 */                                       this.I00ilI0I1 = ii0110;
/* 144 */                                       this.I00iiI = oOo0ooi2;
/* 146 */                                       this.I00iiO = null;
/* 149 */                                       this.I00iio = 2;
/* 155 */                                       if (iilio0oo0.I011Ill((IilIli) obj4, this) != ii0111o2) {
/* 158 */                                           oOo0ooi3 = oOo0ooi2;
/* 159 */                                           ii01102 = ii0110;
/* 162 */                                           iililo00OiO = new Iililo00OiO(oOo0ooi3, iilio0oo0, null);
/* 165 */                                           this.I00ilI0I1 = ii01102;
/* 167 */                                           this.I00iiI = oOo0ooi3;
/* 170 */                                           this.I00iio = 3;
/* 176 */                                           if (iilio0oo0.I010oio1OO0(iililo00OiO, this) != ii0111o2) {
/* 59 */                                                ii0110 = ii01102;
                                                        try {
                                                        } catch (CancellationException unused) {
/* 201 */                                                   ii01103 = ii0110;
/* 221 */                                                   this.I00ilI0I1 = ii01103;
/* 223 */                                                   this.I00iiI = null;
/* 226 */                                                   this.I00iio = 6;
                                                            break;
                                                        }
/* 179 */                                               obj3 = oOo0ooi3.I00iOIl;
/* 183 */                                               if (obj3 instanceof IilIoiI1Oo01) {
/* 187 */                                                   this.I00ilI0I1 = ii0110;
/* 189 */                                                   this.I00iiI = null;
/* 192 */                                                   this.I00iio = 4;
/* 198 */                                                   if (iilio0oo0.I011Io0I1ioi((IilIoiI1Oo01) obj3, this) != ii0111o2) {
/* 99 */                                                        if (!il001oo1.I0000O(ii0110)) {
                                                                }
                                                            }
                                                        } else {
/* 205 */                                                   if (obj3 instanceof IilIi0I) {
/* 207 */                                                       this.I00ilI0I1 = ii0110;
/* 209 */                                                       this.I00iiI = null;
/* 212 */                                                       this.I00iio = 5;
/* 218 */                                                       if (iilio0oo0.I011IOil(this) != ii0111o2) {
                                                                }
                                                            }
/* 99 */                                                    if (!il001oo1.I0000O(ii0110)) {
/* 235 */                                                       return ooiIlOl1iI;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
/* 234 */                               return ii0111o2;
                                    }
                                case 1:
/* 75 */                            oOo0ooi = this.I00iiO;
/* 77 */                            oOo0ooi2 = this.I00iiI;
/* 81 */                            ii0110 = (Ii0110) this.I00ilI0I1;
/* 83 */                            lIoii1l01l0i.I00000oOI(obj);
/* 127 */                           iilIol11Ii = (IilIol11Ii) obj;
/* 132 */                           oOo0ooi.I00iOIl = iilIol11Ii;
/* 134 */                           obj4 = oOo0ooi2.I00iOIl;
/* 138 */                           if (obj4 instanceof IilIli) {
                                    }
/* 234 */                           return ii0111o2;
                                case 2:
/* 65 */                            oOo0ooi3 = this.I00iiI;
/* 69 */                            ii01102 = (Ii0110) this.I00ilI0I1;
/* 71 */                            lIoii1l01l0i.I00000oOI(obj);
/* 162 */                           iililo00OiO = new Iililo00OiO(oOo0ooi3, iilio0oo0, null);
/* 165 */                           this.I00ilI0I1 = ii01102;
/* 167 */                           this.I00iiI = oOo0ooi3;
/* 170 */                           this.I00iio = 3;
/* 176 */                           if (iilio0oo0.I010oio1OO0(iililo00OiO, this) != ii0111o2) {
                                    }
/* 234 */                           return ii0111o2;
                                case 3:
/* 50 */                            oOo0ooi3 = this.I00iiI;
/* 54 */                            ii01102 = (Ii0110) this.I00ilI0I1;
                                    try {
/* 56 */                                lIoii1l01l0i.I00000oOI(obj);
                                    } catch (CancellationException unused2) {
/* 62 */                                ii01103 = ii01102;
/* 221 */                               this.I00ilI0I1 = ii01103;
/* 223 */                               this.I00iiI = null;
/* 226 */                               this.I00iio = 6;
                                        break;
                                    }
/* 59 */                            ii0110 = ii01102;
/* 179 */                           obj3 = oOo0ooi3.I00iOIl;
/* 183 */                           if (obj3 instanceof IilIoiI1Oo01) {
                                    }
                                    break;
                                case 4:
/* 45 */                            ii01103 = (Ii0110) this.I00ilI0I1;
                                    try {
/* 39 */                                lIoii1l01l0i.I00000oOI(obj);
                                    } catch (CancellationException unused3) {
/* 221 */                               this.I00ilI0I1 = ii01103;
/* 223 */                               this.I00iiI = null;
/* 226 */                               this.I00iio = 6;
                                        break;
                                    }
/* 48 */                            ii0110 = ii01103;
/* 99 */                            if (!il001oo1.I0000O(ii0110)) {
                                    }
                                    break;
                                case 5:
/* 37 */                            ii01103 = (Ii0110) this.I00ilI0I1;
/* 39 */                            lIoii1l01l0i.I00000oOI(obj);
/* 48 */                            ii0110 = ii01103;
/* 99 */                            if (!il001oo1.I0000O(ii0110)) {
                                    }
                                    break;
                                case 6:
/* 29 */                            ii01103 = (Ii0110) this.I00ilI0I1;
/* 31 */                            lIoii1l01l0i.I00000oOI(obj);
/* 48 */                            ii0110 = ii01103;
/* 99 */                            if (!il001oo1.I0000O(ii0110)) {
                                    }
                                    break;
                                default:
/* 21 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public Iililo00OiO(Iilio0oo0 iilio0oo0, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00ilO0 = iilio0oo0;
                }
            }
