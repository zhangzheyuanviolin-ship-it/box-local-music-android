            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.BitSet;
            
            public final class Il0l0olIiO0 implements IollO0 {
                public static final IIloOI I00000oIO;
                public static final IIloOI I00000oOI;
                public static final IIloOI I0000Il00O;
                public static final IIloOI I0000O;

                static {
/* 1 */             O1OIll00i o1OIll00iI00IOO = IIloOI.I00IOO();
/* 9 */             o1OIll00iI00IOO.I00OIo('0', '9');
/* 16 */            o1OIll00iI00IOO.I00OIo('A', 'F');
/* 23 */            o1OIll00iI00IOO.I00OIo('a', 'f');
/* 30 */            I00000oIO = o1OIll00iI00IOO.I00IoO0();
/* 32 */            O1OIll00i o1OIll00iI00IOO2 = IIloOI.I00IOO();
/* 36 */            o1OIll00iI00IOO2.I00OIo('0', '9');
/* 43 */            I00000oOI = o1OIll00iI00IOO2.I00IoO0();
/* 45 */            O1OIll00i o1OIll00iI00IOO3 = IIloOI.I00IOO();
/* 51 */            o1OIll00iI00IOO3.I00OIo('A', 'Z');
/* 56 */            o1OIll00iI00IOO3.I00OIo('a', 'z');
/* 59 */            IIloOI iIloOII00IoO0 = o1OIll00iI00IOO3.I00IoO0();
/* 63 */            I0000Il00O = iIloOII00IoO0;
/* 65 */            O1OIll00i o1OIll00iI00Iooi00oi = iIloOII00IoO0.I00Iooi00oi();
/* 69 */            o1OIll00iI00Iooi00oi.I00OIo('0', '9');
/* 76 */            I0000O = o1OIll00iI00Iooi00oi.I00IoO0();
                }

                public static OlOO1i11110 I00000oOI(IIOOoI iIOOoI, iOlI10l ioli10l) {
/* 19 */            OloOO10o oloOO10o = new OloOO10o(IoIIOIl0I1.I00000oIO(ioli10l.I0000Il00O(iIOOoI, ioli10l.I000iOII()).I00000oIO()));
/* 22 */            IIOOoI iIOOoII000iOII = ioli10l.I000iOII();
/* 30 */            OlOO1i11110 olOO1i11110 = new OlOO1i11110(22);
/* 33 */            olOO1i11110.I00iiI = oloOO10o;
/* 35 */            olOO1i11110.I00iiO = iIOOoII000iOII;
/* 37 */            VarHandle.storeStoreFence();
/* 89 */            return olOO1i11110;
                }

                @Override
                public final OlOO1i11110 I00000oIO(IollOIOOI00 iollOIOOI00) {
/* 1 */             iOlI10l ioli10l = iollOIOOI00.I0000oI00;
/* 3 */             IIOOoI iIOOoII000iOII = ioli10l.I000iOII();
/* 7 */             ioli10l.I000II();
/* 10 */            char cI000OiO = ioli10l.I000OiO();
/* 18 */            if (cI000OiO != '#') {
/* 95 */                if (!((BitSet) I0000Il00O.I00iiI).get(cI000OiO)) {
/* 113 */                   return null;
                        }
/* 99 */                ioli10l.I0000oI00(I0000O);
/* 106 */               if (ioli10l.I000O01llI0(';')) {
/* 108 */                   return I00000oOI(iIOOoII000iOII, ioli10l);
                        }
/* 113 */               return null;
                    }
/* 20 */            ioli10l.I000II();
/* 30 */            if (ioli10l.I000O01llI0('x') || ioli10l.I000O01llI0('X')) {
/* 65 */                int iI0000oI00 = ioli10l.I0000oI00(I00000oIO);
/* 69 */                if (1 > iI0000oI00 || iI0000oI00 > 6 || !ioli10l.I000O01llI0(';')) {
/* 113 */                   return null;
                        }
/* 80 */                return I00000oOI(iIOOoII000iOII, ioli10l);
                    }
/* 43 */            int iI0000oI002 = ioli10l.I0000oI00(I00000oOI);
/* 47 */            if (1 > iI0000oI002 || iI0000oI002 > 7 || !ioli10l.I000O01llI0(';')) {
/* 113 */               return null;
                    }
/* 58 */            return I00000oOI(iIOOoII000iOII, ioli10l);
                }
            }
