            package p000;

            import java.util.Arrays;
            import java.util.List;
            
            public abstract class lOoil0Io0Io {
                public static final Ol0O0iI0l0O I00000oIO(O0iIl1 o0iIl1) {
/* 1 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 13 */            Ol0O0iI0l0O ol0O0iI0l0O = ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O ? (Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO : null;
/* 14 */            if (ol0O0iI0l0O != null) {
/* 16 */                return ol0O0iI0l0O;
                    }
/* 19 */            IOOlIIilOl0.I000lI("This is should be simple type: ", o0iIl1);
/* 7 */             return null;
                }

                public static final Ol0O0iI0l0O I00000oOI(Ol0O0iI0l0O ol0O0iI0l0O, List list, OoOI1i1i ooOI1i1i) {
/* 5 */             if (list.isEmpty() && ooOI1i1i == ol0O0iI0l0O.I00OloOo()) {
/* 13 */                return ol0O0iI0l0O;
                    }
/* 18 */            if (list.isEmpty()) {
/* 20 */                return ol0O0iI0l0O.I00lli11(ooOI1i1i);
                    }
/* 27 */            if (!(ol0O0iI0l0O instanceof Il0oo01OllO0)) {
/* 65 */                return l0loOIIo0iOo.I0000Il00O(ooOI1i1i, ol0O0iI0l0O.I00iOIl(), list, ol0O0iI0l0O.I00iiI());
                    }
/* 29 */            Il0oo01OllO0 il0oo01OllO0 = (Il0oo01OllO0) ol0O0iI0l0O;
/* 33 */            OoOIOoO1I ooOIOoO1I = il0oo01OllO0.I00iiI;
/* 35 */            Il0ol1 il0ol1 = il0oo01OllO0.I00iiO;
/* 37 */            Il0ooO1IO il0ooO1IO = il0oo01OllO0.I00iio;
/* 39 */            boolean z = il0oo01OllO0.I00ilO0;
/* 41 */            String[] strArr = il0oo01OllO0.I00io1l;
/* 52 */            return new Il0oo01OllO0(ooOIOoO1I, il0ol1, il0ooO1IO, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
                }

                public static O0iIl1 I0000Il00O(O0iIl1 o0iIl1, List list, I11IlOOO i11IlOOO, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 i11IlOOO = o0iIl1.getAnnotations();
                    }
/* 13 */            if ((list.isEmpty() || list == o0iIl1.I00OIl()) && i11IlOOO == o0iIl1.getAnnotations()) {
/* 27 */                return o0iIl1;
                    }
/* 28 */            OoOI1i1i ooOI1i1iI00OloOo = o0iIl1.I00OloOo();
/* 34 */            if ((i11IlOOO instanceof IlIlo10) && ((IlIlo10) i11IlOOO).isEmpty()) {
/* 45 */                i11IlOOO = i1i0olI.I00iiO;
                    }
/* 47 */            OoOI1i1i ooOI1i1iI00000oIO = lOoOoloI01i0.I00000oIO(ooOI1i1iI00OloOo, i11IlOOO);
/* 51 */            Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 57 */            if (ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io) {
/* 59 */                IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) ooioo0o1l0I00l0OO0IO;
/* 73 */                return l0loOIIo0iOo.I00000oIO(I00000oOI(ilOIOIi00io.I00iiI, list, ooOI1i1iI00000oIO), I00000oOI(ilOIOIi00io.I00iiO, list, ooOI1i1iI00000oIO));
                    }
/* 80 */            if (ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O) {
/* 84 */                return I00000oOI((Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO, list, ooOI1i1iI00000oIO);
                    }
/* 89 */            I000II.I00000oIO();
/* 92 */            return null;
                }

                public static Ol0O0iI0l0O I0000O(Ol0O0iI0l0O ol0O0iI0l0O, List list, OoOI1i1i ooOI1i1i, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = ol0O0iI0l0O.I00OIl();
                    }
/* 11 */            if ((i & 2) != 0) {
/* 13 */                ooOI1i1i = ol0O0iI0l0O.I00OloOo();
                    }
/* 17 */            return I00000oOI(ol0O0iI0l0O, list, ooOI1i1i);
                }
            }
