            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
/* 4 */     public final class l0i1l1ooO implements OIOi0o {
                public static final Charset I0001Ioi1lo = Charset.forName("UTF-8");
                public static final IlIO00o1 I000II;
                public static final IlIO00o1 I000O01llI0;
                public static final iIOo0oiIi1 I000OOo1O;
                public OutputStream I00000oIO;
                public HashMap I00000oOI;
                public HashMap I0000Il00O;
                public l0iO10io0IOO I0000O;
                public OOiI1O I0000oI00;

                static {
/* 11 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("key");
/* 17 */            l0OI0lloI l0oi0lloi = new l0OI0lloI();
/* 21 */            l0oi0lloi.I0000O = 1;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            olOO1i11110I00000oIO.I001i1lo1io(l0oi0lloi);
/* 33 */            I000II = olOO1i11110I00000oIO.I000O01llI0();
/* 37 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("value");
/* 43 */            l0OI0lloI l0oi0lloi2 = new l0OI0lloI();
/* 47 */            l0oi0lloi2.I0000O = 2;
/* 49 */            VarHandle.storeStoreFence();
/* 52 */            olOO1i11110I00000oIO2.I001i1lo1io(l0oi0lloi2);
/* 59 */            I000O01llI0 = olOO1i11110I00000oIO2.I000O01llI0();
/* 68 */            I000OOo1O = new iIOo0oiIi1(28);
                }

                public static int I0000O(IlIO00o1 ilIO00o1) {
/* 7 */             l0i0OoiiiI1 l0i0ooiiii1 = (l0i0OoiiiI1) ilIO00o1.I00000oOI(l0i0OoiiiI1.class);
/* 9 */             if (l0i0ooiiii1 != null) {
/* 11 */                return l0i0ooiiii1.zza();
                    }
/* 18 */            iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 21 */            return 0;
                }

                public final OIOi0o I00000oIO(IlIO00o1 ilIO00o1, Object obj, boolean z) {
/* 1 */             if (obj != null) {
/* 7 */                 if (obj instanceof CharSequence) {
/* 9 */                     CharSequence charSequence = (CharSequence) obj;
/* 11 */                    if (!z || charSequence.length() != 0) {
/* 27 */                        I0001Ioi1lo((I0000O(ilIO00o1) << 3) | 2);
/* 36 */                        byte[] bytes = charSequence.toString().getBytes(I0001Ioi1lo);
/* 41 */                        I0001Ioi1lo(bytes.length);
/* 46 */                        this.I00000oIO.write(bytes);
/* 49 */                        return this;
                            }
                        } else if (obj instanceof Collection) {
/* 57 */                    Iterator it = ((Collection) obj).iterator();
/* 65 */                    while (it.hasNext()) {
/* 71 */                        I00000oIO(ilIO00o1, it.next(), false);
                            }
                        } else if (obj instanceof Map) {
/* 85 */                    Iterator it2 = ((Map) obj).entrySet().iterator();
/* 93 */                    while (it2.hasNext()) {
/* 103 */                       I0000oI00(I000OOo1O, ilIO00o1, (Map.Entry) it2.next(), false);
                            }
                        } else if (obj instanceof Double) {
/* 114 */                   double dDoubleValue = ((Double) obj).doubleValue();
/* 118 */                   if (!z || dDoubleValue != 0.0d) {
/* 135 */                       I0001Ioi1lo((I0000O(ilIO00o1) << 3) | 1);
/* 160 */                       this.I00000oIO.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
/* 163 */                       return this;
                            }
                        } else if (obj instanceof Float) {
/* 170 */                   float fFloatValue = ((Float) obj).floatValue();
/* 174 */                   if (!z || fFloatValue != 0.0f) {
/* 190 */                       I0001Ioi1lo((I0000O(ilIO00o1) << 3) | 5);
/* 214 */                       this.I00000oIO.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
/* 217 */                       return this;
                            }
                        } else {
/* 220 */                   if (obj instanceof Number) {
/* 228 */                       I0000Il00O(ilIO00o1, ((Number) obj).longValue(), z);
/* 231 */                       return this;
                            }
/* 234 */                   if (obj instanceof Boolean) {
/* 242 */                       I00000oOI(ilIO00o1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
/* 245 */                       return this;
                            }
/* 248 */                   if (!(obj instanceof byte[])) {
/* 290 */                       OIOi0lOI oIOi0lOI = (OIOi0lOI) this.I00000oOI.get(obj.getClass());
/* 292 */                       if (oIOi0lOI != null) {
/* 294 */                           I0000oI00(oIOi0lOI, ilIO00o1, obj, z);
/* 297 */                           return this;
                                }
/* 308 */                       OoloOoIl ooloOoIl = (OoloOoIl) this.I0000Il00O.get(obj.getClass());
/* 310 */                       if (ooloOoIl != null) {
/* 312 */                           OOiI1O oOiI1O = this.I0000oI00;
/* 314 */                           oOiI1O.I00000oOI = false;
/* 316 */                           oOiI1O.I0000O = ilIO00o1;
/* 318 */                           oOiI1O.I0000Il00O = z;
/* 320 */                           ooloOoIl.encode(obj, oOiI1O);
/* 323 */                           return this;
                                }
/* 326 */                       if (obj instanceof l0OlOo110) {
/* 334 */                           I00000oOI(ilIO00o1, ((l0OlOo110) obj).zza(), true);
/* 337 */                           return this;
                                }
/* 340 */                       if (obj instanceof Enum) {
/* 348 */                           I00000oOI(ilIO00o1, ((Enum) obj).ordinal(), true);
/* 351 */                           return this;
                                }
/* 354 */                       I0000oI00(this.I0000O, ilIO00o1, obj, z);
/* 408 */                       return this;
                            }
/* 250 */                   byte[] bArr = (byte[]) obj;
/* 252 */                   if (!z || bArr.length != 0) {
/* 267 */                       I0001Ioi1lo((I0000O(ilIO00o1) << 3) | 2);
/* 271 */                       I0001Ioi1lo(bArr.length);
/* 276 */                       this.I00000oIO.write(bArr);
/* 279 */                       return this;
                            }
                        }
                    }
/* 258 */           return this;
                }

                public final void I00000oOI(IlIO00o1 ilIO00o1, int i, boolean z) {
/* 1 */             if (z && i == 0) {
/* 31 */                return;
                    }
/* 11 */            l0i0OoiiiI1 l0i0ooiiii1 = (l0i0OoiiiI1) ilIO00o1.I00000oOI(l0i0OoiiiI1.class);
/* 13 */            if (l0i0ooiiii1 == null) {
/* 101 */               iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 408 */               return;
                    }
/* 19 */            int iOrdinal = l0i0ooiiii1.zzb().ordinal();
/* 23 */            if (iOrdinal == 0) {
/* 92 */                I0001Ioi1lo(l0i0ooiiii1.zza() << 3);
/* 95 */                I0001Ioi1lo(i);
                    } else if (iOrdinal == 1) {
/* 74 */                I0001Ioi1lo(l0i0ooiiii1.zza() << 3);
/* 82 */                I0001Ioi1lo((i + i) ^ (i >> 31));
                    } else {
/* 29 */                if (iOrdinal != 2) {
/* 31 */                    return;
                        }
/* 40 */                I0001Ioi1lo((l0i0ooiiii1.zza() << 3) | 5);
/* 64 */                this.I00000oIO.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                    }
                }

                public final void I0000Il00O(IlIO00o1 ilIO00o1, long j, boolean z) throws IOException {
/* 1 */             if (z && j == 0) {
/* 35 */                return;
                    }
/* 15 */            l0i0OoiiiI1 l0i0ooiiii1 = (l0i0OoiiiI1) ilIO00o1.I00000oOI(l0i0OoiiiI1.class);
/* 17 */            if (l0i0ooiiii1 == null) {
/* 107 */               iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 408 */               return;
                    }
/* 23 */            int iOrdinal = l0i0ooiiii1.zzb().ordinal();
/* 27 */            if (iOrdinal == 0) {
/* 98 */                I0001Ioi1lo(l0i0ooiiii1.zza() << 3);
/* 101 */               I000II(j);
                    } else if (iOrdinal == 1) {
/* 78 */                I0001Ioi1lo(l0i0ooiiii1.zza() << 3);
/* 88 */                I000II((j >> 63) ^ (j + j));
                    } else {
/* 33 */                if (iOrdinal != 2) {
/* 35 */                    return;
                        }
/* 43 */                I0001Ioi1lo((l0i0ooiiii1.zza() << 3) | 1);
/* 68 */                this.I00000oIO.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                    }
                }

                public final void I0000oI00(OIOi0lOI oIOi0lOI, IlIO00o1 ilIO00o1, Object obj, boolean z) throws IOException {
/* 5 */             O0oIolOOo o0oIolOOo = new O0oIolOOo(10);
/* 10 */            o0oIolOOo.I00iiI = 0L;
                    try {
/* 12 */                OutputStream outputStream = this.I00000oIO;
/* 14 */                this.I00000oIO = o0oIolOOo;
                        try {
/* 16 */                    oIOi0lOI.encode(obj, this);
/* 19 */                    this.I00000oIO = outputStream;
/* 21 */                    long j = o0oIolOOo.I00iiI;
/* 23 */                    o0oIolOOo.close();
/* 26 */                    if (z && j == 0) {
/* 32 */                        return;
                            }
/* 41 */                    I0001Ioi1lo((I0000O(ilIO00o1) << 3) | 2);
/* 44 */                    I000II(j);
/* 47 */                    oIOi0lOI.encode(obj, this);
                        } catch (Throwable th) {
/* 54 */                    this.I00000oIO = outputStream;
/* 56 */                    throw th;
                        }
                    } catch (Throwable th2) {
                        try {
/* 57 */                    o0oIolOOo.close();
                        } catch (Throwable th3) {
/* 62 */                    th2.addSuppressed(th3);
                        }
/* 204 */               throw th2;
                    }
                }

                public final void I0001Ioi1lo(int i) throws IOException {
                    while (true) {
/* 1 */                 long j = i & (-128);
/* 8 */                 int i2 = i & 127;
/* 10 */                OutputStream outputStream = this.I00000oIO;
/* 12 */                if (j == 0) {
/* 22 */                    outputStream.write(i2);
/* 29 */                    return;
                        } else {
/* 16 */                    outputStream.write(i2 | Barcode.FORMAT_ITF);
/* 19 */                    i >>>= 7;
                        }
                    }
                }

                public final void I000II(long j) throws IOException {
                    while (true) {
/* 3 */                 long j2 = (-128) & j;
/* 9 */                 int i = ((int) j) & 127;
/* 11 */                OutputStream outputStream = this.I00000oIO;
/* 13 */                if (j2 == 0) {
/* 23 */                    outputStream.write(i);
/* 29 */                    return;
                        } else {
/* 17 */                    outputStream.write(i | Barcode.FORMAT_ITF);
/* 21 */                    j >>>= 7;
                        }
                    }
                }

                @Override
                public final OIOi0o add(IlIO00o1 ilIO00o1, int i) {
/* 2 */             I00000oOI(ilIO00o1, i, true);
/* 37 */            return this;
                }

                @Override
/* 5 */         public final OIOi0o add(IlIO00o1 ilIO00o1, long j) throws IOException {
/* 6 */             I0000Il00O(ilIO00o1, j, true);
                    return this;
                }

                @Override
/* 6 */         public final OIOi0o add(IlIO00o1 ilIO00o1, Object obj) {
/* 7 */             I00000oIO(ilIO00o1, obj, true);
                    return this;
                }
            }
