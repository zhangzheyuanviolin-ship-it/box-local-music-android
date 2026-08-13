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
            
/* 4 */     public final class OOiI0l0 implements OIOi0o {
                public static final Charset I0001Ioi1lo = Charset.forName("UTF-8");
                public static final IlIO00o1 I000II;
                public static final IlIO00o1 I000O01llI0;
                public static final O01IO1I0 I000OOo1O;
                public OutputStream I00000oIO;
                public HashMap I00000oOI;
                public HashMap I0000Il00O;
                public O01IO1I0 I0000O;
                public OOiI1O I0000oI00;

                static {
/* 11 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("key");
/* 17 */            I1Ool1110li i1Ool1110li = new I1Ool1110li();
/* 21 */            i1Ool1110li.I0000O = 1;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            olOO1i11110I00000oIO.I001i1lo1io(i1Ool1110li);
/* 33 */            I000II = olOO1i11110I00000oIO.I000O01llI0();
/* 37 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("value");
/* 43 */            I1Ool1110li i1Ool1110li2 = new I1Ool1110li();
/* 47 */            i1Ool1110li2.I0000O = 2;
/* 49 */            VarHandle.storeStoreFence();
/* 52 */            olOO1i11110I00000oIO2.I001i1lo1io(i1Ool1110li2);
/* 59 */            I000O01llI0 = olOO1i11110I00000oIO2.I000O01llI0();
/* 66 */            I000OOo1O = new O01IO1I0(1);
                }

                public static int I0000oI00(IlIO00o1 ilIO00o1) {
/* 7 */             OOi1lOi oOi1lOi = (OOi1lOi) ilIO00o1.I00000oOI(OOi1lOi.class);
/* 9 */             if (oOi1lOi != null) {
/* 11 */                return oOi1lOi.tag();
                    }
/* 18 */            iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 21 */            return 0;
                }

                public final void I00000oIO(IlIO00o1 ilIO00o1, int i, boolean z) {
/* 1 */             if (z && i == 0) {
/* 32 */                return;
                    }
/* 12 */            OOi1lOi oOi1lOi = (OOi1lOi) ilIO00o1.I00000oOI(OOi1lOi.class);
/* 14 */            if (oOi1lOi == null) {
/* 102 */               iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 215 */               return;
                    }
/* 20 */            int iOrdinal = oOi1lOi.intEncoding().ordinal();
/* 24 */            if (iOrdinal == 0) {
/* 93 */                I0001Ioi1lo(oOi1lOi.tag() << 3);
/* 96 */                I0001Ioi1lo(i);
                    } else if (iOrdinal == 1) {
/* 75 */                I0001Ioi1lo(oOi1lOi.tag() << 3);
/* 83 */                I0001Ioi1lo((i << 1) ^ (i >> 31));
                    } else {
/* 30 */                if (iOrdinal != 2) {
/* 32 */                    return;
                        }
/* 41 */                I0001Ioi1lo((oOi1lOi.tag() << 3) | 5);
/* 65 */                this.I00000oIO.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                    }
                }

                public final void I00000oOI(IlIO00o1 ilIO00o1, long j, boolean z) throws IOException {
/* 1 */             if (z && j == 0) {
/* 36 */                return;
                    }
/* 16 */            OOi1lOi oOi1lOi = (OOi1lOi) ilIO00o1.I00000oOI(OOi1lOi.class);
/* 18 */            if (oOi1lOi == null) {
/* 108 */               iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 215 */               return;
                    }
/* 24 */            int iOrdinal = oOi1lOi.intEncoding().ordinal();
/* 28 */            if (iOrdinal == 0) {
/* 99 */                I0001Ioi1lo(oOi1lOi.tag() << 3);
/* 102 */               I000II(j);
                    } else if (iOrdinal == 1) {
/* 79 */                I0001Ioi1lo(oOi1lOi.tag() << 3);
/* 89 */                I000II((j >> 63) ^ (j << 1));
                    } else {
/* 34 */                if (iOrdinal != 2) {
/* 36 */                    return;
                        }
/* 44 */                I0001Ioi1lo((oOi1lOi.tag() << 3) | 1);
/* 69 */                this.I00000oIO.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                    }
                }

                public final void I0000Il00O(IlIO00o1 ilIO00o1, Object obj, boolean z) {
/* 1 */             if (obj == null) {
/* 259 */               return;
                    }
/* 7 */             if (obj instanceof CharSequence) {
/* 9 */                 CharSequence charSequence = (CharSequence) obj;
/* 11 */                if (z && charSequence.length() == 0) {
/* 259 */                   return;
                        }
/* 29 */                I0001Ioi1lo((I0000oI00(ilIO00o1) << 3) | 2);
/* 38 */                byte[] bytes = charSequence.toString().getBytes(I0001Ioi1lo);
/* 43 */                I0001Ioi1lo(bytes.length);
/* 48 */                this.I00000oIO.write(bytes);
/* 51 */                return;
                    }
/* 55 */            if (obj instanceof Collection) {
/* 59 */                Iterator it = ((Collection) obj).iterator();
/* 67 */                while (it.hasNext()) {
/* 73 */                    I0000Il00O(ilIO00o1, it.next(), false);
                        }
/* 259 */               return;
                    }
/* 79 */            if (obj instanceof Map) {
/* 87 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 95 */                while (it2.hasNext()) {
/* 105 */                   I0000O(I000OOo1O, ilIO00o1, (Map.Entry) it2.next(), false);
                        }
/* 259 */               return;
                    }
/* 112 */           if (obj instanceof Double) {
/* 116 */               double dDoubleValue = ((Double) obj).doubleValue();
/* 120 */               if (z && dDoubleValue == 0.0d) {
/* 259 */                   return;
                        }
/* 137 */               I0001Ioi1lo((I0000oI00(ilIO00o1) << 3) | 1);
/* 162 */               this.I00000oIO.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
/* 165 */               return;
                    }
/* 168 */           if (obj instanceof Float) {
/* 172 */               float fFloatValue = ((Float) obj).floatValue();
/* 176 */               if (z && fFloatValue == 0.0f) {
/* 259 */                   return;
                        }
/* 192 */               I0001Ioi1lo((I0000oI00(ilIO00o1) << 3) | 5);
/* 216 */               this.I00000oIO.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
/* 219 */               return;
                    }
/* 222 */           if (obj instanceof Number) {
/* 230 */               I00000oOI(ilIO00o1, ((Number) obj).longValue(), z);
/* 233 */               return;
                    }
/* 236 */           if (obj instanceof Boolean) {
/* 244 */               I00000oIO(ilIO00o1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
/* 247 */               return;
                    }
/* 250 */           if (obj instanceof byte[]) {
/* 252 */               byte[] bArr = (byte[]) obj;
/* 254 */               if (z && bArr.length == 0) {
/* 259 */                   return;
                        }
/* 268 */               I0001Ioi1lo((I0000oI00(ilIO00o1) << 3) | 2);
/* 272 */               I0001Ioi1lo(bArr.length);
/* 277 */               this.I00000oIO.write(bArr);
/* 280 */               return;
                    }
/* 291 */           OIOi0lOI oIOi0lOI = (OIOi0lOI) this.I00000oOI.get(obj.getClass());
/* 293 */           if (oIOi0lOI != null) {
/* 295 */               I0000O(oIOi0lOI, ilIO00o1, obj, z);
/* 298 */               return;
                    }
/* 309 */           OoloOoIl ooloOoIl = (OoloOoIl) this.I0000Il00O.get(obj.getClass());
/* 311 */           if (ooloOoIl != null) {
/* 313 */               OOiI1O oOiI1O = this.I0000oI00;
/* 315 */               oOiI1O.I00000oOI = false;
/* 317 */               oOiI1O.I0000O = ilIO00o1;
/* 319 */               oOiI1O.I0000Il00O = z;
/* 321 */               ooloOoIl.encode(obj, oOiI1O);
/* 324 */               return;
                    }
/* 327 */           if (obj instanceof OOi1Ii1oilo) {
/* 335 */               I00000oIO(ilIO00o1, ((OOi1Ii1oilo) obj).I00000oIO(), true);
                    } else if (obj instanceof Enum) {
/* 349 */               I00000oIO(ilIO00o1, ((Enum) obj).ordinal(), true);
                    } else {
/* 355 */               I0000O(this.I0000O, ilIO00o1, obj, z);
                    }
                }

                public final void I0000O(OIOi0lOI oIOi0lOI, IlIO00o1 ilIO00o1, Object obj, boolean z) throws IOException {
/* 4 */             O0oIolOOo o0oIolOOo = new O0oIolOOo(0);
/* 9 */             o0oIolOOo.I00iiI = 0L;
                    try {
/* 11 */                OutputStream outputStream = this.I00000oIO;
/* 13 */                this.I00000oIO = o0oIolOOo;
                        try {
/* 15 */                    oIOi0lOI.encode(obj, this);
/* 18 */                    this.I00000oIO = outputStream;
/* 20 */                    long j = o0oIolOOo.I00iiI;
/* 22 */                    o0oIolOOo.close();
/* 25 */                    if (z && j == 0) {
/* 31 */                        return;
                            }
/* 40 */                    I0001Ioi1lo((I0000oI00(ilIO00o1) << 3) | 2);
/* 43 */                    I000II(j);
/* 46 */                    oIOi0lOI.encode(obj, this);
                        } catch (Throwable th) {
/* 53 */                    this.I00000oIO = outputStream;
/* 55 */                    throw th;
                        }
                    } catch (Throwable th2) {
                        try {
/* 56 */                    o0oIolOOo.close();
                        } catch (Throwable th3) {
/* 61 */                    th2.addSuppressed(th3);
                        }
/* 483 */               throw th2;
                    }
                }

                public final void I0001Ioi1lo(int i) throws IOException {
                    while (true) {
/* 1 */                 long j = i & (-128);
/* 8 */                 OutputStream outputStream = this.I00000oIO;
/* 10 */                if (j == 0) {
/* 24 */                    outputStream.write(i & 127);
/* 49 */                    return;
                        } else {
/* 16 */                    outputStream.write((i & 127) | Barcode.FORMAT_ITF);
/* 19 */                    i >>>= 7;
                        }
                    }
                }

                public final void I000II(long j) throws IOException {
                    while (true) {
/* 3 */                 long j2 = (-128) & j;
/* 8 */                 OutputStream outputStream = this.I00000oIO;
/* 10 */                if (j2 == 0) {
/* 26 */                    outputStream.write(((int) j) & 127);
/* 49 */                    return;
                        } else {
/* 17 */                    outputStream.write((((int) j) & 127) | Barcode.FORMAT_ITF);
/* 21 */                    j >>>= 7;
                        }
                    }
                }

                @Override
                public final OIOi0o add(IlIO00o1 ilIO00o1, Object obj) {
/* 2 */             I0000Il00O(ilIO00o1, obj, true);
/* 89 */            return this;
                }

                @Override
/* 5 */         public final OIOi0o add(IlIO00o1 ilIO00o1, int i) {
/* 6 */             I00000oIO(ilIO00o1, i, true);
                    return this;
                }

                @Override
/* 6 */         public final OIOi0o add(IlIO00o1 ilIO00o1, long j) throws IOException {
/* 7 */             I00000oOI(ilIO00o1, j, true);
                    return this;
                }
            }
