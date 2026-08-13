            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.jvm.functions.Function1;
            
            public final class IOIo001i1o extends OOiIOI10OOIi {
                public static final int I0010I0i = 0;
                public IoioIli11o I000lI;
                public OillO0l I000o00OoI0I;
                public IoioIli11o I000oI1ioi;
                public IOIoIi11i0ll I00100l0;
                public volatile Object I00100o1O0lo;

                static {
/* 7 */             AtomicReferenceFieldUpdater.newUpdater(IOIo001i1o.class, Object.class, "I00100o1O0lo");
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:(1:(1:(3:14|60|(1:70)(2:68|69))(2:15|16))(4:17|76|18|19))(5:22|75|23|43|(2:45|(2:47|59)(1:48))(2:49|50))|53|(1:57))(1:27))(4:28|(1:30)(1:(1:32)(2:73|74))|33|(3:35|(1:38)|59)(2:71|72))|78|39|(3:42|43|(0)(0))|59) */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x017c, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
                
                    r3 = r1;
                    r1 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x01a5, code lost:
                
                    if (r9 == r5) goto L59;
                 */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0145 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:23:0x005d, B:43:0x0139, B:45:0x0145, B:49:0x0168, B:50:0x017b), top: B:75:0x005d }] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0168 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:23:0x005d, B:43:0x0139, B:45:0x0145, B:49:0x0168, B:50:0x017b), top: B:75:0x005d }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I000OOo1O(IOIo001i1o iOIo001i1o, Ii10ioolOI ii10ioolOI, IOoilo iOoilo) throws Throwable {
                    IOIlo0 iOIlo0;
                    Object i01ii1i;
                    Ii10ioolOI ii10ioolOI2;
                    IOIo001i1o iOIo001i1o2;
                    IOIo001i1o iOIo001i1o3;
                    Ii10ioolOI ii10ioolOI3;
                    IolOI01O1I iolOI01O1I;
                    IOIo001i1o iOIo001i1o4;
                    Ioli0o ioli0o;
                    Object objI00000oIO;
/* 11 */            if (iOoilo instanceof IOIlo0) {
/* 14 */                iOIlo0 = (IOIlo0) iOoilo;
/* 16 */                int i = iOIlo0.I00ilO0;
/* 22 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 25 */                    iOIlo0.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 30 */                    iOIlo0 = new IOIlo0(iOIo001i1o, iOoilo);
                        }
                    }
