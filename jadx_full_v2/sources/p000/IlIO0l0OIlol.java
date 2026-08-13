            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class IlIO0l0OIlol {
                public static final int I0000Il00O = 0;
                public Ol1Io11i1Ol I00000oIO;
                public boolean I00000oOI;

                static {
/* 3 */             Ol1Io11i1Ol ol1Io11i1OlI000O01llI0 = Ol1Io11i1Ol.I000O01llI0();
/* 7 */             IlIO0l0OIlol ilIO0l0OIlol = new IlIO0l0OIlol();
/* 10 */            ilIO0l0OIlol.I00000oIO = ol1Io11i1OlI000O01llI0;
/* 12 */            ilIO0l0OIlol.I00000oIO();
/* 15 */            ilIO0l0OIlol.I00000oIO();
/* 18 */            VarHandle.storeStoreFence();
                }

                public static void I00000oOI(IOOOio0o iOOOio0o, i011lOoO i011looo, int i, Object obj) {
/* 3 */             if (i011looo == i011lOoO.I00iio) {
/* 8 */                 iOOOio0o.I001lllioOl(i, 3);
/* 11 */                ((I01Ilo0i) obj).I00000oOI(iOOOio0o);
/* 15 */                iOOOio0o.I001lllioOl(i, 4);
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, i011looo.I00iiI);
                    switch (i011looo.ordinal()) {
                        case 0:
/* 249 */                   iOOOio0o.I001IIilI0O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 235 */                   iOOOio0o.I0010o(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 221 */                   iOOOio0o.I00IO1(((Long) obj).longValue());
                            break;
                        case 3:
/* 211 */                   iOOOio0o.I00IO1(((Long) obj).longValue());
                            break;
                        case 4:
/* 201 */                   iOOOio0o.I001i1O0Ol(((Integer) obj).intValue());
                            break;
                        case 5:
/* 191 */                   iOOOio0o.I001IIilI0O(((Long) obj).longValue());
                            break;
                        case 6:
/* 181 */                   iOOOio0o.I0010o(((Integer) obj).intValue());
                            break;
                        case 7:
/* 171 */                   iOOOio0o.I000lI(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 150 */                   if (!(obj instanceof IIO1ooI)) {
/* 160 */                       iOOOio0o.I001lIiIIo1O((String) obj);
                                break;
                            } else {
/* 154 */                       iOOOio0o.I00100o1O0lo((IIO1ooI) obj);
                                break;
                            }
                        case 9:
/* 144 */                   ((I01Ilo0i) obj).I00000oOI(iOOOio0o);
                            break;
                        case 10:
/* 125 */                   I01Ilo0i i01Ilo0i = (I01Ilo0i) obj;
/* 135 */                   iOOOio0o.I00II0Ol1O0l(((Io00l0) i01Ilo0i).I00000oIO(null));
/* 138 */                   i01Ilo0i.I00000oOI(iOOOio0o);
                            break;
                        case 11:
/* 106 */                   if (!(obj instanceof IIO1ooI)) {
/* 114 */                       byte[] bArr = (byte[]) obj;
/* 116 */                       int length = bArr.length;
/* 117 */                       iOOOio0o.I00II0Ol1O0l(length);
/* 121 */                       iOOOio0o.I000o00OoI0I(bArr, 0, length);
                                break;
                            } else {
/* 110 */                       iOOOio0o.I00100o1O0lo((IIO1ooI) obj);
                                break;
                            }
                        case 12:
/* 100 */                   iOOOio0o.I00II0Ol1O0l(((Integer) obj).intValue());
                            break;
                        case 13:
/* 90 */                    iOOOio0o.I001i1O0Ol(((Integer) obj).intValue());
                            break;
                        case 14:
/* 80 */                    iOOOio0o.I0010o(((Integer) obj).intValue());
                            break;
                        case 15:
/* 70 */                    iOOOio0o.I001IIilI0O(((Long) obj).longValue());
                            break;
                        case 16:
/* 51 */                    int iIntValue = ((Integer) obj).intValue();
/* 60 */                    iOOOio0o.I00II0Ol1O0l((iIntValue >> 31) ^ (iIntValue << 1));
                            break;
                        case 17:
/* 34 */                    long jLongValue = ((Long) obj).longValue();
/* 45 */                    iOOOio0o.I00IO1((jLongValue >> 63) ^ (jLongValue << 1));
                            break;
                    }
                }

                public final void I00000oIO() {
/* 1 */             Ol1Io11i1Ol ol1Io11i1Ol = this.I00000oIO;
/* 5 */             if (this.I00000oOI) {
/* 7 */                 return;
                    }
/* 10 */            int size = ol1Io11i1Ol.I00iOIl.size();
/* 16 */            for (int i = 0; i < size; i++) {
/* 18 */                Map.Entry entryI0000Il00O = ol1Io11i1Ol.I0000Il00O(i);
/* 28 */                if (entryI0000Il00O.getValue() instanceof Io00l0) {
/* 34 */                    Io00l0 io00l0 = (Io00l0) entryI0000Il00O.getValue();
/* 36 */                    io00l0.getClass();
/* 39 */                    OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 41 */                    oOi1oI.getClass();
/* 52 */                    oOi1oI.I00000oIO(io00l0.getClass()).I00000oOI(io00l0);
/* 55 */                    io00l0.I000O01llI0();
                        }
                    }
/* 63 */            if (!ol1Io11i1Ol.I00iiO) {
/* 71 */                if (ol1Io11i1Ol.I00iOIl.size() > 0) {
/* 113 */                   ol1Io11i1Ol.I0000Il00O(0).getKey().getClass();
/* 116 */                   OIiilo1Ool0o.I00000oIO();
/* 119 */                   return;
                        } else {
/* 77 */                    Iterator it = ol1Io11i1Ol.I0000O().iterator();
/* 85 */                    if (it.hasNext()) {
/* 98 */                        ((Map.Entry) it.next()).getKey().getClass();
/* 101 */                       OIiilo1Ool0o.I00000oIO();
/* 104 */                       return;
                            }
                        }
                    }
/* 123 */           if (!ol1Io11i1Ol.I00iiO) {
/* 142 */               ol1Io11i1Ol.I00iiI = ol1Io11i1Ol.I00iiI.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ol1Io11i1Ol.I00iiI);
/* 161 */               ol1Io11i1Ol.I00ilI0I1 = ol1Io11i1Ol.I00ilI0I1.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ol1Io11i1Ol.I00ilI0I1);
/* 163 */               ol1Io11i1Ol.I00iiO = true;
                    }
/* 165 */           this.I00000oOI = true;
                }

                public final Object clone() {
/* 3 */             IlIO0l0OIlol ilIO0l0OIlol = new IlIO0l0OIlol();
/* 10 */            ilIO0l0OIlol.I00000oIO = Ol1Io11i1Ol.I000O01llI0();
/* 12 */            Ol1Io11i1Ol ol1Io11i1Ol = this.I00000oIO;
/* 21 */            if (ol1Io11i1Ol.I00iOIl.size() > 0) {
/* 59 */                Map.Entry entryI0000Il00O = ol1Io11i1Ol.I0000Il00O(0);
/* 67 */                if (entryI0000Il00O.getKey() != null) {
/* 69 */                    OIiilo1Ool0o.I00000oIO();
/* 20 */                    return null;
                        }
/* 73 */                entryI0000Il00O.getValue();
/* 110 */               throw null;
                    }
/* 27 */            Iterator it = ol1Io11i1Ol.I0000O().iterator();
/* 35 */            if (!it.hasNext()) {
/* 37 */                return ilIO0l0OIlol;
                    }
/* 42 */            Map.Entry entry = (Map.Entry) it.next();
/* 48 */            if (entry.getKey() != null) {
/* 50 */                OIiilo1Ool0o.I00000oIO();
/* 20 */                return null;
                    }
/* 54 */            entry.getValue();
/* 57 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof IlIO0l0OIlol) {
/* 17 */                return this.I00000oIO.equals(((IlIO0l0OIlol) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
