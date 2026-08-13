            package p000;

            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            import kotlin.jvm.functions.Function1;
            
            public final class IoIlI1oli implements Ii0110, Closeable {
                public static final long I00li1OI = I1Ioolli0l0o.I00000oIO.objectFieldOffset(IoIlI1oli.class.getDeclaredField("closed"));
                public final I0lOIOI11OIl I00iOIl;
                public final O010loOOi0Oo I00iiI;
                public final Ii00l101O I00iiO;
                public final IoO0l0Iiioll I00iio;
                public final IoO0l0Iiioll I00ilI0I1;
                public final IoO0l0Iiioll I00ilO0;
                public final IoO0l0Iiioll I00io1l;
                public final IOlOl10 I00ioIO;
                public final I0IIiO0iI I00l0I0l0lO1;
                public final IoIlOo1o0IIl I00l0OO0IO;
                private volatile int closed = 0;

                public IoIlI1oli(I0lOIOI11OIl i0lOIOI11OIl, IoIlOo1o0IIl ioIlOo1o0IIl) {
/* 4 */             this.I00iOIl = i0lOIOI11OIl;
/* 9 */             Ii00l101O ii00l101OI00000oIO = i0lOIOI11OIl.I00000oIO();
/* 13 */            Iioi0lilII iioi0lilII = Iioi0lilII.I00iio;
/* 23 */            O010loOOi0Oo o010loOOi0Oo = new O010loOOi0Oo((O010OIi) ii00l101OI00000oIO.I00lli11(iioi0lilII));
/* 26 */            this.I00iiI = o010loOOi0Oo;
/* 36 */            this.I00iiO = i0lOIOI11OIl.I00000oIO().I00ioIO(o010loOOi0Oo);
/* 55 */            IoO0l0Iiioll ioO0l0Iiioll = new IoO0l0Iiioll(new I0OOO1l0IoO[]{IoO0l0Iiioll.I000OiO, IoO0l0Iiioll.I000iOII, IoO0l0Iiioll.I000l1, IoO0l0Iiioll.I000lI, IoO0l0Iiioll.I000o00OoI0I}, 1);
/* 58 */            ioO0l0Iiioll.I0001Ioi1lo = true;
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            this.I00iio = ioO0l0Iiioll;
/* 67 */            I0OOO1l0IoO i0OOO1l0IoO = IoO0l0Iiioll.I000oI1ioi;
/* 81 */            int i = 2;
/* 82 */            IoO0l0Iiioll ioO0l0Iiioll2 = new IoO0l0Iiioll(new I0OOO1l0IoO[]{i0OOO1l0IoO, IoO0l0Iiioll.I00100l0, IoO0l0Iiioll.I00100o1O0lo, IoO0l0Iiioll.I0010I0i, IoO0l0Iiioll.I0010o}, i);
/* 85 */            ioO0l0Iiioll2.I0001Ioi1lo = true;
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            this.I00ilI0I1 = ioO0l0Iiioll2;
/* 94 */            I0OOO1l0IoO i0OOO1l0IoO2 = IoO0l0Iiioll.I00111O;
/* 96 */            I0OOO1l0IoO i0OOO1l0IoO3 = IoO0l0Iiioll.I001IIilI0O;
/* 98 */            I0OOO1l0IoO i0OOO1l0IoO4 = IoO0l0Iiioll.I001IO000;
/* 100 */           I0OOO1l0IoO i0OOO1l0IoO5 = IoO0l0Iiioll.I001i1O0Ol;
/* 102 */           I0OOO1l0IoO i0OOO1l0IoO6 = IoO0l0Iiioll.I001i1lo1io;
/* 104 */           I0OOO1l0IoO[] i0OOO1l0IoOArr = {i0OOO1l0IoO2, i0OOO1l0IoO3, i0OOO1l0IoO4, i0OOO1l0IoO5, i0OOO1l0IoO6};
/* 108 */           int i2 = 3;
/* 109 */           IoO0l0Iiioll ioO0l0Iiioll3 = new IoO0l0Iiioll(i0OOO1l0IoOArr, i2);
/* 112 */           ioO0l0Iiioll3.I0001Ioi1lo = true;
/* 114 */           VarHandle.storeStoreFence();
/* 117 */           this.I00ilO0 = ioO0l0Iiioll3;
/* 131 */           IoO0l0Iiioll ioO0l0Iiioll4 = new IoO0l0Iiioll(new I0OOO1l0IoO[]{IoO0l0Iiioll.I000II, IoO0l0Iiioll.I000O01llI0, IoO0l0Iiioll.I000OOo1O}, 0);
/* 134 */           ioO0l0Iiioll4.I0001Ioi1lo = true;
/* 136 */           VarHandle.storeStoreFence();
/* 139 */           this.I00io1l = ioO0l0Iiioll4;
/* 145 */           this.I00ioIO = iOOOillOoi0.I00000oIO();
/* 151 */           I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(10);
/* 159 */           i0IIiO0iI.I00iiI = new IOollI1oO();
/* 161 */           VarHandle.storeStoreFence();
/* 164 */           this.I00l0I0l0lO1 = i0IIiO0iI;
/* 168 */           IoIlOo1o0IIl ioIlOo1o0IIl2 = new IoIlOo1o0IIl(0);
/* 171 */           this.I00l0OO0IO = ioIlOo1o0IIl2;
/* 175 */           IOoil1iiIilo iOoil1iiIilo = null;
/* 179 */           ioO0l0Iiioll3.I000II(i0OOO1l0IoO5, new IoIlii1(this, i0lOIOI11OIl, null));
/* 187 */           ioO0l0Iiioll3.I000II(i0OOO1l0IoO6, new I0i11IIlO(this, iOoil1iiIilo, i2));
/* 194 */           int i3 = 5;
/* 198 */           ioIlOo1o0IIl2.I00II0Ol1O0l(IoO11I1oI.I00000oOI, new IoI0IiI0(i3));
/* 208 */           ioIlOo1o0IIl2.I00II0Ol1O0l(II10iIII.I0000Il00O, new IoI0IiI0(i3));
/* 218 */           ioIlOo1o0IIl2.I00II0Ol1O0l(IiioIIllI.I0000O, new IoI0IiI0(i3));
/* 233 */           ((LinkedHashMap) ioIlOo1o0IIl2.I00iio).put("DefaultTransformers", new IoI0IiI0(4));
/* 243 */           ioIlOo1o0IIl2.I00II0Ol1O0l(IoOIi0o.I00000oOI, new IoI0IiI0(i3));
/* 246 */           IOO000ilo iOO000ilo = IoIiolOl00.I00000oOI;
/* 253 */           ioIlOo1o0IIl2.I00II0Ol1O0l(iOO000ilo, new IoI0IiI0(i3));
/* 263 */           ioIlOo1o0IIl2.I00II0Ol1O0l(IoO101.I0000O, new IoI0IiI0(i3));
/* 274 */           ((LinkedHashMap) ioIlOo1o0IIl2.I00iiI).putAll((LinkedHashMap) ioIlOo1o0IIl.I00iiI);
/* 285 */           ((LinkedHashMap) ioIlOo1o0IIl2.I00iiO).putAll((LinkedHashMap) ioIlOo1o0IIl.I00iiO);
/* 296 */           ((LinkedHashMap) ioIlOo1o0IIl2.I00iio).putAll((LinkedHashMap) ioIlOo1o0IIl.I00iio);
/* 306 */           ioIlOo1o0IIl2.I00II0Ol1O0l(IoO0O10O11.I00000oOI, new IoI0IiI0(i3));
/* 309 */           I1OoollI1Il1 i1OoollI1Il1 = IiI0loiioIlO.I00000oIO;
/* 315 */           IO1I11OO io1i11oo = new IO1I11OO(24);
/* 318 */           VarHandle.storeStoreFence();
/* 321 */           ioIlOo1o0IIl2.I00II0Ol1O0l(iOO000ilo, io1i11oo);
/* 334 */           Iterator it = ((LinkedHashMap) ioIlOo1o0IIl2.I00iiI).values().iterator();
/* 342 */           while (it.hasNext()) {
/* 350 */               ((Function1) it.next()).invoke(this);
                    }
/* 364 */           Iterator it2 = ((LinkedHashMap) ioIlOo1o0IIl2.I00iio).values().iterator();
/* 372 */           while (it2.hasNext()) {
/* 380 */               ((Function1) it2.next()).invoke(this);
                    }
/* 391 */           this.I00ilI0I1.I000II(i0OOO1l0IoO, new IiIIl0OOio0O(this, iOoil1iiIilo, i));
/* 396 */           IoIll0l.I00iiO.incrementAndGet(i0lOIOI11OIl);
/* 405 */           O010OIi o010OIi = (O010OIi) this.I00iiO.I00lli11(iioi0lilII);
/* 411 */           Iil1olo iil1olo = new Iil1olo(21);
/* 414 */           iil1olo.I00iiI = i0lOIOI11OIl;
/* 416 */           VarHandle.storeStoreFence();
/* 419 */           o010OIi.I00iiI(iil1olo);
                }

                @Override
                public final Ii00l101O I00000oIO() {
/* 1 */             return this.I00iiO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(IoO10oI0o ioO10oI0o, IOoilo iOoilo) {
                    IoIl11011Oo ioIl11011Oo;
/* 3 */             if (iOoilo instanceof IoIl11011Oo) {
/* 6 */                 ioIl11011Oo = (IoIl11011Oo) iOoilo;
/* 8 */                 int i = ioIl11011Oo.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioIl11011Oo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioIl11011Oo = new IoIl11011Oo(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ioIl11011Oo.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioIl11011Oo.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 54 */                this.I00l0I0l0lO1.I00100o1O0lo(IOIoi11o.I00000oIO);
/* 57 */                Object obj = ioO10oI0o.I0000O;
/* 59 */                ioIl11011Oo.I00iiO = 1;
/* 63 */                objI00000oIO = this.I00iio.I00000oIO(ioO10oI0o, obj, ioIl11011Oo);
/* 67 */                if (objI00000oIO == ii0111o) {
/* 69 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 70 */            return (IoIlIolo10o) objI00000oIO;
                }

                @Override
                public final void close() throws Exception {
                    boolean zIsTerminated;
/* 12 */            if (I1Ioolli0l0o.I00000oIO.compareAndSwapInt(this, I00li1OI, 0, 1)) {
/* 23 */                IOlOl10 iOlOl10 = (IOlOl10) this.I00ioIO.I00000oOI(IoIo11O01ii.I00000oIO);
/* 41 */                Iterator it = IOOi0Ool1i.I00iIi0i1o(iOlOl10.I0000Il00O().keySet()).iterator();
/* 49 */                while (it.hasNext()) {
/* 57 */                    Object objI00000oOI = iOlOl10.I00000oOI((I1OoollI1Il1) it.next());
/* 63 */                    if (objI00000oOI instanceof AutoCloseable) {
/* 65 */                        AutoCloseable autoCloseable = (AutoCloseable) objI00000oOI;
/* 69 */                        if (autoCloseable instanceof AutoCloseable) {
/* 71 */                            autoCloseable.close();
                                } else {
/* 77 */                            if (!(autoCloseable instanceof ExecutorService)) {
/* 126 */                               OIiilo1Ool0o.I00100o1O0lo();
/* 129 */                               return;
                                    }
/* 79 */                            ExecutorService executorService = (ExecutorService) autoCloseable;
/* 85 */                            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 94 */                                executorService.shutdown();
/* 97 */                                boolean z = false;
/* 98 */                                while (!zIsTerminated) {
                                            try {
/* 104 */                                       zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
/* 109 */                                       if (!z) {
/* 111 */                                           executorService.shutdownNow();
/* 114 */                                           z = true;
                                                }
                                            }
                                        }
/* 116 */                               if (z) {
/* 122 */                                   Thread.currentThread().interrupt();
                                        }
                                    }
                                }
                            }
                        }
/* 132 */               this.I00iiI.I00iIO();
                    }
                }

                public final String toString() {
/* 18 */            return "HttpClient[" + this.I00iOIl + ']';
                }
            }
