            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class i11lOoi0ioI implements i11lo1 {
                public i1111ll I00000oIO;
                public loIOiIO1O1 I00000oOI;
                public boolean I0000Il00O;
                public liIoOiiO1Oi I0000O;

                @Override
                public final boolean I00000oIO(i11O1oIl i11o1oil, i11O1oIl i11o1oil2) {
/* 9 */             if (!i11o1oil.zbc.equals(i11o1oil2.zbc)) {
/* 11 */                return false;
                    }
/* 15 */            if (this.I0000Il00O) {
/* 25 */                return ((i11O011) i11o1oil).zbb.equals(((i11O011) i11o1oil2).zbb);
                    }
/* 30 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0082 A[EDGE_INSN: B:54:0x0082->B:30:0x0082 BREAK  A[LOOP:1: B:16:0x004f->B:57:0x004f], SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws i11i01Oo {
                    int iI000O01llI0;
/* 1 */             i1111ll i1111llVar = this.I00000oIO;
/* 4 */             i11O1oIl i11o1oil = (i11O1oIl) obj;
/* 6 */             i11o1i i11o1iVarI00000oOI = i11o1oil.zbc;
/* 10 */            if (i11o1iVarI00000oOI == i11o1i.I0001Ioi1lo) {
/* 12 */                i11o1iVarI00000oOI = i11o1i.I00000oOI();
/* 16 */                i11o1oil.zbc = i11o1iVarI00000oOI;
                    }
/* 18 */            i11o1i i11o1iVar = i11o1iVarI00000oOI;
/* 19 */            i11O011 i11o011 = (i11O011) obj;
/* 21 */            i11Ii1iI0 i11ii1ii0 = i11o011.zbb;
/* 25 */            if (i11ii1ii0.I00000oOI) {
/* 31 */                i11o011.zbb = i11ii1ii0.clone();
                    }
/* 33 */            while (i < i2) {
/* 35 */                int iI000O01llI02 = liOI1I0oIO.I000O01llI0(bArr, i, i111i0i1);
/* 39 */                int i3 = i111i0i1.I00000oIO;
/* 43 */                i11IO0ii i11io0ii = (i11IO0ii) i111i0i1.I0000oI00;
/* 48 */                if (i3 == 11) {
/* 75 */                    byte[] bArr2 = bArr;
/* 76 */                    int i4 = i2;
/* 77 */                    i111i0I1 i111i0i12 = i111i0i1;
/* 78 */                    i11I0IiII0Ol i11i0iiii0ol = null;
/* 79 */                    int i5 = 0;
                            while (true) {
/* 80 */                        if (iI000O01llI02 >= i4) {
/* 130 */                           iI000O01llI0 = iI000O01llI02;
                                    break;
                                }
/* 82 */                        iI000O01llI0 = liOI1I0oIO.I000O01llI0(bArr2, iI000O01llI02, i111i0i12);
/* 86 */                        int i6 = i111i0i12.I00000oIO;
/* 88 */                        int i7 = i6 >>> 3;
/* 90 */                        int i8 = i6 & 7;
/* 92 */                        if (i7 != 2) {
/* 95 */                            if (i7 != 3 || i8 != 2) {
/* 123 */                               if (i6 != 12) {
                                            break;
                                        } else {
/* 125 */                                   iI000O01llI02 = liOI1I0oIO.I000o00OoI0I(i6, bArr2, iI000O01llI0, i4, i111i0i12);
                                        }
                                    } else {
/* 100 */                               iI000O01llI02 = liOI1I0oIO.I00000oIO(bArr2, iI000O01llI0, i111i0i12);
/* 106 */                               i11i0iiii0ol = (i11I0IiII0Ol) i111i0i12.I0000Il00O;
                                    }
                                } else if (i8 == 0) {
/* 111 */                           iI000O01llI02 = liOI1I0oIO.I000O01llI0(bArr2, iI000O01llI0, i111i0i12);
/* 115 */                           i5 = i111i0i12.I00000oIO;
/* 117 */                           i11io0ii.I00000oIO(i1111llVar, i5);
                                } else if (i6 != 12) {
                                }
                            }
/* 131 */                   if (i11i0iiii0ol != null) {
/* 136 */                       i11o1iVar.I0000Il00O((i5 << 3) | 2, i11i0iiii0ol);
                            }
/* 139 */                   i = iI000O01llI0;
/* 140 */                   bArr = bArr2;
/* 141 */                   i2 = i4;
/* 142 */                   i111i0i1 = i111i0i12;
                        } else if ((i3 & 7) == 2) {
/* 56 */                    i11io0ii.I00000oIO(i1111llVar, i3 >>> 3);
/* 62 */                    i = liOI1I0oIO.I000II(i3, bArr, iI000O01llI02, i2, i11o1iVar, i111i0i1);
                        } else {
/* 70 */                    i = liOI1I0oIO.I000o00OoI0I(i3, bArr, iI000O01llI02, i2, i111i0i1);
                        }
                    }
/* 145 */           if (i == i2) {
/* 147 */               return;
                    }
/* 150 */           OoOil11Ol1o.I001IIilI0O("Failed to parse the message.");
                }

                @Override
                public final int I0000Il00O(i11O1oIl i11o1oil) {
/* 3 */             int iHashCode = i11o1oil.zbc.hashCode();
/* 9 */             if (!this.I0000Il00O) {
/* 29 */                return iHashCode;
                    }
/* 23 */            return ((i11O011) i11o1oil).zbb.I00000oIO.hashCode() + (iHashCode * 53);
                }

                @Override
                public final void I0000O(Object obj, Object obj2) {
/* 1 */             i11o00oiil.I00100l0(obj, obj2);
/* 6 */             if (this.I0000Il00O) {
/* 8 */                 i11o00oiil.I000oI1ioi(obj, obj2);
                    }
                }

                @Override
                public final void I0000oI00(Object obj) {
/* 3 */             this.I00000oOI.getClass();
/* 9 */             i11o1i i11o1iVar = ((i11O1oIl) obj).zbc;
/* 13 */            if (i11o1iVar.I0000oI00) {
/* 16 */                i11o1iVar.I0000oI00 = false;
                    }
/* 20 */            this.I0000O.getClass();
/* 27 */            ((i11O011) obj).zbb.I0000O();
                }

                @Override
                public final boolean I0001Ioi1lo(Object obj) {
/* 5 */             return ((i11O011) obj).zbb.I0001Ioi1lo();
                }

                @Override
                public final void I000II(Object obj, i11I1Ili i11i1ili) {
/* 6 */             Iterator itI0000Il00O = ((i11O011) obj).zbb.I0000Il00O();
/* 14 */            if (itI0000Il00O.hasNext()) {
/* 332 */               throw null;
                    }
/* 18 */            i11o1i i11o1iVar = ((i11O1oIl) obj).zbc;
/* 23 */            for (int i = 0; i < i11o1iVar.I00000oIO; i++) {
/* 30 */                int i2 = i11o1iVar.I00000oOI[i] >>> 3;
/* 33 */                Object obj2 = i11o1iVar.I0000Il00O[i];
/* 35 */                boolean z = obj2 instanceof i11I0IiII0Ol;
/* 39 */                i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 46 */                if (z) {
/* 50 */                    i11i0o0ii.I00100o1O0lo(11);
/* 53 */                    i11i0o0ii.I00100l0(2, i2);
/* 56 */                    i11i0o0ii.I0001Ioi1lo(3, (i11I0IiII0Ol) obj2);
/* 59 */                    i11i0o0ii.I00100o1O0lo(12);
                        } else {
/* 65 */                    i11i0o0ii.I00100o1O0lo(11);
/* 68 */                    i11i0o0ii.I00100l0(2, i2);
/* 73 */                    i11i0o0ii.I00100o1O0lo(26);
/* 76 */                    i11O1oIl i11o1oil = (i11O1oIl) ((i1111ll) obj2);
/* 82 */                    i11i0o0ii.I00100o1O0lo(i11o1oil.I000OiO());
/* 85 */                    i11o1oil.I000O01llI0(i11i0o0ii);
/* 88 */                    i11i0o0ii.I00100o1O0lo(12);
                        }
                    }
                }

                @Override
                public final int I000O01llI0(i1111ll i1111llVar) {
/* 4 */             i11o1i i11o1iVar = ((i11O1oIl) i1111llVar).zbc;
/* 6 */             int iI0000Il00O = i11o1iVar.I0000O;
/* 10 */            if (iI0000Il00O == -1) {
/* 12 */                iI0000Il00O = 0;
/* 16 */                for (int i = 0; i < i11o1iVar.I00000oIO; i++) {
/* 22 */                    int i2 = i11o1iVar.I00000oOI[i] >>> 3;
/* 28 */                    i11I0IiII0Ol i11i0iiii0ol = (i11I0IiII0Ol) i11o1iVar.I0000Il00O[i];
/* 32 */                    int iI00000oOI = i11I0o0ii.I00000oOI(8);
/* 47 */                    int iI00000oOI2 = i11I0o0ii.I00000oOI(i2) + i11I0o0ii.I00000oOI(16);
/* 50 */                    int iI00000oOI3 = i11I0o0ii.I00000oOI(24);
/* 54 */                    int iI0000oI00 = i11i0iiii0ol.I0000oI00();
/* 62 */                    iI0000Il00O = IIlIOloOOO.I0000Il00O(iI00000oOI + iI00000oOI, iI00000oOI2, OooioIOo1.I0000oI00(iI0000oI00, iI0000oI00, iI00000oOI3), iI0000Il00O);
                        }
/* 69 */                i11o1iVar.I0000O = iI0000Il00O;
                    }
/* 73 */            if (this.I0000Il00O) {
/* 79 */                i11o10OIl i11o10oil = ((i11O011) i1111llVar).zbb.I00000oIO;
/* 84 */                if (i11o10oil.I00iiI > 0) {
/* 115 */                   i11Ii1iI0.I000OOo1O(i11o10oil.I0000Il00O(0));
/* 118 */                   throw null;
                        }
/* 90 */                Iterator it = i11o10oil.I00000oIO().iterator();
/* 98 */                if (it.hasNext()) {
/* 107 */                   i11Ii1iI0.I000OOo1O((Map.Entry) it.next());
/* 110 */                   throw null;
                        }
                    }
/* 168 */           return iI0000Il00O;
                }

                @Override
                public final Object I000OOo1O() {
/* 1 */             i1111ll i1111llVar = this.I00000oIO;
                    return i1111llVar instanceof i11O1oIl ? (i11O1oIl) ((i11O1oIl) i1111llVar).I000OOo1O(4, null) : ((i11Ill1l) ((i11O1oIl) i1111llVar).I000OOo1O(5, null)).I0000Il00O();
                }
            }
