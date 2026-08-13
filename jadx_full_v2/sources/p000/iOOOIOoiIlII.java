            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOOOIOoiIlII {
                public static final I1Ool1IoO110 I00000oIO(boolean z) {
/* 3 */             I1Ool1IoO110 i1Ool1IoO110 = new I1Ool1IoO110();
/* 6 */             i1Ool1IoO110.I00000oIO = z ? 1 : 0;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i1Ool1IoO110;
                }

                public static final I1OollilIo I00000oOI(int i) {
/* 3 */             I1OollilIo i1OollilIo = new I1OollilIo();
/* 6 */             i1OollilIo.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i1OollilIo;
                }

                public static final I1OooI1 I0000Il00O() {
/* 3 */             I1OooI1 i1OooI1 = new I1OooI1();
/* 8 */             i1OooI1.I00000oIO = 0L;
/* 10 */            VarHandle.storeStoreFence();
/* 20 */            return i1OooI1;
                }

                public static final I1OooIoiIO I0000O(Object obj) {
/* 3 */             I1OooIoiIO i1OooIoiIO = new I1OooIoiIO();
/* 6 */             i1OooIoiIO.I00000oIO = obj;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i1OooIoiIO;
                }
            }
