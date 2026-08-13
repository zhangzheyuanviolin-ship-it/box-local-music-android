            package p000;

            import android.graphics.Typeface;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Callable;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            
            public final class IlloOi1I1OO implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IlloOi1I1OO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws Throwable {
/* 4 */             boolean z = false;
                    switch (this.I00iOIl) {
                        case 0:
/* 409 */                   Illo1O0O10l illo1O0O10l = (Illo1O0O10l) this.I00iiO;
                            try {
/* 419 */                       illo1O0O10l.I0001Ioi1lo(iIllIoiiIO.I00000oOI((ListenableFuture) this.I00iiI));
/* 444 */                       return;
                            } catch (Error | RuntimeException e) {
/* 427 */                       illo1O0O10l.I00II0oii1o(e);
/* 444 */                       return;
                            } catch (ExecutionException e2) {
/* 431 */                       Throwable cause = e2.getCause();
/* 435 */                       if (cause == null) {
/* 437 */                           illo1O0O10l.I00II0oii1o(e2);
/* 444 */                           return;
                                } else {
/* 441 */                           illo1O0O10l.I00II0oii1o(cause);
/* 444 */                           return;
                                }
                            }
                        case 1:
/* 391 */                   Oi00IilOloo0 oi00IilOloo0 = (Oi00IilOloo0) this.I00iiI;
/* 395 */                   Typeface typeface = (Typeface) this.I00iiO;
/* 399 */                   I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) oi00IilOloo0.I00iOIl;
/* 401 */                   if (i1I1OO00o1o != null) {
/* 403 */                       i1I1OO00o1o.I001i1O0Ol(typeface);
/* 406 */                       return;
                            }
/* 406 */                   return;
                        case 2:
/* 385 */                   ((IioO0ilo1Ii) this.I00iiI).accept(this.I00iiO);
/* 388 */                   return;
                        case 3:
/* 317 */                   ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 319 */                   boolean zIsCancelled = listenableFuture.isCancelled();
/* 326 */                   IIoOoIol0Io0 iIoOoIol0Io0 = (IIoOoIol0Io0) this.I00iiO;
/* 328 */                   if (zIsCancelled) {
/* 331 */                       iIoOoIol0Io0.I0000O(null);
/* 376 */                       return;
                            }
                            while (true) {
                                try {
                                    try {
/* 335 */                               Object obj = listenableFuture.get();
/* 339 */                               if (z) {
/* 345 */                                   Thread.currentThread().interrupt();
                                        }
/* 348 */                               iIoOoIol0Io0.resumeWith(obj);
/* 376 */                               return;
                                    } catch (ExecutionException e3) {
/* 373 */                               iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(e3.getCause()));
/* 376 */                               return;
                                    }
                                } catch (InterruptedException unused) {
/* 377 */                           z = true;
                                } catch (Throwable th) {
/* 355 */                           if (z) {
/* 361 */                               Thread.currentThread().interrupt();
                                    }
/* 364 */                           throw th;
                                }
                            }
                        case 4:
/* 295 */                   i0OIOOi00 i0oiooi00 = (i0OIOOi00) this.I00iiI;
/* 299 */                   i0OIIl i0oiil = (i0OIIl) this.I00iiO;
/* 311 */                   i0oiooi00.I00000oIO.I00000oIO(i0oiil.I0000O, i0oiil.I0000oI00, (String) i0oiil.I00000oOI);
/* 314 */                   return;
                        case 5:
/* 289 */                   ((ii0IiOii) this.I00iiI).zza((iOioIII1i) this.I00iiO);
/* 292 */                   return;
                        case 6:
/* 277 */                   ((IIiOOI) this.I00iiI).I0000O(((illlllioii1) this.I00iiO).zza());
/* 280 */                   return;
                        case 7:
/* 261 */                   ((IIiOOI) this.I00iiI).I0000O(((lIi1Illloi) this.I00iiO).zza());
/* 264 */                   return;
                        case 8:
/* 196 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00iiO).I000II;
/* 198 */                   lilool0.I00OI1();
/* 203 */                   iII000ol000 iii000ol000 = (iII000ol000) this.I00iiI;
/* 211 */                   if (iii000ol000.I00iiO.zza() == null) {
/* 213 */                       lilool0.getClass();
/* 216 */                       String str = iii000ol000.I00iOIl;
/* 218 */                       lII0I0I000I.I000II(str);
/* 221 */                       lli10iI lli10iiI00IoiI = lilool0.I00IoiI(str);
/* 225 */                       if (lli10iiI00IoiI != null) {
/* 227 */                           lilool0.I00OilO00Il(iii000ol000, lli10iiI00IoiI);
/* 248 */                           return;
                                }
/* 248 */                       return;
                            }
