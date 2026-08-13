            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.function.Function;
            
            public final class lil011O implements Function {
                public lIlIo1 I00000oIO;
                public liIli0ooIlO I00000oOI;
                public O1ilIl1l0I I0000Il00O;

                @Override
                public final Object apply(Object obj) {
/* 3 */             liIli0ooIlO liili0ooilo = this.I00000oOI;
/* 7 */             lIlIo1 lilio1 = this.I00000oIO;
/* 9 */             lili0I0IOO0 lili0i0ioo0 = new lili0I0IOO0();
/* 12 */            lili0i0ioo0.I00000oOI = lilio1;
/* 14 */            Context context = lilio1.I00000oOI;
/* 16 */            String str = liili0ooilo.I0000O;
/* 18 */            if (str == null) {
/* 27 */                str = (String) liili0ooilo.I00000oIO.apply(context);
/* 29 */                liili0ooilo.I0000O = str;
                    }
/* 31 */            lili0i0ioo0.I0000Il00O = str;
/* 35 */            lili0i0ioo0.I0000O = "";
/* 39 */            lili0i0ioo0.I0000oI00 = liili0ooilo.I00000oOI;
/* 43 */            lili0i0ioo0.I0001Ioi1lo = liili0ooilo.I0000Il00O;
/* 46 */            lili0i0ioo0.I00000oIO = null;
/* 52 */            i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(11);
/* 60 */            i0o1lii1o0io.I00iiI = new AtomicInteger();
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            lili0i0ioo0.I000II = i0o1lii1o0io;
/* 69 */            l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 72 */            l1il1ilioi1l.I00iOIl = lilio1;
/* 74 */            l1il1ilioi1l.I00iiO = str;
/* 78 */            I0Oi111ii i0Oi111iiI00000oIO = lo01OlOIIoo.I00000oIO(lilio1.I00000oOI);
/* 84 */            i0Oi111iiI00000oIO.I00O0o1oo("phenotype");
/* 99 */            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
/* 104 */           sb.append("/");
/* 107 */           sb.append(str);
/* 112 */           sb.append(".pb");
/* 119 */           i0Oi111iiI00000oIO.I00O10llo(sb.toString());
/* 126 */           l1il1ilioi1l.I00iiI = i0Oi111iiI00000oIO.I00OI1();
/* 128 */           VarHandle.storeStoreFence();
/* 131 */           lili0i0ioo0.I000O01llI0 = l1il1ilioi1l;
/* 133 */           VarHandle.storeStoreFence();
/* 138 */           liIol1oO liiol1oo = new liIol1oO();
/* 141 */           liiol1oo.I00000oIO = lili0i0ioo0;
/* 143 */           VarHandle.storeStoreFence();
/* 149 */           this.I0000Il00O.I00iiI = true;
/* 168 */           return liiol1oo;
                }
            }
