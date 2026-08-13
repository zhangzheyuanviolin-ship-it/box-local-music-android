            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l0loOIIo0iOo {
                public static final Ooioo0o1l0 I00000oIO(Ol0O0iI0l0O ol0O0iI0l0O, Ol0O0iI0l0O ol0O0iI0l0O2) {
                    return ol0O0iI0l0O.equals(ol0O0iI0l0O2) ? ol0O0iI0l0O : new IlOIi0io00l(ol0O0iI0l0O, ol0O0iI0l0O2);
                }

                public static final Ol0O0iI0l0O I00000oOI(OoOI1i1i ooOI1i1i, OI000ilOol oI000ilOol, List list) {
/* 6 */             return I0000Il00O(ooOI1i1i, oI000ilOol.I000OOo1O(), list, false);
                }

                public static Ol0O0iI0l0O I0000Il00O(OoOI1i1i ooOI1i1i, OoOIOoO1I ooOIOoO1I, List list, boolean z) {
                    O1iil1I01o o1iil1I01oI00000oIO;
                    OI000ilOol oI000ilOol;
                    O1iil1I01o o1iil1I01oI00OIl;
                    O1iil1I01o o1iil1I01o;
                    O1iil1I01o o1iil1I01oI00li1OI;
/* 5 */             if (ooOI1i1i.isEmpty() && list.isEmpty() && !z && ooOIOoO1I.I00100o1O0lo() != null) {
/* 25 */                return ooOIOoO1I.I00100o1O0lo().I00Ol10();
                    }
/* 30 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooOIOoO1I.I00100o1O0lo();
/* 36 */            if (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) {
/* 44 */                o1iil1I01oI00000oIO = ((OoOOiO) iOIiO1lIl0lI00100o1O0lo).I00Ol10().I00IoiI();
                    } else {
/* 54 */                if (iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) {
/* 56 */                    int i = IiOiOOIo.I00000oIO;
/* 62 */                    IiOiOOIo.I000O01llI0(IiOiIO0i1Oil.I0000Il00O(iOIiO1lIl0lI00100o1O0lo));
/* 65 */                    boolean zIsEmpty = list.isEmpty();
/* 69 */                    O0iIoIOO0O0 o0iIoIOO0O0 = O0iIoIOO0O0.I00000oIO;
/* 71 */                    if (zIsEmpty) {
/* 73 */                        OI000ilOol oI000ilOol2 = (OI000ilOol) iOIiO1lIl0lI00100o1O0lo;
/* 77 */                        oI000ilOol = oI000ilOol2 instanceof OI000ilOol ? oI000ilOol2 : null;
/* 80 */                        if (oI000ilOol == null || (o1iil1I01oI00li1OI = oI000ilOol.I00li1OI(o0iIoIOO0O0)) == null) {
/* 91 */                            o1iil1I01oI00000oIO = oI000ilOol2.I00l0OO0IO();
                                } else {
/* 89 */                            o1iil1I01o = o1iil1I01oI00li1OI;
                                }
                            } else {
/* 96 */                        OI000ilOol oI000ilOol3 = (OI000ilOol) iOIiO1lIl0lI00100o1O0lo;
/* 100 */                       OoOiiO01illo ooOiiO01illoI000O01llI0 = OoOIlIi1.I00000oOI.I000O01llI0(ooOIOoO1I, list);
/* 106 */                       oI000ilOol = oI000ilOol3 instanceof OI000ilOol ? oI000ilOol3 : null;
/* 109 */                       if (oI000ilOol == null || (o1iil1I01oI00OIl = oI000ilOol.I00OIl(ooOiiO01illoI000O01llI0, o0iIoIOO0O0)) == null) {
/* 120 */                           o1iil1I01oI00000oIO = oI000ilOol3.I00IoO0(ooOiiO01illoI000O01llI0);
                                } else {
/* 118 */                           o1iil1I01o = o1iil1I01oI00OIl;
                                }
                            }
/* 168 */                   O0iIo00O1O o0iIo00O1O = new O0iIo00O1O(0);
/* 171 */                   o0iIo00O1O.I00iiI = ooOIOoO1I;
/* 173 */                   o0iIo00O1O.I00iiO = list;
/* 175 */                   VarHandle.storeStoreFence();
/* 182 */                   return I0000oI00(ooOI1i1i, ooOIOoO1I, list, z, o1iil1I01o, o0iIo00O1O);
                        }
/* 127 */               if (iOIiO1lIl0lI00100o1O0lo instanceof IiOoI0oI) {
/* 144 */                   o1iil1I01oI00000oIO = Il0ooiloI.I00000oIO(Il0olOol.I00iio, true, ((IiOoI0oI) iOIiO1lIl0lI00100o1O0lo).getName().I00iOIl);
                        } else {
/* 151 */                   if (!(ooOIOoO1I instanceof Iooo1o0oiOo)) {
/* 192 */                       IoOOl0iOl1io.I0010o("Unsupported classifier: ", iOIiO1lIl0lI00100o1O0lo, " for constructor: ", ooOIOoO1I);
/* 53 */                        return null;
                            }
/* 160 */                   o1iil1I01oI00000oIO = lOoii1.I00000oIO("member scope for intersection type", ((Iooo1o0oiOo) ooOIOoO1I).I00iiI);
                        }
                    }
/* 48 */            o1iil1I01o = o1iil1I01oI00000oIO;
/* 168 */           O0iIo00O1O o0iIo00O1O2 = new O0iIo00O1O(0);
/* 171 */           o0iIo00O1O2.I00iiI = ooOIOoO1I;
/* 173 */           o0iIo00O1O2.I00iiO = list;
/* 175 */           VarHandle.storeStoreFence();
/* 182 */           return I0000oI00(ooOI1i1i, ooOIOoO1I, list, z, o1iil1I01o, o0iIo00O1O2);
                }

                public static final Ol0O0iI0l0O I0000O(OoOI1i1i ooOI1i1i, OoOIOoO1I ooOIOoO1I, List list, boolean z, O1iil1I01o o1iil1I01o) {
/* 6 */             O0iIo00O1O o0iIo00O1O = new O0iIo00O1O(1);
/* 9 */             o0iIo00O1O.I00iiI = ooOIOoO1I;
/* 11 */            o0iIo00O1O.I00iiO = list;
/* 13 */            VarHandle.storeStoreFence();
/* 20 */            Ol0O0lO1I ol0O0lO1I = new Ol0O0lO1I(ooOIOoO1I, list, z, o1iil1I01o, o0iIo00O1O);
                    return ooOI1i1i.isEmpty() ? ol0O0lO1I : new Ol0O1IOl1I(ol0O0lO1I, ooOI1i1i);
                }

                public static final Ol0O0iI0l0O I0000oI00(OoOI1i1i ooOI1i1i, OoOIOoO1I ooOIOoO1I, List list, boolean z, O1iil1I01o o1iil1I01o, Function1 function1) {
/* 8 */             Ol0O0lO1I ol0O0lO1I = new Ol0O0lO1I(ooOIOoO1I, list, z, o1iil1I01o, function1);
                    return ooOI1i1i.isEmpty() ? ol0O0lO1I : new Ol0O1IOl1I(ol0O0lO1I, ooOI1i1i);
                }
            }
