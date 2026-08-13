            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class iOiOOIlI1o01 {
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
                
                    if (r1.I0001Ioi1lo(r7, r13) == r2) goto L58;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Type inference failed for: r3v0, types: [int] */
                /* JADX WARN: Type inference failed for: r3v10, types: [IIOIlI01] */
                /* JADX WARN: Type inference failed for: r3v16 */
                /* JADX WARN: Type inference failed for: r3v2, types: [IIOIlI01] */
                /* JADX WARN: Type inference failed for: r3v4 */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cf -> B:44:0x00d3). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(IIIoloiiI1 iIIoloiiI1, IIOIlI01 iIOIlI01, long j, IOoilo iOoilo) throws Throwable {
                    IIIooOo iIIooOo;
                    IIIoloiiI1 iIIoloiiI12;
                    long j2;
                    long j3;
                    IIIooOo iIIooOo2;
                    IIIoloiiI1 iIIoloiiI13;
                    Object obj;
                    IIIloOl0I1I iIIloOl0I1I;
                    long j4;
                    long j5;
/* 5 */             if (iOoilo instanceof IIIooOo) {
/* 8 */                 iIIooOo = (IIIooOo) iOoilo;
/* 10 */                int i = iIIooOo.I00io1l;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    iIIooOo.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iIIooOo = new IIIooOo(iOoilo);
                        }
                    }
/* 27 */            Object obj2 = iIIooOo.I00ilO0;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            ?? r3 = iIIooOo.I00io1l;
/* 36 */            int i2 = 1;
                    try {
/* 38 */                if (r3 == 0) {
/* 103 */                   lIoii1l01l0i.I00000oOI(obj2);
/* 106 */                   r3 = iIOIlI01;
/* 108 */                   j3 = j;
/* 110 */                   j2 = j3;
/* 111 */                   iIIooOo2 = iIIooOo;
/* 112 */                   iIIoloiiI13 = iIIoloiiI1;
/* 118 */                   if (iIIoloiiI13.I000O01llI0()) {
                            }
/* 217 */                   iIIooOo2.I00iOIl = null;
/* 219 */                   iIIooOo2.I00iiI = null;
/* 221 */                   iIIooOo2.I00iio = j2;
/* 223 */                   iIIooOo2.I00ilI0I1 = j3;
/* 225 */                   iIIooOo2.I00io1l = 3;
/* 233 */                   if (((IIIloOl0I1I) r3).I00000oOI(iIIooOo2) != ii0111o) {
                            }
/* 273 */                   return ii0111o;
                        }
/* 40 */                if (r3 == 1) {
/* 91 */                    j3 = iIIooOo.I00ilI0I1;
/* 93 */                    j2 = iIIooOo.I00iio;
/* 95 */                    Object obj3 = iIIooOo.I00iiI;
/* 97 */                    iIIoloiiI12 = iIIooOo.I00iOIl;
/* 99 */                    lIoii1l01l0i.I00000oOI(obj2);
                            obj = obj3;
/* 172 */                   long jMin = Math.min(j3, iIIoloiiI12.I000II().I00iiO);
/* 181 */                   iIIloOl0I1I = (IIIloOl0I1I) obj;
/* 187 */                   iIIoloiiI12.I000II().I000II(iIIloOl0I1I.I000OiO(), jMin);
/* 190 */                   j3 -= jMin;
/* 191 */                   iIIooOo.I00iOIl = iIIoloiiI12;
/* 193 */                   iIIooOo.I00iiI = iIIloOl0I1I;
/* 195 */                   iIIooOo.I00iio = j2;
/* 197 */                   iIIooOo.I00ilI0I1 = j3;
/* 199 */                   iIIooOo.I00io1l = 2;
/* 205 */                   if (iIIloOl0I1I.I00000oOI(iIIooOo) != ii0111o) {
                            }
/* 273 */                   return ii0111o;
                        }
/* 42 */                if (r3 != 2) {
/* 44 */                    if (r3 == 3) {
/* 61 */                        j4 = iIIooOo.I00ilI0I1;
/* 63 */                        j5 = iIIooOo.I00iio;
/* 65 */                        lIoii1l01l0i.I00000oOI(obj2);
/* 241 */                       return new Long(j5 - j4);
                            }
/* 46 */                    if (r3 != 4) {
/* 50 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                        return null;
                            }
/* 54 */                    Throwable th = iIIooOo.I00iiO;
/* 56 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 483 */                   throw th;
                        }
/* 70 */                j3 = iIIooOo.I00ilI0I1;
/* 72 */                j2 = iIIooOo.I00iio;
/* 74 */                Object obj4 = iIIooOo.I00iiI;
/* 76 */                IIIoloiiI1 iIIoloiiI14 = iIIooOo.I00iOIl;
/* 78 */                lIoii1l01l0i.I00000oOI(obj2);
/* 83 */                iIIooOo2 = iIIooOo;
/* 84 */                iIIoloiiI13 = iIIoloiiI14;
                        Object obj5 = obj4;
/* 212 */               i2 = 1;
                        r3 = obj5;
                        try {
/* 118 */                   if (!iIIoloiiI13.I000O01llI0() || j3 <= 0) {
/* 217 */                       iIIooOo2.I00iOIl = null;
/* 219 */                       iIIooOo2.I00iiI = null;
/* 221 */                       iIIooOo2.I00iio = j2;
/* 223 */                       iIIooOo2.I00ilI0I1 = j3;
/* 225 */                       iIIooOo2.I00io1l = 3;
/* 233 */                       if (((IIIloOl0I1I) r3).I00000oOI(iIIooOo2) != ii0111o) {
/* 236 */                           j4 = j3;
/* 237 */                           j5 = j2;
/* 241 */                           return new Long(j5 - j4);
                                }
                            } else {
                                try {
/* 134 */                           if (iIIoloiiI13.I000II().I00II0Ol1O0l()) {
/* 136 */                               iIIooOo2.I00iOIl = iIIoloiiI13;
/* 138 */                               iIIooOo2.I00iiI = r3;
/* 140 */                               iIIooOo2.I00iio = j2;
/* 142 */                               iIIooOo2.I00ilI0I1 = j3;
/* 144 */                               iIIooOo2.I00io1l = i2;
                                    }
/* 161 */                           IIIooOo iIIooOo3 = iIIooOo2;
/* 163 */                           iIIoloiiI12 = iIIoloiiI13;
/* 164 */                           iIIooOo = iIIooOo3;
                                    obj = r3;
/* 187 */                           iIIoloiiI12.I000II().I000II(iIIloOl0I1I.I000OiO(), jMin);
/* 190 */                           j3 -= jMin;
/* 191 */                           iIIooOo.I00iOIl = iIIoloiiI12;
/* 193 */                           iIIooOo.I00iiI = iIIloOl0I1I;
/* 195 */                           iIIooOo.I00iio = j2;
/* 197 */                           iIIooOo.I00ilI0I1 = j3;
/* 199 */                           iIIooOo.I00io1l = 2;
/* 205 */                           if (iIIloOl0I1I.I00000oOI(iIIooOo) != ii0111o) {
/* 208 */                               IIIoloiiI1 iIIoloiiI15 = iIIoloiiI12;
/* 209 */                               iIIooOo2 = iIIooOo;
/* 210 */                               iIIoloiiI13 = iIIoloiiI15;
/* 211 */                               obj5 = iIIloOl0I1I;
/* 212 */                               i2 = 1;
                                        r3 = obj5;
/* 118 */                               if (iIIoloiiI13.I000O01llI0()) {
                                        }
/* 217 */                               iIIooOo2.I00iOIl = null;
/* 219 */                               iIIooOo2.I00iiI = null;
/* 221 */                               iIIooOo2.I00iio = j2;
/* 223 */                               iIIooOo2.I00ilI0I1 = j3;
/* 225 */                               iIIooOo2.I00io1l = 3;
/* 233 */                               if (((IIIloOl0I1I) r3).I00000oOI(iIIooOo2) != ii0111o) {
                                        }
                                    }
                                } catch (Throwable th2) {
/* 214 */                           th = th2;
/* 215 */                           r3 = iIIloOl0I1I;
                                    try {
/* 245 */                               iIIoloiiI12.I0000O(th);
/* 248 */                               IIOIli1iili.I00000oIO(r3, th);
/* 251 */                               throw th;
                                    } catch (Throwable th3) {
/* 253 */                               iIIooOo.I00iOIl = null;
/* 255 */                               iIIooOo.I00iiI = null;
/* 257 */                               iIIooOo.I00iiO = th3;
/* 259 */                               iIIooOo.I00iio = j2;
/* 261 */                               iIIooOo.I00ilI0I1 = j3;
/* 263 */                               iIIooOo.I00io1l = 4;
/* 271 */                               if (((IIIloOl0I1I) r3).I00000oOI(iIIooOo) != ii0111o) {
/* 483 */                                   throw th3;
                                        }
                                    }
                                }
/* 172 */                       long jMin2 = Math.min(j3, iIIoloiiI12.I000II().I00iiO);
/* 181 */                       iIIloOl0I1I = (IIIloOl0I1I) obj;
                            }
/* 273 */                   return ii0111o;
                        } catch (Throwable th4) {
/* 154 */                   th = th4;
/* 155 */                   IIIooOo iIIooOo4 = iIIooOo2;
/* 157 */                   iIIoloiiI12 = iIIoloiiI13;
/* 158 */                   iIIooOo = iIIooOo4;
/* 245 */                   iIIoloiiI12.I0000O(th);
/* 248 */                   IIOIli1iili.I00000oIO(r3, th);
/* 251 */                   throw th;
                        }
                    } catch (Throwable th5) {
/* 88 */                th = th5;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:26:0x0065). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:25:0x0062). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(IIIoloiiI1 iIIoloiiI1, long j, IOoilo iOoilo) throws Throwable {
                    IIIoooIo01O iIIoooIo01O;
                    long j2;
/* 3 */             if (iOoilo instanceof IIIoooIo01O) {
/* 6 */                 iIIoooIo01O = (IIIoooIo01O) iOoilo;
/* 8 */                 int i = iIIoooIo01O.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIIoooIo01O.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIIoooIo01O = new IIIoooIo01O(iOoilo);
                        }
                    }
