            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.concurrent.Executor;
            
            public final class OoIOlll0O {
                public I1lO11 I00000oIO;
                public String I00000oOI;
                public Il0IIil I0000Il00O;
                public OoI0o0oiol0l I0000O;
                public OoIOlo1001I I0000oI00;

                public final void I00000oIO(Il10IiOO il10IiOO) {
/* 1 */             OoIOlo1001I ooIOlo1001I = this.I0000oI00;
/* 3 */             I1lO11 i1lO11 = this.I00000oIO;
/* 5 */             if (il10IiOO == null) {
/* 122 */               IOOlIIilOl0.I000II("Null event");
/* 168 */               return;
                    }
/* 7 */             String str = this.I00000oOI;
/* 9 */             OoI0o0oiol0l ooI0o0oiol0l = this.I0000O;
/* 11 */            Il0IIil il0IIil = this.I0000Il00O;
/* 13 */            IiI101Oo iiI101Oo = ooIOlo1001I.I0000Il00O;
/* 15 */            I1l0I1oi i1l0I1oi = (I1l0I1oi) il10IiOO;
/* 17 */            OOIio1010OoO oOIio1010OoO = i1l0I1oi.I00000oOI;
/* 19 */            IOO000ilo iOO000iloI00000oIO = I1lO11.I00000oIO();
/* 25 */            iOO000iloI00000oIO.I00IO1oi11O(i1lO11.I00000oIO);
/* 28 */            iOO000iloI00000oIO.I00iio = oOIio1010OoO;
/* 32 */            iOO000iloI00000oIO.I00iiO = i1lO11.I00000oOI;
/* 34 */            I1lO11 i1lO11I000OOo1O = iOO000iloI00000oIO.I000OOo1O();
/* 41 */            I0Oi111ii i0Oi111ii = new I0Oi111ii(2);
/* 49 */            i0Oi111ii.I00io1l = new HashMap();
/* 61 */            i0Oi111ii.I00ilI0I1 = Long.valueOf(ooIOlo1001I.I00000oIO.I0001Ioi1lo());
/* 73 */            i0Oi111ii.I00ilO0 = Long.valueOf(ooIOlo1001I.I00000oOI.I0001Ioi1lo());
/* 75 */            i0Oi111ii.I00iiI = str;
/* 90 */            i0Oi111ii.I00iio = new Il01oOi(il0IIil, (byte[]) ooI0o0oiol0l.apply(i1l0I1oi.I00000oIO));
/* 93 */            i0Oi111ii.I00iiO = null;
/* 95 */            I1l0Ioi01 i1l0Ioi01I000lI = i0Oi111ii.I000lI();
/* 99 */            Executor executor = iiI101Oo.I00000oOI;
/* 104 */           I00ioIO i00ioIO = new I00ioIO(5);
/* 107 */           i00ioIO.I00iiI = iiI101Oo;
/* 109 */           i00ioIO.I00iiO = i1lO11I000OOo1O;
/* 111 */           i00ioIO.I00iio = i1l0Ioi01I000lI;
/* 113 */           VarHandle.storeStoreFence();
/* 116 */           executor.execute(i00ioIO);
                }
            }
