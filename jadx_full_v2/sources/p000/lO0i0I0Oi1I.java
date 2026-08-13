            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class lO0i0I0Oi1I implements lO1liolI0IO {
                public lIoolOoilO I00000oIO;
                public o0iOli I00000oOI;
                public boolean I0000Il00O;
                public liIoOiiO1Oi I0000O;

                @Override
                public final void I00000oIO(Object obj) {
/* 3 */             this.I00000oOI.getClass();
/* 9 */             lOOlilii loolilii = ((lIIOO0oi1o) obj).zzc;
/* 13 */            if (loolilii.I0000oI00) {
/* 16 */                loolilii.I0000oI00 = false;
                    }
/* 20 */            this.I0000O.getClass();
/* 27 */            ((lI1oIOl10iIo) obj).zzb.I0000Il00O();
                }

                @Override
                public final void I00000oOI(Object obj, Object obj2) {
/* 1 */             lOI01O1oI.I00100l0(obj, obj2);
/* 6 */             if (this.I0000Il00O) {
/* 8 */                 lOI01O1oI.I000oI1ioi(obj, obj2);
                    }
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
/* 5 */             ((lI1oIOl10iIo) obj).zzb.I0000O();
/* 8 */             return true;
                }

                @Override
                public final int I0000O(l1Ii10o l1ii10o) {
/* 4 */             lOOlilii loolilii = ((lIIOO0oi1o) l1ii10o).zzc;
/* 6 */             int iI0000Il00O = loolilii.I0000O;
/* 10 */            if (iI0000Il00O == -1) {
/* 12 */                iI0000Il00O = 0;
/* 16 */                for (int i = 0; i < loolilii.I00000oIO; i++) {
/* 22 */                    int i2 = loolilii.I00000oOI[i] >>> 3;
/* 28 */                    l1l1O1i l1l1o1i = (l1l1O1i) loolilii.I0000Il00O[i];
/* 32 */                    int iI0010I0i = l1lo010IOi0.I0010I0i(8);
/* 47 */                    int iI0010I0i2 = l1lo010IOi0.I0010I0i(i2) + l1lo010IOi0.I0010I0i(16);
/* 50 */                    int iI0010I0i3 = l1lo010IOi0.I0010I0i(24);
/* 54 */                    int iI0000oI00 = l1l1o1i.I0000oI00();
/* 62 */                    iI0000Il00O = IIlIOloOOO.I0000Il00O(iI0010I0i + iI0010I0i, iI0010I0i2, io1OllI.I00100l0(iI0000oI00, iI0000oI00, iI0010I0i3), iI0000Il00O);
                        }
/* 69 */                loolilii.I0000O = iI0000Il00O;
                    }
/* 73 */            if (this.I0000Il00O) {
/* 79 */                lOI1I000IoiI loi1i000ioii = ((lI1oIOl10iIo) l1ii10o).zzb.I00000oIO;
/* 83 */                if (loi1i000ioii.I00iiI > 0) {
/* 129 */                   loi1i000ioii.I0000Il00O(0).getKey().getClass();
/* 132 */                   OIiilo1Ool0o.I00000oIO();
/* 9 */                     return 0;
                        }
/* 89 */                Iterator it = loi1i000ioii.I00000oIO().iterator();
/* 97 */                if (it.hasNext()) {
/* 104 */                   Map.Entry entry = (Map.Entry) it.next();
/* 110 */                   if (entry.getKey() != null) {
/* 112 */                       OIiilo1Ool0o.I00000oIO();
/* 9 */                         return 0;
                            }
/* 116 */                   entry.getValue();
/* 120 */                   throw null;
                        }
                    }
/* 168 */           return iI0000Il00O;
                }

                @Override
                public final void I0000oI00(Object obj, i11I1Ili i11i1ili) throws IOO1IOl1O10 {
/* 6 */             Iterator itI00000oOI = ((lI1oIOl10iIo) obj).zzb.I00000oOI();
/* 14 */            if (itI00000oOI.hasNext()) {
/* 105 */               ((Map.Entry) itI00000oOI.next()).getKey().getClass();
/* 108 */               OIiilo1Ool0o.I00000oIO();
/* 332 */               return;
                    }
/* 18 */            lOOlilii loolilii = ((lIIOO0oi1o) obj).zzc;
/* 23 */            for (int i = 0; i < loolilii.I00000oIO; i++) {
/* 30 */                int i2 = loolilii.I00000oOI[i] >>> 3;
/* 33 */                Object obj2 = loolilii.I0000Il00O[i];
/* 35 */                boolean z = obj2 instanceof l1l1O1i;
/* 39 */                l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 46 */                if (z) {
/* 50 */                    l1lo010ioi0.I000o00OoI0I(11);
/* 53 */                    l1lo010ioi0.I000lI(2, i2);
/* 56 */                    l1lo010ioi0.I0000O(3, (l1l1O1i) obj2);
/* 59 */                    l1lo010ioi0.I000o00OoI0I(12);
                        } else {
/* 65 */                    l1lo010ioi0.I000o00OoI0I(11);
/* 68 */                    l1lo010ioi0.I000lI(2, i2);
/* 73 */                    l1lo010ioi0.I000o00OoI0I(26);
/* 76 */                    lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) ((lIoolOoilO) obj2);
/* 82 */                    l1lo010ioi0.I000o00OoI0I(liioo0oi1o.I000l1());
/* 85 */                    liioo0oi1o.I000OOo1O(l1lo010ioi0);
/* 88 */                    l1lo010ioi0.I000o00OoI0I(12);
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(lIIOO0oi1o liioo0oi1o, lIIOO0oi1o liioo0oi1o2) {
/* 9 */             if (!liioo0oi1o.zzc.equals(liioo0oi1o2.zzc)) {
/* 11 */                return false;
                    }
/* 15 */            if (this.I0000Il00O) {
/* 25 */                return ((lI1oIOl10iIo) liioo0oi1o).zzb.equals(((lI1oIOl10iIo) liioo0oi1o2).zzb);
                    }
/* 30 */            return true;
                }

                @Override
                public final int I000II(lIIOO0oi1o liioo0oi1o) {
/* 3 */             int iHashCode = liioo0oi1o.zzc.hashCode();
/* 9 */             if (!this.I0000Il00O) {
/* 29 */                return iHashCode;
                    }
/* 23 */            return ((lI1oIOl10iIo) liioo0oi1o).zzb.I00000oIO.hashCode() + (iHashCode * 53);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0082 A[EDGE_INSN: B:54:0x0082->B:30:0x0082 BREAK  A[LOOP:1: B:16:0x004f->B:57:0x004f], SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws lIi0II001O1I {
                    int iI0001Ioi1lo;
/* 1 */             lIoolOoilO lioolooilo = this.I00000oIO;
/* 4 */             lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) obj;
/* 6 */             lOOlilii looliliiI00000oOI = liioo0oi1o.zzc;
/* 10 */            if (looliliiI00000oOI == lOOlilii.I0001Ioi1lo) {
/* 12 */                looliliiI00000oOI = lOOlilii.I00000oOI();
/* 16 */                liioo0oi1o.zzc = looliliiI00000oOI;
                    }
/* 18 */            lOOlilii loolilii = looliliiI00000oOI;
/* 19 */            lI1oIOl10iIo li1oiol10iio = (lI1oIOl10iIo) obj;
/* 21 */            lI0ioliI0l li0iolii0l = li1oiol10iio.zzb;
/* 25 */            if (li0iolii0l.I00000oOI) {
/* 31 */                li1oiol10iio.zzb = li0iolii0l.clone();
                    }
/* 33 */            while (i < i2) {
/* 35 */                int iI0001Ioi1lo2 = ll0I0olIli.I0001Ioi1lo(bArr, i, i111i0i1);
/* 39 */                int i3 = i111i0i1.I00000oIO;
/* 43 */                lI0011loIOIo li0011loioio = (lI0011loIOIo) i111i0i1.I0000oI00;
/* 48 */                if (i3 == 11) {
/* 75 */                    byte[] bArr2 = bArr;
/* 76 */                    int i4 = i2;
/* 77 */                    i111i0I1 i111i0i12 = i111i0i1;
/* 78 */                    l1l1O1i l1l1o1i = null;
/* 79 */                    int i5 = 0;
                            while (true) {
/* 80 */                        if (iI0001Ioi1lo2 >= i4) {
/* 130 */                           iI0001Ioi1lo = iI0001Ioi1lo2;
                                    break;
                                }
/* 82 */                        iI0001Ioi1lo = ll0I0olIli.I0001Ioi1lo(bArr2, iI0001Ioi1lo2, i111i0i12);
/* 86 */                        int i6 = i111i0i12.I00000oIO;
/* 88 */                        int i7 = i6 >>> 3;
/* 90 */                        int i8 = i6 & 7;
/* 92 */                        if (i7 != 2) {
/* 95 */                            if (i7 != 3 || i8 != 2) {
/* 123 */                               if (i6 != 12) {
                                            break;
                                        } else {
/* 125 */                                   iI0001Ioi1lo2 = ll0I0olIli.I000l1(i6, bArr2, iI0001Ioi1lo, i4, i111i0i12);
                                        }
                                    } else {
/* 100 */                               iI0001Ioi1lo2 = ll0I0olIli.I00000oIO(bArr2, iI0001Ioi1lo, i111i0i12);
/* 106 */                               l1l1o1i = (l1l1O1i) i111i0i12.I0000Il00O;
                                    }
                                } else if (i8 == 0) {
/* 111 */                           iI0001Ioi1lo2 = ll0I0olIli.I0001Ioi1lo(bArr2, iI0001Ioi1lo, i111i0i12);
/* 115 */                           i5 = i111i0i12.I00000oIO;
/* 117 */                           li0011loioio.I00000oIO(lioolooilo, i5);
                                } else if (i6 != 12) {
                                }
                            }
/* 131 */                   if (l1l1o1i != null) {
/* 136 */                       loolilii.I0000Il00O((i5 << 3) | 2, l1l1o1i);
                            }
/* 139 */                   i = iI0001Ioi1lo;
/* 140 */                   bArr = bArr2;
/* 141 */                   i2 = i4;
/* 142 */                   i111i0i1 = i111i0i12;
                        } else if ((i3 & 7) == 2) {
/* 56 */                    li0011loioio.I00000oIO(lioolooilo, i3 >>> 3);
/* 62 */                    i = ll0I0olIli.I0000oI00(i3, bArr, iI0001Ioi1lo2, i2, loolilii, i111i0i1);
                        } else {
/* 70 */                    i = ll0I0olIli.I000l1(i3, bArr, iI0001Ioi1lo2, i2, i111i0i1);
                        }
                    }
/* 145 */           if (i == i2) {
/* 147 */               return;
                    }
/* 150 */           iilo0lOo110.I0001Ioi1lo("Failed to parse the message.");
                }

                @Override
                public final Object zze() {
/* 1 */             lIoolOoilO lioolooilo = this.I00000oIO;
                    return lioolooilo instanceof lIIOO0oi1o ? (lIIOO0oi1o) ((lIIOO0oi1o) lioolooilo).I000OiO(4, null) : ((lI1IliiIoIi) ((lIIOO0oi1o) lioolooilo).I000OiO(5, null)).I0000O();
                }
            }
