            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IilOo0l01l {
                public static final float I00000oIO = 0.125f / 18.0f;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Path cross not found for [B:32:0x00c4, B:34:0x00ca], limit reached: 69 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00bd A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00ff A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0089 -> B:23:0x0094). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(Oll11lOlo oll11lOlo, OO1il00lI oO1il00lI, OO1i0l oO1i0l, I1oI1lil i1oI1lil) throws Throwable {
                    IilO0O iilO0O;
                    OOo0o0oO oOo0o0oO;
                    Io1OIO1l0o io1OIO1l0o;
                    int i;
                    OO1i0l oO1i0l2;
                    IilO0O iilO0O2;
                    float f;
                    Oll11lOlo oll11lOlo2;
                    Object objI00000oOI;
                    IilO0O iilO0O3;
                    Object obj;
                    int i2;
                    int size;
                    int i3;
                    Object obj2;
                    OO1il00lI oO1il00lI2;
                    int size2;
                    int i4;
/* 7 */             if (i1oI1lil instanceof IilO0O) {
/* 10 */                iilO0O = (IilO0O) i1oI1lil;
/* 12 */                int i5 = iilO0O.I00ioIO;
/* 18 */                if ((i5 & Integer.MIN_VALUE) != 0) {
/* 21 */                    iilO0O.I00ioIO = i5 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iilO0O = new IilO0O(i1oI1lil);
                        }
                    }
/* 29 */            Object obj3 = iilO0O.I00io1l;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i6 = iilO0O.I00ioIO;
/* 36 */            int i7 = 1;
/* 37 */            if (i6 != 0) {
/* 39 */                if (i6 != 1) {
/* 67 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 41 */                float f2 = iilO0O.I00ilO0;
/* 43 */                int i8 = iilO0O.I00ilI0I1;
/* 45 */                Io1OIO1l0o io1OIO1l0o2 = iilO0O.I00iio;
/* 47 */                OOo0o0oO oOo0o0oO2 = iilO0O.I00iiO;
/* 49 */                OO1i0l oO1i0l3 = iilO0O.I00iiI;
/* 51 */                Oll11lOlo oll11lOlo3 = iilO0O.I00iOIl;
/* 53 */                lIoii1l01l0i.I00000oOI(obj3);
/* 56 */                IilO0O iilO0O4 = iilO0O;
/* 58 */                f = f2;
/* 59 */                oll11lOlo2 = oll11lOlo3;
/* 60 */                OOo0o0oO oOo0o0oO3 = oOo0o0oO2;
/* 61 */                io1OIO1l0o = io1OIO1l0o2;
/* 62 */                IilO0O iilO0O5 = iilO0O4;
/* 151 */               List list = ((OO1Oooio101) obj3).I00000oIO;
/* 156 */               int size3 = list.size();
/* 160 */               int i9 = 0;
                        while (true) {
/* 161 */                   if (i9 < size3) {
/* 190 */                       iilO0O3 = iilO0O5;
/* 192 */                       obj = null;
                                break;
                            }
/* 163 */                   obj = list.get(i9);
/* 172 */                   iilO0O3 = iilO0O5;
/* 180 */                   if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, oOo0o0oO3.I00iOIl)) {
                                break;
                            }
/* 183 */                   i9++;
/* 186 */                   iilO0O5 = iilO0O3;
                        }
/* 193 */               OO1il00lI oO1il00lI3 = (OO1il00lI) obj;
/* 195 */               if (oO1il00lI3 == null && !lI1Ol11OOlll.I0000O(oO1il00lI3)) {
/* 205 */                   i2 = 1;
/* 227 */                   if ((Io1OIO1l0o.I00000oOI(io1OIO1l0o, lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI3, true), f) & 9223372034707292159L) != 9205357640488583168L) {
/* 229 */                       i = 1;
                            }
/* 279 */                   size2 = list.size();
/* 284 */                   for (i4 = 0; i4 < size2; i4++) {
/* 294 */                       if (((OO1il00lI) list.get(i4)).I0000O) {
/* 296 */                           iilO0O2 = iilO0O3;
/* 298 */                           oO1i0l2 = oO1i0l3;
/* 299 */                           oOo0o0oO = oOo0o0oO3;
/* 300 */                           i7 = i2;
/* 117 */                           iilO0O2.I00iOIl = oll11lOlo2;
/* 119 */                           iilO0O2.I00iiI = oO1i0l2;
/* 121 */                           iilO0O2.I00iiO = oOo0o0oO;
/* 123 */                           iilO0O2.I00iio = io1OIO1l0o;
/* 125 */                           iilO0O2.I00ilI0I1 = i;
/* 127 */                           iilO0O2.I00ilO0 = f;
/* 129 */                           iilO0O2.I00ioIO = i7;
/* 131 */                           objI00000oOI = oll11lOlo2.I00000oOI(oO1i0l2, iilO0O2);
/* 135 */                           if (objI00000oOI != ii0111o) {
/* 137 */                               return ii0111o;
                                    }
/* 138 */                           OOo0o0oO oOo0o0oO4 = oOo0o0oO;
/* 140 */                           oO1i0l3 = oO1i0l2;
/* 141 */                           obj3 = objI00000oOI;
/* 142 */                           oOo0o0oO3 = oOo0o0oO4;
/* 144 */                           int i10 = i;
/* 146 */                           iilO0O5 = iilO0O2;
/* 147 */                           i8 = i10;
/* 151 */                           List list2 = ((OO1Oooio101) obj3).I00000oIO;
/* 156 */                           int size32 = list2.size();
/* 160 */                           int i92 = 0;
                                    while (true) {
/* 161 */                               if (i92 < size32) {
                                        }
/* 183 */                               i92++;
/* 186 */                               iilO0O5 = iilO0O3;
                                    }
/* 193 */                           OO1il00lI oO1il00lI32 = (OO1il00lI) obj;
/* 195 */                           if (oO1il00lI32 == null) {
                                    }
/* 203 */                           i2 = 1;
/* 234 */                           size = list2.size();
/* 238 */                           i3 = 0;
                                    while (true) {
/* 239 */                               if (i3 < size) {
                                        }
/* 253 */                               i3++;
                                    }
/* 257 */                           oO1il00lI2 = (OO1il00lI) obj2;
/* 259 */                           if (oO1il00lI2 != null) {
                                    }
                                }
                            }
/* 312 */                   return Boolean.valueOf(i == 0 ? i2 : 0);
                        }
/* 203 */               i2 = 1;
/* 234 */               size = list2.size();
/* 238 */               i3 = 0;
                        while (true) {
/* 239 */                   if (i3 < size) {
/* 256 */                       obj2 = null;
                                break;
                            }
/* 241 */                   obj2 = list2.get(i3);
/* 250 */                   if (((OO1il00lI) obj2).I0000O) {
                                break;
                            }
/* 253 */                   i3++;
                        }
/* 257 */               oO1il00lI2 = (OO1il00lI) obj2;
/* 259 */               if (oO1il00lI2 != null) {
/* 266 */                   return Boolean.valueOf(i8 != 0);
                        }
/* 273 */               oOo0o0oO3.I00iOIl = oO1il00lI2.I00000oIO;
/* 275 */               i = i8;
/* 279 */               size2 = list2.size();
/* 284 */               while (i4 < size2) {
                        }
/* 312 */               return Boolean.valueOf(i == 0 ? i2 : 0);
                    }
