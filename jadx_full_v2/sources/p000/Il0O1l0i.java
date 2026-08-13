            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Il0O1l0i {
                public static final Il0O1l0i I00000oOI;
                public static final Il0O1l0i I0000Il00O;
                public final Il0O1OllI I00000oIO;

                static {
/* 5 */             int i = 11;
/* 13 */            I00000oOI = new Il0O1l0i(new i1O10l1io1iO(i));
/* 25 */            I0000Il00O = new Il0O1l0i(new iolOOiI(i));
/* 34 */            new Il0O1l0i(new lOOlOoll(i));
/* 44 */            new Il0O1l0i(new l1I0oI(i));
/* 54 */            new Il0O1l0i(new i1i0olI(i));
/* 64 */            new Il0O1l0i(new iOloo0O0O(i));
/* 74 */            new Il0O1l0i(new iOl0lOIi11(i));
                }

                public Il0O1l0i(Il0OlI il0OlI) {
/* 8 */             if (Oo11ii010IIO.I00000oIO()) {
/* 14 */                IIloOI iIloOI = new IIloOI(14);
/* 17 */                iIloOI.I00iiI = il0OlI;
/* 19 */                VarHandle.storeStoreFence();
/* 22 */                this.I00000oIO = iIloOI;
/* 24 */                return;
                    }
/* 37 */            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
/* 43 */                IIOOoll iIOOoll = new IIOOoll(13);
/* 46 */                iIOOoll.I00iiI = il0OlI;
/* 48 */                VarHandle.storeStoreFence();
/* 51 */                this.I00000oIO = iIOOoll;
/* 53 */                return;
                    }
/* 58 */            O1OIll00i o1OIll00i = new O1OIll00i(11);
/* 61 */            o1OIll00i.I00iiI = il0OlI;
/* 63 */            VarHandle.storeStoreFence();
/* 66 */            this.I00000oIO = o1OIll00i;
                }
            }
