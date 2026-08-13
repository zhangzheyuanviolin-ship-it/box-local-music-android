            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0li1O {
                public Object I00000oIO;
                public Object I00000oOI;
                public int I0000Il00O;
                public IOii1l I0000O;
                public O0liI0l I0000oI00;

                public final IlliIl1l11O I00000oIO() {
/* 1 */             IOii1l iOii1l = this.I0000O;
/* 3 */             if (iOii1l != null) {
/* 55 */                return iOii1l;
                    }
/* 5 */             O0liI0l o0liI0l = this.I0000oI00;
/* 11 */            Ilo0lI ilo0lI = new Ilo0lI(12);
/* 14 */            ilo0lI.I00iiI = o0liI0l;
/* 16 */            ilo0lI.I00iiO = this;
/* 18 */            VarHandle.storeStoreFence();
/* 27 */            IOii1l iOii1l2 = new IOii1l(818252804, ilo0lI, true);
/* 30 */            this.I0000O = iOii1l2;
/* 55 */            return iOii1l2;
                }
            }