/* 71 */            lIoii1l01l0i.I00000oOI(obj3);
/* 78 */            if (ililI0.I00000oIO(oll11lOlo)) {
/* 80 */                return Boolean.FALSE;
                    }
/* 85 */            OOo0o0oO oOo0o0oO5 = new OOo0o0oO();
/* 90 */            oOo0o0oO5.I00iOIl = oO1il00lI.I00000oIO;
/* 98 */            float fI000iOII = I000iOII(oll11lOlo.I0001Ioi1lo(), oO1il00lI.I000OOo1O);
/* 108 */           oOo0o0oO = oOo0o0oO5;
/* 105 */           io1OIO1l0o = new Io1OIO1l0o((OIilII) null, 3);
/* 110 */           i = 0;
/* 111 */           oO1i0l2 = oO1i0l;
/* 113 */           iilO0O2 = iilO0O;
/* 114 */           f = fI000iOII;
/* 115 */           oll11lOlo2 = oll11lOlo;
/* 117 */           iilO0O2.I00iOIl = oll11lOlo2;
/* 119 */           iilO0O2.I00iiI = oO1i0l2;
/* 121 */           iilO0O2.I00iiO = oOo0o0oO;
/* 123 */           iilO0O2.I00iio = io1OIO1l0o;
/* 125 */           iilO0O2.I00ilI0I1 = i;
/* 127 */           iilO0O2.I00ilO0 = f;
/* 129 */           iilO0O2.I00ioIO = i7;
/* 131 */           objI00000oOI = oll11lOlo2.I00000oOI(oO1i0l2, iilO0O2);
/* 135 */           if (objI00000oOI != ii0111o) {
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
                
                    if (p000.OIOlIiiioi.I0000O(p000.lI1Ol11OOlll.I0001Ioi1lo(r11, true), 0) == false) goto L47;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0087 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0063). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Oll11lOlo oll11lOlo, long j, IOoilo iOoilo) throws Throwable {
                    IilO0illI1 iilO0illI1;
                    Oll11lOlo oll11lOlo2;
                    OOo0o0oO oOo0o0oO;
                    Object objI00000oOI;
                    Object obj;
                    Object obj2;
/* 7 */             if (iOoilo instanceof IilO0illI1) {
/* 10 */                iilO0illI1 = (IilO0illI1) iOoilo;
/* 12 */                int i = iilO0illI1.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    iilO0illI1.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iilO0illI1 = new IilO0illI1(iOoilo);
                        }
                    }
/* 29 */            Object obj3 = iilO0illI1.I00iiO;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = iilO0illI1.I00iio;
/* 37 */            if (i2 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(obj3);
/* 58 */                oll11lOlo2 = oll11lOlo;
/* 68 */                if (!I000OiO(oll11lOlo2.I00ilO0.I00oII, j)) {
/* 74 */                    OOo0o0oO oOo0o0oO2 = new OOo0o0oO();
/* 77 */                    oOo0o0oO2.I00iOIl = j;
/* 79 */                    oOo0o0oO = oOo0o0oO2;
/* 80 */                    iilO0illI1.I00iOIl = oll11lOlo2;
/* 82 */                    iilO0illI1.I00iiI = oOo0o0oO;
/* 84 */                    iilO0illI1.I00iio = 1;
/* 88 */                    objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilO0illI1);
/* 92 */                    if (objI00000oOI != ii0111o) {
                            }
                        }
/* 36 */                return null;
                    }
/* 39 */            if (i2 != 1) {
/* 51 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                return null;
                    }
/* 41 */            oOo0o0oO = iilO0illI1.I00iiI;
/* 43 */            Oll11lOlo oll11lOlo3 = iilO0illI1.I00iOIl;
/* 45 */            lIoii1l01l0i.I00000oOI(obj3);
/* 100 */           OO1Oooio101 oO1Oooio101 = (OO1Oooio101) obj3;
/* 102 */           List list = oO1Oooio101.I00000oIO;
/* 107 */           int size = list.size();
/* 111 */           int i3 = 0;
/* 112 */           int i4 = 0;
                    while (true) {
/* 113 */               if (i4 < size) {
/* 136 */                   obj = null;
                            break;
                        }
/* 115 */               obj = list.get(i4);
/* 130 */               if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, oOo0o0oO.I00iOIl)) {
                            break;
                        }
/* 133 */               i4++;
                    }
/* 137 */           OO1il00lI oO1il00lI = (OO1il00lI) obj;
/* 139 */           if (oO1il00lI == null) {
/* 147 */               if (lI1Ol11OOlll.I0000O(oO1il00lI)) {
/* 149 */                   List list2 = oO1Oooio101.I00000oIO;
/* 154 */                   int size2 = list2.size();
                            while (true) {
/* 158 */                       if (i3 >= size2) {
/* 175 */                           obj2 = null;
                                    break;
                                }
/* 160 */                       obj2 = list2.get(i3);
/* 169 */                       if (((OO1il00lI) obj2).I0000O) {
                                    break;
                                }
/* 172 */                       i3++;
                            }
/* 176 */                   OO1il00lI oO1il00lI2 = (OO1il00lI) obj2;
/* 178 */                   if (oO1il00lI2 != null) {
/* 183 */                       oOo0o0oO.I00iOIl = oO1il00lI2.I00000oIO;
/* 208 */                       oll11lOlo2 = oll11lOlo3;
/* 80 */                        iilO0illI1.I00iOIl = oll11lOlo2;
/* 82 */                        iilO0illI1.I00iiI = oOo0o0oO;
/* 84 */                        iilO0illI1.I00iio = 1;
/* 88 */                        objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilO0illI1);
/* 92 */                        if (objI00000oOI != ii0111o) {
/* 94 */                            return ii0111o;
                                }
/* 95 */                        Oll11lOlo oll11lOlo4 = oll11lOlo2;
/* 97 */                        obj3 = objI00000oOI;
/* 98 */                        oll11lOlo3 = oll11lOlo4;
                            }
                        }
/* 100 */               OO1Oooio101 oO1Oooio1012 = (OO1Oooio101) obj3;
/* 102 */               List list3 = oO1Oooio1012.I00000oIO;
/* 107 */               int size3 = list3.size();
/* 111 */               int i32 = 0;
/* 112 */               int i42 = 0;
                        while (true) {
/* 113 */                   if (i42 < size3) {
                            }
/* 133 */                   i42++;
                        }
/* 137 */               OO1il00lI oO1il00lI3 = (OO1il00lI) obj;
/* 139 */               if (oO1il00lI3 == null) {
/* 141 */                   oO1il00lI3 = null;
                        }
                    }
/* 198 */           if (oO1il00lI3 == null || oO1il00lI3.I0000Il00O()) {
/* 36 */                return null;
                    }
