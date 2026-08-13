            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedInputStream;
            import java.io.DataInputStream;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            
            public abstract class liIliOlIioI {
                public static void I00000oIO(i0Il1IIOi i0il1iioi, InputStream inputStream, i0O0oIIlI i0o0oiili, long j) throws Throwable {
                    i0O0oIIlI i0o0oiili2;
                    DataInputStream dataInputStream;
                    i0Il1IIOi i0il1iioi2;
                    int unsignedShort;
/* 3 */             byte[] bArr = new byte[16384];
/* 14 */            DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, Barcode.FORMAT_AZTEC));
/* 17 */            int i = dataInputStream2.readInt();
/* 24 */            if (i != -771763713) {
/* 281 */               throw new IOO1IOl1O10("Unexpected magic=".concat(String.format("%x", Integer.valueOf(i))));
                    }
/* 26 */            int i2 = dataInputStream2.read();
/* 31 */            if (i2 != 4) {
/* 255 */               throw new IOO1IOl1O10(Oi010OO0.I000oI1ioi(i2, "Unexpected version="));
                    }
/* 35 */            long j2 = 0;
                    while (true) {
/* 36 */                long j3 = j - j2;
                        try {
/* 38 */                    int unsignedShort2 = dataInputStream2.read();
/* 43 */                    if (unsignedShort2 == -1) {
/* 235 */                       throw new IOException("Patch file overrun");
                            }
/* 45 */                    if (unsignedShort2 == 0) {
/* 223 */                       i0o0oiili.flush();
/* 226 */                       return;
                            }
                            switch (unsignedShort2) {
                                case 247:
/* 208 */                           i0o0oiili2 = i0o0oiili;
/* 209 */                           unsignedShort2 = dataInputStream2.readUnsignedShort();
/* 214 */                           I0000Il00O(bArr, dataInputStream2, i0o0oiili2, unsignedShort2, j3);
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 248:
/* 197 */                           i0o0oiili2 = i0o0oiili;
/* 199 */                           unsignedShort2 = dataInputStream2.readInt();
/* 204 */                           I0000Il00O(bArr, dataInputStream2, i0o0oiili2, unsignedShort2, j3);
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 249:
/* 170 */                           i0o0oiili2 = i0o0oiili;
/* 171 */                           DataInputStream dataInputStream3 = dataInputStream2;
/* 172 */                           i0Il1IIOi i0il1iioi3 = i0il1iioi;
/* 173 */                           long unsignedShort3 = dataInputStream3.readUnsignedShort();
/* 178 */                           int i3 = dataInputStream3.read();
/* 182 */                           if (i3 == -1) {
/* 196 */                               throw new IOException("Unexpected end of patch");
                                    }
/* 184 */                           I00000oOI(bArr, i0il1iioi3, i0o0oiili2, unsignedShort3, i3, j3);
/* 187 */                           i0il1iioi = i0il1iioi3;
/* 188 */                           dataInputStream2 = dataInputStream3;
/* 189 */                           unsignedShort2 = i3;
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 250:
/* 154 */                           i0o0oiili2 = i0o0oiili;
/* 155 */                           dataInputStream = dataInputStream2;
/* 156 */                           i0il1iioi2 = i0il1iioi;
/* 157 */                           long unsignedShort4 = dataInputStream.readUnsignedShort();
/* 162 */                           unsignedShort = dataInputStream.readUnsignedShort();
/* 166 */                           I00000oOI(bArr, i0il1iioi2, i0o0oiili2, unsignedShort4, unsignedShort, j3);
/* 79 */                            i0il1iioi = i0il1iioi2;
/* 80 */                            unsignedShort2 = unsignedShort;
/* 58 */                            dataInputStream2 = dataInputStream;
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 251:
/* 138 */                           i0o0oiili2 = i0o0oiili;
/* 139 */                           dataInputStream = dataInputStream2;
/* 140 */                           i0il1iioi2 = i0il1iioi;
/* 141 */                           long unsignedShort5 = dataInputStream.readUnsignedShort();
/* 146 */                           unsignedShort = dataInputStream.readInt();
/* 150 */                           I00000oOI(bArr, i0il1iioi2, i0o0oiili2, unsignedShort5, unsignedShort, j3);
/* 79 */                            i0il1iioi = i0il1iioi2;
/* 80 */                            unsignedShort2 = unsignedShort;
/* 58 */                            dataInputStream2 = dataInputStream;
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 252:
/* 114 */                           i0o0oiili2 = i0o0oiili;
/* 115 */                           dataInputStream = dataInputStream2;
/* 116 */                           i0il1iioi2 = i0il1iioi;
/* 117 */                           long j4 = dataInputStream.readInt();
/* 122 */                           unsignedShort = dataInputStream.read();
/* 126 */                           if (unsignedShort == -1) {
/* 137 */                               throw new IOException("Unexpected end of patch");
                                    }
/* 128 */                           I00000oOI(bArr, i0il1iioi2, i0o0oiili2, j4, unsignedShort, j3);
/* 79 */                            i0il1iioi = i0il1iioi2;
/* 80 */                            unsignedShort2 = unsignedShort;
/* 58 */                            dataInputStream2 = dataInputStream;
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 253:
/* 98 */                            i0o0oiili2 = i0o0oiili;
/* 99 */                            dataInputStream = dataInputStream2;
/* 100 */                           i0il1iioi2 = i0il1iioi;
/* 101 */                           long j5 = dataInputStream.readInt();
/* 106 */                           unsignedShort = dataInputStream.readUnsignedShort();
/* 110 */                           I00000oOI(bArr, i0il1iioi2, i0o0oiili2, j5, unsignedShort, j3);
/* 79 */                            i0il1iioi = i0il1iioi2;
/* 80 */                            unsignedShort2 = unsignedShort;
/* 58 */                            dataInputStream2 = dataInputStream;
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 254:
/* 82 */                            i0o0oiili2 = i0o0oiili;
/* 83 */                            dataInputStream = dataInputStream2;
/* 84 */                            i0il1iioi2 = i0il1iioi;
/* 85 */                            long j6 = dataInputStream.readInt();
/* 90 */                            unsignedShort = dataInputStream.readInt();
/* 94 */                            I00000oOI(bArr, i0il1iioi2, i0o0oiili2, j6, unsignedShort, j3);
/* 79 */                            i0il1iioi = i0il1iioi2;
/* 80 */                            unsignedShort2 = unsignedShort;
/* 58 */                            dataInputStream2 = dataInputStream;
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                case 255:
/* 65 */                            i0o0oiili2 = i0o0oiili;
/* 66 */                            dataInputStream = dataInputStream2;
/* 67 */                            long j7 = dataInputStream.readLong();
/* 71 */                            unsignedShort = dataInputStream.readInt();
/* 75 */                            i0il1iioi2 = i0il1iioi;
/* 76 */                            I00000oOI(bArr, i0il1iioi2, i0o0oiili2, j7, unsignedShort, j3);
/* 79 */                            i0il1iioi = i0il1iioi2;
/* 80 */                            unsignedShort2 = unsignedShort;
/* 58 */                            dataInputStream2 = dataInputStream;
/* 218 */                           j2 += unsignedShort2;
/* 219 */                           i0o0oiili = i0o0oiili2;
                                default:
/* 52 */                            i0o0oiili2 = i0o0oiili;
                                    try {
/* 54 */                                I0000Il00O(bArr, dataInputStream2, i0o0oiili2, unsignedShort2, j3);
/* 57 */                                dataInputStream = dataInputStream2;
/* 58 */                                dataInputStream2 = dataInputStream;
/* 218 */                               j2 += unsignedShort2;
/* 219 */                               i0o0oiili = i0o0oiili2;
                                    } catch (Throwable th) {
/* 61 */                                th = th;
/* 62 */                                Throwable th2 = th;
/* 240 */                               i0o0oiili2.flush();
/* 243 */                               throw th2;
                                    }
                            }
                        } catch (Throwable th3) {
/* 236 */                   th = th3;
/* 237 */                   i0o0oiili2 = i0o0oiili;
                        }
                    }
                }

                public static void I00000oOI(byte[] bArr, i0Il1IIOi i0il1iioi, i0O0oIIlI i0o0oiili, long j, int i, long j2) throws IOException {
                    InputStream inputStreamI00ioIO;
/* 1 */             if (i < 0) {
/* 125 */               IioIoO10iOiI.I000OOo1O("copyLength negative");
/* 1294 */              return;
                    }
/* 7 */             if (j < 0) {
/* 119 */               IioIoO10iOiI.I000OOo1O("inputOffset negative");
/* 122 */               return;
                    }
                    long j3 = i;
/* 12 */            if (j3 > j2) {
/* 113 */               IioIoO10iOiI.I000OOo1O("Output length overrun");
/* 116 */               return;
                    }
                    try {
/* 16 */                i0IOO1 i0ioo1 = new i0IOO1();
/* 19 */                i0ioo1.I00iOIl = i0il1iioi;
/* 21 */                long jI00l0I0l0lO1 = i0ioo1.I00l0I0l0lO1(j);
/* 25 */                i0ioo1.I00iiI = jI00l0I0l0lO1;
/* 32 */                i0ioo1.I00iiO = i0ioo1.I00l0I0l0lO1(jI00l0I0l0lO1 + j3);
/* 34 */                VarHandle.storeStoreFence();
                        synchronized (i0ioo1) {
/* 43 */                    inputStreamI00ioIO = i0ioo1.I00ioIO(0L, i0ioo1.I00iiO - i0ioo1.I00iiI);
                        }
/* 48 */                while (i > 0) {
                            try {
/* 52 */                        int iMin = Math.min(i, 16384);
/* 57 */                        int i2 = 0;
/* 58 */                        while (i2 < iMin) {
/* 62 */                            int i3 = inputStreamI00ioIO.read(bArr, i2, iMin - i2);
/* 67 */                            if (i3 == -1) {
/* 78 */                                throw new IOException("truncated input stream");
                                    }
/* 69 */                            i2 += i3;
                                }
/* 81 */                        i0o0oiili.write(bArr, 0, iMin);
/* 84 */                        i -= iMin;
                            } finally {
                            }
                        }
/* 95 */                inputStreamI00ioIO.close();
                    } catch (EOFException e) {
/* 110 */               throw new IOException("patch underrun", e);
                    }
                }

                public static void I0000Il00O(byte[] bArr, DataInputStream dataInputStream, i0O0oIIlI i0o0oiili, int i, long j) throws IOException {
/* 1 */             if (i < 0) {
/* 39 */                IioIoO10iOiI.I000OOo1O("copyLength negative");
/* 966 */               return;
                    }
/* 6 */             if (i > j) {
/* 33 */                IioIoO10iOiI.I000OOo1O("Output length overrun");
/* 36 */                return;
                    }
/* 8 */             while (i > 0) {
                        try {
/* 12 */                    int iMin = Math.min(i, 16384);
/* 17 */                    dataInputStream.readFully(bArr, 0, iMin);
/* 20 */                    i0o0oiili.write(bArr, 0, iMin);
/* 23 */                    i -= iMin;
                        } catch (EOFException unused) {
/* 27 */                    IioIoO10iOiI.I000OOo1O("patch underrun");
/* 30 */                    return;
                        }
                    }
                }
            }
