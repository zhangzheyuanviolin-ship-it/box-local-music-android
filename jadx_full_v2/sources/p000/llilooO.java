            package p000;

            import android.content.Context;
            import android.net.Uri;
            import android.os.Build;
            import android.os.StrictMode;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            
            public final class llilooO {
                public static final Object I000OiO = new Object();
                public static final Object I000iOII = new Object();
                public Context I00000oIO;
                public OliiillO I00000oOI;
                public OliiillO I0000Il00O;
                public OliiillO I0000O;
                public OliiillO I0000oI00;
                public OliiillO I0001Ioi1lo;
                public Uri I000II;
                public volatile lOlIllO1 I000O01llI0;
                public Uri I000OOo1O;

                public final void I00000oIO() {
                    IlOool ilOool;
/* 7 */             if (!lIOOli.I000lI(this.I00000oIO) || I0000Il00O().I001i1lo1io() + 86400000 >= System.currentTimeMillis()) {
/* 88 */                Ioil1OOO ioil1OOO = Ioil1OOO.I00iiI;
/* 110 */               return;
                    }
/* 36 */            OI011o1 oI011o1 = (OI011o1) this.I0000Il00O.get();
/* 38 */            oI011o1.getClass();
/* 49 */            ListenableFuture listenableFutureI0000O = IlloOoiiO.I0000O((ListenableFuture) this.I0001Ioi1lo.get());
/* 53 */            int i = IlOool.I00ioIO;
/* 57 */            if (listenableFutureI0000O instanceof IlOool) {
/* 59 */                ilOool = (IlOool) listenableFutureI0000O;
                    } else {
/* 64 */                Ilioio1o ilioio1o = new Ilioio1o();
/* 67 */                ilioio1o.I00l0I0l0lO1 = listenableFutureI0000O;
/* 69 */                VarHandle.storeStoreFence();
/* 72 */                ilOool = ilioio1o;
                    }
/* 76 */            liOOloi0I liooloi0i = new liOOloi0I(2);
/* 79 */            liooloi0i.I00000oOI = this;
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            I01iIIO.I00100l0(ilOool, liooloi0i, oI011o1);
                }

                public final llIii0000O0 I00000oOI() {
/* 1 */             lOlIllO1 lolillo1I0000Il00O = I0000Il00O();
/* 5 */             boolean zI001IO000 = lolillo1I0000Il00O.I001IO000();
/* 13 */            IoillO0OOoo ioillO0OOooI000oI1ioi = IoillO0OOoo.I000oI1ioi(lolillo1I0000Il00O.I001lIiIIo1O());
/* 17 */            i1lIIl01O i1liil01oI001IIilI0O = lolillo1I0000Il00O.I001IIilI0O();
/* 21 */            String strI001i1O0Ol = lolillo1I0000Il00O.I001i1O0Ol();
/* 29 */            IoillO0OOoo ioillO0OOooI000oI1ioi2 = IoillO0OOoo.I000oI1ioi(lolillo1I0000Il00O.I001iOo1i0O());
/* 37 */            IoillO0OOoo ioillO0OOooI000oI1ioi3 = IoillO0OOoo.I000oI1ioi(lolillo1I0000Il00O.I001l0I00());
/* 71 */            String strI00111O = (lolillo1I0000Il00O.I001lllioOl() && lolillo1I0000Il00O.I001lloI().I001IIilI0O() == ((long) Build.VERSION.SDK_INT)) ? lolillo1I0000Il00O.I001lloI().I00111O() : "";
/* 73 */            boolean zI00111O = lolillo1I0000Il00O.I00111O();
/* 77 */            boolean zI00II0oii1o = lolillo1I0000Il00O.I00II0oii1o();
/* 81 */            boolean zI00II0Ol1O0l = lolillo1I0000Il00O.I00II0Ol1O0l();
/* 85 */            lOl0ioO11 lol0ioo11I00IO1 = lolillo1I0000Il00O.I00IO1();
/* 91 */            llIii0000O0 lliii0000o0 = new llIii0000O0();
/* 94 */            lliii0000o0.I00000oIO = zI001IO000;
/* 96 */            lliii0000o0.I00000oOI = ioillO0OOooI000oI1ioi;
/* 98 */            lliii0000o0.I0000Il00O = i1liil01oI001IIilI0O;
/* 100 */           lliii0000o0.I0000O = strI001i1O0Ol;
/* 102 */           lliii0000o0.I0000oI00 = strI00111O;
/* 104 */           lliii0000o0.I0001Ioi1lo = ioillO0OOooI000oI1ioi2;
/* 106 */           lliii0000o0.I000II = ioillO0OOooI000oI1ioi3;
/* 108 */           lliii0000o0.I000O01llI0 = zI00111O;
/* 110 */           lliii0000o0.I000OOo1O = zI00II0oii1o;
/* 112 */           lliii0000o0.I000OiO = zI00II0Ol1O0l;
/* 114 */           lliii0000o0.I000iOII = lol0ioo11I00IO1;
/* 116 */           VarHandle.storeStoreFence();
/* 245 */           return lliii0000o0;
                }

                public final lOlIllO1 I0000Il00O() {
                    lOlIllO1 lolillo1I00IOO;
/* 1 */             lOlIllO1 lolillo1 = this.I000O01llI0;
/* 3 */             if (lolillo1 != null) {
/* 245 */               return lolillo1;
                    }
                    synchronized (I000OiO) {
/* 8 */                 lolillo1I00IOO = this.I000O01llI0;
/* 10 */                if (lolillo1I00IOO == null) {
/* 12 */                    lolillo1I00IOO = lOlIllO1.I00IOO();
/* 22 */                    if (lIOOli.I000lI(this.I00000oIO)) {
/* 29 */                        iI0ooO1Oi000 ii0ooo1oi000 = (iI0ooO1Oi000) lolillo1I00IOO.I0010o(7);
/* 31 */                        i1o0l0i i1o0l0iVar = i1o0l0i.I00000oIO;
/* 33 */                        int i = i1ioiooIiOol.I00000oIO;
/* 35 */                        i1o0l0i i1o0l0iVar2 = i1o0l0i.I00000oOI;
/* 37 */                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
/* 54 */                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                                try {
/* 71 */                            InputStream inputStreamI00000oOI = ll1110lO.I00000oOI(((lloOo1iol) this.I0000O.get()).I00000oOI(this.I000II));
                                    try {
/* 77 */                                i1oi01OllI i1oi01olliI00000oIO = ((i1oO1llOO) ii0ooo1oi000).I00000oIO(inputStreamI00000oOI, i1o0l0iVar2);
/* 81 */                                if (inputStreamI00000oOI != null) {
/* 83 */                                    inputStreamI00000oOI.close();
                                        }
/* 86 */                                lolillo1I00IOO = (lOlIllO1) i1oi01olliI00000oIO;
                                    } catch (Throwable th) {
/* 98 */                                if (inputStreamI00000oOI != null) {
                                            try {
/* 100 */                                       inputStreamI00000oOI.close();
                                            } catch (Throwable th2) {
/* 105 */                                       th.addSuppressed(th2);
                                            }
                                        }
/* 108 */                               throw th;
                                    }
                                } catch (IOException unused) {
                                } finally {
/* 109 */                           StrictMode.setThreadPolicy(threadPolicy);
                                }
/* 116 */                       this.I000O01llI0 = lolillo1I00IOO;
                            }
                        }
                    }
/* 119 */           return lolillo1I00IOO;
                }
            }
