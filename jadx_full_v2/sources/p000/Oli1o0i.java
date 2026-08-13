            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oli1o0i {
                public final OliI0OiOi1O I00000oIO;
                public O0io0olo I00000oOI;
                public final Oli1ll0lI I0000Il00O;
                public final Oli1ll0lI I0000O;
                public final Oli1ll0lI I0000oI00;

                public Oli1o0i(OliI0OiOi1O oliI0OiOi1O) {
/* 4 */             this.I00000oIO = oliI0OiOi1O;
/* 9 */             Oli1ll0lI oli1ll0lI = new Oli1ll0lI(0);
/* 12 */            oli1ll0lI.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            this.I0000Il00O = oli1ll0lI;
/* 22 */            Oli1ll0lI oli1ll0lI2 = new Oli1ll0lI(1);
/* 25 */            oli1ll0lI2.I00iiI = this;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            this.I0000O = oli1ll0lI2;
/* 35 */            Oli1ll0lI oli1ll0lI3 = new Oli1ll0lI(2);
/* 38 */            oli1ll0lI3.I00iiI = this;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            this.I0000oI00 = oli1ll0lI3;
                }

                public final O0io0olo I00000oIO() {
/* 1 */             O0io0olo o0io0olo = this.I00000oOI;
/* 3 */             if (o0io0olo != null) {
/* 5 */                 return o0io0olo;
                    }
/* 8 */             I000II.I000iOII("SubcomposeLayoutState is not attached to SubcomposeLayout");
/* 11 */            return null;
                }
            }
