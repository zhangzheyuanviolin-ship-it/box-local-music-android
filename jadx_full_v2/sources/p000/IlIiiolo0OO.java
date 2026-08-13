            package p000;

            import android.util.Log;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.SoftReference;
            
            public class IlIiiolo0OO {
                public final String I00000oIO;
                public final int I00000oOI;
                public final I00Ol00 I0000Il00O;
                public final int I0000O;
                public final int I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;
                public final int I000O01llI0;
                public final IIloOI I000OOo1O;
                public final File I000OiO;
                public final I1I0i0Ilo1Oi I000iOII;

                public IlIiiolo0OO(File file, int i, String str, I00Ol00 i00Ol00, int i2, int i3, int i4, int i5, int i6, byte[] bArr, I1I0i0Ilo1Oi i1I0i0Ilo1Oi) {
                    IIloOI iIloOI;
/* 4 */             this.I000OiO = file;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I00000oIO = str;
/* 10 */            this.I0000Il00O = i00Ol00;
/* 12 */            this.I0000O = i2;
/* 14 */            this.I0000oI00 = i3;
/* 16 */            this.I0001Ioi1lo = i4;
/* 18 */            this.I000II = i5;
/* 20 */            this.I000O01llI0 = i6;
/* 22 */            if (bArr == null || bArr.length < 10) {
/* 42 */                iIloOI = null;
                    } else {
/* 33 */                iIloOI = new IIloOI(20);
/* 36 */                iIloOI.I00iiI = bArr;
/* 38 */                VarHandle.storeStoreFence();
                    }
/* 43 */            this.I000OOo1O = iIloOI;
/* 45 */            this.I000iOII = i1I0i0Ilo1Oi;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static OIi1OliIo0Ol I00000oOI(File file, String str) throws IOException {
                    OoIllIioi1l ooIllIioi1lI00000oIO;
                    try {
/* 20 */                int i = 0;
/* 20 */                Object[] objArr = 0;
/* 21 */                if (!file.getName().toLowerCase().endsWith(".ttc")) {
/* 105 */                   return new OIOi0Oli(objArr == true ? 1 : 0, true).I000O01llI0(file);
                        }
/* 25 */                OoIlOlI0oi ooIlOlI0oi = new OoIlOlI0oi(file);
                        while (true) {
                            try {
/* 30 */                        if (i >= ooIlOlI0oi.I00iiI) {
/* 50 */                            ooIllIioi1lI00000oIO = null;
                                    break;
                                }
/* 32 */                        ooIllIioi1lI00000oIO = ooIlOlI0oi.I00000oIO(i);
/* 44 */                        if (ooIllIioi1lI00000oIO.getName().equals(str)) {
                                    break;
                                }
/* 47 */                        i++;
                            } catch (IOException e) {
/* 92 */                        Log.e("PdfBox-Android", e.getMessage(), e);
/* 95 */                        ooIlOlI0oi.close();
/* 5 */                         return null;
                            }
                        }
/* 51 */                if (ooIllIioi1lI00000oIO != null) {
/* 53 */                    return (OIi1OliIo0Ol) ooIllIioi1lI00000oIO;
                        }
/* 58 */                ooIlOlI0oi.close();
/* 86 */                throw new IOException("Font " + str + " not found in " + file);
                    } catch (IOException e2) {
/* 124 */               Log.w("PdfBox-Android", "Could not load font file: " + file, e2);
/* 5 */                 return null;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static OoIllIioi1l I0000Il00O(File file, String str) throws IOException {
                    OoIllIioi1l ooIllIioi1lI00000oIO;
/* 15 */            int i = 0;
/* 15 */            Object[] objArr = 0;
/* 16 */            if (!file.getName().toLowerCase().endsWith(".ttc")) {
/* 72 */                return new IlOoIo(objArr == true ? 1 : 0, true).I0000O(file);
                    }
/* 20 */            OoIlOlI0oi ooIlOlI0oi = new OoIlOlI0oi(file);
                    while (true) {
                        try {
/* 26 */                    if (i >= ooIlOlI0oi.I00iiI) {
/* 46 */                        ooIllIioi1lI00000oIO = null;
                                break;
                            }
/* 28 */                    ooIllIioi1lI00000oIO = ooIlOlI0oi.I00000oIO(i);
/* 40 */                    if (ooIllIioi1lI00000oIO.getName().equals(str)) {
                                break;
                            }
/* 43 */                    i++;
                        } catch (IOException e) {
/* 62 */                    ooIlOlI0oi.close();
/* 65 */                    throw e;
                        }
                    }
/* 47 */            if (ooIllIioi1lI00000oIO != null) {
/* 49 */                return ooIllIioi1lI00000oIO;
                    }
/* 50 */            ooIlOlI0oi.close();
/* 57 */            IoOOl0iOl1io.I000OiO("Font ", str, " not found in ", file);
/* 25 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x008e A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #4 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0012, B:11:0x001e, B:17:0x002c, B:30:0x0054, B:44:0x008e, B:31:0x0058, B:32:0x005b, B:35:0x005e, B:36:0x0065, B:37:0x0066, B:38:0x006f, B:39:0x0073, B:42:0x0079), top: B:55:0x0001, inners: #0 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final synchronized IliIo0lOI I00000oIO() {
                    File file;
                    FileInputStream fileInputStream;
                    try {
/* 14 */                SoftReference softReference = (SoftReference) ((IOloio1Ili) this.I000iOII.I00iiO).I00000oIO.get(this);
/* 16 */                FileInputStream fileInputStream2 = null;
/* 16 */                iliIo0lOII0000Il00O = null;
/* 16 */                IliIo0lOI iliIo0lOII0000Il00O = null;
/* 26 */                IliIo0lOI iliIo0lOI = softReference != null ? (IliIo0lOI) softReference.get() : null;
/* 27 */                if (iliIo0lOI != null) {
/* 30 */                    return iliIo0lOI;
                        }
/* 33 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(this.I00000oOI);
/* 37 */                if (iI001lIiIIo1O == 0) {
/* 112 */                   String str = this.I00000oIO;
/* 114 */                   File file2 = this.I000OiO;
                            try {
/* 116 */                       iliIo0lOII0000Il00O = I0000Il00O(file2, str);
                            } catch (IOException e) {
/* 138 */                       Log.w("PdfBox-Android", "Could not load font file: " + file2, e);
                            }
                        } else if (iI001lIiIIo1O == 1) {
/* 107 */                   iliIo0lOII0000Il00O = I00000oOI(this.I000OiO, this.I00000oIO);
                        } else {
/* 43 */                    if (iI001lIiIIo1O != 2) {
/* 102 */                       throw new RuntimeException("can't happen");
                            }
                            try {
/* 45 */                        file = this.I000OiO;
                            } catch (Throwable th) {
/* 59 */                        th = th;
/* 60 */                        fileInputStream2 = fileInputStream;
                            }
                            try {
/* 51 */                        fileInputStream = new FileInputStream(file);
                                try {
/* 54 */                            iliIo0lOII0000Il00O = OoIoiiol0o.I0000O(fileInputStream);
                                } catch (IOException e2) {
/* 62 */                            e = e2;
/* 82 */                            Log.w("PdfBox-Android", "Could not load font file: " + file, e);
/* 85 */                            io0iolo.I00000oOI(fileInputStream);
/* 141 */                           if (iliIo0lOII0000Il00O != null) {
                                    }
/* 160 */                           return iliIo0lOII0000Il00O;
                                }
                            } catch (IOException e3) {
/* 66 */                        e = e3;
/* 67 */                        fileInputStream = null;
                            } catch (Throwable th2) {
/* 64 */                        th = th2;
/* 89 */                        io0iolo.I00000oOI(fileInputStream2);
/* 92 */                        throw th;
                            }
/* 85 */                    io0iolo.I00000oOI(fileInputStream);
                        }
/* 141 */               if (iliIo0lOII0000Il00O != null) {
/* 156 */                   ((IOloio1Ili) this.I000iOII.I00iiO).I00000oIO.put(this, new SoftReference(iliIo0lOII0000Il00O));
                        }
/* 160 */               return iliIo0lOII0000Il00O;
                    } catch (Throwable th3) {
/* 245 */               throw th3;
                    }
                }

                public final String I0000O() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.I00000oIO);
/* 13 */            sb.append(" (");
/* 17 */            int i = this.I00000oOI;
/* 38 */            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "PFB" : "OTF" : "TTF");
/* 43 */            sb.append(", mac: 0x");
/* 52 */            sb.append(Integer.toHexString(this.I000O01llI0));
/* 57 */            sb.append(", os/2: 0x");
/* 66 */            sb.append(Integer.toHexString(this.I0000oI00));
/* 71 */            sb.append(", cid: ");
/* 76 */            sb.append(this.I0000Il00O);
/* 81 */            sb.append(")");
/* 84 */            return sb.toString();
                }

                public final String toString() {
/* 20 */            return I0000O() + " " + this.I000OiO;
                }
            }
