            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class ioOlollIoOI implements iooIIllo {
                public il00ioIl I00000oIO;
                public i1O01oOIoI0I I00000oOI;
                public boolean I0000Il00O;
                public iOl0lOIi11 I0000O;

                @Override
                public final void I00000oIO(Object obj) {
/* 3 */             this.I00000oOI.getClass();
/* 9 */             l01IO0I1I l01io0i1i = ((illOil) obj).zzc;
/* 13 */            if (l01io0i1i.I0000oI00) {
/* 16 */                l01io0i1i.I0000oI00 = false;
                    }
/* 20 */            this.I0000O.getClass();
/* 27 */            ((ill0o1o) obj).zzb.I0000O();
                }

                @Override
                public final void I00000oOI(Object obj, Object obj2) {
/* 1 */             iooiolOil0.I00100l0(obj, obj2);
/* 6 */             if (this.I0000Il00O) {
/* 8 */                 iooiolOil0.I000oI1ioi(obj, obj2);
                    }
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
/* 5 */             return ((ill0o1o) obj).zzb.I0001Ioi1lo();
                }

                @Override
                public final void I0000O(Object obj, i1IoOl i1iool) throws IOO1IOl1O10 {
/* 6 */             Iterator itI0000Il00O = ((ill0o1o) obj).zzb.I0000Il00O();
/* 14 */            if (itI0000Il00O.hasNext()) {
/* 107 */               ((ill110ll) ((Map.Entry) itI0000Il00O.next()).getKey()).getClass();
/* 332 */               throw null;
                    }
/* 18 */            l01IO0I1I l01io0i1i = ((illOil) obj).zzc;
/* 23 */            for (int i = 0; i < l01io0i1i.I00000oIO; i++) {
/* 30 */                int i2 = l01io0i1i.I00000oOI[i] >>> 3;
/* 33 */                Object obj2 = l01io0i1i.I0000Il00O[i];
/* 35 */                boolean z = obj2 instanceof il1oII0OlIo;
/* 39 */                ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 46 */                if (z) {
/* 50 */                    ilio10io.I000oI1ioi(11);
/* 53 */                    ilio10io.I000o00OoI0I(2, i2);
/* 56 */                    ilio10io.I0000oI00(3, (il1oII0OlIo) obj2);
/* 59 */                    ilio10io.I000oI1ioi(12);
                        } else {
/* 65 */                    ilio10io.I000oI1ioi(11);
/* 68 */                    ilio10io.I000o00OoI0I(2, i2);
/* 73 */                    ilio10io.I000oI1ioi(26);
/* 76 */                    illOil illoil = (illOil) ((il00ioIl) obj2);
/* 82 */                    ilio10io.I000oI1ioi(illoil.I0000Il00O());
/* 85 */                    illoil.I000o00OoI0I(ilio10io);
/* 88 */                    ilio10io.I000oI1ioi(12);
                        }
                    }
                }

                @Override
                public final int I0000oI00(il00ioIl il00ioil) {
/* 4 */             l01IO0I1I l01io0i1i = ((illOil) il00ioil).zzc;
/* 6 */             int iI0000Il00O = l01io0i1i.I0000O;
/* 10 */            if (iI0000Il00O == -1) {
/* 12 */                iI0000Il00O = 0;
/* 16 */                for (int i = 0; i < l01io0i1i.I00000oIO; i++) {
/* 22 */                    int i2 = l01io0i1i.I00000oOI[i] >>> 3;
/* 28 */                    il1oII0OlIo il1oii0olio = (il1oII0OlIo) l01io0i1i.I0000Il00O[i];
/* 32 */                    int iI00000oIO = ilIO10iO.I00000oIO(8);
/* 47 */                    int iI00000oIO2 = ilIO10iO.I00000oIO(i2) + ilIO10iO.I00000oIO(16);
/* 50 */                    int iI00000oIO3 = ilIO10iO.I00000oIO(24);
/* 54 */                    int iI0001Ioi1lo = il1oii0olio.I0001Ioi1lo();
/* 62 */                    iI0000Il00O = IIlIOloOOO.I0000Il00O(iI00000oIO + iI00000oIO, iI00000oIO2, OooioIOo1.I001lloI(iI0001Ioi1lo, iI0001Ioi1lo, iI00000oIO3), iI0000Il00O);
                        }
/* 69 */                l01io0i1i.I0000O = iI0000Il00O;
                    }
/* 73 */            if (!this.I0000Il00O) {
/* 168 */               return iI0000Il00O;
                    }
/* 79 */            ioolilol1oO0 ioolilol1oo0 = ((ill0o1o) il00ioil).zzb.I00000oIO;
/* 81 */            int i3 = ioolilol1oo0.I00iiI;
/* 83 */            int iI000OOo1O = 0;
/* 84 */            for (int i4 = 0; i4 < i3; i4++) {
/* 94 */                iI000OOo1O += ilOol10I0IlI.I000OOo1O(ioolilol1oo0.I0000Il00O(i4));
                    }
/* 102 */           Iterator it = ioolilol1oo0.I00000oIO().iterator();
/* 110 */           while (it.hasNext()) {
/* 122 */               iI000OOo1O += ilOol10I0IlI.I000OOo1O((Map.Entry) it.next());
                    }
/* 124 */           return iI0000Il00O + iI000OOo1O;
                }

                @Override
                public final boolean I0001Ioi1lo(illOil illoil, illOil illoil2) {
/* 9 */             if (!illoil.zzc.equals(illoil2.zzc)) {
/* 11 */                return false;
                    }
/* 15 */            if (this.I0000Il00O) {
/* 25 */                return ((ill0o1o) illoil).zzb.equals(((ill0o1o) illoil2).zzb);
                    }
/* 30 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0082 A[EDGE_INSN: B:54:0x0082->B:30:0x0082 BREAK  A[LOOP:1: B:16:0x004f->B:57:0x004f], SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws iloll1i {
                    int iI000O01llI0;
/* 1 */             il00ioIl il00ioil = this.I00000oIO;
/* 4 */             illOil illoil = (illOil) obj;
/* 6 */             l01IO0I1I l01io0i1iI00000oOI = illoil.zzc;
/* 10 */            if (l01io0i1iI00000oOI == l01IO0I1I.I0001Ioi1lo) {
/* 12 */                l01io0i1iI00000oOI = l01IO0I1I.I00000oOI();
/* 16 */                illoil.zzc = l01io0i1iI00000oOI;
                    }
/* 18 */            l01IO0I1I l01io0i1i = l01io0i1iI00000oOI;
/* 19 */            ill0o1o ill0o1oVar = (ill0o1o) obj;
/* 21 */            ilOol10I0IlI ilool10i0ili = ill0o1oVar.zzb;
/* 25 */            if (ilool10i0ili.I00000oOI) {
/* 31 */                ill0o1oVar.zzb = ilool10i0ili.clone();
                    }
/* 33 */            while (i < i2) {
/* 35 */                int iI000O01llI02 = lillI0io.I000O01llI0(bArr, i, i111i0i1);
/* 39 */                int i3 = i111i0i1.I00000oIO;
/* 43 */                ilOO1I1l iloo1i1l = (ilOO1I1l) i111i0i1.I0000oI00;
/* 48 */                if (i3 == 11) {
/* 75 */                    byte[] bArr2 = bArr;
/* 76 */                    int i4 = i2;
/* 77 */                    i111i0I1 i111i0i12 = i111i0i1;
/* 78 */                    il1oII0OlIo il1oii0olio = null;
/* 79 */                    int i5 = 0;
                            while (true) {
/* 80 */                        if (iI000O01llI02 >= i4) {
/* 130 */                           iI000O01llI0 = iI000O01llI02;
                                    break;
                                }
/* 82 */                        iI000O01llI0 = lillI0io.I000O01llI0(bArr2, iI000O01llI02, i111i0i12);
/* 86 */                        int i6 = i111i0i12.I00000oIO;
/* 88 */                        int i7 = i6 >>> 3;
/* 90 */                        int i8 = i6 & 7;
/* 92 */                        if (i7 != 2) {
/* 95 */                            if (i7 != 3 || i8 != 2) {
/* 123 */                               if (i6 != 12) {
                                            break;
                                        } else {
/* 125 */                                   iI000O01llI02 = lillI0io.I000o00OoI0I(i6, bArr2, iI000O01llI0, i4, i111i0i12);
                                        }
                                    } else {
/* 100 */                               iI000O01llI02 = lillI0io.I00000oIO(bArr2, iI000O01llI0, i111i0i12);
/* 106 */                               il1oii0olio = (il1oII0OlIo) i111i0i12.I0000Il00O;
                                    }
                                } else if (i8 == 0) {
/* 111 */                           iI000O01llI02 = lillI0io.I000O01llI0(bArr2, iI000O01llI0, i111i0i12);
/* 115 */                           i5 = i111i0i12.I00000oIO;
/* 117 */                           iloo1i1l.I00000oIO(il00ioil, i5);
                                } else if (i6 != 12) {
                                }
                            }
/* 131 */                   if (il1oii0olio != null) {
/* 136 */                       l01io0i1i.I0000Il00O((i5 << 3) | 2, il1oii0olio);
                            }
/* 139 */                   i = iI000O01llI0;
/* 140 */                   bArr = bArr2;
/* 141 */                   i2 = i4;
/* 142 */                   i111i0i1 = i111i0i12;
                        } else if ((i3 & 7) == 2) {
/* 56 */                    iloo1i1l.I00000oIO(il00ioil, i3 >>> 3);
/* 62 */                    i = lillI0io.I000II(i3, bArr, iI000O01llI02, i2, l01io0i1i, i111i0i1);
                        } else {
/* 70 */                    i = lillI0io.I000o00OoI0I(i3, bArr, iI000O01llI02, i2, i111i0i1);
                        }
                    }
/* 145 */           if (i == i2) {
/* 147 */               return;
                    }
/* 150 */           iilo0lOo110.I0000oI00("Failed to parse the message.");
                }

                @Override
                public final int I000O01llI0(illOil illoil) {
/* 3 */             int iHashCode = illoil.zzc.hashCode();
/* 9 */             if (!this.I0000Il00O) {
/* 29 */                return iHashCode;
                    }
/* 23 */            return ((ill0o1o) illoil).zzb.I00000oIO.hashCode() + (iHashCode * 53);
                }

                @Override
                public final Object zze() {
/* 1 */             il00ioIl il00ioil = this.I00000oIO;
                    return il00ioil instanceof illOil ? (illOil) ((illOil) il00ioil).I000oI1ioi(4, null) : ((ililOli1l) ((illOil) il00ioil).I000oI1ioi(5, null)).I0000O();
                }
            }
