            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class i1oI1Oi {
                public static final int I0000Il00O = 0;
                public iI11OIoO I00000oIO;
                public boolean I00000oOI;

                static {
/* 5 */             iI11OIoO ii11oioo = new iI11OIoO();
/* 8 */             i1oI1Oi i1oi1oi = new i1oI1Oi();
/* 11 */            i1oi1oi.I00000oIO = ii11oioo;
/* 13 */            i1oi1oi.I00000oIO();
/* 16 */            i1oi1oi.I00000oIO();
/* 19 */            VarHandle.storeStoreFence();
                }

                public static void I00000oOI(i1lllO0 i1lllo0, iI1iii00l ii1iii00l, int i, Object obj) {
/* 3 */             if (ii1iii00l == iI1iii00l.I00iio) {
/* 243 */               i1lllo0.I0000O(i, 3);
/* 248 */               ((i1oi01OllI) ((i1ilO0II) obj)).I0000oI00(i1lllo0);
/* 252 */               i1lllo0.I0000O(i, 4);
/* 255 */               return;
                    }
/* 7 */             i1lllo0.I0000O(i, ii1iii00l.I00iiI);
/* 10 */            iI1ilOliIi ii1iloliii = iI1ilOliIi.I00iOIl;
                    switch (ii1iii00l.ordinal()) {
                        case 0:
/* 236 */                   i1lllo0.I001IIilI0O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 222 */                   i1lllo0.I0010o(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 208 */                   i1lllo0.I00111O(((Long) obj).longValue());
                            break;
                        case 3:
/* 198 */                   i1lllo0.I00111O(((Long) obj).longValue());
                            break;
                        case 4:
/* 188 */                   i1lllo0.I00100o1O0lo(((Integer) obj).intValue());
                            break;
                        case 5:
/* 178 */                   i1lllo0.I001IIilI0O(((Long) obj).longValue());
                            break;
                        case 6:
/* 168 */                   i1lllo0.I0010o(((Integer) obj).intValue());
                            break;
                        case 7:
/* 158 */                   i1lllo0.I00100l0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 138 */                   if (!(obj instanceof i1lIIl01O)) {
/* 148 */                       i1lllo0.I001IO000((String) obj);
                                break;
                            } else {
/* 142 */                       i1lllo0.I000lI((i1lIIl01O) obj);
                                break;
                            }
                        case 9:
/* 132 */                   ((i1oi01OllI) ((i1ilO0II) obj)).I0000oI00(i1lllo0);
                            break;
                        case 10:
/* 124 */                   i1lllo0.I000oI1ioi((i1ilO0II) obj);
                            break;
                        case 11:
/* 107 */                   if (!(obj instanceof i1lIIl01O)) {
/* 115 */                       byte[] bArr = (byte[]) obj;
/* 118 */                       i1lllo0.I000o00OoI0I(bArr.length, bArr);
                                break;
                            } else {
/* 111 */                       i1lllo0.I000lI((i1lIIl01O) obj);
                                break;
                            }
                        case 12:
/* 101 */                   i1lllo0.I0010I0i(((Integer) obj).intValue());
                            break;
                        case 13:
/* 73 */                    if (!(obj instanceof i1ol0il1l0i)) {
/* 91 */                        i1lllo0.I00100o1O0lo(((Integer) obj).intValue());
                                break;
                            } else {
/* 81 */                        i1lllo0.I00100o1O0lo(((i1ol0il1l0i) obj).zza());
                                break;
                            }
                        case 14:
/* 67 */                    i1lllo0.I0010o(((Integer) obj).intValue());
                            break;
                        case 15:
/* 57 */                    i1lllo0.I001IIilI0O(((Long) obj).longValue());
                            break;
                        case 16:
/* 38 */                    int iIntValue = ((Integer) obj).intValue();
/* 47 */                    i1lllo0.I0010I0i((iIntValue >> 31) ^ (iIntValue + iIntValue));
                            break;
                        case 17:
/* 22 */                    long jLongValue = ((Long) obj).longValue();
/* 32 */                    i1lllo0.I00111O((jLongValue >> 63) ^ (jLongValue + jLongValue));
                            break;
                    }
                }

                public final void I00000oIO() {
/* 3 */             if (this.I00000oOI) {
/* 5 */                 return;
                    }
/* 6 */             iI11OIoO ii11oioo = this.I00000oIO;
/* 8 */             int i = ii11oioo.I00iiI;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 18 */                Object obj = ii11oioo.I00000oIO(i2).I00iiI;
/* 22 */                if (obj instanceof i1oi01OllI) {
/* 24 */                    i1oi01OllI i1oi01olli = (i1oi01OllI) obj;
/* 36 */                    iI10O00O.I0000Il00O.I00000oIO(i1oi01olli.getClass()).I0000Il00O(i1oi01olli);
/* 39 */                    i1oi01olli.I000II();
                        }
                    }
/* 49 */            Iterator it = ii11oioo.I00000oOI().iterator();
/* 57 */            while (it.hasNext()) {
/* 65 */                Object value = ((Map.Entry) it.next()).getValue();
/* 71 */                if (value instanceof i1oi01OllI) {
/* 73 */                    i1oi01OllI i1oi01olli2 = (i1oi01OllI) value;
/* 85 */                    iI10O00O.I0000Il00O.I00000oIO(i1oi01olli2.getClass()).I0000Il00O(i1oi01olli2);
/* 88 */                    i1oi01olli2.I000II();
                        }
                    }
/* 94 */            if (!ii11oioo.I00iio) {
/* 98 */                if (ii11oioo.I00iiI > 0) {
/* 138 */                   ii11oioo.I00000oIO(0).I00iOIl.getClass();
/* 141 */                   OIiilo1Ool0o.I00000oIO();
/* 144 */                   return;
                        } else {
/* 104 */                   Iterator it2 = ii11oioo.I00000oOI().iterator();
/* 112 */                   if (it2.hasNext()) {
/* 125 */                       ((Map.Entry) it2.next()).getKey().getClass();
/* 128 */                       OIiilo1Ool0o.I00000oIO();
/* 131 */                       return;
                            }
                        }
                    }
/* 148 */           if (!ii11oioo.I00iio) {
/* 167 */               ii11oioo.I00iiO = ii11oioo.I00iiO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ii11oioo.I00iiO);
/* 186 */               ii11oioo.I00ilO0 = ii11oioo.I00ilO0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ii11oioo.I00ilO0);
/* 188 */               ii11oioo.I00iio = true;
                    }
/* 190 */           this.I00000oOI = true;
                }

                public final Object clone() {
/* 3 */             i1oI1Oi i1oi1oi = new i1oI1Oi();
/* 11 */            i1oi1oi.I00000oIO = new iI11OIoO();
/* 13 */            iI11OIoO ii11oioo = this.I00000oIO;
/* 18 */            if (ii11oioo.I00iiI > 0) {
/* 62 */                ii11oioo.I00000oIO(0).I00iOIl.getClass();
/* 65 */                OIiilo1Ool0o.I00000oIO();
/* 17 */                return null;
                    }
/* 24 */            Iterator it = ii11oioo.I00000oOI().iterator();
/* 32 */            if (!it.hasNext()) {
/* 34 */                return i1oi1oi;
                    }
/* 39 */            Map.Entry entry = (Map.Entry) it.next();
/* 45 */            if (entry.getKey() != null) {
/* 47 */                OIiilo1Ool0o.I00000oIO();
/* 17 */                return null;
                    }
/* 51 */            entry.getValue();
/* 54 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof i1oI1Oi) {
/* 17 */                return this.I00000oIO.equals(((i1oI1Oi) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
