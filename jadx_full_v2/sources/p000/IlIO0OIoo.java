            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class IlIO0OIoo {
                public static final int I0000Il00O = 0;
                public Ol1Ili0 I00000oIO;
                public boolean I00000oOI;

                static {
/* 3 */             Ol1Ili0 ol1Ili0I000O01llI0 = Ol1Ili0.I000O01llI0();
/* 7 */             IlIO0OIoo ilIO0OIoo = new IlIO0OIoo();
/* 10 */            ilIO0OIoo.I00000oIO = ol1Ili0I000O01llI0;
/* 12 */            ilIO0OIoo.I00000oIO();
/* 15 */            ilIO0OIoo.I00000oIO();
/* 18 */            VarHandle.storeStoreFence();
                }

                public static void I00000oOI(IOOOiI0 iOOOiI0, i011I10o1IlI i011i10o1ili, int i, Object obj) throws IOException, Oolio0o0olIO {
/* 3 */             if (i011i10o1ili == i011I10o1IlI.I00ilI0I1) {
/* 8 */                 iOOOiI0.I001l0I00(i, 3);
/* 11 */                ((I01IlIoOI) obj).I00000oOI(iOOOiI0);
/* 15 */                iOOOiI0.I001l0I00(i, 4);
                    }
/* 21 */            iOOOiI0.I001l0I00(i, i011i10o1ili.I00iiI);
                    switch (i011i10o1ili.ordinal()) {
                        case 0:
/* 263 */                   iOOOiI0.I00111O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 249 */                   iOOOiI0.I0010I0i(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 235 */                   iOOOiI0.I00II0Ol1O0l(((Long) obj).longValue());
                            break;
                        case 3:
/* 225 */                   iOOOiI0.I00II0Ol1O0l(((Long) obj).longValue());
                            break;
                        case 4:
/* 215 */                   iOOOiI0.I001IO000(((Integer) obj).intValue());
                            break;
                        case 5:
/* 205 */                   iOOOiI0.I00111O(((Long) obj).longValue());
                            break;
                        case 6:
/* 195 */                   iOOOiI0.I0010I0i(((Integer) obj).intValue());
                            break;
                        case 7:
/* 185 */                   iOOOiI0.I000l1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 164 */                   if (!(obj instanceof IIO1i00loOo)) {
/* 174 */                       iOOOiI0.I001iOo1i0O((String) obj);
                                break;
                            } else {
/* 168 */                       iOOOiI0.I00100l0((IIO1i00loOo) obj);
                                break;
                            }
                        case 9:
/* 158 */                   ((I01IlIoOI) obj).I00000oOI(iOOOiI0);
                            break;
                        case 10:
/* 139 */                   I01IlIoOI i01IlIoOI = (I01IlIoOI) obj;
/* 149 */                   iOOOiI0.I001lllioOl(((Io00Ol1o10O) i01IlIoOI).I00000oIO(null));
/* 152 */                   i01IlIoOI.I00000oOI(iOOOiI0);
                            break;
                        case 11:
/* 120 */                   if (!(obj instanceof IIO1i00loOo)) {
/* 128 */                       byte[] bArr = (byte[]) obj;
/* 130 */                       int length = bArr.length;
/* 131 */                       iOOOiI0.I001lllioOl(length);
/* 135 */                       iOOOiI0.I000lI(bArr, 0, length);
                                break;
                            } else {
/* 124 */                       iOOOiI0.I00100l0((IIO1i00loOo) obj);
                                break;
                            }
                        case 12:
/* 114 */                   iOOOiI0.I001lllioOl(((Integer) obj).intValue());
                            break;
                        case 13:
/* 86 */                    if (!(obj instanceof Oo0oOoIo0ol)) {
/* 104 */                       iOOOiI0.I001IO000(((Integer) obj).intValue());
                                break;
                            } else {
/* 94 */                        iOOOiI0.I001IO000(((Oo0oOoIo0ol) obj).I00000oIO());
                                break;
                            }
                        case 14:
/* 80 */                    iOOOiI0.I0010I0i(((Integer) obj).intValue());
                            break;
                        case 15:
/* 70 */                    iOOOiI0.I00111O(((Long) obj).longValue());
                            break;
                        case 16:
/* 51 */                    int iIntValue = ((Integer) obj).intValue();
/* 60 */                    iOOOiI0.I001lllioOl((iIntValue >> 31) ^ (iIntValue << 1));
                            break;
                        case 17:
/* 34 */                    long jLongValue = ((Long) obj).longValue();
/* 45 */                    iOOOiI0.I00II0Ol1O0l((jLongValue >> 63) ^ (jLongValue << 1));
                            break;
                    }
                }

                public final void I00000oIO() {
/* 1 */             Ol1Ili0 ol1Ili0 = this.I00000oIO;
/* 5 */             if (this.I00000oOI) {
/* 7 */                 return;
                    }
/* 8 */             int i = ol1Ili0.I00iiI;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 18 */                Object obj = ol1Ili0.I0000Il00O(i2).I00iiI;
/* 22 */                if (obj instanceof Io00Ol1o10O) {
/* 26 */                    ((Io00Ol1o10O) obj).I000OiO();
                        }
                    }
/* 36 */            Iterator it = ol1Ili0.I0000O().iterator();
/* 44 */            while (it.hasNext()) {
/* 52 */                Object value = ((Map.Entry) it.next()).getValue();
/* 58 */                if (value instanceof Io00Ol1o10O) {
/* 62 */                    ((Io00Ol1o10O) value).I000OiO();
                        }
                    }
/* 68 */            if (!ol1Ili0.I00iio) {
/* 72 */                if (ol1Ili0.I00iiI > 0) {
/* 112 */                   ol1Ili0.I0000Il00O(0).I00iOIl.getClass();
/* 115 */                   OIiilo1Ool0o.I00000oIO();
/* 118 */                   return;
                        } else {
/* 78 */                    Iterator it2 = ol1Ili0.I0000O().iterator();
/* 86 */                    if (it2.hasNext()) {
/* 99 */                        ((Map.Entry) it2.next()).getKey().getClass();
/* 102 */                       OIiilo1Ool0o.I00000oIO();
/* 105 */                       return;
                            }
                        }
                    }
/* 122 */           if (!ol1Ili0.I00iio) {
/* 141 */               ol1Ili0.I00iiO = ol1Ili0.I00iiO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ol1Ili0.I00iiO);
/* 160 */               ol1Ili0.I00ilO0 = ol1Ili0.I00ilO0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ol1Ili0.I00ilO0);
/* 162 */               ol1Ili0.I00iio = true;
                    }
/* 164 */           this.I00000oOI = true;
                }

                public final Object clone() {
/* 3 */             IlIO0OIoo ilIO0OIoo = new IlIO0OIoo();
/* 10 */            ilIO0OIoo.I00000oIO = Ol1Ili0.I000O01llI0();
/* 12 */            Ol1Ili0 ol1Ili0 = this.I00000oIO;
/* 17 */            if (ol1Ili0.I00iiI > 0) {
/* 61 */                ol1Ili0.I0000Il00O(0).I00iOIl.getClass();
/* 64 */                OIiilo1Ool0o.I00000oIO();
/* 16 */                return null;
                    }
/* 23 */            Iterator it = ol1Ili0.I0000O().iterator();
/* 31 */            if (!it.hasNext()) {
/* 33 */                return ilIO0OIoo;
                    }
/* 38 */            Map.Entry entry = (Map.Entry) it.next();
/* 44 */            if (entry.getKey() != null) {
/* 46 */                OIiilo1Ool0o.I00000oIO();
/* 16 */                return null;
                    }
/* 50 */            entry.getValue();
/* 53 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof IlIO0OIoo) {
/* 17 */                return this.I00000oIO.equals(((IlIO0OIoo) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
