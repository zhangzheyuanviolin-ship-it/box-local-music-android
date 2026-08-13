            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.File;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.util.BitSet;
            
            public final class OiOOiI1lllOo implements Closeable {
                public File I00iiI;
                public RandomAccessFile I00iiO;
                public final BitSet I00ilI0I1;
                public volatile byte[][] I00ilO0;
                public final int I00io1l;
                public final int I00ioIO;
                public final boolean I00l0I0l0lO1;
                public final boolean I00l0OO0IO;
                public volatile boolean I00li1OI;
                public final Object I00iOIl = new Object();
                public volatile int I00iio = 0;

                public OiOOiI1lllOo(O1ilIl1l0I o1ilIl1l0I) {
/* 16 */            BitSet bitSet = new BitSet();
/* 19 */            this.I00ilI0I1 = bitSet;
/* 21 */            this.I00li1OI = false;
/* 23 */            boolean z = o1ilIl1l0I.I00iiI;
/* 27 */            this.I00l0OO0IO = !z;
/* 29 */            this.I00l0I0l0lO1 = false;
/* 34 */            this.I00ioIO = Integer.MAX_VALUE;
/* 36 */            int i = z ? Integer.MAX_VALUE : 0;
/* 40 */            this.I00io1l = i;
/* 50 */            this.I00ilO0 = new byte[z ? 100000 : i][];
/* 55 */            bitSet.set(0, this.I00ilO0.length);
                }

                public final void I00000oIO() {
/* 3 */             if (this.I00li1OI) {
/* 8 */                 IioIoO10iOiI.I000OOo1O("Scratch file already closed");
                    }
                }

                public final void I0000Il00O() {
                    synchronized (this.I00iOIl) {
                        try {
/* 8 */                     I00000oIO();
/* 15 */                    if (this.I00iio >= this.I00ioIO) {
/* 18 */                        return;
                            }
/* 25 */                    if (this.I00l0I0l0lO1) {
/* 27 */                        RandomAccessFile randomAccessFile = this.I00iiO;
/* 29 */                        if (randomAccessFile == null) {
/* 40 */                            this.I00iiI = File.createTempFile("PDFBox", ".tmp", null);
                                    try {
/* 48 */                                randomAccessFile = new RandomAccessFile(this.I00iiI, "rw");
/* 51 */                                this.I00iiO = randomAccessFile;
                                    } catch (IOException e) {
/* 61 */                                if (!this.I00iiI.delete()) {
/* 83 */                                    Log.w("PdfBox-Android", "Error deleting scratch file: " + this.I00iiI.getAbsolutePath());
                                        }
/* 86 */                                throw e;
                                    }
                                }
/* 87 */                        long length = randomAccessFile.length();
/* 100 */                       long j = (this.I00iio - this.I00io1l) * 4096;
/* 103 */                       if (j != length) {
/* 214 */                           throw new IOException("Expected scratch file size of " + j + " but found " + length + " in file " + this.I00iiI);
                                }
/* 111 */                       if (this.I00iio + 16 > this.I00iio) {
/* 116 */                           long j2 = 65536 + length;
/* 119 */                           this.I00iiO.setLength(j2);
/* 130 */                           if (j2 != this.I00iiO.length()) {
/* 134 */                               long filePointer = this.I00iiO.getFilePointer();
/* 144 */                               this.I00iiO.seek(length + 65535);
/* 149 */                               this.I00iiO.write(0);
/* 154 */                               this.I00iiO.seek(filePointer);
/* 159 */                               this.I00iiO.length();
/* 164 */                               this.I00iiI.length();
                                    }
/* 175 */                           this.I00ilI0I1.set(this.I00iio, this.I00iio + 16);
                                }
                            } else if (!this.I00l0OO0IO) {
/* 221 */                       int length2 = this.I00ilO0.length;
/* 233 */                       int iMin = (int) Math.min(length2 * 2, 2147483647L);
/* 234 */                       if (iMin > length2) {
/* 236 */                           byte[][] bArr = new byte[iMin][];
/* 240 */                           System.arraycopy(this.I00ilO0, 0, bArr, 0, length2);
/* 243 */                           this.I00ilO0 = bArr;
/* 247 */                           this.I00ilI0I1.set(length2, iMin);
                                }
                            }
                        } catch (Throwable th) {
/* 541 */                   throw th;
                        }
                    }
                }

                public final byte[] I000II(int i) throws IOException {
                    byte[] bArr;
/* 3 */             if (i < 0 || i >= this.I00iio) {
/* 95 */                I00000oIO();
/* 104 */               StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Page index out of range: ", i, ". Max value: ");
/* 112 */               sbI00100o1O0lo.append(this.I00iio - 1);
/* 186 */               throw new IOException(sbI00100o1O0lo.toString());
                    }
/* 11 */            if (i < this.I00io1l) {
/* 15 */                byte[] bArr2 = this.I00ilO0[i];
/* 17 */                if (bArr2 != null) {
/* 19 */                    return bArr2;
                        }
/* 20 */                I00000oIO();
/* 31 */                IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("Requested page with index ", i, " was not written before."));
/* 34 */                return null;
                    }
                    synchronized (this.I00iOIl) {
                        try {
/* 39 */                    RandomAccessFile randomAccessFile = this.I00iiO;
/* 41 */                    if (randomAccessFile == null) {
/* 67 */                        I00000oIO();
/* 92 */                        throw new IOException("Missing scratch file to read page with index " + i + " from.");
                            }
/* 45 */                    bArr = new byte[Barcode.FORMAT_AZTEC];
/* 55 */                    randomAccessFile.seek((i - this.I00io1l) * 4096);
/* 60 */                    this.I00iiO.readFully(bArr);
                        } catch (Throwable th) {
/* 94 */                    throw th;
                        }
                    }
/* 64 */            return bArr;
                }

                public final void I000O01llI0(int i, byte[] bArr) {
/* 1 */             if (i < 0 || i >= this.I00iio) {
/* 87 */                I00000oIO();
/* 96 */                StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Page index out of range: ", i, ". Max value: ");
/* 104 */               sbI00100o1O0lo.append(this.I00iio - 1);
/* 551 */               throw new IOException(sbI00100o1O0lo.toString());
                    }
/* 10 */            if (bArr.length != 4096) {
/* 83 */                IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000lI(bArr.length, ". Expected: 4096", new StringBuilder("Wrong page size to write: ")));
/* 86 */                return;
                    }
