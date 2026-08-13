            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.nio.file.Files;
            import java.nio.file.StandardCopyOption;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IlIi1o0I110 implements IOO11Oio {
                public File I00000oIO;
                public OiliO1i1iIII I00000oOI;
                public Ol0Oiooo I0000Il00O;
                public IlIi0Il I0000O;
                public AtomicBoolean I0000oI00;
                public OI1I0OoOl I0001Ioi1lo;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:33:0x0071, B:42:0x0082, B:41:0x007f, B:38:0x007a), top: B:49:0x0022, inners: #4 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Type inference failed for: r7v0, types: [IlIi1o0I110] */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v9 */
                /* JADX WARN: Type inference failed for: r8v0, types: [IOIllll] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOIllll iOIllll, IOoilo iOoilo) {
                    IlIi1O0OiOll ilIi1O0OiOll;
                    boolean zI000II;
                    Throwable th;
                    IlIi00o ilIi00o;
                    boolean z;
/* 1 */             OI1I0OoOl oI1I0OoOl = this.I0001Ioi1lo;
/* 5 */             if (iOoilo instanceof IlIi1O0OiOll) {
/* 8 */                 ilIi1O0OiOll = (IlIi1O0OiOll) iOoilo;
/* 10 */                int i = ilIi1O0OiOll.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    ilIi1O0OiOll.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ilIi1O0OiOll = new IlIi1O0OiOll(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = ilIi1O0OiOll.I00iiO;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ilIi1O0OiOll.I00ilI0I1;
                    try {
/* 35 */                if (i2 != 0) {
/* 37 */                    if (i2 != 1) {
/* 51 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                        return null;
                            }
/* 39 */                    this = ilIi1O0OiOll.I00iOIl;
/* 41 */                    ilIi00o = ilIi1O0OiOll.I00iiI;
                            try {
/* 43 */                        lIoii1l01l0i.I00000oOI(obj);
                                z = this;
                                try {
/* 100 */                           ilIi00o.close();
/* 103 */                           th = null;
                                } catch (Throwable th2) {
/* 105 */                           th = th2;
                                }
/* 106 */                       if (th == null) {
/* 114 */                           throw th;
                                }
/* 108 */                       if (z) {
/* 110 */                           oI1I0OoOl.I00000oOI(null);
                                }
/* 113 */                       return obj;
                            } catch (Throwable th3) {
/* 47 */                        th = th3;
                                try {
/* 123 */                           ilIi00o.close();
                                } catch (Throwable th4) {
/* 128 */                           ilIilolOlIoO.I00000oIO(th, th4);
                                }
/* 131 */                       throw th;
                            }
                        }
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 64 */                if (this.I0000oI00.get()) {
/* 141 */                   I000II.I001IO000("StorageConnection has already been disposed.");
/* 34 */                    return null;
                        }
/* 66 */                zI000II = oI1I0OoOl.I000II();
                        try {
/* 76 */                    IlIi00o ilIi00o2 = new IlIi00o(this.I00000oIO, this.I00000oOI);
                            try {
/* 79 */                        Boolean boolValueOf = Boolean.valueOf(zI000II);
/* 83 */                        ilIi1O0OiOll.I00iiI = ilIi00o2;
/* 85 */                        ilIi1O0OiOll.I00iOIl = zI000II;
/* 87 */                        ilIi1O0OiOll.I00ilI0I1 = 1;
/* 89 */                        Object objInvoke = iOIllll.invoke(ilIi00o2, boolValueOf, ilIi1O0OiOll);
/* 93 */                        if (objInvoke == ii0111o) {
/* 95 */                            return ii0111o;
                                }
/* 97 */                        obj = objInvoke;
/* 98 */                        z = zI000II;
/* 99 */                        ilIi00o = ilIi00o2;
/* 100 */                       ilIi00o.close();
/* 103 */                       th = null;
/* 106 */                       if (th == null) {
                                }
                            } catch (Throwable th5) {
/* 120 */                       th = th5;
/* 121 */                       this = zI000II;
/* 122 */                       ilIi00o = ilIi00o2;
/* 123 */                       ilIi00o.close();
/* 131 */                       throw th;
                            }
                        } catch (Throwable th6) {
/* 132 */                   th = th6;
/* 133 */                   if (zI000II) {
/* 135 */                       oI1I0OoOl.I00000oOI(null);
                            }
/* 138 */                   throw th;
                        }
                    } catch (Throwable th7) {
/* 115 */               th = th7;
/* 116 */               zI000II = this;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00c0 A[Catch: all -> 0x00fa, IOException -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00fa, blocks: (B:42:0x00c0, B:44:0x00c6, B:47:0x00db, B:48:0x00f9, B:55:0x0106, B:62:0x0114, B:61:0x0111), top: B:82:0x0025 }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0106 A[Catch: all -> 0x00fa, IOException -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00fa, blocks: (B:42:0x00c0, B:44:0x00c6, B:47:0x00db, B:48:0x00f9, B:55:0x0106, B:62:0x0114, B:61:0x0111), top: B:82:0x0025 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v19 */
                /* JADX WARN: Type inference failed for: r12v2 */
                /* JADX WARN: Type inference failed for: r12v21 */
                /* JADX WARN: Type inference failed for: r12v3 */
                /* JADX WARN: Type inference failed for: r12v4, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r12v5 */
                /* JADX WARN: Type inference failed for: r12v6 */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.io.File] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.io.File, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(Ii1O1oOli ii1O1oOli, IOoilo iOoilo) throws Throwable {
                    IlIi1O10o ilIi1O10o;
                    ?? file;
                    ?? r12;
                    IlliIl1l11O illiIl1l11O;
                    IlIl0oi1 ilIl0oi1;
                    Throwable th;
                    IlIl0oi1 ilIl0oi12;
                    OI11ol oI11ol;
                    File file2;
/* 1 */             File file3 = this.I00000oIO;
/* 7 */             if (iOoilo instanceof IlIi1O10o) {
/* 10 */                ilIi1O10o = (IlIi1O10o) iOoilo;
/* 12 */                int i = ilIi1O10o.I00ilO0;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    ilIi1O10o.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    ilIi1O10o = new IlIi1O10o(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = ilIi1O10o.I00iio;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = ilIi1O10o.I00ilO0;
                    try {
                        try {
                            try {
                                try {
                                    try {
/* 38 */                                if (i2 == 0) {
/* 82 */                                    lIoii1l01l0i.I00000oOI(obj);
/* 91 */                                    if (this.I0000oI00.get()) {
/* 297 */                                       I000II.I001IO000("StorageConnection has already been disposed.");
/* 37 */                                        return null;
                                            }
/* 97 */                                    File parentFile = file3.getCanonicalFile().getParentFile();
/* 101 */                                   if (parentFile != null) {
/* 103 */                                       parentFile.mkdirs();
/* 110 */                                       if (!parentFile.isDirectory()) {
/* 115 */                                           IOOlIIilOl0.I000l1("Unable to create parent directories of ", file3);
/* 37 */                                            return null;
                                                }
                                            }
/* 119 */                                   OI1I0OoOl oI1I0OoOl = this.I0001Ioi1lo;
/* 121 */                                   ilIi1O10o.I00iOIl = ii1O1oOli;
/* 123 */                                   ilIi1O10o.I00iiI = oI1I0OoOl;
/* 125 */                                   ilIi1O10o.I00ilO0 = 1;
/* 127 */                                   Object objI00000oIO = oI1I0OoOl.I00000oIO(ilIi1O10o);
                                            illiIl1l11O = ii1O1oOli;
                                            r12 = oI1I0OoOl;
/* 131 */                                   if (objI00000oIO != ii0111o) {
                                            }
/* 181 */                                   return ii0111o;
                                        }
/* 40 */                                if (i2 != 1) {
/* 42 */                                    if (i2 != 2) {
/* 64 */                                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                                        return null;
                                            }
/* 44 */                                    ilIl0oi12 = ilIi1O10o.I00iiO;
/* 48 */                                    file2 = (File) ilIi1O10o.I00iiI;
/* 52 */                                    oI11ol = (OI11ol) ilIi1O10o.I00iOIl;
                                            try {
/* 54 */                                        lIoii1l01l0i.I00000oOI(obj);
                                                try {
/* 185 */                                           ilIl0oi12.close();
/* 188 */                                           th = null;
                                                } catch (Throwable th2) {
/* 190 */                                           th = th2;
                                                }
/* 191 */                                       if (th == null) {
/* 263 */                                           throw th;
                                                }
/* 197 */                                       if (file2.exists()) {
                                                    try {
/* 214 */                                               Files.move(file2.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                    } catch (IOException unused) {
/* 250 */                                               throw new IOException("Unable to rename " + file2 + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                    }
                                                }
/* 257 */                                       oI11ol.I00000oOI(null);
/* 260 */                                       return OoiIlOl1iI.I00000oIO;
                                            } catch (Throwable th3) {
/* 59 */                                        th = th3;
                                                try {
/* 269 */                                           ilIl0oi12.close();
                                                } catch (Throwable th4) {
/* 274 */                                           ilIilolOlIoO.I00000oIO(th, th4);
                                                }
/* 277 */                                       throw th;
                                            }
                                        }
/* 70 */                                OI11ol oI11ol2 = (OI11ol) ilIi1O10o.I00iiI;
/* 74 */                                IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) ilIi1O10o.I00iOIl;
/* 76 */                                lIoii1l01l0i.I00000oOI(obj);
/* 79 */                                r12 = oI11ol2;
/* 80 */                                illiIl1l11O = illiIl1l11O2;
/* 167 */                               ilIi1O10o.I00iOIl = r12;
/* 169 */                               ilIi1O10o.I00iiI = file;
/* 171 */                               ilIi1O10o.I00iiO = ilIl0oi1;
/* 173 */                               ilIi1O10o.I00ilO0 = 2;
/* 179 */                               if (illiIl1l11O.invoke(ilIl0oi1, ilIi1O10o) != ii0111o) {
/* 182 */                                   oI11ol = r12;
/* 183 */                                   file2 = file;
/* 184 */                                   ilIl0oi12 = ilIl0oi1;
/* 185 */                                   ilIl0oi12.close();
/* 188 */                                   th = null;
/* 191 */                                   if (th == null) {
                                            }
                                        }
/* 181 */                               return ii0111o;
                                    } catch (Throwable th5) {
/* 267 */                               th = th5;
/* 268 */                               ilIl0oi12 = ilIl0oi1;
/* 269 */                               ilIl0oi12.close();
/* 277 */                               throw th;
                                    }
/* 164 */                           ilIl0oi1 = new IlIl0oi1(file, this.I00000oOI);
                                } catch (IOException e) {
/* 280 */                           e = e;
/* 285 */                           if (file.exists()) {
/* 287 */                               file.delete();
                                    }
/* 290 */                           throw e;
                                }
/* 157 */                       file = new File(file3.getAbsolutePath() + ".tmp");
                            } catch (Throwable th6) {
/* 278 */                       th = th6;
/* 291 */                       r12.I00000oOI(null);
/* 294 */                       throw th;
                            }
                        } catch (Throwable th7) {
/* 251 */                   th = th7;
/* 218 */                   r12 = ilIi1O10o;
/* 291 */                   r12.I00000oOI(null);
/* 294 */                   throw th;
                        }
                    } catch (IOException e2) {
/* 253 */               e = e2;
/* 254 */               file = ii1O1oOli;
/* 255 */               r12 = ilIi1O10o;
                    }
                }

                @Override
                public final void close() {
/* 4 */             this.I0000oI00.set(true);
/* 9 */             this.I0000O.invoke();
                }
            }
