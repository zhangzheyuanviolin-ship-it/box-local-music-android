            package p000;

            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.logging.Logger;
            
            public final class OOI0ilOI1oI implements OiliO1i1iIII {
                public static final OOI0ilOI1oI I00000oIO = new OOI0ilOI1oI();

                @Override
                public final Object I00000oIO() {
/* 4 */             return new OI0ooi10l(true);
                }

                @Override
                public final Object I00000oOI(FileInputStream fileInputStream) throws Ii01i1 {
                    byte[] bArr;
                    try {
/* 1 */                 OOI0oi oOI0oiI00100l0 = OOI0oi.I00100l0(fileInputStream);
/* 10 */                OI0ooi10l oI0ooi10l = new OI0ooi10l(false);
/* 17 */                OOI0i01[] oOI0i01Arr = (OOI0i01[]) Arrays.copyOf(new OOI0i01[0], 0);
/* 19 */                oI0ooi10l.I00000oOI();
/* 24 */                if (oOI0i01Arr.length > 0) {
/* 269 */                   OOI0i01 oOI0i01 = oOI0i01Arr[0];
/* 271 */                   throw null;
                        }
/* 42 */                for (Map.Entry entry : oOI0oiI00100l0.I000lI().entrySet()) {
/* 54 */                    String str = (String) entry.getKey();
/* 60 */                    OOI1O1iIoi0 oOI1O1iIoi0 = (OOI1O1iIoi0) entry.getValue();
/* 62 */                    int iI001IO000 = oOI1O1iIoi0.I001IO000();
                            switch (iI001IO000 == 0 ? -1 : OOI0iIiOiI.I00000oIO[IIlIOloOOO.I001lIiIIo1O(iI001IO000)]) {
                                case -1:
/* 252 */                           throw new Ii01i1("Value case is null.", null);
                                case 0:
                                default:
/* 81 */                            I000II.I00000oIO();
/* 23 */                            return null;
                                case 1:
/* 240 */                           oI0ooi10l.I0000O(new OOI0IO111Ii(str), Boolean.valueOf(oOI1O1iIoi0.I000lI()));
                                    break;
                                case 2:
/* 222 */                           oI0ooi10l.I0000O(new OOI0IO111Ii(str), Float.valueOf(oOI1O1iIoi0.I00100o1O0lo()));
                                    break;
                                case 3:
/* 204 */                           oI0ooi10l.I0000O(new OOI0IO111Ii(str), Double.valueOf(oOI1O1iIoi0.I00100l0()));
                                    break;
                                case 4:
/* 186 */                           oI0ooi10l.I0000O(new OOI0IO111Ii(str), Integer.valueOf(oOI1O1iIoi0.I0010I0i()));
                                    break;
                                case 5:
/* 168 */                           oI0ooi10l.I0000O(new OOI0IO111Ii(str), Long.valueOf(oOI1O1iIoi0.I0010o()));
                                    break;
                                case 6:
/* 151 */                           oI0ooi10l.I0000O(new OOI0IO111Ii(str), oOI1O1iIoi0.I00111O());
                                    break;
                                case 7:
/* 138 */                           oI0ooi10l.I0000O(new OOI0IO111Ii(str), IOOi0Ool1i.I00iio(oOI1O1iIoi0.I001IIilI0O().I000oI1ioi()));
                                    break;
                                case 8:
/* 95 */                            OOI0IO111Ii oOI0IO111Ii = new OOI0IO111Ii(str);
/* 98 */                            IIO1ooI iIO1ooII000o00OoI0I = oOI1O1iIoi0.I000o00OoI0I();
/* 102 */                           int size = iIO1ooII000o00OoI0I.size();
/* 106 */                           if (size == 0) {
/* 108 */                               bArr = IoolIIolo1lI.I00000oOI;
                                    } else {
/* 111 */                               byte[] bArr2 = new byte[size];
/* 113 */                               iIO1ooII000o00OoI0I.I0001Ioi1lo(size, bArr2);
/* 116 */                               bArr = bArr2;
                                    }
/* 117 */                           oI0ooi10l.I0000O(oOI0IO111Ii, bArr);
                                    break;
                                case 9:
/* 92 */                            throw new Ii01i1("Value not set.", null);
                            }
                        }
/* 265 */               return new OI0ooi10l(new LinkedHashMap(oI0ooi10l.I00000oIO()), true);
                    } catch (O0011oo e) {
/* 280 */               throw new Ii01i1("Unable to parse preferences proto.", e);
                    }
                }

                @Override
                public final void I0000Il00O(Object obj, OOl1lI0oI oOl1lI0oI) throws IOException {
                    Io00l0 io00l0I00000oIO;
/* 3 */             Map mapI00000oIO = ((OI0ooi10l) obj).I00000oIO();
/* 7 */             OOI0l1O oOI0l1OI000oI1ioi = OOI0oi.I000oI1ioi();
/* 23 */            for (Map.Entry entry : mapI00000oIO.entrySet()) {
/* 35 */                OOI0IO111Ii oOI0IO111Ii = (OOI0IO111Ii) entry.getKey();
/* 37 */                Object value = entry.getValue();
/* 41 */                String str = oOI0IO111Ii.I00000oIO;
/* 45 */                if (value instanceof Boolean) {
/* 47 */                    OOI0olOiOoI oOI0olOiOoII001i1O0Ol = OOI1O1iIoi0.I001i1O0Ol();
/* 53 */                    boolean zBooleanValue = ((Boolean) value).booleanValue();
/* 57 */                    oOI0olOiOoII001i1O0Ol.I0000Il00O();
/* 64 */                    ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol.I00iiI).I001i1lo1io(zBooleanValue);
/* 67 */                    io00l0I00000oIO = oOI0olOiOoII001i1O0Ol.I00000oIO();
                        } else if (value instanceof Float) {
/* 79 */                    OOI0olOiOoI oOI0olOiOoII001i1O0Ol2 = OOI1O1iIoi0.I001i1O0Ol();
/* 85 */                    float fFloatValue = ((Number) value).floatValue();
/* 89 */                    oOI0olOiOoII001i1O0Ol2.I0000Il00O();
/* 96 */                    ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol2.I00iiI).I001lIiIIo1O(fFloatValue);
/* 99 */                    io00l0I00000oIO = oOI0olOiOoII001i1O0Ol2.I00000oIO();
                        } else if (value instanceof Double) {
/* 111 */                   OOI0olOiOoI oOI0olOiOoII001i1O0Ol3 = OOI1O1iIoi0.I001i1O0Ol();
/* 117 */                   double dDoubleValue = ((Number) value).doubleValue();
/* 121 */                   oOI0olOiOoII001i1O0Ol3.I0000Il00O();
/* 128 */                   ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol3.I00iiI).I001l0I00(dDoubleValue);
/* 131 */                   io00l0I00000oIO = oOI0olOiOoII001i1O0Ol3.I00000oIO();
                        } else if (value instanceof Integer) {
/* 143 */                   OOI0olOiOoI oOI0olOiOoII001i1O0Ol4 = OOI1O1iIoi0.I001i1O0Ol();
/* 149 */                   int iIntValue = ((Number) value).intValue();
/* 153 */                   oOI0olOiOoII001i1O0Ol4.I0000Il00O();
/* 160 */                   ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol4.I00iiI).I001lllioOl(iIntValue);
/* 163 */                   io00l0I00000oIO = oOI0olOiOoII001i1O0Ol4.I00000oIO();
                        } else if (value instanceof Long) {
/* 175 */                   OOI0olOiOoI oOI0olOiOoII001i1O0Ol5 = OOI1O1iIoi0.I001i1O0Ol();
/* 181 */                   long jLongValue = ((Number) value).longValue();
/* 185 */                   oOI0olOiOoII001i1O0Ol5.I0000Il00O();
/* 192 */                   ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol5.I00iiI).I001lloI(jLongValue);
/* 195 */                   io00l0I00000oIO = oOI0olOiOoII001i1O0Ol5.I00000oIO();
                        } else if (value instanceof String) {
/* 206 */                   OOI0olOiOoI oOI0olOiOoII001i1O0Ol6 = OOI1O1iIoi0.I001i1O0Ol();
/* 212 */                   oOI0olOiOoII001i1O0Ol6.I0000Il00O();
/* 219 */                   ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol6.I00iiI).I00II0Ol1O0l((String) value);
/* 222 */                   io00l0I00000oIO = oOI0olOiOoII001i1O0Ol6.I00000oIO();
                        } else if (value instanceof Set) {
/* 233 */                   OOI0olOiOoI oOI0olOiOoII001i1O0Ol7 = OOI1O1iIoi0.I001i1O0Ol();
/* 237 */                   OOI0oi1 oOI0oi1I00100l0 = OOI0olOI1i0i.I00100l0();
/* 245 */                   oOI0oi1I00100l0.I0000Il00O();
/* 252 */                   ((OOI0olOI1i0i) oOI0oi1I00100l0.I00iiI).I000lI((Set) value);
/* 255 */                   oOI0olOiOoII001i1O0Ol7.I0000Il00O();
/* 268 */                   ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol7.I00iiI).I00II0oii1o((OOI0olOI1i0i) oOI0oi1I00100l0.I00000oIO());
/* 271 */                   io00l0I00000oIO = oOI0olOiOoII001i1O0Ol7.I00000oIO();
                        } else {
/* 280 */                   if (!(value instanceof byte[])) {
/* 346 */                       I000II.I001IO000("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
/* 349 */                       return;
                            }
/* 282 */                   OOI0olOiOoI oOI0olOiOoII001i1O0Ol8 = OOI1O1iIoi0.I001i1O0Ol();
/* 286 */                   byte[] bArr = (byte[]) value;
/* 290 */                   IIO1ooI iIO1ooII0000oI00 = IIO1ooI.I0000oI00(bArr, 0, bArr.length);
/* 294 */                   oOI0olOiOoII001i1O0Ol8.I0000Il00O();
/* 301 */                   ((OOI1O1iIoi0) oOI0olOiOoII001i1O0Ol8.I00iiI).I001iOo1i0O(iIO1ooII0000oI00);
/* 304 */                   io00l0I00000oIO = oOI0olOiOoII001i1O0Ol8.I00000oIO();
                        }
/* 310 */               oOI0l1OI000oI1ioi.getClass();
/* 313 */               str.getClass();
/* 316 */               oOI0l1OI000oI1ioi.I0000Il00O();
/* 327 */               ((OOI0oi) oOI0l1OI000oI1ioi.I00iiI).I000o00OoI0I().put(str, (OOI1O1iIoi0) io00l0I00000oIO);
                    }
/* 354 */           OOI0oi oOI0oi = (OOI0oi) oOI0l1OI000oI1ioi.I00000oIO();
/* 357 */           int iI00000oIO = oOI0oi.I00000oIO(null);
/* 361 */           Logger logger = IOOOio0o.I0001Ioi1lo;
/* 365 */           if (iI00000oIO > 4096) {
/* 367 */               iI00000oIO = 4096;
                    }
/* 370 */           IOOOio0o iOOOio0o = new IOOOio0o();
/* 373 */           if (iI00000oIO < 0) {
/* 405 */               I000II.I000iOII("bufferSize must be >= 0");
/* 900 */               return;
                    }
/* 377 */           int iMax = Math.max(iI00000oIO, 20);
/* 383 */           iOOOio0o.I00000oOI = new byte[iMax];
/* 385 */           iOOOio0o.I0000Il00O = iMax;
/* 387 */           iOOOio0o.I0000oI00 = oOl1lI0oI;
/* 389 */           VarHandle.storeStoreFence();
/* 392 */           oOI0oi.I00000oOI(iOOOio0o);
/* 397 */           if (iOOOio0o.I0000O > 0) {
/* 399 */               iOOOio0o.I000iOII();
                    }
                }
            }
