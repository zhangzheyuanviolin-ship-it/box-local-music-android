            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class OiioiIIlooo implements Oil0O0I, Iterable, O0IlIoi {
                public final OI10I1IoI0Ol I00iOIl;
                public O1OiIoo1 I00iiI;
                public boolean I00iiO;
                public boolean I00iio;

                public OiioiIIlooo() {
/* 4 */             long[] jArr = OiO10oio.I00000oIO;
/* 11 */            this.I00iOIl = new OI10I1IoI0Ol();
                }

                @Override
                public final void I00000oOI(Oil0IoooOio oil0IoooOio, Object obj) {
/* 1 */             boolean z = obj instanceof I01lOOlO0o;
/* 3 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iOIl;
/* 5 */             if (z && oI10I1IoI0Ol.I0000Il00O(oil0IoooOio)) {
/* 17 */                I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) oI10I1IoI0Ol.I000II(oil0IoooOio);
/* 21 */                I01lOOlO0o i01lOOlO0o2 = (I01lOOlO0o) obj;
/* 23 */                String str = i01lOOlO0o2.I00000oIO;
/* 25 */                if (str == null) {
/* 27 */                    str = i01lOOlO0o.I00000oIO;
                        }
/* 29 */                IlliIlI illiIlI = i01lOOlO0o2.I00000oOI;
/* 31 */                if (illiIlI == null) {
/* 33 */                    illiIlI = i01lOOlO0o.I00000oOI;
                        }
/* 38 */                oI10I1IoI0Ol.I000lI(oil0IoooOio, new I01lOOlO0o(str, illiIlI));
                    } else {
/* 42 */                oI10I1IoI0Ol.I000lI(oil0IoooOio, obj);
                    }
/* 45 */            oil0IoooOio.getClass();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OiioiIIlooo I0000O() {
/* 3 */             OiioiIIlooo oiioiIIlooo = new OiioiIIlooo();
/* 8 */             oiioiIIlooo.I00iiO = this.I00iiO;
/* 12 */            oiioiIIlooo.I00iio = this.I00iio;
/* 14 */            OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iOIl;
/* 16 */            Object[] objArr = oI10I1IoI0Ol.I00000oOI;
/* 18 */            Object[] objArr2 = oI10I1IoI0Ol.I0000Il00O;
/* 20 */            long[] jArr = oI10I1IoI0Ol.I00000oIO;
                    int length = jArr.length - 2;
/* 25 */            if (length >= 0) {
/* 28 */                int i = 0;
                        while (true) {
/* 29 */                    long j = jArr[i];
/* 43 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 52 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 55 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 64 */                            if ((255 & j) < 128) {
/* 68 */                                int i4 = (i << 3) + i3;
/* 75 */                                oiioiIIlooo.I00iOIl.I000lI(objArr[i4], objArr2[i4]);
                                    }
/* 78 */                            j >>= 8;
                                }
/* 82 */                        if (i2 != 8) {
                                    break;
                                }
/* 84 */                        if (i == length) {
                                    break;
                                }
/* 86 */                        i++;
                            }
                        }
                    }
/* 110 */           return oiioiIIlooo;
                }

                public final Object I000OOo1O(Oil0IoooOio oil0IoooOio) {
/* 3 */             Object objI000II = this.I00iOIl.I000II(oil0IoooOio);
/* 7 */             if (objI000II != null) {
/* 9 */                 return objI000II;
                    }
/* 14 */            IioIoO10iOiI.I000O01llI0(oil0IoooOio, "Key not present: ", " - consider getOrElse or getOrNull");
/* 17 */            return null;
                }

                public final void I000OiO(OiioiIIlooo oiioiIIlooo) {
/* 3 */             OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo.I00iOIl;
/* 5 */             Object[] objArr = oI10I1IoI0Ol.I00000oOI;
/* 7 */             Object[] objArr2 = oI10I1IoI0Ol.I0000Il00O;
/* 9 */             long[] jArr = oI10I1IoI0Ol.I00000oIO;
                    int length = jArr.length - 2;
/* 14 */            if (length < 0) {
/* 168 */               return;
                    }
/* 16 */            int i = 0;
                    while (true) {
/* 17 */                long j = jArr[i];
/* 31 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 40 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 43 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 52 */                        if ((255 & j) < 128) {
/* 56 */                            int i4 = (i << 3) + i3;
/* 57 */                            Object obj = objArr[i4];
/* 59 */                            Object obj2 = objArr2[i4];
/* 61 */                            Oil0IoooOio oil0IoooOio = (Oil0IoooOio) obj;
/* 65 */                            OI10I1IoI0Ol oI10I1IoI0Ol2 = this.I00iOIl;
/* 73 */                            Object objInvoke = oil0IoooOio.I00000oOI.invoke(oI10I1IoI0Ol2.I000II(oil0IoooOio), obj2);
/* 77 */                            if (objInvoke != null) {
/* 79 */                                oI10I1IoI0Ol2.I000lI(oil0IoooOio, objInvoke);
                                    }
                                }
/* 85 */                        j >>= 8;
                            }
/* 91 */                    if (i2 != 8) {
/* 168 */                       return;
                            }
                        }
