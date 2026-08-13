            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class IIIO11101 extends Oll0io implements IlliIl1l11O {
                public I1I0i0Ilo1Oi I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Throwable I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public final I1I0i0Ilo1Oi I00l0I0l0lO1;
                public final IOi10loi I00l0OO0IO;
                public final IoIlI1oli I00li1OI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIIO11101(I1I0i0Ilo1Oi i1I0i0Ilo1Oi, IOi10loi iOi10loi, IoIlI1oli ioIlI1oli, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00l0I0l0lO1 = i1I0i0Ilo1Oi;
/* 3 */             this.I00l0OO0IO = iOi10loi;
/* 5 */             this.I00li1OI = ioIlI1oli;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new IIIO11101(this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IIIO11101) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
                
                    if (r0 == r2) goto L85;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
                
                    if (r12.I00II0Ol1O0l(r11, r4, r16) != r2) goto L68;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0115 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x005c, blocks: (B:22:0x0055, B:56:0x0115, B:61:0x0133, B:62:0x013a, B:27:0x006d), top: B:84:0x0010 }] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0133 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #5 {all -> 0x005c, blocks: (B:22:0x0055, B:56:0x0115, B:61:0x0133, B:62:0x013a, B:27:0x006d), top: B:84:0x0010 }] */
                /* JADX WARN: Type inference failed for: r11v17 */
                /* JADX WARN: Type inference failed for: r11v18 */
                /* JADX WARN: Type inference failed for: r11v4 */
                /* JADX WARN: Type inference failed for: r11v8, types: [Ii1olII1lO1] */
                /* JADX WARN: Type inference failed for: r12v16 */
                /* JADX WARN: Type inference failed for: r12v17 */
                /* JADX WARN: Type inference failed for: r12v4 */
                /* JADX WARN: Type inference failed for: r12v8, types: [I1I0i0Ilo1Oi] */
                /* JADX WARN: Type inference failed for: r8v19 */
                /* JADX WARN: Type inference failed for: r8v20 */
                /* JADX WARN: Type inference failed for: r8v21 */
                /* JADX WARN: Type inference failed for: r8v4, types: [Ii0110, Ii1olII1lO1, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v7 */
                /* JADX WARN: Type inference failed for: r8v9 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Throwable th;
                    int i;
                    Object objI00Io1lO;
                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi;
                    IOi10loi iOi10loi;
                    int i2;
                    int i3;
                    ?? r8;
                    O0O01O0o o0O01O0oI00000oIO;
                    Object objI00000oOI;
                    int i4;
                    int i5;
                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi2;
                    Ii1olII1lO1 ii1olII1lO1;
                    int i6;
                    Object objI0000oI00;
                    ?? r12;
                    ?? r11;
                    int i7;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i8 = this.I00ioIO;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            int i9 = 3;
/* 12 */            int i10 = 2;
/* 13 */            int i11 = 1;
/* 14 */            IOi10loi iOi10loi2 = this.I00l0OO0IO;
                    try {
                        try {
                            try {
                                try {
                                } catch (Throwable th2) {
/* 50 */                            th = th2;
/* 350 */                           I1OoollI1Il1 i1OoollI1Il1 = IIIO11i.I00000oIO;
/* 354 */                           if (!(th instanceof OiIIoOll0Il) || th.I00iOIl == null) {
/* 370 */                               th = new OiIIoOll0Il(null, th, th.getMessage());
                                    }
/* 374 */                           iOi10loi2.I00iIO(th);
                                }
                            } catch (CancellationException e) {
/* 378 */                       iOi10loi2.I00111O(e);
                            }
                            try {
/* 17 */                        if (i8 == 0) {
/* 140 */                           lIoii1l01l0i.I00000oOI(obj);
/* 143 */                           I1I0i0Ilo1Oi i1I0i0Ilo1Oi3 = this.I00l0I0l0lO1;
/* 145 */                           this.I00iOIl = i1I0i0Ilo1Oi3;
/* 147 */                           this.I00iiI = iOi10loi2;
/* 149 */                           i = 0;
/* 150 */                           this.I00ilI0I1 = 0;
/* 152 */                           this.I00ilO0 = 0;
/* 154 */                           this.I00io1l = 0;
/* 156 */                           this.I00ioIO = 1;
/* 158 */                           objI00Io1lO = i1I0i0Ilo1Oi3.I00Io1lO(this);
/* 162 */                           if (objI00Io1lO == ii0111o) {
/* 341 */                               return ii0111o;
                                    }
/* 166 */                           i1I0i0Ilo1Oi = i1I0i0Ilo1Oi3;
/* 167 */                           iOi10loi = iOi10loi2;
/* 168 */                           i2 = 0;
/* 169 */                           i3 = 0;
                                } else if (i8 == 1) {
/* 117 */                           int i12 = this.I00io1l;
/* 119 */                           int i13 = this.I00ilO0;
/* 121 */                           int i14 = this.I00ilI0I1;
/* 125 */                           IOi10loi iOi10loi3 = (IOi10loi) this.I00iiI;
/* 127 */                           I1I0i0Ilo1Oi i1I0i0Ilo1Oi4 = this.I00iOIl;
/* 129 */                           lIoii1l01l0i.I00000oOI(obj);
/* 132 */                           i1I0i0Ilo1Oi = i1I0i0Ilo1Oi4;
/* 133 */                           i3 = i14;
/* 134 */                           i = i12;
/* 135 */                           iOi10loi = iOi10loi3;
/* 136 */                           i2 = i13;
/* 137 */                           objI00Io1lO = obj;
                                } else if (i8 == 2) {
/* 97 */                            i4 = this.I00io1l;
/* 99 */                            i5 = this.I00ilO0;
/* 101 */                           int i15 = this.I00ilI0I1;
/* 106 */                           Ii1olII1lO1 ii1olII1lO12 = (Ii1olII1lO1) this.I00iiI;
/* 108 */                           I1I0i0Ilo1Oi i1I0i0Ilo1Oi5 = this.I00iOIl;
/* 110 */                           lIoii1l01l0i.I00000oOI(obj);
/* 113 */                           objI0000oI00 = obj;
                                    i7 = i15;
                                    r11 = ii1olII1lO12;
                                    r12 = i1I0i0Ilo1Oi5;
/* 284 */                           this.I00iOIl = null;
/* 286 */                           this.I00iiI = null;
/* 288 */                           this.I00iiO = objI0000oI00;
/* 290 */                           this.I00iio = null;
/* 292 */                           this.I00ilI0I1 = i7;
/* 294 */                           this.I00ilO0 = i5;
/* 296 */                           this.I00io1l = i4;
/* 299 */                           this.I00ioIO = 4;
/* 301 */                           Object objI00II0Ol1O0l = r12.I00II0Ol1O0l(r11, null, this);
                                    r8 = i7;
                                    i = r11;
                                    i2 = r12;
                                } else {
/* 23 */                            if (i8 != 3) {
/* 25 */                                if (i8 == 4) {
/* 60 */                                    lIoii1l01l0i.I00000oOI(obj);
/* 966 */                                   return ooiIlOl1iI;
                                        }
/* 27 */                                if (i8 != 5) {
/* 31 */                                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                                    return null;
                                        }
/* 35 */                                th = this.I00iio;
/* 45 */                                lIoii1l01l0i.I00000oOI(obj);
/* 342 */                               throw th;
                                    }
/* 65 */                            i4 = this.I00io1l;
/* 67 */                            i5 = this.I00ilO0;
/* 69 */                            int i16 = this.I00ilI0I1;
/* 78 */                            Ii1olII1lO1 ii1olII1lO13 = (Ii1olII1lO1) this.I00iiO;
/* 82 */                            iOi10loi = (IOi10loi) this.I00iiI;
/* 84 */                            I1I0i0Ilo1Oi i1I0i0Ilo1Oi6 = this.I00iOIl;
/* 86 */                            lIoii1l01l0i.I00000oOI(obj);
/* 89 */                            objI00000oOI = obj;
                                    i6 = i16;
                                    ii1olII1lO1 = ii1olII1lO13;
                                    i1I0i0Ilo1Oi2 = i1I0i0Ilo1Oi6;
/* 276 */                           if (objI00000oOI != null) {
/* 315 */                               throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESession");
                                    }
/* 280 */                           iOi10loi.I00O10llo((IOO01l) objI00000oOI);
/* 283 */                           objI0000oI00 = ooiIlOl1iI;
                                    i7 = i6;
                                    r11 = ii1olII1lO1;
                                    r12 = i1I0i0Ilo1Oi2;
/* 284 */                           this.I00iOIl = null;
/* 286 */                           this.I00iiI = null;
/* 288 */                           this.I00iiO = objI0000oI00;
/* 290 */                           this.I00iio = null;
/* 292 */                           this.I00ilI0I1 = i7;
/* 294 */                           this.I00ilO0 = i5;
/* 296 */                           this.I00io1l = i4;
/* 299 */                           this.I00ioIO = 4;
/* 301 */                           Object objI00II0Ol1O0l2 = r12.I00II0Ol1O0l(r11, null, this);
                                    r8 = i7;
                                    i = r11;
                                    i2 = r12;
                                }
/* 174 */                       if (IiiIOl0OI1iO.I00000oIO) {
/* 182 */                           Ii00ilI1 ii00ilI1I00lli11 = r8.I00000oIO().I00lli11(o0iOli.I00iiO);
/* 188 */                           I00oI0i i00oI0i = new I00oI0i((Ii1olII1lO1) r8, (IOoil1iiIilo) null, iOi10loi);
/* 191 */                           this.I00iOIl = i1I0i0Ilo1Oi;
/* 193 */                           this.I00iiI = r8;
/* 195 */                           this.I00ilI0I1 = i3;
/* 197 */                           this.I00ilO0 = i2;
/* 199 */                           this.I00io1l = i;
/* 201 */                           this.I00ioIO = 2;
/* 203 */                           objI0000oI00 = iOi1II01i0.I0000oI00(ii00ilI1I00lli11, i00oI0i, this);
/* 207 */                           if (objI0000oI00 == ii0111o) {
                                        r8 = r8;
                                        i = i;
                                        i2 = i2;
                                    } else {
/* 211 */                               i4 = i;
/* 212 */                               i5 = i2;
/* 213 */                               r12 = i1I0i0Ilo1Oi;
/* 214 */                               r11 = r8;
/* 215 */                               i7 = i3;
/* 284 */                               this.I00iOIl = null;
/* 286 */                               this.I00iiI = null;
/* 288 */                               this.I00iiO = objI0000oI00;
/* 290 */                               this.I00iio = null;
/* 292 */                               this.I00ilI0I1 = i7;
/* 294 */                               this.I00ilO0 = i5;
/* 296 */                               this.I00io1l = i4;
/* 299 */                               this.I00ioIO = 4;
/* 301 */                               Object objI00II0Ol1O0l22 = r12.I00II0Ol1O0l(r11, null, this);
                                        r8 = i7;
                                        i = r11;
                                        i2 = r12;
                                    }
                                } else {
/* 225 */                           IoIlIolo10o ioIlIolo10oI00iOIl = r8.I00iOIl();
/* 233 */                           O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(IOO01l.class);
                                    try {
/* 237 */                               o0O01O0oI00000oIO = OOoOl0i.I00000oIO(IOO01l.class);
                                    } catch (Throwable unused) {
/* 242 */                               o0O01O0oI00000oIO = null;
                                    }
/* 245 */                           OoOO010 ooOO010 = new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO);
/* 248 */                           this.I00iOIl = i1I0i0Ilo1Oi;
/* 250 */                           this.I00iiI = iOi10loi;
/* 252 */                           this.I00iiO = r8;
/* 254 */                           this.I00iio = null;
/* 256 */                           this.I00ilI0I1 = i3;
/* 258 */                           this.I00ilO0 = i2;
/* 260 */                           this.I00io1l = i;
/* 262 */                           this.I00ioIO = 3;
/* 264 */                           objI00000oOI = ioIlIolo10oI00iOIl.I00000oOI(ooOO010, this);
                                    r8 = r8;
                                    i = i;
                                    i2 = i2;
/* 268 */                           if (objI00000oOI != ii0111o) {
/* 271 */                               i4 = i;
/* 272 */                               i5 = i2;
/* 273 */                               i1I0i0Ilo1Oi2 = i1I0i0Ilo1Oi;
/* 274 */                               ii1olII1lO1 = r8;
/* 275 */                               i6 = i3;
/* 276 */                               if (objI00000oOI != null) {
                                        }
                                    }
                                }
/* 341 */                       return ii0111o;
                            } catch (Throwable th3) {
/* 218 */                       th = th3;
/* 219 */                       i9 = i;
/* 220 */                       i10 = i2;
/* 221 */                       I1I0i0Ilo1Oi i1I0i0Ilo1Oi7 = i1I0i0Ilo1Oi;
/* 222 */                       Ii1olII1lO1 ii1olII1lO14 = r8;
/* 223 */                       i11 = i3;
                                try {
/* 316 */                           throw th;
                                } catch (Throwable th4) {
/* 317 */                           th = th4;
/* 318 */                           this.I00iOIl = null;
/* 320 */                           this.I00iiI = null;
/* 322 */                           this.I00iiO = null;
/* 324 */                           this.I00iio = th;
/* 326 */                           this.I00ilI0I1 = i11;
/* 328 */                           this.I00ilO0 = i10;
/* 330 */                           this.I00io1l = i9;
/* 333 */                           this.I00ioIO = 5;
                                }
                            }
/* 170 */                   r8 = (Ii1olII1lO1) objI00Io1lO;
                        } catch (Throwable th5) {
/* 94 */                    th = th5;
                        }
                    } catch (CancellationException e2) {
/* 347 */               throw ilIiI1O0.I00000oIO(e2);
                    }
                }
            }