/* 25 */            Object obj = iIIoooIo01O.I00iio;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIIoooIo01O.I00ilI0I1;
/* 32 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                j2 = j;
/* 61 */                if (j > 0) {
                        }
/* 124 */               return new Long(j2 - j);
                    }
/* 34 */            if (i2 != 1) {
/* 48 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                return null;
                    }
/* 36 */            long j3 = iIIoooIo01O.I00iiO;
/* 38 */            j2 = iIIoooIo01O.I00iiI;
/* 40 */            IIIoloiiI1 iIIoloiiI12 = iIIoooIo01O.I00iOIl;
/* 42 */            lIoii1l01l0i.I00000oOI(obj);
/* 99 */            long j4 = j3;
/* 100 */           iIIoloiiI1 = iIIoloiiI12;
/* 101 */           j = j4;
/* 108 */           long jMin = Math.min(j, iIIoloiiI1.I000II().I00iiO);
/* 116 */           iOiOl1OIi11l.I00000oIO(iIIoloiiI1.I000II(), jMin);
/* 119 */           j -= jMin;
/* 61 */            if (j > 0 || iIIoloiiI1.I000O01llI0()) {
/* 124 */               return new Long(j2 - j);
                    }
/* 69 */            III1oo00i1li iII1oo00i1liI000II = iIIoloiiI1.I000II();
/* 73 */            iII1oo00i1liI000II.getClass();
/* 79 */            if (((int) iII1oo00i1liI000II.I00iiO) == 0) {
/* 81 */                iIIoooIo01O.I00iOIl = iIIoloiiI1;
/* 83 */                iIIoooIo01O.I00iiI = j2;
/* 85 */                iIIoooIo01O.I00iiO = j;
/* 87 */                iIIoooIo01O.I00ilI0I1 = 1;
/* 93 */                if (iIIoloiiI1.I0001Ioi1lo(1, iIIoooIo01O) == ii0111o) {
/* 95 */                    return ii0111o;
                        }
/* 97 */                iIIoloiiI12 = iIIoloiiI1;
/* 98 */                j3 = j;
/* 99 */                long j42 = j3;
/* 100 */               iIIoloiiI1 = iIIoloiiI12;
/* 101 */               j = j42;
                    }
/* 108 */           long jMin2 = Math.min(j, iIIoloiiI1.I000II().I00iiO);
/* 116 */           iOiOl1OIi11l.I00000oIO(iIIoloiiI1.I000II(), jMin2);
/* 119 */           j -= jMin2;
/* 61 */            if (j > 0) {
                    }
/* 124 */           return new Long(j2 - j);
                }

                /* JADX WARN: Code restructure failed: missing block: B:253:0x035b, code lost:
                
                    r11 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0129, code lost:
                
                    if (r32.I0001Ioi1lo(1, r2) == r3) goto L201;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:122:0x02c5 A[Catch: all -> 0x02df, TRY_LEAVE, TryCatch #12 {all -> 0x02df, blocks: (B:120:0x02bd, B:122:0x02c5, B:131:0x02e5), top: B:251:0x02bd }] */
                /* JADX WARN: Removed duplicated region for block: B:130:0x02e1  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x034f  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x036b  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x038c A[Catch: all -> 0x004e, TryCatch #11 {all -> 0x004e, blocks: (B:16:0x0044, B:212:0x0485, B:213:0x049b, B:179:0x03e2, B:183:0x03f3, B:184:0x040d, B:160:0x0386, B:162:0x038c, B:164:0x0392, B:169:0x03a9, B:174:0x03ba, B:176:0x03c4, B:214:0x049c, B:215:0x04a3, B:218:0x04aa, B:223:0x04bf, B:224:0x04d3, B:225:0x04d4, B:226:0x04fd), top: B:250:0x0030 }] */
                /* JADX WARN: Removed duplicated region for block: B:171:0x03af  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x03ea  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x03f3 A[Catch: all -> 0x004e, TryCatch #11 {all -> 0x004e, blocks: (B:16:0x0044, B:212:0x0485, B:213:0x049b, B:179:0x03e2, B:183:0x03f3, B:184:0x040d, B:160:0x0386, B:162:0x038c, B:164:0x0392, B:169:0x03a9, B:174:0x03ba, B:176:0x03c4, B:214:0x049c, B:215:0x04a3, B:218:0x04aa, B:223:0x04bf, B:224:0x04d3, B:225:0x04d4, B:226:0x04fd), top: B:250:0x0030 }] */
                /* JADX WARN: Removed duplicated region for block: B:188:0x0420 A[Catch: all -> 0x0440, TRY_LEAVE, TryCatch #1 {all -> 0x0440, blocks: (B:186:0x0412, B:188:0x0420, B:199:0x0447), top: B:233:0x0412 }] */
                /* JADX WARN: Removed duplicated region for block: B:196:0x0442  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x046a A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #6 {all -> 0x01e6, blocks: (B:203:0x0462, B:205:0x046a, B:78:0x01c9, B:91:0x01fd, B:98:0x021b, B:105:0x023e, B:110:0x0258, B:116:0x0283, B:135:0x02ff), top: B:242:0x0258 }] */
                /* JADX WARN: Removed duplicated region for block: B:225:0x04d4 A[Catch: all -> 0x004e, TryCatch #11 {all -> 0x004e, blocks: (B:16:0x0044, B:212:0x0485, B:213:0x049b, B:179:0x03e2, B:183:0x03f3, B:184:0x040d, B:160:0x0386, B:162:0x038c, B:164:0x0392, B:169:0x03a9, B:174:0x03ba, B:176:0x03c4, B:214:0x049c, B:215:0x04a3, B:218:0x04aa, B:223:0x04bf, B:224:0x04d3, B:225:0x04d4, B:226:0x04fd), top: B:250:0x0030 }] */
                /* JADX WARN: Removed duplicated region for block: B:229:0x0502  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0163 A[Catch: all -> 0x0373, TryCatch #5 {all -> 0x0373, blocks: (B:51:0x015d, B:53:0x0163, B:55:0x0169), top: B:240:0x015d }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Type inference failed for: r2v12 */
                /* JADX WARN: Type inference failed for: r2v2, types: [IIO00oO, IOoilo] */
                /* JADX WARN: Type inference failed for: r2v20 */
                /* JADX WARN: Type inference failed for: r2v24 */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Appendable] */
                /* JADX WARN: Type inference failed for: r2v34 */
                /* JADX WARN: Type inference failed for: r2v35 */
                /* JADX WARN: Type inference failed for: r2v37 */
                /* JADX WARN: Type inference failed for: r2v43 */
                /* JADX WARN: Type inference failed for: r2v44 */
                /* JADX WARN: Type inference failed for: r2v5 */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8 */
                /* JADX WARN: Type inference failed for: r32v0, types: [IIIoloiiI1] */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v1, types: [OOo0ooi] */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v12 */
                /* JADX WARN: Type inference failed for: r5v14 */
                /* JADX WARN: Type inference failed for: r5v15, types: [OOo0ooi] */
                /* JADX WARN: Type inference failed for: r5v16 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v26 */
                /* JADX WARN: Type inference failed for: r5v30 */
                /* JADX WARN: Type inference failed for: r5v38 */
                /* JADX WARN: Type inference failed for: r5v40 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0346 -> B:236:0x0347). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(IIIoloiiI1 iIIoloiiI1, Appendable appendable, long j, boolean z, boolean z2, IOoilo iOoilo) throws Throwable {
                    ?? iIO00oO;
                    Object obj;
                    long j2;
                    OlI1iil1l0 olI1iil1l0I000II;
                    Appendable appendable2;
                    long j3;
                    boolean z3;
                    boolean z4;
                    IIIoloiiI1 iIIoloiiI12;
                    boolean z5;
                    OOo0o0oO oOo0o0oO;
                    OOo0ooi oOo0ooi;
                    boolean z6;
                    Appendable appendable3;
                    long j4;
                    IIO00oO iIO00oO2;
                    OlI1iil1l0 olI1iil1l0;
                    OOo0ooi oOo0ooi2;
                    long j5;
                    long j6;
                    long j7;
                    long j8;
                    String str;
                    long j9;
                    long j10;
                    long j11;
                    Object obj2;
                    long jMin;
                    IIO00oO iIO00oO3;
                    Appendable appendable4;
                    OlI1iil1l0 olI1iil1l02;
                    boolean z7;
                    long j12;
                    OOo0o0oO oOo0o0oO2;
                    String str2;
                    OOo0ooi oOo0ooi3;
                    boolean z8;
                    Appendable appendable5;
                    OOo0o0oO oOo0o0oO3;
                    boolean z9;
                    IIIoloiiI1 iIIoloiiI13;
                    OlI1iil1l0 olI1iil1l03;
                    long j13;
                    OOo0o0oO oOo0o0oO4;
                    OOo0ooi oOo0ooi4;
                    Appendable appendable6;
                    String str3;
                    long jMin2;
                    long jI00000oIO;
                    long j14;
                    long j15;
                    String str4;
                    IIO00oO iIO00oO4;
                    Appendable appendable7;
                    OOo0o0oO oOo0o0oO5;
                    byte bI00000oIO;
                    Object objI0001Ioi1lo;
                    OOo0ooi oOo0ooi5;
/* 7 */             if (iOoilo instanceof IIO00oO) {
/* 10 */                IIO00oO iIO00oO5 = (IIO00oO) iOoilo;
/* 12 */                int i = iIO00oO5.I00lll10;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    iIO00oO5.I00lll10 = i - Integer.MIN_VALUE;
                            iIO00oO = iIO00oO5;
                        } else {
/* 26 */                    iIO00oO = new IIO00oO(iOoilo);
                        }
                    }
/* 29 */            Object objI0001Ioi1lo2 = iIO00oO.I00lli11;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = iIO00oO.I00lll10;
/* 35 */            ?? r5 = "Unexpected end of stream after reading ";
                    try {
                    } catch (Throwable th) {
/* 79 */                th = th;
                    }
