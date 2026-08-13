            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            
            public abstract class lO1Io0iOiI01 {
                /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(Oll11lOlo oll11lOlo, I1oI1lil i1oI1lil) {
                    OiiiOooi1 oiiiOooi1;
                    int size;
                    int i;
/* 3 */             if (i1oI1lil instanceof OiiiOooi1) {
/* 6 */                 oiiiOooi1 = (OiiiOooi1) i1oI1lil;
/* 8 */                 int i2 = oiiiOooi1.I00iiO;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiiiOooi1.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiiiOooi1 = new OiiiOooi1(i1oI1lil);
                        }
                    }
/* 25 */            Object objI00000oOI = oiiiOooi1.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = oiiiOooi1.I00iiO;
/* 32 */            if (i3 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 52 */                OO1i0l oO1i0l = OO1i0l.I00iiI;
/* 54 */                oiiiOooi1.I00iOIl = oll11lOlo;
/* 56 */                oiiiOooi1.I00iiO = 1;
/* 58 */                objI00000oOI = oll11lOlo.I00000oOI(oO1i0l, oiiiOooi1);
/* 62 */                if (objI00000oOI == ii0111o) {
                        }
/* 65 */                OO1Oooio101 oO1Oooio101 = (OO1Oooio101) objI00000oOI;
/* 67 */                List list = oO1Oooio101.I00000oIO;
/* 72 */                size = list.size();
/* 76 */                i = 0;
/* 77 */                while (i < size) {
                        }
/* 106 */               return oO1Oooio101;
                    }
/* 34 */            if (i3 != 1) {
/* 44 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                return null;
                    }
/* 36 */            oll11lOlo = oiiiOooi1.I00iOIl;
/* 38 */            lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 65 */            OO1Oooio101 oO1Oooio1012 = (OO1Oooio101) objI00000oOI;
/* 67 */            List list2 = oO1Oooio1012.I00000oIO;
/* 72 */            size = list2.size();
/* 76 */            i = 0;
/* 77 */            while (i < size) {
/* 89 */                if (lI1Ol11OOlll.I00000oIO((OO1il00lI) list2.get(i))) {
/* 92 */                    i++;
                        } else {
/* 52 */                    OO1i0l oO1i0l2 = OO1i0l.I00iiI;
/* 54 */                    oiiiOooi1.I00iOIl = oll11lOlo;
/* 56 */                    oiiiOooi1.I00iiO = 1;
/* 58 */                    objI00000oOI = oll11lOlo.I00000oOI(oO1i0l2, oiiiOooi1);
/* 62 */                    if (objI00000oOI == ii0111o) {
/* 64 */                        return ii0111o;
                            }
/* 65 */                    OO1Oooio101 oO1Oooio10122 = (OO1Oooio101) objI00000oOI;
/* 67 */                    List list22 = oO1Oooio10122.I00000oIO;
/* 72 */                    size = list22.size();
/* 76 */                    i = 0;
/* 77 */                    while (i < size) {
                            }
                        }
                    }
/* 106 */           return oO1Oooio10122;
                }

                public static final Object I00000oOI(OO1io0l0 oO1io0l0, OI0IIiI1lIol oI0IIiI1lIol, OlooOo olooOo, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             Oll1OII0o oll1OII0o = (Oll1OII0o) oO1io0l0;
/* 6 */             oll1OII0o.getClass();
/* 13 */            Oooii1o1 oooii1o1 = il0lI1i1olii.I000O01llI0(oll1OII0o).I00ooIo0;
/* 17 */            I00Ol00 i00Ol00 = new I00Ol00(5, (short) 0);
/* 20 */            i00Ol00.I0000Il00O = oooii1o1;
/* 22 */            VarHandle.storeStoreFence();
/* 31 */            Object objI0000Il00O = ililI0.I0000Il00O(oO1io0l0, new I1ooIlOiO0iI(i00Ol00, oI0IIiI1lIol, olooOo, null), iOoil1iiIilo);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:20:0x0042, B:31:0x007f, B:33:0x0087, B:35:0x0096, B:37:0x00a2, B:28:0x0060), top: B:69:0x0023 }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0111 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:54:0x00f6, B:56:0x00fe, B:58:0x0102, B:60:0x0111, B:62:0x011d, B:50:0x00c6), top: B:69:0x0023 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(Oll11lOlo oll11lOlo, OI0IIiI1lIol oI0IIiI1lIol, I00Ol00 i00Ol00, OO1Oooio101 oO1Oooio101, I1oI1lil i1oI1lil) throws Throwable {
                    OiiiiIl0oI1l oiiiiIl0oI1l;
                    Oll11lOlo oll11lOlo2;
                    OOo0l0ii10l oOo0l0ii10l;
                    int size;
/* 1 */             OiiOloi1o oiiOloi1o = loIOiIO1O1.I00io1l;
/* 5 */             if (i1oI1lil instanceof OiiiiIl0oI1l) {
/* 8 */                 oiiiiIl0oI1l = (OiiiiIl0oI1l) i1oI1lil;
/* 10 */                int i = oiiiiIl0oI1l.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oiiiiIl0oI1l.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oiiiiIl0oI1l = new OiiiiIl0oI1l(i1oI1lil);
                        }
                    }