/* 33 */            Object obj = iOIlo0.I00iio;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i2 = iOIlo0.I00ilO0;
/* 41 */            Object obj2 = OoiIlOl1iI.I00000oIO;
/* 44 */            int i3 = 1;
/* 45 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 46 */            if (i2 == 0) {
/* 113 */               lIoii1l01l0i.I00000oOI(obj);
/* 116 */               iOIlo0.I00iOIl = iOIo001i1o;
/* 118 */               iOIlo0.I00iiI = ii10ioolOI;
/* 120 */               iOIlo0.I00ilO0 = 1;
/* 122 */               iOIo001i1o.I00000oOI = ii10ioolOI;
/* 128 */               OIOo1iiI oIOo1iiI = new OIOo1iiI(8);
/* 131 */               oIOo1iiI.I00iiI = iOIo001i1o;
/* 133 */               VarHandle.storeStoreFence();
/* 138 */               IllOOo00lI illOOo00lI = (IllOOo00lI) ii10ioolOI.I00000oIO;
/* 143 */               I01ii1IIl i01ii1IIl = new I01ii1IIl(0);
/* 146 */               i01ii1IIl.I00iiI = illOOo00lI;
/* 148 */               i01ii1IIl.I00iiO = oIOo1iiI;
/* 150 */               VarHandle.storeStoreFence();
/* 153 */               ii10ioolOI.I00000oIO = i01ii1IIl;
/* 159 */               OI1lOo oI1lOo = new OI1lOo(29);
/* 162 */               VarHandle.storeStoreFence();
/* 167 */               Function1 function1 = (Function1) ii10ioolOI.I00000oOI;
/* 171 */               I00o101lO i00o101lO = new I00o101lO(i3);
/* 174 */               i00o101lO.I00iiI = function1;
/* 176 */               i00o101lO.I00iiO = oI1lOo;
/* 178 */               VarHandle.storeStoreFence();
/* 181 */               ii10ioolOI.I00000oOI = i00o101lO;
/* 187 */               O1iIlllIoo o1iIlllIoo = new O1iIlllIoo(iOIo001i1o, iOoil1iiIilo, 12);
/* 192 */               IOi10loi iOi10loi = (IOi10loi) ii10ioolOI.I0000Il00O;
/* 194 */               boolean zI00oII = iOi10loi.I00oII();
/* 198 */               if (zI00oII) {
/* 202 */                   i01ii1i = (IlliIl1l11O) ii10ioolOI.I0000O;
                        } else {
/* 205 */                   if (zI00oII) {
/* 462 */                       I000II.I00000oIO();
/* 45 */                        return null;
                            }
/* 209 */                   i01ii1i = new I01ii1i(2, null, 0);
                        }
/* 217 */               ii10ioolOI.I0000O = new I00oIiI10(i01ii1i, o1iIlllIoo, iOoil1iiIilo, i3);
/* 219 */               iOi10loi.I00O10llo(obj2);
/* 231 */               OOiIOloo0.I00000oIO.I000OiO(new O1olloI0OlO(18));
/* 242 */               if (!((AtomicBoolean) ii10ioolOI.I000OOo1O).compareAndSet(false, true)) {
/* 458 */                   I000II.I001IO000("StreamableHttpClientTransport already started!");
/* 45 */                    return null;
                        }
/* 253 */               OlOiOI1oII1.I00000oIO.I000II(new Oi1O00OI(21));
/* 256 */               if (obj2 != ii0111o) {
/* 260 */                   ii10ioolOI2 = ii10ioolOI;
/* 261 */                   iOIo001i1o2 = iOIo001i1o;
                        }
                    }