/* 206 */           return oO1il00lI3;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[PHI: r0 r1 r2 r5 r10 r11 r12
                  0x00a7: PHI (r0v3 IlliIl1l11O) = (r0v4 IlliIl1l11O), (r0v7 IlliIl1l11O) binds: [B:21:0x00a3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
                  0x00a7: PHI (r1v1 Io1OIO1l0o) = (r1v3 Io1OIO1l0o), (r1v7 Io1OIO1l0o) binds: [B:21:0x00a3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
                  0x00a7: PHI (r2v3 java.lang.Object) = (r2v9 java.lang.Object), (r2v1 java.lang.Object) binds: [B:21:0x00a3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
                  0x00a7: PHI (r5v2 Oll11lOlo) = (r5v4 Oll11lOlo), (r5v8 Oll11lOlo) binds: [B:21:0x00a3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
                  0x00a7: PHI (r10v1 OO1il00lI) = (r10v7 OO1il00lI), (r10v0 OO1il00lI) binds: [B:21:0x00a3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
                  0x00a7: PHI (r11v5 float) = (r11v6 float), (r11v9 float) binds: [B:21:0x00a3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
                  0x00a7: PHI (r12v2 OOo0o0oO) = (r12v4 OOo0o0oO), (r12v8 OOo0o0oO) binds: [B:21:0x00a3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00d1 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0168 -> B:60:0x016f). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(Oll11lOlo oll11lOlo, long j, int i, II1l0001 iI1l0001, I1oI1lil i1oI1lil) throws Throwable {
                    IilO1iiol1 iilO1iiol1;
                    Oll11lOlo oll11lOlo2;
                    float fI000iOII;
                    OOo0o0oO oOo0o0oO;
                    Io1OIO1l0o io1OIO1l0o;
                    IlliIl1l11O illiIl1l11O;
                    int size;
                    OO1il00lI oO1il00lI;
                    int i2;
                    Object obj;
                    OO1il00lI oO1il00lI2;
                    Object obj2;
/* 7 */             if (i1oI1lil instanceof IilO1iiol1) {
/* 10 */                iilO1iiol1 = (IilO1iiol1) i1oI1lil;
/* 12 */                int i3 = iilO1iiol1.I00ioIO;
/* 18 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 21 */                    iilO1iiol1.I00ioIO = i3 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iilO1iiol1 = new IilO1iiol1(i1oI1lil);
                        }
                    }
/* 29 */            Object objI00000oOI = iilO1iiol1.I00io1l;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i4 = iilO1iiol1.I00ioIO;
/* 38 */            int i5 = 1;
/* 39 */            OO1il00lI oO1il00lI3 = null;
/* 40 */            if (i4 == 0) {
/* 98 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 101 */               OIilII oIilII = OIilII.I00iiI;
/* 103 */               oll11lOlo2 = oll11lOlo;
/* 113 */               if (I000OiO(oll11lOlo2.I00ilO0.I00oII, j)) {
/* 39 */                    return null;
                        }
/* 125 */               fI000iOII = I000iOII(oll11lOlo2.I0001Ioi1lo(), i);
/* 131 */               oOo0o0oO = new OOo0o0oO();
/* 134 */               oOo0o0oO.I00iOIl = j;
/* 138 */               io1OIO1l0o = new Io1OIO1l0o(0L, oIilII);
/* 142 */               illiIl1l11O = iI1l0001;
/* 144 */               iilO1iiol1.I00iOIl = illiIl1l11O;
/* 146 */               iilO1iiol1.I00iiI = oll11lOlo2;
/* 148 */               iilO1iiol1.I00iiO = oOo0o0oO;
/* 150 */               iilO1iiol1.I00iio = io1OIO1l0o;
/* 152 */               iilO1iiol1.I00ilI0I1 = oO1il00lI3;
/* 154 */               iilO1iiol1.I00ilO0 = fI000iOII;
/* 156 */               iilO1iiol1.I00ioIO = i5;
/* 160 */               objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilO1iiol1);
/* 164 */               if (objI00000oOI != ii0111o) {
                        }
/* 360 */               return ii0111o;
                    }
/* 42 */            if (i4 == 1) {
/* 77 */                float f = iilO1iiol1.I00ilO0;
/* 79 */                io1OIO1l0o = iilO1iiol1.I00iio;
/* 81 */                OOo0o0oO oOo0o0oO2 = iilO1iiol1.I00iiO;
/* 83 */                Oll11lOlo oll11lOlo3 = iilO1iiol1.I00iiI;
/* 85 */                IlliIl1l11O illiIl1l11O2 = iilO1iiol1.I00iOIl;
/* 87 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 92 */                fI000iOII = f;
/* 93 */                illiIl1l11O = illiIl1l11O2;
/* 94 */                oOo0o0oO = oOo0o0oO2;
/* 95 */                oll11lOlo2 = oll11lOlo3;
/* 168 */               OO1Oooio101 oO1Oooio101 = (OO1Oooio101) objI00000oOI;
/* 170 */               List list = oO1Oooio101.I00000oIO;
/* 175 */               size = list.size();
/* 179 */               oO1il00lI = oO1il00lI3;
/* 181 */               i2 = 0;
                        while (true) {
/* 182 */                   if (i2 < size) {
                            }
/* 203 */                   i2++;
                        }
/* 214 */               oO1il00lI2 = (OO1il00lI) obj;
/* 216 */               if (oO1il00lI2 != null) {
/* 374 */                   return oO1il00lI;
                        }
/* 232 */               if (lI1Ol11OOlll.I0000O(oO1il00lI2)) {
                        }
/* 144 */               iilO1iiol1.I00iOIl = illiIl1l11O;
/* 146 */               iilO1iiol1.I00iiI = oll11lOlo2;
/* 148 */               iilO1iiol1.I00iiO = oOo0o0oO;
/* 150 */               iilO1iiol1.I00iio = io1OIO1l0o;
/* 152 */               iilO1iiol1.I00ilI0I1 = oO1il00lI3;
/* 154 */               iilO1iiol1.I00ilO0 = fI000iOII;
/* 156 */               iilO1iiol1.I00ioIO = i5;
/* 160 */               objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilO1iiol1);
/* 164 */               if (objI00000oOI != ii0111o) {
                        }
/* 360 */               return ii0111o;
                    }
/* 44 */            if (i4 != 2) {
/* 73 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                return null;
                    }
/* 46 */            float f2 = iilO1iiol1.I00ilO0;
/* 48 */            OO1il00lI oO1il00lI4 = iilO1iiol1.I00ilI0I1;
/* 50 */            Io1OIO1l0o io1OIO1l0o2 = iilO1iiol1.I00iio;
/* 52 */            OOo0o0oO oOo0o0oO3 = iilO1iiol1.I00iiO;
/* 54 */            Oll11lOlo oll11lOlo4 = iilO1iiol1.I00iiI;
/* 56 */            IlliIl1l11O illiIl1l11O3 = iilO1iiol1.I00iOIl;
/* 58 */            lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 61 */            char c = 2;
/* 62 */            int i6 = 1;
/* 63 */            oO1il00lI = null;
/* 65 */            long j2 = 0;
/* 66 */            OOo0o0oO oOo0o0oO4 = oOo0o0oO3;
/* 67 */            fI000iOII = f2;
/* 68 */            illiIl1l11O = illiIl1l11O3;
/* 372 */           if (!oO1il00lI4.I0000Il00O()) {
/* 374 */               return oO1il00lI;
                    }
/* 375 */           oO1il00lI3 = oO1il00lI;
/* 377 */           i5 = i6;
/* 378 */           io1OIO1l0o = io1OIO1l0o2;
/* 379 */           oll11lOlo2 = oll11lOlo4;
/* 380 */           oOo0o0oO = oOo0o0oO4;
/* 144 */           iilO1iiol1.I00iOIl = illiIl1l11O;
/* 146 */           iilO1iiol1.I00iiI = oll11lOlo2;
/* 148 */           iilO1iiol1.I00iiO = oOo0o0oO;
/* 150 */           iilO1iiol1.I00iio = io1OIO1l0o;
/* 152 */           iilO1iiol1.I00ilI0I1 = oO1il00lI3;
/* 154 */           iilO1iiol1.I00ilO0 = fI000iOII;
/* 156 */           iilO1iiol1.I00ioIO = i5;
/* 160 */           objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilO1iiol1);
/* 164 */           if (objI00000oOI != ii0111o) {
/* 168 */               OO1Oooio101 oO1Oooio1012 = (OO1Oooio101) objI00000oOI;
/* 170 */               List list2 = oO1Oooio1012.I00000oIO;
/* 175 */               size = list2.size();
/* 179 */               oO1il00lI = oO1il00lI3;
/* 181 */               i2 = 0;
                        while (true) {
/* 182 */                   if (i2 < size) {
/* 210 */                       obj = oO1il00lI;
                                break;
                            }
/* 184 */                   obj = list2.get(i2);
/* 200 */                   if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, oOo0o0oO.I00iOIl)) {
                                break;
                            }
/* 203 */                   i2++;
                        }
/* 214 */               oO1il00lI2 = (OO1il00lI) obj;
/* 216 */               if (oO1il00lI2 != null || oO1il00lI2.I0000Il00O()) {
/* 374 */                   return oO1il00lI;
                        }
/* 232 */               if (lI1Ol11OOlll.I0000O(oO1il00lI2)) {
/* 277 */                   i6 = 1;
/* 282 */                   long jI00000oOI = Io1OIO1l0o.I00000oOI(io1OIO1l0o, lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI2, true), fI000iOII);
/* 299 */                   if ((9223372034707292159L & jI00000oOI) != 9205357640488583168L) {
/* 314 */                       illiIl1l11O.invoke(oO1il00lI2, new Float(Float.intBitsToFloat((int) (jI00000oOI >> 32))));
/* 321 */                       if (oO1il00lI2.I0000Il00O()) {
/* 323 */                           return oO1il00lI2;
                                }
/* 326 */                       io1OIO1l0o.I00iiI = 0L;
/* 328 */                       oO1il00lI3 = oO1il00lI;
/* 330 */                       i5 = 1;
                            } else {
/* 335 */                       j2 = 0;
/* 337 */                       OO1i0l oO1i0l = OO1i0l.I00iiO;
/* 339 */                       iilO1iiol1.I00iOIl = illiIl1l11O;
/* 341 */                       iilO1iiol1.I00iiI = oll11lOlo2;
/* 343 */                       iilO1iiol1.I00iiO = oOo0o0oO;
/* 345 */                       iilO1iiol1.I00iio = io1OIO1l0o;
/* 347 */                       iilO1iiol1.I00ilI0I1 = oO1il00lI2;
/* 349 */                       iilO1iiol1.I00ilO0 = fI000iOII;
/* 351 */                       c = 2;
/* 352 */                       iilO1iiol1.I00ioIO = 2;
/* 358 */                       if (oll11lOlo2.I00000oOI(oO1i0l, iilO1iiol1) != ii0111o) {
/* 361 */                           Oll11lOlo oll11lOlo5 = oll11lOlo2;
/* 363 */                           io1OIO1l0o2 = io1OIO1l0o;
/* 364 */                           oO1il00lI4 = oO1il00lI2;
/* 365 */                           oOo0o0oO4 = oOo0o0oO;
/* 366 */                           oll11lOlo4 = oll11lOlo5;
/* 372 */                           if (!oO1il00lI4.I0000Il00O()) {
                                    }
                                }
                            }
                        } else {
/* 234 */                   List list3 = oO1Oooio1012.I00000oIO;
/* 239 */                   int size2 = list3.size();
/* 243 */                   int i7 = 0;
                            while (true) {
/* 244 */                       if (i7 >= size2) {
/* 261 */                           obj2 = oO1il00lI;
                                    break;
                                }
/* 246 */                       obj2 = list3.get(i7);
/* 255 */                       if (((OO1il00lI) obj2).I0000O) {
                                    break;
                                }
/* 258 */                       i7++;
                            }
/* 263 */                   OO1il00lI oO1il00lI5 = (OO1il00lI) obj2;
/* 265 */                   if (oO1il00lI5 == null) {
/* 374 */                       return oO1il00lI;
                            }
/* 271 */                   oOo0o0oO.I00iOIl = oO1il00lI5.I00000oIO;
/* 328 */                   oO1il00lI3 = oO1il00lI;
/* 330 */                   i5 = 1;
                        }
/* 144 */               iilO1iiol1.I00iOIl = illiIl1l11O;
/* 146 */               iilO1iiol1.I00iiI = oll11lOlo2;
/* 148 */               iilO1iiol1.I00iiO = oOo0o0oO;
/* 150 */               iilO1iiol1.I00iio = io1OIO1l0o;
/* 152 */               iilO1iiol1.I00ilI0I1 = oO1il00lI3;
/* 154 */               iilO1iiol1.I00ilO0 = fI000iOII;
/* 156 */               iilO1iiol1.I00ioIO = i5;
/* 160 */               objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilO1iiol1);
/* 164 */               if (objI00000oOI != ii0111o) {
                        }
                    }
/* 360 */           return ii0111o;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r10v3, types: [OOo0ooi] */
                /* JADX WARN: Type inference failed for: r10v5 */
                /* JADX WARN: Type inference failed for: r10v6 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000O(Oll11lOlo oll11lOlo, long j, IOoilo iOoilo) throws Throwable {
                    IilOI0io iilOI0io;
                    Object obj;
                    OO1il00lI oO1il00lI;
                    OOo0l0ii10l oOo0l0ii10l;
/* 3 */             if (iOoilo instanceof IilOI0io) {
/* 6 */                 iilOI0io = (IilOI0io) iOoilo;
/* 8 */                 int i = iilOI0io.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iilOI0io.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iilOI0io = new IilOI0io(iOoilo);
                        }
                    }
