            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class IIOIli1iili {
                public static final IOiII1I I00000oIO;

                static {
/* 4 */             IOiII1I iOiII1I = new IOiII1I(2);
/* 7 */             VarHandle.storeStoreFence();
/* 10 */            I00000oIO = iOiII1I;
                }

                public static final void I00000oIO(IIOIlI01 iIOIlI01, Throwable th) {
/* 1 */             if (th != null) {
/* 45 */                ((IIIloOl0I1I) iIOIlI01).I0000O(th);
/* 89 */                return;
                    }
/* 15 */            I00oII i00oII = new I00oII(1, iIOIlI01, IIOIlI01.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2);
/* 18 */            IOiII1I iOiII1I = I00000oIO;
                    try {
/* 30 */                IiiIIO0IO.I00000oIO(l00iIoI.I0000Il00O(l00iIoI.I00000oOI(iOiII1I, i00oII)), OoiIlOl1iI.I00000oIO);
                    } catch (Throwable th2) {
/* 36 */                iOl0ii00.I00000oIO(iOiII1I, th2);
/* 40 */                throw null;
                    }
                }

                public static final OoIOol I00000oOI(Ii0110 ii0110, Ii00l101O ii00l101O, IlliIl1l11O illiIl1l11O) {
/* 3 */             IIIloOl0I1I iIIloOl0I1I = new IIIloOl0I1I();
/* 13 */            OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(ii0110, ii00l101O, null, new I000oI1ioi(illiIl1l11O, iIIloOl0I1I, null), 2);
/* 20 */            IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(0);
/* 23 */            iIOIlOoI111.I00iiI = iIIloOl0I1I;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            olIl0iI0000O.I00iiI(iIOIlOoI111);
/* 34 */            OoIOol ooIOol = new OoIOol(3);
/* 37 */            ooIOol.I00iiI = iIIloOl0I1I;
/* 39 */            ooIOol.I00iiO = olIl0iI0000O;
/* 41 */            VarHandle.storeStoreFence();
/* 215 */           return ooIOol;
                }
            }
