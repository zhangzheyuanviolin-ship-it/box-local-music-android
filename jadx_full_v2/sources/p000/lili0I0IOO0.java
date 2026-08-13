            package p000;

            import android.os.StrictMode;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class lili0I0IOO0 {
                public static final Oi1ol0llI I000OOo1O;
                public static final liIli0ooIlO I000OiO;
                public volatile IOI0oloi01 I00000oIO;
                public lIlIo1 I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public boolean I0000oI00;
                public Ioio0O I0001Ioi1lo;
                public i0O1lIi1O0IO I000II;
                public l1Il1IliOI1l I000O01llI0;

                static {
/* 6 */             Oi1ol0llI oi1ol0llI = new Oi1ol0llI(27, false);
/* 14 */            oi1ol0llI.I00iiI = new ConcurrentHashMap();
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I000OOo1O = oi1ol0llI;
/* 23 */            iI1l0iillll1 ii1l0iillll1 = iI1l0iillll1.I00iiO;
/* 25 */            int i = Ioio0O.I00iiO;
/* 32 */            I000OiO = new liIli0ooIlO(ii1l0iillll1, false, OOoliIo1ol.I00l0OO0IO);
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x00c0 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:13:0x0026, B:15:0x0031, B:17:0x0039, B:19:0x0043, B:29:0x00bc, B:31:0x00c0, B:34:0x00cb, B:22:0x0066, B:24:0x008f, B:25:0x00a1, B:27:0x00a9, B:36:0x00cf, B:37:0x00d2, B:38:0x00d3, B:8:0x000d), top: B:43:0x0005, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:13:0x0026, B:15:0x0031, B:17:0x0039, B:19:0x0043, B:29:0x00bc, B:31:0x00c0, B:34:0x00cb, B:22:0x0066, B:24:0x008f, B:25:0x00a1, B:27:0x00a9, B:36:0x00cf, B:37:0x00d2, B:38:0x00d3, B:8:0x000d), top: B:43:0x0005, inners: #1 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IOI0oloi01 I00000oIO() {
                    IOI0oloi01 iOI0oloi01;