/* 25 */            Object obj2 = iilOI0io.I00iio;
/* 27 */            Object obj3 = Ii0111o.I00iOIl;
/* 29 */            int i2 = iilOI0io.I00ilI0I1;
                    try {
/* 33 */                if (i2 == 0) {
/* 54 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 65 */                    if (!I000OiO(oll11lOlo.I00ilO0.I00oII, j)) {
/* 72 */                        List list = oll11lOlo.I00ilO0.I00oII.I00000oIO;
/* 77 */                        int size = list.size();
/* 81 */                        int i3 = 0;
                                while (true) {
/* 82 */                            if (i3 >= size) {
/* 103 */                               obj = null;
                                        break;
                                    }
/* 84 */                            obj = list.get(i3);
/* 97 */                            if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, j)) {
                                        break;
                                    }
/* 100 */                           i3++;
                                }
/* 105 */                       oO1il00lI = (OO1il00lI) obj;
/* 107 */                       if (oO1il00lI != null) {
/* 112 */                           OOo0ooi oOo0ooi = new OOo0ooi();
/* 117 */                           OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 120 */                           oOo0ooi2.I00iOIl = oO1il00lI;
/* 126 */                           long jI00000oOI = oll11lOlo.I0001Ioi1lo().I00000oOI();
/* 132 */                           OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 137 */                           IlliIl1l11O iilOII = new IilOII(oOo0l0ii10l2, oOo0ooi2, oOo0ooi, null);
/* 140 */                           iilOI0io.I00iOIl = oO1il00lI;
/* 142 */                           iilOI0io.I00iiI = oOo0ooi;
/* 144 */                           iilOI0io.I00iiO = oOo0l0ii10l2;
/* 146 */                           iilOI0io.I00ilI0I1 = 1;
/* 152 */                           if (oll11lOlo.I000II(jI00000oOI, iilOII, iilOI0io) == obj3) {
/* 154 */                               return obj3;
                                    }
/* 155 */                           oOo0l0ii10l = oOo0l0ii10l2;
                                    j = oOo0ooi;
                                }
                            }
