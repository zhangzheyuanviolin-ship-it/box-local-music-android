            package p000;

            import android.content.Context;
            import android.net.Uri;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.logging.Level;
            
            public abstract class li1OooOo0OO implements OliiillO {
                public final String I00iOIl;
                public final IOoi01o I00iiI;
                public volatile int I00iiO = -1;
                public i0O1lIi1O0IO I00iio;

                public li1OooOo0OO(String str, IOoi01o iOoi01o) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = iOoi01o;
                }

                public abstract Object I00000oIO();

                public abstract Object I00000oOI(String str);

                public abstract Object I0000Il00O(Object obj);

                public abstract Object I0000O();

                public abstract void I0000oI00(Object obj);

                /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x010a A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:30:0x0090, B:32:0x0094, B:36:0x00a9, B:38:0x00b5, B:40:0x00c7, B:42:0x00d5, B:50:0x00f6, B:55:0x010a, B:56:0x0110, B:58:0x0121, B:60:0x0129, B:61:0x014e, B:64:0x0161, B:68:0x0172, B:73:0x017c, B:75:0x0182, B:76:0x0187, B:67:0x0167, B:53:0x00fc, B:46:0x00ea, B:43:0x00e2, B:78:0x0189), top: B:96:0x0090, inners: #2, #4 }] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x017c A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:30:0x0090, B:32:0x0094, B:36:0x00a9, B:38:0x00b5, B:40:0x00c7, B:42:0x00d5, B:50:0x00f6, B:55:0x010a, B:56:0x0110, B:58:0x0121, B:60:0x0129, B:61:0x014e, B:64:0x0161, B:68:0x0172, B:73:0x017c, B:75:0x0182, B:76:0x0187, B:67:0x0167, B:53:0x00fc, B:46:0x00ea, B:43:0x00e2, B:78:0x0189), top: B:96:0x0090, inners: #2, #4 }] */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0182 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:30:0x0090, B:32:0x0094, B:36:0x00a9, B:38:0x00b5, B:40:0x00c7, B:42:0x00d5, B:50:0x00f6, B:55:0x010a, B:56:0x0110, B:58:0x0121, B:60:0x0129, B:61:0x014e, B:64:0x0161, B:68:0x0172, B:73:0x017c, B:75:0x0182, B:76:0x0187, B:67:0x0167, B:53:0x00fc, B:46:0x00ea, B:43:0x00e2, B:78:0x0189), top: B:96:0x0090, inners: #2, #4 }] */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get() {
                    lili0I0IOO0 lili0i0ioo0I00000oOI;
                    Object objI00000oIO;
                    String str;
                    int i;
                    Object obj;
                    Ol0Ii10o1 ol0Ii10o1;
                    lIlIo1 lilio1;
/* 3 */             if (iO1lOIlIOoo.I0000Il00O == null) {
/* 5 */                 Object obj2 = lIlIo1.I000OiO;
/* 14 */                iO1lOIlIOoo.I0000Il00O = new I1o1lOlooI1(12);
                    }
/* 22 */            Context context = (Context) lIlIo1.I000iOII.get();
/* 24 */            Object objI0000Il00O = null;
/* 25 */            if (context == null) {
                        synchronized (iO1lOIlIOoo.I00000oIO) {
                        }
/* 413 */               I000II.I001IO000("Must call PhenotypeContext.setContext() first");
/* 24 */                return null;
                    }
