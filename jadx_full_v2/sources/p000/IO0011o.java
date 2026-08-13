            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class IO0011o implements IIlI0I {
                public IO01o11o0lI0 I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                @Override
                public final ListenableFuture I00000oIO() {
/* 1 */             IO01o11o0lI0 iO01o11o0lI0 = this.I00000oIO;
/* 5 */             IIOlO1ii iIOlO1ii = iO01o11o0lI0.I0000oI00.I00000oIO;
/* 7 */             int i = this.I00000oOI;
/* 9 */             int i2 = this.I0000Il00O;
/* 14 */            IO0011 io0011 = new IO0011(1);
/* 17 */            io0011.I00iiI = iIOlO1ii;
/* 19 */            io0011.I00iiO = iO01o11o0lI0;
/* 21 */            io0011.I00iio = i;
/* 23 */            io0011.I00ilI0I1 = i2;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            return iOiiloIII0O.I00000oIO(io0011);
                }

                @Override
                public final ListenableFuture I00000oOI() {
/* 1 */             IO01o11o0lI0 iO01o11o0lI0 = this.I00000oIO;
/* 5 */             IIOlO1ii iIOlO1ii = iO01o11o0lI0.I0000oI00.I00000oIO;
/* 7 */             int i = this.I00000oOI;
/* 9 */             int i2 = this.I0000Il00O;
/* 14 */            IO0011 io0011 = new IO0011(0);
/* 17 */            io0011.I00iiI = iIOlO1ii;
/* 19 */            io0011.I00iiO = iO01o11o0lI0;
/* 21 */            io0011.I00iio = i;
/* 23 */            io0011.I00ilI0I1 = i2;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            return iOiiloIII0O.I00000oIO(io0011);
                }
            }