/* 32 */                    return null;
                        }
/* 35 */                if (i2 != 1) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                oOo0l0ii10l = iilOI0io.I00iiO;
/* 39 */                OOo0ooi oOo0ooi3 = iilOI0io.I00iiI;
/* 41 */                oO1il00lI = iilOI0io.I00iOIl;
/* 43 */                lIoii1l01l0i.I00000oOI(obj2);
                        j = oOo0ooi3;
/* 158 */               if (oOo0l0ii10l.I00iOIl) {
/* 162 */                   OO1il00lI oO1il00lI2 = (OO1il00lI) j.I00iOIl;
                            return oO1il00lI2 == null ? oO1il00lI : oO1il00lI2;
                        }
/* 32 */                return null;
                    } catch (OO1i1lOl unused) {
/* 171 */               OO1il00lI oO1il00lI3 = (OO1il00lI) j.I00iOIl;
                        return oO1il00lI3 == null ? oO1il00lI : oO1il00lI3;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00d5 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0164 -> B:62:0x016a). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000oI00(Oll11lOlo oll11lOlo, long j, O1IIii o1IIii, I1oI1lil i1oI1lil) throws Throwable {
                    IilOIIIiIO iilOIIIiIO;
                    Oll11lOlo oll11lOlo2;
                    float fI0001Ioi1lo;
                    OOo0o0oO oOo0o0oO;
                    Io1OIO1l0o io1OIO1l0o;
                    IlliIl1l11O illiIl1l11O;
                    OOo0o0oO oOo0o0oO2;
                    Oll11lOlo oll11lOlo3;
                    OOo0o0oO oOo0o0oO3;
                    int size;
                    OO1il00lI oO1il00lI;
                    int i;
                    Object obj;
                    OO1il00lI oO1il00lI2;
                    Object obj2;
                    Object objI00000oOI;
/* 7 */             if (i1oI1lil instanceof IilOIIIiIO) {
/* 10 */                iilOIIIiIO = (IilOIIIiIO) i1oI1lil;
/* 12 */                int i2 = iilOIIIiIO.I00ioIO;
/* 18 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 21 */                    iilOIIIiIO.I00ioIO = i2 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iilOIIIiIO = new IilOIIIiIO(i1oI1lil);
                        }
                    }
/* 29 */            Object obj3 = iilOIIIiIO.I00io1l;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i3 = iilOIIIiIO.I00ioIO;
/* 38 */            int i4 = 1;
/* 39 */            OO1il00lI oO1il00lI3 = null;
/* 40 */            if (i3 == 0) {
/* 101 */               lIoii1l01l0i.I00000oOI(obj3);
/* 104 */               oll11lOlo2 = oll11lOlo;
/* 114 */               if (I000OiO(oll11lOlo2.I00ilO0.I00oII, j)) {
/* 39 */                    return null;
                        }
/* 124 */               fI0001Ioi1lo = oll11lOlo2.I0001Ioi1lo().I0001Ioi1lo();
/* 130 */               oOo0o0oO = new OOo0o0oO();
/* 133 */               oOo0o0oO.I00iOIl = j;
/* 137 */               io1OIO1l0o = new Io1OIO1l0o(0L, (OIilII) null);
/* 141 */               illiIl1l11O = o1IIii;
/* 143 */               iilOIIIiIO.I00iOIl = illiIl1l11O;
/* 145 */               iilOIIIiIO.I00iiI = oll11lOlo2;
/* 147 */               iilOIIIiIO.I00iiO = oOo0o0oO;
/* 149 */               iilOIIIiIO.I00iio = io1OIO1l0o;
/* 151 */               iilOIIIiIO.I00ilI0I1 = oO1il00lI3;
/* 153 */               iilOIIIiIO.I00ilO0 = fI0001Ioi1lo;
/* 155 */               iilOIIIiIO.I00ioIO = i4;
/* 159 */               objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilOIIIiIO);
/* 163 */               if (objI00000oOI != ii0111o) {
                        }
/* 356 */               return ii0111o;
                    }
/* 42 */            if (i3 == 1) {
/* 81 */                float f = iilOIIIiIO.I00ilO0;
/* 83 */                io1OIO1l0o = iilOIIIiIO.I00iio;
/* 85 */                OOo0o0oO oOo0o0oO4 = iilOIIIiIO.I00iiO;
/* 87 */                oll11lOlo3 = iilOIIIiIO.I00iiI;
/* 89 */                IlliIl1l11O illiIl1l11O2 = iilOIIIiIO.I00iOIl;
/* 91 */                lIoii1l01l0i.I00000oOI(obj3);
/* 94 */                oOo0o0oO2 = oOo0o0oO4;
/* 96 */                fI0001Ioi1lo = f;
/* 97 */                illiIl1l11O = illiIl1l11O2;
/* 98 */                oOo0o0oO3 = oOo0o0oO2;
/* 172 */               OO1Oooio101 oO1Oooio101 = (OO1Oooio101) obj3;
/* 174 */               List list = oO1Oooio101.I00000oIO;
/* 179 */               size = list.size();
/* 183 */               oO1il00lI = oO1il00lI3;
/* 185 */               i = 0;
                        while (true) {
/* 186 */                   if (i < size) {
                            }
/* 207 */                   i++;
                        }
/* 218 */               oO1il00lI2 = (OO1il00lI) obj;
/* 220 */               if (oO1il00lI2 != null) {
/* 369 */                   return oO1il00lI;
                        }
/* 236 */               if (lI1Ol11OOlll.I0000O(oO1il00lI2)) {
                        }
/* 143 */               iilOIIIiIO.I00iOIl = illiIl1l11O;
/* 145 */               iilOIIIiIO.I00iiI = oll11lOlo2;
/* 147 */               iilOIIIiIO.I00iiO = oOo0o0oO;
/* 149 */               iilOIIIiIO.I00iio = io1OIO1l0o;
/* 151 */               iilOIIIiIO.I00ilI0I1 = oO1il00lI3;
/* 153 */               iilOIIIiIO.I00ilO0 = fI0001Ioi1lo;
/* 155 */               iilOIIIiIO.I00ioIO = i4;
/* 159 */               objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilOIIIiIO);
/* 163 */               if (objI00000oOI != ii0111o) {
                        }
/* 356 */               return ii0111o;
                    }