/* 48 */            if (i2 != 1) {
/* 50 */                if (i2 == 2) {
/* 88 */                    iolOI01O1I = (IolOI01O1I) iOIlo0.I00iiO;
/* 90 */                    ii10ioolOI3 = iOIlo0.I00iiI;
/* 92 */                    iOIo001i1o4 = iOIlo0.I00iOIl;
                            try {
/* 94 */                        lIoii1l01l0i.I00000oOI(obj);
/* 314 */                       ioli0o = (Ioli0o) obj;
                            } catch (Throwable th) {
/* 99 */                        th = th;
/* 100 */                       iOIo001i1o3 = iOIo001i1o4;
                            }
/* 324 */                   if (IOi0ii00.I00000oIO.contains(ioli0o.I00000oIO)) {
/* 380 */                       throw new IllegalStateException("Server's protocol version is not supported: " + ioli0o.I00000oIO);
                            }
/* 328 */                   iOIo001i1o4.I000o00OoI0I = ioli0o.I00000oOI;
/* 332 */                   iOIo001i1o4.I000oI1ioi = ioli0o.I0000Il00O;
/* 336 */                   IoliIiol1 ioliIiol1 = new IoliIiol1();
/* 339 */                   ioliIiol1.I00000oIO = null;
/* 343 */                   ioliIiol1.I00000oOI = O1llOIO.I00lli11;
/* 345 */                   iOIlo0.I00iOIl = iOIo001i1o4;
/* 347 */                   iOIlo0.I00iiI = ii10ioolOI3;
/* 349 */                   iOIlo0.I00iiO = iolOI01O1I;
/* 351 */                   iOIlo0.I00ilO0 = 3;
                            return OOiIOI10OOIi.I0000Il00O(iOIo001i1o4, ioliIiol1, iOIlo0) == ii0111o ? ii0111o : obj2;
                        }
/* 52 */                if (i2 != 3) {
/* 54 */                    if (i2 != 4) {
/* 67 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                        return null;
                            }
/* 58 */                    th = (Throwable) iOIlo0.I00iiO;
/* 60 */                    lIoii1l01l0i.I00000oOI(obj);
/* 427 */                   if ((th instanceof CancellationException) || (th instanceof O1i0lO) || (th instanceof OlOiOoO) || (th instanceof Oili1O)) {
/* 455 */                       throw th;
                            }
/* 451 */                   IoOOl0iOl1io.I000l1(IIl001iO0Io.I000o00OoI0I("Error connecting to transport: ", th.getMessage()), th);
/* 45 */                    return null;
                        }
/* 75 */                ii10ioolOI3 = iOIlo0.I00iiI;
/* 77 */                iOIo001i1o3 = iOIlo0.I00iOIl;
                        try {
/* 79 */                    lIoii1l01l0i.I00000oOI(obj);
/* 82 */                    return obj2;
                        } catch (Throwable th2) {
/* 83 */                    th = th2;
                        }
/* 384 */               O0Iioo1lO0o o0Iioo1lO0o = IOIoli1ilo.I00000oIO;
/* 390 */               I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(20);
/* 393 */               i0OIOO00l0O.I00iiI = th;
/* 395 */               VarHandle.storeStoreFence();
/* 398 */               o0Iioo1lO0o.I00000oIO(th, i0OIOO00l0O);
/* 401 */               iOIlo0.I00iOIl = iOIo001i1o3;
/* 403 */               iOIlo0.I00iiI = ii10ioolOI3;
/* 405 */               iOIlo0.I00iiO = th;
/* 407 */               iOIlo0.I00ilO0 = 4;
/* 409 */               Ii10ioolOI ii10ioolOI4 = iOIo001i1o3.I00000oOI;
/* 411 */               if (ii10ioolOI4 != null && (objI00000oIO = ii10ioolOI4.I00000oIO(iOIlo0)) == Ii0111o.I00iOIl) {
/* 421 */                   obj2 = objI00000oIO;
                        }
                    } else {
/* 103 */               Ii10ioolOI ii10ioolOI5 = iOIlo0.I00iiI;
/* 105 */               iOIo001i1o2 = iOIlo0.I00iOIl;
/* 107 */               lIoii1l01l0i.I00000oOI(obj);
/* 110 */               ii10ioolOI2 = ii10ioolOI5;
                    }
/* 268 */           IOIoIi11i0ll iOIoIi11i0ll = iOIo001i1o2.I00100l0;
/* 270 */           IoioIli11o ioioIli11o = iOIo001i1o2.I000lI;
/* 272 */           IolOlli iolOlli = new IolOlli();
/* 275 */           iolOlli.I00000oIO = "2025-06-18";
/* 277 */           iolOlli.I00000oOI = iOIoIi11i0ll;
/* 279 */           iolOlli.I0000Il00O = ioioIli11o;
/* 281 */           iolOlli.I0000O = null;
/* 283 */           iolOI01O1I = new IolOI01O1I();
/* 286 */           iolOI01O1I.I00000oIO = iolOlli;
/* 290 */           iolOI01O1I.I00000oOI = O1llOIO.I00iiO;
/* 292 */           iOIlo0.I00iOIl = iOIo001i1o2;
/* 294 */           iOIlo0.I00iiI = ii10ioolOI2;
/* 296 */           iOIlo0.I00iiO = iolOI01O1I;
/* 298 */           iOIlo0.I00ilO0 = 2;
/* 300 */           Object objI000II = iOIo001i1o2.I000II(iolOI01O1I, iOIlo0);
/* 304 */           if (objI000II != ii0111o) {
/* 310 */               iOIo001i1o4 = iOIo001i1o2;
/* 311 */               ii10ioolOI3 = ii10ioolOI2;
/* 312 */               obj = objI000II;
/* 314 */               ioli0o = (Ioli0o) obj;
/* 324 */               if (IOi0ii00.I00000oIO.contains(ioli0o.I00000oIO)) {
                        }
                    }
                }

                @Override
                public final void I00000oIO(O1llOlOo o1llOlOo) {
                    Oill0iOO0I oill0iOO0I;
/* 6 */             if (o1llOlOo == O1llOIO.I00ol1) {
/* 8 */                 OillO0l oillO0l = this.I000o00OoI0I;
/* 14 */                if ((oillO0l != null ? oillO0l.I0000O : null) != null) {
/* 128 */                   return;
                        }
/* 20 */                IioIoO10iOiI.I000O01llI0(o1llOlOo, "Server does not support logging (required for ", ")");
/* 23 */                return;
                    }
/* 26 */            if (o1llOlOo == O1llOIO.I00li1OI || o1llOlOo == O1llOIO.I00l0OO0IO || o1llOlOo == O1llOIO.I00oli) {
/* 120 */               OillO0l oillO0l2 = this.I000o00OoI0I;
/* 126 */               if ((oillO0l2 != null ? oillO0l2.I0000Il00O : null) != null) {
/* 128 */                   return;
                        }
/* 131 */               IioIoO10iOiI.I000O01llI0(o1llOlOo, "Server does not support prompts (required for ", ")");
/* 186 */               return;
                    }
/* 39 */            if (o1llOlOo != O1llOIO.I00ilI0I1 && o1llOlOo != O1llOIO.I00ilO0 && o1llOlOo != O1llOIO.I00io1l && o1llOlOo != O1llOIO.I00ioIO && o1llOlOo != O1llOIO.I00l0I0l0lO1) {
/* 60 */                if (o1llOlOo != O1llOIO.I00oOio10iI1 && o1llOlOo != O1llOIO.I00oO101o) {
/* 67 */                    O1llIlI o1llIlI = O1llOIO.Companion;
/* 128 */                   return;
                        }
/* 70 */                OillO0l oillO0l3 = this.I000o00OoI0I;
/* 76 */                if ((oillO0l3 != null ? oillO0l3.I00000oIO : null) != null) {
/* 128 */                   return;
                        }
/* 81 */                IioIoO10iOiI.I000O01llI0(o1llOlOo, "Server does not support tools (required for ", ")");
/* 84 */                return;
                    }
/* 85 */            OillO0l oillO0l4 = this.I000o00OoI0I;
/* 87 */            if (oillO0l4 == null || (oill0iOO0I = oillO0l4.I00000oOI) == null) {
/* 116 */               OIiilo1Ool0o.I0000oI00(o1llOlOo, "Server does not support resources (required for ", ")");
                    } else {
/* 95 */                if (o1llOlOo != O1llOIO.I00ioIO || O0000Ioio00.I0000O(oill0iOO0I.I00000oOI, Boolean.TRUE)) {
/* 128 */                   return;
                        }
/* 110 */               IioIoO10iOiI.I000O01llI0(o1llOlOo, "Server does not support resource subscriptions (required for ", ")");
                    }
                }

                @Override
                public final void I00000oOI(O1llOlOo o1llOlOo) {
/* 1 */             IOIoIi11i0ll iOIoIi11i0ll = this.I00100l0;
/* 7 */             if (o1llOlOo == O1llOIO.I00olI) {
/* 11 */                if (iOIoIi11i0ll.I00000oIO != null) {
/* 49 */                    return;
                        }
/* 16 */                IioIoO10iOiI.I000O01llI0(o1llOlOo, "Client does not support sampling capability (required for ", ")");
                    } else if (o1llOlOo == O1llOIO.I00oliIiO01i) {
/* 26 */                if (iOIoIi11i0ll.I00000oOI != null) {
/* 49 */                    return;
                        }
/* 31 */                IioIoO10iOiI.I000O01llI0(o1llOlOo, "Client does not support roots capability (required for ", ")");
                    } else if (o1llOlOo == O1llOIO.I00oo1iO0ll && iOIoIi11i0ll.I0000Il00O == null) {
/* 46 */                IioIoO10iOiI.I000O01llI0(o1llOlOo, "Client does not support elicitation capability (required for ", ")");
                    }
                }
            }