/* 27 */            Object objI000O01llI0 = oiiiiIl0oI1l.I00iio;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oiiiiIl0oI1l.I00ilI0I1;
/* 33 */            int i3 = 0;
                    try {
                        try {
/* 36 */                    if (i2 == 0) {
/* 73 */                        lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 82 */                        OO1il00lI oO1il00lI = (OO1il00lI) oO1Oooio101.I00000oIO.get(0);
/* 87 */                        if ((oO1Oooio101.I0000oI00 & 1) == 0) {
/* 178 */                           int i4 = i00Ol00.I00000oOI;
/* 190 */                           OiiOloi1o oiiOloi1o2 = i4 != 1 ? i4 != 2 ? loIOiIO1O1.I00l0I0l0lO1 : loIOiIO1O1.I00ioIO : oiiOloi1o;
/* 197 */                           if (oI0IIiI1lIol.I0000Il00O(oO1il00lI.I0000Il00O, oiiOloi1o2, i4)) {
/* 201 */                               OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 209 */                               oOo0l0ii10l2.I00iOIl = !oiiOloi1o2.equals(oiiOloi1o);
/* 211 */                               long j = oO1il00lI.I00000oIO;
/* 217 */                               O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(10);
/* 220 */                               o11IOOoiI10i.I00iiI = oI0IIiI1lIol;
/* 222 */                               o11IOOoiI10i.I00iiO = oiiOloi1o2;
/* 224 */                               o11IOOoiI10i.I00iio = oOo0l0ii10l2;
/* 226 */                               VarHandle.storeStoreFence();
/* 229 */                               oiiiiIl0oI1l.I00iOIl = oll11lOlo;
/* 231 */                               oiiiiIl0oI1l.I00iiI = oI0IIiI1lIol;
/* 233 */                               oiiiiIl0oI1l.I00iiO = oOo0l0ii10l2;
/* 235 */                               oiiiiIl0oI1l.I00ilI0I1 = 2;
/* 237 */                               objI000O01llI0 = IilOo0l01l.I000O01llI0(oll11lOlo, j, o11IOOoiI10i, oiiiiIl0oI1l);
/* 241 */                               if (objI000O01llI0 != ii0111o) {
/* 245 */                                   oll11lOlo2 = oll11lOlo;
/* 246 */                                   oOo0l0ii10l = oOo0l0ii10l2;
/* 253 */                                   if (((Boolean) objI000O01llI0).booleanValue()) {
/* 263 */                                       List list = oll11lOlo2.I00ilO0.I00oII.I00000oIO;
/* 268 */                                       size = list.size();
/* 272 */                                       while (i3 < size) {
                                                }
                                            }
/* 292 */                                   oI0IIiI1lIol.I00000oOI();
                                        }
/* 243 */                               return ii0111o;
                                    }
                                } else if (oI0IIiI1lIol.I0000oI00(oO1il00lI.I0000Il00O)) {
/* 97 */                            oO1il00lI.I00000oIO();
/* 100 */                           long j2 = oO1il00lI.I00000oIO;
/* 106 */                           OIoO1Ol oIoO1Ol = new OIoO1Ol(23);
/* 109 */                           oIoO1Ol.I00iiI = oI0IIiI1lIol;
/* 111 */                           VarHandle.storeStoreFence();
/* 114 */                           oiiiiIl0oI1l.I00iOIl = oll11lOlo;
/* 116 */                           oiiiiIl0oI1l.I00iiI = oI0IIiI1lIol;
/* 118 */                           oiiiiIl0oI1l.I00ilI0I1 = 1;
/* 120 */                           objI000O01llI0 = IilOo0l01l.I000O01llI0(oll11lOlo, j2, oIoO1Ol, oiiiiIl0oI1l);
/* 124 */                           if (objI000O01llI0 == ii0111o) {
/* 243 */                               return ii0111o;
                                    }
/* 134 */                           if (((Boolean) objI000O01llI0).booleanValue()) {
                                    }
                                }
                            } else if (i2 == 1) {
/* 63 */                        oI0IIiI1lIol = oiiiiIl0oI1l.I00iiI;
/* 65 */                        oll11lOlo = oiiiiIl0oI1l.I00iOIl;
/* 67 */                        lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 134 */                       if (((Boolean) objI000O01llI0).booleanValue()) {
/* 140 */                           List list2 = oll11lOlo.I00ilO0.I00oII.I00000oIO;
/* 145 */                           int size2 = list2.size();
/* 149 */                           while (i3 < size2) {
/* 155 */                               OO1il00lI oO1il00lI2 = (OO1il00lI) list2.get(i3);
/* 161 */                               if (lI1Ol11OOlll.I0000Il00O(oO1il00lI2)) {
/* 163 */                                   oO1il00lI2.I00000oIO();
                                        }
/* 166 */                               i3++;
                                    }
                                }
                            } else {
/* 40 */                        if (i2 != 2) {
/* 58 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 61 */                            return null;
                                }
/* 42 */                        oOo0l0ii10l = oiiiiIl0oI1l.I00iiO;
/* 44 */                        oI0IIiI1lIol = oiiiiIl0oI1l.I00iiI;
/* 46 */                        oll11lOlo2 = oiiiiIl0oI1l.I00iOIl;
/* 48 */                        lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 253 */                       if (((Boolean) objI000O01llI0).booleanValue() && oOo0l0ii10l.I00iOIl) {
/* 263 */                           List list3 = oll11lOlo2.I00ilO0.I00oII.I00000oIO;
/* 268 */                           size = list3.size();
/* 272 */                           while (i3 < size) {
/* 278 */                               OO1il00lI oO1il00lI3 = (OO1il00lI) list3.get(i3);
/* 284 */                               if (lI1Ol11OOlll.I0000Il00O(oO1il00lI3)) {
/* 286 */                                   oO1il00lI3.I00000oIO();
                                        }
/* 289 */                               i3++;
                                    }
                                }
/* 292 */                       oI0IIiI1lIol.I00000oOI();
                            }
/* 300 */                   return OoiIlOl1iI.I00000oIO;
                        } finally {
                        }
                    } finally {
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
                
                    if (r15 == r1) goto L35;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000O(Oll11lOlo oll11lOlo, OlooOo olooOo, OO1Oooio101 oO1Oooio101, I1oI1lil i1oI1lil) throws Throwable {
                    OiiiiooioO oiiiiooioO;
                    OO1il00lI oO1il00lI;
/* 3 */             if (i1oI1lil instanceof OiiiiooioO) {
/* 6 */                 oiiiiooioO = (OiiiiooioO) i1oI1lil;
/* 8 */                 int i = oiiiiooioO.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiiiiooioO.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiiiiooioO = new OiiiiooioO(i1oI1lil);
                        }
                    }
/* 25 */            Object objI0000O = oiiiiooioO.I00iio;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiiiiooioO.I00ilI0I1;
/* 34 */            int i3 = 1;
                    try {
/* 35 */                if (i2 == 0) {
/* 72 */                    lIoii1l01l0i.I00000oOI(objI0000O);
/* 81 */                    oO1il00lI = (OO1il00lI) IOOi0Ool1i.I001lllioOl(oO1Oooio101.I00000oIO);
/* 83 */                    long j = oO1il00lI.I00000oIO;
/* 85 */                    oiiiiooioO.I00iOIl = oll11lOlo;
/* 87 */                    oiiiiooioO.I00iiI = olooOo;
/* 89 */                    oiiiiooioO.I00iiO = oO1il00lI;
/* 91 */                    oiiiiooioO.I00ilI0I1 = 1;
/* 93 */                    objI0000O = IilOo0l01l.I0000O(oll11lOlo, j, oiiiiooioO);
/* 97 */                    if (objI0000O == ii0111o) {
                            }
/* 166 */                   return ii0111o;
                        }
/* 37 */                if (i2 != 1) {
/* 39 */                    if (i2 != 2) {
/* 55 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 41 */                    olooOo = oiiiiooioO.I00iiI;
/* 43 */                    oll11lOlo = oiiiiooioO.I00iOIl;
/* 45 */                    lIoii1l01l0i.I00000oOI(objI0000O);
/* 173 */                   if (((Boolean) objI0000O).booleanValue()) {
/* 179 */                       List list = oll11lOlo.I00ilO0.I00oII.I00000oIO;
/* 184 */                       int size = list.size();
/* 188 */                       for (int i4 = 0; i4 < size; i4++) {
/* 194 */                           OO1il00lI oO1il00lI2 = (OO1il00lI) list.get(i4);
/* 200 */                           if (lI1Ol11OOlll.I0000Il00O(oO1il00lI2)) {
/* 202 */                               oO1il00lI2.I00000oIO();
                                    }
                                }
/* 208 */                       olooOo.I00000oOI();
                            } else {
/* 212 */                       olooOo.onCancel();
                            }
/* 215 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 59 */                OO1il00lI oO1il00lI3 = oiiiiooioO.I00iiO;
/* 61 */                olooOo = oiiiiooioO.I00iiI;
/* 63 */                Oll11lOlo oll11lOlo2 = oiiiiooioO.I00iOIl;
/* 65 */                lIoii1l01l0i.I00000oOI(objI0000O);
/* 69 */                oO1il00lI = oO1il00lI3;
/* 70 */                oll11lOlo = oll11lOlo2;
/* 100 */               OO1il00lI oO1il00lI4 = (OO1il00lI) objI0000O;
/* 102 */               if (oO1il00lI4 != null) {
/* 104 */                   long j2 = oO1il00lI4.I0000Il00O;
/* 133 */                   if (OIOlIiiioi.I0000oI00(OIOlIiiioi.I0001Ioi1lo(oO1il00lI.I0000Il00O, j2)) < IilOo0l01l.I000iOII(oll11lOlo.I0001Ioi1lo(), oO1il00lI.I000OOo1O)) {
/* 137 */                       olooOo.I00000oIO(j2, OiiilIOo.I00000oIO);
/* 140 */                       long j3 = oO1il00lI4.I00000oIO;
/* 144 */                       O1IOi0li o1IOi0li = new O1IOi0li(i3);
/* 147 */                       o1IOi0li.I00iiI = olooOo;
/* 149 */                       VarHandle.storeStoreFence();
/* 152 */                       oiiiiooioO.I00iOIl = oll11lOlo;
/* 154 */                       oiiiiooioO.I00iiI = olooOo;
/* 156 */                       oiiiiooioO.I00iiO = null;
/* 158 */                       oiiiiooioO.I00ilI0I1 = 2;
/* 160 */                       objI0000O = IilOo0l01l.I000O01llI0(oll11lOlo, j3, o1IOi0li, oiiiiooioO);
                            }
                        }
/* 215 */               return OoiIlOl1iI.I00000oIO;
                    } catch (CancellationException e) {
/* 218 */               olooOo.onCancel();
/* 1182 */              throw e;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
                
                    if (r15 == r1) goto L48;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000oI00(Oll11lOlo oll11lOlo, OlooOo olooOo, OO1Oooio101 oO1Oooio101, int i, I1oI1lil i1oI1lil) throws Throwable {
                    Oiiil00 oiiil00;
                    long j;
                    OOo0o0oO oOo0o0oO;
/* 3 */             if (i1oI1lil instanceof Oiiil00) {
/* 6 */                 oiiil00 = (Oiiil00) i1oI1lil;
/* 8 */                 int i2 = oiiil00.I00ilO0;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiiil00.I00ilO0 = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiiil00 = new Oiiil00(i1oI1lil);
                        }
                    }
/* 25 */            Object objI000O01llI0 = oiiil00.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = oiiil00.I00ilO0;
/* 32 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 34 */            int i4 = 2;
                    try {
/* 36 */                if (i3 == 0) {
/* 79 */                    lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 88 */                    OO1il00lI oO1il00lI = (OO1il00lI) IOOi0Ool1i.I001lllioOl(oO1Oooio101.I00000oIO);
/* 90 */                    j = oO1il00lI.I00000oIO;
/* 101 */                   olooOo.I00000oIO(oO1il00lI.I0000Il00O, i > 2 ? loIOiIO1O1.I00l0I0l0lO1 : loIOiIO1O1.I00ioIO);
/* 106 */                   oOo0o0oO = new OOo0o0oO();
/* 114 */                   oOo0o0oO.I00iOIl = 9205357640488583168L;
/* 120 */                   long jI00000oOI = oll11lOlo.I0001Ioi1lo().I00000oOI();
/* 126 */                   OiiilII oiiilII = new OiiilII(j, oOo0o0oO, null);
/* 129 */                   oiiil00.I00iOIl = oll11lOlo;
/* 131 */                   oiiil00.I00iiI = olooOo;
/* 133 */                   oiiil00.I00iiO = oOo0o0oO;
/* 135 */                   oiiil00.I00iio = j;
/* 137 */                   oiiil00.I00ilO0 = 1;
/* 139 */                   objI000O01llI0 = oll11lOlo.I000O01llI0(jI00000oOI, oiiilII, oiiil00);
/* 143 */                   if (objI000O01llI0 == ii0111o) {
                            }
/* 201 */                   return ii0111o;
                        }
/* 38 */                if (i3 != 1) {
/* 40 */                    if (i3 != 2) {
/* 56 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 42 */                    olooOo = oiiil00.I00iiI;
/* 44 */                    oll11lOlo = oiiil00.I00iOIl;
/* 46 */                    lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 208 */                   if (!((Boolean) objI000O01llI0).booleanValue()) {
/* 248 */                       olooOo.onCancel();
/* 251 */                       return ooiIlOl1iI;
                            }
/* 214 */                   List list = oll11lOlo.I00ilO0.I00oII.I00000oIO;
/* 219 */                   int size = list.size();
/* 224 */                   for (int i5 = 0; i5 < size; i5++) {
/* 230 */                       OO1il00lI oO1il00lI2 = (OO1il00lI) list.get(i5);
/* 236 */                       if (lI1Ol11OOlll.I0000Il00O(oO1il00lI2)) {
/* 238 */                           oO1il00lI2.I00000oIO();
                                }
                            }
/* 244 */                   olooOo.I00000oOI();
/* 247 */                   return ooiIlOl1iI;
                        }
/* 60 */                long j2 = oiiil00.I00iio;
/* 62 */                oOo0o0oO = oiiil00.I00iiO;
/* 64 */                OlooOo olooOo2 = oiiil00.I00iiI;
/* 66 */                Oll11lOlo oll11lOlo2 = oiiil00.I00iOIl;
                        try {
/* 68 */                    lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 71 */                    j = j2;
/* 72 */                    olooOo = olooOo2;
/* 73 */                    oll11lOlo = oll11lOlo2;
                        } catch (CancellationException e) {
/* 75 */                    e = e;
/* 76 */                    olooOo = olooOo2;
/* 252 */                   olooOo.onCancel();
/* 399 */                   throw e;
                        }
/* 146 */               Iiioii1il iiioii1il = (Iiioii1il) objI000O01llI0;
/* 148 */               if (iiioii1il == null) {
/* 150 */                   iiioii1il = Iiioii1il.I00iiO;
                        }
/* 154 */               if (iiioii1il == Iiioii1il.I00iio) {
/* 156 */                   olooOo.onCancel();
/* 159 */                   return ooiIlOl1iI;
                        }
/* 162 */               if (iiioii1il == Iiioii1il.I00iOIl) {
/* 164 */                   olooOo.I00000oOI();
/* 167 */                   return ooiIlOl1iI;
                        }
/* 170 */               if (iiioii1il == Iiioii1il.I00iiI) {
/* 174 */                   olooOo.I0000oI00(oOo0o0oO.I00iOIl);
                        }
/* 179 */               O1IOi0li o1IOi0li = new O1IOi0li(i4);
/* 182 */               o1IOi0li.I00iiI = olooOo;
/* 184 */               VarHandle.storeStoreFence();
/* 187 */               oiiil00.I00iOIl = oll11lOlo;
/* 189 */               oiiil00.I00iiI = olooOo;
/* 191 */               oiiil00.I00iiO = null;
/* 193 */               oiiil00.I00ilO0 = 2;
/* 195 */               objI000O01llI0 = IilOo0l01l.I000O01llI0(oll11lOlo, j, o1IOi0li, oiiil00);
                    } catch (CancellationException e2) {
/* 51 */                e = e2;
                    }
                }
            }