/* 44 */            if (i3 != 2) {
/* 77 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                return null;
                    }
/* 46 */            float f2 = iilOIIIiIO.I00ilO0;
/* 48 */            OO1il00lI oO1il00lI4 = iilOIIIiIO.I00ilI0I1;
/* 50 */            Io1OIO1l0o io1OIO1l0o2 = iilOIIIiIO.I00iio;
/* 52 */            OOo0o0oO oOo0o0oO5 = iilOIIIiIO.I00iiO;
/* 54 */            Oll11lOlo oll11lOlo4 = iilOIIIiIO.I00iiI;
/* 56 */            IlliIl1l11O illiIl1l11O3 = iilOIIIiIO.I00iOIl;
/* 58 */            lIoii1l01l0i.I00000oOI(obj3);
/* 63 */            oOo0o0oO3 = oOo0o0oO5;
/* 64 */            oll11lOlo3 = oll11lOlo4;
/* 66 */            char c = 2;
/* 67 */            int i5 = 1;
/* 68 */            oO1il00lI = null;
/* 70 */            long j2 = 0;
/* 71 */            float f3 = f2;
/* 72 */            illiIl1l11O = illiIl1l11O3;
/* 367 */           if (!oO1il00lI4.I0000Il00O()) {
/* 369 */               return oO1il00lI;
                    }
/* 370 */           oO1il00lI3 = oO1il00lI;
/* 372 */           i4 = i5;
/* 373 */           io1OIO1l0o = io1OIO1l0o2;
/* 374 */           fI0001Ioi1lo = f3;
/* 376 */           oll11lOlo2 = oll11lOlo3;
/* 377 */           oOo0o0oO = oOo0o0oO3;
/* 143 */           iilOIIIiIO.I00iOIl = illiIl1l11O;
/* 145 */           iilOIIIiIO.I00iiI = oll11lOlo2;
/* 147 */           iilOIIIiIO.I00iiO = oOo0o0oO;
/* 149 */           iilOIIIiIO.I00iio = io1OIO1l0o;
/* 151 */           iilOIIIiIO.I00ilI0I1 = oO1il00lI3;
/* 153 */           iilOIIIiIO.I00ilO0 = fI0001Ioi1lo;
/* 155 */           iilOIIIiIO.I00ioIO = i4;
/* 159 */           objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilOIIIiIO);
/* 163 */           if (objI00000oOI != ii0111o) {
/* 167 */               oOo0o0oO2 = oOo0o0oO;
/* 169 */               oll11lOlo3 = oll11lOlo2;
/* 170 */               obj3 = objI00000oOI;
/* 98 */                oOo0o0oO3 = oOo0o0oO2;
/* 172 */               OO1Oooio101 oO1Oooio1012 = (OO1Oooio101) obj3;
/* 174 */               List list2 = oO1Oooio1012.I00000oIO;
/* 179 */               size = list2.size();
/* 183 */               oO1il00lI = oO1il00lI3;
/* 185 */               i = 0;
                        while (true) {
/* 186 */                   if (i < size) {
/* 214 */                       obj = oO1il00lI;
                                break;
                            }
/* 188 */                   obj = list2.get(i);
/* 204 */                   if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, oOo0o0oO3.I00iOIl)) {
                                break;
                            }
/* 207 */                   i++;
                        }
/* 218 */               oO1il00lI2 = (OO1il00lI) obj;
/* 220 */               if (oO1il00lI2 != null || oO1il00lI2.I0000Il00O()) {
/* 369 */                   return oO1il00lI;
                        }
/* 236 */               if (lI1Ol11OOlll.I0000O(oO1il00lI2)) {
/* 280 */                   i5 = 1;
/* 285 */                   long jI00000oOI = Io1OIO1l0o.I00000oOI(io1OIO1l0o, lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI2, true), fI0001Ioi1lo);
/* 302 */                   if ((9223372034707292159L & jI00000oOI) != 9205357640488583168L) {
/* 308 */                       illiIl1l11O.invoke(oO1il00lI2, OIOlIiiioi.I00000oIO(jI00000oOI));
/* 315 */                       if (oO1il00lI2.I0000Il00O()) {
/* 317 */                           return oO1il00lI2;
                                }
/* 320 */                       io1OIO1l0o.I00iiI = 0L;
/* 322 */                       oO1il00lI3 = oO1il00lI;
/* 324 */                       i4 = 1;
/* 326 */                       oll11lOlo2 = oll11lOlo3;
/* 327 */                       oOo0o0oO = oOo0o0oO3;
                            } else {
/* 331 */                       j2 = 0;
/* 333 */                       OO1i0l oO1i0l = OO1i0l.I00iiO;
/* 335 */                       iilOIIIiIO.I00iOIl = illiIl1l11O;
/* 337 */                       iilOIIIiIO.I00iiI = oll11lOlo3;
/* 339 */                       iilOIIIiIO.I00iiO = oOo0o0oO3;
/* 341 */                       iilOIIIiIO.I00iio = io1OIO1l0o;
/* 343 */                       iilOIIIiIO.I00ilI0I1 = oO1il00lI2;
/* 345 */                       iilOIIIiIO.I00ilO0 = fI0001Ioi1lo;
/* 347 */                       c = 2;
/* 348 */                       iilOIIIiIO.I00ioIO = 2;
/* 354 */                       if (oll11lOlo3.I00000oOI(oO1i0l, iilOIIIiIO) != ii0111o) {
/* 357 */                           float f4 = fI0001Ioi1lo;
/* 359 */                           io1OIO1l0o2 = io1OIO1l0o;
/* 360 */                           oO1il00lI4 = oO1il00lI2;
/* 361 */                           f3 = f4;
/* 367 */                           if (!oO1il00lI4.I0000Il00O()) {
                                    }
                                }
                            }
                        } else {
/* 238 */                   List list3 = oO1Oooio1012.I00000oIO;
/* 243 */                   int size2 = list3.size();
/* 247 */                   int i6 = 0;
                            while (true) {
/* 248 */                       if (i6 >= size2) {
/* 265 */                           obj2 = oO1il00lI;
                                    break;
                                }
/* 250 */                       obj2 = list3.get(i6);
/* 259 */                       if (((OO1il00lI) obj2).I0000O) {
                                    break;
                                }
/* 262 */                       i6++;
                            }
/* 267 */                   OO1il00lI oO1il00lI5 = (OO1il00lI) obj2;
/* 269 */                   if (oO1il00lI5 == null) {
/* 369 */                       return oO1il00lI;
                            }
/* 274 */                   oOo0o0oO3.I00iOIl = oO1il00lI5.I00000oIO;
/* 322 */                   oO1il00lI3 = oO1il00lI;
/* 324 */                   i4 = 1;
/* 326 */                   oll11lOlo2 = oll11lOlo3;
/* 327 */                   oOo0o0oO = oOo0o0oO3;
                        }
/* 143 */               iilOIIIiIO.I00iOIl = illiIl1l11O;
/* 145 */               iilOIIIiIO.I00iiI = oll11lOlo2;
/* 147 */               iilOIIIiIO.I00iiO = oOo0o0oO;
/* 149 */               iilOIIIiIO.I00iio = io1OIO1l0o;
/* 151 */               iilOIIIiIO.I00ilI0I1 = oO1il00lI3;
/* 153 */               iilOIIIiIO.I00ilO0 = fI0001Ioi1lo;
/* 155 */               iilOIIIiIO.I00ioIO = i4;
/* 159 */               objI00000oOI = oll11lOlo2.I00000oOI(OO1i0l.I00iiI, iilOIIIiIO);
/* 163 */               if (objI00000oOI != ii0111o) {
                        }
                    }
