            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class iilO0I0l0 implements iollIi0II1o {
                public il00iIOo1 I00000oIO;
                public iOli1OIoI0o I00000oOI;
                public ii01iI1oI1l I0000Il00O;

                @Override
                public final ListenableFuture zza(Object obj) {
/* 1 */             iOoll1io1010 iooll1io1010 = (iOoll1io1010) obj;
/* 3 */             iOli1OIoI0o ioli1oioi0o = this.I00000oOI;
/* 7 */             il00iIOo1 il00iioo1 = this.I00000oIO;
/* 9 */             ii01iI1oI1l ii01ii1oi1l = this.I0000Il00O;
/* 13 */            OillOo0 oillOo0 = new OillOo0(20);
/* 16 */            oillOo0.I00iiI = il00iioo1;
/* 18 */            oillOo0.I00iiO = iooll1io1010;
/* 20 */            oillOo0.I00iio = ioli1oioi0o;
/* 22 */            oillOo0.I00ilI0I1 = ii01ii1oi1l;
/* 24 */            VarHandle.storeStoreFence();
/* 38 */            return iooll1io1010.I00000oOI.I0000O(iOiiloIII0O.I00000oIO(oillOo0), new o0llIi(20));
                }
            }
