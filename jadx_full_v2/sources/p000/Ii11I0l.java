            package p000;

            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class Ii11I0l {
                public LinkedHashMap I00000oIO = new LinkedHashMap();

                public void I00000oIO(HashMap map) {
                    Object[] objArr;
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 25 */                String str = (String) entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                LinkedHashMap linkedHashMap = this.I00000oIO;
/* 33 */                if (value == null) {
/* 35 */                    value = null;
                        } else {
/* 38 */                    Class<?> cls = value.getClass();
/* 42 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 44 */                    O0IOli0o0 o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(cls);
/* 58 */                    if (!o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Boolean.TYPE)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Byte.TYPE)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Integer.TYPE)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Long.TYPE)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Float.TYPE)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Double.TYPE)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(String.class)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Boolean[].class)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Byte[].class)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Integer[].class)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Long[].class)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Float[].class)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Double[].class)) && !o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(String[].class))) {
/* 228 */                       int i = 0;
/* 229 */                       if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(boolean[].class))) {
/* 231 */                           boolean[] zArr = (boolean[]) value;
/* 233 */                           String str2 = Ii1OOOlOIO.I00000oIO;
/* 235 */                           int length = zArr.length;
/* 236 */                           objArr = new Boolean[length];
/* 238 */                           while (i < length) {
/* 246 */                               objArr[i] = Boolean.valueOf(zArr[i]);
/* 248 */                               i++;
                                    }
                                } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(byte[].class))) {
/* 266 */                           byte[] bArr = (byte[]) value;
/* 268 */                           String str3 = Ii1OOOlOIO.I00000oIO;
/* 270 */                           int length2 = bArr.length;
/* 271 */                           objArr = new Byte[length2];
/* 273 */                           while (i < length2) {
/* 281 */                               objArr[i] = Byte.valueOf(bArr[i]);
/* 283 */                               i++;
                                    }
                                } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(int[].class))) {
/* 298 */                           int[] iArr = (int[]) value;
/* 300 */                           String str4 = Ii1OOOlOIO.I00000oIO;
/* 302 */                           int length3 = iArr.length;
/* 303 */                           objArr = new Integer[length3];
/* 305 */                           while (i < length3) {
/* 313 */                               objArr[i] = Integer.valueOf(iArr[i]);
/* 315 */                               i++;
                                    }
                                } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(long[].class))) {
/* 330 */                           long[] jArr = (long[]) value;
/* 332 */                           String str5 = Ii1OOOlOIO.I00000oIO;
/* 334 */                           int length4 = jArr.length;
/* 335 */                           objArr = new Long[length4];
/* 337 */                           while (i < length4) {
/* 345 */                               objArr[i] = Long.valueOf(jArr[i]);
/* 347 */                               i++;
                                    }
                                } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(float[].class))) {
/* 362 */                           float[] fArr = (float[]) value;
/* 364 */                           String str6 = Ii1OOOlOIO.I00000oIO;
/* 366 */                           int length5 = fArr.length;
/* 367 */                           objArr = new Float[length5];
/* 369 */                           while (i < length5) {
/* 377 */                               objArr[i] = Float.valueOf(fArr[i]);
/* 379 */                               i++;
                                    }
                                } else {
/* 392 */                           if (!o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(double[].class))) {
/* 418 */                               OoOil11Ol1o.I0010o("Key ", str, " has invalid type ", o0IOli0o0I00000oOI);
/* 421 */                               return;
                                    }
/* 394 */                           double[] dArr = (double[]) value;
/* 396 */                           String str7 = Ii1OOOlOIO.I00000oIO;
/* 398 */                           int length6 = dArr.length;
/* 399 */                           objArr = new Double[length6];
/* 401 */                           while (i < length6) {
/* 409 */                               objArr[i] = Double.valueOf(dArr[i]);
/* 411 */                               i++;
                                    }
                                }
/* 251 */                       value = objArr;
                            }
                        }
/* 422 */               linkedHashMap.put(str, value);
                    }
                }
            }