/* 49 */            if (i2 == 0) {
/* 256 */               j2 = 1;
/* 258 */               lIoii1l01l0i.I00000oOI(objI0001Ioi1lo2);
/* 261 */               olI1iil1l0I000II = iIIoloiiI1.I000II();
/* 269 */               if (olI1iil1l0I000II.I00II0Ol1O0l()) {
/* 271 */                   iIO00oO.I00iOIl = iIIoloiiI1;
/* 273 */                   appendable2 = appendable;
/* 275 */                   iIO00oO.I00iiI = appendable2;
/* 277 */                   iIO00oO.I00iiO = olI1iil1l0I000II;
/* 279 */                   j3 = j;
/* 281 */                   iIO00oO.I00ilO0 = j3;
/* 283 */                   z3 = z;
/* 285 */                   iIO00oO.I00li1OI = z3;
/* 287 */                   z4 = z2;
/* 289 */                   iIO00oO.I00ll1 = z4;
/* 292 */                   iIO00oO.I00lll10 = 1;
                        } else {
/* 302 */                   appendable2 = appendable;
/* 304 */                   j3 = j;
/* 306 */                   z3 = z;
/* 308 */                   z4 = z2;
                        }
/* 310 */               boolean z10 = z4;
/* 312 */               iIIoloiiI12 = iIIoloiiI1;
/* 313 */               z5 = z10;
                    } else if (i2 == 1) {
/* 232 */               j2 = 1;
/* 234 */               z5 = iIO00oO.I00ll1;
/* 236 */               boolean z11 = iIO00oO.I00li1OI;
/* 238 */               j3 = iIO00oO.I00ilO0;
/* 240 */               olI1iil1l0I000II = iIO00oO.I00iiO;
/* 242 */               Appendable appendable8 = iIO00oO.I00iiI;
/* 244 */               iIIoloiiI12 = iIO00oO.I00iOIl;
/* 246 */               lIoii1l01l0i.I00000oOI(objI0001Ioi1lo2);
/* 251 */               z3 = z11;
/* 252 */               appendable2 = appendable8;
                    } else {
/* 53 */                if (i2 != 2) {
/* 55 */                    if (i2 == 3) {
/* 119 */                       boolean z12 = iIO00oO.I00ll1;
/* 121 */                       boolean z13 = iIO00oO.I00li1OI;
/* 123 */                       long j16 = iIO00oO.I00ilO0;
/* 125 */                       OOo0ooi oOo0ooi6 = iIO00oO.I00ilI0I1;
/* 127 */                       OOo0o0oO oOo0o0oO6 = iIO00oO.I00iio;
/* 131 */                       OlI1iil1l0 olI1iil1l04 = iIO00oO.I00iiO;
/* 133 */                       Appendable appendable9 = iIO00oO.I00iiI;
/* 135 */                       IIIoloiiI1 iIIoloiiI14 = iIO00oO.I00iOIl;
                                try {
/* 137 */                           lIoii1l01l0i.I00000oOI(objI0001Ioi1lo2);
/* 35 */                            str = "Unexpected end of stream after reading ";
/* 143 */                           IIO00oO iIO00oO6 = iIO00oO;
/* 145 */                           z6 = z12;
/* 148 */                           Object objI0001Ioi1lo3 = objI0001Ioi1lo2;
/* 149 */                           j4 = j16;
/* 150 */                           iIIoloiiI12 = iIIoloiiI14;
/* 151 */                           oOo0o0oO = oOo0o0oO6;
/* 153 */                           oOo0ooi = oOo0ooi6;
/* 154 */                           z3 = z13;
/* 155 */                           appendable3 = appendable9;
/* 156 */                           olI1iil1l0 = olI1iil1l04;
/* 157 */                           iIO00oO2 = iIO00oO6;
                                    try {
                                        try {
/* 846 */                                   if (!((Boolean) objI0001Ioi1lo3).booleanValue()) {
/* 848 */                                       olI1iil1l03 = olI1iil1l0;
/* 849 */                                       oOo0o0oO3 = oOo0o0oO;
/* 850 */                                       oOo0ooi3 = oOo0ooi;
/* 851 */                                       long j17 = j4;
/* 853 */                                       z8 = z6;
/* 854 */                                       appendable5 = appendable3;
/* 855 */                                       z9 = z3;
/* 856 */                                       iIIoloiiI13 = iIIoloiiI12;
/* 857 */                                       j13 = j17;
/* 907 */                                       if (oOo0o0oO3.I00iOIl != 0 && iIIoloiiI13.I000O01llI0()) {
/* 919 */                                           Long l = new Long(-1L);
/* 922 */                                           Object obj3 = oOo0ooi3.I00iOIl;
/* 924 */                                           if (obj3 != null) {
/* 926 */                                               III1oo00i1li iII1oo00i1li = (III1oo00i1li) obj3;
/* 934 */                                               appendable5.append(li0oio00o1o.I00000oIO(iII1oo00i1li, iII1oo00i1li.I00iiO));
                                                    }
/* 937 */                                           return l;
                                                }
/* 938 */                                       j15 = oOo0o0oO3.I00iOIl;
/* 942 */                                       if (j15 <= j13) {
/* 1278 */                                          throw new IllegalStateException(("Consumed bytes exceed the limit: " + oOo0o0oO3.I00iOIl + " > " + j13 + ". It's an implementation bug, please report it.").toString());
                                                }
/* 944 */                                       if (j15 != j13) {
/* 1191 */                                          String str5 = str;
/* 1193 */                                          if (z8) {
/* 1236 */                                              throw new EOFException(str5 + j15 + " bytes");
                                                    }
/* 1197 */                                          Long l2 = new Long(j15);
/* 1200 */                                          Object obj4 = oOo0ooi3.I00iOIl;
/* 1202 */                                          if (obj4 != null) {
/* 1204 */                                              III1oo00i1li iII1oo00i1li2 = (III1oo00i1li) obj4;
/* 1212 */                                              appendable5.append(li0oio00o1o.I00000oIO(iII1oo00i1li2, iII1oo00i1li2.I00iiO));
                                                    }
/* 1215 */                                          return l2;
                                                }
/* 953 */                                       if (j13 == Long.MAX_VALUE) {
/* 1188 */                                          throw new Oo1O0iO1O("Max line length exceeded");
                                                }
/* 963 */                                       if (olI1iil1l03.I0000oI00().I00iiO == 0) {
/* 965 */                                           iIO00oO2.I00iOIl = iIIoloiiI13;
/* 967 */                                           iIO00oO2.I00iiI = appendable5;
/* 969 */                                           iIO00oO2.I00iiO = olI1iil1l03;
/* 971 */                                           iIO00oO2.I00iio = oOo0o0oO3;
/* 973 */                                           iIO00oO2.I00ilI0I1 = oOo0ooi3;
/* 975 */                                           iIO00oO2.I00ilO0 = j13;
/* 977 */                                           iIO00oO2.I00li1OI = z9;
/* 979 */                                           iIO00oO2.I00ll1 = z8;
/* 982 */                                           iIO00oO2.I00lll10 = 4;
/* 984 */                                           IIIolloil iIIolloil = IIIoloiiI1.I00000oIO;
/* 987 */                                           objI0001Ioi1lo2 = iIIoloiiI13.I0001Ioi1lo(1, iIO00oO2);
/* 991 */                                           if (objI0001Ioi1lo2 == ii0111o) {
/* 1121 */                                              return ii0111o;
                                                    }
/* 1001 */                                          if (((Boolean) objI0001Ioi1lo2).booleanValue()) {
                                                    }
                                                } else {
/* 37 */                                            str4 = " bytes";
/* 1041 */                                          iIO00oO4 = iIO00oO2;
/* 1006 */                                          OOo0ooi oOo0ooi7 = oOo0ooi3;
/* 1007 */                                          boolean z14 = z9;
/* 1008 */                                          appendable7 = appendable5;
/* 1009 */                                          boolean z15 = z8;
/* 1010 */                                          oOo0o0oO5 = oOo0o0oO3;
/* 1049 */                                          bI00000oIO = olI1iil1l03.I0000oI00().I00000oIO(0L);
/* 1055 */                                          if (bI00000oIO != 10) {
                                                    }
                                                }
                                            }
/* 354 */                                   if (oOo0o0oO.I00iOIl < j4 || iIIoloiiI12.I000O01llI0()) {
/* 888 */                                       long j18 = j4;
/* 890 */                                       str = str2;
/* 894 */                                       oOo0ooi3 = oOo0ooi;
/* 895 */                                       z8 = z6;
/* 896 */                                       appendable5 = appendable3;
/* 897 */                                       oOo0o0oO3 = oOo0o0oO;
/* 898 */                                       z9 = z3;
/* 899 */                                       iIIoloiiI13 = iIIoloiiI12;
/* 900 */                                       olI1iil1l03 = olI1iil1l0;
/* 901 */                                       j13 = j18;
/* 907 */                                       if (oOo0o0oO3.I00iOIl != 0) {
                                                }
/* 938 */                                       j15 = oOo0o0oO3.I00iOIl;
/* 942 */                                       if (j15 <= j13) {
                                                }
                                            } else {
                                                try {
/* 373 */                                           long jI00000oIO2 = lOO1Ill.I00000oIO(olI1iil1l0, (byte) 10, j9, 2);
/* 377 */                                           if (z3) {
/* 390 */                                               if (jI00000oIO2 == -1) {
                                                            try {
/* 396 */                                                       appendable6 = appendable3;
/* 398 */                                                       str3 = str2;
/* 403 */                                                       jMin2 = Math.min(j9, olI1iil1l0.I0000oI00().I00iiO - j2);
                                                            } catch (Throwable th2) {
/* 413 */                                                       th = th2;
/* 880 */                                                       r5 = oOo0ooi4;
/* 484 */                                                       iIO00oO = appendable3;
/* 1279 */                                                      obj = r5.I00iOIl;
/* 1281 */                                                      if (obj != null) {
                                                                }
/* 1294 */                                                      throw th;
                                                            }
                                                        } else {
/* 418 */                                                   appendable6 = appendable3;
/* 420 */                                                   str3 = str2;
/* 423 */                                                   if (jI00000oIO2 == 0) {
/* 425 */                                                       str = str3;
/* 427 */                                                       jMin2 = 0;
/* 433 */                                                       jI00000oIO = lOO1Ill.I00000oIO(olI1iil1l0, (byte) 13, jMin2, 2);
                                                            } else {
/* 430 */                                                       jMin2 = jI00000oIO2 - j2;
                                                            }
                                                        }
/* 407 */                                               str = str3;
/* 433 */                                               jI00000oIO = lOO1Ill.I00000oIO(olI1iil1l0, (byte) 13, jMin2, 2);
                                                    } else {
/* 379 */                                               appendable6 = appendable3;
/* 381 */                                               str = str2;
/* 383 */                                               jI00000oIO = -1;
                                                    }
/* 439 */                                           if (jI00000oIO >= 0) {
/* 443 */                                               OlI1iil1l0 olI1iil1l05 = olI1iil1l0;
/* 445 */                                               I0000O(oOo0ooi4, appendable6, olI1iil1l05, oOo0o0oO4, jI00000oIO);
/* 450 */                                               Appendable appendable10 = appendable6;
/* 458 */                                               iOiOl1OIi11l.I00000oIO(olI1iil1l05, j2);
/* 465 */                                               Long l3 = new Long(oOo0o0oO4.I00iOIl);
/* 468 */                                               Object obj5 = oOo0ooi4.I00iOIl;
/* 470 */                                               if (obj5 != null) {
/* 472 */                                                   III1oo00i1li iII1oo00i1li3 = (III1oo00i1li) obj5;
/* 480 */                                                   appendable10.append(li0oio00o1o.I00000oIO(iII1oo00i1li3, iII1oo00i1li3.I00iiO));
                                                        }
/* 483 */                                               return l3;
                                                    }
/* 495 */                                           long j19 = jI00000oIO;
/* 497 */                                           OlI1iil1l0 olI1iil1l06 = olI1iil1l0;
/* 498 */                                           r5 = oOo0ooi4;
/* 500 */                                           appendable3 = appendable6;
/* 506 */                                           if (jI00000oIO2 == 0) {
/* 510 */                                               iOiOl1OIi11l.I00000oIO(olI1iil1l06, 1L);
/* 517 */                                               Long l4 = new Long(oOo0o0oO4.I00iOIl);
/* 520 */                                               Object obj6 = r5.I00iOIl;
/* 522 */                                               if (obj6 != null) {
/* 524 */                                                   III1oo00i1li iII1oo00i1li4 = (III1oo00i1li) obj6;
/* 532 */                                                   appendable3.append(li0oio00o1o.I00000oIO(iII1oo00i1li4, iII1oo00i1li4.I00iiO));
                                                        }
/* 535 */                                               return l4;
                                                    }
/* 536 */                                           j7 = jI00000oIO2;
/* 538 */                                           if (jI00000oIO2 > 0) {
/* 554 */                                               long j20 = olI1iil1l06.I0000oI00().I00000oIO(j7 - 1) == 13 ? 1L : 0L;
/* 570 */                                               I0000O(r5, appendable3, olI1iil1l06, oOo0o0oO4, j7 - j20);
/* 575 */                                               iOiOl1OIi11l.I00000oIO(olI1iil1l06, j20 + 1);
/* 582 */                                               Long l5 = new Long(oOo0o0oO4.I00iOIl);
/* 585 */                                               Object obj7 = r5.I00iOIl;
/* 587 */                                               if (obj7 != null) {
/* 589 */                                                   III1oo00i1li iII1oo00i1li5 = (III1oo00i1li) obj7;
/* 597 */                                                   appendable3.append(li0oio00o1o.I00000oIO(iII1oo00i1li5, iII1oo00i1li5.I00iiO));
                                                        }
/* 600 */                                               return l5;
                                                    }
                                                    try {
                                                        try {
/* 607 */                                                   jMin = Math.min(j9, olI1iil1l06.I0000oI00().I00iiO);
/* 631 */                                                   if (olI1iil1l06.I0000oI00().I00000oIO(j14) == 13) {
/* 637 */                                                       I0000O(r5, appendable3, olI1iil1l06, oOo0o0oO4, j14);
/* 644 */                                                       iIO00oO2.I00iOIl = iIIoloiiI12;
/* 646 */                                                       iIO00oO2.I00iiI = appendable3;
/* 648 */                                                       iIO00oO2.I00iiO = olI1iil1l06;
/* 650 */                                                       iIO00oO2.I00iio = oOo0o0oO4;
/* 652 */                                                       iIO00oO2.I00ilI0I1 = r5;
/* 654 */                                                       iIO00oO2.I00ilO0 = j4;
/* 656 */                                                       iIO00oO2.I00li1OI = z3;
/* 658 */                                                       iIO00oO2.I00ll1 = z6;
/* 660 */                                                       iIO00oO2.I00io1l = j9;
/* 662 */                                                       long j21 = j4;
/* 666 */                                                       iIO00oO2.I00ioIO = j7;
/* 668 */                                                       j7 = j7;
/* 672 */                                                       iIO00oO2.I00l0I0l0lO1 = j19;
/* 674 */                                                       iIO00oO2.I00l0OO0IO = jMin;
/* 677 */                                                       iIO00oO2.I00lll10 = 2;
/* 679 */                                                       Object objI0001Ioi1lo4 = I0001Ioi1lo(olI1iil1l06, iIIoloiiI12, z3, iIO00oO2);
/* 683 */                                                       if (objI0001Ioi1lo4 != ii0111o) {
/* 689 */                                                           oOo0ooi2 = r5;
/* 690 */                                                           olI1iil1l02 = olI1iil1l06;
/* 691 */                                                           obj2 = objI0001Ioi1lo4;
/* 693 */                                                           j10 = j9;
/* 695 */                                                           j11 = j19;
/* 696 */                                                           oOo0o0oO2 = oOo0o0oO4;
/* 697 */                                                           iIO00oO3 = iIO00oO2;
/* 698 */                                                           appendable4 = appendable3;
/* 699 */                                                           z7 = z6;
/* 700 */                                                           j12 = j21;
                                                                    try {
/* 708 */                                                               if (!((Boolean) obj2).booleanValue()) {
/* 714 */                                                                   Long l6 = new Long(oOo0o0oO2.I00iOIl);
/* 717 */                                                                   Object obj8 = oOo0ooi2.I00iOIl;
/* 719 */                                                                   if (obj8 != null) {
/* 721 */                                                                       III1oo00i1li iII1oo00i1li6 = (III1oo00i1li) obj8;
/* 729 */                                                                       appendable4.append(li0oio00o1o.I00000oIO(iII1oo00i1li6, iII1oo00i1li6.I00iiO));
                                                                            }
/* 732 */                                                                   return l6;
                                                                        }
                                                                        try {
/* 738 */                                                                   j5 = j12;
/* 742 */                                                                   I0000oI00(oOo0ooi2, olI1iil1l02, oOo0o0oO2, 1L);
/* 745 */                                                                   long j22 = j10;
/* 747 */                                                                   j8 = j11;
/* 749 */                                                                   j9 = j22;
/* 750 */                                                                   z6 = z7;
/* 751 */                                                                   appendable3 = appendable4;
/* 752 */                                                                   iIO00oO2 = iIO00oO3;
/* 753 */                                                                   j6 = jMin;
/* 755 */                                                                   oOo0o0oO = oOo0o0oO2;
/* 756 */                                                                   olI1iil1l0 = olI1iil1l02;
/* 783 */                                                                   if (oOo0o0oO.I00iOIl < j4 || olI1iil1l0.I0000oI00().I00iiO != 0) {
/* 877 */                                                                       oOo0ooi = oOo0ooi2;
/* 860 */                                                                       str2 = str;
/* 862 */                                                                       j2 = 1;
/* 354 */                                                                       if (oOo0o0oO.I00iOIl < j4) {
                                                                                }
/* 888 */                                                                       long j182 = j4;
/* 890 */                                                                       str = str2;
/* 894 */                                                                       oOo0ooi3 = oOo0ooi;
/* 895 */                                                                       z8 = z6;
/* 896 */                                                                       appendable5 = appendable3;
/* 897 */                                                                       oOo0o0oO3 = oOo0o0oO;
/* 898 */                                                                       z9 = z3;
/* 899 */                                                                       iIIoloiiI13 = iIIoloiiI12;
/* 900 */                                                                       olI1iil1l03 = olI1iil1l0;
/* 901 */                                                                       j13 = j182;
/* 907 */                                                                       if (oOo0o0oO3.I00iOIl != 0) {
                                                                                }
/* 938 */                                                                       j15 = oOo0o0oO3.I00iOIl;
/* 942 */                                                                       if (j15 <= j13) {
                                                                                }
                                                                            } else {
/* 795 */                                                                       iIO00oO2.I00iOIl = iIIoloiiI12;
/* 797 */                                                                       iIO00oO2.I00iiI = appendable3;
/* 799 */                                                                       iIO00oO2.I00iiO = olI1iil1l0;
/* 801 */                                                                       iIO00oO2.I00iio = oOo0o0oO;
/* 803 */                                                                       iIO00oO2.I00ilI0I1 = oOo0ooi2;
/* 805 */                                                                       iIO00oO2.I00ilO0 = j4;
/* 807 */                                                                       iIO00oO2.I00li1OI = z3;
/* 809 */                                                                       iIO00oO2.I00ll1 = z6;
/* 811 */                                                                       iIO00oO2.I00io1l = j9;
/* 815 */                                                                       iIO00oO2.I00ioIO = j7;
/* 819 */                                                                       iIO00oO2.I00l0I0l0lO1 = j8;
/* 823 */                                                                       iIO00oO2.I00l0OO0IO = j6;
/* 826 */                                                                       iIO00oO2.I00lll10 = 3;
/* 828 */                                                                       IIIolloil iIIolloil2 = IIIoloiiI1.I00000oIO;
/* 831 */                                                                       objI0001Ioi1lo3 = iIIoloiiI12.I0001Ioi1lo(1, iIO00oO2);
/* 835 */                                                                       if (objI0001Ioi1lo3 != ii0111o) {
/* 839 */                                                                           oOo0ooi = oOo0ooi2;
/* 846 */                                                                           if (!((Boolean) objI0001Ioi1lo3).booleanValue()) {
                                                                                    }
/* 860 */                                                                           str2 = str;
/* 862 */                                                                           j2 = 1;
/* 354 */                                                                           if (oOo0o0oO.I00iOIl < j4) {
                                                                                    }
/* 888 */                                                                           long j1822 = j4;
/* 890 */                                                                           str = str2;
/* 894 */                                                                           oOo0ooi3 = oOo0ooi;
/* 895 */                                                                           z8 = z6;
/* 896 */                                                                           appendable5 = appendable3;
/* 897 */                                                                           oOo0o0oO3 = oOo0o0oO;
/* 898 */                                                                           z9 = z3;
/* 899 */                                                                           iIIoloiiI13 = iIIoloiiI12;
/* 900 */                                                                           olI1iil1l03 = olI1iil1l0;
/* 901 */                                                                           j13 = j1822;
/* 907 */                                                                           if (oOo0o0oO3.I00iOIl != 0) {
                                                                                    }
/* 938 */                                                                           j15 = oOo0o0oO3.I00iOIl;
/* 942 */                                                                           if (j15 <= j13) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th3) {
/* 874 */                                                                   th = th3;
/* 871 */                                                                   iIO00oO = appendable3;
/* 228 */                                                                   r5 = oOo0ooi2;
/* 1279 */                                                                  obj = r5.I00iOIl;
/* 1281 */                                                                  if (obj != null) {
                                                                            }
/* 1294 */                                                                  throw th;
                                                                        }
/* 757 */                                                               j4 = j5;
                                                                    } catch (Throwable th4) {
/* 736 */                                                               th = th4;
/* 733 */                                                               iIO00oO = appendable4;
/* 228 */                                                               r5 = oOo0ooi2;
/* 1279 */                                                              obj = r5.I00iOIl;
/* 1281 */                                                              if (obj != null) {
                                                                        }
/* 1294 */                                                              throw th;
                                                                    }
                                                                }
/* 1121 */                                                      return ii0111o;
                                                            }
/* 762 */                                                   appendable3 = appendable3;
/* 764 */                                                   j5 = j4;
/* 768 */                                                   I0000oI00(r5, olI1iil1l06, oOo0o0oO4, jMin);
/* 771 */                                                   j8 = j19;
/* 773 */                                                   oOo0ooi2 = r5;
/* 774 */                                                   j6 = jMin;
/* 776 */                                                   oOo0o0oO = oOo0o0oO4;
/* 777 */                                                   olI1iil1l0 = olI1iil1l06;
/* 757 */                                                   j4 = j5;
/* 783 */                                                   if (oOo0o0oO.I00iOIl < j4) {
/* 877 */                                                       oOo0ooi = oOo0ooi2;
                                                            }
/* 860 */                                                   str2 = str;
/* 862 */                                                   j2 = 1;
/* 354 */                                                   if (oOo0o0oO.I00iOIl < j4) {
                                                            }
/* 888 */                                                   long j18222 = j4;
/* 890 */                                                   str = str2;
/* 894 */                                                   oOo0ooi3 = oOo0ooi;
/* 895 */                                                   z8 = z6;
/* 896 */                                                   appendable5 = appendable3;
/* 897 */                                                   oOo0o0oO3 = oOo0o0oO;
/* 898 */                                                   z9 = z3;
/* 899 */                                                   iIIoloiiI13 = iIIoloiiI12;
/* 900 */                                                   olI1iil1l03 = olI1iil1l0;
/* 901 */                                                   j13 = j18222;
/* 907 */                                                   if (oOo0o0oO3.I00iOIl != 0) {
                                                            }
/* 938 */                                                   j15 = oOo0o0oO3.I00iOIl;
/* 942 */                                                   if (j15 <= j13) {
                                                            }
                                                        } catch (Throwable th5) {
/* 487 */                                                   th = th5;
                                                        }
                                                    } catch (Throwable th6) {
/* 489 */                                               th = th6;
/* 490 */                                               r5 = r5;
/* 492 */                                               appendable3 = appendable3;
/* 484 */                                               iIO00oO = appendable3;
/* 1279 */                                              obj = r5.I00iOIl;
/* 1281 */                                              if (obj != null) {
                                                        }
/* 1294 */                                              throw th;
                                                    }
/* 621 */                                           j14 = jMin - 1;
                                                } catch (Throwable th7) {
/* 879 */                                           th = th7;
                                                }
/* 364 */                                       j9 = j4 - oOo0o0oO.I00iOIl;
/* 366 */                                       oOo0o0oO4 = oOo0o0oO;
/* 368 */                                       oOo0ooi4 = oOo0ooi;
                                            }
                                        } catch (Throwable th8) {
/* 866 */                                   th = th8;
/* 867 */                                   iIO00oO = appendable3;
/* 868 */                                   r5 = oOo0ooi;
                                        }
                                    } catch (Throwable th9) {
/* 884 */                               th = th9;
/* 885 */                               r5 = oOo0ooi;
                                    }
/* 860 */                           str2 = str;
/* 862 */                           j2 = 1;
                                } catch (Throwable th10) {
/* 161 */                           th = th10;
/* 162 */                           iIO00oO = appendable9;
/* 163 */                           r5 = oOo0ooi6;
                                }
                            } else {
/* 57 */                        if (i2 != 4) {
/* 59 */                            if (i2 != 5) {
/* 84 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 44 */                                return null;
                                    }
/* 61 */                            long j23 = iIO00oO.I00ilO0;
/* 63 */                            oOo0ooi5 = iIO00oO.I00ilI0I1;
/* 65 */                            oOo0o0oO5 = iIO00oO.I00iio;
/* 67 */                            Appendable appendable11 = iIO00oO.I00iiI;
/* 69 */                            lIoii1l01l0i.I00000oOI(objI0001Ioi1lo2);
/* 72 */                            j13 = j23;
/* 73 */                            appendable7 = appendable11;
/* 74 */                            objI0001Ioi1lo = objI0001Ioi1lo2;
/* 37 */                            str4 = " bytes";
/* 1129 */                          if (((Boolean) objI0001Ioi1lo).booleanValue()) {
/* 1135 */                              Long l7 = new Long(oOo0o0oO5.I00iOIl);
/* 1138 */                              Object obj9 = oOo0ooi5.I00iOIl;
/* 1140 */                              if (obj9 != null) {
/* 1142 */                                  III1oo00i1li iII1oo00i1li7 = (III1oo00i1li) obj9;
/* 1150 */                                  appendable7.append(li0oio00o1o.I00000oIO(iII1oo00i1li7, iII1oo00i1li7.I00iiO));
                                        }
/* 1153 */                              return l7;
                                    }
/* 1180 */                          throw new Oo1O0iO1O("Line exceeds limit of " + j13 + str4);
                                }
/* 88 */                        z8 = iIO00oO.I00ll1;
/* 90 */                        z9 = iIO00oO.I00li1OI;
/* 92 */                        j13 = iIO00oO.I00ilO0;
/* 94 */                        OOo0ooi oOo0ooi8 = iIO00oO.I00ilI0I1;
/* 96 */                        oOo0o0oO3 = iIO00oO.I00iio;
/* 98 */                        olI1iil1l03 = iIO00oO.I00iiO;
/* 100 */                       Appendable appendable12 = iIO00oO.I00iiI;
/* 102 */                       iIIoloiiI13 = iIO00oO.I00iOIl;
                                try {
/* 104 */                           lIoii1l01l0i.I00000oOI(objI0001Ioi1lo2);
/* 107 */                           iIO00oO2 = iIO00oO;
/* 35 */                            str = "Unexpected end of stream after reading ";
/* 110 */                           oOo0ooi3 = oOo0ooi8;
/* 111 */                           appendable5 = appendable12;
/* 1001 */                          if (((Boolean) objI0001Ioi1lo2).booleanValue()) {
/* 1038 */                              throw new EOFException(str + oOo0o0oO3.I00iOIl + " bytes");
                                    }
/* 1003 */                          iIO00oO4 = iIO00oO2;
/* 37 */                            str4 = " bytes";
/* 1006 */                          OOo0ooi oOo0ooi72 = oOo0ooi3;
/* 1007 */                          boolean z142 = z9;
/* 1008 */                          appendable7 = appendable5;
/* 1009 */                          boolean z152 = z8;
/* 1010 */                          oOo0o0oO5 = oOo0o0oO3;
                                    try {
/* 1049 */                              bI00000oIO = olI1iil1l03.I0000oI00().I00000oIO(0L);
/* 1055 */                              if (bI00000oIO != 10) {
/* 1059 */                                  iOiOl1OIi11l.I00000oIO(olI1iil1l03, 1L);
/* 1066 */                                  Long l8 = new Long(oOo0o0oO5.I00iOIl);
/* 1069 */                                  Object obj10 = oOo0ooi72.I00iOIl;
/* 1071 */                                  if (obj10 != null) {
/* 1073 */                                      III1oo00i1li iII1oo00i1li8 = (III1oo00i1li) obj10;
/* 1081 */                                      appendable7.append(li0oio00o1o.I00000oIO(iII1oo00i1li8, iII1oo00i1li8.I00iiO));
                                            }
/* 1084 */                                  return l8;
                                        }
/* 1093 */                              if (bI00000oIO != 13) {
/* 1180 */                                  throw new Oo1O0iO1O("Line exceeds limit of " + j13 + str4);
                                        }
/* 1096 */                              iIO00oO4.I00iOIl = null;
/* 1098 */                              iIO00oO4.I00iiI = appendable7;
/* 1100 */                              iIO00oO4.I00iiO = null;
/* 1102 */                              iIO00oO4.I00iio = oOo0o0oO5;
/* 1104 */                              iIO00oO4.I00ilI0I1 = oOo0ooi72;
/* 1106 */                              iIO00oO4.I00ilO0 = j13;
/* 1108 */                              iIO00oO4.I00li1OI = z142;
/* 1110 */                              iIO00oO4.I00ll1 = z152;
/* 1113 */                              iIO00oO4.I00lll10 = 5;
/* 1115 */                              objI0001Ioi1lo = I0001Ioi1lo(olI1iil1l03, iIIoloiiI13, z142, iIO00oO4);
/* 1119 */                              if (objI0001Ioi1lo != ii0111o) {
/* 1122 */                                  oOo0ooi5 = oOo0ooi72;
/* 1129 */                                  if (((Boolean) objI0001Ioi1lo).booleanValue()) {
                                            }
/* 1180 */                                  throw new Oo1O0iO1O("Line exceeds limit of " + j13 + str4);
                                        }
/* 1121 */                              return ii0111o;
                                    } catch (Throwable th11) {
/* 1089 */                              th = th11;
/* 1085 */                              iIO00oO = appendable7;
/* 1086 */                              r5 = oOo0ooi72;
                                    }
                                } catch (Throwable th12) {
/* 114 */                           th = th12;
/* 115 */                           r5 = oOo0ooi8;
/* 116 */                           iIO00oO = appendable12;
                                }
                            }
/* 1279 */                  obj = r5.I00iOIl;
/* 1281 */                  if (obj != null) {
/* 1283 */                      III1oo00i1li iII1oo00i1li9 = (III1oo00i1li) obj;
/* 1291 */                      iIO00oO.append(li0oio00o1o.I00000oIO(iII1oo00i1li9, iII1oo00i1li9.I00iiO));
                            }
/* 1294 */                  throw th;
                        }
/* 168 */               long j24 = iIO00oO.I00l0OO0IO;
/* 170 */               long j25 = iIO00oO.I00l0I0l0lO1;
/* 172 */               long j26 = iIO00oO.I00ioIO;
/* 174 */               long j27 = iIO00oO.I00io1l;
/* 176 */               boolean z16 = iIO00oO.I00ll1;
/* 178 */               boolean z17 = iIO00oO.I00li1OI;
/* 182 */               obj2 = objI0001Ioi1lo2;
/* 183 */               long j28 = iIO00oO.I00ilO0;
/* 185 */               oOo0ooi2 = iIO00oO.I00ilI0I1;
/* 189 */               OOo0o0oO oOo0o0oO7 = iIO00oO.I00iio;
/* 191 */               OlI1iil1l0 olI1iil1l07 = iIO00oO.I00iiO;
/* 195 */               Appendable appendable13 = iIO00oO.I00iiI;
/* 199 */               IIIoloiiI1 iIIoloiiI15 = iIO00oO.I00iOIl;
                        try {
/* 201 */                   lIoii1l01l0i.I00000oOI(obj2);
/* 35 */                    str = "Unexpected end of stream after reading ";
/* 206 */                   j7 = j26;
/* 208 */                   j10 = j27;
/* 210 */                   olI1iil1l02 = olI1iil1l07;
/* 212 */                   jMin = j24;
/* 213 */                   j11 = j25;
/* 214 */                   iIIoloiiI12 = iIIoloiiI15;
/* 215 */                   appendable4 = appendable13;
/* 216 */                   iIO00oO3 = iIO00oO;
/* 217 */                   z3 = z17;
/* 218 */                   z7 = z16;
/* 220 */                   j12 = j28;
/* 222 */                   oOo0o0oO2 = oOo0o0oO7;
/* 708 */                   if (!((Boolean) obj2).booleanValue()) {
                            }
                        } catch (Throwable th13) {
/* 226 */                   th = th13;
/* 227 */                   iIO00oO = appendable13;
/* 228 */                   r5 = oOo0ooi2;
/* 1279 */                  obj = r5.I00iOIl;
/* 1281 */                  if (obj != null) {
                            }
/* 1294 */                  throw th;
                        }
                    }
/* 319 */           if (iIIoloiiI12.I000O01llI0()) {
/* 325 */               return new Long(-1L);
                    }
/* 331 */           oOo0o0oO = new OOo0o0oO();
/* 336 */           oOo0ooi = new OOo0ooi();
/* 339 */           IIO00oO iIO00oO7 = iIO00oO;
/* 341 */           z6 = z5;
/* 342 */           OlI1iil1l0 olI1iil1l08 = olI1iil1l0I000II;
/* 344 */           appendable3 = appendable2;
/* 345 */           j4 = j3;
/* 346 */           iIO00oO2 = iIO00oO7;
/* 348 */           olI1iil1l0 = olI1iil1l08;
                    str2 = r5;
/* 354 */           if (oOo0o0oO.I00iOIl < j4) {
                    }
/* 888 */           long j182222 = j4;
/* 890 */           str = str2;
/* 894 */           oOo0ooi3 = oOo0ooi;
/* 895 */           z8 = z6;
/* 896 */           appendable5 = appendable3;
/* 897 */           oOo0o0oO3 = oOo0o0oO;
/* 898 */           z9 = z3;
/* 899 */           iIIoloiiI13 = iIIoloiiI12;
/* 900 */           olI1iil1l03 = olI1iil1l0;
/* 901 */           j13 = j182222;
/* 907 */           if (oOo0o0oO3.I00iOIl != 0) {
                    }
/* 938 */           j15 = oOo0o0oO3.I00iOIl;
/* 942 */           if (j15 <= j13) {
                    }
                }

                public static final void I0000O(OOo0ooi oOo0ooi, Appendable appendable, OlI1iil1l0 olI1iil1l0, OOo0o0oO oOo0o0oO, long j) throws IOException {
/* 3 */             if (oOo0ooi.I00iOIl != null) {
/* 31 */                I0000oI00(oOo0ooi, olI1iil1l0, oOo0o0oO, j);
                    } else if (j > 0) {
/* 11 */                olI1iil1l0.I00100o1O0lo(j);
/* 22 */                appendable.append(li0oio00o1o.I00000oIO(olI1iil1l0.I0000oI00(), j));
                        oOo0o0oO.I00iOIl += j;
                    }
                }

                public static final void I0000oI00(OOo0ooi oOo0ooi, OlI1iil1l0 olI1iil1l0, OOo0o0oO oOo0o0oO, long j) throws EOFException {
/* 5 */             if (j > 0) {
/* 7 */                 Object iII1oo00i1li = oOo0ooi.I00iOIl;
/* 9 */                 if (iII1oo00i1li == null) {
/* 13 */                    iII1oo00i1li = new III1oo00i1li();
/* 16 */                    oOo0ooi.I00iOIl = iII1oo00i1li;
                        }
/* 18 */                III1oo00i1li iII1oo00i1li2 = (III1oo00i1li) iII1oo00i1li;
/* 20 */                if (j < 0) {
/* 74 */                    I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount (", ") < 0"));
/* 483 */                   return;
                        }
/* 22 */                long j2 = j;
/* 25 */                while (j2 > 0) {
/* 27 */                    long jI00II0oii1o = olI1iil1l0.I00II0oii1o(iII1oo00i1li2, j2);
/* 35 */                    if (jI00II0oii1o == -1) {
/* 59 */                        throw new EOFException(IlIi0I0.I000o00OoI0I(Oi010OO0.I001iOo1i0O(j, "Source exhausted before reading ", " bytes. Only "), j - j2, " were read."));
                            }
/* 37 */                    j2 -= jI00II0oii1o;
                        }
                        oOo0o0oO.I00iOIl += j;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0001Ioi1lo(OlI1iil1l0 olI1iil1l0, IIIoloiiI1 iIIoloiiI1, boolean z, IOoilo iOoilo) throws Throwable {
                    IIO0IIiI0ii0 iIO0IIiI0ii0;
/* 3 */             if (iOoilo instanceof IIO0IIiI0ii0) {
/* 6 */                 iIO0IIiI0ii0 = (IIO0IIiI0ii0) iOoilo;
/* 8 */                 int i = iIO0IIiI0ii0.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0IIiI0ii0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0IIiI0ii0 = new IIO0IIiI0ii0(iOoilo);
                        }
                    }
/* 25 */            Object objI0001Ioi1lo = iIO0IIiI0ii0.I00iiO;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIO0IIiI0ii0.I00iio;
/* 36 */            if (i2 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 66 */                if (olI1iil1l0.I0000oI00().I00iiO < 2) {
/* 68 */                    iIO0IIiI0ii0.I00iOIl = olI1iil1l0;
/* 70 */                    iIO0IIiI0ii0.I00iiI = z;
/* 72 */                    iIO0IIiI0ii0.I00iio = 1;
/* 75 */                    objI0001Ioi1lo = iIIoloiiI1.I0001Ioi1lo(2, iIO0IIiI0ii0);
/* 79 */                    if (objI0001Ioi1lo == obj) {
/* 81 */                        return obj;
                            }
                        }
/* 100 */               if (olI1iil1l0.I0000oI00().I00000oIO(1L) == 10) {
/* 102 */                   iOiOl1OIi11l.I00000oIO(olI1iil1l0, 2L);
/* 105 */                   return Boolean.TRUE;
                        }
/* 108 */               if (z) {
/* 116 */                   return Boolean.FALSE;
                        }
/* 110 */               iOiOl1OIi11l.I00000oIO(olI1iil1l0, 1L);
/* 113 */               return Boolean.TRUE;
                    }
/* 38 */            if (i2 != 1) {
/* 50 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 53 */                return null;
                    }
/* 40 */            z = iIO0IIiI0ii0.I00iiI;
/* 42 */            olI1iil1l0 = iIO0IIiI0ii0.I00iOIl;
/* 44 */            lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 88 */            if (((Boolean) objI0001Ioi1lo).booleanValue()) {
/* 100 */               if (olI1iil1l0.I0000oI00().I00000oIO(1L) == 10) {
                        }
                    }
/* 108 */           if (z) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Comparable I000II(IIIoloiiI1 iIIoloiiI1, int i, IOoilo iOoilo) throws Throwable {
                    IIO0Ol iIO0Ol;
/* 3 */             if (iOoilo instanceof IIO0Ol) {
/* 6 */                 iIO0Ol = (IIO0Ol) iOoilo;
/* 8 */                 int i2 = iIO0Ol.I00iio;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0Ol.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0Ol = new IIO0Ol(iOoilo);
                        }
                    }
/* 25 */            Object objI0001Ioi1lo = iIO0Ol.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = iIO0Ol.I00iio;
/* 33 */            if (i3 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 58 */                if (!iIIoloiiI1.I000O01llI0()) {
/* 61 */                    iIO0Ol.I00iOIl = iIIoloiiI1;
/* 63 */                    iIO0Ol.I00iiI = i;
/* 65 */                    iIO0Ol.I00iio = 1;
/* 67 */                    objI0001Ioi1lo = iIIoloiiI1.I0001Ioi1lo(i, iIO0Ol);
/* 71 */                    if (objI0001Ioi1lo == ii0111o) {
/* 73 */                        return ii0111o;
                            }
                        }
/* 32 */                return null;
                    }
/* 35 */            if (i3 != 1) {
/* 47 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                return null;
                    }
/* 37 */            i = iIO0Ol.I00iiI;
/* 39 */            iIIoloiiI1 = iIO0Ol.I00iOIl;
/* 41 */            lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 80 */            if (((Boolean) objI0001Ioi1lo).booleanValue()) {
/* 83 */                III1oo00i1li iII1oo00i1liI000II = iIIoloiiI1.I000II();
/* 87 */                iII1oo00i1liI000II.getClass();
/* 92 */                OO0ioOIlo oO0ioOIlo = new OO0ioOIlo();
/* 95 */                oO0ioOIlo.I00iOIl = iII1oo00i1liI000II;
/* 97 */                III1oo00i1li iII1oo00i1liI0000oI00 = iII1oo00i1liI000II.I0000oI00();
/* 101 */               oO0ioOIlo.I00iiI = iII1oo00i1liI0000oI00;
/* 103 */               Oii1O1l oii1O1l = iII1oo00i1liI0000oI00.I00iOIl;
/* 105 */               oO0ioOIlo.I00iiO = oii1O1l;
/* 113 */               oO0ioOIlo.I00iio = oii1O1l != null ? oii1O1l.I00000oOI : -1;
/* 115 */               VarHandle.storeStoreFence();
/* 120 */               OOlll0Oi1 oOlll0Oi1 = new OOlll0Oi1();
/* 123 */               oOlll0Oi1.I00iOIl = oO0ioOIlo;
/* 130 */               oOlll0Oi1.I00iiO = new III1oo00i1li();
/* 132 */               VarHandle.storeStoreFence();
/* 141 */               return new IIOIIi10OOl(lOO1Ill.I00000oOI(oOlll0Oi1, i));
                    }
/* 32 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000O01llI0(IIIoloiiI1 iIIoloiiI1, IOoilo iOoilo) throws Throwable {
                    IIO0iIo0IIl1 iIO0iIo0IIl1;
                    III1oo00i1li iII1oo00i1li;
/* 3 */             if (iOoilo instanceof IIO0iIo0IIl1) {
/* 6 */                 iIO0iIo0IIl1 = (IIO0iIo0IIl1) iOoilo;
/* 8 */                 int i = iIO0iIo0IIl1.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0iIo0IIl1.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0iIo0IIl1 = new IIO0iIo0IIl1(iOoilo);
                        }
                    }
/* 25 */            Object obj = iIO0iIo0IIl1.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIO0iIo0IIl1.I00iio;
/* 32 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                iII1oo00i1li = new III1oo00i1li();
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                III1oo00i1li iII1oo00i1li2 = iIO0iIo0IIl1.I00iiI;
/* 38 */                IIIoloiiI1 iIIoloiiI12 = iIO0iIo0IIl1.I00iOIl;
/* 40 */                lIoii1l01l0i.I00000oOI(obj);
/* 43 */                iII1oo00i1li = iII1oo00i1li2;
/* 44 */                iIIoloiiI1 = iIIoloiiI12;
                    }
/* 65 */            while (!iIIoloiiI1.I000O01llI0()) {
/* 71 */                iII1oo00i1li.I000l1(iIIoloiiI1.I000II());
/* 74 */                iIO0iIo0IIl1.I00iOIl = iIIoloiiI1;
/* 76 */                iIO0iIo0IIl1.I00iiI = iII1oo00i1li;
/* 78 */                iIO0iIo0IIl1.I00iio = 1;
/* 84 */                if (iIIoloiiI1.I0001Ioi1lo(1, iIO0iIo0IIl1) == ii0111o) {
/* 86 */                    return ii0111o;
                        }
                    }
/* 87 */            Throwable thI0000oI00 = iIIoloiiI1.I0000oI00();
/* 91 */            if (thI0000oI00 == null) {
/* 93 */                return iII1oo00i1li;
                    }
/* 551 */           throw thI0000oI00;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000OOo1O(IIIoloiiI1 iIIoloiiI1, O0olI0li o0olI0li, IOoilo iOoilo) throws Throwable {
                    IIO0iOli0iII iIO0iOli0iII;
                    StringBuilder sb;
/* 3 */             if (iOoilo instanceof IIO0iOli0iII) {
/* 6 */                 iIO0iOli0iII = (IIO0iOli0iII) iOoilo;
/* 8 */                 int i = iIO0iOli0iII.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0iOli0iII.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    iIO0iOli0iII = new IIO0iOli0iII(iOoilo);
                        }
                    }
/* 19 */            IIO0iOli0iII iIO0iOli0iII2 = iIO0iOli0iII;
/* 27 */            Object objI0000Il00O = iIO0iOli0iII2.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = iIO0iOli0iII2.I00iiO;
/* 35 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 57 */                StringBuilder sb2 = new StringBuilder();
/* 60 */                iIO0iOli0iII2.I00iOIl = sb2;
/* 62 */                iIO0iOli0iII2.I00iiO = 1;
/* 79 */                objI0000Il00O = I0000Il00O(iIIoloiiI1, sb2, Long.MAX_VALUE, o0olI0li == O0olI0li.I00iiI, false, iIO0iOli0iII2);
/* 83 */                if (objI0000Il00O == ii0111o) {
/* 85 */                    return ii0111o;
                        }
/* 86 */                sb = sb2;
                    } else {
/* 37 */                if (i2 != 1) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                sb = iIO0iOli0iII2.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
                    }
/* 97 */            if (((Number) objI0000Il00O).longValue() >= 0) {
/* 99 */                return sb.toString();
                    }
/* 33 */            return null;
                }

                public static final Object I000OiO(IIIoloiiI1 iIIoloiiI1, Appendable appendable, long j, O0olI0li o0olI0li, IOoilo iOoilo) {
/* 5 */             if (j >= 0) {
/* 21 */                return I0000Il00O(iIIoloiiI1, appendable, j, o0olI0li == O0olI0li.I00iiI, true, iOoilo);
                    }
/* 35 */            I000II.I0010I0i(IlIi0I0.I000l1(j, "Limit (", ") should be non-negative"));
/* 38 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:24:0x0063). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:23:0x0061). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000iOII(Ii01oI01 ii01oI01, int i, IOoilo iOoilo) throws Throwable {
                    IIO0lI1i iIO0lI1i;
                    int i2;
                    III1oo00i1li iII1oo00i1li;
                    IIIoloiiI1 iIIoloiiI1;
/* 3 */             if (iOoilo instanceof IIO0lI1i) {
/* 6 */                 iIO0lI1i = (IIO0lI1i) iOoilo;
/* 8 */                 int i3 = iIO0lI1i.I00ilI0I1;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0lI1i.I00ilI0I1 = i3 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0lI1i = new IIO0lI1i(iOoilo);
                        }
                    }
