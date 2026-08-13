            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.NoSuchElementException;
            
            public final class OI0Olll10oI1 implements Oiil1o0OIi {
                public OI0ll0OIiO I00000oIO;
                public List I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public boolean I0000oI00;
                public OiiOlI0I I0001Ioi1lo;
                public OI0lli1 I000II;

                @Override
                public final boolean I00000oIO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final OiiO01I11iI I00000oOI() {
                    return this.I0000oI00 ? I000OiO() : I000O01llI0();
                }

                @Override
                public final OiiO01I11iI I0000Il00O(long j) {
/* 1 */             OI0lli1 oI0lli1 = this.I000II;
/* 3 */             if (oI0lli1 == null) {
/* 7 */                 oI0lli1 = new OI0lli1();
/* 10 */                List list = this.I00000oOI;
/* 15 */                int size = list.size();
/* 20 */                for (int i = 0; i < size; i++) {
/* 26 */                    OiiO01I11iI oiiO01I11iI = (OiiO01I11iI) list.get(i);
/* 28 */                    long j2 = oiiO01I11iI.I00000oIO;
/* 30 */                    int iI0000Il00O = oI0lli1.I0000Il00O(j2);
/* 34 */                    Object[] objArr = oI0lli1.I0000Il00O;
/* 36 */                    Object obj = objArr[iI0000Il00O];
/* 40 */                    oI0lli1.I00000oOI[iI0000Il00O] = j2;
/* 42 */                    objArr[iI0000Il00O] = oiiO01I11iI;
                        }
/* 47 */                this.I000II = oI0lli1;
                    }
/* 53 */            return (OiiO01I11iI) oI0lli1.I0000oI00(j);
                }

                @Override
                public final OiiOlI0I I0000O() {
/* 1 */             return this.I0001Ioi1lo;
                }

                @Override
                public final OiiO01I11iI I0000oI00() {
                    return I000OOo1O() == Ii0OiIIl00OO.I00iOIl ? I000O01llI0() : I000OiO();
                }

                @Override
                public final void I0001Ioi1lo(Iil1oo1 iil1oo1) {
/* 7 */             int iI000oI1ioi = I000oI1ioi(I0000oI00().I00000oIO);
/* 30 */            int iI000oI1ioi2 = I000oI1ioi((I000OOo1O() == Ii0OiIIl00OO.I00iOIl ? I000OiO() : I000O01llI0()).I00000oIO);
/* 34 */            int i = iI000oI1ioi + 1;
/* 36 */            if (i >= iI000oI1ioi2) {
/* 77 */                return;
                    }
/* 39 */            while (i < iI000oI1ioi2) {
/* 47 */                iil1oo1.invoke(this.I00000oOI.get(i));
/* 50 */                i++;
                    }
                }

                @Override
                public final int I000II() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final OiiO01I11iI I000O01llI0() {
/* 14 */            return (OiiO01I11iI) this.I00000oOI.get(I00100l0(this.I0000O, false));
                }

                @Override
                public final Ii0OiIIl00OO I000OOo1O() {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             int i2 = this.I0000O;
                    return i < i2 ? Ii0OiIIl00OO.I00iiI : i > i2 ? Ii0OiIIl00OO.I00iOIl : ((OiiO01I11iI) this.I00000oOI.get(i / 2)).I00000oOI();
                }

                @Override
                public final OiiO01I11iI I000OiO() {
/* 14 */            return (OiiO01I11iI) this.I00000oOI.get(I00100l0(this.I0000Il00O, true));
                }

                @Override
                public final int I000iOII() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final boolean I000l1(Oiil1o0OIi oiil1o0OIi) {
/* 4 */             if (this.I0001Ioi1lo != null && oiil1o0OIi != null && (oiil1o0OIi instanceof OI0Olll10oI1)) {
/* 12 */                boolean z = this.I0000oI00;
/* 14 */                OI0Olll10oI1 oI0Olll10oI1 = (OI0Olll10oI1) oiil1o0OIi;
/* 16 */                List list = oI0Olll10oI1.I00000oOI;
/* 20 */                if (z == oI0Olll10oI1.I0000oI00 && this.I0000Il00O == oI0Olll10oI1.I0000Il00O && this.I0000O == oI0Olll10oI1.I0000O) {
/* 34 */                    List list2 = this.I00000oOI;
/* 44 */                    if (list2.size() == list.size()) {
/* 50 */                        int size = list2.size();
/* 56 */                        for (int i = 0; i < size; i++) {
/* 62 */                            OiiO01I11iI oiiO01I11iI = (OiiO01I11iI) list2.get(i);
/* 68 */                            OiiO01I11iI oiiO01I11iI2 = (OiiO01I11iI) list.get(i);
/* 76 */                            if (oiiO01I11iI.I00000oIO != oiiO01I11iI2.I00000oIO || oiiO01I11iI.I0000Il00O != oiiO01I11iI2.I0000Il00O || oiiO01I11iI.I0000O != oiiO01I11iI2.I0000O) {
/* 3 */                                 return true;
                                    }
                                }
/* 54 */                        return false;
                            }
                        }
                    }
/* 3 */             return true;
                }

                @Override
                public final OI0lli1 I000lI(OiiOlI0I oiiOlI0I) {
/* 1 */             List list = this.I00000oOI;
/* 7 */             O1o0i0Ol0Oo0 o1o0i0Ol0Oo0 = new O1o0i0Ol0Oo0(16);
/* 14 */            O1IIii o1IIii = new O1IIii(11);
/* 17 */            o1IIii.I00iiI = oiiOlI0I;
/* 19 */            VarHandle.storeStoreFence();
/* 25 */            OI0OlOl oI0OlOl = new OI0OlOl(0);
/* 28 */            oI0OlOl.I00iiI = oiiOlI0I;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            return lO1OIiO0i.I00000oIO(oiiOlI0I, list, o1o0i0Ol0Oo0, o1IIii, oI0OlOl);
                }

                @Override
                public final int I000o00OoI0I() {
/* 3 */             return this.I00000oOI.size();
                }

                public final int I000oI1ioi(long j) {
                    try {
/* 3 */                 return this.I00000oIO.I0000Il00O(j);
                    } catch (NoSuchElementException e) {
/* 15 */                IoOOl0iOl1io.I000l1(IlIi0I0.I000iOII(j, "Invalid selectableId: "), e);
/* 18 */                return 0;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final int I00100l0(int i, boolean z) {
/* 5 */             int iOrdinal = I000OOo1O().ordinal();
                    int i2 = z;
/* 12 */            if (iOrdinal == 0) {
/* 27 */                i2 = z == 0 ? 1 : 0;
                    } else if (iOrdinal != 1) {
/* 16 */                if (iOrdinal != 2) {
/* 20 */                    I000II.I00000oIO();
/* 9 */                     return 0;
                        }
                    }
/* 31 */            return (i - (i2 ^ 1)) / 2;
                }

                public final String toString() {
/* 1 */             boolean z = this.I0000oI00;
/* 5 */             boolean z2 = true;
/* 10 */            float f = (this.I0000Il00O + 1) / 2.0f;
/* 15 */            float f2 = (this.I0000O + 1) / 2.0f;
/* 16 */            Ii0OiIIl00OO ii0OiIIl00OOI000OOo1O = I000OOo1O();
/* 24 */            StringBuilder sb = new StringBuilder("[\n\t");
/* 27 */            List list = this.I00000oOI;
/* 32 */            int size = list.size();
/* 37 */            int i = 0;
/* 38 */            while (i < size) {
/* 44 */                OiiO01I11iI oiiO01I11iI = (OiiO01I11iI) list.get(i);
/* 46 */                if (z2) {
/* 48 */                    z2 = false;
                        } else {
/* 52 */                    sb.append(",\n\t");
                        }
/* 55 */                i++;
/* 77 */                sb.append(i + " -> " + oiiO01I11iI);
                    }
/* 83 */            sb.append("\n]");
/* 86 */            String string = sb.toString();
/* 94 */            StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
/* 97 */            sb2.append(z);
/* 102 */           sb2.append(", startPosition=");
/* 105 */           sb2.append(f);
/* 110 */           sb2.append(", endPosition=");
/* 113 */           sb2.append(f2);
/* 118 */           sb2.append(", crossed=");
/* 121 */           sb2.append(ii0OiIIl00OOI000OOo1O);
/* 126 */           sb2.append(", infos=");
/* 131 */           return IIl001iO0Io.I00100l0(sb2, string, ")");
                }
            }
