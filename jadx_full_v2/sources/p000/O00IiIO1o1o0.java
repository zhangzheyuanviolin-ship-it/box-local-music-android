            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public final class O00IiIO1o1o0 implements IOI01O1 {
                public static final O00IiIO1o1o0 I00000oOI = new O00IiIO1o1o0(0);
                public static final O00IiIO1o1o0 I0000Il00O = new O00IiIO1o1o0(1);
                public final int I00000oIO;

                public O00IiIO1o1o0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final boolean I00000oIO(O00loo1i111O o00loo1i111O) {
                    Ol0O0iI0l0O ol0O0iI0l0OI00000oOI;
                    switch (this.I00000oIO) {
                        case 0:
/* 65 */                    Ooo00oi0O ooo00oi0O = (Ooo00oi0O) o00loo1i111O.I00Iooi00oi().get(1);
/* 67 */                    loilIl10Ii loilil10ii = OOoiOi.I0000O;
/* 69 */                    int i = IiOiOOIo.I00000oIO;
/* 71 */                    OI0010oo1o oI0010oo1oI0000Il00O = IiOiIO0i1Oil.I0000Il00O(ooo00oi0O);
/* 75 */                    loilil10ii.getClass();
/* 80 */                    OI000ilOol oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1oI0000Il00O, OlIllOO11lOl.I00O0o1oo);
/* 84 */                    if (oI000ilOolI00000oIO == null) {
/* 86 */                        ol0O0iI0l0OI00000oOI = null;
                            } else {
/* 90 */                        OoOI1i1i.I00iiI.getClass();
/* 118 */                       ol0O0iI0l0OI00000oOI = l0loOIIo0iOo.I00000oOI(OoOI1i1i.I00iiO, oI000ilOolI00000oIO, Collections.singletonList(new OlIo1I((OoOOiO) IOOi0Ool1i.I00OilO00Il(oI000ilOolI00000oIO.I000OOo1O().I000II()))));
                            }
/* 122 */                   if (ol0O0iI0l0OI00000oOI == null) {
/* 3 */                         return false;
                            }
/* 134 */                   return O0iIo00.I00000oIO.I00000oOI(ol0O0iI0l0OI00000oOI, OoOilo0Oliii.I000O01llI0(ooo00oi0O.getType(), false));
                        default:
/* 8 */                     List<Ooo00oi0O> listI00Iooi00oi = o00loo1i111O.I00Iooi00oi();
/* 16 */                    if (!(listI00Iooi00oi instanceof Collection) || !listI00Iooi00oi.isEmpty()) {
/* 36 */                        for (Ooo00oi0O ooo00oi0O2 : listI00Iooi00oi) {
/* 48 */                            if (IiOiOOIo.I00000oIO(ooo00oi0O2) || ooo00oi0O2.I00l0OO0IO != null) {
/* 3 */                                 return false;
                                    }
                                }
                            }
/* 4 */                     return true;
                    }
                }

                @Override
                public final String I00000oOI(O00loo1i111O o00loo1i111O) {
                    switch (this.I00000oIO) {
                    }
/* 6 */             return iOlIoli00010.I00000oIO(this, o00loo1i111O);
                }

                @Override
                public final String getDescription() {
                    switch (this.I00000oIO) {
                        case 0:
/* 9 */                     return "second parameter must be of type KProperty<*> or its supertype";
                        default:
/* 6 */                     return "should not have varargs or parameters with default values";
                    }
                }
            }