/* 25 */            Object obj = iIO0lI1i.I00iio;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i4 = iIO0lI1i.I00ilI0I1;
/* 32 */            if (i4 != 0) {
/* 34 */                if (i4 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                int i5 = iIO0lI1i.I00iiO;
/* 38 */                iII1oo00i1li = iIO0lI1i.I00iiI;
/* 40 */                IIIoloiiI1 iIIoloiiI12 = iIO0lI1i.I00iOIl;
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
/* 98 */                i2 = i5;
/* 99 */                IIIoloiiI1 iIIoloiiI13 = iIIoloiiI12;
/* 104 */               if (!iIIoloiiI13.I000O01llI0()) {
                            long j = i2;
/* 119 */                   if (iIIoloiiI13.I000II().I00iiO > j - iII1oo00i1li.I00iiO) {
/* 128 */                       iIIoloiiI13.I000II().I000II(iII1oo00i1li, j - iII1oo00i1li.I00iiO);
                                iIIoloiiI1 = iIIoloiiI13;
                            } else {
/* 142 */                       new Long(iIIoloiiI13.I000II().I00100l0(iII1oo00i1li));
                                iIIoloiiI1 = iIIoloiiI13;
                            }
/* 69 */                    if (iII1oo00i1li.I00iiO < i2) {
/* 75 */                        boolean zI00II0Ol1O0l = iIIoloiiI1.I000II().I00II0Ol1O0l();
                                iIIoloiiI13 = iIIoloiiI1;
/* 79 */                        if (zI00II0Ol1O0l) {
/* 81 */                            iIO0lI1i.I00iOIl = iIIoloiiI1;
/* 83 */                            iIO0lI1i.I00iiI = iII1oo00i1li;
/* 85 */                            iIO0lI1i.I00iiO = i2;
/* 87 */                            iIO0lI1i.I00ilI0I1 = 1;
/* 93 */                            if (iIIoloiiI1.I0001Ioi1lo(1, iIO0lI1i) == ii0111o) {
/* 95 */                                return ii0111o;
                                    }
/* 96 */                            iIIoloiiI12 = iIIoloiiI1;
/* 97 */                            i5 = i2;
/* 98 */                            i2 = i5;
/* 99 */                            IIIoloiiI1 iIIoloiiI132 = iIIoloiiI12;
                                }
/* 104 */                       if (!iIIoloiiI132.I000O01llI0()) {
                                }
                            }
                        }
/* 151 */               if (iII1oo00i1li.I00iiO < i2) {
/* 153 */                   return iII1oo00i1li;
                        }
/* 215 */               throw new EOFException(IlIi0I0.I000o00OoI0I(IlIi0I0.I00100o1O0lo("Not enough data available, required ", i2, " bytes but only "), iII1oo00i1li.I00iiO, " available"));
                    }
/* 53 */            lIoii1l01l0i.I00000oOI(obj);
/* 62 */            i2 = i;
/* 58 */            iII1oo00i1li = new III1oo00i1li();
                    iIIoloiiI1 = ii01oI01;
/* 69 */            if (iII1oo00i1li.I00iiO < i2) {
                    }
/* 151 */           if (iII1oo00i1li.I00iiO < i2) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000l1(IIIoloiiI1 iIIoloiiI1, IOoilo iOoilo) throws Throwable {
                    IIO0lO iIO0lO;
                    III1oo00i1li iII1oo00i1li;
/* 3 */             if (iOoilo instanceof IIO0lO) {
/* 6 */                 iIO0lO = (IIO0lO) iOoilo;
/* 8 */                 int i = iIO0lO.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0lO.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0lO = new IIO0lO(iOoilo);
                        }
                    }
/* 25 */            Object obj = iIO0lO.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIO0lO.I00iio;
/* 32 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                iII1oo00i1li = new III1oo00i1li();
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                III1oo00i1li iII1oo00i1li2 = iIO0lO.I00iiI;
/* 38 */                IIIoloiiI1 iIIoloiiI12 = iIO0lO.I00iOIl;
/* 40 */                lIoii1l01l0i.I00000oOI(obj);
/* 43 */                iII1oo00i1li = iII1oo00i1li2;
/* 44 */                iIIoloiiI1 = iIIoloiiI12;
                    }