/* 356 */           return ii0111o;
                }

                public static final Object I0001Ioi1lo(OO1io0l0 oO1io0l0, Function1 function1, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             I0iII1i10I i0iII1i10I = new I0iII1i10I(7);
/* 7 */             i0iII1i10I.I00iiI = function1;
/* 9 */             VarHandle.storeStoreFence();
/* 15 */            I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(1);
/* 18 */            i11i0ol0l0.I00iiI = illOOo00lI;
/* 20 */            VarHandle.storeStoreFence();
/* 38 */            Object objI0000Il00O = ililI0.I0000Il00O(oO1io0l0, new IilOIol0lOl(new IOlIlo1(18), i0iII1i10I, illiIl1l11O, illOOo00lI2, i11i0ol0l0, (IOoil1iiIilo) null), iOoil1iiIilo);
/* 42 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 44 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 46 */            if (objI0000Il00O != ii0111o) {
/* 49 */                objI0000Il00O = ooiIlOl1iI;
                    }
                    return objI0000Il00O == ii0111o ? objI0000Il00O : ooiIlOl1iI;
                }

                public static Object I000II(OO1io0l0 oO1io0l0, O1lIIi o1lIIi, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 1 */             int i2 = 1;
                    Function1 iil0iiOiI = o1lIIi;
/* 3 */             if ((i & 1) != 0) {
/* 7 */                 iil0iiOiI = new Iil0iiOiI(i2);
                    }
/* 28 */            return I0001Ioi1lo(oO1io0l0, iil0iiOiI, new IOlIlo1(16), new IOlIlo1(17), illiIl1l11O, iOoil1iiIilo);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000O01llI0(Oll11lOlo oll11lOlo, long j, Function1 function1, IOoilo iOoilo) throws Throwable {
                    IilOil iilOil;
                    OO1il00lI oO1il00lI;
/* 3 */             if (iOoilo instanceof IilOil) {
/* 6 */                 iilOil = (IilOil) iOoilo;
/* 8 */                 int i = iilOil.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iilOil.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iilOil = new IilOil(iOoilo);
                        }
                    }
/* 25 */            Object objI00000oOI = iilOil.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iilOil.I00iio;
/* 32 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 56 */                iilOil.I00iOIl = oll11lOlo;
/* 58 */                iilOil.I00iiI = function1;
/* 60 */                iilOil.I00iio = 1;
/* 62 */                objI00000oOI = I00000oOI(oll11lOlo, j, iilOil);
/* 66 */                if (objI00000oOI == ii0111o) {
                        }
/* 69 */                oO1il00lI = (OO1il00lI) objI00000oOI;
/* 71 */                if (oO1il00lI == null) {
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                Function1 function12 = iilOil.I00iiI;
/* 38 */                Oll11lOlo oll11lOlo2 = iilOil.I00iOIl;
/* 40 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 43 */                function1 = function12;
/* 44 */                oll11lOlo = oll11lOlo2;
/* 69 */                oO1il00lI = (OO1il00lI) objI00000oOI;
/* 71 */                if (oO1il00lI == null) {
/* 80 */                    if (lI1Ol11OOlll.I0000O(oO1il00lI)) {
/* 82 */                        return Boolean.TRUE;
                            }
/* 85 */                    function1.invoke(oO1il00lI);
/* 88 */                    j = oO1il00lI.I00000oIO;
/* 56 */                    iilOil.I00iOIl = oll11lOlo;
/* 58 */                    iilOil.I00iiI = function1;
/* 60 */                    iilOil.I00iio = 1;
/* 62 */                    objI00000oOI = I00000oOI(oll11lOlo, j, iilOil);
/* 66 */                    if (objI00000oOI == ii0111o) {
/* 68 */                        return ii0111o;
                            }
/* 69 */                    oO1il00lI = (OO1il00lI) objI00000oOI;
/* 71 */                    if (oO1il00lI == null) {
/* 73 */                        return Boolean.FALSE;
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
                
                    if (r0 == 0.0f) goto L57;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00a7 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Type inference failed for: r10v1 */
                /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function1] */
                /* JADX WARN: Type inference failed for: r10v6 */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007e). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000OOo1O(Oll11lOlo oll11lOlo, long j, Iil1olo iil1olo, I1oI1lil i1oI1lil) throws Throwable {
                    IilOio1 iilOio1;
                    Oll11lOlo oll11lOlo2;
                    long j2;
                    IilOio1 iilOio12;
                    OIilII oIilII;
                    Iil1olo iil1olo2;
                    int i;
                    OOo0o0oO oOo0o0oO;
                    OIilII oIilII2;
                    Oll11lOlo oll11lOlo3;
                    Object objI00000oOI;
                    Oll11lOlo oll11lOlo4;
                    Object obj;
                    float fIntBitsToFloat;
                    Object obj2;
/* 5 */             if (i1oI1lil instanceof IilOio1) {
/* 8 */                 iilOio1 = (IilOio1) i1oI1lil;
/* 10 */                int i2 = iilOio1.I00io1l;
/* 16 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 19 */                    iilOio1.I00io1l = i2 - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iilOio1 = new IilOio1(i1oI1lil);
                        }
                    }
/* 27 */            Object obj3 = iilOio1.I00ilO0;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i3 = iilOio1.I00io1l;
/* 33 */            OO1il00lI oO1il00lI = null;
/* 34 */            int i4 = 1;
/* 35 */            if (i3 != 0) {
/* 37 */                if (i3 != 1) {
/* 60 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                OOo0o0oO oOo0o0oO2 = iilOio1.I00ilI0I1;
/* 41 */                oll11lOlo3 = iilOio1.I00iio;
/* 43 */                oIilII2 = iilOio1.I00iiO;
/* 45 */                Oll11lOlo oll11lOlo5 = iilOio1.I00iiI;
/* 47 */                Function1 function1 = iilOio1.I00iOIl;
/* 49 */                lIoii1l01l0i.I00000oOI(obj3);
/* 54 */                OOo0o0oO oOo0o0oO3 = oOo0o0oO2;
/* 55 */                oll11lOlo2 = oll11lOlo5;
                        ?? r10 = function1;
/* 127 */               OO1Oooio101 oO1Oooio101 = (OO1Oooio101) obj3;
/* 129 */               List list = oO1Oooio101.I00000oIO;
/* 134 */               int size = list.size();
/* 138 */               int i5 = 0;
                        while (true) {
/* 139 */                   if (i5 < size) {
/* 168 */                       oll11lOlo4 = oll11lOlo3;
/* 170 */                       obj = null;
                                break;
                            }
/* 141 */                   obj = list.get(i5);
/* 150 */                   oll11lOlo4 = oll11lOlo3;
/* 158 */                   if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, oOo0o0oO3.I00iOIl)) {
                                break;
                            }
/* 161 */                   i5++;
/* 163 */                   oll11lOlo3 = oll11lOlo4;
                        }
/* 171 */               OO1il00lI oO1il00lI2 = (OO1il00lI) obj;
/* 173 */               if (oO1il00lI2 == null) {
/* 182 */                   if (lI1Ol11OOlll.I0000O(oO1il00lI2)) {
/* 184 */                       List list2 = oO1Oooio101.I00000oIO;
/* 189 */                       int size2 = list2.size();
/* 193 */                       int i6 = 0;
                                while (true) {
/* 194 */                           if (i6 >= size2) {
/* 211 */                               obj2 = null;
                                        break;
                                    }
/* 196 */                           obj2 = list2.get(i6);
/* 205 */                           if (((OO1il00lI) obj2).I0000O) {
                                        break;
                                    }
/* 208 */                           i6++;
                                }
/* 212 */                       OO1il00lI oO1il00lI3 = (OO1il00lI) obj2;
/* 214 */                       if (oO1il00lI3 != null) {
/* 219 */                           oOo0o0oO3.I00iOIl = oO1il00lI3.I00000oIO;
/* 221 */                           i = 1;
                                }
                            } else {
/* 223 */                       i = 1;
/* 224 */                       long jI0001Ioi1lo = lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI2, true);
/* 228 */                       if (oIilII2 != null) {
/* 246 */                           fIntBitsToFloat = Float.intBitsToFloat((int) (oIilII2 == OIilII.I00iOIl ? jI0001Ioi1lo & 4294967295L : jI0001Ioi1lo >> 32));
                                } else {
/* 230 */                           fIntBitsToFloat = OIOlIiiioi.I0000oI00(jI0001Ioi1lo);
                                }
                            }
/* 260 */                   oll11lOlo3 = oll11lOlo4;
/* 262 */                   iil1olo2 = r10;
/* 263 */                   i4 = i;
/* 265 */                   oOo0o0oO = oOo0o0oO3;
/* 100 */                   iilOio1.I00iOIl = iil1olo2;
/* 102 */                   iilOio1.I00iiI = oll11lOlo2;
/* 104 */                   iilOio1.I00iiO = oIilII2;
/* 106 */                   iilOio1.I00iio = oll11lOlo3;
/* 108 */                   iilOio1.I00ilI0I1 = oOo0o0oO;
/* 110 */                   iilOio1.I00io1l = i4;
/* 114 */                   objI00000oOI = oll11lOlo3.I00000oOI(OO1i0l.I00iiI, iilOio1);
/* 118 */                   if (objI00000oOI == ii0111o) {
/* 120 */                       return ii0111o;
                            }
/* 121 */                   OOo0o0oO oOo0o0oO4 = oOo0o0oO;
/* 123 */                   r10 = iil1olo2;
/* 124 */                   obj3 = objI00000oOI;
/* 125 */                   oOo0o0oO3 = oOo0o0oO4;
/* 127 */                   OO1Oooio101 oO1Oooio1012 = (OO1Oooio101) obj3;
/* 129 */                   List list3 = oO1Oooio1012.I00000oIO;
/* 134 */                   int size3 = list3.size();
/* 138 */                   int i52 = 0;
                            while (true) {
/* 139 */                       if (i52 < size3) {
                                }
/* 161 */                       i52++;
/* 163 */                       oll11lOlo3 = oll11lOlo4;
                            }
/* 171 */                   OO1il00lI oO1il00lI22 = (OO1il00lI) obj;
/* 173 */                   if (oO1il00lI22 == null) {
/* 175 */                       oO1il00lI22 = null;
                            }
                        }
/* 176 */               i = 1;
/* 268 */               if (oO1il00lI22 == null || oO1il00lI22.I0000Il00O()) {
/* 270 */                   oO1il00lI = null;
                        } else if (lI1Ol11OOlll.I0000O(oO1il00lI22)) {
/* 285 */                   oO1il00lI = oO1il00lI22;
                        } else {
/* 296 */                   r10.invoke(oO1il00lI22);
/* 301 */                   iilOio12 = iilOio1;
/* 302 */                   oIilII = oIilII2;
/* 303 */                   iil1olo2 = r10;
/* 304 */                   i4 = i;
/* 299 */                   j2 = oO1il00lI22.I00000oIO;
/* 92 */                    oOo0o0oO = new OOo0o0oO();
/* 95 */                    oOo0o0oO.I00iOIl = j2;
/* 97 */                    oIilII2 = oIilII;
/* 98 */                    iilOio1 = iilOio12;
/* 99 */                    oll11lOlo3 = oll11lOlo2;
/* 100 */                   iilOio1.I00iOIl = iil1olo2;
/* 102 */                   iilOio1.I00iiI = oll11lOlo2;
/* 104 */                   iilOio1.I00iiO = oIilII2;
/* 106 */                   iilOio1.I00iio = oll11lOlo3;
/* 108 */                   iilOio1.I00ilI0I1 = oOo0o0oO;
/* 110 */                   iilOio1.I00io1l = i4;
/* 114 */                   objI00000oOI = oll11lOlo3.I00000oOI(OO1i0l.I00iiI, iilOio1);
/* 118 */                   if (objI00000oOI == ii0111o) {
                            }
                        }
/* 291 */               return Boolean.valueOf((boolean) (oO1il00lI == null ? i : 0));
                    }
