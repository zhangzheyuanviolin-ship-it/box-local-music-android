            package p000;

            import java.util.List;
            
            public final class IilOII extends Oi10IOIi implements IlliIl1l11O {
                public OO1Oooio101 I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public final OOo0l0ii10l I00ilO0;
                public final OOo0ooi I00io1l;
                public final OOo0ooi I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IilOII(OOo0l0ii10l oOo0l0ii10l, OOo0ooi oOo0ooi, OOo0ooi oOo0ooi2, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ilO0 = oOo0l0ii10l;
/* 3 */             this.I00io1l = oOo0ooi;
/* 5 */             this.I00ioIO = oOo0ooi2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             IilOII iilOII = new IilOII(this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo);
/* 12 */            iilOII.I00ilI0I1 = obj;
/* 37 */            return iilOII;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IilOII) create((Oll11lOlo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
                
                    r2 = 1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00d7 A[EDGE_INSN: B:69:0x00d7->B:45:0x00d7 BREAK  A[LOOP:0: B:40:0x00c4->B:44:0x00d4], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x006b A[SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b5 -> B:39:0x00b8). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Oll11lOlo oll11lOlo;
                    int i;
                    Object objI00000oOI;
                    OO1Oooio101 oO1Oooio101;
                    int size;
                    int i2;
                    int size2;
                    int i3;
                    Object objI00000oOI2;
                    Object obj2;
                    Object obj3;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i4 = this.I00iio;
/* 7 */             OO1Oooio101 oO1Oooio1012 = null;
/* 8 */             int i5 = 2;
/* 9 */             int i6 = 1;
/* 10 */            if (i4 == 0) {
/* 50 */                lIoii1l01l0i.I00000oOI(obj);
/* 55 */                oll11lOlo = (Oll11lOlo) this.I00ilI0I1;
/* 58 */                i = 0;
/* 59 */                if (i != 0) {
                        }
                    } else {
/* 12 */                if (i4 == 1) {
/* 38 */                    i = this.I00iiO;
/* 42 */                    oll11lOlo = (Oll11lOlo) this.I00ilI0I1;
/* 44 */                    lIoii1l01l0i.I00000oOI(obj);
/* 47 */                    objI00000oOI = obj;
/* 78 */                    oO1Oooio101 = (OO1Oooio101) objI00000oOI;
/* 80 */                    List list = oO1Oooio101.I00000oIO;
/* 85 */                    size = list.size();
/* 89 */                    i2 = 0;
                            while (true) {
/* 90 */                        if (i2 >= size) {
                                }
/* 105 */                       i2++;
                            }
/* 109 */                   List list2 = oO1Oooio101.I00000oIO;
/* 114 */                   size2 = list2.size();
/* 119 */                   while (i3 < size2) {
                            }
/* 155 */                   if (oO1Oooio101.I0000Il00O != i5) {
                            }
/* 165 */                   OO1i0l oO1i0l = OO1i0l.I00iiO;
/* 167 */                   this.I00ilI0I1 = oll11lOlo;
/* 169 */                   this.I00iiI = oO1Oooio101;
/* 171 */                   this.I00iiO = i;
/* 173 */                   this.I00iio = i5;
/* 175 */                   objI00000oOI2 = oll11lOlo.I00000oOI(oO1i0l, this);
/* 179 */                   if (objI00000oOI2 != ii0111o) {
                            }
/* 181 */                   return ii0111o;
                        }
/* 14 */                if (i4 != 2) {
/* 34 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        }
/* 16 */                i = this.I00iiO;
/* 18 */                OO1Oooio101 oO1Oooio1013 = this.I00iiI;
/* 22 */                Oll11lOlo oll11lOlo2 = (Oll11lOlo) this.I00ilI0I1;
/* 24 */                lIoii1l01l0i.I00000oOI(obj);
/* 27 */                int i7 = 1;
/* 28 */                objI00000oOI2 = obj;
/* 187 */               List list3 = ((OO1Oooio101) objI00000oOI2).I00000oIO;
/* 192 */               int size3 = list3.size();
/* 196 */               int i8 = 0;
                        while (true) {
/* 197 */                   if (i8 >= size3) {
                                break;
                            }
/* 209 */                   if (((OO1il00lI) list3.get(i8)).I0000Il00O()) {
/* 211 */                       i = i7;
                                break;
                            }
/* 213 */                   i8++;
                        }
/* 216 */               OOo0ooi oOo0ooi = this.I00io1l;
/* 224 */               boolean zI000OiO = IilOo0l01l.I000OiO(oO1Oooio1013, ((OO1il00lI) oOo0ooi.I00iOIl).I00000oIO);
/* 228 */               List list4 = oO1Oooio1013.I00000oIO;
/* 230 */               OOo0ooi oOo0ooi2 = this.I00ioIO;
/* 232 */               if (!zI000OiO) {
/* 237 */                   int size4 = list4.size();
/* 241 */                   int i9 = 0;
                            while (true) {
/* 242 */                       if (i9 >= size4) {
/* 259 */                           obj3 = oO1Oooio1012;
                                    break;
                                }
/* 244 */                       obj3 = list4.get(i9);
/* 253 */                       if (((OO1il00lI) obj3).I0000O) {
                                    break;
                                }
/* 256 */                       i9++;
                            }
/* 260 */                   OO1il00lI oO1il00lI = (OO1il00lI) obj3;
/* 262 */                   if (oO1il00lI == null) {
/* 269 */                       i = i7;
/* 270 */                       i6 = i;
/* 271 */                       oll11lOlo = oll11lOlo2;
/* 59 */                        if (i != 0) {
/* 321 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 61 */                        OO1i0l oO1i0l2 = OO1i0l.I00iiI;
/* 63 */                        this.I00ilI0I1 = oll11lOlo;
/* 65 */                        this.I00iiI = oO1Oooio1012;
/* 67 */                        this.I00iiO = i;
/* 69 */                        this.I00iio = i6;
/* 71 */                        objI00000oOI = oll11lOlo.I00000oOI(oO1i0l2, this);
/* 75 */                        if (objI00000oOI != ii0111o) {
/* 78 */                            oO1Oooio101 = (OO1Oooio101) objI00000oOI;
/* 80 */                            List list5 = oO1Oooio101.I00000oIO;
/* 85 */                            size = list5.size();
/* 89 */                            i2 = 0;
                                    while (true) {
/* 90 */                                if (i2 >= size) {
/* 108 */                                   i = i6;
                                            break;
                                        }
/* 102 */                               if (!lI1Ol11OOlll.I0000O((OO1il00lI) list5.get(i2))) {
                                            break;
                                        }
/* 105 */                               i2++;
                                    }
/* 109 */                           List list22 = oO1Oooio101.I00000oIO;
/* 114 */                           size2 = list22.size();
/* 119 */                           for (i3 = 0; i3 < size2; i3++) {
/* 125 */                               OO1il00lI oO1il00lI2 = (OO1il00lI) list22.get(i3);
/* 131 */                               if (oO1il00lI2.I0000Il00O() || lI1Ol11OOlll.I0000oI00(oO1il00lI2, oll11lOlo.I00ilO0.I00olI, oll11lOlo.I0000Il00O())) {
                                            break;
                                        }
                                    }
/* 155 */                           if (oO1Oooio101.I0000Il00O != i5) {
/* 159 */                               i7 = 1;
/* 160 */                               this.I00ilO0.I00iOIl = true;
/* 162 */                               i = 1;
                                    } else {
/* 164 */                               i7 = 1;
                                    }
/* 165 */                           OO1i0l oO1i0l3 = OO1i0l.I00iiO;
/* 167 */                           this.I00ilI0I1 = oll11lOlo;
/* 169 */                           this.I00iiI = oO1Oooio101;
/* 171 */                           this.I00iiO = i;
/* 173 */                           this.I00iio = i5;
/* 175 */                           objI00000oOI2 = oll11lOlo.I00000oOI(oO1i0l3, this);
/* 179 */                           if (objI00000oOI2 != ii0111o) {
/* 183 */                               oll11lOlo2 = oll11lOlo;
/* 184 */                               oO1Oooio1013 = oO1Oooio101;
/* 187 */                               List list32 = ((OO1Oooio101) objI00000oOI2).I00000oIO;
/* 192 */                               int size32 = list32.size();
/* 196 */                               int i82 = 0;
                                        while (true) {
/* 197 */                                   if (i82 >= size32) {
                                            }
/* 213 */                                   i82++;
                                        }
/* 216 */                               OOo0ooi oOo0ooi3 = this.I00io1l;
/* 224 */                               boolean zI000OiO2 = IilOo0l01l.I000OiO(oO1Oooio1013, ((OO1il00lI) oOo0ooi3.I00iOIl).I00000oIO);
/* 228 */                               List list42 = oO1Oooio1013.I00000oIO;
/* 230 */                               OOo0ooi oOo0ooi22 = this.I00ioIO;
/* 232 */                               if (!zI000OiO2) {
/* 277 */                                   int size5 = list42.size();
/* 281 */                                   int i10 = 0;
                                            while (true) {
/* 282 */                                       if (i10 >= size5) {
/* 312 */                                           obj2 = null;
                                                    break;
                                                }
/* 284 */                                       obj2 = list42.get(i10);
/* 303 */                                       if (lI1ioiO0.I00000oIO(((OO1il00lI) obj2).I00000oIO, ((OO1il00lI) oOo0ooi3.I00iOIl).I00000oIO)) {
                                                    break;
                                                }
/* 306 */                                       i10++;
                                            }
/* 313 */                                   oOo0ooi22.I00iOIl = obj2;
                                        }
                                    }
                                }
/* 181 */                       return ii0111o;
                            }
/* 264 */                   oOo0ooi3.I00iOIl = oO1il00lI;
/* 266 */                   oOo0ooi22.I00iOIl = oO1il00lI;
                        }
/* 315 */               oll11lOlo = oll11lOlo2;
/* 316 */               oO1Oooio1012 = null;
/* 317 */               i5 = 2;
/* 318 */               i6 = 1;
/* 59 */                if (i != 0) {
                        }
                    }
                }
            }