/* 1 */             IOI0oloi01 iOI0oloi012 = this.I00000oIO;
/* 3 */             if (iOI0oloi012 != null) {
/* 245 */               return iOI0oloi012;
                    }
                    synchronized (this) {
                        try {
/* 6 */                     iOI0oloi01 = this.I00000oIO;
/* 8 */                     if (iOI0oloi01 == null) {
/* 10 */                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                                try {
/* 16 */                            IOI0oloi01 iOI0oloi01I0000Il00O = this.I000O01llI0.I0000Il00O();
/* 20 */                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                                    int i = ((IIOOoI) iOI0oloi01I0000Il00O.I0000oI00).I0000Il00O - 2;
/* 33 */                            if (i == 15 || i == 16) {
/* 188 */                               iOI0oloi01 = iOI0oloi01I0000Il00O;
/* 191 */                               if (!this.I0000oI00 || ((IIOOoI) iOI0oloi01.I0000oI00).I0000Il00O != 17) {
/* 204 */                                   this.I00000oIO = iOI0oloi01;
                                        }
                                    } else {
/* 39 */                                lIlIo1 lilio1 = this.I00000oOI;
/* 43 */                                lilio1.I000II.I00000oIO();
/* 48 */                                if (this.I0000oI00 || this.I000O01llI0.I0001Ioi1lo() || !((String) iOI0oloi01I0000Il00O.I00000oOI).isEmpty()) {
/* 103 */                                   OI011o1 oI011o1I00000oIO = lilio1.I00000oIO();
/* 110 */                                   liO0oo1 lio0oo1 = new liO0oo1(3);
/* 113 */                                   lio0oo1.I00iiI = this;
/* 115 */                                   VarHandle.storeStoreFence();
/* 118 */                                   oI011o1I00000oIO.execute(lio0oo1);
/* 131 */                                   lilio1.I00000oIO.I0000Il00O((i1lIIl01O) iOI0oloi01I0000Il00O.I0000Il00O, this.I0001Ioi1lo, this.I0000Il00O);
/* 142 */                                   if (!this.I0000O.equals("")) {
/* 144 */                                       OI011o1 oI011o1I00000oIO2 = lilio1.I00000oIO();
/* 151 */                                       liO0oo1 lio0oo12 = new liO0oo1(1);
/* 154 */                                       lio0oo12.I00iiI = this;
/* 156 */                                       VarHandle.storeStoreFence();
/* 159 */                                       oI011o1I00000oIO2.execute(lio0oo12);
                                            }
/* 168 */                                   if (this.I000O01llI0.I0001Ioi1lo()) {
/* 170 */                                       OI011o1 oI011o1I00000oIO3 = lilio1.I00000oIO();
/* 177 */                                       liO0oo1 lio0oo13 = new liO0oo1(2);
/* 180 */                                       lio0oo13.I00iiI = this;
/* 182 */                                       VarHandle.storeStoreFence();
/* 185 */                                       oI011o1I00000oIO3.execute(lio0oo13);
                                            }
/* 188 */                                   iOI0oloi01 = iOI0oloi01I0000Il00O;
/* 191 */                                   if (!this.I0000oI00) {
/* 204 */                                       this.I00000oIO = iOI0oloi01;
                                            }
                                        } else {
/* 68 */                                    OI011o1 oI011o1I00000oIO4 = lilio1.I00000oIO();
/* 75 */                                    liO0oo1 lio0oo14 = new liO0oo1(0);
/* 78 */                                    lio0oo14.I00iiI = this;
/* 80 */                                    VarHandle.storeStoreFence();
/* 83 */                                    oI011o1I00000oIO4.execute(lio0oo14);
/* 96 */                                    iOI0oloi01 = new IOI0oloi01(llOOiIiIOo.I001lIiIIo1O(), (IIOOoI) iOI0oloi01I0000Il00O.I0000oI00);
/* 191 */                                   if (!this.I0000oI00) {
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
/* 208 */                           StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
/* 211 */                           throw th;
                                }
                            }
                        } finally {
                        }
                    }
/* 213 */           return iOI0oloi01;
                }

                public final void I00000oOI() {
/* 1 */             l1Il1IliOI1l l1il1ilioi1l = this.I000O01llI0;
/* 5 */             lIlIo1 lilio1 = (lIlIo1) l1il1ilioi1l.I00iOIl;
/* 13 */            lOIiI0 loiii0 = (lOIiI0) lilio1.I0000O.get();
/* 17 */            String str = (String) l1il1ilioi1l.I00iiO;
/* 19 */            loiii0.getClass();
/* 22 */            str.getClass();
/* 25 */            lI1i1OI1O0l li1i1oi1o0l = loiii0.I00000oIO;
/* 27 */            IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 34 */            I0OooiI1I i0OooiI1I = new I0OooiI1I(4);
/* 37 */            i0OooiI1I.I00iiI = str;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            iolIIo0o0IioI0000Il00O.I0000Il00O = i0OooiI1I;
/* 66 */            I00l0OO0IO i00l0OO0IOI00000oOI = lOIiI0.I00000oOI(li1i1oi1o0l.I00000oOI(0, iolIIo0o0IioI0000Il00O.I00000oIO()).I000iOII(Iii11Ooi.I00iOIl, new looil0O1Io1(26)));
/* 70 */            iI1l0iillll1 ii1l0iillll1 = iI1l0iillll1.I00iio;
/* 72 */            OI011o1 oI011o1I00000oIO = lilio1.I00000oIO();
/* 76 */            int i = I01iIIO.I00li1OI;
/* 80 */            I01iI0l00O i01iI0l00O = new I01iI0l00O(i00l0OO0IOI00000oOI, ii1l0iillll1);
/* 87 */            i00l0OO0IOI00000oOI.addListener(i01iI0l00O, l1i0oIO0.I00000oOI(oI011o1I00000oIO, i01iI0l00O));
/* 93 */            liOOloi0I liooloi0i = new liOOloi0I(1);
/* 96 */            liooloi0i.I00000oOI = l1il1ilioi1l;
/* 98 */            VarHandle.storeStoreFence();
/* 101 */           lIlIo1 lilio12 = this.I00000oOI;
/* 107 */           I01i1oI i01i1oII00100l0 = I01iIIO.I00100l0(i01iI0l00O, liooloi0i, lilio12.I00000oIO());
/* 115 */           iooiio1i0 iooiio1i0Var = new iooiio1i0(13);
/* 118 */           iooiio1i0Var.I00iiI = this;
/* 120 */           iooiio1i0Var.I00iiO = i01iI0l00O;
/* 122 */           VarHandle.storeStoreFence();
/* 129 */           i01i1oII00100l0.addListener(iooiio1i0Var, lilio12.I00000oIO());
                }
            }