/* 231 */                   lilool0.getClass();
/* 234 */                   String str2 = iii000ol000.I00iOIl;
/* 236 */                   lII0I0I000I.I000II(str2);
/* 239 */                   lli10iI lli10iiI00IoiI2 = lilool0.I00IoiI(str2);
/* 243 */                   if (lli10iiI00IoiI2 != null) {
/* 245 */                       lilool0.I00OOll1(iii000ol000, lli10iiI00IoiI2);
/* 248 */                       return;
                            }
/* 248 */                   return;
                        case 9:
/* 188 */                   ((lIl1O1li) this.I00iiO).I011Io0I1ioi((Boolean) this.I00iiI, true);
/* 191 */                   return;
                        case 10:
/* 126 */                   lOl001Iii lol001iii = (lOl001Iii) this.I00iiO;
                            synchronized (lol001iii) {
                                try {
/* 129 */                           lol001iii.I00iOIl = false;
/* 131 */                           lOliOlO1Io loliolo1io = lol001iii.I00iiO;
/* 137 */                           if (!loliolo1io.I011IOil()) {
/* 143 */                               l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 145 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 152 */                               l01o0io1ooo0.I00lll10.I00000oOI("Connected to service");
/* 157 */                               iolll0ill1i iolll0ill1iVar = (iolll0ill1i) this.I00iiI;
/* 159 */                               loliolo1io.I010II();
/* 162 */                               lII0I0I000I.I000II(iolll0ill1iVar);
/* 165 */                               loliolo1io.I00iio = iolll0ill1iVar;
/* 167 */                               loliolo1io.I0110OiO();
/* 170 */                               loliolo1io.I0111i();
                                    }
                                } finally {
                                }
                            }
/* 177 */                   return;
                        case 11:
/* 43 */                    l0IIioiIOIo l0iiioiioio = (l0IIioiIOIo) this.I00iiO;
/* 47 */                    o0IiOl o0iiol = (o0IiOl) l0iiioiioio.I00iio;
                            try {
/* 61 */                        OloIIoII1oo oloIIoII1ooThen = ((OliOio1iiOI) l0iiioiioio.I00iiO).then(((OloIIoII1oo) this.I00iiI).I000II());
/* 65 */                        if (oloIIoII1ooThen == null) {
/* 74 */                            o0iiol.I000oI1ioi(new NullPointerException("Continuation returned null"));
/* 123 */                           return;
                                }
/* 78 */                        Iii11l iii11l = OloIo0oOIO0.I00000oOI;
/* 80 */                        oloIIoII1ooThen.I0000oI00(iii11l, l0iiioiioio);
/* 83 */                        oloIIoII1ooThen.I0000O(iii11l, l0iiioiioio);
/* 86 */                        oloIIoII1ooThen.I00000oIO(iii11l, l0iiioiioio);
/* 123 */                       return;
                            } catch (OiII01 e4) {
/* 108 */                       if (e4.getCause() instanceof Exception) {
/* 116 */                           l0iiioiioio.onFailure((Exception) e4.getCause());
/* 123 */                           return;
                                } else {
/* 120 */                           o0iiol.I000oI1ioi(e4);
/* 123 */                           return;
                                }
                            } catch (CancellationException unused2) {
/* 98 */                        l0iiioiioio.I00000oOI();
/* 123 */                       return;
                            } catch (Exception e5) {
/* 94 */                        o0iiol.I000oI1ioi(e5);
/* 123 */                       return;
                            }
                        default:
/* 10 */                    o0IiOl o0iiol2 = (o0IiOl) this.I00iiI;
                            try {
/* 20 */                        o0iiol2.I000lI(((Callable) this.I00iiO).call());
/* 40 */                        return;
                            } catch (Exception e6) {
/* 37 */                        o0iiol2.I000oI1ioi(e6);
/* 40 */                        return;
                            } catch (Throwable th2) {
/* 33 */                        o0iiol2.I000oI1ioi(new RuntimeException(th2));
/* 40 */                        return;
                            }
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 34 */                    return IlloOi1I1OO.class.getSimpleName() + "," + ((Illo1O0O10l) this.I00iiO);
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