/* 65 */            while (!iIIoloiiI1.I000O01llI0()) {
/* 71 */                iII1oo00i1li.I000l1(iIIoloiiI1.I000II());
/* 74 */                iIO0lO.I00iOIl = iIIoloiiI1;
/* 76 */                iIO0lO.I00iiI = iII1oo00i1li;
/* 78 */                iIO0lO.I00iio = 1;
/* 84 */                if (iIIoloiiI1.I0001Ioi1lo(1, iIO0lO) == ii0111o) {
/* 86 */                    return ii0111o;
                        }
                    }
/* 87 */            Throwable thI0000oI00 = iIIoloiiI1.I0000oI00();
/* 91 */            if (thI0000oI00 != null) {
/* 551 */               throw thI0000oI00;
                    }
/* 93 */            iII1oo00i1li.getClass();
/* 96 */            return iII1oo00i1li;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000lI(IIIoloiiI1 iIIoloiiI1, int i, IOoilo iOoilo) throws Throwable {
                    IIO0lllI iIO0lllI;
                    StringBuilder sb;
/* 3 */             if (iOoilo instanceof IIO0lllI) {
/* 6 */                 iIO0lllI = (IIO0lllI) iOoilo;
/* 8 */                 int i2 = iIO0lllI.I00iiO;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0lllI.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0lllI = new IIO0lllI(iOoilo);
                        }
                    }
