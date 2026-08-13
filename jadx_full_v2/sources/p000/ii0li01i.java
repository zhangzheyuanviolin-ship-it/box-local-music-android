            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class ii0li01i implements ii0oioOi00i {
                public ii00oo I00000oIO;
                public i1i0olI I00000oOI;
                public boolean I0000Il00O;
                public l1I0oI I0000O;

                @Override
                public final void I00000oIO(Object obj) {
/* 3 */             this.I00000oOI.getClass();
/* 9 */             ii10O1i0I ii10o1i0i = ((ii0OoOo10) obj).zzc;
/* 13 */            if (ii10o1i0i.I0000oI00) {
/* 16 */                ii10o1i0i.I0000oI00 = false;
                    }
/* 20 */            this.I0000O.getClass();
/* 27 */            ((ii0Oi0OiillI) obj).zzb.I0000O();
                }

                @Override
                public final void I00000oOI(Object obj, Object obj2) {
/* 1 */             ii0olI1ooOiO.I0010I0i(obj, obj2);
/* 6 */             if (this.I0000Il00O) {
/* 8 */                 ii0olI1ooOiO.I00100o1O0lo(obj, obj2);
                    }
                }

                @Override
                public final void I0000Il00O(Object obj, i0OI1l1Oo i0oi1l1oo) {
/* 6 */             Iterator itI0000Il00O = ((ii0Oi0OiillI) obj).zzb.I0000Il00O();
/* 14 */            if (itI0000Il00O.hasNext()) {
/* 106 */               throw null;
                    }
/* 18 */            ii10O1i0I ii10o1i0i = ((ii0OoOo10) obj).zzc;
/* 23 */            for (int i = 0; i < ii10o1i0i.I00000oIO; i++) {
/* 29 */                int i2 = ii10o1i0i.I00000oOI[i] >>> 3;
/* 33 */                Object obj2 = ii10o1i0i.I0000Il00O[i];
/* 35 */                boolean z = obj2 instanceof ii01lO0l11ii;
/* 39 */                ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 41 */                if (z) {
/* 45 */                    ii0i1il.I00111O(i2, (ii01lO0l11ii) obj2);
                        } else {
/* 51 */                    ii0i1il.I0010o(i2, (ii00oo) obj2);
                        }
                    }
                }

                @Override
                public final boolean I0000O(Object obj) {
/* 5 */             return ((ii0Oi0OiillI) obj).zzb.I0001Ioi1lo();
                }

                @Override
                public final int I0000oI00(ii0OoOo10 ii0oooo10) {
/* 3 */             int iHashCode = ii0oooo10.zzc.hashCode();
/* 9 */             if (!this.I0000Il00O) {
/* 29 */                return iHashCode;
                    }
/* 23 */            return ((ii0Oi0OiillI) ii0oooo10).zzb.I00000oIO.hashCode() + (iHashCode * 53);
                }

                @Override
                public final boolean I0001Ioi1lo(ii0OoOo10 ii0oooo10, ii0OoOo10 ii0oooo102) {
/* 9 */             if (!ii0oooo10.zzc.equals(ii0oooo102.zzc)) {
/* 11 */                return false;
                    }
/* 15 */            if (this.I0000Il00O) {
/* 25 */                return ((ii0Oi0OiillI) ii0oooo10).zzb.equals(((ii0Oi0OiillI) ii0oooo102).zzb);
                    }
/* 30 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0079 A[EDGE_INSN: B:51:0x0079->B:28:0x0079 BREAK  A[LOOP:1: B:14:0x0046->B:54:0x0046], SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws ii0iI11ol {
                    int iI000O01llI0;
/* 1 */             ii00oo ii00ooVar = this.I00000oIO;
/* 4 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) obj;
/* 6 */             ii10O1i0I ii10o1i0iI00000oOI = ii0oooo10.zzc;
/* 10 */            if (ii10o1i0iI00000oOI == ii10O1i0I.I0001Ioi1lo) {
/* 12 */                ii10o1i0iI00000oOI = ii10O1i0I.I00000oOI();
/* 16 */                ii0oooo10.zzc = ii10o1i0iI00000oOI;
                    }
/* 18 */            ii10O1i0I ii10o1i0i = ii10o1i0iI00000oOI;
/* 21 */            ((ii0Oi0OiillI) obj).I00111O();
/* 24 */            while (i < i2) {
/* 26 */                int iI000O01llI02 = lil1OOilooi0.I000O01llI0(bArr, i, i111i0i1);
/* 30 */                int i3 = i111i0i1.I00000oIO;
/* 34 */                ii0II11oi0I ii0ii11oi0i = (ii0II11oi0I) i111i0i1.I0000oI00;
/* 39 */                if (i3 == 11) {
/* 66 */                    byte[] bArr2 = bArr;
/* 67 */                    int i4 = i2;
/* 68 */                    i111i0I1 i111i0i12 = i111i0i1;
/* 69 */                    ii01lO0l11ii ii01lo0l11ii = null;
/* 70 */                    int i5 = 0;
                            while (true) {
/* 71 */                        if (iI000O01llI02 >= i4) {
/* 121 */                           iI000O01llI0 = iI000O01llI02;
                                    break;
                                }
/* 73 */                        iI000O01llI0 = lil1OOilooi0.I000O01llI0(bArr2, iI000O01llI02, i111i0i12);
/* 77 */                        int i6 = i111i0i12.I00000oIO;
/* 79 */                        int i7 = i6 >>> 3;
/* 81 */                        int i8 = i6 & 7;
/* 83 */                        if (i7 != 2) {
/* 86 */                            if (i7 != 3 || i8 != 2) {
/* 114 */                               if (i6 != 12) {
                                            break;
                                        } else {
/* 116 */                                   iI000O01llI02 = lil1OOilooi0.I000o00OoI0I(i6, bArr2, iI000O01llI0, i4, i111i0i12);
                                        }
                                    } else {
/* 91 */                                iI000O01llI02 = lil1OOilooi0.I00000oIO(bArr2, iI000O01llI0, i111i0i12);
/* 97 */                                ii01lo0l11ii = (ii01lO0l11ii) i111i0i12.I0000Il00O;
                                    }
                                } else if (i8 == 0) {
/* 102 */                           iI000O01llI02 = lil1OOilooi0.I000O01llI0(bArr2, iI000O01llI0, i111i0i12);
/* 106 */                           i5 = i111i0i12.I00000oIO;
/* 108 */                           ii0ii11oi0i.I00000oIO(i5, ii00ooVar);
                                } else if (i6 != 12) {
                                }
                            }
/* 122 */                   if (ii01lo0l11ii != null) {
/* 127 */                       ii10o1i0i.I0000Il00O((i5 << 3) | 2, ii01lo0l11ii);
                            }
/* 130 */                   i = iI000O01llI0;
/* 131 */                   bArr = bArr2;
/* 132 */                   i2 = i4;
/* 133 */                   i111i0i1 = i111i0i12;
                        } else if ((i3 & 7) == 2) {
/* 47 */                    ii0ii11oi0i.I00000oIO(i3 >>> 3, ii00ooVar);
/* 53 */                    i = lil1OOilooi0.I000II(i3, bArr, iI000O01llI02, i2, ii10o1i0i, i111i0i1);
                        } else {
/* 61 */                    i = lil1OOilooi0.I000o00OoI0I(i3, bArr, iI000O01llI02, i2, i111i0i1);
                        }
                    }
/* 136 */           if (i == i2) {
/* 138 */               return;
                    }
/* 141 */           OoOil11Ol1o.I001iOo1i0O("Failed to parse the message.");
                }

                @Override
                public final void I000O01llI0(Object obj, IOOOi1 iOOOi1, ii0II11oi0I ii0ii11oi0i) {
                    boolean zI01I01Oolii;
/* 1 */             ii00oo ii00ooVar = this.I00000oIO;
/* 5 */             this.I00000oOI.getClass();
/* 8 */             ii10O1i0I ii10o1i0iI0010I0i = i1i0olI.I0010I0i(obj);
/* 15 */            ((ii0Oi0OiillI) obj).I00111O();
/* 25 */            while (iOOOi1.I01Iol() != Integer.MAX_VALUE) {
                        try {
/* 28 */                    int i = iOOOi1.I00000oOI;
/* 33 */                    ii01lO0l11ii ii01lo0l11iiI01O10iIoo1O = null;
/* 35 */                    if (i != 11) {
/* 39 */                        if ((i & 7) == 2) {
/* 43 */                            ii0ii11oi0i.I00000oIO(i >>> 3, ii00ooVar);
/* 46 */                            zI01I01Oolii = i1i0olI.I00111O(0, iOOOi1, ii10o1i0iI0010I0i);
                                } else {
/* 53 */                            zI01I01Oolii = iOOOi1.I01I01Oolii();
                                }
/* 57 */                        if (!zI01I01Oolii) {
                                    break;
                                }
                            } else {
/* 65 */                        int iI00Ol1ll1 = 0;
/* 70 */                        while (iOOOi1.I01Iol() != Integer.MAX_VALUE) {
/* 73 */                            int i2 = iOOOi1.I00000oOI;
/* 77 */                            if (i2 == 16) {
/* 79 */                                iOOOi1.I01Io001O(0);
/* 86 */                                iI00Ol1ll1 = ((IOOOI0) iOOOi1.I0000oI00).I00Ol1ll1();
/* 90 */                                ii0ii11oi0i.I00000oIO(iI00Ol1ll1, ii00ooVar);
                                    } else if (i2 == 26) {
/* 98 */                                ii01lo0l11iiI01O10iIoo1O = iOOOi1.I01O10iIoo1O();
                                    } else if (!iOOOi1.I01I01Oolii()) {
                                        break;
                                    }
                                }
/* 113 */                       if (iOOOi1.I00000oOI != 12) {
/* 131 */                           throw new ii0iI11ol("Protocol message end-group tag did not match expected tag.");
                                }
/* 115 */                       if (ii01lo0l11iiI01O10iIoo1O != null) {
/* 120 */                           ii10o1i0iI0010I0i.I0000Il00O((iI00Ol1ll1 << 3) | 2, ii01lo0l11iiI01O10iIoo1O);
                                }
                            }
                        } finally {
/* 134 */                   ((ii0OoOo10) obj).zzc = ii10o1i0iI0010I0i;
                        }
                    }
                }

                @Override
                public final int I000OOo1O(ii00oo ii00ooVar) {
/* 4 */             ii10O1i0I ii10o1i0i = ((ii0OoOo10) ii00ooVar).zzc;
/* 6 */             int iI0000Il00O = ii10o1i0i.I0000O;
/* 10 */            if (iI0000Il00O == -1) {
/* 12 */                iI0000Il00O = 0;
/* 16 */                for (int i = 0; i < ii10o1i0i.I00000oIO; i++) {
/* 22 */                    int i2 = ii10o1i0i.I00000oOI[i] >>> 3;
/* 28 */                    ii01lO0l11ii ii01lo0l11ii = (ii01lO0l11ii) ii10o1i0i.I0000Il00O[i];
/* 32 */                    int iI00000oOI = ii0I1Il.I00000oOI(8);
/* 47 */                    int iI00000oOI2 = ii0I1Il.I00000oOI(i2) + ii0I1Il.I00000oOI(16);
/* 50 */                    int iI00000oOI3 = ii0I1Il.I00000oOI(24);
/* 54 */                    int iI0001Ioi1lo = ii01lo0l11ii.I0001Ioi1lo();
/* 62 */                    iI0000Il00O = IIlIOloOOO.I0000Il00O(iI00000oOI + iI00000oOI, iI00000oOI2, OooioIOo1.I001lllioOl(iI0001Ioi1lo, iI0001Ioi1lo, iI00000oOI3), iI0000Il00O);
                        }
/* 69 */                ii10o1i0i.I0000O = iI0000Il00O;
                    }
/* 73 */            if (!this.I0000Il00O) {
/* 168 */               return iI0000Il00O;
                    }
/* 79 */            ii0oll0il ii0oll0ilVar = ((ii0Oi0OiillI) ii00ooVar).zzb.I00000oIO;
/* 81 */            int i3 = ii0oll0ilVar.I00iiI;
/* 83 */            int iI000OOo1O = 0;
/* 84 */            for (int i4 = 0; i4 < i3; i4++) {
/* 94 */                iI000OOo1O += ii0O1Ol1i.I000OOo1O(ii0oll0ilVar.I0000Il00O(i4));
                    }
/* 102 */           Iterator it = ii0oll0ilVar.I00000oIO().iterator();
/* 110 */           while (it.hasNext()) {
/* 122 */               iI000OOo1O += ii0O1Ol1i.I000OOo1O((Map.Entry) it.next());
                    }
/* 124 */           return iI0000Il00O + iI000OOo1O;
                }

                @Override
                public final Object zze() {
/* 1 */             ii00oo ii00ooVar = this.I00000oIO;
                    return ii00ooVar instanceof ii0OoOo10 ? ((ii0OoOo10) ii00ooVar).I000II() : ((ii0OOl) ((ii0OoOo10) ii00ooVar).I0010I0i(5, null)).I0000oI00();
                }
            }