/* 64 */            lIoii1l01l0i.I00000oOI(obj3);
/* 67 */            OIilII oIilII3 = OIilII.I00iiI;
/* 69 */            oll11lOlo2 = oll11lOlo;
/* 75 */            j2 = j;
/* 81 */            if (I000OiO(oll11lOlo2.I00ilO0.I00oII, j2)) {
/* 83 */                i = 1;
/* 291 */               return Boolean.valueOf((boolean) (oO1il00lI == null ? i : 0));
                    }
/* 86 */            iilOio12 = iilOio1;
/* 87 */            oIilII = oIilII3;
/* 88 */            iil1olo2 = iil1olo;
/* 92 */            oOo0o0oO = new OOo0o0oO();
/* 95 */            oOo0o0oO.I00iOIl = j2;
/* 97 */            oIilII2 = oIilII;
/* 98 */            iilOio1 = iilOio12;
/* 99 */            oll11lOlo3 = oll11lOlo2;
/* 100 */           iilOio1.I00iOIl = iil1olo2;
/* 102 */           iilOio1.I00iiI = oll11lOlo2;
/* 104 */           iilOio1.I00iiO = oIilII2;
/* 106 */           iilOio1.I00iio = oll11lOlo3;
/* 108 */           iilOio1.I00ilI0I1 = oOo0o0oO;
/* 110 */           iilOio1.I00io1l = i4;
/* 114 */           objI00000oOI = oll11lOlo3.I00000oOI(OO1i0l.I00iiI, iilOio1);
/* 118 */           if (objI00000oOI == ii0111o) {
                    }
                }

                public static final boolean I000OiO(OO1Oooio101 oO1Oooio101, long j) {
                    Object obj;
/* 1 */             List list = oO1Oooio101.I00000oIO;
/* 6 */             int size = list.size();
/* 10 */            boolean z = false;
/* 11 */            int i = 0;
                    while (true) {
/* 12 */                if (i >= size) {
/* 33 */                    obj = null;
                            break;
                        }
/* 14 */                obj = list.get(i);
/* 27 */                if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, j)) {
                            break;
                        }
/* 30 */                i++;
                    }
/* 34 */            OO1il00lI oO1il00lI = (OO1il00lI) obj;
/* 37 */            if (oO1il00lI != null && oO1il00lI.I0000O) {
/* 43 */                z = true;
                    }
/* 44 */            return true ^ z;
                }

                public static final float I000iOII(Oooii1o1 oooii1o1, int i) {
                    return i == 2 ? oooii1o1.I0001Ioi1lo() * I00000oIO : oooii1o1.I0001Ioi1lo();
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x041a -> B:91:0x03c8). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0458 -> B:164:0x05bc). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0462 -> B:117:0x0477). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0599 -> B:159:0x059f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x05b4 -> B:164:0x05bc). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0616 -> B:174:0x0619). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0235 -> B:31:0x0236). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02ce -> B:31:0x0236). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0328 -> B:77:0x0390). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x037c -> B:74:0x0385). Please report as a decompilation issue!!! */
                public static final java.lang.Object I000l1(p000.Oll11lOlo r26, p000.OO1il00lI r27, p000.IOlIlo1 r28, p000.I0iII1i10I r29, p000.IlliIl1l11O r30, p000.IllOOo00lI r31, p000.I11i0ol0l0 r32, p000.I1oI1lil r33) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 1770
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.IilOo0l01l.I000l1(Oll11lOlo, OO1il00lI, IOlIlo1, I0iII1i10I, IlliIl1l11O, IllOOo00lI, I11i0ol0l0, I1oI1lil):java.lang.Object");
                }
            }
