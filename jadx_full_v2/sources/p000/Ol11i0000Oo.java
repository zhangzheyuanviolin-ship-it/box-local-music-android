            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            public final class Ol11i0000Oo implements IOlI1OoI0I, Iterable, O0IlIoi {
                public int I00iiI;
                public int I00iio;
                public int I00ilI0I1;
                public boolean I00io1l;
                public int I00ioIO;
                public HashMap I00l0OO0IO;
                public OI0l1oli1I I00li1OI;
                public int[] I00iOIl = new int[0];
                public Object[] I00iiO = new Object[0];
                public final Object I00ilO0 = new Object();
                public ArrayList I00l0I0l0lO1 = new ArrayList();

                public static final void I000OiO(Ol11il011o0 ol11il011o0, int i) {
/* 3 */             while (ol11il011o0.I001IO000 >= 0 && ol11il011o0.I001IIilI0O <= i) {
/* 9 */                 ol11il011o0.I00IoO0();
/* 12 */                ol11il011o0.I000OOo1O();
                    }
                }

                public final int I00000oOI(Ilo1iIi1OI01 ilo1iIi1OI01) {
/* 3 */             if (this.I00io1l) {
/* 7 */                 IOl1II00.I00000oIO("Use active SlotWriter to determine anchor location instead");
                    }
/* 14 */            if (!ilo1iIi1OI01.I00000oIO()) {
/* 18 */                OO1oio00IO.I00000oIO("Anchor refers to a group that was removed");
                    }
/* 21 */            return ilo1iIi1OI01.I00000oIO;
                }

                public final void I0000O() {
/* 6 */             this.I00l0OO0IO = new HashMap();
                }

                public final OI10I1IoI0Ol I000OOo1O(I1IOO010 i1ioo010, OI0oiiIO0 oI0oiiIO0) {
                    int i;
/* 1 */             Object[] objArr = oI0oiiIO0.I00000oIO;
/* 3 */             int i2 = oI0oiiIO0.I00000oOI;
/* 5 */             int i3 = 0;
/* 6 */             int i4 = 0;
                    while (true) {
/* 7 */                 if (i4 >= i2) {
                            break;
                        }
/* 23 */                if (I000o00OoI0I(ill0oooiIi.I00000oIO(((OI0Iol1O) objArr[i4]).I0000oI00))) {
/* 62 */                    i4++;
                        } else {
/* 27 */                    OI0oiiIO0 oI0oiiIO02 = new OI0oiiIO0();
/* 30 */                    Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 32 */                    int i5 = oI0oiiIO0.I00000oOI;
/* 35 */                    for (int i6 = 0; i6 < i5; i6++) {
/* 37 */                        Object obj = objArr2[i6];
/* 52 */                        if (I000o00OoI0I(ill0oooiIi.I00000oIO(((OI0Iol1O) obj).I0000oI00))) {
/* 54 */                            oI0oiiIO02.I00000oOI(obj);
                                }
                            }
/* 60 */                    oI0oiiIO0 = oI0oiiIO02;
                        }
                    }
/* 69 */            OIoO1Ol oIoO1Ol = new OIoO1Ol(29);
/* 72 */            oIoO1Ol.I00iiI = this;
/* 74 */            VarHandle.storeStoreFence();
/* 79 */            int i7 = 1;
/* 80 */            if (oI0oiiIO0.I00000oOI > 1) {
/* 91 */                Comparable comparable = (Comparable) oIoO1Ol.invoke(oI0oiiIO0.I000II(0));
/* 93 */                int i8 = oI0oiiIO0.I00000oOI;
/* 95 */                int i9 = 1;
                        while (true) {
/* 96 */                    if (i9 >= i8) {
                                break;
                            }
/* 106 */                   Comparable comparable2 = (Comparable) oIoO1Ol.invoke(oI0oiiIO0.I000II(i9));
/* 112 */                   if (comparable.compareTo(comparable2) > 0) {
/* 118 */                       OI0oiiIO0 oI0oiiIO03 = new OI0oiiIO0(oI0oiiIO0.I00000oOI);
/* 121 */                       Object[] objArr3 = oI0oiiIO0.I00000oIO;
/* 123 */                       int i10 = oI0oiiIO0.I00000oOI;
/* 126 */                       for (int i11 = 0; i11 < i10; i11++) {
/* 130 */                           oI0oiiIO03.I00000oOI(objArr3[i11]);
                                }
/* 136 */                       OI0oIOI oI0oIOI = oI0oiiIO03.I0000Il00O;
/* 138 */                       if (oI0oIOI == null) {
/* 143 */                           oI0oIOI = new OI0oIOI(i3);
/* 146 */                           oI0oIOI.I00iiI = oI0oiiIO03;
/* 148 */                           VarHandle.storeStoreFence();
/* 151 */                           oI0oiiIO03.I0000Il00O = oI0oIOI;
                                }
/* 159 */                       if (((OI0oiiIO0) oI0oIOI.I00iiI).I00000oOI > 1) {
/* 163 */                           II1liooilI iI1liooilI = new II1liooilI(i7);
/* 166 */                           iI1liooilI.I00iiI = oIoO1Ol;
/* 168 */                           VarHandle.storeStoreFence();
/* 171 */                           IOOiOil.I000oI1ioi(oI0oIOI, iI1liooilI);
                                }
/* 174 */                       oI0oiiIO0 = oI0oiiIO03;
                            } else {
/* 176 */                       i9++;
/* 178 */                       comparable = comparable2;
                            }
                        }
                    }
/* 184 */           if (oI0oiiIO0.I000OOo1O()) {
/* 186 */               return OiO10oio.I00000oOI;
                    }
/* 189 */           long[] jArr = OiO10oio.I00000oIO;
/* 193 */           OI10I1IoI0Ol oI10I1IoI0Ol = new OI10I1IoI0Ol();
/* 196 */           Ol11il011o0 ol11il011o0I000lI = I000lI();
                    try {
/* 200 */               Object[] objArr4 = oI0oiiIO0.I00000oIO;
/* 202 */               int i12 = oI0oiiIO0.I00000oOI;
/* 205 */               for (int i13 = 0; i13 < i12; i13++) {
/* 209 */                   OI0Iol1O oI0Iol1O = (OI0Iol1O) objArr4[i13];
/* 217 */                   int iI0000Il00O = ol11il011o0I000lI.I0000Il00O(ill0oooiIi.I00000oIO(oI0Iol1O.I0000oI00));
/* 223 */                   int iI00IO1 = ol11il011o0I000lI.I00IO1(ol11il011o0I000lI.I00000oOI, iI0000Il00O);
/* 227 */                   I000OiO(ol11il011o0I000lI, iI00IO1);
/* 230 */                   I000OiO(ol11il011o0I000lI, iI00IO1);
                            while (true) {
/* 233 */                       i = ol11il011o0I000lI.I00111O;
/* 235 */                       if (i == iI00IO1 || i == ol11il011o0I000lI.I001IIilI0O) {
                                    break;
                                }
/* 247 */                       if (iI00IO1 < ol11il011o0I000lI.I00111O(i) + i) {
/* 249 */                           ol11il011o0I000lI.I00O0i0ii();
                                } else {
/* 253 */                           ol11il011o0I000lI.I00IoIO0lI();
                                }
                            }
/* 257 */                   if (i != iI00IO1) {
/* 262 */                       IOl1II00.I00000oIO("Unexpected slot table structure");
                            }
/* 265 */                   ol11il011o0I000lI.I00O0i0ii();
/* 271 */                   ol11il011o0I000lI.I00000oIO(iI0000Il00O - ol11il011o0I000lI.I00111O);
/* 280 */                   oI10I1IoI0Ol.I000lI(oI0Iol1O, IOl1II00.I0000Il00O(oI0Iol1O.I0000Il00O, oI0Iol1O, ol11il011o0I000lI, i1ioo010));
                        }
/* 291 */               I000OiO(ol11il011o0I000lI, Integer.MAX_VALUE);
/* 294 */               ol11il011o0I000lI.I0000oI00(true);
/* 297 */               return oI10I1IoI0Ol;
                    } catch (Throwable th) {
/* 298 */               ol11il011o0I000lI.I0000oI00(false);
/* 332 */               throw th;
                    }
                }

                public final Ol11i0 I000iOII() {
/* 3 */             if (this.I00io1l) {
/* 52 */                I000II.I001IO000("Cannot read while a writer is pending");
/* 55 */                return null;
                    }
                    this.I00ilI0I1++;
/* 13 */            Ol11i0 ol11i0 = new Ol11i0();
/* 16 */            ol11i0.I00000oIO = this;
/* 20 */            ol11i0.I00000oOI = this.I00iOIl;
/* 22 */            int i = this.I00iiI;
/* 24 */            ol11i0.I0000Il00O = i;
/* 28 */            ol11i0.I0000O = this.I00iiO;
/* 32 */            ol11i0.I0000oI00 = this.I00iio;
/* 34 */            ol11i0.I000O01llI0 = i;
/* 37 */            ol11i0.I000OOo1O = -1;
/* 44 */            ol11i0.I000OiO = new IooOlI11lli();
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            return ol11i0;
                }

                public final Ol11il011o0 I000lI() {
/* 3 */             if (this.I00io1l) {
/* 7 */                 IOl1II00.I00000oIO("Cannot start a writer when another writer is pending");
                    }
/* 12 */            if (this.I00ilI0I1 > 0) {
/* 17 */                IOl1II00.I00000oIO("Cannot start a writer when a reader is pending");
                    }
/* 21 */            this.I00io1l = true;
                    this.I00ioIO++;
/* 30 */            Ol11il011o0 ol11il011o0 = new Ol11il011o0();
/* 33 */            ol11il011o0.I00000oIO = this;
/* 35 */            int[] iArr = this.I00iOIl;
/* 37 */            ol11il011o0.I00000oOI = iArr;
/* 39 */            Object[] objArr = this.I00iiO;
/* 41 */            ol11il011o0.I0000Il00O = objArr;
/* 45 */            ol11il011o0.I0000O = this.I00l0I0l0lO1;
/* 49 */            ol11il011o0.I0000oI00 = this.I00l0OO0IO;
/* 53 */            ol11il011o0.I0001Ioi1lo = this.I00li1OI;
/* 55 */            int i = this.I00iiI;
/* 57 */            ol11il011o0.I000II = i;
/* 63 */            ol11il011o0.I000O01llI0 = (iArr.length / 5) - i;
/* 65 */            int i2 = this.I00iio;
/* 67 */            ol11il011o0.I000iOII = i2;
/* 71 */            ol11il011o0.I000l1 = objArr.length - i2;
/* 73 */            ol11il011o0.I000lI = i;
/* 80 */            ol11il011o0.I00100l0 = new IooOlI11lli();
/* 87 */            ol11il011o0.I00100o1O0lo = new IooOlI11lli();
/* 94 */            ol11il011o0.I0010I0i = new IooOlI11lli();
/* 96 */            ol11il011o0.I001IIilI0O = i;
/* 99 */            ol11il011o0.I001IO000 = -1;
/* 101 */           VarHandle.storeStoreFence();
/* 110 */           return ol11il011o0;
                }

                public final boolean I000o00OoI0I(Ilo1iIi1OI01 ilo1iIi1OI01) {
                    int iI0000O;
                    return ilo1iIi1OI01.I00000oIO() && (iI0000O = Ol11iOOOoo1.I0000O(this.I00l0I0l0lO1, ilo1iIi1OI01.I00000oIO, this.I00iiI)) >= 0 && O0000Ioio00.I0000O(this.I00l0I0l0lO1.get(iI0000O), ilo1iIi1OI01);
                }

                public final IloI10l1l I000oI1ioi(int i) {
                    int i2;
                    ArrayList arrayList;
                    int iI0000O;
/* 1 */             HashMap map = this.I00l0OO0IO;
/* 4 */             if (map != null) {
/* 8 */                 if (this.I00io1l) {
/* 12 */                    IOl1II00.I00000oIO("use active SlotWriter to crate an anchor for location instead");
                        }
/* 36 */                Ilo1iIi1OI01 ilo1iIi1OI01 = (i < 0 || i >= (i2 = this.I00iiI) || (iI0000O = Ol11iOOOoo1.I0000O((arrayList = this.I00l0I0l0lO1), i, i2)) < 0) ? null : (Ilo1iIi1OI01) arrayList.get(iI0000O);
/* 37 */                if (ilo1iIi1OI01 != null) {
/* 43 */                    return (IloI10l1l) map.get(ilo1iIi1OI01);
                        }
                    }
/* 3 */             return null;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return new Io10oO1l001(this, 0, this.I00iiI);
                }
            }
