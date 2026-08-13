            package p000;

            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            
            public abstract class i1oIooioiO implements Cloneable {
                public final i1oi01OllI I00iOIl;
                public i1oi01OllI I00iiI;

                public i1oIooioiO(i1oi01OllI i1oi01olli) {
/* 4 */             this.I00iOIl = i1oi01olli;
/* 10 */            if (i1oi01olli.I0001Ioi1lo()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = i1oi01olli.I000O01llI0();
                }

                public static void I00000oIO(int i, List list) {
/* 5 */             int size = list.size() - i;
/* 25 */            String strI00100o1O0lo = IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
/* 29 */            int size2 = list.size();
                    while (true) {
                        size2--;
/* 35 */                if (size2 < i) {
/* 106 */                   throw new NullPointerException(strI00100o1O0lo);
                        }
/* 37 */                list.remove(size2);
                    }
                }

                public static void I00000oOI(Iterable iterable, List list) {
/* 1 */             iterable.getClass();
/* 7 */             if (iterable instanceof iI0II1iil) {
/* 11 */                List listZza = ((iI0II1iil) iterable).zza();
/* 16 */                iI0II1iil ii0ii1iil = (iI0II1iil) list;
/* 18 */                int size = list.size();
/* 30 */                for (Object obj : listZza) {
/* 36 */                    if (obj == null) {
/* 42 */                        int size2 = ii0ii1iil.size() - size;
/* 62 */                        String strI00100o1O0lo = IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
/* 66 */                        int size3 = ii0ii1iil.size();
                                while (true) {
                                    size3--;
/* 72 */                            if (size3 < size) {
/* 78 */                                IOOlIIilOl0.I000II(strI00100o1O0lo);
/* 81 */                                return;
                                    }
/* 74 */                            ii0ii1iil.remove(size3);
                                }
                            } else if (obj instanceof i1lIIl01O) {
/* 86 */                        ii0ii1iil.zzb();
                            } else if (obj instanceof byte[]) {
/* 94 */                        byte[] bArr = (byte[]) obj;
/* 97 */                        i1lIIl01O.I000lI(bArr, 0, bArr.length);
/* 100 */                       ii0ii1iil.zzb();
                            } else {
/* 106 */                       ii0ii1iil.add((String) obj);
                            }
                        }
/* 249 */               return;
                    }
/* 112 */           if (iterable instanceof iI1001iili) {
/* 252 */               list.addAll((Collection) iterable);
/* 332 */               return;
                    }
/* 116 */           if (iterable instanceof Collection) {
/* 121 */               int size4 = ((Collection) iterable).size();
/* 127 */               if (list instanceof ArrayList) {
/* 137 */                   ((ArrayList) list).ensureCapacity(list.size() + size4);
                        } else if (list instanceof iI10i0liO) {
/* 146 */                   iI10i0liO ii10i0lio = (iI10i0liO) list;
/* 150 */                   int i = ii10i0lio.I00iiO + size4;
/* 153 */                   int length = ii10i0lio.I00iiI.length;
/* 154 */                   if (i > length) {
/* 159 */                       if (length != 0) {
/* 161 */                           while (length < i) {
/* 166 */                               length = OooioIOo1.I000II(length, 3, 2, 1, 10);
                                    }
/* 177 */                           ii10i0lio.I00iiI = Arrays.copyOf(ii10i0lio.I00iiI, length);
                                } else {
/* 186 */                           ii10i0lio.I00iiI = new Object[Math.max(i, 10)];
                                }
                            }
                        }
                    }
/* 188 */           int size5 = list.size();
/* 195 */           if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
/* 233 */               for (Object obj2 : iterable) {
/* 239 */                   if (obj2 == null) {
/* 245 */                       I00000oIO(size5, list);
/* 248 */                       throw null;
                            }
/* 241 */                   list.add(obj2);
                        }
/* 249 */               return;
                    }
/* 201 */           List list2 = (List) iterable;
/* 203 */           int size6 = list2.size();
/* 207 */           for (int i2 = 0; i2 < size6; i2++) {
/* 209 */               Object obj3 = list2.get(i2);
/* 213 */               if (obj3 == null) {
/* 221 */                   I00000oIO(size5, list);
/* 224 */                   throw null;
                        }
/* 215 */               list.add(obj3);
                    }
                }

                public final void I0000Il00O() {
/* 7 */             if (this.I00iiI.I0001Ioi1lo()) {
/* 55 */                return;
                    }
/* 11 */            i1oi01OllI i1oi01olliI000O01llI0 = this.I00iOIl.I000O01llI0();
/* 27 */            iI10O00O.I0000Il00O.I00000oIO(i1oi01olliI000O01llI0.getClass()).zzd(i1oi01olliI000O01llI0, this.I00iiI);
/* 30 */            this.I00iiI = i1oi01olliI000O01llI0;
                }

                public final i1oIooioiO clone() {
/* 8 */             i1oIooioiO i1oiooioio = (i1oIooioiO) this.I00iOIl.I0010o(5);
/* 12 */            boolean zI0001Ioi1lo = this.I00iiI.I0001Ioi1lo();
/* 16 */            i1oi01OllI i1oi01olli = this.I00iiI;
/* 18 */            if (zI0001Ioi1lo) {
/* 21 */                i1oi01olli.getClass();
/* 34 */                iI10O00O.I0000Il00O.I00000oIO(i1oi01olli.getClass()).I0000Il00O(i1oi01olli);
/* 37 */                i1oi01olli.I000II();
/* 40 */                i1oi01olli = this.I00iiI;
                    }
/* 42 */            i1oiooioio.I00iiI = i1oi01olli;
/* 55 */            return i1oiooioio;
                }

                public final i1oi01OllI I0000oI00() {
/* 3 */             boolean zI0001Ioi1lo = this.I00iiI.I0001Ioi1lo();
/* 7 */             i1oi01OllI i1oi01olli = this.I00iiI;
/* 9 */             if (zI0001Ioi1lo) {
/* 12 */                i1oi01olli.getClass();
/* 25 */                iI10O00O.I0000Il00O.I00000oIO(i1oi01olli.getClass()).I0000Il00O(i1oi01olli);
/* 28 */                i1oi01olli.I000II();
/* 31 */                i1oi01olli = this.I00iiI;
                    }
/* 33 */            i1oi01olli.getClass();
/* 41 */            if (i1oi01OllI.I00100o1O0lo(i1oi01olli, true)) {
/* 43 */                return i1oi01olli;
                    }
/* 55 */            throw new iI11ol0olo();
                }

                public final void I0001Ioi1lo(i1oi01OllI i1oi01olli) {
/* 1 */             i1oi01OllI i1oi01olli2 = this.I00iOIl;
/* 7 */             if (i1oi01olli2.equals(i1oi01olli)) {
/* 77 */                return;
                    }
/* 15 */            if (!this.I00iiI.I0001Ioi1lo()) {
/* 17 */                i1oi01OllI i1oi01olliI000O01llI0 = i1oi01olli2.I000O01llI0();
/* 33 */                iI10O00O.I0000Il00O.I00000oIO(i1oi01olliI000O01llI0.getClass()).zzd(i1oi01olliI000O01llI0, this.I00iiI);
/* 36 */                this.I00iiI = i1oi01olliI000O01llI0;
                    }
/* 38 */            i1oi01OllI i1oi01olli3 = this.I00iiI;
/* 50 */            iI10O00O.I0000Il00O.I00000oIO(i1oi01olli3.getClass()).zzd(i1oi01olli3, i1oi01olli);
                }

                public final void I000II(byte[] bArr, int i, i1o0l0i i1o0l0iVar) throws iI00lI {
/* 7 */             if (!this.I00iiI.I0001Ioi1lo()) {
/* 11 */                i1oi01OllI i1oi01olliI000O01llI0 = this.I00iOIl.I000O01llI0();
/* 27 */                iI10O00O.I0000Il00O.I00000oIO(i1oi01olliI000O01llI0.getClass()).zzd(i1oi01olliI000O01llI0, this.I00iiI);
/* 30 */                this.I00iiI = i1oi01olliI000O01llI0;
                    }
                    try {
/* 54 */                iI10O00O.I0000Il00O.I00000oIO(this.I00iiI.getClass()).I000II(this.I00iiI, bArr, 0, i, new i1O1ll0i0(i1o0l0iVar));
                    } catch (iI00lI e) {
/* 98 */                throw e;
                    } catch (IOException e2) {
/* 62 */                OIiilo1Ool0o.I000iOII("Reading from byte array should not throw IOException.", e2);
                    } catch (IndexOutOfBoundsException unused) {
/* 68 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }
            }