/* 96 */                if (i == length) {
/* 168 */                   return;
                        } else {
/* 98 */                    i++;
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof OiioiIIlooo)) {
/* 35 */                return false;
                    }
/* 9 */             OiioiIIlooo oiioiIIlooo = (OiioiIIlooo) obj;
                    return this.I00iOIl.equals(oiioiIIlooo.I00iOIl) && this.I00iiO == oiioiIIlooo.I00iiO && this.I00iio == oiioiIIlooo.I00iio;
                }

                public final int hashCode() {
/* 22 */            return Boolean.hashCode(this.I00iio) + Oi010OO0.I000OOo1O(this.I00iOIl.hashCode() * 31, 31, this.I00iiO);
                }

                @Override
                public final Iterator iterator() {
/* 1 */             O1OiIoo1 o1OiIoo1 = this.I00iiI;
/* 3 */             if (o1OiIoo1 == null) {
/* 7 */                 o1OiIoo1 = new O1OiIoo1();
/* 12 */                o1OiIoo1.I00iOIl = this.I00iOIl;
/* 14 */                VarHandle.storeStoreFence();
/* 17 */                this.I00iiI = o1OiIoo1;
                    }
/* 25 */            return ((Il0l1iO11i) o1OiIoo1.entrySet()).iterator();
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
                  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    String str;
/* 5 */             StringBuilder sb = new StringBuilder();
/* 12 */            if (this.I00iiO) {
/* 16 */                sb.append("mergeDescendants=true");
/* 10 */                str = ", ";
                    } else {
/* 21 */                str = "";
                    }
/* 25 */            if (this.I00iio) {
/* 27 */                sb.append(str);
/* 32 */                sb.append("isClearingSemantics=true");
/* 10 */                str = ", ";
                    }
/* 36 */            OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iOIl;
/* 38 */            Object[] objArr = oI10I1IoI0Ol.I00000oOI;
/* 40 */            Object[] objArr2 = oI10I1IoI0Ol.I0000Il00O;
/* 42 */            long[] jArr = oI10I1IoI0Ol.I00000oIO;
                    int length = jArr.length - 2;
/* 47 */            if (length >= 0) {
/* 49 */                int i = 0;
                        while (true) {
/* 50 */                    long j = jArr[i];
/* 64 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 73 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 76 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 85 */                            if ((255 & j) < 128) {
/* 89 */                                int i4 = (i << 3) + i3;
/* 90 */                                Object obj = objArr[i4];
/* 92 */                                Object obj2 = objArr2[i4];
/* 98 */                                sb.append(str);
/* 103 */                               sb.append(((Oil0IoooOio) obj).I00000oIO);
/* 108 */                               sb.append(" : ");
/* 111 */                               sb.append(obj2);
/* 10 */                                str = ", ";
                                    }
/* 115 */                           j >>= 8;
                                }
/* 119 */                       if (i2 != 8) {
                                    break;
                                }
/* 121 */                       if (i == length) {
                                    break;
                                }
/* 123 */                       i++;
                            }
                        }
                    }
/* 148 */           return l0Io1i.I00000oIO(this) + "{ " + ((Object) sb) + " }";
                }
            }
