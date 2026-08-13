            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class li01Ol0i0I implements Runnable {
                public long I00iOIl;
                public long I00iiI;
                public OoIOol I00iiO;

                @Override
                public final void run() {
/* 11 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) ((li10O1l0) this.I00iiO.I00iiO).I00iOIl).I00io1l;
/* 13 */            l0olllO1i.I000II(l0o10ooo0);
/* 19 */            lOii1o loii1o = new lOii1o(1);
/* 22 */            loii1o.I00iiI = this;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            l0o10ooo0.I010o0o0oO(loii1o);
                }
            }