/* 14 */            if (i >= this.I00io1l) {
                        synchronized (this.I00iOIl) {
/* 43 */                    I00000oIO();
/* 56 */                    this.I00iiO.seek((i - this.I00io1l) * 4096);
/* 61 */                    this.I00iiO.write(bArr);
                        }
/* 65 */                return;
                    }
/* 18 */            if (this.I00l0OO0IO) {
/* 22 */                this.I00ilO0[i] = bArr;
                    } else {
                        synchronized (this.I00iOIl) {
/* 30 */                    this.I00ilO0[i] = bArr;
                        }
                    }
/* 33 */            I00000oIO();
                }

                @Override
                public final void close() throws IOException {
                    synchronized (this.I00iOIl) {
                        try {
/* 8 */                     if (this.I00li1OI) {
/* 11 */                        return;
                            }
/* 15 */                    this.I00li1OI = true;
/* 17 */                    RandomAccessFile randomAccessFile = this.I00iiO;
/* 19 */                    if (randomAccessFile != null) {
                                try {
/* 21 */                            randomAccessFile.close();
/* 27 */                            e = null;
                                } catch (IOException e) {
/* 25 */                            e = e;
                                }
                            } else {
/* 27 */                        e = null;
                            }
/* 28 */                    File file = this.I00iiI;
/* 30 */                    if (file != null && !file.delete() && this.I00iiI.exists() && e == null) {
/* 68 */                        e = new IOException("Error deleting scratch file: " + this.I00iiI.getAbsolutePath());
                            }
                            synchronized (this.I00ilI0I1) {
/* 77 */                        this.I00ilI0I1.clear();
/* 81 */                        this.I00iio = 0;
                            }
/* 84 */                    if (e != null) {
/* 87 */                        throw e;
                            }
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }
            }
