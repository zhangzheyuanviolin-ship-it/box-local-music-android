            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class o0IlO0o1OO implements o0O1iOilloll {
                public loOo1oOil I00000oIO;
                public i1i0olI I00000oOI;
                public boolean I0000Il00O;
                public o0llIi I0000O;

                @Override
                public final void I00000oIO(Object obj) {
/* 3 */             this.I00000oOI.getClass();
/* 9 */             o0i0oOOIl1Io o0i0oooil1io = ((o001IlOi0O) obj).zzc;
/* 13 */            if (o0i0oooil1io.I0000oI00) {
/* 16 */                o0i0oooil1io.I0000oI00 = false;
                    }
/* 20 */            this.I0000O.getClass();
/* 27 */            ((looo1olo1) obj).zzb.I0000oI00();
                }

                @Override
                public final void I00000oOI(Object obj, Object obj2) {
/* 1 */             o0OIIlOIl01I.I0010o(obj, obj2);
/* 6 */             if (this.I0000Il00O) {
/* 8 */                 o0OIIlOIl01I.I0010I0i(obj, obj2);
                    }
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
/* 5 */             return ((looo1olo1) obj).zzb.I000II();
                }

                @Override
                public final int I0000O(loOo1oOil looo1ooil) {
/* 4 */             o0i0oOOIl1Io o0i0oooil1io = ((o001IlOi0O) looo1ooil).zzc;
/* 6 */             int iI0000Il00O = o0i0oooil1io.I0000O;
/* 10 */            if (iI0000Il00O == -1) {
/* 12 */                iI0000Il00O = 0;
/* 16 */                for (int i = 0; i < o0i0oooil1io.I00000oIO; i++) {
/* 22 */                    int i2 = o0i0oooil1io.I00000oOI[i] >>> 3;
/* 28 */                    lol1I010 lol1i010 = (lol1I010) o0i0oooil1io.I0000Il00O[i];
/* 32 */                    int iI00100l0 = loliO00.I00100l0(8);
/* 47 */                    int iI00100l02 = loliO00.I00100l0(i2) + loliO00.I00100l0(16);
/* 50 */                    int iI00100l03 = loliO00.I00100l0(24);
/* 54 */                    int iI0000oI00 = lol1i010.I0000oI00();
/* 62 */                    iI0000Il00O = IIlIOloOOO.I0000Il00O(iI00100l0 + iI00100l0, iI00100l02, io1OllI.I0010I0i(iI0000oI00, iI0000oI00, iI00100l03), iI0000Il00O);
                        }
/* 69 */                o0i0oooil1io.I0000O = iI0000Il00O;
                    }
/* 73 */            if (!this.I0000Il00O) {
/* 168 */               return iI0000Il00O;
                    }
/* 79 */            o0OIiOo0oOi o0oiioo0ooi = ((looo1olo1) looo1ooil).zzb.I00000oIO;
/* 81 */            int i3 = o0oiioo0ooi.I00iiI;
/* 83 */            int iI00000oIO = 0;
/* 84 */            for (int i4 = 0; i4 < i3; i4++) {
/* 86 */                o0OOOl0I1IO1 o0oool0i1io1I0000Il00O = o0oiioo0ooi.I0000Il00O(i4);
/* 94 */                looolOIIo loooloiio = (looolOIIo) o0oool0i1io1I0000Il00O.getKey();
/* 96 */                Object value = o0oool0i1io1I0000Il00O.getValue();
/* 102 */               o0iolO0OI o0iolo0oi = loooloiio.I00iOIl.I00iOIl;
/* 104 */               o0iolO0OI o0iolo0oi2 = o0iolO0OI.I00iOIl;
/* 110 */               iI00000oIO += looOi1oiO.I00000oIO(loooloiio, value);
                    }
/* 126 */           for (Map.Entry entry : o0oiioo0ooi.I00000oIO()) {
/* 138 */               looolOIIo loooloiio2 = (looolOIIo) entry.getKey();
/* 140 */               Object value2 = entry.getValue();
/* 146 */               o0iolO0OI o0iolo0oi3 = loooloiio2.I00iOIl.I00iOIl;
/* 148 */               o0iolO0OI o0iolo0oi4 = o0iolO0OI.I00iOIl;
/* 154 */               iI00000oIO += looOi1oiO.I00000oIO(loooloiio2, value2);
                    }
/* 156 */           return iI0000Il00O + iI00000oIO;
                }

                @Override
                public final boolean I0000oI00(o001IlOi0O o001iloi0o, o001IlOi0O o001iloi0o2) {
/* 9 */             if (!o001iloi0o.zzc.equals(o001iloi0o2.zzc)) {
/* 11 */                return false;
                    }
/* 15 */            if (this.I0000Il00O) {
/* 25 */                return ((looo1olo1) o001iloi0o).zzb.equals(((looo1olo1) o001iloi0o2).zzb);
                    }
/* 30 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[EDGE_INSN: B:54:0x00d9->B:36:0x00d9 BREAK  A[LOOP:1: B:21:0x007e->B:59:0x007e], SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws o010O1 {
/* 9 */             loOo1oOil looo1ooil = this.I00000oIO;
/* 13 */            o001IlOi0O o001iloi0o = (o001IlOi0O) obj;
/* 15 */            o0i0oOOIl1Io o0i0oooil1ioI00000oOI = o001iloi0o.zzc;
/* 19 */            if (o0i0oooil1ioI00000oOI == o0i0oOOIl1Io.I0001Ioi1lo) {
/* 21 */                o0i0oooil1ioI00000oOI = o0i0oOOIl1Io.I00000oOI();
/* 25 */                o001iloi0o.zzc = o0i0oooil1ioI00000oOI;
                    }
/* 27 */            o0i0oOOIl1Io o0i0oooil1io = o0i0oooil1ioI00000oOI;
/* 30 */            looo1olo1 looo1olo1Var = (looo1olo1) obj;
/* 32 */            looOi1oiO loooi1oioI00000oOI = looo1olo1Var.zzb;
/* 36 */            if (loooi1oioI00000oOI.I00000oOI) {
/* 38 */                loooi1oioI00000oOI = loooi1oioI00000oOI.clone();
/* 42 */                looo1olo1Var.zzb = loooi1oioI00000oOI;
                    }
/* 44 */            looOi1oiO loooi1oio = loooi1oioI00000oOI;
/* 45 */            int iI000l1 = i;
/* 47 */            o000O0II11oi o000o0ii11oi = null;
/* 48 */            while (iI000l1 < i2) {
/* 50 */                o000O0II11oi o000o0ii11oi2 = o000o0ii11oi;
/* 51 */                int iI000II = ll11il.I000II(bArr, iI000l1, i111i0i1);
/* 55 */                int i3 = i111i0i1.I00000oIO;
/* 59 */                loo1Oo0 loo1oo0 = (loo1Oo0) i111i0i1.I0000oI00;
/* 64 */                if (i3 == 11) {
/* 125 */                   int i4 = 0;
/* 126 */                   lol1I010 lol1i010 = null;
/* 127 */                   while (iI000II < i2) {
/* 129 */                       iI000II = ll11il.I000II(bArr, iI000II, i111i0i1);
/* 133 */                       int i5 = i111i0i1.I00000oIO;
/* 135 */                       int i6 = i5 >>> 3;
/* 137 */                       int i7 = i5 & 7;
/* 139 */                       if (i6 != 2) {
/* 142 */                           if (i6 == 3) {
/* 145 */                               if (o000o0ii11oi2 != null) {
/* 159 */                                   iI000II = ll11il.I0000Il00O(o0Ioolo.I0000Il00O.I00000oIO(o000o0ii11oi2.I0000Il00O.getClass()), bArr, iI000II, i2, i111i0i1);
/* 167 */                                   loooi1oio.I0001Ioi1lo(o000o0ii11oi2.I0000O, i111i0i1.I0000Il00O);
                                        } else if (i7 == 2) {
/* 173 */                                   iI000II = ll11il.I00000oIO(bArr, iI000II, i111i0i1);
/* 180 */                                   lol1i010 = (lol1I010) i111i0i1.I0000Il00O;
                                        }
                                    }
/* 211 */                           if (i5 != 12) {
                                        break;
                                    } else {
/* 213 */                               iI000II = ll11il.I000l1(i5, bArr, iI000II, i2, i111i0i1);
                                    }
                                } else if (i7 == 0) {
/* 185 */                           iI000II = ll11il.I000II(bArr, iI000II, i111i0i1);
/* 189 */                           i4 = i111i0i1.I00000oIO;
/* 191 */                           loo1oo0.getClass();
/* 206 */                           o000o0ii11oi2 = (o000O0II11oi) loo1oo0.I00000oIO.get(new loo10o1IolO0(looo1ooil, i4));
                                } else if (i5 != 12) {
                                }
                            }
/* 218 */                   if (lol1i010 != null) {
/* 223 */                       o0i0oooil1io.I0000Il00O((i4 << 3) | 2, lol1i010);
                            }
/* 226 */                   iI000l1 = iI000II;
                        } else if ((i3 & 7) == 2) {
/* 72 */                    loo1oo0.getClass();
/* 86 */                    o000o0ii11oi2 = (o000O0II11oi) loo1oo0.I00000oIO.get(new loo10o1IolO0(looo1ooil, i3 >>> 3));
/* 88 */                    if (o000o0ii11oi2 != null) {
/* 102 */                       iI000l1 = ll11il.I0000Il00O(o0Ioolo.I0000Il00O.I00000oIO(o000o0ii11oi2.I0000Il00O.getClass()), bArr, iI000II, i2, i111i0i1);
/* 110 */                       loooi1oio.I0001Ioi1lo(o000o0ii11oi2.I0000O, i111i0i1.I0000Il00O);
                            } else {
/* 115 */                       iI000l1 = ll11il.I0001Ioi1lo(i3, bArr, iI000II, i2, o0i0oooil1io, i111i0i1);
                            }
                        } else {
/* 120 */                   iI000l1 = ll11il.I000l1(i3, bArr, iI000II, i2, i111i0i1);
                        }
/* 113 */               o000o0ii11oi = o000o0ii11oi2;
                    }
/* 228 */           if (iI000l1 == i2) {
/* 230 */               return;
                    }
/* 233 */           iilo0lOo110.I000O01llI0("Failed to parse the message.");
                }

                @Override
                public final void I000II(Object obj, o0iO1llOoO o0io1llooo) throws IOO1IOl1O10 {
/* 6 */             Iterator itI0000Il00O = ((looo1olo1) obj).zzb.I0000Il00O();
/* 14 */            if (itI0000Il00O.hasNext()) {
/* 109 */               o0iolO0OI o0iolo0oi = ((looolOIIo) ((Map.Entry) itI0000Il00O.next()).getKey()).I00iOIl.I00iOIl;
/* 111 */               o0iolO0OI o0iolo0oi2 = o0iolO0OI.I00iOIl;
/* 115 */               I000II.I001IO000("Found invalid MessageSet item.");
/* 332 */               return;
                    }
/* 18 */            o0i0oOOIl1Io o0i0oooil1io = ((o001IlOi0O) obj).zzc;
/* 23 */            for (int i = 0; i < o0i0oooil1io.I00000oIO; i++) {
/* 30 */                int i2 = o0i0oooil1io.I00000oOI[i] >>> 3;
/* 33 */                Object obj2 = o0i0oooil1io.I0000Il00O[i];
/* 35 */                boolean z = obj2 instanceof lol1I010;
/* 39 */                loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 46 */                if (z) {
/* 50 */                    lolio00.I000l1(11);
/* 53 */                    lolio00.I000iOII(2, i2);
/* 56 */                    lolio00.I0000O(3, (lol1I010) obj2);
/* 59 */                    lolio00.I000l1(12);
                        } else {
/* 65 */                    lolio00.I000l1(11);
/* 68 */                    lolio00.I000iOII(2, i2);
/* 73 */                    lolio00.I000l1(26);
/* 76 */                    o001IlOi0O o001iloi0o = (o001IlOi0O) ((loOo1oOil) obj2);
/* 82 */                    lolio00.I000l1(o001iloi0o.I000l1());
/* 85 */                    o001iloi0o.I000OiO(lolio00);
/* 88 */                    lolio00.I000l1(12);
                        }
                    }
                }

                @Override
                public final int I000O01llI0(o001IlOi0O o001iloi0o) {
/* 3 */             int iHashCode = o001iloi0o.zzc.hashCode();
/* 9 */             if (!this.I0000Il00O) {
/* 29 */                return iHashCode;
                    }
/* 23 */            return ((looo1olo1) o001iloi0o).zzb.I00000oIO.hashCode() + (iHashCode * 53);
                }

                @Override
                public final Object zze() {
/* 1 */             loOo1oOil looo1ooil = this.I00000oIO;
                    return looo1ooil instanceof o001IlOi0O ? (o001IlOi0O) ((o001IlOi0O) looo1ooil).I000iOII(4, null) : ((loolIIl0000i) ((o001IlOi0O) looo1ooil).I000iOII(5, null)).I0000Il00O();
                }
            }