/* 27 */            lIlIo1 lilio12 = lIlIo1.I000l1;
/* 29 */            if (lilio12 == null) {
/* 32 */                Context applicationContext = context.getApplicationContext();
                        try {
/* 44 */                    Class<?> cls = applicationContext.getApplicationContext().getClass();
/* 60 */                    new StringBuilder(String.valueOf(cls).length() + 72);
/* 63 */                    cls.toString();
/* 77 */                    throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
                        } catch (IllegalStateException unused) {
                            synchronized (lIlIo1.I000OiO) {
                                try {
/* 83 */                            if (lIlIo1.I000l1 != null) {
/* 85 */                                lilio1 = lIlIo1.I000l1;
                                    } else {
/* 95 */                                IoiIlI1oOO ioiIlI1oOO = new IoiIlI1oOO();
/* 98 */                                ioiIlI1oOO.I00iOIl = applicationContext;
/* 100 */                               VarHandle.storeStoreFence();
/* 107 */                               lilio1 = (lIlIo1) ioiIlI1oOO.get();
/* 109 */                               lIlIo1.I000l1 = lilio1;
/* 122 */                               ll0ii0IllI.I00000oIO(Level.CONFIG, lilio1.I00000oIO(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                                    }
/* 88 */                            lilio12 = lilio1;
                                } finally {
                                }
                            }
                        }
                    }
/* 127 */           int i2 = this.I00iiO;
/* 130 */           if (i2 == -1 || i2 < ((AtomicInteger) this.I00iio.I00iiI).get()) {
                        synchronized (this) {
                            try {
/* 145 */                       int i3 = this.I00iiO;
/* 147 */                       if (i3 == -1) {
/* 149 */                           lIlIo1.I00000oOI();
/* 152 */                           lilio12.getClass();
/* 157 */                           lili0i0ioo0I00000oOI = this.I00iiI.I00000oOI(lilio12);
/* 163 */                           this.I00iio = lili0i0ioo0I00000oOI.I000II;
                                } else {
/* 169 */                           lili0i0ioo0I00000oOI = null;
                                }
/* 176 */                       int i4 = ((AtomicInteger) this.I00iio.I00iiI).get();
/* 180 */                       if (i3 < i4) {
/* 182 */                           lIlIo1.I00000oOI();
/* 185 */                           lilio12.getClass();
/* 190 */                           OIiiIl0iO oIiiIl0iOI000iOII = lIil0O.I000iOII(lilio12.I00000oOI);
/* 198 */                           if (oIiiIl0iOI000iOII.I00000oOI()) {
/* 204 */                               lIii11i liii11i = (lIii11i) oIiiIl0iOI000iOII.I00000oIO();
/* 206 */                               Uri uriI00000oIO = lIillol1io.I00000oIO();
/* 210 */                               String str2 = this.I00iOIl;
/* 212 */                               if (uriI00000oIO != null) {
/* 224 */                                   ol0Ii10o1 = (Ol0Ii10o1) liii11i.I00000oIO.get(uriI00000oIO.toString());
                                        } else {
/* 227 */                                   liii11i.getClass();
/* 230 */                                   ol0Ii10o1 = null;
                                        }
/* 239 */                               String str3 = ol0Ii10o1 == null ? null : (String) ol0Ii10o1.get(str2);
/* 241 */                               if (str3 == null) {
/* 243 */                                   objI00000oIO = null;
/* 265 */                                   if (lili0i0ioo0I00000oOI == null) {
/* 269 */                                       lili0i0ioo0I00000oOI = this.I00iiI.I00000oOI(lilio12);
                                            }
/* 273 */                                   str = lili0i0ioo0I00000oOI.I0000Il00O;
/* 287 */                                   i = 1;
/* 288 */                                   if (!lilio12.I00000oOI.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
/* 298 */                                       OI011o1 oI011o1I00000oIO = lilio12.I00000oIO();
/* 306 */                                       iooili01 iooili01Var = new iooili01(13);
/* 309 */                                       iooili01Var.I00iiI = lilio12;
/* 311 */                                       iooili01Var.I00iiO = str;
/* 313 */                                       VarHandle.storeStoreFence();
/* 316 */                                       ListenableFuture listenableFutureI00000oIO = oI011o1I00000oIO.I00000oIO(iooili01Var);
/* 322 */                                       IlloO1 illoO1 = new IlloO1(i);
/* 325 */                                       illoO1.I00iiI = listenableFutureI00000oIO;
/* 327 */                                       VarHandle.storeStoreFence();
/* 332 */                                       listenableFutureI00000oIO.addListener(illoO1, Iii11Ooi.I00iOIl);
                                            }
/* 347 */                                   obj = ((OOoli1l) lili0i0ioo0I00000oOI.I00000oIO().I0000O).get(this.I00iOIl);
/* 351 */                                   if (obj != null) {
                                                try {
/* 354 */                                           objI0000Il00O = I0000Il00O(obj);
                                                } catch (IOException | ClassCastException e) {
/* 368 */                                           Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.I00iOIl), e);
                                                }
                                            }
/* 375 */                                   if (true == oIiiIl0iOI000iOII.I00000oOI()) {
/* 378 */                                       objI00000oIO = objI0000Il00O;
                                            }
/* 379 */                                   if (objI00000oIO == null) {
/* 381 */                                       objI00000oIO = I00000oIO();
                                            }
/* 385 */                                   if (objI00000oIO != null) {
/* 387 */                                       I0000oI00(objI00000oIO);
/* 390 */                                       this.I00iiO = i4;
                                            }
                                        } else {
                                            try {
/* 247 */                                       objI00000oIO = I00000oOI(str3);
                                            } catch (IOException | IllegalArgumentException e2) {
/* 261 */                                       Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.I00iOIl), e2);
                                            }
/* 265 */                                   if (lili0i0ioo0I00000oOI == null) {
                                            }
/* 273 */                                   str = lili0i0ioo0I00000oOI.I0000Il00O;
/* 287 */                                   i = 1;
/* 288 */                                   if (!lilio12.I00000oOI.getPackageName().equals("com.android.vending")) {
/* 298 */                                       OI011o1 oI011o1I00000oIO2 = lilio12.I00000oIO();
/* 306 */                                       iooili01 iooili01Var2 = new iooili01(13);
/* 309 */                                       iooili01Var2.I00iiI = lilio12;
/* 311 */                                       iooili01Var2.I00iiO = str;
/* 313 */                                       VarHandle.storeStoreFence();
/* 316 */                                       ListenableFuture listenableFutureI00000oIO2 = oI011o1I00000oIO2.I00000oIO(iooili01Var2);
/* 322 */                                       IlloO1 illoO12 = new IlloO1(i);
/* 325 */                                       illoO12.I00iiI = listenableFutureI00000oIO2;
/* 327 */                                       VarHandle.storeStoreFence();
/* 332 */                                       listenableFutureI00000oIO2.addListener(illoO12, Iii11Ooi.I00iOIl);
                                            }
/* 347 */                                   obj = ((OOoli1l) lili0i0ioo0I00000oOI.I00000oIO().I0000O).get(this.I00iOIl);
/* 351 */                                   if (obj != null) {
                                            }
/* 375 */                                   if (true == oIiiIl0iOI000iOII.I00000oOI()) {
                                            }
/* 379 */                                   if (objI00000oIO == null) {
                                            }
/* 385 */                                   if (objI00000oIO != null) {
                                            }
                                        }
                                    }
                                } else {
/* 395 */                           objI00000oIO = I0000O();
                                }
                            } catch (Throwable th) {
/* 404 */                       throw th;
                            }
                        }
                    } else {
/* 395 */               objI00000oIO = I0000O();
                    }
/* 399 */           objI00000oIO.getClass();
/* 402 */           return objI00000oIO;
                }
            }