/* 25 */            Object obj = iIO0lllI.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = iIO0lllI.I00iiO;
/* 33 */            if (i3 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 54 */                StringBuilder sb2 = new StringBuilder();
/* 57 */                iIO0lllI.I00iOIl = sb2;
/* 59 */                iIO0lllI.I00iiO = 1;
/* 61 */                List list = O0olIIIOllio.I00000oOI;
/* 64 */                Object objI000o00OoI0I = I000o00OoI0I(iIIoloiiI1, sb2, i, 7, iIO0lllI);
/* 68 */                if (objI000o00OoI0I == ii0111o) {
/* 70 */                    return ii0111o;
                        }
/* 72 */                obj = objI000o00OoI0I;
/* 73 */                sb = sb2;
                    } else {
/* 35 */                if (i3 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                sb = iIO0lllI.I00iOIl;
/* 39 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 80 */            if (((Boolean) obj).booleanValue()) {
/* 83 */                return sb.toString();
                    }
/* 31 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000o00OoI0I(IIIoloiiI1 iIIoloiiI1, StringBuilder sb, int i, int i2, IOoilo iOoilo) throws Throwable {
                    IIO0lllo1O11 iIO0lllo1O11;
/* 3 */             if (iOoilo instanceof IIO0lllo1O11) {
/* 6 */                 iIO0lllo1O11 = (IIO0lllo1O11) iOoilo;
/* 8 */                 int i3 = iIO0lllo1O11.I00iiI;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0lllo1O11.I00iiI = i3 - Integer.MIN_VALUE;
                        } else {
/* 23 */                    iIO0lllo1O11 = new IIO0lllo1O11(iOoilo);
                        }
                    }
/* 19 */            IIO0lllo1O11 iIO0lllo1O112 = iIO0lllo1O11;
/* 27 */            Object objI000OiO = iIO0lllo1O112.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i4 = iIO0lllo1O112.I00iiI;
                    try {
/* 35 */                if (i4 == 0) {
/* 53 */                    lIoii1l01l0i.I00000oOI(objI000OiO);
                            long j = i;
/* 57 */                    List list = O0olIIIOllio.I00000oOI;
/* 72 */                    O0olI0li o0olI0li = (i2 | 1) == i2 ? O0olI0li.I00iiI : O0olI0li.I00iOIl;
/* 75 */                    iIO0lllo1O112.I00iiI = 1;
/* 79 */                    objI000OiO = I000OiO(iIIoloiiI1, sb, j, o0olI0li, iIO0lllo1O112);
/* 83 */                    if (objI000OiO == ii0111o) {
/* 85 */                        return ii0111o;
                            }
                        } else {
/* 37 */                    if (i4 != 1) {
/* 48 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                        return null;
                            }
/* 39 */                    lIoii1l01l0i.I00000oOI(objI000OiO);
                        }
/* 99 */                return Boolean.valueOf(((Number) objI000OiO).longValue() >= 0);
                    } catch (EOFException e) {
/* 104 */               String message = e.getMessage();
/* 108 */               if (message == null || !OlOolloIIOl0.I000l1(message, "Unexpected end of stream after reading", false)) {
/* 966 */                   throw e;
                        }
/* 118 */               return Boolean.TRUE;
                    }
                }

                public static final Object I000oI1ioi(IIIoloiiI1 iIIoloiiI1, IIOIIi10OOl iIOIIi10OOl, IIOIlI01 iIOIlI01, long j, IOoilo iOoilo) {
/* 3 */             IIIoO10O iIIoO10O = new IIIoO10O();
/* 6 */             iIIoO10O.I00000oIO = iIIoloiiI1;
/* 8 */             iIIoO10O.I00000oOI = iIOIIi10OOl;
/* 10 */            iIIoO10O.I0000Il00O = iIOIlI01;
/* 12 */            iIIoO10O.I0000O = j;
/* 14 */            byte[] bArr = iIOIIi10OOl.I00iOIl;
/* 17 */            if (bArr.length <= 0) {
/* 87 */                I000II.I000iOII("Empty match string not permitted for scanning");
/* 90 */                return null;
                    }
/* 23 */            iIIoO10O.I0000oI00 = iIIoloiiI1.I000II();
/* 26 */            int[] iArr = new int[bArr.length];
/* 28 */            int length = bArr.length;
/* 30 */            int i = 0;
/* 32 */            for (int i2 = 1; i2 < length; i2++) {
/* 34 */                while (i > 0 && iIOIIi10OOl.I00000oIO(i2) != iIOIIi10OOl.I00000oIO(i)) {
/* 48 */                    i = iArr[i - 1];
                        }
/* 59 */                if (iIOIIi10OOl.I00000oIO(i2) == iIOIIi10OOl.I00000oIO(i)) {
/* 61 */                    i++;
                        }
/* 63 */                iArr[i2] = i;
                    }
/* 68 */            iIIoO10O.I0001Ioi1lo = iArr;
/* 75 */            iIIoO10O.I000II = new III1oo00i1li();
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            return iIIoO10O.I0000O(true, iOoilo);
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
                
                    if (I00000oOI(r6, r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00100l0(IIIoloiiI1 iIIoloiiI1, IIOIIi10OOl iIOIIi10OOl, IOoilo iOoilo) throws Throwable {
                    IIO0lloii iIO0lloii;
/* 3 */             if (iOoilo instanceof IIO0lloii) {
/* 6 */                 iIO0lloii = (IIO0lloii) iOoilo;
/* 8 */                 int i = iIO0lloii.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0lloii.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0lloii = new IIO0lloii(iOoilo);
                        }
                    }
/* 25 */            Object objI000II = iIO0lloii.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIO0lloii.I00iio;
/* 34 */            if (i2 == 0) {
/* 58 */                lIoii1l01l0i.I00000oOI(objI000II);
/* 63 */                int length = iIOIIi10OOl.I00iOIl.length;
/* 64 */                iIO0lloii.I00iOIl = iIIoloiiI1;
/* 66 */                iIO0lloii.I00iiI = iIOIIi10OOl;
/* 68 */                iIO0lloii.I00iio = 1;
/* 70 */                objI000II = I000II(iIIoloiiI1, length, iIO0lloii);
/* 74 */                if (objI000II != ii0111o) {
                        }
/* 99 */                return ii0111o;
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 == 2) {
/* 40 */                    lIoii1l01l0i.I00000oOI(objI000II);
/* 100 */                   return Boolean.TRUE;
                        }
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 50 */            iIOIIi10OOl = iIO0lloii.I00iiI;
/* 52 */            iIIoloiiI1 = iIO0lloii.I00iOIl;
/* 54 */            lIoii1l01l0i.I00000oOI(objI000II);
/* 81 */            if (!O0000Ioio00.I0000O(objI000II, iIOIIi10OOl)) {
/* 103 */               return Boolean.FALSE;
                    }
/* 85 */            long length2 = iIOIIi10OOl.I00iOIl.length;
/* 87 */            iIO0lloii.I00iOIl = null;
/* 89 */            iIO0lloii.I00iiI = null;
/* 91 */            iIO0lloii.I00iio = 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Serializable I00100o1O0lo(IIIoloiiI1 iIIoloiiI1, IOoilo iOoilo) throws Throwable {
                    IIO0o11il00l iIO0o11il00l;
/* 3 */             if (iOoilo instanceof IIO0o11il00l) {
/* 6 */                 iIO0o11il00l = (IIO0o11il00l) iOoilo;
/* 8 */                 int i = iIO0o11il00l.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIO0o11il00l.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIO0o11il00l = new IIO0o11il00l(iOoilo);
                        }
                    }
/* 25 */            Object objI000O01llI0 = iIO0o11il00l.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIO0o11il00l.I00iiI;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 50 */                iIO0o11il00l.I00iiI = 1;
/* 52 */                objI000O01llI0 = I000O01llI0(iIIoloiiI1, iIO0o11il00l);
/* 56 */                if (objI000O01llI0 == ii0111o) {
/* 58 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI000O01llI0);
                    }
/* 59 */            III1oo00i1li iII1oo00i1li = (III1oo00i1li) objI000O01llI0;
/* 64 */            return lOO1Ill.I00000oOI(iII1oo00i1li, (int) iII1oo00i1li.I00iiO);
                }
            }
